package L;

import O.C0510p;
import h0.C0998u;

/* renamed from: L.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0414s {
    public static final v.Z a;

    /* renamed from: b, reason: collision with root package name */
    public static final v.Z f5778b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5779c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f5780d;

    static {
        float f5 = 24;
        float f7 = 8;
        a = new v.Z(f5, f7, f5, f7);
        float f8 = 16;
        androidx.compose.foundation.layout.a.b(f8, f7, f5, f7);
        float f9 = 12;
        f5778b = new v.Z(f9, f7, f9, f7);
        androidx.compose.foundation.layout.a.b(f9, f7, f8, f7);
        f5779c = 58;
        f5780d = 40;
        float f10 = N.f.a;
    }

    public static r a(long j7, long j8, C0510p c0510p) {
        long j9 = C0998u.f11834g;
        r rVarB = b((N) c0510p.k(P.a));
        long j10 = j7 != 16 ? j7 : rVarB.a;
        long j11 = j8 != 16 ? j8 : rVarB.f5753b;
        long j12 = j9 != 16 ? j9 : rVarB.f5754c;
        if (j9 == 16) {
            j9 = rVarB.f5755d;
        }
        return new r(j10, j11, j12, j9);
    }

    public static r b(N n7) {
        r rVar = n7.f5232K;
        if (rVar != null) {
            return rVar;
        }
        float f5 = N.f.a;
        r rVar2 = new r(P.c(n7, 26), P.c(n7, N.f.f6654h), C0998u.b(0.12f, P.c(n7, N.f.f6649c)), C0998u.b(0.38f, P.c(n7, N.f.f6651e)));
        n7.f5232K = rVar2;
        return rVar2;
    }
}
