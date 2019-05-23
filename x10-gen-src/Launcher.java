
@x10.runtime.impl.java.X10Generated
public class Launcher extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Launcher> $RTT = 
        x10.rtt.NamedType.<Launcher> make("Launcher",
                                          Launcher.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Launcher $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Launcher.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Launcher $_obj = new Launcher((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Launcher(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/Launcher.x10"
    public static class $Main extends x10.runtime.impl.java.Runtime
    {
        // java main method
        public static void main(java.lang.String[] args) {
            // start native runtime
            new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.core.Rail<java.lang.String> args) {
            // call the original app-main method
            Launcher.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> args) {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/Launcher.x10"
        raytracer.Raytracer.main(((x10.core.Rail)(args)));
    }
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/Launcher.x10"
    final public Launcher Launcher$$this$Launcher() {
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/Launcher.x10"
        return Launcher.this;
    }
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/Launcher.x10"
    // creation method for java code (1-phase java constructor)
    public Launcher() {
        this((java.lang.System[]) null);
        Launcher$$init$S();
    }
    
    // constructor for non-virtual call
    final public Launcher Launcher$$init$S() {
         {
            
            //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/Launcher.x10"
            
            
            //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/Launcher.x10"
            this.__fieldInitializers_Launcher();
        }
        return this;
    }
    
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/Launcher.x10"
    final public void __fieldInitializers_Launcher() {
        
    }
}

