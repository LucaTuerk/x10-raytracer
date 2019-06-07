package shaders;


@x10.runtime.impl.java.X10Generated
public class Normal extends shaders.Material implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Normal> $RTT = 
        x10.rtt.NamedType.<Normal> make("shaders.Normal",
                                        Normal.class,
                                        new x10.rtt.Type[] {
                                            shaders.Material.$RTT
                                        });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(shaders.Normal $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Normal.class + " calling"); } 
        shaders.Material.$_deserialize_body($_obj, $deserializer);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        shaders.Normal $_obj = new shaders.Normal((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        
    }
    
    // constructor just for allocation
    public Normal(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    
    //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
    public primitives.Color evaluate__3$1primitives$Light$2__4$1primitives$Intersectable$2(final primitives.Intersectable me, final primitives.Ray ray, final double t, final x10.core.Rail lights, final x10.core.Rail objects) {
        
        //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        final primitives.Vector norm = me.normal(((primitives.Ray)(ray)), (double)(t));
        
        //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        final double t$1203369 = norm.x;
        
        //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        final double t$1203370 = ((t$1203369) + (((double)(1.0))));
        
        //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        final double t$1203371 = ((t$1203370) / (((double)(2.0))));
        
        //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        final double t$1203372 = raytracer.Utilities.interpolate$O((double)(t$1203371), (double)(0.0), (double)(255.0));
        
        //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        final long t$1203379 = ((long)(double)(((double)(t$1203372))));
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        final double t$1203373 = norm.y;
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        final double t$1203374 = ((t$1203373) + (((double)(1.0))));
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        final double t$1203375 = ((t$1203374) / (((double)(2.0))));
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        final double t$1203376 = raytracer.Utilities.interpolate$O((double)(t$1203375), (double)(0.0), (double)(255.0));
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        final long t$1203380 = ((long)(double)(((double)(t$1203376))));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        final double t$1203377 = norm.z;
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        final double t$1203378 = raytracer.Utilities.interpolate$O((double)(t$1203377), (double)(128.0), (double)(255.0));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        final long t$1203381 = ((long)(double)(((double)(t$1203378))));
        
        //#line 15 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        final primitives.Color t$1203382 = ((primitives.Color)(new primitives.Color((java.lang.System[]) null).primitives$Color$$init$S(t$1203379, t$1203380, t$1203381, ((long)(255L)))));
        
        //#line 15 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        return t$1203382;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
    final public shaders.Normal shaders$Normal$$this$shaders$Normal() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
        return shaders.Normal.this;
    }
    
    
    //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
    // creation method for java code (1-phase java constructor)
    public Normal() {
        this((java.lang.System[]) null);
        shaders$Normal$$init$S();
    }
    
    // constructor for non-virtual call
    final public shaders.Normal shaders$Normal$$init$S() {
         {
            
            //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
            /*super.*/shaders$Material$$init$S();
            
            //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
            
            
            //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
            this.__fieldInitializers_shaders_Normal();
        }
        return this;
    }
    
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Normal.x10"
    final public void __fieldInitializers_shaders_Normal() {
        
    }
}

