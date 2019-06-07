package datastructures;

@x10.runtime.impl.java.X10Generated
public class MinBuffer extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<MinBuffer> $RTT = 
        x10.rtt.NamedType.<MinBuffer> make("datastructures.MinBuffer",
                                           MinBuffer.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(datastructures.MinBuffer $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + MinBuffer.class + " calling"); } 
        $_obj.index = $deserializer.readLong();
        $_obj.init = $deserializer.readBoolean();
        $_obj.value = $deserializer.readDouble();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        datastructures.MinBuffer $_obj = new datastructures.MinBuffer((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.index);
        $serializer.write(this.init);
        $serializer.write(this.value);
        
    }
    
    // constructor just for allocation
    public MinBuffer(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
    public double value;
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
    public long index;
    
    //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
    public boolean init;
    
    
    //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
    public void insert(final long ind, final double valu) {
        
        //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        final double t$6743 = this.value;
        
        //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        boolean t$6744 = ((valu) < (((double)(t$6743))));
        
        //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        if (t$6744) {
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
            t$6744 = ((valu) >= (((double)(0.0))));
        }
        
        //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        final boolean t$6745 = t$6744;
        
        //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        if (t$6745) {
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
            this.init = true;
            
            //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
            this.index = ind;
            
            //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
            this.value = valu;
        }
    }
    
    
    //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
    public boolean isEmpty$O() {
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        final boolean t$6746 = this.init;
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        final boolean t$6747 = !(t$6746);
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        return t$6747;
    }
    
    
    //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
    public long getIndex$O() {
        
        //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        final long t$6748 = this.index;
        
        //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        return t$6748;
    }
    
    
    //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
    public double getValue$O() {
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        final double t$6749 = this.value;
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        return t$6749;
    }
    
    
    //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
    public void init() {
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        final byte t$6750 = ((byte)0xff);
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        final double t$6751 = ((double)((int)(((byte)(t$6750)))&0xff));
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        this.value = t$6751;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        this.index = 0L;
        
        //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        this.init = false;
    }
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
    final public datastructures.MinBuffer datastructures$MinBuffer$$this$datastructures$MinBuffer() {
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        return datastructures.MinBuffer.this;
    }
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
    // creation method for java code (1-phase java constructor)
    public MinBuffer() {
        this((java.lang.System[]) null);
        datastructures$MinBuffer$$init$S();
    }
    
    // constructor for non-virtual call
    final public datastructures.MinBuffer datastructures$MinBuffer$$init$S() {
         {
            
            //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
            
            
            //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
            this.__fieldInitializers_datastructures_MinBuffer();
        }
        return this;
    }
    
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
    final public void __fieldInitializers_datastructures_MinBuffer() {
        
        //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        final byte t$6752 = ((byte)0xff);
        
        //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        final double t$6753 = ((double)((int)(((byte)(t$6752)))&0xff));
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        this.value = t$6753;
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        this.index = 0L;
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/MinBuffer.x10"
        this.init = false;
    }
}

