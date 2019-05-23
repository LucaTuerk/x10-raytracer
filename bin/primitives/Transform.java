package primitives;

@x10.runtime.impl.java.X10Generated
public class Transform extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Transform> $RTT = 
        x10.rtt.NamedType.<Transform> make("primitives.Transform",
                                           Transform.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(primitives.Transform $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Transform.class + " calling"); } 
        $_obj.pos = $deserializer.readObject();
        $_obj.rot = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        primitives.Transform $_obj = new primitives.Transform((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.pos);
        $serializer.write(this.rot);
        
    }
    
    // constructor just for allocation
    public Transform(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
    public primitives.Vector pos;
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
    public primitives.Vector rot;
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
    final public primitives.Transform primitives$Transform$$this$primitives$Transform() {
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
        return primitives.Transform.this;
    }
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
    // creation method for java code (1-phase java constructor)
    public Transform() {
        this((java.lang.System[]) null);
        primitives$Transform$$init$S();
    }
    
    // constructor for non-virtual call
    final public primitives.Transform primitives$Transform$$init$S() {
         {
            
            //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
            
            
            //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
            this.__fieldInitializers_primitives_Transform();
        }
        return this;
    }
    
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
    final public void __fieldInitializers_primitives_Transform() {
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
        this.pos = null;
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
        this.rot = null;
    }
}

