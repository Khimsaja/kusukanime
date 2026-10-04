package p;

import O.C0486d;
import O.C0502l;
import O.C0510p;

/* loaded from: classes.dex */
public abstract class z0 {
    public static final Object a = z1.c.B(O3.j.f7526l, v0.f14150l);

    /* JADX WARN: Type inference failed for: r2v4, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r4v3, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v5, types: [e4.k, kotlin.jvm.internal.m] */
    public static final p0 a(u0 u0Var, B0 b02, String str, C0510p c0510p, int i7, int i8) {
        o0 o0Var;
        if ((i8 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = c0510p.f(u0Var);
        Object objH = c0510p.H();
        Object obj = C0502l.a;
        if (zF || objH == obj) {
            objH = new p0(u0Var, b02, str);
            c0510p.b0(objH);
        }
        p0 p0Var = (p0) objH;
        boolean zF2 = c0510p.f(u0Var) | c0510p.h(p0Var);
        Object objH2 = c0510p.H();
        if (zF2 || objH2 == obj) {
            objH2 = new C1724K(3, u0Var, p0Var);
            c0510p.b0(objH2);
        }
        C0486d.c(p0Var, (e4.k) objH2, c0510p);
        if (u0Var.g() && (o0Var = (o0) p0Var.f14090b.getValue()) != null) {
            ?? r2 = o0Var.f14086m;
            u0 u0Var2 = p0Var.f14091c;
            o0Var.f14084k.g(r2.invoke(u0Var2.f().a()), o0Var.f14086m.invoke(u0Var2.f().c()), (InterfaceC1715B) o0Var.f14085l.invoke(u0Var2.f()));
        }
        return p0Var;
    }

    public static final s0 b(u0 u0Var, Object obj, Object obj2, InterfaceC1715B interfaceC1715B, B0 b02, C0510p c0510p, int i7) {
        boolean zF = c0510p.f(u0Var);
        Object objH = c0510p.H();
        Object obj3 = C0502l.a;
        if (zF || objH == obj3) {
            AbstractC1766r abstractC1766r = (AbstractC1766r) b02.a.invoke(obj2);
            abstractC1766r.d();
            objH = new s0(u0Var, obj, abstractC1766r, b02);
            c0510p.b0(objH);
        }
        s0 s0Var = (s0) objH;
        if (u0Var.g()) {
            s0Var.g(obj, obj2, interfaceC1715B);
        } else {
            s0Var.h(obj2, interfaceC1715B);
        }
        boolean zF2 = c0510p.f(u0Var) | c0510p.f(s0Var);
        Object objH2 = c0510p.H();
        if (zF2 || objH2 == obj3) {
            objH2 = new C1724K(4, u0Var, s0Var);
            c0510p.b0(objH2);
        }
        C0486d.c(s0Var, (e4.k) objH2, c0510p);
        return s0Var;
    }

    public static final u0 c(Q4.c cVar, String str, C0510p c0510p, int i7) {
        int i8 = (i7 & 14) ^ 6;
        boolean z7 = true;
        boolean z8 = (i8 > 4 && c0510p.f(cVar)) || (i7 & 6) == 4;
        Object objH = c0510p.H();
        Object obj = C0502l.a;
        if (z8 || objH == obj) {
            objH = new u0(cVar, null, str);
            c0510p.b0(objH);
        }
        u0 u0Var = (u0) objH;
        if (cVar instanceof C1746d0) {
            c0510p.R(1030413636);
            C1746d0 c1746d0 = (C1746d0) cVar;
            Object value = c1746d0.f13983m.getValue();
            Object value2 = c1746d0.f13982l.getValue();
            if ((i8 <= 4 || !c0510p.f(cVar)) && (i7 & 6) != 4) {
                z7 = false;
            }
            Object objH2 = c0510p.H();
            if (z7 || objH2 == obj) {
                objH2 = new w0(cVar, null);
                c0510p.b0(objH2);
            }
            C0486d.f(value, value2, (e4.n) objH2, c0510p);
            c0510p.p(false);
        } else {
            c0510p.R(1030875195);
            u0Var.a(cVar.w0(), c0510p, 0);
            c0510p.p(false);
        }
        boolean zF = c0510p.f(u0Var);
        Object objH3 = c0510p.H();
        if (zF || objH3 == obj) {
            objH3 = new y0(u0Var, 0);
            c0510p.b0(objH3);
        }
        C0486d.c(u0Var, (e4.k) objH3, c0510p);
        return u0Var;
    }

    public static final u0 d(Object obj, String str, C0510p c0510p, int i7) {
        Object objH = c0510p.H();
        O.T t7 = C0502l.a;
        if (objH == t7) {
            objH = new u0(new C1727N(obj), null, str);
            c0510p.b0(objH);
        }
        u0 u0Var = (u0) objH;
        u0Var.a(obj, c0510p, (i7 & 8) | 48 | (i7 & 14));
        Object objH2 = c0510p.H();
        if (objH2 == t7) {
            objH2 = new y0(u0Var, 1);
            c0510p.b0(objH2);
        }
        C0486d.c(u0Var, (e4.k) objH2, c0510p);
        return u0Var;
    }
}
