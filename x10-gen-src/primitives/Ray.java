package primitives;

@x10.runtime.impl.java.X10Generated
public class Ray extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Ray> $RTT = 
        x10.rtt.NamedType.<Ray> make("primitives.Ray",
                                     Ray.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(primitives.Ray $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Ray.class + " calling"); } 
        $_obj.dir = $deserializer.readObject();
        $_obj.origin = $deserializer.readObject();
        $_obj.recursionLevel = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        primitives.Ray $_obj = new primitives.Ray((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.dir);
        $serializer.write(this.origin);
        $serializer.write(this.recursionLevel);
        
    }
    
    // constructor just for allocation
    public Ray(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
    public primitives.Vector origin;
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
    public primitives.Vector dir;
    
    //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
    public int recursionLevel;
    
    
    //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
    // creation method for java code (1-phase java constructor)
    public Ray(final primitives.Vector origin, final primitives.Vector dir) {
        this((java.lang.System[]) null);
        primitives$Ray$$init$S(origin, dir);
    }
    
    // constructor for non-virtual call
    final public primitives.Ray primitives$Ray$$init$S(final primitives.Vector origin, final primitives.Vector dir) {
         {
            
            //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
            
            
            //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
            this.__fieldInitializers_primitives_Ray();
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
            this.origin = ((primitives.Vector)(origin));
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
            this.dir = ((primitives.Vector)(dir));
            
            //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
            this.recursionLevel = 0;
        }
        return this;
    }
    
    
    
    //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
    // creation method for java code (1-phase java constructor)
    public Ray(final primitives.Vector origin, final primitives.Vector dir, final int rec) {
        this((java.lang.System[]) null);
        primitives$Ray$$init$S(origin, dir, rec);
    }
    
    // constructor for non-virtual call
    final public primitives.Ray primitives$Ray$$init$S(final primitives.Vector origin, final primitives.Vector dir, final int rec) {
         {
            
            //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
            
            
            //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
            this.__fieldInitializers_primitives_Ray();
            
            //#line 15 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
            this.origin = ((primitives.Vector)(origin));
            
            //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
            this.dir = ((primitives.Vector)(dir));
            
            //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
            this.recursionLevel = rec;
        }
        return this;
    }
    
    
    
    //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
    public int recurse$O() {
        
        //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
        final int t$859707 = this.recursionLevel;
        
        //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
        final int t$859708 = ((t$859707) + (((int)(1))));
        
        //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
        return t$859708;
    }
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
    final public primitives.Ray primitives$Ray$$this$primitives$Ray() {
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
        return primitives.Ray.this;
    }
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
    final public void __fieldInitializers_primitives_Ray() {
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
        this.origin = null;
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
        this.dir = null;
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Ray.x10"
        this.recursionLevel = 0;
    }
}

