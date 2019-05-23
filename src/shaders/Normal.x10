package shaders;
import primitives.*;
import raytracer.*;

public class Normal extends Material
{
	public def evaluate(
			me:Intersectable,
			ray:Ray, 
			t:Double,
			lights:Rail[Light],
			objects:Rail[Intersectable]):Color {
		
	norm:Vector = me.normal(ray, t);
	return new Color(
			Utilities.interpolate((norm.x + 1.0) / 2.0, 0.0, 255.0) as Long, 
			Utilities.interpolate((norm.y + 1.0) / 2.0, 0.0, 255.0) as Long, 
			Utilities.interpolate(norm.z, 128.0, 255.0) as Long, 255);
	}
}