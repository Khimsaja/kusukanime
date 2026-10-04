package J1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f4154d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f4155e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public ByteBuffer a;

    /* renamed from: b, reason: collision with root package name */
    public int f4156b;

    /* renamed from: c, reason: collision with root package name */
    public int f4157c;

    public static void a(ByteBuffer byteBuffer, long j7, int i7, int i8, boolean z7) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z7 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j7);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i7);
        byteBuffer.putInt(0);
        long j8 = i8;
        if ((j8 >> 8) != 0) {
            throw new IllegalArgumentException(e3.c.B("out of range: %s", Long.valueOf(j8)));
        }
        byteBuffer.put((byte) j8);
    }
}
