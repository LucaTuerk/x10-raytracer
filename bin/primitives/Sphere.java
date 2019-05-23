package primitives;


@x10.runtime.impl.java.X10Generated
public class Sphere extends primitives.Intersectable implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Sphere> $RTT = 
        x10.rtt.NamedType.<Sphere> make("primitives.Sphere",
                                        Sphere.class,
                                        new x10.rtt.Type[] {
                                            primitives.Intersectable.$RTT
                                        });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(primitives.Sphere $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Sphere.class + " calling"); } 
        primitives.Intersectable.$_deserialize_body($_obj, $deserializer);
        $_obj.rad = $deserializer.readDouble();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        primitives.Sphere $_obj = new primitives.Sphere((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.rad);
        
    }
    
    // constructor just for allocation
    public Sphere(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
    public double rad;
    
    
    //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
    // creation method for java code (1-phase java constructor)
    public Sphere(final primitives.Vector pos, final double rad, final shaders.Material mat) {
        this((java.lang.System[]) null);
        primitives$Sphere$$init$S(pos, rad, mat);
    }
    
    // constructor for non-virtual call
    final public primitives.Sphere primitives$Sphere$$init$S(final primitives.Vector pos, final double rad, final shaders.Material mat) {
         {
            
            //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
            /*super.*/primitives$Intersectable$$init$S();
            
            //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
            
            
            //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
            this.__fieldInitializers_primitives_Sphere();
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
            this.pos = ((primitives.Vector)(pos));
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
            this.rad = rad;
            
            //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
            this.mat = ((shaders.Material)(mat));
        }
        return this;
    }
    
    
    
    //#line 15 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
    public double intersect$O(final primitives.Ray ray) {
        
        //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final primitives.Vector t$6783 = ((primitives.Vector)(ray.origin));
        
        //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final primitives.Vector t$6784 = ((primitives.Vector)(this.pos));
        
        //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        primitives.Vector v = primitives.Vector.sub(((primitives.Vector)(t$6783)), ((primitives.Vector)(t$6784)));
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final primitives.Vector t$6785 = ((primitives.Vector)(v));
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final primitives.Vector t$6786 = ((primitives.Vector)(ray.dir));
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6787 = primitives.Vector.dot$O(((primitives.Vector)(t$6785)), ((primitives.Vector)(t$6786)));
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double b = ((2.0) * (((double)(t$6787))));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final primitives.Vector t$6788 = ((primitives.Vector)(v));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final primitives.Vector t$6789 = ((primitives.Vector)(v));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6792 = primitives.Vector.dot$O(((primitives.Vector)(t$6788)), ((primitives.Vector)(t$6789)));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6790 = this.rad;
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6791 = this.rad;
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6793 = ((t$6790) * (((double)(t$6791))));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double c = ((t$6792) - (((double)(t$6793))));
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6794 = ((b) * (((double)(b))));
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6795 = ((4.0) * (((double)(c))));
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        double delta = ((t$6794) - (((double)(t$6795))));
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6796 = delta;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final boolean t$6798 = ((t$6796) < (((double)(1.0E-4))));
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        if (t$6798) {
            
            //#line 23 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
            final double t$6797 = -1.0;
            
            //#line 23 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
            return t$6797;
        }
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6800 = (-(b));
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6799 = delta;
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6801 = java.lang.Math.sqrt(((double)(t$6799)));
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6802 = ((t$6800) - (((double)(t$6801))));
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6803 = ((double)(long)(((long)(2L))));
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t1 = ((t$6802) / (((double)(t$6803))));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6805 = (-(b));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6804 = delta;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6806 = java.lang.Math.sqrt(((double)(t$6804)));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6807 = ((t$6805) + (((double)(t$6806))));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6808 = ((double)(long)(((long)(2L))));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t2 = ((t$6807) / (((double)(t$6808))));
        
        //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final double t$6809 = java.lang.Math.min(((double)(t1)),((double)(t2)));
        
        //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        return t$6809;
    }
    
    
    //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
    public primitives.Vector normal(final primitives.Ray ray, final double t) {
        
        //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final primitives.Vector t$6811 = ((primitives.Vector)(ray.origin));
        
        //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final primitives.Vector t$6810 = ((primitives.Vector)(ray.dir));
        
        //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final primitives.Vector t$6812 = primitives.Vector.scalar((double)(t), ((primitives.Vector)(t$6810)));
        
        //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final primitives.Vector p = primitives.Vector.add(((primitives.Vector)(t$6811)), ((primitives.Vector)(t$6812)));
        
        //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final primitives.Vector t$6813 = ((primitives.Vector)(this.pos));
        
        //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final primitives.Vector t$6814 = primitives.Vector.sub(((primitives.Vector)(p)), ((primitives.Vector)(t$6813)));
        
        //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        final primitives.Vector t$6815 = primitives.Vector.normalize(((primitives.Vector)(t$6814)));
        
        //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        return t$6815;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
    final public primitives.Sphere primitives$Sphere$$this$primitives$Sphere() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        return primitives.Sphere.this;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
    final public void __fieldInitializers_primitives_Sphere() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Sphere.x10"
        this.rad = 0.0;
    }
}

