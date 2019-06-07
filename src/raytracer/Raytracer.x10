package raytracer;
import java.io.File;
import java.io.IOException;
import primitives.*;
import datastructures.*;
import shaders.*;

public class Raytracer {
	public static val MAX_RECURSE : Int = 16n; 
	public static val AMBIENT_LIGHT : Double = 0.1;
	
	var width : Long = 0;
	var height : Long = 0;
	public var iBuffer : MinBuffer = new MinBuffer();
	val cam : Vector = Vector.zero;
	
	public static val inst:Raytracer = new Raytracer();
	
	public static def evaluate(ray:Ray, objects:Rail[Intersectable], lights:Rail[Light]) : Color {
		var c : Color = new Color(200,200,200,0);
		
		inst.iBuffer.init();
		for(j in 0..(objects.size-1)) {
			var t : Double = objects(j).intersect(ray);
			inst.iBuffer.insert(j,t);
		}
		
		if(!inst.iBuffer.isEmpty()) {
			var min : Long = inst.iBuffer.getIndex();
			var minVal : Double = inst.iBuffer.getValue();
			c = objects(min).mat.evaluate(objects(min),ray, minVal,lights,objects);
		}
		return c;
	}
	
	public static def main(args:Rail[String]) {
		// Create image size vars
		
		if(args.size < 2) {
			Console.OUT.println("Please spezify width and height");
			return;
		}
		
		inst.width = Long.parse(args(0));
		inst.height = Long.parse(args(1));
		val image = new Rail[UByte](inst.width * inst.height * 4);
		
		
		var objects:Rail[Intersectable] = new Rail[Intersectable](4);
		var lights:Rail[Light] = new Rail[Light](2);
		var	tBuffer:Rail[Double] = new Rail[Double](objects.size);
		
		var red : Material = new SemiFlat ( new Color( 255, 50, 50, 255), 0.1, 0.95);
		var green: Material = new SemiFlat ( new Color( 50, 255, 50, 255), 0.1, 0.95);
		var blue : Material = new SemiFlat ( new Color( 50, 50, 255, 255), 0.1, 0.95);
		var refl : Material = new Reflective(new Color( 0, 0, 0, 255), 0.5);
		var refr : Material = new Refractive(1.2,1.0);
		var ref : Material = new MixMaterial(refl,refr,0.7);
		
		objects(0) = new Sphere(new Vector(0.0,0.0,8.0), 1.0, new MixMaterial(red,ref, 0.7));
		objects(1) = new Sphere(new Vector(1.0,2.0,9.0), 0.75, new MixMaterial(red,ref, 0.70));
		objects(2) = new Sphere(new Vector(-1.0,-1.0,6.0), 1.0, new MixMaterial(green,ref, 0.7));
		objects(3) = new Sphere(new Vector(-1.0,2.0,8.0), 0.5, new MixMaterial(blue,ref, 0.7));
		lights(0) = new Light(new Vector(1000.0,10000.0,5.0), new Color(255,255,255,255), 0.75);
		lights(1) = new Light(new Vector(2.0,10.0,1.0), new Color(255,255,255,255), 0.5);
		
		var i : Long = 0;
		while(i < image.size-1) {
			val pos = Utilities.idx(i/4, inst.width);
			var p:Vector = Vector.normalize(new Vector(
					Utilities.interpolate((pos(0) as Double/inst.width),-1.0,1.0),
					Utilities.interpolate((pos(1) as Double/inst.height),-1.0,1.0), 1.0));
			
			
			val ray:Ray = new Ray(inst.cam,p);
			
			var c:Color = evaluate(ray,objects,lights);
			image(i) 	= c.r;
			image(i+1) 	= c.g;
			image(i+2) 	= c.b;
			image(i+3) 	= c.a;
			i+=4;
		}
		
		
		var file : File = new File("./a1bc3.png");
		Utilities.writePng(image,inst.width as Int,inst.height as Int,file);
	}
	
	public static def getBuffer() : MinBuffer {
		return inst.iBuffer;
	}
}