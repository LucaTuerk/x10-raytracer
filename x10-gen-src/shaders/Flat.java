package shaders;


@x10.runtime.impl.java.X10Generated
public class Flat extends shaders.Material implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Flat> $RTT = 
        x10.rtt.NamedType.<Flat> make("shaders.Flat",
                                      Flat.class,
                                      new x10.rtt.Type[] {
                                          shaders.Material.$RTT
                                      });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(shaders.Flat $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Flat.class + " calling"); } 
        shaders.Material.$_deserialize_body($_obj, $deserializer);
        $_obj.ambient = $deserializer.readDouble();
        $_obj.color = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        shaders.Flat $_obj = new shaders.Flat((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.ambient);
        $serializer.write(this.color);
        
    }
    
    // constructor just for allocation
    public Flat(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
    public primitives.Color color;
    
    //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
    public double ambient;
    
    
    //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
    // creation method for java code (1-phase java constructor)
    public Flat(final primitives.Color color, final double amb) {
        this((java.lang.System[]) null);
        shaders$Flat$$init$S(color, amb);
    }
    
    // constructor for non-virtual call
    final public shaders.Flat shaders$Flat$$init$S(final primitives.Color color, final double amb) {
         {
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
            /*super.*/shaders$Material$$init$S();
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
            
            
            //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
            this.__fieldInitializers_shaders_Flat();
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
            this.color = ((primitives.Color)(color));
            
            //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
            this.ambient = amb;
        }
        return this;
    }
    
    
    
    //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
    public primitives.Color evaluate__3$1primitives$Light$2__4$1primitives$Intersectable$2(final primitives.Intersectable me, final primitives.Ray ray, final double t, final x10.core.Rail lights, final x10.core.Rail objects) {
        
        //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        final primitives.Color t$42070 = ((primitives.Color)(this.color));
        
        //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        primitives.Color out = t$42070.copy();
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        final primitives.Color t$42071 = ((primitives.Color)(out));
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        final double t$42072 = this.ambient;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        t$42071.scalarKeepAlpha((double)(t$42072));
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        final x10.core.Rail rail$42151 = ((x10.core.Rail)(lights));
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        final long size$42152 = ((x10.core.Rail<primitives.Light>)rail$42151).size;
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        long idx$42148 = 0L;
        {
            
            //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
            final primitives.Intersectable[] objects$value$42153 = ((primitives.Intersectable[])objects.value);
            
            //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
            final primitives.Light[] rail$42151$value$42154 = ((primitives.Light[])rail$42151.value);
            
            //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
            for (;
                 true;
                 ) {
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final long t$42149 = idx$42148;
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final boolean t$42150 = ((t$42149) < (((long)(size$42152))));
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                if (!(t$42150)) {
                    
                    //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    break;
                }
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final long t$42144 = idx$42148;
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Light light$42145 = ((primitives.Light)rail$42151$value$42154[(int)t$42144]);
                
                //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$42120 = ((primitives.Vector)(ray.dir));
                
                //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector v$42121 = primitives.Vector.scalar((double)(t), ((primitives.Vector)(t$42120)));
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$42122 = ((primitives.Vector)(ray.origin));
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                primitives.Vector p$42123 = primitives.Vector.add(((primitives.Vector)(t$42122)), ((primitives.Vector)(v$42121)));
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                primitives.Vector n$42124 = me.normal(((primitives.Ray)(ray)), (double)(t));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$42125 = ((primitives.Vector)(p$42123));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$42126 = ((primitives.Vector)(n$42124));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$42127 = primitives.Vector.scalar((double)(1.0E-6), ((primitives.Vector)(t$42126)));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$42128 = primitives.Vector.add(((primitives.Vector)(t$42125)), ((primitives.Vector)(t$42127)));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                p$42123 = ((primitives.Vector)(t$42128));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$42129 = ((primitives.Vector)(p$42123));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$42130 = ((primitives.Vector)(light$42145.pos));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$42131 = primitives.Vector.sub(((primitives.Vector)(t$42129)), ((primitives.Vector)(t$42130)));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector u$42132 = primitives.Vector.normalize(((primitives.Vector)(t$42131)));
                
                //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$42133 = ((primitives.Vector)(p$42123));
                
                //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Ray lightRay$42134 = new primitives.Ray((java.lang.System[]) null).primitives$Ray$$init$S(t$42133, ((primitives.Vector)(u$42132)));
                
                //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final datastructures.MinBuffer t$42135 = raytracer.Raytracer.getBuffer();
                
                //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                t$42135.init();
                
                //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final long i$42028min$42117 = 0L;
                
                //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final long t$42118 = ((x10.core.Rail<primitives.Intersectable>)objects).size;
                
                //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final long i$42028max$42119 = ((t$42118) - (((long)(1L))));
                
                //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                long i$42114 = i$42028min$42117;
                {
                    
                    //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final long t$42115 = i$42114;
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final boolean t$42116 = ((t$42115) <= (((long)(i$42028max$42119))));
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        if (!(t$42116)) {
                            
                            //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                            break;
                        }
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final long j$42111 = i$42114;
                        
                        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final primitives.Intersectable t$42107 = ((primitives.Intersectable)objects$value$42153[(int)j$42111]);
                        
                        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        double t_prime$42108 = t$42107.intersect$O(((primitives.Ray)(lightRay$42134)));
                        
                        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final datastructures.MinBuffer t$42109 = raytracer.Raytracer.getBuffer();
                        
                        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final double t$42110 = t_prime$42108;
                        
                        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        t$42109.insert((long)(j$42111), (double)(t$42110));
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final long t$42112 = i$42114;
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final long t$42113 = ((t$42112) + (((long)(1L))));
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        i$42114 = t$42113;
                    }
                }
                
                //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final datastructures.MinBuffer t$42136 = raytracer.Raytracer.getBuffer();
                
                //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final boolean t$42137 = t$42136.isEmpty$O();
                
                //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                if (t$42137) {
                    
                    //#line 40 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    final primitives.Color t$42138 = ((primitives.Color)(light$42145.color));
                    
                    //#line 40 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    primitives.Color c$42139 = t$42138.copy();
                    
                    //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    final primitives.Color t$42140 = ((primitives.Color)(c$42139));
                    
                    //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    final double t$42141 = light$42145.intensity;
                    
                    //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    t$42140.scalarKeepAlpha((double)(t$42141));
                    
                    //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    final primitives.Color t$42142 = ((primitives.Color)(out));
                    
                    //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    final primitives.Color t$42143 = ((primitives.Color)(c$42139));
                    
                    //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    t$42142.add(((primitives.Color)(t$42143)));
                }
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final long t$42146 = idx$42148;
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final long t$42147 = ((t$42146) + (((long)(1L))));
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                idx$42148 = t$42147;
            }
        }
        
        //#line 46 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        final primitives.Color t$42106 = ((primitives.Color)(out));
        
        //#line 46 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        return t$42106;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
    final public shaders.Flat shaders$Flat$$this$shaders$Flat() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        return shaders.Flat.this;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
    final public void __fieldInitializers_shaders_Flat() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        this.color = null;
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        this.ambient = 0.0;
    }
}

