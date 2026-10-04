package M1;

import B1.AbstractC0015b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class i extends G1.f {

    /* renamed from: t, reason: collision with root package name */
    public long f6456t;

    /* renamed from: u, reason: collision with root package name */
    public int f6457u;

    /* renamed from: v, reason: collision with root package name */
    public int f6458v;

    @Override // G1.f
    public final void f() {
        super.f();
        this.f6457u = 0;
    }

    public final boolean k(G1.f fVar) {
        ByteBuffer byteBuffer;
        AbstractC0015b.c(!fVar.c(1073741824));
        AbstractC0015b.c(!fVar.c(268435456));
        AbstractC0015b.c(!fVar.c(4));
        if (l()) {
            if (this.f6457u >= this.f6458v) {
                return false;
            }
            ByteBuffer byteBuffer2 = fVar.f2609o;
            if (byteBuffer2 != null && (byteBuffer = this.f2609o) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i7 = this.f6457u;
        this.f6457u = i7 + 1;
        if (i7 == 0) {
            this.f2611q = fVar.f2611q;
            if (fVar.c(1)) {
                this.f575l = 1;
            }
        }
        ByteBuffer byteBuffer3 = fVar.f2609o;
        if (byteBuffer3 != null) {
            h(byteBuffer3.remaining());
            this.f2609o.put(byteBuffer3);
        }
        this.f6456t = fVar.f2611q;
        return true;
    }

    public final boolean l() {
        return this.f6457u > 0;
    }
}
