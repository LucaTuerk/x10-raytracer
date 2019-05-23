package primitives;

public class Light extends Transform{
	public var color:Color;
	public var intensity:Double;
	
	public def this(pos:Vector, color:Color, intensity:Double) {
		this.pos = pos;
		this.color = color;
		this.intensity = intensity;
	}
}