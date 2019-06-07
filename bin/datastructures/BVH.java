package datastructures;


@x10.runtime.impl.java.X10Generated
public class BVH extends primitives.Intersectable implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<BVH> $RTT = 
        x10.rtt.NamedType.<BVH> make("datastructures.BVH",
                                     BVH.class,
                                     new x10.rtt.Type[] {
                                         primitives.Intersectable.$RTT
                                     });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(datastructures.BVH $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + BVH.class + " calling"); } 
        primitives.Intersectable.$_deserialize_body($_obj, $deserializer);
        $_obj.focus = $deserializer.readBoolean();
        $_obj.leftChild = $deserializer.readObject();
        $_obj.rightChild = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        datastructures.BVH $_obj = new datastructures.BVH((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.focus);
        $serializer.write(this.leftChild);
        $serializer.write(this.rightChild);
        
    }
    
    // constructor just for allocation
    public BVH(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
    public primitives.Intersectable leftChild;
    
    //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
    public primitives.Intersectable rightChild;
    
    //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
    public boolean focus;
    
    
    //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
    // creation method for java code (1-phase java constructor)
    public BVH(final primitives.Intersectable leftChild, final primitives.Intersectable rightChild) {
        this((java.lang.System[]) null);
        datastructures$BVH$$init$S(leftChild, rightChild);
    }
    
    // constructor for non-virtual call
    final public datastructures.BVH datastructures$BVH$$init$S(final primitives.Intersectable leftChild, final primitives.Intersectable rightChild) {
         {
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            /*super.*/primitives$Intersectable$$init$S();
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            
            
            //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            this.__fieldInitializers_datastructures_BVH();
            
            //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            this.leftChild = ((primitives.Intersectable)(leftChild));
            
            //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            this.rightChild = ((primitives.Intersectable)(rightChild));
            
            //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Vector t$860083 = ((primitives.Vector)(leftChild.pos));
            
            //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Vector t$860084 = ((primitives.Vector)(rightChild.pos));
            
            //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Vector conn = primitives.Vector.sub(((primitives.Vector)(t$860083)), ((primitives.Vector)(t$860084)));
            
            //#line 15 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Vector connNorm = primitives.Vector.normalize(((primitives.Vector)(conn)));
            
            //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final double t$860085 = leftChild.rad;
            
            //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Vector rim = primitives.Vector.scalar((double)(t$860085), ((primitives.Vector)(connNorm)));
            
            //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final double t$860086 = primitives.Vector.norm$O(((primitives.Vector)(conn)));
            
            //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final double t$860087 = leftChild.rad;
            
            //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final double t$860088 = ((t$860086) + (((double)(t$860087))));
            
            //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final double t$860089 = rightChild.rad;
            
            //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final double t$860090 = ((t$860088) + (((double)(t$860089))));
            
            //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            this.rad = t$860090;
            
            //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final double t$860091 = this.rad;
            
            //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final double t$860092 = ((double)(long)(((long)(2L))));
            
            //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final double t$860094 = ((t$860091) / (((double)(t$860092))));
            
            //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final double t$860093 = -1.0;
            
            //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Vector t$860095 = primitives.Vector.scalar((double)(t$860093), ((primitives.Vector)(connNorm)));
            
            //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Vector t$860096 = primitives.Vector.scalar((double)(t$860094), ((primitives.Vector)(t$860095)));
            
            //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Vector t$860097 = primitives.Vector.add(((primitives.Vector)(rim)), ((primitives.Vector)(t$860096)));
            
            //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            this.pos = ((primitives.Vector)(t$860097));
        }
        return this;
    }
    
    
    
    //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
    public primitives.Intersectable construct__0$1primitives$Intersectable$2(final x10.core.Rail objects) {
        
        //#line 23 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final long t$860098 = ((x10.core.Rail<primitives.Intersectable>)objects).size;
        
        //#line 23 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final boolean t$860105 = ((t$860098) <= (((long)(2L))));
        
        //#line 23 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        if (t$860105) {
            
            //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final long t$860099 = ((x10.core.Rail<primitives.Intersectable>)objects).size;
            
            //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final boolean t$860101 = ((t$860099) <= (((long)(1L))));
            
            //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            if (t$860101) {
                
                //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                final primitives.Intersectable t$860100 = ((primitives.Intersectable[])objects.value)[(int)0L];
                
                //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                return t$860100;
            }
            
            //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Intersectable t$860102 = ((primitives.Intersectable[])objects.value)[(int)0L];
            
            //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Intersectable t$860103 = ((primitives.Intersectable[])objects.value)[(int)1L];
            
            //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final datastructures.BVH t$860104 = ((datastructures.BVH)(new datastructures.BVH((java.lang.System[]) null).datastructures$BVH$$init$S(t$860102, t$860103)));
            
            //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            return t$860104;
        }
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final long t$860106 = ((x10.core.Rail<primitives.Intersectable>)objects).size;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final long t$860107 = ((t$860106) % (((long)(2L))));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final boolean t$860111 = ((long) t$860107) == ((long) 0L);
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        long t$860112 =  0;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        if (t$860111) {
            
            //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final long t$860108 = ((x10.core.Rail<primitives.Intersectable>)objects).size;
            
            //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            t$860112 = ((t$860108) / (((long)(2L))));
        } else {
            
            //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final long t$860109 = ((x10.core.Rail<primitives.Intersectable>)objects).size;
            
            //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final long t$860110 = ((t$860109) / (((long)(2L))));
            
            //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            t$860112 = ((t$860110) + (((long)(1L))));
        }
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final long t$860113 = t$860112;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final x10.core.Rail objs = new x10.core.Rail<primitives.Intersectable>(primitives.Intersectable.$RTT, t$860113);
        
        //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final long t$860114 = ((x10.core.Rail<primitives.Intersectable>)objects).size;
        
        //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final x10.core.Rail selected = new x10.core.Rail<x10.core.Boolean>(x10.rtt.Types.BOOLEAN, ((long)(t$860114)));
        
        //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        long i$860180 = 0L;
        
        //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        for (;
             true;
             ) {
            
            //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final long t$860181 = i$860180;
            
            //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final long t$860182 = ((x10.core.Rail<primitives.Intersectable>)objs).size;
            
            //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final boolean t$860183 = ((t$860181) < (((long)(t$860182))));
            
            //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            if (!(t$860183)) {
                
                //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                break;
            }
            
            //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final long t$860178 = i$860180;
            
            //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final long t$860179 = ((t$860178) + (((long)(1L))));
            
            //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            i$860180 = t$860179;
        }
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        return null;
    }
    
    
    //#line 40 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
    public x10.core.Rail distSort__0$1primitives$Intersectable$2(final x10.core.Rail objects) {
        
        //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final long t$860121 = ((x10.core.Rail<primitives.Intersectable>)objects).size;
        
        //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final x10.core.Rail objs = new x10.core.Rail<primitives.Intersectable>(primitives.Intersectable.$RTT, ((long)(t$860121)));
        
        //#line 43 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        return null;
    }
    
    
    //#line 46 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
    public x10.core.Rail sortByAxis__0$1primitives$Intersectable$2(final x10.core.Rail objects, final long d) {
        
        //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        return null;
    }
    
    
    //#line 50 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
    public x10.core.Rail sortByAxis__0$1primitives$Intersectable$2(final x10.core.Rail objects, final long low, final long high, final long d) {
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final long t$860122 = ((high) - (((long)(low))));
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final boolean t$860123 = ((long) t$860122) == ((long) 1L);
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        if (t$860123) {
            
            //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            return objects;
        }
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final long t$860124 = ((high) - (((long)(low))));
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final long t$860125 = ((t$860124) / (((long)(2L))));
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final long t$860126 = ((low) + (((long)(t$860125))));
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        this.sortByAxis__0$1primitives$Intersectable$2(((x10.core.Rail)(objects)), (long)(low), (long)(t$860126), (long)(d));
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final long t$860127 = ((high) - (((long)(low))));
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final long t$860128 = ((t$860127) / (((long)(2L))));
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final long t$860129 = ((low) + (((long)(t$860128))));
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        this.sortByAxis__0$1primitives$Intersectable$2(((x10.core.Rail)(objects)), (long)(t$860129), (long)(high), (long)(d));
        
        //#line 58 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        return null;
    }
    
    
    //#line 61 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
    public void merge__0$1primitives$Intersectable$2(final x10.core.Rail objects, final int low, final int middle, final int high) {
        
    }
    
    
    //#line 66 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
    public primitives.Vector normal(primitives.Ray ray, double t) {
        
        //#line 67 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final boolean t$860136 = this.focus;
        
        //#line 67 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        primitives.Vector t$860137 =  null;
        
        //#line 67 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        if (t$860136) {
            
            //#line 67 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Intersectable t$860130 = ((primitives.Intersectable)(this.leftChild));
            
            //#line 67 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Ray t$860131 = ((primitives.Ray)(ray));
            
            //#line 67 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final double t$860132 = t;
            
            //#line 67 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            t$860137 = t$860130.normal(((primitives.Ray)(t$860131)), (double)(t$860132));
        } else {
            
            //#line 67 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Intersectable t$860133 = ((primitives.Intersectable)(this.rightChild));
            
            //#line 67 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Ray t$860134 = ((primitives.Ray)(ray));
            
            //#line 67 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final double t$860135 = t;
            
            //#line 67 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            t$860137 = t$860133.normal(((primitives.Ray)(t$860134)), (double)(t$860135));
        }
        
        //#line 67 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final primitives.Vector t$860138 = t$860137;
        
        //#line 67 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        return t$860138;
    }
    
    
    //#line 70 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
    public double intersect$O(final primitives.Ray ray) {
        
        //#line 72 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final boolean t$860159 = this.intersect_me$O(((primitives.Ray)(ray)));
        
        //#line 72 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        if (t$860159) {
            
            //#line 73 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            x10.core.Rail t = new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, ((long)(2L)));
            
            //#line 74 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final x10.core.Rail t$860139 = ((x10.core.Rail)(t));
            
            //#line 74 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final x10.core.GlobalRef tref = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.core.Rail<x10.core.Double>>(x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.DOUBLE), t$860139, (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
            
            //#line 76 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Intersectable left = this.leftChild;
            
            //#line 77 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final primitives.Intersectable right = this.rightChild;
            {
                
                //#line 79 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                x10.xrx.Runtime.ensureNotInAtomic();
                
                //#line 79 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                final x10.xrx.FinishState fs$860206 = x10.xrx.Runtime.startFinish();
                
                //#line 79 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                try {{
                    {
                        
                        //#line 80 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                        x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new datastructures.BVH.$Closure$34(left, ray, tref, (datastructures.BVH.$Closure$34.__2$1x10$lang$Rail$1x10$lang$Double$2$2) null))));
                        
                        //#line 87 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                        x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new datastructures.BVH.$Closure$37(right, ray, tref, (datastructures.BVH.$Closure$37.__2$1x10$lang$Rail$1x10$lang$Double$2$2) null))));
                    }
                }}catch (java.lang.Throwable ct$860204) {
                    
                    //#line 79 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                    x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$860204)));
                    
                    //#line 79 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 79 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                     x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$860206)));
                 }}
                }
            
            //#line 96 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final x10.core.Rail t$860144 = ((x10.core.Rail)(t));
            
            //#line 96 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final double t$860146 = ((double[])t$860144.value)[(int)0L];
            
            //#line 96 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final x10.core.Rail t$860145 = ((x10.core.Rail)(t));
            
            //#line 96 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final double t$860147 = ((double[])t$860145.value)[(int)1L];
            
            //#line 96 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final boolean t$860148 = ((t$860146) < (((double)(t$860147))));
            
            //#line 96 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            this.focus = t$860148;
            
            //#line 97 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final boolean t$860151 = this.focus;
            
            //#line 97 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            shaders.Material t$860152 =  null;
            
            //#line 97 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            if (t$860151) {
                
                //#line 97 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                final primitives.Intersectable t$860149 = ((primitives.Intersectable)(this.leftChild));
                
                //#line 97 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                t$860152 = ((shaders.Material)(t$860149.mat));
            } else {
                
                //#line 97 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                final primitives.Intersectable t$860150 = ((primitives.Intersectable)(this.rightChild));
                
                //#line 97 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                t$860152 = ((shaders.Material)(t$860150.mat));
            }
            
            //#line 97 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final shaders.Material t$860153 = ((shaders.Material)(t$860152));
            
            //#line 97 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            this.mat = ((shaders.Material)(t$860153));
            
            //#line 98 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final boolean t$860156 = this.focus;
            
            //#line 98 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            double t$860157 =  0;
            
            //#line 98 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            if (t$860156) {
                
                //#line 98 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                final x10.core.Rail t$860154 = ((x10.core.Rail)(t));
                
                //#line 98 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                t$860157 = ((double[])t$860154.value)[(int)0L];
            } else {
                
                //#line 98 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                final x10.core.Rail t$860155 = ((x10.core.Rail)(t));
                
                //#line 98 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                t$860157 = ((double[])t$860155.value)[(int)1L];
            }
            
            //#line 98 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            final double t$860158 = t$860157;
            
            //#line 98 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            return t$860158;
            }
        
        //#line 100 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final double t$860160 = -1.0;
        
        //#line 100 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        return t$860160;
        }
    
    
    //#line 103 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
    public boolean intersect_me$O(primitives.Ray ray) {
        
        //#line 104 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final primitives.Ray t$860161 = ((primitives.Ray)(ray));
        
        //#line 104 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final primitives.Vector t$860162 = ((primitives.Vector)(t$860161.origin));
        
        //#line 104 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final primitives.Vector t$860163 = ((primitives.Vector)(this.pos));
        
        //#line 104 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        primitives.Vector v = primitives.Vector.sub(((primitives.Vector)(t$860162)), ((primitives.Vector)(t$860163)));
        
        //#line 105 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final primitives.Vector t$860165 = ((primitives.Vector)(v));
        
        //#line 105 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final primitives.Ray t$860164 = ((primitives.Ray)(ray));
        
        //#line 105 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final primitives.Vector t$860166 = ((primitives.Vector)(t$860164.dir));
        
        //#line 105 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final double t$860167 = primitives.Vector.dot$O(((primitives.Vector)(t$860165)), ((primitives.Vector)(t$860166)));
        
        //#line 105 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final double b = ((2.0) * (((double)(t$860167))));
        
        //#line 106 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final primitives.Vector t$860168 = ((primitives.Vector)(v));
        
        //#line 106 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final primitives.Vector t$860169 = ((primitives.Vector)(v));
        
        //#line 106 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final double t$860172 = primitives.Vector.dot$O(((primitives.Vector)(t$860168)), ((primitives.Vector)(t$860169)));
        
        //#line 106 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final double t$860170 = this.rad;
        
        //#line 106 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final double t$860171 = this.rad;
        
        //#line 106 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final double t$860173 = ((t$860170) * (((double)(t$860171))));
        
        //#line 106 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final double c = ((t$860172) - (((double)(t$860173))));
        
        //#line 107 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final double t$860174 = ((b) * (((double)(b))));
        
        //#line 107 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final double t$860175 = ((4.0) * (((double)(c))));
        
        //#line 107 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        double delta = ((t$860174) - (((double)(t$860175))));
        
        //#line 110 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final double t$860176 = delta;
        
        //#line 110 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        final boolean t$860177 = ((t$860176) < (((double)(1.0E-4))));
        
        //#line 110 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        if (t$860177) {
            
            //#line 111 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            return false;
        }
        
        //#line 113 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        return true;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
    final public datastructures.BVH datastructures$BVH$$this$datastructures$BVH() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        return datastructures.BVH.this;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
    final public void __fieldInitializers_datastructures_BVH() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        this.leftChild = null;
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        this.rightChild = null;
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
        this.focus = true;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$32 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$32> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$32> make($Closure$32.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(datastructures.BVH.$Closure$32 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$32.class + " calling"); } 
            $_obj.t1 = $deserializer.readDouble();
            $_obj.tref = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            datastructures.BVH.$Closure$32 $_obj = new datastructures.BVH.$Closure$32((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.t1);
            $serializer.write(this.tref);
            
        }
        
        // constructor just for allocation
        public $Closure$32(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Rail$1x10$lang$Double$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 82 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            try {{
                
                //#line 83 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                final x10.core.Rail tval = ((x10.core.Rail)((((x10.core.GlobalRef<x10.core.Rail<x10.core.Double>>)(this.tref))).$apply$G()));
                
                //#line 84 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                ((double[])tval.value)[(int)0L] = this.t1;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 82 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.xrx.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.core.GlobalRef<x10.core.Rail<x10.core.Double>> tref;
        public double t1;
        
        public $Closure$32(final x10.core.GlobalRef<x10.core.Rail<x10.core.Double>> tref, final double t1, __0$1x10$lang$Rail$1x10$lang$Double$2$2 $dummy) {
             {
                this.tref = ((x10.core.GlobalRef)(tref));
                this.t1 = t1;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$33 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$33> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$33> make($Closure$33.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(datastructures.BVH.$Closure$33 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$33.class + " calling"); } 
            $_obj.left = $deserializer.readObject();
            $_obj.ray = $deserializer.readObject();
            $_obj.tref = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            datastructures.BVH.$Closure$33 $_obj = new datastructures.BVH.$Closure$33((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.left);
            $serializer.write(this.ray);
            $serializer.write(this.tref);
            
        }
        
        // constructor just for allocation
        public $Closure$33(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __2$1x10$lang$Rail$1x10$lang$Double$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 80 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            try {{
                
                //#line 81 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                final double t1 = this.left.intersect$O(((primitives.Ray)(this.ray)));
                
                //#line 82 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                final x10.lang.Place t$860140 = ((x10.lang.Place)((this.tref).home));
                {
                    
                    //#line 82 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                    x10.xrx.Runtime.runAt(((x10.lang.Place)(t$860140)), ((x10.core.fun.VoidFun_0_0)(new datastructures.BVH.$Closure$32(((x10.core.GlobalRef<x10.core.Rail<x10.core.Double>>)(this.tref)), t1, (datastructures.BVH.$Closure$32.__0$1x10$lang$Rail$1x10$lang$Double$2$2) null))), ((x10.xrx.Runtime.Profile)(null)));
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 80 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.xrx.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public primitives.Intersectable left;
        public primitives.Ray ray;
        public x10.core.GlobalRef<x10.core.Rail<x10.core.Double>> tref;
        
        public $Closure$33(final primitives.Intersectable left, final primitives.Ray ray, final x10.core.GlobalRef<x10.core.Rail<x10.core.Double>> tref, __2$1x10$lang$Rail$1x10$lang$Double$2$2 $dummy) {
             {
                this.left = ((primitives.Intersectable)(left));
                this.ray = ((primitives.Ray)(ray));
                this.tref = ((x10.core.GlobalRef)(tref));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$34 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$34> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$34> make($Closure$34.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(datastructures.BVH.$Closure$34 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$34.class + " calling"); } 
            $_obj.left = $deserializer.readObject();
            $_obj.ray = $deserializer.readObject();
            $_obj.tref = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            datastructures.BVH.$Closure$34 $_obj = new datastructures.BVH.$Closure$34((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.left);
            $serializer.write(this.ray);
            $serializer.write(this.tref);
            
        }
        
        // constructor just for allocation
        public $Closure$34(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __2$1x10$lang$Rail$1x10$lang$Double$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 80 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            try {{
                
                //#line 80 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                final x10.lang.Place t$860141 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null).x10$lang$Place$$init$S(((long)(0L)))));
                {
                    
                    //#line 80 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                    x10.xrx.Runtime.runAt(((x10.lang.Place)(t$860141)), ((x10.core.fun.VoidFun_0_0)(new datastructures.BVH.$Closure$33(((primitives.Intersectable)(this.left)), ((primitives.Ray)(this.ray)), ((x10.core.GlobalRef<x10.core.Rail<x10.core.Double>>)(this.tref)), (datastructures.BVH.$Closure$33.__2$1x10$lang$Rail$1x10$lang$Double$2$2) null))), ((x10.xrx.Runtime.Profile)(null)));
                }
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 80 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 80 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public primitives.Intersectable left;
        public primitives.Ray ray;
        public x10.core.GlobalRef<x10.core.Rail<x10.core.Double>> tref;
        
        public $Closure$34(final primitives.Intersectable left, final primitives.Ray ray, final x10.core.GlobalRef<x10.core.Rail<x10.core.Double>> tref, __2$1x10$lang$Rail$1x10$lang$Double$2$2 $dummy) {
             {
                this.left = ((primitives.Intersectable)(left));
                this.ray = ((primitives.Ray)(ray));
                this.tref = ((x10.core.GlobalRef)(tref));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$35 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$35> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$35> make($Closure$35.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(datastructures.BVH.$Closure$35 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$35.class + " calling"); } 
            $_obj.t2 = $deserializer.readDouble();
            $_obj.tref = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            datastructures.BVH.$Closure$35 $_obj = new datastructures.BVH.$Closure$35((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.t2);
            $serializer.write(this.tref);
            
        }
        
        // constructor just for allocation
        public $Closure$35(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Rail$1x10$lang$Double$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 89 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            try {{
                
                //#line 90 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                final x10.core.Rail tval = ((x10.core.Rail)((((x10.core.GlobalRef<x10.core.Rail<x10.core.Double>>)(this.tref))).$apply$G()));
                
                //#line 91 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                ((double[])tval.value)[(int)1L] = this.t2;
            }}catch (java.lang.Throwable __lowerer__var__2__) {
                
                //#line 89 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                int __lowerer__var__3__ = (x10.core.Int.$unbox(x10.xrx.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__2__)))));
            }
        }
        
        public x10.core.GlobalRef<x10.core.Rail<x10.core.Double>> tref;
        public double t2;
        
        public $Closure$35(final x10.core.GlobalRef<x10.core.Rail<x10.core.Double>> tref, final double t2, __0$1x10$lang$Rail$1x10$lang$Double$2$2 $dummy) {
             {
                this.tref = ((x10.core.GlobalRef)(tref));
                this.t2 = t2;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$36 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$36> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$36> make($Closure$36.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(datastructures.BVH.$Closure$36 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$36.class + " calling"); } 
            $_obj.ray = $deserializer.readObject();
            $_obj.right = $deserializer.readObject();
            $_obj.tref = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            datastructures.BVH.$Closure$36 $_obj = new datastructures.BVH.$Closure$36((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.ray);
            $serializer.write(this.right);
            $serializer.write(this.tref);
            
        }
        
        // constructor just for allocation
        public $Closure$36(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __2$1x10$lang$Rail$1x10$lang$Double$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 87 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            try {{
                
                //#line 88 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                final double t2 = this.right.intersect$O(((primitives.Ray)(this.ray)));
                
                //#line 89 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                final x10.lang.Place t$860142 = ((x10.lang.Place)((this.tref).home));
                {
                    
                    //#line 89 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                    x10.xrx.Runtime.runAt(((x10.lang.Place)(t$860142)), ((x10.core.fun.VoidFun_0_0)(new datastructures.BVH.$Closure$35(((x10.core.GlobalRef<x10.core.Rail<x10.core.Double>>)(this.tref)), t2, (datastructures.BVH.$Closure$35.__0$1x10$lang$Rail$1x10$lang$Double$2$2) null))), ((x10.xrx.Runtime.Profile)(null)));
                }
            }}catch (java.lang.Throwable __lowerer__var__2__) {
                
                //#line 87 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                int __lowerer__var__3__ = (x10.core.Int.$unbox(x10.xrx.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__2__)))));
            }
        }
        
        public primitives.Intersectable right;
        public primitives.Ray ray;
        public x10.core.GlobalRef<x10.core.Rail<x10.core.Double>> tref;
        
        public $Closure$36(final primitives.Intersectable right, final primitives.Ray ray, final x10.core.GlobalRef<x10.core.Rail<x10.core.Double>> tref, __2$1x10$lang$Rail$1x10$lang$Double$2$2 $dummy) {
             {
                this.right = ((primitives.Intersectable)(right));
                this.ray = ((primitives.Ray)(ray));
                this.tref = ((x10.core.GlobalRef)(tref));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$37 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$37> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$37> make($Closure$37.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(datastructures.BVH.$Closure$37 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$37.class + " calling"); } 
            $_obj.ray = $deserializer.readObject();
            $_obj.right = $deserializer.readObject();
            $_obj.tref = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            datastructures.BVH.$Closure$37 $_obj = new datastructures.BVH.$Closure$37((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.ray);
            $serializer.write(this.right);
            $serializer.write(this.tref);
            
        }
        
        // constructor just for allocation
        public $Closure$37(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __2$1x10$lang$Rail$1x10$lang$Double$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 87 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
            try {{
                
                //#line 87 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                final x10.lang.Place t$860143 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null).x10$lang$Place$$init$S(((long)(1L)))));
                {
                    
                    //#line 87 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                    x10.xrx.Runtime.runAt(((x10.lang.Place)(t$860143)), ((x10.core.fun.VoidFun_0_0)(new datastructures.BVH.$Closure$36(((primitives.Intersectable)(this.right)), ((primitives.Ray)(this.ray)), ((x10.core.GlobalRef<x10.core.Rail<x10.core.Double>>)(this.tref)), (datastructures.BVH.$Closure$36.__2$1x10$lang$Rail$1x10$lang$Double$2$2) null))), ((x10.xrx.Runtime.Profile)(null)));
                }
            }}catch (java.lang.Error __lowerer__var__2__) {
                
                //#line 87 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                throw __lowerer__var__2__;
            }catch (java.lang.Throwable __lowerer__var__3__) {
                
                //#line 87 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/datastructures/BVH.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
            }
        }
        
        public primitives.Intersectable right;
        public primitives.Ray ray;
        public x10.core.GlobalRef<x10.core.Rail<x10.core.Double>> tref;
        
        public $Closure$37(final primitives.Intersectable right, final primitives.Ray ray, final x10.core.GlobalRef<x10.core.Rail<x10.core.Double>> tref, __2$1x10$lang$Rail$1x10$lang$Double$2$2 $dummy) {
             {
                this.right = ((primitives.Intersectable)(right));
                this.ray = ((primitives.Ray)(ray));
                this.tref = ((x10.core.GlobalRef)(tref));
            }
        }
        
    }
    
    }
    
    