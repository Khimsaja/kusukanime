package H1;

import B1.AbstractC0015b;
import io.ktor.client.utils.CIOKt;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: H1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230k {
    public final R1.f a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3518b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3519c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3520d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3521e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3522f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3523g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3524h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f3525i;

    /* renamed from: j, reason: collision with root package name */
    public long f3526j;

    public C0230k(R1.f fVar, int i7, int i8, boolean z7, int i9) {
        a(CIOKt.DEFAULT_HTTP_POOL_SIZE, 0, "bufferForPlaybackMs", "0");
        a(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i7, CIOKt.DEFAULT_HTTP_POOL_SIZE, "minBufferMs", "bufferForPlaybackMs");
        a(i7, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i8, i7, "maxBufferMs", "minBufferMs");
        a(i9, 0, "backBufferDurationMs", "0");
        this.a = fVar;
        this.f3518b = B1.K.F(i7);
        this.f3519c = B1.K.F(i8);
        this.f3520d = B1.K.F(CIOKt.DEFAULT_HTTP_POOL_SIZE);
        this.f3521e = B1.K.F(2000);
        this.f3522f = -1;
        this.f3523g = z7;
        this.f3524h = B1.K.F(i9);
        this.f3525i = new HashMap();
        this.f3526j = -1L;
    }

    public static void a(int i7, int i8, String str, String str2) {
        AbstractC0015b.b(str + " cannot be less than " + str2, i7 >= i8);
    }

    public final int b() {
        Iterator it = this.f3525i.values().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((C0229j) it.next()).f3507b;
        }
        return i7;
    }

    public final boolean c(M m7) {
        int i7;
        C0229j c0229j = (C0229j) this.f3525i.get(m7.a);
        c0229j.getClass();
        R1.f fVar = this.a;
        synchronized (fVar) {
            i7 = fVar.f8040d * fVar.f8038b;
        }
        boolean z7 = true;
        boolean z8 = i7 >= b();
        float f5 = m7.f3338c;
        long j7 = this.f3519c;
        long jMin = this.f3518b;
        if (f5 > 1.0f) {
            jMin = Math.min(B1.K.t(f5, jMin), j7);
        }
        long jMax = Math.max(jMin, 500000L);
        long j8 = m7.f3337b;
        if (j8 < jMax) {
            if (!this.f3523g && z8) {
                z7 = false;
            }
            c0229j.a = z7;
            if (!z7 && j8 < 500000) {
                AbstractC0015b.v("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j8 >= j7 || z8) {
            c0229j.a = false;
        }
        return c0229j.a;
    }

    public final void d() {
        if (!this.f3525i.isEmpty()) {
            this.a.a(b());
            return;
        }
        R1.f fVar = this.a;
        synchronized (fVar) {
            if (fVar.a) {
                fVar.a(0);
            }
        }
    }
}
