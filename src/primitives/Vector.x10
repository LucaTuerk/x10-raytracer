package primitives;

public class Vector {
	public var x:Double;
	public var y:Double;
	public var z:Double;
	
	public def this(x:Double, y:Double, z:Double) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static val one:Vector = new Vector(1,1,1);
	public static val zero:Vector = new Vector(0,0,0);
	
	public static def scalar(sc:Double, vec:Vector):Vector {
		return new Vector(sc*vec.x, sc*vec.y, sc*vec.z);
	}
	
	public static def add(vec1:Vector, vec2:Vector):Vector {
		return new Vector(vec1.x + vec2.x, vec1.y + vec2.y, vec1.z + vec2.z);
	}
	
	public static def sub(vec1:Vector, vec2:Vector):Vector {
		return new Vector(vec1.x - vec2.x, vec1.y - vec2.y, vec1.z - vec2.z);
	}
	
	public static def dot(vec1:Vector, vec2:Vector):Double {
		return vec1.x * vec2.x + vec1.y * vec2.y + vec1.z * vec2.z;
	}
	
	public static def norm(vec:Vector):Double {
		return Math.sqrt(dot(vec,vec));
	}
	
	public static def normalize(vec:Vector):Vector {
		return scalar(1/norm(vec),vec);
	}
}