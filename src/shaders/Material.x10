package shaders;
import primitives.*;
import raytracer.*;

public abstract class Material {
	public abstract def evaluate(
			me:Intersectable,
			ray:Ray, 
			t:Double,
			lights:Rail[Light],
			objects:Rail[Intersectable]):Color;
}