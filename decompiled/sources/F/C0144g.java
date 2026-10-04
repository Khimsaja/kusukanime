package F;

import D.C0042b;
import D.C0056i;
import D.r0;
import H0.H;
import H5.u0;
import K5.M;
import K5.N;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import y0.AbstractC2359f;
import z0.AbstractC2455l0;
import z0.C2457m0;
import z0.N0;

/* renamed from: F.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144g implements N0.r {
    public y a;

    /* renamed from: b, reason: collision with root package name */
    public u0 f2024b;

    /* renamed from: c, reason: collision with root package name */
    public C f2025c;

    /* renamed from: d, reason: collision with root package name */
    public M f2026d;

    @Override // N0.r
    public final void a() {
        j(null);
    }

    @Override // N0.r
    public final void b() {
        N0 n02;
        y yVar = this.a;
        if (yVar == null || (n02 = (N0) AbstractC2359f.i(yVar, AbstractC2455l0.f18795n)) == null) {
            return;
        }
        ((C2457m0) n02).b();
    }

    @Override // N0.r
    public final void c(N0.w wVar, N0.w wVar2) {
        C c2 = this.f2025c;
        if (c2 != null) {
            boolean z7 = (H.a(c2.f1987h.f6896b, wVar2.f6896b) && kotlin.jvm.internal.l.a(c2.f1987h.f6897c, wVar2.f6897c)) ? false : true;
            c2.f1987h = wVar2;
            int size = c2.f1989j.size();
            for (int i7 = 0; i7 < size; i7++) {
                E e7 = (E) ((WeakReference) c2.f1989j.get(i7)).get();
                if (e7 != null) {
                    e7.f1998g = wVar2;
                }
            }
            z zVar = c2.f1992m;
            synchronized (zVar.f2047c) {
                zVar.f2054j = null;
                zVar.f2056l = null;
                zVar.f2055k = null;
                zVar.f2057m = null;
                zVar.f2058n = null;
            }
            if (kotlin.jvm.internal.l.a(wVar, wVar2)) {
                if (z7) {
                    w wVar3 = c2.f1981b;
                    int iE = H.e(wVar2.f6896b);
                    int iD = H.d(wVar2.f6896b);
                    H h7 = c2.f1987h.f6897c;
                    int iE2 = h7 != null ? H.e(h7.a) : -1;
                    H h8 = c2.f1987h.f6897c;
                    wVar3.x().updateSelection((View) wVar3.f2037l, iE, iD, iE2, h8 != null ? H.d(h8.a) : -1);
                    return;
                }
                return;
            }
            if (wVar != null && (!kotlin.jvm.internal.l.a(wVar.a.a, wVar2.a.a) || (H.a(wVar.f6896b, wVar2.f6896b) && !kotlin.jvm.internal.l.a(wVar.f6897c, wVar2.f6897c)))) {
                w wVar4 = c2.f1981b;
                wVar4.x().restartInput((View) wVar4.f2037l);
                return;
            }
            int size2 = c2.f1989j.size();
            for (int i8 = 0; i8 < size2; i8++) {
                E e8 = (E) ((WeakReference) c2.f1989j.get(i8)).get();
                if (e8 != null) {
                    N0.w wVar5 = c2.f1987h;
                    w wVar6 = c2.f1981b;
                    if (e8.f2002k) {
                        e8.f1998g = wVar5;
                        if (e8.f2000i) {
                            wVar6.x().updateExtractedText((View) wVar6.f2037l, e8.f1999h, q0.c.i(wVar5));
                        }
                        H h9 = wVar5.f6897c;
                        int iE3 = h9 != null ? H.e(h9.a) : -1;
                        H h10 = wVar5.f6897c;
                        int iD2 = h10 != null ? H.d(h10.a) : -1;
                        long j7 = wVar5.f6896b;
                        wVar6.x().updateSelection((View) wVar6.f2037l, H.e(j7), H.d(j7), iE3, iD2);
                    }
                }
            }
        }
    }

    @Override // N0.r
    public final void d(N0.w wVar, N0.l lVar, C0056i c0056i, D.A a) {
        j(new r0(wVar, this, lVar, c0056i, a));
    }

    @Override // N0.r
    public final void e() {
        N0 n02;
        y yVar = this.a;
        if (yVar == null || (n02 = (N0) AbstractC2359f.i(yVar, AbstractC2455l0.f18795n)) == null) {
            return;
        }
        ((C2457m0) n02).a();
    }

    @Override // N0.r
    public final void f() {
        u0 u0Var = this.f2024b;
        if (u0Var != null) {
            u0Var.e(null);
        }
        this.f2024b = null;
        K5.F fI = i();
        if (fI != null) {
            M m7 = (M) fI;
            synchronized (m7) {
                m7.s(m7.n() + m7.f4769u, m7.f4768t, m7.n() + m7.f4769u, m7.n() + m7.f4769u + m7.f4770v);
            }
        }
    }

    @Override // N0.r
    public final void g(g0.d dVar) {
        Rect rect;
        C c2 = this.f2025c;
        if (c2 != null) {
            c2.f1991l = new Rect(P3.F.W(dVar.a), P3.F.W(dVar.f11659b), P3.F.W(dVar.f11660c), P3.F.W(dVar.f11661d));
            if (!c2.f1989j.isEmpty() || (rect = c2.f1991l) == null) {
                return;
            }
            c2.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // N0.r
    public final void h(N0.w wVar, N0.q qVar, H0.F f5, C0042b c0042b, g0.d dVar, g0.d dVar2) {
        C c2 = this.f2025c;
        if (c2 != null) {
            z zVar = c2.f1992m;
            synchronized (zVar.f2047c) {
                try {
                    zVar.f2054j = wVar;
                    zVar.f2056l = qVar;
                    zVar.f2055k = f5;
                    zVar.f2057m = dVar;
                    zVar.f2058n = dVar2;
                    if (zVar.f2049e || zVar.f2048d) {
                        zVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final K5.F i() {
        M m7 = this.f2026d;
        if (m7 != null) {
            return m7;
        }
        if (!E.e.a) {
            return null;
        }
        M mA = N.a(2, J5.c.f4301m);
        this.f2026d = mA;
        return mA;
    }

    public final void j(r0 r0Var) {
        y yVar = this.a;
        if (yVar == null) {
            return;
        }
        u0 u0VarX = null;
        C0143f c0143f = new C0143f(r0Var, this, yVar, null);
        if (yVar.f10414w) {
            H5.A aU0 = yVar.u0();
            H5.B b4 = H5.B.f3790k;
            u0VarX = H5.D.x(aU0, null, new x(yVar, c0143f, null), 1);
        }
        this.f2024b = u0VarX;
    }

    public final void k(y yVar) {
        if (this.a == yVar) {
            this.a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + yVar + " but was " + this.a).toString());
    }
}
