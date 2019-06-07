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
    // creation method for java code (1-phase java constructor)
    public Phong(final primitives.Color color) {
        this((java.lang.System[]) null);
        shaders$Phong$$init$S(color);
    }
    
    // constructor for non-virtual call
    final public shaders.Phong shaders$Phong$$init$S(final primitives.Color color) {
         {
            
            //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            /*super.*/shaders$Material$$init$S();
            
            //#line 14 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            
            
            //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            this.__fieldInitializers_shaders_Phong();
            
            //#line 15 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            this.color = ((primitives.Color)(color));
            
            //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            final double t$1260470 = raytracer.Raytracer.AMBIENT_LIGHT;
            
            //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            this.ambient = t$1260470;
        }
        return this;
    }
    
    
    
    //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
    public primitives.Color evaluate__3$1primitives$Light$2__4$1primitives$Intersectable$2(final primitives.Intersectable me, final primitives.Ray ray, final double t, final x10.core.Rail lights, final x10.core.Rail objects) {
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        final primitives.Color t$1260471 = ((primitives.Color)(this.color));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        primitives.Color out = t$1260471.copy();
        
        //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        final primitives.Color t$1260472 = ((primitives.Color)(out));
        
        //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        final double t$1260473 = this.ambient;
        
        //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        t$1260472.scalarKeepAlpha((double)(t$1260473));
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        final x10.core.Rail rail$1260633 = ((x10.core.Rail)(lights));
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        final long size$1260634 = ((x10.core.Rail<primitives.Light>)rail$1260633).size;
        
        //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        long idx$1260623 = 0L;
        {
            
            //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            final primitives.Intersectable[] objects$value$1260744 = ((primitives.Intersectable[])objects.value);
            
            //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            final primitives.Light[] rail$1260633$value$1260746 = ((primitives.Light[])rail$1260633.value);
            
            //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
            for (;
                 true;
                 ) {
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final long t$1260624 = idx$1260623;
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final boolean t$1260625 = ((t$1260624) < (((long)(size$1260634))));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                if (!(t$1260625)) {
                    
                    //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    break;
                }
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final long t$1260609 = idx$1260623;
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Light light$1260610 = ((primitives.Light)rail$1260633$value$1260746[(int)t$1260609]);
                
                //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$1260548 = ((primitives.Vector)(ray.dir));
                
                //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector v$1260549 = primitives.Vector.scalar((double)(t), ((primitives.Vector)(t$1260548)));
                
                //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$1260550 = ((primitives.Vector)(ray.origin));
                
                //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                primitives.Vector p$1260551 = primitives.Vector.add(((primitives.Vector)(t$1260550)), ((primitives.Vector)(v$1260549)));
                
                //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                primitives.Vector n$1260552 = me.normal(((primitives.Ray)(ray)), (double)(t));
                
                //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$1260553 = ((primitives.Vector)(p$1260551));
                
                //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$1260554 = ((primitives.Vector)(n$1260552));
                
                //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$1260555 = primitives.Vector.scalar((double)(1.0E-6), ((primitives.Vector)(t$1260554)));
                
                //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$1260556 = primitives.Vector.add(((primitives.Vector)(t$1260553)), ((primitives.Vector)(t$1260555)));
                
                //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                p$1260551 = ((primitives.Vector)(t$1260556));
                
                //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$1260557 = ((primitives.Vector)(p$1260551));
                
                //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$1260558 = ((primitives.Vector)(light$1260610.pos));
                
                //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$1260559 = primitives.Vector.sub(((primitives.Vector)(t$1260557)), ((primitives.Vector)(t$1260558)));
                
                //#line 35 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector u$1260560 = primitives.Vector.normalize(((primitives.Vector)(t$1260559)));
                
                //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Vector t$1260561 = ((primitives.Vector)(p$1260551));
                
                //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final primitives.Ray lightRay$1260562 = new primitives.Ray((java.lang.System[]) null).primitives$Ray$$init$S(t$1260561, ((primitives.Vector)(u$1260560)));
                
                //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final datastructures.MinBuffer t$1260563 = raytracer.Raytracer.getBuffer();
                
                //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                t$1260563.init();
                
                //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final long i$1260428min$1260545 = 0L;
                
                //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final long t$1260546 = ((x10.core.Rail<primitives.Intersectable>)objects).size;
                
                //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final long i$1260428max$1260547 = ((t$1260546) - (((long)(1L))));
                
                //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                long i$1260542 = i$1260428min$1260545;
                {
                    
                    //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final long t$1260543 = i$1260542;
                        
                        //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final boolean t$1260544 = ((t$1260543) <= (((long)(i$1260428max$1260547))));
                        
                        //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        if (!(t$1260544)) {
                            
                            //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                            break;
                        }
                        
                        //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final long j$1260539 = i$1260542;
                        
                        //#line 40 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final primitives.Intersectable t$1260535 = ((primitives.Intersectable)objects$value$1260744[(int)j$1260539]);
                        
                        //#line 40 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        double t_prime$1260536 = t$1260535.intersect$O(((primitives.Ray)(lightRay$1260562)));
                        
                        //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final datastructures.MinBuffer t$1260537 = raytracer.Raytracer.getBuffer();
                        
                        //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final double t$1260538 = t_prime$1260536;
                        
                        //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        t$1260537.insert((long)(j$1260539), (double)(t$1260538));
                        
                        //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final long t$1260540 = i$1260542;
                        
                        //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        final long t$1260541 = ((t$1260540) + (((long)(1L))));
                        
                        //#line 39 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        i$1260542 = t$1260541;
                    }
                }
                
                //#line 43 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final datastructures.MinBuffer t$1260564 = raytracer.Raytracer.getBuffer();
                
                //#line 43 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final boolean t$1260567 = t$1260564.isEmpty$O();
                
                //#line 43 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                if (t$1260567) {
                    
                    //#line 44 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260568 = -1.0;
                    
                    //#line 44 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector t$1260569 = ((primitives.Vector)(ray.dir));
                    
                    //#line 44 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector inv$1260570 = primitives.Vector.scalar((double)(t$1260568), ((primitives.Vector)(t$1260569)));
                    
                    //#line 45 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector norm$1260571 = me.normal(((primitives.Ray)(ray)), (double)(t));
                    
                    //#line 46 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260572 = primitives.Vector.dot$O(((primitives.Vector)(norm$1260571)), ((primitives.Vector)(inv$1260570)));
                    
                    //#line 46 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260573 = ((2.0) * (((double)(t$1260572))));
                    
                    //#line 46 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector t$1260574 = primitives.Vector.scalar((double)(t$1260573), ((primitives.Vector)(norm$1260571)));
                    
                    //#line 46 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector t$1260575 = primitives.Vector.sub(((primitives.Vector)(t$1260574)), ((primitives.Vector)(inv$1260570)));
                    
                    //#line 46 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector ref$1260576 = primitives.Vector.normalize(((primitives.Vector)(t$1260575)));
                    
                    //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260577 = primitives.Vector.dot$O(((primitives.Vector)(norm$1260571)), ((primitives.Vector)(u$1260560)));
                    
                    //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260578 = ((2.0) * (((double)(t$1260577))));
                    
                    //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector t$1260579 = primitives.Vector.scalar((double)(t$1260578), ((primitives.Vector)(norm$1260571)));
                    
                    //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector t$1260581 = primitives.Vector.sub(((primitives.Vector)(t$1260579)), ((primitives.Vector)(u$1260560)));
                    
                    //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Vector l_ref$1260582 = primitives.Vector.normalize(((primitives.Vector)(t$1260581)));
                    
                    //#line 50 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260583 = primitives.Vector.dot$O(((primitives.Vector)(norm$1260571)), ((primitives.Vector)(u$1260560)));
                    
                    //#line 50 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    double diff$1260584 = java.lang.Math.max(((double)(t$1260583)),((double)(0.0)));
                    
                    //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    double spec$1260585 = primitives.Vector.dot$O(((primitives.Vector)(l_ref$1260582)), ((primitives.Vector)(inv$1260570)));
                    
                    //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260586 = diff$1260584;
                    
                    //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final boolean t$1260587 = ((t$1260586) > (((double)(1.0))));
                    
                    //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    double t$1260588 =  0;
                    
                    //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    if (t$1260587) {
                        
                        //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        t$1260588 = 1.0;
                    } else {
                        
                        //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        t$1260588 = diff$1260584;
                    }
                    
                    //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260589 = t$1260588;
                    
                    //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    diff$1260584 = t$1260589;
                    
                    //#line 53 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260590 = spec$1260585;
                    
                    //#line 53 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final boolean t$1260591 = ((t$1260590) > (((double)(1.0))));
                    
                    //#line 53 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    double t$1260592 =  0;
                    
                    //#line 53 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    if (t$1260591) {
                        
                        //#line 53 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        t$1260592 = 1.0;
                    } else {
                        
                        //#line 53 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                        t$1260592 = spec$1260585;
                    }
                    
                    //#line 53 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260593 = t$1260592;
                    
                    //#line 53 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    spec$1260585 = t$1260593;
                    
                    //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260594 = spec$1260585;
                    
                    //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260595 = x10.lang.Math.pow$O((double)(t$1260594), (long)(20L));
                    
                    //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    spec$1260585 = t$1260595;
                    
                    //#line 56 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Color t$1260596 = ((primitives.Color)(this.color));
                    
                    //#line 56 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    primitives.Color c_diff$1260597 = t$1260596.copy();
                    
                    //#line 57 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    primitives.Color c_spec$1260598 = new primitives.Color((java.lang.System[]) null).primitives$Color$$init$S(((long)(255L)), ((long)(255L)), ((long)(255L)), ((long)(255L)));
                    
                    //#line 58 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Color t$1260599 = ((primitives.Color)(c_diff$1260597));
                    
                    //#line 58 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260600 = light$1260610.intensity;
                    
                    //#line 58 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260601 = diff$1260584;
                    
                    //#line 58 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260602 = ((t$1260600) * (((double)(t$1260601))));
                    
                    //#line 58 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    t$1260599.scalarKeepAlpha((double)(t$1260602));
                    
                    //#line 59 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Color t$1260603 = ((primitives.Color)(c_spec$1260598));
                    
                    //#line 59 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final double t$1260604 = spec$1260585;
                    
                    //#line 59 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    t$1260603.scalar((double)(t$1260604));
                    
                    //#line 60 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Color t$1260605 = ((primitives.Color)(out));
                    
                    //#line 60 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Color t$1260606 = ((primitives.Color)(c_diff$1260597));
                    
                    //#line 60 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    t$1260605.add(((primitives.Color)(t$1260606)));
                    
                    //#line 61 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Color t$1260607 = ((primitives.Color)(out));
                    
                    //#line 61 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    final primitives.Color t$1260608 = ((primitives.Color)(c_spec$1260598));
                    
                    //#line 61 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                    t$1260607.add(((primitives.Color)(t$1260608)));
                }
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final long t$1260618 = idx$1260623;
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                final long t$1260620 = ((t$1260618) + (((long)(1L))));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
                idx$1260623 = t$1260620;
            }
        }
        
        //#line 65 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        final primitives.Color t$1260534 = ((primitives.Color)(out));
        
        //#line 65 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/shaders/Phong.x10"
        return t$1260534;
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

