package shaders;


@x10.runtime.impl.java.X10Generated
public class Phong extends shaders.Material implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Phong> $RTT = 
        x10.rtt.NamedType.<Phong> make("shaders.Phong",
                                       Phong.class,
                                       new x10.rtt.Type[] {
                                           shaders.Material.$RTT
                                       });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(shaders.Phong $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Phong.class + " calling"); } 
        shaders.Material.$_deserialize_body($_obj, $deserializer);
        $_obj.ambient = $deserializer.readDouble();
        $_obj.color = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        shaders.Phong $_obj = new shaders.Phong((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.ambient);
        $serializer.write(this.color);
        
    }
    
    // constructor just for allocation
    public Phong(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
    public primitives.Color color;
    
    //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
    public double ambient;
    
    
    //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
    // creation method for java code (1-phase java constructor)
    public Phong(final primitives.Color color, final double amb) {
        this((java.lang.System[]) null);
        shaders$Phong$$init$S(color, amb);
    }
    
    // constructor for non-virtual call
    final public shaders.Phong shaders$Phong$$init$S(final primitives.Color color, final double amb) {
         {
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            /*super.*/shaders$Material$$init$S();
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            
            
            //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            this.__fieldInitializers_shaders_Phong();
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            this.color = ((primitives.Color)(color));
            
            //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            this.ambient = amb;
        }
        return this;
    }
    
    
    
    //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
    public primitives.Color evaluate__3$1primitives$Light$2__4$1primitives$Intersectable$2(final primitives.Intersectable me, final primitives.Ray ray, final double t, final x10.core.Rail lights, final x10.core.Rail objects) {
        
        //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        final primitives.Color t$42249 = ((primitives.Color)(this.color));
        
        //#line 21 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        primitives.Color out = t$42249.copy();
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        final primitives.Color t$42250 = ((primitives.Color)(out));
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        final double t$42251 = this.ambient;
        
        //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        t$42250.scalarKeepAlpha((double)(t$42251));
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        final x10.core.Rail rail$42391 = ((x10.core.Rail)(lights));
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        final long size$42392 = ((x10.core.Rail<primitives.Light>)rail$42391).size;
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        long idx$42388 = 0L;
        {
            
            //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            final primitives.Intersectable[] objects$value$42393 = ((primitives.Intersectable[])objects.value);
            
            //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            final primitives.Light[] rail$42391$value$42394 = ((primitives.Light[])rail$42391.value);
            
            //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            for (;
                 true;
                 ) {
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final long t$42389 = idx$42388;
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final boolean t$42390 = ((t$42389) < (((long)(size$42392))));
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                if (!(t$42390)) {
                    
                    //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    break;
                }
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final long t$42384 = idx$42388;
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Light light$42385 = ((primitives.Light)rail$42391$value$42394[(int)t$42384]);
                
                //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$42326 = ((primitives.Vector)(ray.dir));
                
                //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector v$42327 = primitives.Vector.scalar((double)(t), ((primitives.Vector)(t$42326)));
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$42328 = ((primitives.Vector)(ray.origin));
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                primitives.Vector p$42329 = primitives.Vector.add(((primitives.Vector)(t$42328)), ((primitives.Vector)(v$42327)));
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                primitives.Vector n$42330 = me.normal(((primitives.Ray)(ray)), (double)(t));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$42331 = ((primitives.Vector)(p$42329));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$42332 = ((primitives.Vector)(n$42330));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$42333 = primitives.Vector.scalar((double)(1.0E-6), ((primitives.Vector)(t$42332)));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$42334 = primitives.Vector.add(((primitives.Vector)(t$42331)), ((primitives.Vector)(t$42333)));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                p$42329 = ((primitives.Vector)(t$42334));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$42335 = ((primitives.Vector)(p$42329));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$42336 = ((primitives.Vector)(light$42385.pos));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$42337 = primitives.Vector.sub(((primitives.Vector)(t$42335)), ((primitives.Vector)(t$42336)));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector u$42338 = primitives.Vector.normalize(((primitives.Vector)(t$42337)));
                
                //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$42339 = ((primitives.Vector)(p$42329));
                
                //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Ray lightRay$42340 = new primitives.Ray((java.lang.System[]) null).primitives$Ray$$init$S(t$42339, ((primitives.Vector)(u$42338)));
                
                //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final datastructures.MinBuffer t$42341 = raytracer.Raytracer.getBuffer();
                
                //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                t$42341.init();
                
                //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final long i$42207min$42323 = 0L;
                
                //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final long t$42324 = ((x10.core.Rail<primitives.Intersectable>)objects).size;
                
                //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final long i$42207max$42325 = ((t$42324) - (((long)(1L))));
                
                //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                long i$42320 = i$42207min$42323;
                {
                    
                    //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final long t$42321 = i$42320;
                        
                        //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final boolean t$42322 = ((t$42321) <= (((long)(i$42207max$42325))));
                        
                        //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        if (!(t$42322)) {
                            
                            //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                            break;
                        }
                        
                        //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final long j$42317 = i$42320;
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final primitives.Intersectable t$42313 = ((primitives.Intersectable)objects$value$42393[(int)j$42317]);
                        
                        //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        double t_prime$42314 = t$42313.intersect$O(((primitives.Ray)(lightRay$42340)));
                        
                        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final datastructures.MinBuffer t$42315 = raytracer.Raytracer.getBuffer();
                        
                        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final double t$42316 = t_prime$42314;
                        
                        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        t$42315.insert((long)(j$42317), (double)(t$42316));
                        
                        //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final long t$42318 = i$42320;
                        
                        //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final long t$42319 = ((t$42318) + (((long)(1L))));
                        
                        //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        i$42320 = t$42319;
                    }
                }
                
                //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final datastructures.MinBuffer t$42342 = raytracer.Raytracer.getBuffer();
                
                //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final boolean t$42343 = t$42342.isEmpty$O();
                
                //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                if (t$42343) {
                    
                    //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42344 = -1.0;
                    
                    //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector t$42345 = ((primitives.Vector)(ray.dir));
                    
                    //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector inv$42346 = primitives.Vector.scalar((double)(t$42344), ((primitives.Vector)(t$42345)));
                    
                    //#line 40 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector norm$42347 = me.normal(((primitives.Ray)(ray)), (double)(t));
                    
                    //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42348 = primitives.Vector.dot$O(((primitives.Vector)(norm$42347)), ((primitives.Vector)(inv$42346)));
                    
                    //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42349 = ((2.0) * (((double)(t$42348))));
                    
                    //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector t$42350 = primitives.Vector.scalar((double)(t$42349), ((primitives.Vector)(norm$42347)));
                    
                    //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector t$42351 = primitives.Vector.sub(((primitives.Vector)(t$42350)), ((primitives.Vector)(inv$42346)));
                    
                    //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector ref$42352 = primitives.Vector.normalize(((primitives.Vector)(t$42351)));
                    
                    //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42353 = primitives.Vector.dot$O(((primitives.Vector)(norm$42347)), ((primitives.Vector)(u$42338)));
                    
                    //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42354 = ((2.0) * (((double)(t$42353))));
                    
                    //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector t$42355 = primitives.Vector.scalar((double)(t$42354), ((primitives.Vector)(norm$42347)));
                    
                    //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector t$42356 = primitives.Vector.sub(((primitives.Vector)(t$42355)), ((primitives.Vector)(u$42338)));
                    
                    //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector l_ref$42357 = primitives.Vector.normalize(((primitives.Vector)(t$42356)));
                    
                    //#line 45 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42358 = primitives.Vector.dot$O(((primitives.Vector)(norm$42347)), ((primitives.Vector)(u$42338)));
                    
                    //#line 45 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    double diff$42359 = java.lang.Math.max(((double)(t$42358)),((double)(0.0)));
                    
                    //#line 46 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    double spec$42360 = primitives.Vector.dot$O(((primitives.Vector)(l_ref$42357)), ((primitives.Vector)(inv$42346)));
                    
                    //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42361 = diff$42359;
                    
                    //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final boolean t$42362 = ((t$42361) > (((double)(1.0))));
                    
                    //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    double t$42363 =  0;
                    
                    //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    if (t$42362) {
                        
                        //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        t$42363 = 1.0;
                    } else {
                        
                        //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        t$42363 = diff$42359;
                    }
                    
                    //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42364 = t$42363;
                    
                    //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    diff$42359 = t$42364;
                    
                    //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42365 = spec$42360;
                    
                    //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final boolean t$42366 = ((t$42365) > (((double)(1.0))));
                    
                    //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    double t$42367 =  0;
                    
                    //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    if (t$42366) {
                        
                        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        t$42367 = 1.0;
                    } else {
                        
                        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        t$42367 = spec$42360;
                    }
                    
                    //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42368 = t$42367;
                    
                    //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    spec$42360 = t$42368;
                    
                    //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42369 = spec$42360;
                    
                    //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42370 = x10.lang.Math.pow$O((double)(t$42369), (long)(20L));
                    
                    //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    spec$42360 = t$42370;
                    
                    //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Color t$42371 = ((primitives.Color)(this.color));
                    
                    //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    primitives.Color c_diff$42372 = t$42371.copy();
                    
                    //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    primitives.Color c_spec$42373 = new primitives.Color((java.lang.System[]) null).primitives$Color$$init$S(((long)(255L)), ((long)(255L)), ((long)(255L)), ((long)(255L)));
                    
                    //#line 53 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Color t$42374 = ((primitives.Color)(c_diff$42372));
                    
                    //#line 53 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42375 = light$42385.intensity;
                    
                    //#line 53 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42376 = diff$42359;
                    
                    //#line 53 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42377 = ((t$42375) * (((double)(t$42376))));
                    
                    //#line 53 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    t$42374.scalarKeepAlpha((double)(t$42377));
                    
                    //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Color t$42378 = ((primitives.Color)(c_spec$42373));
                    
                    //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$42379 = spec$42360;
                    
                    //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    t$42378.scalar((double)(t$42379));
                    
                    //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Color t$42380 = ((primitives.Color)(out));
                    
                    //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Color t$42381 = ((primitives.Color)(c_diff$42372));
                    
                    //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    t$42380.add(((primitives.Color)(t$42381)));
                    
                    //#line 56 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Color t$42382 = ((primitives.Color)(out));
                    
                    //#line 56 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Color t$42383 = ((primitives.Color)(c_spec$42373));
                    
                    //#line 56 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    t$42382.add(((primitives.Color)(t$42383)));
                }
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final long t$42386 = idx$42388;
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final long t$42387 = ((t$42386) + (((long)(1L))));
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                idx$42388 = t$42387;
            }
        }
        
        //#line 60 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        final primitives.Color t$42312 = ((primitives.Color)(out));
        
        //#line 60 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        return t$42312;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
    final public shaders.Phong shaders$Phong$$this$shaders$Phong() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        return shaders.Phong.this;
    }
    
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
    final public void __fieldInitializers_shaders_Phong() {
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        this.color = null;
        
        //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        this.ambient = 0.0;
    }
}

