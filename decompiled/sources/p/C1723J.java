package p;

import O.C0486d;
import O.C0493g0;
import O.C0502l;
import O.C0509o0;
import O.C0510p;

/* renamed from: p.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1723J {
    public final Q.d a = new Q.d(new C1720G[16]);

    /* renamed from: b, reason: collision with root package name */
    public final C0493g0 f13884b;

    /* renamed from: c, reason: collision with root package name */
    public long f13885c;

    /* renamed from: d, reason: collision with root package name */
    public final C0493g0 f13886d;

    public C1723J() {
        Boolean bool = Boolean.FALSE;
        O.T t7 = O.T.f7049p;
        this.f13884b = C0486d.K(bool, t7);
        this.f13885c = Long.MIN_VALUE;
        this.f13886d = C0486d.K(Boolean.TRUE, t7);
    }

    public final void a(int i7, C0510p c0510p) {
        c0510p.T(-318043801);
        if ((((c0510p.h(this) ? 4 : 2) | i7) & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            Object objH = c0510p.H();
            O.T t7 = C0502l.a;
            if (objH == t7) {
                objH = C0486d.K(null, O.T.f7049p);
                c0510p.b0(objH);
            }
            O.Z z7 = (O.Z) objH;
            if (((Boolean) this.f13886d.getValue()).booleanValue() || ((Boolean) this.f13884b.getValue()).booleanValue()) {
                c0510p.R(1719915818);
                boolean zH = c0510p.h(this);
                Object objH2 = c0510p.H();
                if (zH || objH2 == t7) {
                    objH2 = new C1722I(z7, this, null);
                    c0510p.b0(objH2);
                }
                C0486d.e(c0510p, (e4.n) objH2, this);
                c0510p.p(false);
            } else {
                c0510p.R(1721436120);
                c0510p.p(false);
            }
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new D.S(i7, 17, this);
        }
    }
}
