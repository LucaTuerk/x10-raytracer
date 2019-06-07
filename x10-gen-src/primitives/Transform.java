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
    
    
    //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
    public double getPosComponent$O(final long d) {
        
        //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
        final int t$99545 = ((int)(long)(((long)(d))));
        
        //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
        switch (t$99545) {
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
            case 0:
                
                //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
                final primitives.Vector t$99537 = ((primitives.Vector)(this.pos));
                
                //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
                final double t$99538 = t$99537.x;
                
                //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
                return t$99538;
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
            case 1:
                
                //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
                final primitives.Vector t$99539 = ((primitives.Vector)(this.pos));
                
                //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
                final double t$99540 = t$99539.y;
                
                //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
                return t$99540;
            
            //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
            case 2:
                
                //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
                final primitives.Vector t$99541 = ((primitives.Vector)(this.pos));
                
                //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
                final double t$99542 = t$99541.z;
                
                //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
                return t$99542;
            
            //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
            default:
                
                //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
                final long t$99543 = ((d) % (((long)(3L))));
                
                //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
                final double t$99544 = this.getPosComponent$O((long)(t$99543));
                
                //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Transform.x10"
                return t$99544;
        }
    }
    
    
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

