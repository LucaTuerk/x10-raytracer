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
        final primitives.Color t$1242053 = ((primitives.Color)(this.color));
        
        //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        primitives.Color out = t$1242053.copy();
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        final primitives.Color t$1242054 = ((primitives.Color)(out));
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        final double t$1242055 = this.ambient;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        t$1242054.scalarKeepAlpha((double)(t$1242055));
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        final x10.core.Rail rail$1242139 = ((x10.core.Rail)(lights));
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        final long size$1242141 = ((x10.core.Rail<primitives.Light>)rail$1242139).size;
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        long idx$1242135 = 0L;
        {
            
            //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
            final primitives.Intersectable[] objects$value$1242150 = ((primitives.Intersectable[])objects.value);
            
            //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
            final primitives.Light[] rail$1242139$value$1242151 = ((primitives.Light[])rail$1242139.value);
            
            //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
            for (;
                 true;
                 ) {
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final long t$1242136 = idx$1242135;
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final boolean t$1242137 = ((t$1242136) < (((long)(size$1242141))));
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                if (!(t$1242137)) {
                    
                    //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    break;
                }
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final long t$1242127 = idx$1242135;
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Light light$1242128 = ((primitives.Light)rail$1242139$value$1242151[(int)t$1242127]);
                
                //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$1242103 = ((primitives.Vector)(ray.dir));
                
                //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector v$1242104 = primitives.Vector.scalar((double)(t), ((primitives.Vector)(t$1242103)));
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$1242105 = ((primitives.Vector)(ray.origin));
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                primitives.Vector p$1242106 = primitives.Vector.add(((primitives.Vector)(t$1242105)), ((primitives.Vector)(v$1242104)));
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                primitives.Vector n$1242107 = me.normal(((primitives.Ray)(ray)), (double)(t));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$1242108 = ((primitives.Vector)(p$1242106));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$1242109 = ((primitives.Vector)(n$1242107));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$1242110 = primitives.Vector.scalar((double)(1.0E-6), ((primitives.Vector)(t$1242109)));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$1242111 = primitives.Vector.add(((primitives.Vector)(t$1242108)), ((primitives.Vector)(t$1242110)));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                p$1242106 = ((primitives.Vector)(t$1242111));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$1242112 = ((primitives.Vector)(p$1242106));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$1242113 = ((primitives.Vector)(light$1242128.pos));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$1242114 = primitives.Vector.sub(((primitives.Vector)(t$1242112)), ((primitives.Vector)(t$1242113)));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector u$1242115 = primitives.Vector.normalize(((primitives.Vector)(t$1242114)));
                
                //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Vector t$1242116 = ((primitives.Vector)(p$1242106));
                
                //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final primitives.Ray lightRay$1242117 = new primitives.Ray((java.lang.System[]) null).primitives$Ray$$init$S(t$1242116, ((primitives.Vector)(u$1242115)));
                
                //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final datastructures.MinBuffer t$1242118 = raytracer.Raytracer.getBuffer();
                
                //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                t$1242118.init();
                
                //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final long i$1241897min$1242100 = 0L;
                
                //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final long t$1242101 = ((x10.core.Rail<primitives.Intersectable>)objects).size;
                
                //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final long i$1241897max$1242102 = ((t$1242101) - (((long)(1L))));
                
                //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                long i$1242097 = i$1241897min$1242100;
                {
                    
                    //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final long t$1242098 = i$1242097;
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final boolean t$1242099 = ((t$1242098) <= (((long)(i$1241897max$1242102))));
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        if (!(t$1242099)) {
                            
                            //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                            break;
                        }
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final long j$1242094 = i$1242097;
                        
                        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final primitives.Intersectable t$1242090 = ((primitives.Intersectable)objects$value$1242150[(int)j$1242094]);
                        
                        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        double t_prime$1242091 = t$1242090.intersect$O(((primitives.Ray)(lightRay$1242117)));
                        
                        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final datastructures.MinBuffer t$1242092 = raytracer.Raytracer.getBuffer();
                        
                        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final double t$1242093 = t_prime$1242091;
                        
                        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        t$1242092.insert((long)(j$1242094), (double)(t$1242093));
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final long t$1242095 = i$1242097;
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        final long t$1242096 = ((t$1242095) + (((long)(1L))));
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                        i$1242097 = t$1242096;
                    }
                }
                
                //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final datastructures.MinBuffer t$1242119 = raytracer.Raytracer.getBuffer();
                
                //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final boolean t$1242120 = t$1242119.isEmpty$O();
                
                //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                if (t$1242120) {
                    
                    //#line 40 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    final primitives.Color t$1242121 = ((primitives.Color)(light$1242128.color));
                    
                    //#line 40 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    primitives.Color c$1242122 = t$1242121.copy();
                    
                    //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    final primitives.Color t$1242123 = ((primitives.Color)(c$1242122));
                    
                    //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    final double t$1242124 = light$1242128.intensity;
                    
                    //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    t$1242123.scalarKeepAlpha((double)(t$1242124));
                    
                    //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    final primitives.Color t$1242125 = ((primitives.Color)(out));
                    
                    //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    final primitives.Color t$1242126 = ((primitives.Color)(c$1242122));
                    
                    //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                    t$1242125.add(((primitives.Color)(t$1242126)));
                }
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final long t$1242133 = idx$1242135;
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                final long t$1242134 = ((t$1242133) + (((long)(1L))));
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
                idx$1242135 = t$1242134;
            }
        }
        
        //#line 46 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        final primitives.Color t$1242089 = ((primitives.Color)(out));
        
        //#line 46 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Flat.x10"
        return t$1242089;
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

