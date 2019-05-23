package shaders;
import primitives.*;
import raytracer.*;

public class Phong extends Material {
	public var color:Color;
	public var ambient:Double;
	
	public def this(color:Color, amb:Double) {
		this.color = color;
		this.ambient = amb;
	}
	
	public def evaluate(
			me:Intersectable,
			ray:Ray, 
			t:Double,
			lights:Rail[Light],
			objects:Rail[Intersectable]):Color {
		
		var out : Color = color.copy();
		out.scalarKeepAlpha(ambient);
		
		for(light:Light in lights) {
			
			v:Vector = Vector.scalar(t, ray.dir);
			var p:Vector = Vector.add(ray.origin, v);
			var n:Vector = me.normal(ray, t);
			p = Vector.add(p, Vector.scalar(0.000001, n));
			u:Vector = Vector.normalize(Vector.sub(p, light.pos));
			lightRay:Ray = new Ray(p, u);
			
			Raytracer.getBuffer().init();
			for(j in 0..(objects.size-1)) {
				var t_prime : Double = objects(j).intersect(lightRay);
				Raytracer.getBuffer().insert(j,t_prime);
			}
			if(Raytracer.getBuffer().isEmpty()) {
				inv:Vector = Vector.scalar(-1.0, ray.dir);
				norm:Vector = me.normal(ray, t);
				ref:Vector = Vector.normalize(Vector.sub(Vector.scalar(2.0 * Vector.dot(norm,inv), norm),inv));
				l_ref:Vector = Vector.normalize(Vector.sub(Vector.scalar(2.0 * Vector.dot(norm,u), norm),u));

			
				var diff:Double = Math.max(Vector.dot(norm, u),0.0);
				var spec:Double = Vector.dot(l_ref, inv);
				diff = diff > 1.0 ? 1.0 : diff;
				spec = spec > 1.0 ? 1.0 : spec;
				spec = Math.pow(spec,20);
			
				var c_diff : Color = color.copy();
				var c_spec : Color = new Color(255,255,255,255);
				c_diff.scalarKeepAlpha((light.intensity * diff));
				c_spec.scalar(spec);
				out.add(c_diff);
				out.add(c_spec);
			}
		}
		
		return out;
	}
}