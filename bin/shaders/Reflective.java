package shaders;


@x10.runtime.impl.java.X10Generated
public class Reflective extends shaders.Material implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Reflective> $RTT = 
        x10.rtt.NamedType.<Reflective> make("shaders.Reflective",
                                            Reflective.class,
                                            new x10.rtt.Type[] {
                                                shaders.Material.$RTT
                                            });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(shaders.Reflective $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Reflective.class + " calling"); } 
        shaders.Material.$_deserialize_body($_obj, $deserializer);
        $_obj.color = $deserializer.readObject();
        $_obj.factor = $deserializer.readDouble();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        shaders.Reflective $_obj = new shaders.Reflective((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.color);
        $serializer.write(this.factor);
        
    }
    
    // constructor just for allocation
    public Reflective(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
    public primitives.Color color;
    
    //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
    public double factor;
    
    
    //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
    // creation method for java code (1-phase java constructor)
    public Reflective(final primitives.Color color, final double factor) {
        this((java.lang.System[]) null);
        shaders$Reflective$$init$S(color, factor);
    }
    
    // constructor for non-virtual call
    final public shaders.Reflective shaders$Reflective$$init$S(final primitives.Color color, final double factor) {
         {
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
            /*super.*/shaders$Material$$init$S();
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
            
            
            //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
            this.__fieldInitializers_shaders_Reflective();
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
            this.color = ((primitives.Color)(color));
            
            //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
            this.factor = factor;
        }
        return this;
    }
    
    
    
    //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
    public primitives.Color evaluate__3$1primitives$Light$2__4$1primitives$Intersectable$2(final primitives.Intersectable me, final primitives.Ray ray, final double t, final x10.core.Rail lights, final x10.core.Rail objects) {
        
        //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final double t$42504 = -1.0;
        
        //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Vector t$42505 = ((primitives.Vector)(ray.dir));
        
        //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Vector inv = primitives.Vector.scalar((double)(t$42504), ((primitives.Vector)(t$42505)));
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Vector norm = me.normal(((primitives.Ray)(ray)), (double)(t));
        
        //#line 23 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final double t$42506 = primitives.Vector.dot$O(((primitives.Vector)(norm)), ((primitives.Vector)(inv)));
        
        //#line 23 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final double t$42507 = ((2.0) * (((double)(t$42506))));
        
        //#line 23 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Vector t$42508 = primitives.Vector.scalar((double)(t$42507), ((primitives.Vector)(norm)));
        
        //#line 23 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Vector ref = primitives.Vector.sub(((primitives.Vector)(t$42508)), ((primitives.Vector)(inv)));
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Vector t$42510 = ((primitives.Vector)(ray.origin));
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Vector t$42509 = ((primitives.Vector)(ray.dir));
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Vector t$42511 = primitives.Vector.scalar((double)(t), ((primitives.Vector)(t$42509)));
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Vector p = primitives.Vector.add(((primitives.Vector)(t$42510)), ((primitives.Vector)(t$42511)));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Vector t$42512 = primitives.Vector.scalar((double)(0.001), ((primitives.Vector)(ref)));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Vector t$42513 = primitives.Vector.add(((primitives.Vector)(p)), ((primitives.Vector)(t$42512)));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Vector t$42514 = primitives.Vector.normalize(((primitives.Vector)(ref)));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Ray refRay = new primitives.Ray((java.lang.System[]) null).primitives$Ray$$init$S(t$42513, t$42514);
        
        //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Color t$42515 = ((primitives.Color)(this.color));
        
        //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final double t$42516 = this.factor;
        
        //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        t$42515.scalar((double)(t$42516));
        
        //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Color refCol = raytracer.Raytracer.evaluate__1$1primitives$Intersectable$2__2$1primitives$Light$2(((primitives.Ray)(refRay)), ((x10.core.Rail)(objects)), ((x10.core.Rail)(lights)));
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final double t$42517 = this.factor;
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final double t$42518 = ((1.0) - (((double)(t$42517))));
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        refCol.scalar((double)(t$42518));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Color t$42519 = ((primitives.Color)(this.color));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        t$42519.add(((primitives.Color)(refCol)));
        
        //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        final primitives.Color t$42520 = ((primitives.Color)(this.color));
        
        //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        return t$42520;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
    final public shaders.Reflective shaders$Reflective$$this$shaders$Reflective() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        return shaders.Reflective.this;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
    final public void __fieldInitializers_shaders_Reflective() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        this.color = null;
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Reflective.x10"
        this.factor = 0.0;
    }
}

