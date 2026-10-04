package y0;

import h0.C0976V;
import io.ktor.util.GzipHeaderFlags;
import z0.C2471u;

/* renamed from: y0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2358e extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final C2358e f17839m = new C2358e(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2358e f17840n = new C2358e(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C2358e f17841o = new C2358e(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C2358e f17842p = new C2358e(1, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final C2358e f17843q = new C2358e(1, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final C2358e f17844r = new C2358e(1, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final C2358e f17845s = new C2358e(1, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final C2358e f17846t = new C2358e(1, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final C2358e f17847u = new C2358e(1, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final C2358e f17848v = new C2358e(1, 9);

    /* renamed from: w, reason: collision with root package name */
    public static final C2358e f17849w = new C2358e(1, 10);

    /* renamed from: x, reason: collision with root package name */
    public static final C2358e f17850x = new C2358e(1, 11);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17851l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2358e(int i7, int i8) {
        super(i7);
        this.f17851l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f17851l) {
            case 0:
                ((C2356c) obj).I0();
                break;
            case 1:
                i0 i0Var = (i0) obj;
                if (i0Var.z()) {
                    i0Var.f17870l.p0(i0Var);
                }
                break;
            case 2:
                d0 d0Var = ((Y) obj).f17824N;
                if (d0Var != null) {
                    d0Var.invalidate();
                }
                break;
            case 3:
                Y y7 = (Y) obj;
                if (y7.z()) {
                    C2373u c2373u = y7.J;
                    if (c2373u == null) {
                        y7.l1(true);
                    } else {
                        C2373u c2373u2 = Y.f17809P;
                        c2373u2.getClass();
                        c2373u2.a = c2373u.a;
                        c2373u2.f17896b = c2373u.f17896b;
                        c2373u2.f17897c = c2373u.f17897c;
                        c2373u2.f17898d = c2373u.f17898d;
                        y7.l1(true);
                        if (c2373u2.a != c2373u.a || c2373u2.f17896b != c2373u.f17896b || c2373u2.f17897c != c2373u.f17897c || !C0976V.a(c2373u2.f17898d, c2373u.f17898d)) {
                            C2349D c2349d = y7.f17825v;
                            K k7 = c2349d.f17661H;
                            if (k7.f17757n > 0) {
                                if (k7.f17756m || k7.f17755l) {
                                    c2349d.S(false);
                                }
                                k7.f17761r.v0();
                            }
                            C2471u c2471u = c2349d.f17679s;
                            if (c2471u != null) {
                                ((Q.d) c2471u.f18868R.f17787e.f13378l).b(c2349d);
                                c2349d.f17667P = true;
                                c2471u.A(null);
                            }
                        }
                    }
                }
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                b0 b0Var = (b0) obj;
                if (b0Var.z()) {
                    b0Var.f17832k.K();
                }
                break;
            case 5:
                C2349D c2349d2 = (C2349D) obj;
                if (c2349d2.E()) {
                    c2349d2.S(false);
                }
                break;
            case 6:
                C2349D c2349d3 = (C2349D) obj;
                if (c2349d3.E()) {
                    c2349d3.S(false);
                }
                break;
            case 7:
                C2349D c2349d4 = (C2349D) obj;
                if (c2349d4.E()) {
                    c2349d4.Q(false);
                }
                break;
            case 8:
                C2349D c2349d5 = (C2349D) obj;
                if (c2349d5.E()) {
                    c2349d5.Q(false);
                }
                break;
            case 9:
                C2349D c2349d6 = (C2349D) obj;
                if (c2349d6.E()) {
                    C2349D.R(c2349d6, false, 7);
                }
                break;
            case 10:
                C2349D c2349d7 = (C2349D) obj;
                if (c2349d7.E()) {
                    C2349D.T(c2349d7, false, 7);
                }
                break;
            default:
                C2349D c2349d8 = (C2349D) obj;
                if (c2349d8.E()) {
                    c2349d8.C();
                }
                break;
        }
        return O3.C.a;
    }
}
