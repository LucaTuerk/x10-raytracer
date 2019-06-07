package shaders;
import primitives.*;
import raytracer.*;

public class Refractive extends Material {
	var n1:Double;
	var n2:Double;
	var alt:Material;
	
	
	public def this() {
		this.n1 = 1.0;
		this.n2 = 1.0;
	}
	
	public def this(n1:Double, n2:Double) {
		this.n1 = n1;
		this.n2 = n2;
		this.alt = new Flat(Color.WHITE, 0.1f);
	}
	
	public def evaluate(
			me:Intersectable,
			ray:Ray, 
			t:Double,
			lights:Rail[Light],
			objects:Rail[Intersectable]):Color {
		
		if( ray.recursionLevel > Raytracer.MAX_RECURSE ) {
			return alt.evaluate(me,ray,t,lights,objects);
		}
		
		norm:Vector = me.normal(ray, t);
	
		r:Double = n1/n2;
		c:Double = Vector.dot(Vector.scalar(-1.0,norm), ray.dir);
		ref:Vector = Vector.add(Vector.scalar(r,ray.dir),Vector.scalar(r*c - Math.sqrt(1-(r*r*(1-c*c))),norm));
	
		p:Vector = Vector.add(ray.origin, Vector.scalar(t, ray.dir));
		refRay:Ray = new Ray(Vector.add(p, Vector.scalar(0.00001, ref)), Vector.normalize(ref), ray.recurse());	
		return Raytracer.evaluate(refRay,objects,lights);
	}
}