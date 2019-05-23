package shaders;


@x10.runtime.impl.java.X10Generated
public class MixMaterial extends shaders.Material implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<MixMaterial> $RTT = 
        x10.rtt.NamedType.<MixMaterial> make("shaders.MixMaterial",
                                             MixMaterial.class,
                                             new x10.rtt.Type[] {
                                                 shaders.Material.$RTT
                                             });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(shaders.MixMaterial $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + MixMaterial.class + " calling"); } 
        shaders.Material.$_deserialize_body($_obj, $deserializer);
        $_obj.fac = $deserializer.readDouble();
        $_obj.mat1 = $deserializer.readObject();
        $_obj.mat2 = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        shaders.MixMaterial $_obj = new shaders.MixMaterial((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.fac);
        $serializer.write(this.mat1);
        $serializer.write(this.mat2);
        
    }
    
    // constructor just for allocation
    public MixMaterial(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
    public shaders.Material mat1;
    
    //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
    public shaders.Material mat2;
    
    //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
    public double fac;
    
    
    //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
    // creation method for java code (1-phase java constructor)
    public MixMaterial(final shaders.Material mat1, final shaders.Material mat2, final double fac) {
        this((java.lang.System[]) null);
        shaders$MixMaterial$$init$S(mat1, mat2, fac);
    }
    
    // constructor for non-virtual call
    final public shaders.MixMaterial shaders$MixMaterial$$init$S(final shaders.Material mat1, final shaders.Material mat2, final double fac) {
         {
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
            /*super.*/shaders$Material$$init$S();
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
            
            
            //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
            this.__fieldInitializers_shaders_MixMaterial();
            
            //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
            this.mat1 = ((shaders.Material)(mat1));
            
            //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
            this.mat2 = ((shaders.Material)(mat2));
            
            //#line 13 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
            this.fac = fac;
        }
        return this;
    }
    
    
    
    //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
    public primitives.Color evaluate__3$1primitives$Light$2__4$1primitives$Intersectable$2(final primitives.Intersectable me, final primitives.Ray ray, final double t, final x10.core.Rail lights, final x10.core.Rail objects) {
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        final shaders.Material t$6303 = ((shaders.Material)(this.mat1));
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        primitives.Color col1 = t$6303.evaluate__3$1primitives$Light$2__4$1primitives$Intersectable$2(((primitives.Intersectable)(me)), ((primitives.Ray)(ray)), (double)(t), ((x10.core.Rail)(lights)), ((x10.core.Rail)(objects)));
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        final shaders.Material t$6304 = ((shaders.Material)(this.mat2));
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        primitives.Color col2 = t$6304.evaluate__3$1primitives$Light$2__4$1primitives$Intersectable$2(((primitives.Intersectable)(me)), ((primitives.Ray)(ray)), (double)(t), ((x10.core.Rail)(lights)), ((x10.core.Rail)(objects)));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        final primitives.Color t$6305 = ((primitives.Color)(col1));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        final double t$6306 = this.fac;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        t$6305.scalar((double)(t$6306));
        
        //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        final primitives.Color t$6309 = ((primitives.Color)(col2));
        
        //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        final double t$6307 = ((double)(long)(((long)(1L))));
        
        //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        final double t$6308 = this.fac;
        
        //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        final double t$6310 = ((t$6307) - (((double)(t$6308))));
        
        //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        t$6309.scalar((double)(t$6310));
        
        //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        final primitives.Color t$6311 = ((primitives.Color)(col1));
        
        //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        final primitives.Color t$6312 = ((primitives.Color)(col2));
        
        //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        t$6311.add(((primitives.Color)(t$6312)));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        final primitives.Color t$6313 = ((primitives.Color)(col1));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        return t$6313;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
    final public shaders.MixMaterial shaders$MixMaterial$$this$shaders$MixMaterial() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        return shaders.MixMaterial.this;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
    final public void __fieldInitializers_shaders_MixMaterial() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        this.mat1 = null;
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        this.mat2 = null;
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/MixMaterial.x10"
        this.fac = 0.0;
    }
}

