package shaders;
import primitives.*;
import raytracer.*;

public class MixMaterial extends Material {
	private var mat1 : Material;
	private var mat2 : Material;
	public var fac : Double;
	
	public def this (mat1:Material, mat2:Material, fac:Double) {
		this.mat1 = mat1;
		this.mat2 = mat2;
		this.fac = fac;
	}
	
	public def evaluate(
			me:Intersectable,
			ray:Ray, 
			t:Double,
			lights:Rail[Light],
			objects:Rail[Intersectable]):Color 
	{
		
		var col1:Color = mat1.evaluate(me,ray,t,lights,objects);
		var col2:Color = mat2.evaluate(me,ray,t,lights,objects);
		col1.scalar(fac);
		col2.scalar(1-fac);
		col1.add(col2);
		
		return col1;
	}
}