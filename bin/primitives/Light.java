package primitives;

@x10.runtime.impl.java.X10Generated
public class Light extends primitives.Transform implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Light> $RTT = 
        x10.rtt.NamedType.<Light> make("primitives.Light",
                                       Light.class,
                                       new x10.rtt.Type[] {
                                           primitives.Transform.$RTT
                                       });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(primitives.Light $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Light.class + " calling"); } 
        primitives.Transform.$_deserialize_body($_obj, $deserializer);
        $_obj.color = $deserializer.readObject();
        $_obj.intensity = $deserializer.readDouble();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        primitives.Light $_obj = new primitives.Light((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.color);
        $serializer.write(this.intensity);
        
    }
    
    // constructor just for allocation
    public Light(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Light.x10"
    public primitives.Color color;
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Light.x10"
    public double intensity;
    
    
    //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Light.x10"
    // creation method for java code (1-phase java constructor)
    public Light(final primitives.Vector pos, final primitives.Color color, final double intensity) {
        this((java.lang.System[]) null);
        primitives$Light$$init$S(pos, color, intensity);
    }
    
    // constructor for non-virtual call
    final public primitives.Light primitives$Light$$init$S(final primitives.Vector pos, final primitives.Color color, final double intensity) {
         {
            
            //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Light.x10"
            /*super.*/primitives$Transform$$init$S();
            
            //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Light.x10"
            
            
            //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Light.x10"
            this.__fieldInitializers_primitives_Light();
            
            //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Light.x10"
            this.pos = ((primitives.Vector)(pos));
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Light.x10"
            this.color = ((primitives.Color)(color));
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Light.x10"
            this.intensity = intensity;
        }
        return this;
    }
    
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Light.x10"
    final public primitives.Light primitives$Light$$this$primitives$Light() {
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Light.x10"
        return primitives.Light.this;
    }
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Light.x10"
    final public void __fieldInitializers_primitives_Light() {
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Light.x10"
        this.color = null;
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Light.x10"
        this.intensity = 0.0;
    }
}

