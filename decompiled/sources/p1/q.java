package p1;

import io.ktor.sse.ServerSentEventKt;
import java.nio.ByteBuffer;
import q1.C1845a;
import q1.C1846b;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f14193d = new ThreadLocal();
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final A2.b f14194b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f14195c = 0;

    public q(A2.b bVar, int i7) {
        this.f14194b = bVar;
        this.a = i7;
    }

    public final int a(int i7) {
        C1845a c1845aB = b();
        int iA = c1845aB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c1845aB.f7975n;
        int i8 = iA + c1845aB.f7972k;
        return byteBuffer.getInt((i7 * 4) + byteBuffer.getInt(i8) + i8 + 4);
    }

    public final C1845a b() {
        ThreadLocal threadLocal = f14193d;
        C1845a c1845a = (C1845a) threadLocal.get();
        if (c1845a == null) {
            c1845a = new C1845a();
            threadLocal.set(c1845a);
        }
        C1846b c1846b = (C1846b) this.f14194b.f110l;
        int iA = c1846b.a(6);
        if (iA != 0) {
            int i7 = iA + c1846b.f7972k;
            int i8 = (this.a * 4) + ((ByteBuffer) c1846b.f7975n).getInt(i7) + i7 + 4;
            int i9 = ((ByteBuffer) c1846b.f7975n).getInt(i8) + i8;
            ByteBuffer byteBuffer = (ByteBuffer) c1846b.f7975n;
            c1845a.f7975n = byteBuffer;
            if (byteBuffer != null) {
                c1845a.f7972k = i9;
                int i10 = i9 - byteBuffer.getInt(i9);
                c1845a.f7973l = i10;
                c1845a.f7974m = ((ByteBuffer) c1845a.f7975n).getShort(i10);
                return c1845a;
            }
            c1845a.f7972k = 0;
            c1845a.f7973l = 0;
            c1845a.f7974m = 0;
        }
        return c1845a;
    }

    public final String toString() {
        int i7;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C1845a c1845aB = b();
        int iA = c1845aB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) c1845aB.f7975n).getInt(iA + c1845aB.f7972k) : 0));
        sb.append(", codepoints:");
        C1845a c1845aB2 = b();
        int iA2 = c1845aB2.a(16);
        if (iA2 != 0) {
            int i8 = iA2 + c1845aB2.f7972k;
            i7 = ((ByteBuffer) c1845aB2.f7975n).getInt(((ByteBuffer) c1845aB2.f7975n).getInt(i8) + i8);
        } else {
            i7 = 0;
        }
        for (int i9 = 0; i9 < i7; i9++) {
            sb.append(Integer.toHexString(a(i9)));
            sb.append(ServerSentEventKt.SPACE);
        }
        return sb.toString();
    }
}
