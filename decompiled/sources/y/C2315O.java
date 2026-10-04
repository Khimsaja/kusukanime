package y;

import H.C0184a;
import O.C0486d;
import O.C0493g0;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.S0;
import e4.InterfaceC0821a;
import java.util.LinkedHashSet;
import java.util.Map;
import p.C1724K;

/* renamed from: y.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2315O implements X.j, X.c {
    public final X.k a;

    /* renamed from: b, reason: collision with root package name */
    public final C0493g0 f17596b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f17597c;

    public C2315O(X.j jVar, Map map) {
        C2313M c2313m = new C2313M(jVar, 0);
        S0 s02 = X.l.a;
        this.a = new X.k(map, c2313m);
        this.f17596b = C0486d.K(null, O.T.f7049p);
        this.f17597c = new LinkedHashSet();
    }

    @Override // X.c
    public final void a(Object obj, W.a aVar, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(-697180401);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.h(obj) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.h(aVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.h(this) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            X.c cVar = (X.c) this.f17596b.getValue();
            if (cVar == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            cVar.a(obj, aVar, c0510p, i8 & 126);
            boolean zH = c0510p.h(this) | c0510p.h(obj);
            Object objH = c0510p.H();
            if (zH || objH == C0502l.a) {
                objH = new C1724K(27, this, obj);
                c0510p.b0(objH);
            }
            C0486d.c(obj, (e4.k) objH, c0510p);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0184a(this, obj, aVar, i7, 9);
        }
    }

    @Override // X.j
    public final boolean b(Object obj) {
        return this.a.b(obj);
    }

    @Override // X.j
    public final Object c(String str) {
        return this.a.c(str);
    }

    @Override // X.j
    public final X.i d(String str, InterfaceC0821a interfaceC0821a) {
        return this.a.d(str, interfaceC0821a);
    }

    @Override // X.c
    public final void e(Object obj) {
        X.c cVar = (X.c) this.f17596b.getValue();
        if (cVar == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        cVar.e(obj);
    }
}
