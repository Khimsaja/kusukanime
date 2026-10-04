package n5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import u4.InterfaceC2099e;

/* loaded from: classes.dex */
public abstract class Y {
    public static final p5.i a = p5.l.c(p5.k.f14448v, new String[0]);

    /* renamed from: b, reason: collision with root package name */
    public static final p5.i f13385b = p5.l.c(p5.k.f14445s, new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final X f13386c = new X("NO_EXPECTED_TYPE");

    /* renamed from: d, reason: collision with root package name */
    public static final X f13387d = new X("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r27) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.Y.a(int):void");
    }

    public static boolean b(AbstractC1586x abstractC1586x) {
        if (abstractC1586x == null) {
            a(28);
            throw null;
        }
        if (abstractC1586x.u0()) {
            return true;
        }
        return AbstractC1566c.l(abstractC1586x) && b(((AbstractC1580q) abstractC1586x.w0()).f13408m);
    }

    public static boolean c(AbstractC1586x abstractC1586x, e4.k kVar, w5.h hVar) {
        if (abstractC1586x == null) {
            return false;
        }
        a0 a0VarW0 = abstractC1586x.w0();
        if (l(abstractC1586x)) {
            return ((Boolean) kVar.invoke(a0VarW0)).booleanValue();
        }
        if (hVar != null && hVar.contains(abstractC1586x)) {
            return false;
        }
        if (((Boolean) kVar.invoke(a0VarW0)).booleanValue()) {
            return true;
        }
        if (hVar == null) {
            hVar = new w5.h();
        }
        hVar.add(abstractC1586x);
        AbstractC1580q abstractC1580q = a0VarW0 instanceof AbstractC1580q ? (AbstractC1580q) a0VarW0 : null;
        if (abstractC1580q != null && (c(abstractC1580q.f13407l, kVar, hVar) || c(abstractC1580q.f13408m, kVar, hVar))) {
            return true;
        }
        if ((a0VarW0 instanceof C1575l) && c(((C1575l) a0VarW0).f13402l, kVar, hVar)) {
            return true;
        }
        M mT0 = abstractC1586x.t0();
        if (mT0 instanceof C1585w) {
            Iterator it = ((C1585w) mT0).f13418b.iterator();
            while (it.hasNext()) {
                if (c((AbstractC1586x) it.next(), kVar, hVar)) {
                    return true;
                }
            }
            return false;
        }
        for (Q q6 : abstractC1586x.q0()) {
            if (!q6.c() && c(q6.b(), kVar, hVar)) {
                return true;
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new G(((u4.Q) it.next()).g()));
        }
        return P3.q.S0(arrayList);
    }

    public static boolean e(AbstractC1586x abstractC1586x) {
        if (abstractC1586x == null) {
            a(27);
            throw null;
        }
        if (!abstractC1586x.u0() && (!AbstractC1566c.l(abstractC1586x) || !e(((AbstractC1580q) abstractC1586x.w0()).f13408m))) {
            if (!(abstractC1586x.w0() instanceof C1575l)) {
                if (f(abstractC1586x)) {
                    if (!(abstractC1586x.t0().f() instanceof InterfaceC2099e)) {
                        V vD = V.d(abstractC1586x);
                        Collection<AbstractC1586x> collectionG = abstractC1586x.t0().g();
                        ArrayList arrayList = new ArrayList(collectionG.size());
                        for (AbstractC1586x abstractC1586x2 : collectionG) {
                            if (abstractC1586x2 == null) {
                                a(21);
                                throw null;
                            }
                            AbstractC1586x abstractC1586xI = vD.i(abstractC1586x2, b0.f13390m);
                            AbstractC1586x abstractC1586xH = abstractC1586xI != null ? h(abstractC1586xI, abstractC1586x.u0()) : null;
                            if (abstractC1586xH != null) {
                                arrayList.add(abstractC1586xH);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((AbstractC1586x) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                M mT0 = abstractC1586x.t0();
                if (mT0 instanceof C1585w) {
                    Iterator it2 = ((C1585w) mT0).f13418b.iterator();
                    while (it2.hasNext()) {
                        if (e((AbstractC1586x) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(AbstractC1586x abstractC1586x) {
        if (abstractC1586x == null) {
            a(60);
            throw null;
        }
        if ((abstractC1586x.t0().f() instanceof u4.Q ? (u4.Q) abstractC1586x.t0().f() : null) != null) {
            return true;
        }
        abstractC1586x.t0();
        return false;
    }

    public static a0 g(AbstractC1586x abstractC1586x, boolean z7) {
        if (abstractC1586x == null) {
            a(3);
            throw null;
        }
        a0 a0VarX0 = abstractC1586x.w0().x0(z7);
        if (a0VarX0 != null) {
            return a0VarX0;
        }
        a(4);
        throw null;
    }

    public static AbstractC1586x h(AbstractC1586x abstractC1586x, boolean z7) {
        if (abstractC1586x != null) {
            return z7 ? g(abstractC1586x, true) : abstractC1586x;
        }
        a(8);
        throw null;
    }

    public static B i(B b4, boolean z7) {
        if (b4 == null) {
            a(5);
            throw null;
        }
        if (!z7) {
            return b4;
        }
        B bX0 = b4.x0(true);
        if (bX0 != null) {
            return bX0;
        }
        a(6);
        throw null;
    }

    public static G j(u4.Q q6) {
        if (q6 != null) {
            return new G(q6);
        }
        a(45);
        throw null;
    }

    public static Q k(u4.Q q6, M4.a aVar) {
        if (q6 != null) {
            return aVar.a == W.f13381k ? new G(AbstractC1566c.x(q6)) : new G(q6);
        }
        a(46);
        throw null;
    }

    public static boolean l(AbstractC1586x abstractC1586x) {
        if (abstractC1586x != null) {
            return abstractC1586x == f13386c || abstractC1586x == f13387d;
        }
        a(0);
        throw null;
    }
}
