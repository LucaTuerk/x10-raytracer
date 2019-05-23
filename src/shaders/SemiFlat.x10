package shaders;
import primitives.*;

public class SemiFlat extends Material {
	var mix:Material;
	
	public def this(col:Color, amb:Double, fac:Double) {
		var phong : Material = new Phong(col,amb);
		var flat : Material = new Flat(col,amb);
		this.mix = new MixMaterial(phong, flat, fac);
	}
	
	public def evaluate(
			me:Intersectable,
			ray:Ray, 
			t:Double,
			lights:Rail[Light],
			objects:Rail[Intersectable]):Color {
		return this.mix.evaluate(me,ray,t,lights,objects);
	}
}