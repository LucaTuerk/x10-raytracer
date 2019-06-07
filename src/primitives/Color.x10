package primitives;
import x10.util.Random;

public class Color {
	public static val EMPTY = new Color(0,0,0,0);
	public static val WHITE = new Color(255,255,255,255);
	public static val BLACK = new Color(0,0,0,255);
	public static val BLUE = new Color(0,0,255,255);
	public static val GREEN = new Color(0,255,0,255);
	public static val RED = new Color(255,0,0,255);
	
	public var r : UByte;
	public var g : UByte;
	public var b : UByte;
	public var a : UByte;
	
	public def this(r:Long, g:Long, b:Long, a:Long) {
		this.r = r as UByte;
		this.g = g as UByte;
		this.b = b as UByte;
		this.a = a as UByte;
	}
	
	public def scalar(s:Double) {
		this.r = (r as Double * s) as UByte;
		this.g = (g as Double * s) as UByte;
		this.b = (b as Double * s) as UByte;
		this.a = (a as Double * s) as UByte;
	}
	
	public def scalarKeepAlpha(s:Double) {
		this.r = (r as Double * s) as UByte;
		this.g = (g as Double * s) as UByte;
		this.b = (b as Double * s) as UByte;
	}
	
	public def add(c:Color) {
		this.r = capedAdd(r, c.r);
		this.g = capedAdd(g, c.g);
		this.b = capedAdd(b, c.b);
		this.a = capedAdd(a, c.a);
	}
	
	def capedAdd(a:UByte, b:UByte) {
		if( (a as ULong + b as ULong) > (UByte.MAX_VALUE as ULong)) {
			return UByte.MAX_VALUE; 
		}
		return a+b;
	}
	
	public def copy() : Color {
		return new Color(this.r, this.g, this.b, this.a);
	}
	
	public static def mix (colors:Rail[Color], factors:Rail[Double]) : Color {
		var out:Color = EMPTY;
		var fac:Double = -1.0;
		if(colors.size != factors.size) 
			fac = 1.0 / colors.size;
		
		for(var i:Int = 0n; i < colors.size; i++) {
			if(fac != -1.0) {
				val c = colors(i).copy();
				c.scalar(factors(i));
				out.add(c);
			}
			else {
				val c = colors(i).copy();
				c.scalar(fac);
				out.add(c);
			}
		}
		return out;
	}
	
	public static def random () : Color {
		val r:Random = new Random();
		var vec:Vector = new Vector(r.nextDouble(),r.nextDouble(),r.nextDouble());
		vec = Vector.normalize(vec);
		vec = Vector.scalar(0.2+(r.nextDouble()*0.8), vec);
		
		val colors = [RED, GREEN, BLUE];
		val factors = [vec.x, vec.y, vec.z];
		return mix(colors,factors);
	}
}