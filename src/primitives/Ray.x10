package primitives;

public class Ray {
	public var origin:Vector;
	public var dir:Vector;
	public var recursionLevel:Int;
	
	public def this(origin:Vector, dir:Vector) {
		this.origin = origin;
		this.dir = dir;
		this.recursionLevel = 0n;
	}
	
	public def this(origin:Vector, dir:Vector, rec:Int) {
		this.origin = origin;
		this.dir = dir; 
		this.recursionLevel = rec;
	}
	
	public def recurse(): Int {
		return recursionLevel + 1n;
	}
}