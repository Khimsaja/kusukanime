package L;

import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.C0525y;
import h0.C0998u;

/* loaded from: classes.dex */
public abstract class S1 {
    public static final O.S0 a = new O.S0(O.f5278u);

    /* renamed from: b, reason: collision with root package name */
    public static final C0525y f5339b = new C0525y(O.f5277t);

    /* renamed from: c, reason: collision with root package name */
    public static final T1 f5340c;

    /* renamed from: d, reason: collision with root package name */
    public static final T1 f5341d;

    static {
        long j7 = C0998u.f11834g;
        f5340c = new T1(true, Float.NaN, j7);
        f5341d = new T1(false, Float.NaN, j7);
    }

    public static final q.M a(boolean z7, float f5, C0510p c0510p, int i7, int i8) {
        q.M t12;
        boolean z8 = true;
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        if ((i8 & 2) != 0) {
            f5 = Float.NaN;
        }
        long j7 = C0998u.f11834g;
        c0510p.R(-1280632857);
        if (((Boolean) c0510p.k(a)).booleanValue()) {
            p.A0 a02 = K.u.a;
            O.Z zN = C0486d.N(new C0998u(j7), c0510p);
            boolean z9 = (((i7 & 14) ^ 6) > 4 && c0510p.g(z7)) || (i7 & 6) == 4;
            if ((((i7 & 112) ^ 48) <= 32 || !c0510p.c(f5)) && (i7 & 48) != 32) {
                z8 = false;
            }
            boolean z10 = z9 | z8;
            Object objH = c0510p.H();
            if (z10 || objH == C0502l.a) {
                objH = new K.f(z7, f5, zN);
                c0510p.b0(objH);
            }
            t12 = (K.f) objH;
        } else if (T0.e.a(f5, Float.NaN) && C0998u.c(j7, j7)) {
            t12 = z7 ? f5340c : f5341d;
        } else {
            t12 = new T1(z7, f5, j7);
        }
        c0510p.p(false);
        return t12;
    }
}
