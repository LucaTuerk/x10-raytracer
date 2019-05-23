package primitives;

public class Color {
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
}