package datastructures;

public class MinBuffer {
	private var value : Double = UByte.MAX_VALUE;
	private var index : Long = 0;
	private var init : boolean = false;
	
	public def insert(ind:Long, valu:Double) {
		if (valu < this.value && valu >= 0.0) {
			this.init = true;
			this.index = ind;
			this.value = valu;
		}
	}
	
	public def isEmpty() : boolean {
		return !init;
	}
	
	public def getIndex() : Long {
		return this.index;
	}
	
	public def getValue() : Double {
		return this.value;
	}
	
	public def init () {
		this.value  = UByte.MAX_VALUE;
		this.index = 0;
		this.init = false;
	}
}