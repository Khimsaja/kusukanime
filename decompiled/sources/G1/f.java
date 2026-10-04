package G1;

import java.nio.ByteBuffer;
import y1.AbstractC2402y;
import y1.C2393o;

/* loaded from: classes.dex */
public class f extends C1.e {

    /* renamed from: m, reason: collision with root package name */
    public C2393o f2607m;

    /* renamed from: n, reason: collision with root package name */
    public final b f2608n = new b();

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f2609o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2610p;

    /* renamed from: q, reason: collision with root package name */
    public long f2611q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f2612r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2613s;

    static {
        AbstractC2402y.a("media3.decoder");
    }

    public f(int i7) {
        this.f2613s = i7;
    }

    public void f() {
        this.f575l = 0;
        ByteBuffer byteBuffer = this.f2609o;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f2612r;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f2610p = false;
    }

    public final ByteBuffer g(int i7) {
        int i8 = this.f2613s;
        if (i8 == 1) {
            return ByteBuffer.allocate(i7);
        }
        if (i8 == 2) {
            return ByteBuffer.allocateDirect(i7);
        }
        ByteBuffer byteBuffer = this.f2609o;
        throw new e("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i7 + ")");
    }

    public final void h(int i7) {
        ByteBuffer byteBuffer = this.f2609o;
        if (byteBuffer == null) {
            this.f2609o = g(i7);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i8 = i7 + iPosition;
        if (iCapacity >= i8) {
            this.f2609o = byteBuffer;
            return;
        }
        ByteBuffer byteBufferG = g(i8);
        byteBufferG.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferG.put(byteBuffer);
        }
        this.f2609o = byteBufferG;
    }

    public final void j() {
        ByteBuffer byteBuffer = this.f2609o;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f2612r;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
