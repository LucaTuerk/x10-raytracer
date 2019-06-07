package primitives;

public class Transform {
	public var pos:Vector;
	public var rot:Vector;
	
	public def getPosComponent( d: Long ) {
		switch(d as int) {
		case 0n: return pos.x;
		case 1n: return pos.y;
		case 2n: return pos.z;
		default: return this.getPosComponent(d%3);
		}
	}
}