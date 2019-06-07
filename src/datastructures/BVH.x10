package datastructures;
import primitives.*;
import x10.lang.GlobalRef;

public class BVH extends Intersectable {
	var leftChild:Intersectable;
	var rightChild:Intersectable;
	var focus:Boolean = true;
	
	public def this (leftChild:Intersectable, rightChild:Intersectable) {
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		
		conn:Vector = Vector.sub(leftChild.pos, rightChild.pos);
		connNorm:Vector = Vector.normalize( conn );
		rim:Vector = Vector.scalar(leftChild.rad, connNorm);
		
		this.rad = Vector.norm(conn) + leftChild.rad + rightChild.rad;
		this.pos = Vector.add(rim, Vector.scalar(this.rad / 2, Vector.scalar (-1.0, connNorm)));
	}
	
	public def construct(objects:Rail[Intersectable]): Intersectable {
		if(objects.size <= 2) {
			if( objects.size <= 1) {
				return objects(0);
			}
			return new BVH(objects(0), objects(1));
		}
		
		objs:Rail[Intersectable] = new Rail[Intersectable]( objects.size % 2 == 0 ? objects.size / 2 : (objects.size / 2) + 1);
		selected:Rail[Boolean] = new Rail[Boolean]( objects.size );
		
		for(var i:Long = 0; i < objs.size; i++) {
			
		}
		
		return null;
	}
	
	public def distSort(objects: Rail[Intersectable] ) : Rail[Intersectable] {
		objs:Rail[Intersectable] = new Rail[Intersectable](objects.size);
	
		return null;
	}
	
	public def sortByAxis(objects: Rail[Intersectable], d:Long) : Rail[Intersectable] {
		return null;
	}
	
	public def sortByAxis(objects: Rail[Intersectable], low:Long, high:Long ,d:Long) : Rail[Intersectable] {
		if(high - low == 1) {
			return objects;
		}
		sortByAxis(objects, low, low + (high - low)/2, d);
		sortByAxis(objects, low + (high - low)/2, high,d);
		
		
		return null;
	}
	
	public def merge (objects: Rail[Intersectable], low:Int, middle:Int, high:Int) {
		// return null;
		//for(var i:Long low; i < high; i++)
	}
	
	public def normal(var ray:primitives.Ray, var t:Double):primitives.Vector {
		return focus ? leftChild.normal(ray, t) : rightChild.normal(ray, t);
	}

	public def intersect(val ray:primitives.Ray):Double {
		
	    if(intersect_me(ray)) {
	    	var t:Rail[Double] = new Rail[Double](2);
	    	val tref = GlobalRef(t);
	    	
	    	val left:Intersectable = leftChild;
	    	val right:Intersectable = rightChild;
	    	
	    	finish {
	    		async at(Place(0)) {
	    			val t1 = left.intersect(ray);
	    			at (tref) {
	    				val tval = tref();
	    				tval(0) = t1;
	    			}
	    		}
	    		async at(Place(1)) {
	    			val t2 = right.intersect(ray);
	    			at (tref) {
	    				val tval = tref();
	    				tval(1) = t2;
	    			}
	    		}
	    	}
	    	
	    	focus = t(0) < t(1);
	    	this.mat = focus ? leftChild.mat : rightChild.mat;
	    	return focus ? t(0) : t(1);
	    }
	    return -1.0;
	}
	
	public def intersect_me(var ray:Ray):Boolean {
		var v : Vector = Vector.sub(ray.origin, pos);
		val b = 2.0 * Vector.dot(v,ray.dir);
		val c = Vector.dot(v,v) - rad*rad;
		var delta : Double = b*b - 4.0*c;
			
		//Return -1 if no intersect
		if(delta < 1e-4) 
			return false;
			
		return true;		
	}

}