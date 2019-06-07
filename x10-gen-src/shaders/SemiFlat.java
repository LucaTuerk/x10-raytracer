package shaders;


@x10.runtime.impl.java.X10Generated
public class SemiFlat extends shaders.Material implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<SemiFlat> $RTT = 
        x10.rtt.NamedType.<SemiFlat> make("shaders.SemiFlat",
                                          SemiFlat.class,
                                          new x10.rtt.Type[] {
                                              shaders.Material.$RTT
                                          });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(shaders.SemiFlat $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + SemiFlat.class + " calling"); } 
        shaders.Material.$_deserialize_body($_obj, $deserializer);
        $_obj.mix = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        shaders.SemiFlat $_obj = new shaders.SemiFlat((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.mix);
        
    }
    
    // constructor just for allocation
    public SemiFlat(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
    public shaders.Material mix;
    
    
    //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
    // creation method for java code (1-phase java constructor)
    public SemiFlat(final primitives.Color col, final double amb, final double fac) {
        this((java.lang.System[]) null);
        shaders$SemiFlat$$init$S(col, amb, fac);
    }
    
    // constructor for non-virtual call
    final public shaders.SemiFlat shaders$SemiFlat$$init$S(final primitives.Color col, final double amb, final double fac) {
         {
            
            //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
            /*super.*/shaders$Material$$init$S();
            
            //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
            
            
            //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
            this.__fieldInitializers_shaders_SemiFlat();
            
            //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
            shaders.Material phong = ((shaders.Material)(new shaders.Phong((java.lang.System[]) null).shaders$Phong$$init$S(((primitives.Color)(col)), ((double)(amb)))));
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
            shaders.Material flat = ((shaders.Material)(new shaders.Flat((java.lang.System[]) null).shaders$Flat$$init$S(((primitives.Color)(col)), ((double)(amb)))));
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
            final shaders.Material t$1256990 = ((shaders.Material)(phong));
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
            final shaders.Material t$1256991 = ((shaders.Material)(flat));
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
            final shaders.MixMaterial t$1256992 = ((shaders.MixMaterial)(new shaders.MixMaterial((java.lang.System[]) null).shaders$MixMaterial$$init$S(t$1256990, t$1256991, ((double)(fac)))));
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
            this.mix = ((shaders.Material)(t$1256992));
        }
        return this;
    }
    
    
    
    //#line 13 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
    public primitives.Color evaluate__3$1primitives$Light$2__4$1primitives$Intersectable$2(final primitives.Intersectable me, final primitives.Ray ray, final double t, final x10.core.Rail lights, final x10.core.Rail objects) {
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
        final shaders.Material t$1256993 = ((shaders.Material)(this.mix));
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
        final primitives.Color t$1256994 = t$1256993.evaluate__3$1primitives$Light$2__4$1primitives$Intersectable$2(((primitives.Intersectable)(me)), ((primitives.Ray)(ray)), (double)(t), ((x10.core.Rail)(lights)), ((x10.core.Rail)(objects)));
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
        return t$1256994;
    }
    
    
    //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
    final public shaders.SemiFlat shaders$SemiFlat$$this$shaders$SemiFlat() {
        
        //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
        return shaders.SemiFlat.this;
    }
    
    
    //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
    final public void __fieldInitializers_shaders_SemiFlat() {
        
        //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/SemiFlat.x10"
        this.mix = null;
    }
}

