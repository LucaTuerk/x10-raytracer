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
        final x10.core.Rail t$7147 = ((x10.core.Rail)(p));
        
        //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final long t$7148 = ((i) % (((long)(w))));
        
        //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        ((long[])t$7147.value)[(int)0L] = t$7148;
        
        //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final x10.core.Rail t$7149 = ((x10.core.Rail)(p));
        
        //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final long t$7150 = ((i) / (((long)(w))));
        
        //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        ((long[])t$7149.value)[(int)1L] = t$7150;
        
        //#line 13 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final x10.core.Rail t$7151 = ((x10.core.Rail)(p));
        
        //#line 13 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        return t$7151;
    }
    
    
    //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
    public static void writePng__0$1x10$lang$UByte$2(final x10.core.Rail<x10.core.UByte> img, final int width, final int height, final java.io.File file) {
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final int t$7152 = ((int)(long)(((long)(2L))));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final java.awt.image.BufferedImage buf = new java.awt.image.BufferedImage(((int)(width)), ((int)(height)), t$7152);
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        long i = 0L;
        
        //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final x10.io.Printer t$7153 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        t$7153.println();
        {
            
            //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
            final byte[] img$value$7281 = ((byte[])img.value);
            
            //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
            while (true) {
                
                //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7155 = i;
                
                //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7154 = ((x10.core.Rail<x10.core.UByte>)img).size;
                
                //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7156 = ((t$7154) - (((long)(1L))));
                
                //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final boolean t$7194 = ((t$7155) < (((long)(t$7156))));
                
                //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                if (!(t$7194)) {
                    
                    //#line 22 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                    break;
                }
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7242 = i;
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7243 = ((t$7242) / (((long)(4L))));
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7244 = ((long)(((int)(width))));
                
                //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final x10.core.Rail pos$7245 = raytracer.Utilities.idx((long)(t$7243), (long)(t$7244));
                
                //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                int col$7246 = ((int)(long)(((long)(0L))));
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7247 = i;
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final byte t$7248 = ((byte)img$value$7281[(int)t$7247]);
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7249 = ((int) (((byte)(((byte)(t$7248)))) & 0xff));
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7250 = ((t$7249) << (int)(((long)(16L))));
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7251 = col$7246;
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7252 = ((t$7250) | (((int)(t$7251))));
                
                //#line 27 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                col$7246 = ((int)(((int)(t$7252))));
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7253 = i;
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7254 = ((t$7253) + (((long)(1L))));
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final byte t$7255 = ((byte)img$value$7281[(int)t$7254]);
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7256 = ((int) (((byte)(((byte)(t$7255)))) & 0xff));
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7257 = ((t$7256) << (int)(((long)(8L))));
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7258 = col$7246;
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7259 = ((t$7257) | (((int)(t$7258))));
                
                //#line 28 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                col$7246 = ((int)(((int)(t$7259))));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7260 = i;
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7261 = ((t$7260) + (((long)(2L))));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final byte t$7262 = ((byte)img$value$7281[(int)t$7261]);
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7263 = ((int) (((byte)(((byte)(t$7262)))) & 0xff));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7264 = ((t$7263) << (int)(((long)(0L))));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7265 = col$7246;
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7266 = ((t$7264) | (((int)(t$7265))));
                
                //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                col$7246 = ((int)(((int)(t$7266))));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7267 = i;
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7268 = ((t$7267) + (((long)(3L))));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final byte t$7269 = ((byte)img$value$7281[(int)t$7268]);
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7270 = ((int) (((byte)(((byte)(t$7269)))) & 0xff));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7271 = ((t$7270) << (int)(((long)(24L))));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7272 = col$7246;
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7273 = ((t$7271) | (((int)(t$7272))));
                
                //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                col$7246 = ((int)(((int)(t$7273))));
                
                //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7274 = ((long[])pos$7245.value)[(int)0L];
                
                //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7275 = ((int)(long)(((long)(t$7274))));
                
                //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7276 = ((long[])pos$7245.value)[(int)1L];
                
                //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7277 = ((int)(long)(((long)(t$7276))));
                
                //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final int t$7278 = col$7246;
                
                //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                buf.setRGB((int)(t$7275), (int)(t$7277), (int)(t$7278));
                
                //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7279 = i;
                
                //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                final long t$7280 = ((t$7279) + (((long)(4L))));
                
                //#line 34 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
                i = t$7280;
            }
        }
        
        //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        try {{
            
            //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
            javax.imageio.ImageIO.write(((java.awt.image.RenderedImage)(buf)), ((java.lang.String)("png")), ((java.io.File)(file)));
        }}catch (final java.io.IOException id$2452) {
            
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
        final double t$7195 = xf;
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7196 = xf;
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7199 = ((t$7195) * (((double)(t$7196))));
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7197 = yf;
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7198 = yf;
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7200 = ((t$7197) * (((double)(t$7198))));
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7201 = ((t$7199) + (((double)(t$7200))));
        
        //#line 48 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        double upperDist = java.lang.Math.sqrt(((double)(t$7201)));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7202 = wf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7203 = xf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7206 = ((t$7202) - (((double)(t$7203))));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7204 = wf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7205 = xf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7207 = ((t$7204) - (((double)(t$7205))));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7214 = ((t$7206) * (((double)(t$7207))));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7208 = hf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7209 = yf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7212 = ((t$7208) - (((double)(t$7209))));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7210 = hf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7211 = yf;
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7213 = ((t$7210) - (((double)(t$7211))));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7215 = ((t$7212) * (((double)(t$7213))));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7216 = ((t$7214) + (((double)(t$7215))));
        
        //#line 49 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        double lowerDist = java.lang.Math.sqrt(((double)(t$7216)));
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7221 = ((double)(long)(((long)(1L))));
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7219 = upperDist;
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7217 = upperDist;
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7218 = lowerDist;
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7220 = ((t$7217) + (((double)(t$7218))));
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7222 = ((t$7219) / (((double)(t$7220))));
        
        //#line 51 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        double upperFac = ((t$7221) - (((double)(t$7222))));
        
        //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7223 = ((double)(long)(((long)(1L))));
        
        //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7224 = upperFac;
        
        //#line 52 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        double lowerFac = ((t$7223) - (((double)(t$7224))));
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final byte t$7225 = ((byte)0xff);
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7226 = ((double)((int)(((byte)(t$7225)))&0xff));
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7227 = upperFac;
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7228 = ((t$7226) * (((double)(t$7227))));
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final byte t$7229 = x10.runtime.impl.java.DoubleUtils.toUByte(((double)(t$7228)));
        
        //#line 54 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        ((byte[])col.value)[(int)0L] = t$7229;
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final byte t$7230 = ((byte)0xff);
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7231 = ((double)((int)(((byte)(t$7230)))&0xff));
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7232 = lowerFac;
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7233 = ((t$7231) * (((double)(t$7232))));
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final byte t$7234 = x10.runtime.impl.java.DoubleUtils.toUByte(((double)(t$7233)));
        
        //#line 55 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        ((byte[])col.value)[(int)1L] = t$7234;
        
        //#line 56 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final byte t$7235 = ((byte)(long)(((long)(0L))));
        
        //#line 56 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        ((byte[])col.value)[(int)2L] = t$7235;
        
        //#line 57 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final byte t$7236 = ((byte)0xff);
        
        //#line 57 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        ((byte[])col.value)[(int)3L] = t$7236;
        
        //#line 59 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        return col;
    }
    
    
    //#line 62 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
    public static double interpolate$O(final double fac, final double min, final double max) {
        
        //#line 63 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7237 = ((1.0) - (((double)(fac))));
        
        //#line 63 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7238 = ((t$7237) * (((double)(min))));
        
        //#line 63 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7239 = ((fac) * (((double)(max))));
        
        //#line 63 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7240 = ((t$7238) + (((double)(t$7239))));
        
        //#line 63 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        final double t$7241 = ((t$7240) / (((double)(2.0))));
        
        //#line 63 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/raytracer/Utilities.x10"
        return t$7241;
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

