package raytracer;


@x10.runtime.impl.java.X10Generated
public class Utilities extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Utilities> $RTT = 
        x10.rtt.NamedType.<Utilities> make("raytracer.Utilities",
                                           Utilities.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(raytracer.Utilities $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Utilities.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        raytracer.Utilities $_obj = new raytracer.Utilities((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Utilities(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
    public static x10.core.Rail idx(final long i, final long w) {
        
        //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        x10.core.Rail p = new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(2L)));
        
        //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final x10.core.Rail t$7060 = ((x10.core.Rail)(p));
        
        //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final long t$7061 = ((i) % (((long)(w))));
        
        //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        ((long[])t$7060.value)[(int)0L] = t$7061;
        
        //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final x10.core.Rail t$7062 = ((x10.core.Rail)(p));
        
        //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final long t$7063 = ((i) / (((long)(w))));
        
        //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        ((long[])t$7062.value)[(int)1L] = t$7063;
        
        //#line 13 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final x10.core.Rail t$7064 = ((x10.core.Rail)(p));
        
        //#line 13 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        return t$7064;
    }
    
    
    //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
    public static void writePng__0$1x10$lang$UByte$2(final x10.core.Rail<x10.core.UByte> img, final int width, final int height, final java.io.File file) {
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final int t$7065 = ((int)(long)(((long)(2L))));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final java.awt.image.BufferedImage buf = new java.awt.image.BufferedImage(((int)(width)), ((int)(height)), t$7065);
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        long i = 0L;
        
        //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final x10.io.Printer t$7066 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        t$7066.println();
        {
            
            //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
            final byte[] img$value$7194 = ((byte[])img.value);
            
            //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
            while (true) {
                
                //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7068 = i;
                
                //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7067 = ((x10.core.Rail<x10.core.UByte>)img).size;
                
                //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7069 = ((t$7067) - (((long)(1L))));
                
                //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final boolean t$7107 = ((t$7068) < (((long)(t$7069))));
                
                //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                if (!(t$7107)) {
                    
                    //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                    break;
                }
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7155 = i;
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7156 = ((t$7155) / (((long)(4L))));
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7157 = ((long)(((int)(width))));
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final x10.core.Rail pos$7158 = raytracer.Utilities.idx((long)(t$7156), (long)(t$7157));
                
                //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                int col$7159 = ((int)(long)(((long)(0L))));
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7160 = i;
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final byte t$7161 = ((byte)img$value$7194[(int)t$7160]);
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7162 = ((int) (((byte)(((byte)(t$7161)))) & 0xff));
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7163 = ((t$7162) << (int)(((long)(16L))));
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7164 = col$7159;
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7165 = ((t$7163) | (((int)(t$7164))));
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                col$7159 = ((int)(((int)(t$7165))));
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7166 = i;
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7167 = ((t$7166) + (((long)(1L))));
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final byte t$7168 = ((byte)img$value$7194[(int)t$7167]);
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7169 = ((int) (((byte)(((byte)(t$7168)))) & 0xff));
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7170 = ((t$7169) << (int)(((long)(8L))));
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7171 = col$7159;
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7172 = ((t$7170) | (((int)(t$7171))));
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                col$7159 = ((int)(((int)(t$7172))));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7173 = i;
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7174 = ((t$7173) + (((long)(2L))));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final byte t$7175 = ((byte)img$value$7194[(int)t$7174]);
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7176 = ((int) (((byte)(((byte)(t$7175)))) & 0xff));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7177 = ((t$7176) << (int)(((long)(0L))));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7178 = col$7159;
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7179 = ((t$7177) | (((int)(t$7178))));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                col$7159 = ((int)(((int)(t$7179))));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7180 = i;
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7181 = ((t$7180) + (((long)(3L))));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final byte t$7182 = ((byte)img$value$7194[(int)t$7181]);
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7183 = ((int) (((byte)(((byte)(t$7182)))) & 0xff));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7184 = ((t$7183) << (int)(((long)(24L))));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7185 = col$7159;
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7186 = ((t$7184) | (((int)(t$7185))));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                col$7159 = ((int)(((int)(t$7186))));
                
                //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7187 = ((long[])pos$7158.value)[(int)0L];
                
                //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7188 = ((int)(long)(((long)(t$7187))));
                
                //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7189 = ((long[])pos$7158.value)[(int)1L];
                
                //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7190 = ((int)(long)(((long)(t$7189))));
                
                //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7191 = col$7159;
                
                //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                buf.setRGB((int)(t$7188), (int)(t$7190), (int)(t$7191));
                
                //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7192 = i;
                
                //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7193 = ((t$7192) + (((long)(4L))));
                
                //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                i = t$7193;
            }
        }
        
        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        try {{
            
            //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
            javax.imageio.ImageIO.write(((java.awt.image.RenderedImage)(buf)), ((java.lang.String)("png")), ((java.io.File)(file)));
        }}catch (final java.io.IOException id$2494) {
            
        }
    }
    
    
    //#line 41 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
    public static x10.core.Rail interpolateColor(final int x, final int y, final int width, final int height) {
        
        //#line 42 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final x10.core.Rail col = new x10.core.Rail<x10.core.UByte>(x10.rtt.Types.UBYTE, ((long)(4L)));
        
        //#line 44 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        double xf = ((double)(int)(((int)(x))));
        
        //#line 45 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        double yf = ((double)(int)(((int)(y))));
        
        //#line 46 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        double wf = ((double)(int)(((int)(width))));
        
        //#line 47 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        double hf = ((double)(int)(((int)(height))));
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7108 = xf;
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7109 = xf;
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7112 = ((t$7108) * (((double)(t$7109))));
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7110 = yf;
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7111 = yf;
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7113 = ((t$7110) * (((double)(t$7111))));
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7114 = ((t$7112) + (((double)(t$7113))));
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        double upperDist = java.lang.Math.sqrt(((double)(t$7114)));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7115 = wf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7116 = xf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7119 = ((t$7115) - (((double)(t$7116))));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7117 = wf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7118 = xf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7120 = ((t$7117) - (((double)(t$7118))));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7127 = ((t$7119) * (((double)(t$7120))));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7121 = hf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7122 = yf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7125 = ((t$7121) - (((double)(t$7122))));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7123 = hf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7124 = yf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7126 = ((t$7123) - (((double)(t$7124))));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7128 = ((t$7125) * (((double)(t$7126))));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7129 = ((t$7127) + (((double)(t$7128))));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        double lowerDist = java.lang.Math.sqrt(((double)(t$7129)));
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7134 = ((double)(long)(((long)(1L))));
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7132 = upperDist;
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7130 = upperDist;
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7131 = lowerDist;
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7133 = ((t$7130) + (((double)(t$7131))));
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7135 = ((t$7132) / (((double)(t$7133))));
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        double upperFac = ((t$7134) - (((double)(t$7135))));
        
        //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7136 = ((double)(long)(((long)(1L))));
        
        //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7137 = upperFac;
        
        //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        double lowerFac = ((t$7136) - (((double)(t$7137))));
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final byte t$7138 = ((byte)0xff);
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7139 = ((double)((int)(((byte)(t$7138)))&0xff));
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7140 = upperFac;
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7141 = ((t$7139) * (((double)(t$7140))));
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final byte t$7142 = x10.runtime.impl.java.DoubleUtils.toUByte(((double)(t$7141)));
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        ((byte[])col.value)[(int)0L] = t$7142;
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final byte t$7143 = ((byte)0xff);
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7144 = ((double)((int)(((byte)(t$7143)))&0xff));
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7145 = lowerFac;
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7146 = ((t$7144) * (((double)(t$7145))));
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final byte t$7147 = x10.runtime.impl.java.DoubleUtils.toUByte(((double)(t$7146)));
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        ((byte[])col.value)[(int)1L] = t$7147;
        
        //#line 56 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final byte t$7148 = ((byte)(long)(((long)(0L))));
        
        //#line 56 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        ((byte[])col.value)[(int)2L] = t$7148;
        
        //#line 57 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final byte t$7149 = ((byte)0xff);
        
        //#line 57 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        ((byte[])col.value)[(int)3L] = t$7149;
        
        //#line 59 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        return col;
    }
    
    
    //#line 62 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
    public static double interpolate$O(final double fac, final double min, final double max) {
        
        //#line 63 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7150 = ((1.0) - (((double)(fac))));
        
        //#line 63 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7151 = ((t$7150) * (((double)(min))));
        
        //#line 63 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7152 = ((fac) * (((double)(max))));
        
        //#line 63 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7153 = ((t$7151) + (((double)(t$7152))));
        
        //#line 63 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7154 = ((t$7153) / (((double)(2.0))));
        
        //#line 63 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        return t$7154;
    }
    
    
    //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
    final public raytracer.Utilities raytracer$Utilities$$this$raytracer$Utilities() {
        
        //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        return raytracer.Utilities.this;
    }
    
    
    //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
    // creation method for java code (1-phase java constructor)
    public Utilities() {
        this((java.lang.System[]) null);
        raytracer$Utilities$$init$S();
    }
    
    // constructor for non-virtual call
    final public raytracer.Utilities raytracer$Utilities$$init$S() {
         {
            
            //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
            
            
            //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
            this.__fieldInitializers_raytracer_Utilities();
        }
        return this;
    }
    
    
    
    //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
    final public void __fieldInitializers_raytracer_Utilities() {
        
    }
}

