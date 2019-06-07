package primitives;
import shaders.*;


public class Sphere extends Intersectable{
	
	public def this(pos:Vector, rad:Double, mat:Material) {
		this.pos = pos;
		this.rad = rad;
		this.mat = mat;
	}
	
	
	public def intersect(ray:Ray):Double {
		var v : Vector = Vector.sub(ray.origin, pos);
		val b = 2.0 * Vector.dot(v,ray.dir);
		val c = Vector.dot(v,v) - rad*rad;
		var delta : Double = b*b - 4.0*c;
		
		//Return -1 if no intersect
		if(delta < 1e-4) 
			return -1.0;
		
		val t1 = (- b - Math.sqrt(delta))/2;
		val t2 = (- b + Math.sqrt(delta))/2;
		
		return Math.min(t1,t2);
	}
	
	public def normal(ray:Ray,t:Double):Vector {
		p:Vector = Vector.add(ray.origin, Vector.scalar(t,ray.dir));
		return Vector.normalize(Vector.sub(p,this.pos));
	}
}