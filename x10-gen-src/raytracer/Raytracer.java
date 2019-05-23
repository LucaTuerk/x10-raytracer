package raytracer;


@x10.runtime.impl.java.X10Generated
public class Raytracer extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Raytracer> $RTT = 
        x10.rtt.NamedType.<Raytracer> make("raytracer.Raytracer",
                                           Raytracer.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(raytracer.Raytracer $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Raytracer.class + " calling"); } 
        $_obj.cam = $deserializer.readObject();
        $_obj.height = $deserializer.readLong();
        $_obj.iBuffer = $deserializer.readObject();
        $_obj.width = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        raytracer.Raytracer $_obj = new raytracer.Raytracer((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.cam);
        $serializer.write(this.height);
        $serializer.write(this.iBuffer);
        $serializer.write(this.width);
        
    }
    
    // constructor just for allocation
    public Raytracer(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
    public long width;
    
    //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
    public long height;
    
    //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
    public datastructures.MinBuffer iBuffer;
    
    //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
    public primitives.Vector cam;
    
    //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
    private static raytracer.Raytracer inst;
    
    
    //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
    public static primitives.Color evaluate__1$1primitives$Intersectable$2__2$1primitives$Light$2(final primitives.Ray ray, final x10.core.Rail<primitives.Intersectable> objects, final x10.core.Rail<primitives.Light> lights) {
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        primitives.Color c = new primitives.Color((java.lang.System[]) null).primitives$Color$$init$S(((long)(200L)), ((long)(200L)), ((long)(200L)), ((long)(0L)));
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final raytracer.Raytracer t$41810 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final datastructures.MinBuffer t$41811 = ((datastructures.MinBuffer)(t$41810.iBuffer));
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        t$41811.init();
        
        //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final long i$41793min$41965 = 0L;
        
        //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final long t$41966 = ((x10.core.Rail<primitives.Intersectable>)objects).size;
        
        //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final long i$41793max$41967 = ((t$41966) - (((long)(1L))));
        
        //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        long i$41962 = i$41793min$41965;
        {
            
            //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            final primitives.Intersectable[] objects$value$42016 = ((primitives.Intersectable[])objects.value);
            
            //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            for (;
                 true;
                 ) {
                
                //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$41963 = i$41962;
                
                //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final boolean t$41964 = ((t$41963) <= (((long)(i$41793max$41967))));
                
                //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                if (!(t$41964)) {
                    
                    //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                    break;
                }
                
                //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long j$41959 = i$41962;
                
                //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final primitives.Intersectable t$41954 = ((primitives.Intersectable)objects$value$42016[(int)j$41959]);
                
                //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                double t$41955 = t$41954.intersect$O(((primitives.Ray)(ray)));
                
                //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final raytracer.Raytracer t$41956 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
                
                //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final datastructures.MinBuffer t$41957 = ((datastructures.MinBuffer)(t$41956.iBuffer));
                
                //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final double t$41958 = t$41955;
                
                //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                t$41957.insert((long)(j$41959), (double)(t$41958));
                
                //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$41960 = i$41962;
                
                //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$41961 = ((t$41960) + (((long)(1L))));
                
                //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                i$41962 = t$41961;
            }
        }
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final raytracer.Raytracer t$41822 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final datastructures.MinBuffer t$41823 = ((datastructures.MinBuffer)(t$41822.iBuffer));
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final boolean t$41824 = t$41823.isEmpty$O();
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final boolean t$41836 = !(t$41824);
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        if (t$41836) {
            
            //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            final raytracer.Raytracer t$41825 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
            
            //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            final datastructures.MinBuffer t$41826 = ((datastructures.MinBuffer)(t$41825.iBuffer));
            
            //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            long min = t$41826.getIndex$O();
            
            //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            final raytracer.Raytracer t$41827 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
            
            //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            final datastructures.MinBuffer t$41828 = ((datastructures.MinBuffer)(t$41827.iBuffer));
            
            //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            double minVal = t$41828.getValue$O();
            
            //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            final long t$41829 = min;
            
            //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            final primitives.Intersectable t$41830 = ((primitives.Intersectable[])objects.value)[(int)t$41829];
            
            //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            final shaders.Material t$41832 = ((shaders.Material)(t$41830.mat));
            
            //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            final long t$41831 = min;
            
            //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            final primitives.Intersectable t$41833 = ((primitives.Intersectable[])objects.value)[(int)t$41831];
            
            //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            final double t$41834 = minVal;
            
            //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            final primitives.Color t$41835 = t$41832.evaluate__3$1primitives$Light$2__4$1primitives$Intersectable$2(((primitives.Intersectable)(t$41833)), ((primitives.Ray)(ray)), (double)(t$41834), ((x10.core.Rail)(lights)), ((x10.core.Rail)(objects)));
            
            //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            c = ((primitives.Color)(t$41835));
        }
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Color t$41837 = ((primitives.Color)(c));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        return t$41837;
    }
    
    
    //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
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
            Raytracer.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> args) {
        
        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final long t$41838 = ((x10.core.Rail<java.lang.String>)args).size;
        
        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final boolean t$41840 = ((t$41838) < (((long)(2L))));
        
        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        if (t$41840) {
            
            //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            final x10.io.Printer t$41839 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            t$41839.println(((java.lang.Object)("Please spezify width and height")));
            
            //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            return;
        }
        
        //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final raytracer.Raytracer t$41842 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
        
        //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final java.lang.String t$41841 = ((java.lang.String[])args.value)[(int)0L];
        
        //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final long t$41843 = java.lang.Long.parseLong(t$41841);
        
        //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        t$41842.width = t$41843;
        
        //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final raytracer.Raytracer t$41845 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
        
        //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final java.lang.String t$41844 = ((java.lang.String[])args.value)[(int)1L];
        
        //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final long t$41846 = java.lang.Long.parseLong(t$41844);
        
        //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        t$41845.height = t$41846;
        
        //#line 43 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final raytracer.Raytracer t$41847 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
        
        //#line 43 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final long t$41849 = t$41847.width;
        
        //#line 43 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final raytracer.Raytracer t$41848 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
        
        //#line 43 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final long t$41850 = t$41848.height;
        
        //#line 43 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final long t$41851 = ((t$41849) * (((long)(t$41850))));
        
        //#line 43 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final long t$41852 = ((t$41851) * (((long)(4L))));
        
        //#line 43 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final x10.core.Rail image = ((x10.core.Rail)(new x10.core.Rail<x10.core.UByte>(x10.rtt.Types.UBYTE, t$41852)));
        
        //#line 46 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        x10.core.Rail objects = new x10.core.Rail<primitives.Intersectable>(primitives.Intersectable.$RTT, ((long)(4L)));
        
        //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        x10.core.Rail lights = new x10.core.Rail<primitives.Light>(primitives.Light.$RTT, ((long)(2L)));
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final x10.core.Rail t$41853 = ((x10.core.Rail)(objects));
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final long t$41854 = ((x10.core.Rail<primitives.Intersectable>)t$41853).size;
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        x10.core.Rail tBuffer = new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, t$41854);
        
        //#line 50 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Color t$41855 = ((primitives.Color)(new primitives.Color((java.lang.System[]) null).primitives$Color$$init$S(((long)(255L)), ((long)(50L)), ((long)(50L)), ((long)(255L)))));
        
        //#line 50 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        shaders.Material red = ((shaders.Material)(new shaders.SemiFlat((java.lang.System[]) null).shaders$SemiFlat$$init$S(((primitives.Color)(t$41855)), ((double)(0.1)), ((double)(0.95)))));
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Color t$41856 = ((primitives.Color)(new primitives.Color((java.lang.System[]) null).primitives$Color$$init$S(((long)(50L)), ((long)(255L)), ((long)(50L)), ((long)(255L)))));
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        shaders.Material green = ((shaders.Material)(new shaders.SemiFlat((java.lang.System[]) null).shaders$SemiFlat$$init$S(((primitives.Color)(t$41856)), ((double)(0.1)), ((double)(0.95)))));
        
        //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Color t$41857 = ((primitives.Color)(new primitives.Color((java.lang.System[]) null).primitives$Color$$init$S(((long)(50L)), ((long)(50L)), ((long)(255L)), ((long)(255L)))));
        
        //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        shaders.Material blue = ((shaders.Material)(new shaders.SemiFlat((java.lang.System[]) null).shaders$SemiFlat$$init$S(((primitives.Color)(t$41857)), ((double)(0.1)), ((double)(0.95)))));
        
        //#line 53 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Color t$41858 = ((primitives.Color)(new primitives.Color((java.lang.System[]) null).primitives$Color$$init$S(((long)(0L)), ((long)(0L)), ((long)(0L)), ((long)(255L)))));
        
        //#line 53 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        shaders.Material refl = ((shaders.Material)(new shaders.Reflective((java.lang.System[]) null).shaders$Reflective$$init$S(((primitives.Color)(t$41858)), ((double)(0.5)))));
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        shaders.Material refr = ((shaders.Material)(new shaders.Refractive((java.lang.System[]) null).shaders$Refractive$$init$S(((double)(1.2)), ((double)(1.0)))));
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final shaders.Material t$41859 = ((shaders.Material)(refl));
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final shaders.Material t$41860 = ((shaders.Material)(refr));
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        shaders.Material ref = ((shaders.Material)(new shaders.MixMaterial((java.lang.System[]) null).shaders$MixMaterial$$init$S(t$41859, t$41860, ((double)(0.7)))));
        
        //#line 57 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final x10.core.Rail t$41865 = ((x10.core.Rail)(objects));
        
        //#line 57 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Vector t$41863 = ((primitives.Vector)(new primitives.Vector((java.lang.System[]) null).primitives$Vector$$init$S(((double)(0.0)), ((double)(0.0)), ((double)(8.0)))));
        
        //#line 57 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final shaders.Material t$41861 = ((shaders.Material)(red));
        
        //#line 57 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final shaders.Material t$41862 = ((shaders.Material)(ref));
        
        //#line 57 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final shaders.MixMaterial t$41864 = ((shaders.MixMaterial)(new shaders.MixMaterial((java.lang.System[]) null).shaders$MixMaterial$$init$S(t$41861, t$41862, ((double)(0.7)))));
        
        //#line 57 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Sphere t$41866 = ((primitives.Sphere)(new primitives.Sphere((java.lang.System[]) null).primitives$Sphere$$init$S(((primitives.Vector)(t$41863)), ((double)(1.0)), ((shaders.Material)(t$41864)))));
        
        //#line 57 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        ((primitives.Intersectable[])t$41865.value)[(int)0L] = t$41866;
        
        //#line 58 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final x10.core.Rail t$41871 = ((x10.core.Rail)(objects));
        
        //#line 58 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Vector t$41869 = ((primitives.Vector)(new primitives.Vector((java.lang.System[]) null).primitives$Vector$$init$S(((double)(1.0)), ((double)(2.0)), ((double)(9.0)))));
        
        //#line 58 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final shaders.Material t$41867 = ((shaders.Material)(red));
        
        //#line 58 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final shaders.Material t$41868 = ((shaders.Material)(ref));
        
        //#line 58 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final shaders.MixMaterial t$41870 = ((shaders.MixMaterial)(new shaders.MixMaterial((java.lang.System[]) null).shaders$MixMaterial$$init$S(t$41867, t$41868, ((double)(0.7)))));
        
        //#line 58 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Sphere t$41872 = ((primitives.Sphere)(new primitives.Sphere((java.lang.System[]) null).primitives$Sphere$$init$S(((primitives.Vector)(t$41869)), ((double)(0.75)), ((shaders.Material)(t$41870)))));
        
        //#line 58 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        ((primitives.Intersectable[])t$41871.value)[(int)1L] = t$41872;
        
        //#line 59 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final x10.core.Rail t$41879 = ((x10.core.Rail)(objects));
        
        //#line 59 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final double t$41873 = -1.0;
        
        //#line 59 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final double t$41874 = -1.0;
        
        //#line 59 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Vector t$41877 = ((primitives.Vector)(new primitives.Vector((java.lang.System[]) null).primitives$Vector$$init$S(t$41873, t$41874, ((double)(6.0)))));
        
        //#line 59 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final shaders.Material t$41875 = ((shaders.Material)(green));
        
        //#line 59 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final shaders.Material t$41876 = ((shaders.Material)(ref));
        
        //#line 59 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final shaders.MixMaterial t$41878 = ((shaders.MixMaterial)(new shaders.MixMaterial((java.lang.System[]) null).shaders$MixMaterial$$init$S(t$41875, t$41876, ((double)(0.7)))));
        
        //#line 59 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Sphere t$41880 = ((primitives.Sphere)(new primitives.Sphere((java.lang.System[]) null).primitives$Sphere$$init$S(((primitives.Vector)(t$41877)), ((double)(1.0)), ((shaders.Material)(t$41878)))));
        
        //#line 59 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        ((primitives.Intersectable[])t$41879.value)[(int)2L] = t$41880;
        
        //#line 60 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final x10.core.Rail t$41886 = ((x10.core.Rail)(objects));
        
        //#line 60 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final double t$41881 = -1.0;
        
        //#line 60 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Vector t$41884 = ((primitives.Vector)(new primitives.Vector((java.lang.System[]) null).primitives$Vector$$init$S(t$41881, ((double)(2.0)), ((double)(8.0)))));
        
        //#line 60 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final shaders.Material t$41882 = ((shaders.Material)(blue));
        
        //#line 60 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final shaders.Material t$41883 = ((shaders.Material)(ref));
        
        //#line 60 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final shaders.MixMaterial t$41885 = ((shaders.MixMaterial)(new shaders.MixMaterial((java.lang.System[]) null).shaders$MixMaterial$$init$S(t$41882, t$41883, ((double)(0.7)))));
        
        //#line 60 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Sphere t$41887 = ((primitives.Sphere)(new primitives.Sphere((java.lang.System[]) null).primitives$Sphere$$init$S(((primitives.Vector)(t$41884)), ((double)(0.5)), ((shaders.Material)(t$41885)))));
        
        //#line 60 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        ((primitives.Intersectable[])t$41886.value)[(int)3L] = t$41887;
        
        //#line 61 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final x10.core.Rail t$41890 = ((x10.core.Rail)(lights));
        
        //#line 61 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Vector t$41888 = ((primitives.Vector)(new primitives.Vector((java.lang.System[]) null).primitives$Vector$$init$S(((double)(1000.0)), ((double)(10000.0)), ((double)(5.0)))));
        
        //#line 61 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Color t$41889 = ((primitives.Color)(new primitives.Color((java.lang.System[]) null).primitives$Color$$init$S(((long)(255L)), ((long)(255L)), ((long)(255L)), ((long)(255L)))));
        
        //#line 61 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Light t$41891 = ((primitives.Light)(new primitives.Light((java.lang.System[]) null).primitives$Light$$init$S(((primitives.Vector)(t$41888)), ((primitives.Color)(t$41889)), ((double)(0.75)))));
        
        //#line 61 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        ((primitives.Light[])t$41890.value)[(int)0L] = t$41891;
        
        //#line 62 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final x10.core.Rail t$41894 = ((x10.core.Rail)(lights));
        
        //#line 62 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Vector t$41892 = ((primitives.Vector)(new primitives.Vector((java.lang.System[]) null).primitives$Vector$$init$S(((double)(2.0)), ((double)(10.0)), ((double)(1.0)))));
        
        //#line 62 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Color t$41893 = ((primitives.Color)(new primitives.Color((java.lang.System[]) null).primitives$Color$$init$S(((long)(255L)), ((long)(255L)), ((long)(255L)), ((long)(255L)))));
        
        //#line 62 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Light t$41895 = ((primitives.Light)(new primitives.Light((java.lang.System[]) null).primitives$Light$$init$S(((primitives.Vector)(t$41892)), ((primitives.Color)(t$41893)), ((double)(0.5)))));
        
        //#line 62 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        ((primitives.Light[])t$41894.value)[(int)1L] = t$41895;
        
        //#line 64 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        long i = 0L;
        {
            
            //#line 65 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            final byte[] image$value$42017 = ((byte[])image.value);
            
            //#line 65 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            while (true) {
                
                //#line 65 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$41897 = i;
                
                //#line 65 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$41896 = ((x10.core.Rail<x10.core.UByte>)image).size;
                
                //#line 65 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$41898 = ((t$41896) - (((long)(1L))));
                
                //#line 65 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final boolean t$41942 = ((t$41897) < (((long)(t$41898))));
                
                //#line 65 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                if (!(t$41942)) {
                    
                    //#line 65 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                    break;
                }
                
                //#line 66 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$41968 = i;
                
                //#line 66 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$41969 = ((t$41968) / (((long)(4L))));
                
                //#line 66 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final raytracer.Raytracer t$41970 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
                
                //#line 66 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$41971 = t$41970.width;
                
                //#line 66 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final x10.core.Rail pos$41972 = raytracer.Utilities.idx((long)(t$41969), (long)(t$41971));
                
                //#line 68 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$41973 = ((long[])pos$41972.value)[(int)0L];
                
                //#line 68 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final double t$41974 = ((double)(long)(((long)(t$41973))));
                
                //#line 68 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final raytracer.Raytracer t$41975 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
                
                //#line 68 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$41976 = t$41975.width;
                
                //#line 68 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final double t$41977 = ((double)(long)(((long)(t$41976))));
                
                //#line 68 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final double t$41978 = ((t$41974) / (((double)(t$41977))));
                
                //#line 68 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final double t$41979 = -1.0;
                
                //#line 68 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final double t$41980 = raytracer.Utilities.interpolate$O((double)(t$41978), (double)(t$41979), (double)(1.0));
                
                //#line 69 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$41981 = ((long[])pos$41972.value)[(int)1L];
                
                //#line 69 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final double t$41982 = ((double)(long)(((long)(t$41981))));
                
                //#line 69 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final raytracer.Raytracer t$41983 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
                
                //#line 69 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$41984 = t$41983.height;
                
                //#line 69 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final double t$41985 = ((double)(long)(((long)(t$41984))));
                
                //#line 69 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final double t$41986 = ((t$41982) / (((double)(t$41985))));
                
                //#line 69 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final double t$41987 = -1.0;
                
                //#line 69 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final double t$41988 = raytracer.Utilities.interpolate$O((double)(t$41986), (double)(t$41987), (double)(1.0));
                
                //#line 67 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final primitives.Vector t$41989 = ((primitives.Vector)(new primitives.Vector((java.lang.System[]) null).primitives$Vector$$init$S(t$41980, t$41988, ((double)(1.0)))));
                
                //#line 67 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                primitives.Vector p$41990 = primitives.Vector.normalize(((primitives.Vector)(t$41989)));
                
                //#line 72 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final raytracer.Raytracer t$41991 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
                
                //#line 72 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final primitives.Vector t$41992 = ((primitives.Vector)(t$41991.cam));
                
                //#line 72 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final primitives.Vector t$41993 = ((primitives.Vector)(p$41990));
                
                //#line 72 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final primitives.Ray ray$41994 = new primitives.Ray((java.lang.System[]) null).primitives$Ray$$init$S(((primitives.Vector)(t$41992)), t$41993);
                
                //#line 74 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final x10.core.Rail t$41995 = ((x10.core.Rail)(objects));
                
                //#line 74 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final x10.core.Rail t$41996 = ((x10.core.Rail)(lights));
                
                //#line 74 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                primitives.Color c$41997 = raytracer.Raytracer.evaluate__1$1primitives$Intersectable$2__2$1primitives$Light$2(((primitives.Ray)(ray$41994)), ((x10.core.Rail)(t$41995)), ((x10.core.Rail)(t$41996)));
                
                //#line 75 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$41998 = i;
                
                //#line 75 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final primitives.Color t$41999 = ((primitives.Color)(c$41997));
                
                //#line 75 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final byte t$42000 = t$41999.r;
                
                //#line 75 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                image$value$42017[(int)t$41998]=t$42000;
                
                //#line 76 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$42001 = i;
                
                //#line 76 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$42002 = ((t$42001) + (((long)(1L))));
                
                //#line 76 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final primitives.Color t$42003 = ((primitives.Color)(c$41997));
                
                //#line 76 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final byte t$42004 = t$42003.g;
                
                //#line 76 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                image$value$42017[(int)t$42002]=t$42004;
                
                //#line 77 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$42005 = i;
                
                //#line 77 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$42006 = ((t$42005) + (((long)(2L))));
                
                //#line 77 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final primitives.Color t$42007 = ((primitives.Color)(c$41997));
                
                //#line 77 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final byte t$42008 = t$42007.b;
                
                //#line 77 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                image$value$42017[(int)t$42006]=t$42008;
                
                //#line 78 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$42009 = i;
                
                //#line 78 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$42010 = ((t$42009) + (((long)(3L))));
                
                //#line 78 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final primitives.Color t$42011 = ((primitives.Color)(c$41997));
                
                //#line 78 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final byte t$42012 = t$42011.a;
                
                //#line 78 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                image$value$42017[(int)t$42010]=t$42012;
                
                //#line 79 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$42013 = i;
                
                //#line 79 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                final long t$42014 = ((t$42013) + (((long)(4L))));
                
                //#line 79 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
                i = t$42014;
            }
        }
        
        //#line 83 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        java.io.File file = new java.io.File(((java.lang.String)("./a1bc3.png")));
        
        //#line 84 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final raytracer.Raytracer t$41943 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
        
        //#line 84 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final long t$41944 = t$41943.width;
        
        //#line 84 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final int t$41947 = ((int)(long)(((long)(t$41944))));
        
        //#line 84 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final raytracer.Raytracer t$41945 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
        
        //#line 84 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final long t$41946 = t$41945.height;
        
        //#line 84 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final int t$41948 = ((int)(long)(((long)(t$41946))));
        
        //#line 84 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final java.io.File t$41949 = ((java.io.File)(file));
        
        //#line 84 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        raytracer.Utilities.writePng__0$1x10$lang$UByte$2(((x10.core.Rail)(image)), (int)(t$41947), (int)(t$41948), ((java.io.File)(t$41949)));
    }
    
    
    //#line 87 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
    public static datastructures.MinBuffer getBuffer() {
        
        //#line 88 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final raytracer.Raytracer t$41950 = ((raytracer.Raytracer)(raytracer.Raytracer.get$inst()));
        
        //#line 88 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final datastructures.MinBuffer t$41951 = ((datastructures.MinBuffer)(t$41950.iBuffer));
        
        //#line 88 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        return t$41951;
    }
    
    
    //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
    final public raytracer.Raytracer raytracer$Raytracer$$this$raytracer$Raytracer() {
        
        //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        return raytracer.Raytracer.this;
    }
    
    
    //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
    // creation method for java code (1-phase java constructor)
    public Raytracer() {
        this((java.lang.System[]) null);
        raytracer$Raytracer$$init$S();
    }
    
    // constructor for non-virtual call
    final public raytracer.Raytracer raytracer$Raytracer$$init$S() {
         {
            
            //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            
            
            //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
            this.__fieldInitializers_raytracer_Raytracer();
        }
        return this;
    }
    
    
    
    //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
    final public void __fieldInitializers_raytracer_Raytracer() {
        
        //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        this.width = 0L;
        
        //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        this.height = 0L;
        
        //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final datastructures.MinBuffer t$41952 = ((datastructures.MinBuffer)(new datastructures.MinBuffer((java.lang.System[]) null).datastructures$MinBuffer$$init$S()));
        
        //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        this.iBuffer = t$41952;
        
        //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        final primitives.Vector t$41953 = ((primitives.Vector)(primitives.Vector.get$zero()));
        
        //#line 8 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Raytracer.x10"
        this.cam = t$41953;
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$inst = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$inst;
    
    public static raytracer.Raytracer get$inst() {
        if (((int) raytracer.Raytracer.initStatus$inst.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return raytracer.Raytracer.inst;
        }
        if (((int) raytracer.Raytracer.initStatus$inst.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: raytracer.Raytracer.inst")));
            }
            throw raytracer.Raytracer.exception$inst;
        }
        if (raytracer.Raytracer.initStatus$inst.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                raytracer.Raytracer.inst = new raytracer.Raytracer((java.lang.System[]) null).raytracer$Raytracer$$init$S();
            }}catch (java.lang.Throwable exc$42015) {
                raytracer.Raytracer.exception$inst = new x10.lang.ExceptionInInitializer(exc$42015);
                raytracer.Raytracer.initStatus$inst.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw raytracer.Raytracer.exception$inst;
            }
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Doing static initialization for field: raytracer.Raytracer.inst")));
            }
            raytracer.Raytracer.initStatus$inst.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (raytracer.Raytracer.initStatus$inst.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (raytracer.Raytracer.initStatus$inst.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) raytracer.Raytracer.initStatus$inst.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                        x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: raytracer.Raytracer.inst")));
                    }
                    throw raytracer.Raytracer.exception$inst;
                }
            }
        }
        return raytracer.Raytracer.inst;
    }
}

