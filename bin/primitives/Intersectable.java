package primitives;


@x10.runtime.impl.java.X10Generated
abstract public class Intersectable extends primitives.Transform implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Intersectable> $RTT = 
        x10.rtt.NamedType.<Intersectable> make("primitives.Intersectable",
                                               Intersectable.class,
                                               new x10.rtt.Type[] {
                                                   primitives.Transform.$RTT
                                               });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(primitives.Intersectable $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Intersectable.class + " calling"); } 
        primitives.Transform.$_deserialize_body($_obj, $deserializer);
        $_obj.mat = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.mat);
        
    }
    
    // constructor just for allocation
    public Intersectable(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Intersectable.x10"
    public shaders.Material mat;
    
    
    //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Intersectable.x10"
    abstract public double intersect$O(final primitives.Ray ray);
    
    
    //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Intersectable.x10"
    abstract public primitives.Vector normal(final primitives.Ray ray, final double t);
    
    
    //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Intersectable.x10"
    final public primitives.Intersectable primitives$Intersectable$$this$primitives$Intersectable() {
        
        //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Intersectable.x10"
        return primitives.Intersectable.this;
    }
    
    
    //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Intersectable.x10"
    
    // constructor for non-virtual call
    final public primitives.Intersectable primitives$Intersectable$$init$S() {
         {
            
            //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Intersectable.x10"
            /*super.*/primitives$Transform$$init$S();
            
            //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Intersectable.x10"
            
            
            //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Intersectable.x10"
            this.__fieldInitializers_primitives_Intersectable();
        }
        return this;
    }
    
    
    
    //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Intersectable.x10"
    final public void __fieldInitializers_primitives_Intersectable() {
        
        //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Intersectable.x10"
        this.mat = null;
    }
}

