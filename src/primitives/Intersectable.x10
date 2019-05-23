package primitives;
import shaders.*;

public abstract class Intersectable extends Transform{
	public var mat:Material;
	abstract public def intersect(ray:Ray):Double;
	abstract public def normal(ray:Ray, t:Double):Vector;
}