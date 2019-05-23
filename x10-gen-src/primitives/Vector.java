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
        final double t$6225 = vec.x;
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6228 = ((sc) * (((double)(t$6225))));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6226 = vec.y;
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6229 = ((sc) * (((double)(t$6226))));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6227 = vec.z;
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6230 = ((sc) * (((double)(t$6227))));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final primitives.Vector t$6231 = ((primitives.Vector)(new primitives.Vector((java.lang.System[]) null).primitives$Vector$$init$S(t$6228, t$6229, t$6230)));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        return t$6231;
    }
    
    
    //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    public static primitives.Vector add(final primitives.Vector vec1, final primitives.Vector vec2) {
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6232 = vec1.x;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6233 = vec2.x;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6238 = ((t$6232) + (((double)(t$6233))));
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6234 = vec1.y;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6235 = vec2.y;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6239 = ((t$6234) + (((double)(t$6235))));
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6236 = vec1.z;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6237 = vec2.z;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6240 = ((t$6236) + (((double)(t$6237))));
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final primitives.Vector t$6241 = ((primitives.Vector)(new primitives.Vector((java.lang.System[]) null).primitives$Vector$$init$S(t$6238, t$6239, t$6240)));
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        return t$6241;
    }
    
    
    //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    public static primitives.Vector sub(final primitives.Vector vec1, final primitives.Vector vec2) {
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6242 = vec1.x;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6243 = vec2.x;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6248 = ((t$6242) - (((double)(t$6243))));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6244 = vec1.y;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6245 = vec2.y;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6249 = ((t$6244) - (((double)(t$6245))));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6246 = vec1.z;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6247 = vec2.z;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6250 = ((t$6246) - (((double)(t$6247))));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final primitives.Vector t$6251 = ((primitives.Vector)(new primitives.Vector((java.lang.System[]) null).primitives$Vector$$init$S(t$6248, t$6249, t$6250)));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        return t$6251;
    }
    
    
    //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    public static double dot$O(final primitives.Vector vec1, final primitives.Vector vec2) {
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6252 = vec1.x;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6253 = vec2.x;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6256 = ((t$6252) * (((double)(t$6253))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6254 = vec1.y;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6255 = vec2.y;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6257 = ((t$6254) * (((double)(t$6255))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6260 = ((t$6256) + (((double)(t$6257))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6258 = vec1.z;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6259 = vec2.z;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6261 = ((t$6258) * (((double)(t$6259))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6262 = ((t$6260) + (((double)(t$6261))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        return t$6262;
    }
    
    
    //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    public static double norm$O(final primitives.Vector vec) {
        
        //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6263 = primitives.Vector.dot$O(((primitives.Vector)(vec)), ((primitives.Vector)(vec)));
        
        //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6264 = java.lang.Math.sqrt(((double)(t$6263)));
        
        //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        return t$6264;
    }
    
    
    //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
    public static primitives.Vector normalize(final primitives.Vector vec) {
        
        //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6265 = ((double)(long)(((long)(1L))));
        
        //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6266 = primitives.Vector.norm$O(((primitives.Vector)(vec)));
        
        //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final double t$6267 = ((t$6265) / (((double)(t$6266))));
        
        //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        final primitives.Vector t$6268 = primitives.Vector.scalar((double)(t$6267), ((primitives.Vector)(vec)));
        
        //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Vector.x10"
        return t$6268;
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
            }}catch (java.lang.Throwable exc$6269) {
                primitives.Vector.exception$one = new x10.lang.ExceptionInInitializer(exc$6269);
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
            }}catch (java.lang.Throwable exc$6270) {
                primitives.Vector.exception$zero = new x10.lang.ExceptionInInitializer(exc$6270);
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

