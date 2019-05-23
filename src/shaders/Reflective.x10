package shaders;
import primitives.*;
import raytracer.*;

public class Reflective extends Material{
	var color : Color;
	var factor : Double;
	
	public def this ( color : Color, factor : Double ) {
		this.color = color;
		this.factor = factor;
	}
	
	public def evaluate(
			me:Intersectable,
			ray:Ray, 
			t:Double,
			lights:Rail[Light],
			objects:Rail[Intersectable]):Color {
		
		inv:Vector = Vector.scalar(-1.0, ray.dir);
		norm:Vector = me.normal(ray, t);
		ref:Vector = Vector.sub(Vector.scalar(2.0 * Vector.dot(norm,inv), norm),inv);
	
		p:Vector = Vector.add(ray.origin, Vector.scalar(t, ray.dir));
	    refRay:Ray = new Ray(Vector.add(p, Vector.scalar(0.001, ref)), Vector.normalize(ref));
		color.scalar(factor);
		refCol : Color = Raytracer.evaluate(refRay,objects,lights);
		refCol.scalar(1.0-factor);
		color.add(refCol);
		return color;
	}
}