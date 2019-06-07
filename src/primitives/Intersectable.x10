package primitives;
import shaders.*;

public abstract class Intersectable extends Transform{
	public var mat:Material;
	public var rad:Double;
	
	abstract public def intersect(ray:Ray):Double;
	abstract public def normal(ray:Ray, t:Double):Vector;
	
	public def distance (other:Intersectable) {
		return Vector.norm(Vector.sub(this.pos, other.pos));
	}
}