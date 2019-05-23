package shaders;
import primitives.*;
import raytracer.*;

public class Flat extends Material {
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
				var c:Color = light.color.copy();
				c.scalarKeepAlpha(light.intensity);
				out.add(c);
			}
		}
		
		return out;
	}
}