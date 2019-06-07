package shaders;


@x10.runtime.impl.java.X10Generated
public class Refractive extends shaders.Material implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Refractive> $RTT = 
        x10.rtt.NamedType.<Refractive> make("shaders.Refractive",
                                            Refractive.class,
                                            new x10.rtt.Type[] {
                                                shaders.Material.$RTT
                                            });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(shaders.Refractive $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Refractive.class + " calling"); } 
        shaders.Material.$_deserialize_body($_obj, $deserializer);
        $_obj.alt = $deserializer.readObject();
        $_obj.n1 = $deserializer.readDouble();
        $_obj.n2 = $deserializer.readDouble();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        shaders.Refractive $_obj = new shaders.Refractive((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.alt);
        $serializer.write(this.n1);
        $serializer.write(this.n2);
        
    }
    
    // constructor just for allocation
    public Refractive(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
    public double n1;
    
    //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
    public double n2;
    
    //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
    public shaders.Material alt;
    
    
    //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
    // creation method for java code (1-phase java constructor)
    public Refractive() {
        this((java.lang.System[]) null);
        shaders$Refractive$$init$S();
    }
    
    // constructor for non-virtual call
    final public shaders.Refractive shaders$Refractive$$init$S() {
         {
            
            //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            /*super.*/shaders$Material$$init$S();
            
            //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            
            
            //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            this.__fieldInitializers_shaders_Refractive();
            
            //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            this.n1 = 1.0;
            
            //#line 13 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            this.n2 = 1.0;
        }
        return this;
    }
    
    
    
    //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
    // creation method for java code (1-phase java constructor)
    public Refractive(final double n1, final double n2) {
        this((java.lang.System[]) null);
        shaders$Refractive$$init$S(n1, n2);
    }
    
    // constructor for non-virtual call
    final public shaders.Refractive shaders$Refractive$$init$S(final double n1, final double n2) {
         {
            
            //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            /*super.*/shaders$Material$$init$S();
            
            //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            
            
            //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            this.__fieldInitializers_shaders_Refractive();
            
            //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            this.n1 = n1;
            
            //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            this.n2 = n2;
            
            //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            final primitives.Color t$1266851 = ((primitives.Color)(primitives.Color.get$WHITE()));
            
            //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            final double t$1266852 = ((double)(float)(((float)(0.1F))));
            
            //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            final shaders.Flat t$1266853 = ((shaders.Flat)(new shaders.Flat((java.lang.System[]) null).shaders$Flat$$init$S(((primitives.Color)(t$1266851)), t$1266852)));
            
            //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            this.alt = ((shaders.Material)(t$1266853));
        }
        return this;
    }
    
    
    
    //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
    public primitives.Color evaluate__3$1primitives$Light$2__4$1primitives$Intersectable$2(final primitives.Intersectable me, final primitives.Ray ray, final double t, final x10.core.Rail lights, final x10.core.Rail objects) {
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final int t$1266854 = ray.recursionLevel;
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final int t$1266855 = raytracer.Raytracer.MAX_RECURSE;
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final boolean t$1266858 = ((t$1266854) > (((int)(t$1266855))));
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        if (t$1266858) {
            
            //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            final shaders.Material t$1266856 = ((shaders.Material)(this.alt));
            
            //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            final primitives.Color t$1266857 = t$1266856.evaluate__3$1primitives$Light$2__4$1primitives$Intersectable$2(((primitives.Intersectable)(me)), ((primitives.Ray)(ray)), (double)(t), ((x10.core.Rail)(lights)), ((x10.core.Rail)(objects)));
            
            //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            return t$1266857;
        }
        
        //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector norm = me.normal(((primitives.Ray)(ray)), (double)(t));
        
        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$1266859 = this.n1;
        
        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$1266860 = this.n2;
        
        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double r = ((t$1266859) / (((double)(t$1266860))));
        
        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$1266861 = -1.0;
        
        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$1266862 = primitives.Vector.scalar((double)(t$1266861), ((primitives.Vector)(norm)));
        
        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$1266863 = ((primitives.Vector)(ray.dir));
        
        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double c = primitives.Vector.dot$O(((primitives.Vector)(t$1266862)), ((primitives.Vector)(t$1266863)));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$1266864 = ((primitives.Vector)(ray.dir));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$1266875 = primitives.Vector.scalar((double)(r), ((primitives.Vector)(t$1266864)));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$1266872 = ((r) * (((double)(c))));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$1266869 = ((double)(long)(((long)(1L))));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$1266867 = ((r) * (((double)(r))));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$1266865 = ((double)(long)(((long)(1L))));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$1266866 = ((c) * (((double)(c))));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$1266868 = ((t$1266865) - (((double)(t$1266866))));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$1266870 = ((t$1266867) * (((double)(t$1266868))));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$1266871 = ((t$1266869) - (((double)(t$1266870))));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$1266873 = java.lang.Math.sqrt(((double)(t$1266871)));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$1266874 = ((t$1266872) - (((double)(t$1266873))));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$1266876 = primitives.Vector.scalar((double)(t$1266874), ((primitives.Vector)(norm)));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector ref = primitives.Vector.add(((primitives.Vector)(t$1266875)), ((primitives.Vector)(t$1266876)));
        
        //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$1266878 = ((primitives.Vector)(ray.origin));
        
        //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$1266877 = ((primitives.Vector)(ray.dir));
        
        //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$1266879 = primitives.Vector.scalar((double)(t), ((primitives.Vector)(t$1266877)));
        
        //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector p = primitives.Vector.add(((primitives.Vector)(t$1266878)), ((primitives.Vector)(t$1266879)));
        
        //#line 40 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$1266880 = primitives.Vector.scalar((double)(1.0E-5), ((primitives.Vector)(ref)));
        
        //#line 40 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$1266881 = primitives.Vector.add(((primitives.Vector)(p)), ((primitives.Vector)(t$1266880)));
        
        //#line 40 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$1266882 = primitives.Vector.normalize(((primitives.Vector)(ref)));
        
        //#line 40 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final int t$1266883 = ray.recurse$O();
        
        //#line 40 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Ray refRay = new primitives.Ray((java.lang.System[]) null).primitives$Ray$$init$S(t$1266881, t$1266882, t$1266883);
        
        //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Color t$1266884 = raytracer.Raytracer.evaluate__1$1primitives$Intersectable$2__2$1primitives$Light$2(((primitives.Ray)(refRay)), ((x10.core.Rail)(objects)), ((x10.core.Rail)(lights)));
        
        //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        return t$1266884;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
    final public shaders.Refractive shaders$Refractive$$this$shaders$Refractive() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        return shaders.Refractive.this;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
    final public void __fieldInitializers_shaders_Refractive() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        this.n1 = 0.0;
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        this.n2 = 0.0;
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        this.alt = null;
    }
}

