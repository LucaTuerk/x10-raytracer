package primitives;

public class Ray {
	public var origin:Vector;
	public var dir:Vector;
	
	public def this(origin:Vector, dir:Vector) {
		this.origin = origin;
		this.dir = dir;
	}
}