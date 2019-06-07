package primitives;

@x10.runtime.impl.java.X10Generated
public class Vector extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Vector> $RTT = 
        x10.rtt.NamedType.<Vector> make("primitives.Vector",
                                        Vector.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(primitives.Vector $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Vector.class + " calling"); } 
        $_obj.x = $deserializer.readDouble();
        $_obj.y = $deserializer.readDouble();
        $_obj.z = $deserializer.readDouble();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        primitives.Vector $_obj = new primitives.Vector((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.x);
        $serializer.write(this.y);
        $serializer.write(this.z);
        
    }
    
    // constructor just for allocation
    public Vector(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    public double x;
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    public double y;
    
    //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    public double z;
    
    
    //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    // creation method for java code (1-phase java constructor)
    public Vector(final double x, final double y, final double z) {
        this((java.lang.System[]) null);
        primitives$Vector$$init$S(x, y, z);
    }
    
    // constructor for non-virtual call
    final public primitives.Vector primitives$Vector$$init$S(final double x, final double y, final double z) {
         {
            
            //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
            
            
            //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
            this.__fieldInitializers_primitives_Vector();
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
            this.x = x;
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
            this.y = y;
            
            //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
            this.z = z;
        }
        return this;
    }
    
    
    
    //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    private static primitives.Vector one;
    
    //#line 15 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    private static primitives.Vector zero;
    
    
    //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    public static primitives.Vector scalar(final double sc, final primitives.Vector vec) {
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6683 = vec.x;
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6686 = ((sc) * (((double)(t$6683))));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6684 = vec.y;
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6687 = ((sc) * (((double)(t$6684))));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6685 = vec.z;
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6688 = ((sc) * (((double)(t$6685))));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final primitives.Vector t$6689 = ((primitives.Vector)(new primitives.Vector((java.lang.System[]) null).primitives$Vector$$init$S(t$6686, t$6687, t$6688)));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        return t$6689;
    }
    
    
    //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    public static primitives.Vector add(final primitives.Vector vec1, final primitives.Vector vec2) {
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6690 = vec1.x;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6691 = vec2.x;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6696 = ((t$6690) + (((double)(t$6691))));
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6692 = vec1.y;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6693 = vec2.y;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6697 = ((t$6692) + (((double)(t$6693))));
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6694 = vec1.z;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6695 = vec2.z;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6698 = ((t$6694) + (((double)(t$6695))));
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final primitives.Vector t$6699 = ((primitives.Vector)(new primitives.Vector((java.lang.System[]) null).primitives$Vector$$init$S(t$6696, t$6697, t$6698)));
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        return t$6699;
    }
    
    
    //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    public static primitives.Vector sub(final primitives.Vector vec1, final primitives.Vector vec2) {
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6700 = vec1.x;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6701 = vec2.x;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6706 = ((t$6700) - (((double)(t$6701))));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6702 = vec1.y;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6703 = vec2.y;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6707 = ((t$6702) - (((double)(t$6703))));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6704 = vec1.z;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6705 = vec2.z;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6708 = ((t$6704) - (((double)(t$6705))));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final primitives.Vector t$6709 = ((primitives.Vector)(new primitives.Vector((java.lang.System[]) null).primitives$Vector$$init$S(t$6706, t$6707, t$6708)));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        return t$6709;
    }
    
    
    //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    public static double dot$O(final primitives.Vector vec1, final primitives.Vector vec2) {
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6710 = vec1.x;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6711 = vec2.x;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6714 = ((t$6710) * (((double)(t$6711))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6712 = vec1.y;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6713 = vec2.y;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6715 = ((t$6712) * (((double)(t$6713))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6718 = ((t$6714) + (((double)(t$6715))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6716 = vec1.z;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6717 = vec2.z;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6719 = ((t$6716) * (((double)(t$6717))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6720 = ((t$6718) + (((double)(t$6719))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        return t$6720;
    }
    
    
    //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    public static double norm$O(final primitives.Vector vec) {
        
        //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6721 = primitives.Vector.dot$O(((primitives.Vector)(vec)), ((primitives.Vector)(vec)));
        
        //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6722 = java.lang.Math.sqrt(((double)(t$6721)));
        
        //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        return t$6722;
    }
    
    
    //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    public static primitives.Vector normalize(final primitives.Vector vec) {
        
        //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6723 = ((double)(long)(((long)(1L))));
        
        //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6724 = primitives.Vector.norm$O(((primitives.Vector)(vec)));
        
        //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6725 = ((t$6723) / (((double)(t$6724))));
        
        //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final primitives.Vector t$6726 = primitives.Vector.scalar((double)(t$6725), ((primitives.Vector)(vec)));
        
        //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        return t$6726;
    }
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    final public primitives.Vector primitives$Vector$$this$primitives$Vector() {
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        return primitives.Vector.this;
    }
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    final public void __fieldInitializers_primitives_Vector() {
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        this.x = 0.0;
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        this.y = 0.0;
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        this.z = 0.0;
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$zero = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$zero;
    final private static x10.core.concurrent.AtomicInteger initStatus$one = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$one;
    
    public static primitives.Vector get$one() {
        if (((int) primitives.Vector.initStatus$one.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return primitives.Vector.one;
        }
        if (((int) primitives.Vector.initStatus$one.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: primitives.Vector.one")));
            }
            throw primitives.Vector.exception$one;
        }
        if (primitives.Vector.initStatus$one.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                primitives.Vector.one = new primitives.Vector((java.lang.System[]) null).primitives$Vector$$init$S(((double)(long)(((long)(1L)))), ((double)(long)(((long)(1L)))), ((double)(long)(((long)(1L)))));
            }}catch (java.lang.Throwable exc$6727) {
                primitives.Vector.exception$one = new x10.lang.ExceptionInInitializer(exc$6727);
                primitives.Vector.initStatus$one.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw primitives.Vector.exception$one;
            }
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Doing static initialization for field: primitives.Vector.one")));
            }
            primitives.Vector.initStatus$one.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (primitives.Vector.initStatus$one.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (primitives.Vector.initStatus$one.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) primitives.Vector.initStatus$one.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                        x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: primitives.Vector.one")));
                    }
                    throw primitives.Vector.exception$one;
                }
            }
        }
        return primitives.Vector.one;
    }
    
    public static primitives.Vector get$zero() {
        if (((int) primitives.Vector.initStatus$zero.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return primitives.Vector.zero;
        }
        if (((int) primitives.Vector.initStatus$zero.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: primitives.Vector.zero")));
            }
            throw primitives.Vector.exception$zero;
        }
        if (primitives.Vector.initStatus$zero.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                primitives.Vector.zero = new primitives.Vector((java.lang.System[]) null).primitives$Vector$$init$S(((double)(long)(((long)(0L)))), ((double)(long)(((long)(0L)))), ((double)(long)(((long)(0L)))));
            }}catch (java.lang.Throwable exc$6728) {
                primitives.Vector.exception$zero = new x10.lang.ExceptionInInitializer(exc$6728);
                primitives.Vector.initStatus$zero.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw primitives.Vector.exception$zero;
            }
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Doing static initialization for field: primitives.Vector.zero")));
            }
            primitives.Vector.initStatus$zero.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (primitives.Vector.initStatus$zero.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (primitives.Vector.initStatus$zero.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) primitives.Vector.initStatus$zero.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                        x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: primitives.Vector.zero")));
                    }
                    throw primitives.Vector.exception$zero;
                }
            }
        }
        return primitives.Vector.zero;
    }
}

