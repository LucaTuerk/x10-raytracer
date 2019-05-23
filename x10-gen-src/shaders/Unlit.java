package shaders;


@x10.runtime.impl.java.X10Generated
public class Unlit extends shaders.Material implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Unlit> $RTT = 
        x10.rtt.NamedType.<Unlit> make("shaders.Unlit",
                                       Unlit.class,
                                       new x10.rtt.Type[] {
                                           shaders.Material.$RTT
                                       });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(shaders.Unlit $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Unlit.class + " calling"); } 
        shaders.Material.$_deserialize_body($_obj, $deserializer);
        $_obj.color = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        shaders.Unlit $_obj = new shaders.Unlit((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.color);
        
    }
    
    // constructor just for allocation
    public Unlit(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Unlit.x10"
    public primitives.Color color;
    
    
    //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Unlit.x10"
    // creation method for java code (1-phase java constructor)
    public Unlit(final primitives.Color color) {
        this((java.lang.System[]) null);
        shaders$Unlit$$init$S(color);
    }
    
    // constructor for non-virtual call
    final public shaders.Unlit shaders$Unlit$$init$S(final primitives.Color color) {
         {
            
            //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Unlit.x10"
            /*super.*/shaders$Material$$init$S();
            
            //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Unlit.x10"
            
            
            //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Unlit.x10"
            this.__fieldInitializers_shaders_Unlit();
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Unlit.x10"
            this.color = ((primitives.Color)(color));
        }
        return this;
    }
    
    
    
    //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Unlit.x10"
    public primitives.Color evaluate__3$1primitives$Light$2__4$1primitives$Intersectable$2(final primitives.Intersectable me, final primitives.Ray ray, final double t, final x10.core.Rail lights, final x10.core.Rail objects) {
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Unlit.x10"
        final primitives.Color t$7195 = ((primitives.Color)(this.color));
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Unlit.x10"
        return t$7195;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Unlit.x10"
    final public shaders.Unlit shaders$Unlit$$this$shaders$Unlit() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Unlit.x10"
        return shaders.Unlit.this;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Unlit.x10"
    final public void __fieldInitializers_shaders_Unlit() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Unlit.x10"
        this.color = null;
    }
}

