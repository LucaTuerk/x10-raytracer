package raytracer;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Utilities {
	
	public static def idx(i:Long, w:Long): Rail[Long] {
		var p :Rail[Long] = new Rail[Long](2);
		p(0) = i % w;
		p(1) = i / w;
		return p;
	}
	
	public static def writePng(img:Rail[UByte],width:Int, height:Int,file:File) {

		val buf : BufferedImage = new BufferedImage(width, height, 2 as Int);
		var i : Long = 0;
		Console.OUT.println();
		
		while(i < img.size-1) {
			
			val pos 	= Utilities.idx(i/4, width);
			var col : Int = 0 as Int;
			
			col |= (img(i) as UInt) << 16; 		
			col |= (img(i+1) as UInt) << 8; 	 
			col |= (img(i+2) as UInt) << 0;	
			col |= (img(i+3) as UInt) << 24;
			
			buf.setRGB(pos(0) as Int, pos(1) as Int, col);
			
			i = i + 4;
		}
		try{
			ImageIO.write(buf,"png",file);
		} catch (IOException) {}
	}		
	
	public static def interpolateColor(x:Int, y:Int, width:Int, height:Int):Rail[UByte]{
		col:Rail[UByte] = new Rail[UByte](4);
		
		var xf:Double = x as Double;
		var yf:Double = y as Double;
		var wf:Double = width as Double;
		var hf:Double = height as Double;
		var upperDist:Double = Math.sqrt(xf*xf + yf*yf);
		var lowerDist:Double = Math.sqrt((wf-xf)*(wf-xf)+(hf-yf)*(hf-yf));
		
		var upperFac:Double = 1	- (upperDist / (upperDist+lowerDist));
		var lowerFac:Double = 1 - upperFac;
		
		col(0) = ((UByte.MAX_VALUE as Double * upperFac)) as UByte;
		col(1) = ((UByte.MAX_VALUE as Double * lowerFac)) as UByte;
		col(2) = 0 as UByte;
		col(3) = UByte.MAX_VALUE;

		return col;
	}
	
	public static def interpolate(fac:Double, min:Double, max:Double) : Double{
		return ((1.0-fac) * min + fac * max)/2.0;
	}
}