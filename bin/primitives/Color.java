package primitives;

@x10.runtime.impl.java.X10Generated
public class Color extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Color> $RTT = 
        x10.rtt.NamedType.<Color> make("primitives.Color",
                                       Color.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(primitives.Color $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Color.class + " calling"); } 
        $_obj.a = $deserializer.readByte();
        $_obj.b = $deserializer.readByte();
        $_obj.g = $deserializer.readByte();
        $_obj.r = $deserializer.readByte();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        primitives.Color $_obj = new primitives.Color((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.a);
        $serializer.write(this.b);
        $serializer.write(this.g);
        $serializer.write(this.r);
        
    }
    
    // constructor just for allocation
    public Color(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 4 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
    public byte r;
    
    //#line 5 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
    public byte g;
    
    //#line 6 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
    public byte b;
    
    //#line 7 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
    public byte a;
    
    
    //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
    // creation method for java code (1-phase java constructor)
    public Color(final long r, final long g, final long b, final long a) {
        this((java.lang.System[]) null);
        primitives$Color$$init$S(r, g, b, a);
    }
    
    // constructor for non-virtual call
    final public primitives.Color primitives$Color$$init$S(final long r, final long g, final long b, final long a) {
         {
            
            //#line 9 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
            
            
            //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
            this.__fieldInitializers_primitives_Color();
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
            final byte t$6624 = ((byte)(long)(((long)(r))));
            
            //#line 10 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
            this.r = t$6624;
            
            //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
            final byte t$6625 = ((byte)(long)(((long)(g))));
            
            //#line 11 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
            this.g = t$6625;
            
            //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
            final byte t$6626 = ((byte)(long)(((long)(b))));
            
            //#line 12 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
            this.b = t$6626;
            
            //#line 13 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
            final byte t$6627 = ((byte)(long)(((long)(a))));
            
            //#line 13 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
            this.a = t$6627;
        }
        return this;
    }
    
    
    
    //#line 16 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
    public void scalar(final double s) {
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6628 = this.r;
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final double t$6629 = ((double)((int)(((byte)(t$6628)))&0xff));
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final double t$6630 = ((t$6629) * (((double)(s))));
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6631 = x10.runtime.impl.java.DoubleUtils.toUByte(((double)(t$6630)));
        
        //#line 17 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        this.r = t$6631;
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6632 = this.g;
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final double t$6633 = ((double)((int)(((byte)(t$6632)))&0xff));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final double t$6634 = ((t$6633) * (((double)(s))));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6635 = x10.runtime.impl.java.DoubleUtils.toUByte(((double)(t$6634)));
        
        //#line 18 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        this.g = t$6635;
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6636 = this.b;
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final double t$6637 = ((double)((int)(((byte)(t$6636)))&0xff));
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final double t$6638 = ((t$6637) * (((double)(s))));
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6639 = x10.runtime.impl.java.DoubleUtils.toUByte(((double)(t$6638)));
        
        //#line 19 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        this.b = t$6639;
        
        //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6640 = this.a;
        
        //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final double t$6641 = ((double)((int)(((byte)(t$6640)))&0xff));
        
        //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final double t$6642 = ((t$6641) * (((double)(s))));
        
        //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6643 = x10.runtime.impl.java.DoubleUtils.toUByte(((double)(t$6642)));
        
        //#line 20 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        this.a = t$6643;
    }
    
    
    //#line 23 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
    public void scalarKeepAlpha(final double s) {
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6644 = this.r;
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final double t$6645 = ((double)((int)(((byte)(t$6644)))&0xff));
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final double t$6646 = ((t$6645) * (((double)(s))));
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6647 = x10.runtime.impl.java.DoubleUtils.toUByte(((double)(t$6646)));
        
        //#line 24 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        this.r = t$6647;
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6648 = this.g;
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final double t$6649 = ((double)((int)(((byte)(t$6648)))&0xff));
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final double t$6650 = ((t$6649) * (((double)(s))));
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6651 = x10.runtime.impl.java.DoubleUtils.toUByte(((double)(t$6650)));
        
        //#line 25 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        this.g = t$6651;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6652 = this.b;
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final double t$6653 = ((double)((int)(((byte)(t$6652)))&0xff));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final double t$6654 = ((t$6653) * (((double)(s))));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6655 = x10.runtime.impl.java.DoubleUtils.toUByte(((double)(t$6654)));
        
        //#line 26 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        this.b = t$6655;
    }
    
    
    //#line 29 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
    public void add(final primitives.Color c) {
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6656 = this.r;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6657 = c.r;
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6658 = this.capedAdd__0$u__1$u$O((byte)(t$6656), (byte)(t$6657));
        
        //#line 30 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        this.r = t$6658;
        
        //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6659 = this.g;
        
        //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6660 = c.g;
        
        //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6661 = this.capedAdd__0$u__1$u$O((byte)(t$6659), (byte)(t$6660));
        
        //#line 31 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        this.g = t$6661;
        
        //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6662 = this.b;
        
        //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6663 = c.b;
        
        //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6664 = this.capedAdd__0$u__1$u$O((byte)(t$6662), (byte)(t$6663));
        
        //#line 32 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        this.b = t$6664;
        
        //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6665 = this.a;
        
        //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6666 = c.a;
        
        //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6667 = this.capedAdd__0$u__1$u$O((byte)(t$6665), (byte)(t$6666));
        
        //#line 33 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        this.a = t$6667;
    }
    
    
    //#line 36 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
    public byte capedAdd__0$u__1$u$O(final byte a, final byte b) {
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final long t$6668 = ((long) ((((byte)(a))) & 0xffL));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final long t$6669 = ((long) ((((byte)(b))) & 0xffL));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final long t$6671 = ((t$6668) + (((long)(t$6669))));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6670 = ((byte)0xff);
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final long t$6672 = ((long) ((((byte)(t$6670))) & 0xffL));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final boolean t$6674 = x10.runtime.impl.java.ULongUtils.gt(t$6671, ((long)(t$6672)));
        
        //#line 37 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        if (t$6674) {
            
            //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
            final byte t$6673 = ((byte)0xff);
            
            //#line 38 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
            return t$6673;
        }
        
        //#line 40 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6675 = ((byte) ((a) + (((byte)(b)))));
        
        //#line 40 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        return t$6675;
    }
    
    
    //#line 43 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
    public primitives.Color copy() {
        
        //#line 44 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6676 = this.r;
        
        //#line 44 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final long t$6680 = ((long)((byte)(t$6676)));
        
        //#line 44 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6677 = this.g;
        
        //#line 44 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final long t$6681 = ((long)((byte)(t$6677)));
        
        //#line 44 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6678 = this.b;
        
        //#line 44 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final long t$6682 = ((long)((byte)(t$6678)));
        
        //#line 44 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final byte t$6679 = this.a;
        
        //#line 44 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final long t$6683 = ((long)((byte)(t$6679)));
        
        //#line 44 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        final primitives.Color t$6684 = ((primitives.Color)(new primitives.Color((java.lang.System[]) null).primitives$Color$$init$S(t$6680, t$6681, t$6682, t$6683)));
        
        //#line 44 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        return t$6684;
    }
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
    final public primitives.Color primitives$Color$$this$primitives$Color() {
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        return primitives.Color.this;
    }
    
    
    //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
    final public void __fieldInitializers_primitives_Color() {
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        this.r = ((byte) 0);
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        this.g = ((byte) 0);
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        this.b = ((byte) 0);
        
        //#line 3 "/Users/lucaturk/eclipse-workspace/x10-raytracer/src/primitives/Color.x10"
        this.a = ((byte) 0);
    }
}

