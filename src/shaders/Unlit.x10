package shaders;
import primitives.*;
import raytracer.*;

public class Unlit extends Material {
	var color:Color;
	
	public def this(color:Color) {
		this.color = color;
	}
	public def evaluate(
			me:Intersectable,
			ray:Ray, 
			t:Double,
			lights:Rail[Light],
			objects:Rail[Intersectable]):Color{
		return color;
	}
}