package shaders;
import primitives.*;
import raytracer.*;

public class Reflective extends Material{
	var color : Color;
	var factor : Double;
	var alt : Material;
	
	public def this ( color : Color, factor : Double ) {
		this.color = color;
		this.factor = factor;
		this.alt = new Phong(color)
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
		
		inv:Vector = Vector.scalar(-1.0, ray.dir);
		norm:Vector = me.normal(ray, t);
		ref:Vector = Vector.sub(Vector.scalar(2.0 * Vector.dot(norm,inv), norm),inv);
	
		p:Vector = Vector.add(ray.origin, Vector.scalar(t, ray.dir));
	    refRay:Ray = new Ray(Vector.add(p, Vector.scalar(0.001, ref)), Vector.normalize(ref), ray.recurse());
		color.scalar(factor);
		refCol : Color = Raytracer.evaluate(refRay,objects,lights);
		refCol.scalar(1.0-factor);
		color.add(refCol);
		return color;
	}
}