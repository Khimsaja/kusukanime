package w0;

import io.ktor.util.GzipHeaderFlags;

/* renamed from: w0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2178M implements d0, InterfaceC2192j {

    /* renamed from: l, reason: collision with root package name */
    public static final C2178M f16835l = new C2178M(0);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16836k;

    public /* synthetic */ C2178M(int i7) {
        this.f16836k = i7;
    }

    @Override // w0.InterfaceC2192j
    public long a(long j7, long j8) {
        switch (this.f16836k) {
            case 1:
                float fMax = Math.max(g0.f.d(j8) / g0.f.d(j7), g0.f.b(j8) / g0.f.b(j7));
                return X.a(fMax, fMax);
            case 2:
                float fMin = Math.min(g0.f.d(j8) / g0.f.d(j7), g0.f.b(j8) / g0.f.b(j7));
                return X.a(fMin, fMin);
            default:
                if (g0.f.d(j7) <= g0.f.d(j8) && g0.f.b(j7) <= g0.f.b(j8)) {
                    return X.a(1.0f, 1.0f);
                }
                float fMin2 = Math.min(g0.f.d(j8) / g0.f.d(j7), g0.f.b(j8) / g0.f.b(j7));
                return X.a(fMin2, fMin2);
        }
    }

    @Override // w0.d0
    public void d(c0 c0Var) {
        c0Var.clear();
    }

    @Override // w0.d0
    public boolean e(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.f16836k) {
            case GzipHeaderFlags.EXTRA /* 4 */:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
