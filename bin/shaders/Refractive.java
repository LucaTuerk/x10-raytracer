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
    
    
    //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
    // creation method for java code (1-phase java constructor)
    public Refractive() {
        this((java.lang.System[]) null);
        shaders$Refractive$$init$S();
    }
    
    // constructor for non-virtual call
    final public shaders.Refractive shaders$Refractive$$init$S() {
         {
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            /*super.*/shaders$Material$$init$S();
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            
            
            //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            this.__fieldInitializers_shaders_Refractive();
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            this.n1 = 1.0;
            
            //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            this.n2 = 1.0;
        }
        return this;
    }
    
    
    
    //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
    // creation method for java code (1-phase java constructor)
    public Refractive(final double n1, final double n2) {
        this((java.lang.System[]) null);
        shaders$Refractive$$init$S(n1, n2);
    }
    
    // constructor for non-virtual call
    final public shaders.Refractive shaders$Refractive$$init$S(final double n1, final double n2) {
         {
            
            //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            /*super.*/shaders$Material$$init$S();
            
            //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            
            
            //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            this.__fieldInitializers_shaders_Refractive();
            
            //#line 15 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            this.n1 = n1;
            
            //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
            this.n2 = n2;
        }
        return this;
    }
    
    
    
    //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
    public primitives.Color evaluate__3$1primitives$Light$2__4$1primitives$Intersectable$2(final primitives.Intersectable me, final primitives.Ray ray, final double t, final x10.core.Rail lights, final x10.core.Rail objects) {
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector norm = me.normal(((primitives.Ray)(ray)), (double)(t));
        
        //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$42458 = this.n1;
        
        //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$42459 = this.n2;
        
        //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double r = ((t$42458) / (((double)(t$42459))));
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$42460 = -1.0;
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$42461 = primitives.Vector.scalar((double)(t$42460), ((primitives.Vector)(norm)));
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$42462 = ((primitives.Vector)(ray.dir));
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double c = primitives.Vector.dot$O(((primitives.Vector)(t$42461)), ((primitives.Vector)(t$42462)));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$42463 = ((primitives.Vector)(ray.dir));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$42474 = primitives.Vector.scalar((double)(r), ((primitives.Vector)(t$42463)));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$42471 = ((r) * (((double)(c))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$42468 = ((double)(long)(((long)(1L))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$42466 = ((r) * (((double)(r))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$42464 = ((double)(long)(((long)(1L))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$42465 = ((c) * (((double)(c))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$42467 = ((t$42464) - (((double)(t$42465))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$42469 = ((t$42466) * (((double)(t$42467))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$42470 = ((t$42468) - (((double)(t$42469))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$42472 = java.lang.Math.sqrt(((double)(t$42470)));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final double t$42473 = ((t$42471) - (((double)(t$42472))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$42475 = primitives.Vector.scalar((double)(t$42473), ((primitives.Vector)(norm)));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector ref = primitives.Vector.add(((primitives.Vector)(t$42474)), ((primitives.Vector)(t$42475)));
        
        //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$42477 = ((primitives.Vector)(ray.origin));
        
        //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$42476 = ((primitives.Vector)(ray.dir));
        
        //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$42478 = primitives.Vector.scalar((double)(t), ((primitives.Vector)(t$42476)));
        
        //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector p = primitives.Vector.add(((primitives.Vector)(t$42477)), ((primitives.Vector)(t$42478)));
        
        //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$42479 = primitives.Vector.scalar((double)(1.0E-5), ((primitives.Vector)(ref)));
        
        //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$42480 = primitives.Vector.add(((primitives.Vector)(p)), ((primitives.Vector)(t$42479)));
        
        //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Vector t$42481 = primitives.Vector.normalize(((primitives.Vector)(ref)));
        
        //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Ray refRay = new primitives.Ray((java.lang.System[]) null).primitives$Ray$$init$S(t$42480, t$42481);
        
        //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        final primitives.Color t$42482 = raytracer.Raytracer.evaluate__1$1primitives$Intersectable$2__2$1primitives$Light$2(((primitives.Ray)(refRay)), ((x10.core.Rail)(objects)), ((x10.core.Rail)(lights)));
        
        //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Refractive.x10"
        return t$42482;
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
    }
}

