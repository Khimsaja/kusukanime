package p;

import O.C0486d;
import O.C0502l;
import O.C0510p;
import e4.InterfaceC0821a;

/* renamed from: p.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1745d {
    public static final C1762n a = new C1762n(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final C1763o f13972b = new C1763o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final C1764p f13973c = new C1764p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final C1765q f13974d = new C1765q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final C1762n f13975e = new C1762n(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final C1763o f13976f = new C1763o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final C1764p f13977g = new C1764p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final C1765q f13978h = new C1765q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static C1743c a(float f5) {
        return new C1743c(Float.valueOf(f5), C0.a, Float.valueOf(0.01f), 8);
    }

    public static C1761m b(float f5, float f7) {
        return new C1761m(C0.a, Float.valueOf(f5), new C1762n(f7), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final Object c(float f5, float f7, float f8, InterfaceC1760l interfaceC1760l, e4.n nVar, U3.j jVar) throws Throwable {
        B0 b02 = C0.a;
        Float f9 = new Float(f5);
        Float f10 = new Float(f7);
        C1762n c1762n = new C1762n(new Float(f8).floatValue());
        Object objD = d(new C1761m(b02, f9, c1762n, 56), new n0(interfaceC1760l, b02, f9, f10, c1762n), Long.MIN_VALUE, new O.V(nVar), jVar);
        T3.a aVar = T3.a.f9048k;
        O3.C c2 = O3.C.a;
        if (objD != aVar) {
            objD = c2;
        }
        return objD == aVar ? objD : c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(p.C1761m r23, p.InterfaceC1753h r24, long r25, e4.k r27, U3.c r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.AbstractC1745d.d(p.m, p.h, long, e4.k, U3.c):java.lang.Object");
    }

    public static /* synthetic */ Object e(float f5, float f7, InterfaceC1760l interfaceC1760l, e4.n nVar, U3.j jVar, int i7) {
        if ((i7 & 8) != 0) {
            interfaceC1760l = p(7, null);
        }
        return c(f5, f7, 0.0f, interfaceC1760l, nVar, jVar);
    }

    public static final Object f(C1761m c1761m, C1772x c1772x, boolean z7, e4.k kVar, U3.c cVar) throws Throwable {
        Object objD = d(c1761m, new C1771w(c1772x, c1761m.f14047k, c1761m.f14048l.getValue(), c1761m.f14049m), z7 ? c1761m.f14050n : Long.MIN_VALUE, kVar, cVar);
        return objD == T3.a.f9048k ? objD : O3.C.a;
    }

    public static final C1720G g(C1723J c1723j, float f5, C1719F c1719f, C0510p c0510p) {
        return j(c1723j, Float.valueOf(0.0f), Float.valueOf(f5), C0.a, c1719f, c0510p, 33208, 0);
    }

    public static final Object h(C1761m c1761m, Float f5, C1752g0 c1752g0, boolean z7, e4.k kVar, U3.c cVar) throws Throwable {
        Object objD = d(c1761m, new n0(c1752g0, c1761m.f14047k, c1761m.f14048l.getValue(), f5, c1761m.f14049m), z7 ? c1761m.f14050n : Long.MIN_VALUE, kVar, cVar);
        return objD == T3.a.f9048k ? objD : O3.C.a;
    }

    public static final C1720G j(C1723J c1723j, Number number, Number number2, B0 b02, C1719F c1719f, C0510p c0510p, int i7, int i8) {
        Object objH = c0510p.H();
        O.T t7 = C0502l.a;
        if (objH == t7) {
            C1720G c1720g = new C1720G(c1723j, number, number2, b02, c1719f);
            c0510p.b0(c1720g);
            objH = c1720g;
        }
        C1720G c1720g2 = (C1720G) objH;
        boolean z7 = (((57344 & i7) ^ 24576) > 16384 && c0510p.h(c1719f)) || (i7 & 24576) == 16384;
        Object objH2 = c0510p.H();
        if (z7 || objH2 == t7) {
            D.J j7 = new D.J(number, c1720g2, number2, c1719f, 4);
            c0510p.b0(j7);
            objH2 = j7;
        }
        C0486d.g((InterfaceC0821a) objH2, c0510p);
        boolean zH = c0510p.h(c1723j);
        Object objH3 = c0510p.H();
        if (zH || objH3 == t7) {
            objH3 = new C1724K(0, c1723j, c1720g2);
            c0510p.b0(objH3);
        }
        C0486d.c(c1720g2, (e4.k) objH3, c0510p);
        return c1720g2;
    }

    public static final AbstractC1766r k(AbstractC1766r abstractC1766r) {
        AbstractC1766r abstractC1766rC = abstractC1766r.c();
        int iB = abstractC1766rC.b();
        for (int i7 = 0; i7 < iB; i7++) {
            abstractC1766rC.e(abstractC1766r.a(i7), i7);
        }
        return abstractC1766rC;
    }

    public static C1761m l(C1761m c1761m, float f5, float f7, int i7) {
        if ((i7 & 1) != 0) {
            f5 = ((Number) c1761m.f14048l.getValue()).floatValue();
        }
        if ((i7 & 2) != 0) {
            f7 = ((C1762n) c1761m.f14049m).a;
        }
        return new C1761m(c1761m.f14047k, Float.valueOf(f5), new C1762n(f7), c1761m.f14050n, c1761m.f14051o, c1761m.f14052p);
    }

    public static final void m(C1759k c1759k, long j7, float f5, InterfaceC1753h interfaceC1753h, C1761m c1761m, e4.k kVar) {
        long jC = f5 == 0.0f ? interfaceC1753h.c() : (long) ((j7 - c1759k.f14028c) / f5);
        c1759k.f14032g = j7;
        c1759k.f14030e.setValue(interfaceC1753h.b(jC));
        c1759k.f14031f = interfaceC1753h.f(jC);
        if (interfaceC1753h.g(jC)) {
            c1759k.f14033h = c1759k.f14032g;
            c1759k.f14034i.setValue(Boolean.FALSE);
        }
        r(c1759k, c1761m);
        kVar.invoke(c1759k);
    }

    public static final float n(S3.h hVar) {
        a0.r rVar = (a0.r) hVar.get(a0.b.f10396z);
        float fO = rVar != null ? rVar.O() : 1.0f;
        if (fO >= 0.0f) {
            return fO;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static C1719F o(InterfaceC1773y interfaceC1773y) {
        return new C1719F(interfaceC1773y, 0);
    }

    public static C1752g0 p(int i7, Object obj) {
        float f5 = (i7 & 2) != 0 ? 1500.0f : 400.0f;
        if ((i7 & 4) != 0) {
            obj = null;
        }
        return new C1752g0(1.0f, f5, obj);
    }

    public static A0 q(int i7, int i8, InterfaceC1774z interfaceC1774z, int i9) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            interfaceC1774z = AbstractC1714A.a;
        }
        return new A0(i7, i8, interfaceC1774z);
    }

    public static final void r(C1759k c1759k, C1761m c1761m) {
        c1761m.f14048l.setValue(c1759k.f14030e.getValue());
        AbstractC1766r abstractC1766r = c1761m.f14049m;
        AbstractC1766r abstractC1766r2 = c1759k.f14031f;
        int iB = abstractC1766r.b();
        for (int i7 = 0; i7 < iB; i7++) {
            abstractC1766r.e(abstractC1766r2.a(i7), i7);
        }
        c1761m.f14051o = c1759k.f14033h;
        c1761m.f14050n = c1759k.f14032g;
        c1761m.f14052p = ((Boolean) c1759k.f14034i.getValue()).booleanValue();
    }
}
