package L4;

import A4.AbstractC0011d;
import A4.AbstractC0013f;
import B1.C0023j;
import D.x0;
import H4.AbstractC0249c;
import H4.AbstractC0251e;
import H4.AbstractC0252f;
import H4.C0250d;
import H4.G;
import P3.F;
import P3.J;
import b1.AbstractC0703b;
import e5.C0831a;
import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import j5.InterfaceC1358m;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m5.C1520i;
import m5.C1521j;
import m5.C1523l;
import n5.AbstractC1586x;
import n5.W;
import n5.Y;
import n5.a0;
import o5.C1712l;
import o5.InterfaceC1704d;
import r4.AbstractC1880i;
import r4.AbstractC1886o;
import u4.AbstractC2108n;
import u4.EnumC2117x;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import u4.K;
import u4.N;
import v4.C2158f;
import v4.C2159g;
import x4.C2264J;
import x4.C2265K;
import x4.C2266L;
import x4.C2272S;
import x4.C2295v;

/* loaded from: classes.dex */
public final class o extends z {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f6111v = 0;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC2099e f6112n;

    /* renamed from: o, reason: collision with root package name */
    public final A4.p f6113o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6114p;

    /* renamed from: q, reason: collision with root package name */
    public final C1520i f6115q;

    /* renamed from: r, reason: collision with root package name */
    public final C1520i f6116r;

    /* renamed from: s, reason: collision with root package name */
    public final C1520i f6117s;

    /* renamed from: t, reason: collision with root package name */
    public final C1520i f6118t;

    /* renamed from: u, reason: collision with root package name */
    public final C1521j f6119u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(A2.b bVar, InterfaceC2099e interfaceC2099e, A4.p pVar, boolean z7, o oVar) {
        super(bVar, oVar);
        kotlin.jvm.internal.l.f("c", bVar);
        kotlin.jvm.internal.l.f("ownerDescriptor", interfaceC2099e);
        kotlin.jvm.internal.l.f("jClass", pVar);
        this.f6112n = interfaceC2099e;
        this.f6113o = pVar;
        this.f6114p = z7;
        C1523l c1523l = ((K4.a) bVar.f110l).a;
        j jVar = new j(this, bVar);
        c1523l.getClass();
        this.f6115q = new C1520i(c1523l, jVar);
        k kVar = new k(this, 0);
        c1523l.getClass();
        this.f6116r = new C1520i(c1523l, kVar);
        j jVar2 = new j(bVar, this);
        c1523l.getClass();
        this.f6117s = new C1520i(c1523l, jVar2);
        k kVar2 = new k(this, 1);
        c1523l.getClass();
        this.f6118t = new C1520i(c1523l, kVar2);
        this.f6119u = c1523l.c(new l(0, this, bVar));
    }

    public static C2266L A(C2266L c2266l, InterfaceC2112s interfaceC2112s, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return c2266l;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            C2266L c2266l2 = (C2266L) it.next();
            if (!c2266l.equals(c2266l2) && c2266l2.f17490L == null && D(c2266l2, interfaceC2112s)) {
                InterfaceC2112s interfaceC2112sBuild = c2266l.f0().g().build();
                kotlin.jvm.internal.l.c(interfaceC2112sBuild);
                return (C2266L) interfaceC2112sBuild;
            }
        }
        return c2266l;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static x4.C2266L B(x4.C2266L r5) {
        /*
            java.util.List r0 = r5.m0()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.l.e(r1, r0)
            java.lang.Object r0 = P3.q.B0(r0)
            x4.S r0 = (x4.C2272S) r0
            r2 = 0
            if (r0 == 0) goto L7c
            r3 = r0
            x4.T r3 = (x4.AbstractC2273T) r3
            n5.x r3 = r3.getType()
            n5.M r3 = r3.t0()
            u4.h r3 = r3.f()
            if (r3 == 0) goto L36
            W4.d r3 = d5.e.h(r3)
            boolean r4 = r3.d()
            if (r4 == 0) goto L2e
            goto L2f
        L2e:
            r3 = r2
        L2f:
            if (r3 == 0) goto L36
            W4.c r3 = r3.i()
            goto L37
        L36:
            r3 = r2
        L37:
            W4.c r4 = r4.AbstractC1887p.f15024g
            boolean r3 = kotlin.jvm.internal.l.a(r3, r4)
            if (r3 == 0) goto L40
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L44
            goto L7c
        L44:
            u4.r r2 = r5.f0()
            java.util.List r5 = r5.m0()
            kotlin.jvm.internal.l.e(r1, r5)
            java.util.List r5 = P3.q.p0(r5)
            u4.r r5 = r2.b(r5)
            x4.T r0 = (x4.AbstractC2273T) r0
            n5.x r0 = r0.getType()
            java.util.List r0 = r0.q0()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            n5.Q r0 = (n5.Q) r0
            n5.x r0 = r0.b()
            u4.r r5 = r5.e(r0)
            u4.s r5 = r5.build()
            x4.L r5 = (x4.C2266L) r5
            if (r5 == 0) goto L7b
            r0 = 1
            r5.f17485E = r0
        L7b:
            return r5
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.o.B(x4.L):x4.L");
    }

    public static boolean D(InterfaceC2112s interfaceC2112s, InterfaceC2112s interfaceC2112s2) {
        int iB = Z4.k.f10274c.n(interfaceC2112s2, interfaceC2112s, true).b();
        AbstractC0703b.A(iB, "getResult(...)");
        return iB == 1 && !n6.m.w(interfaceC2112s2, interfaceC2112s);
    }

    public static boolean E(C2266L c2266l, C2266L c2266l2) {
        int i7 = AbstractC0249c.f3720l;
        kotlin.jvm.internal.l.f("<this>", c2266l);
        if (kotlin.jvm.internal.l.a(c2266l.getName().b(), "removeAt") && kotlin.jvm.internal.l.a(F.k(c2266l), G.f3706g.f3690e)) {
            c2266l2 = c2266l2.a();
        }
        kotlin.jvm.internal.l.c(c2266l2);
        return D(c2266l2, c2266l);
    }

    public static C2266L F(K k7, String str, e4.k kVar) {
        C2266L c2266l;
        Iterator it = ((Iterable) kVar.invoke(W4.e.e(str))).iterator();
        do {
            c2266l = null;
            if (!it.hasNext()) {
                break;
            }
            C2266L c2266l2 = (C2266L) it.next();
            if (c2266l2.m0().size() == 0) {
                C1712l c1712l = InterfaceC1704d.a;
                AbstractC1586x abstractC1586x = c2266l2.f17494q;
                if (abstractC1586x == null ? false : c1712l.b(abstractC1586x, k7.getType())) {
                    c2266l = c2266l2;
                }
            }
        } while (c2266l == null);
        return c2266l;
    }

    public static C2266L H(K k7, e4.k kVar) {
        C2266L c2266l;
        AbstractC1586x abstractC1586x;
        String strB = k7.getName().b();
        kotlin.jvm.internal.l.e("asString(...)", strB);
        Iterator it = ((Iterable) kVar.invoke(W4.e.e(H4.w.b(strB)))).iterator();
        do {
            c2266l = null;
            if (!it.hasNext()) {
                break;
            }
            C2266L c2266l2 = (C2266L) it.next();
            if (c2266l2.m0().size() == 1 && (abstractC1586x = c2266l2.f17494q) != null) {
                W4.e eVar = AbstractC1880i.f14937e;
                if (AbstractC1880i.D(abstractC1586x, AbstractC1886o.f14992d)) {
                    C1712l c1712l = InterfaceC1704d.a;
                    List listM0 = c2266l2.m0();
                    kotlin.jvm.internal.l.e("getValueParameters(...)", listM0);
                    if (c1712l.a(((C2272S) P3.q.K0(listM0)).getType(), k7.getType())) {
                        c2266l = c2266l2;
                    }
                }
            }
        } while (c2266l == null);
        return c2266l;
    }

    public static boolean K(C2266L c2266l, InterfaceC2112s interfaceC2112s) {
        String strJ = F.j(c2266l, 2);
        InterfaceC2112s interfaceC2112sA = interfaceC2112s.a();
        kotlin.jvm.internal.l.e("getOriginal(...)", interfaceC2112sA);
        return kotlin.jvm.internal.l.a(strJ, F.j(interfaceC2112sA, 2)) && !D(c2266l, interfaceC2112s);
    }

    public final boolean C(K k7, e4.k kVar) {
        if (F.F(k7)) {
            return false;
        }
        C2266L c2266lG = G(k7, kVar);
        C2266L c2266lH = H(k7, kVar);
        if (c2266lG == null) {
            return false;
        }
        if (k7.A()) {
            return c2266lH != null && c2266lH.e() == c2266lG.e();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final C2266L G(K k7, e4.k kVar) {
        W4.e eVar;
        C2264J getter = k7.getGetter();
        String strB = null;
        C2264J c2264j = getter != null ? (C2264J) z1.c.x(getter) : null;
        if (c2264j != null) {
            AbstractC1880i.z(c2264j);
            InterfaceC2097c interfaceC2097cB = d5.e.b(d5.e.k(c2264j), C0250d.f3723n);
            if (interfaceC2097cB != null && (eVar = (W4.e) AbstractC0252f.a.get(d5.e.g(interfaceC2097cB))) != null) {
                strB = eVar.b();
            }
        }
        if (strB != null && !z1.c.A(this.f6112n, c2264j)) {
            return F(k7, strB, kVar);
        }
        String strB2 = k7.getName().b();
        kotlin.jvm.internal.l.e("asString(...)", strB2);
        return F(k7, H4.w.a(strB2), kVar);
    }

    public final LinkedHashSet I(W4.e eVar) {
        Collection collectionZ = z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            P3.v.e0(linkedHashSet, ((AbstractC1586x) it.next()).k0().f(eVar, C4.c.f963o));
        }
        return linkedHashSet;
    }

    public final Set J(W4.e eVar) {
        Collection collectionZ = z();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            Collection collectionA = ((AbstractC1586x) it.next()).k0().a(eVar, C4.c.f963o);
            ArrayList arrayList2 = new ArrayList(P3.r.p(collectionA, 10));
            Iterator it2 = collectionA.iterator();
            while (it2.hasNext()) {
                arrayList2.add((K) it2.next());
            }
            P3.v.e0(arrayList, arrayList2);
        }
        return P3.q.X0(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c6 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean L(x4.C2266L r11) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.o.L(x4.L):boolean");
    }

    public final void M(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        kotlin.jvm.internal.l.f("<this>", ((K4.a) this.f6145b.f110l).f4712n);
        kotlin.jvm.internal.l.f("scopeOwner", this.f6112n);
    }

    public final ArrayList N(W4.e eVar) {
        Collection collectionC = ((InterfaceC0440c) this.f6148e.invoke()).c(eVar);
        ArrayList arrayList = new ArrayList(P3.r.p(collectionC, 10));
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            arrayList.add(t((A4.y) it.next()));
        }
        return arrayList;
    }

    public final ArrayList O(W4.e eVar) {
        LinkedHashSet linkedHashSetI = I(eVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetI) {
            C2266L c2266l = (C2266L) obj;
            kotlin.jvm.internal.l.f("<this>", c2266l);
            if (z1.c.x(c2266l) == null && AbstractC0251e.a(c2266l) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // L4.z, g5.p, g5.o
    public final Collection a(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        M(eVar, cVar);
        return super.a(eVar, cVar);
    }

    @Override // g5.p, g5.q
    public final InterfaceC2102h b(W4.e eVar, C4.a aVar) {
        C1521j c1521j;
        InterfaceC2099e interfaceC2099e;
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        M(eVar, aVar);
        o oVar = this.f6146c;
        return (oVar == null || (c1521j = oVar.f6119u) == null || (interfaceC2099e = (InterfaceC2099e) c1521j.invoke(eVar)) == null) ? (InterfaceC2102h) this.f6119u.invoke(eVar) : interfaceC2099e;
    }

    @Override // L4.z, g5.p, g5.o
    public final Collection f(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        M(eVar, aVar);
        return super.f(eVar, aVar);
    }

    @Override // L4.z
    public final Set h(g5.f fVar, g5.l lVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        return J.T((Set) this.f6116r.invoke(), ((Map) this.f6118t.invoke()).keySet());
    }

    @Override // L4.z
    public final Set i(g5.f fVar, g5.l lVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        InterfaceC2099e interfaceC2099e = this.f6112n;
        Collection collectionG = interfaceC2099e.v().g();
        kotlin.jvm.internal.l.e("getSupertypes(...)", collectionG);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            P3.v.e0(linkedHashSet, ((AbstractC1586x) it.next()).k0().c());
        }
        C1520i c1520i = this.f6148e;
        linkedHashSet.addAll(((InterfaceC0440c) c1520i.invoke()).a());
        linkedHashSet.addAll(((InterfaceC0440c) c1520i.invoke()).b());
        linkedHashSet.addAll(h(fVar, lVar));
        A2.b bVar = this.f6145b;
        ((C0831a) ((K4.a) bVar.f110l).f4722x).getClass();
        kotlin.jvm.internal.l.f("thisDescriptor", interfaceC2099e);
        kotlin.jvm.internal.l.f("c", bVar);
        linkedHashSet.addAll(new ArrayList());
        return linkedHashSet;
    }

    @Override // L4.z
    public final void j(W4.e eVar, ArrayList arrayList) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        boolean zG = this.f6113o.g();
        InterfaceC2099e interfaceC2099e = this.f6112n;
        A2.b bVar = this.f6145b;
        if (zG) {
            C1520i c1520i = this.f6148e;
            if (((InterfaceC0440c) c1520i.invoke()).f(eVar) != null) {
                if (arrayList.isEmpty()) {
                    A4.B bF = ((InterfaceC0440c) c1520i.invoke()).f(eVar);
                    kotlin.jvm.internal.l.c(bF);
                    K4.c cVarK = z1.c.K(bVar, bF);
                    W4.e eVarC = bF.c();
                    K4.a aVar = (K4.a) bVar.f110l;
                    J4.f fVarC1 = J4.f.c1(interfaceC2099e, cVarK, eVarC, aVar.f4708j.b(bF), true);
                    M4.a aVarF0 = n6.d.f0(W.f13382l, false, null, 6);
                    AbstractC1586x abstractC1586xR = ((B2.l) bVar.f113o).R(bF.f(), aVarF0);
                    C2295v c2295vP = p();
                    P3.y yVar = P3.y.f7779k;
                    EnumC2117x.f16341k.getClass();
                    fVarC1.b1(null, c2295vP, yVar, yVar, yVar, abstractC1586xR, EnumC2117x.f16344n, AbstractC2108n.f16322e, null);
                    fVarC1.f4295N = 1;
                    aVar.f4705g.getClass();
                    arrayList.add(fVarC1);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((C2266L) it.next()).m0().isEmpty()) {
                            break;
                        }
                    }
                    A4.B bF2 = ((InterfaceC0440c) c1520i.invoke()).f(eVar);
                    kotlin.jvm.internal.l.c(bF2);
                    K4.c cVarK2 = z1.c.K(bVar, bF2);
                    W4.e eVarC2 = bF2.c();
                    K4.a aVar2 = (K4.a) bVar.f110l;
                    J4.f fVarC12 = J4.f.c1(interfaceC2099e, cVarK2, eVarC2, aVar2.f4708j.b(bF2), true);
                    M4.a aVarF02 = n6.d.f0(W.f13382l, false, null, 6);
                    AbstractC1586x abstractC1586xR2 = ((B2.l) bVar.f113o).R(bF2.f(), aVarF02);
                    C2295v c2295vP2 = p();
                    P3.y yVar2 = P3.y.f7779k;
                    EnumC2117x.f16341k.getClass();
                    fVarC12.b1(null, c2295vP2, yVar2, yVar2, yVar2, abstractC1586xR2, EnumC2117x.f16344n, AbstractC2108n.f16322e, null);
                    fVarC12.f4295N = 1;
                    aVar2.f4705g.getClass();
                    arrayList.add(fVarC12);
                }
            }
        }
        ((C0831a) ((K4.a) bVar.f110l).f4722x).getClass();
        kotlin.jvm.internal.l.f("thisDescriptor", interfaceC2099e);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("c", bVar);
    }

    @Override // L4.z
    public final InterfaceC0440c k() {
        return new C0438a(this.f6113o, m.f6103l);
    }

    @Override // L4.z
    public final void m(LinkedHashSet linkedHashSet, W4.e eVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        LinkedHashSet linkedHashSetI = I(eVar);
        ArrayList arrayList = G.a;
        if (!G.f3709j.contains(eVar) && !AbstractC0251e.b(eVar)) {
            if (!linkedHashSetI.isEmpty()) {
                Iterator it = linkedHashSetI.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC2112s) it.next()).isSuspend()) {
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetI) {
                if (L((C2266L) obj)) {
                    arrayList2.add(obj);
                }
            }
            w(linkedHashSet, eVar, arrayList2, false);
            return;
        }
        w5.h hVar = new w5.h();
        LinkedHashSet linkedHashSetZ = n6.d.Z(eVar, linkedHashSetI, P3.y.f7779k, this.f6112n, InterfaceC1358m.f12447g, ((K4.a) this.f6145b.f110l).f4719u.f13812d);
        x(eVar, linkedHashSet, linkedHashSetZ, linkedHashSet, new x0(1, this, o.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 2));
        x(eVar, linkedHashSet, linkedHashSetZ, hVar, new x0(1, this, o.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 3));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetI) {
            if (L((C2266L) obj2)) {
                arrayList3.add(obj2);
            }
        }
        w(linkedHashSet, eVar, P3.q.G0(arrayList3, hVar), true);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [O3.i, java.lang.Object] */
    @Override // L4.z
    public final void n(W4.e eVar, ArrayList arrayList) {
        Set setX0;
        A4.y yVar;
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        boolean zIsAnnotation = this.f6113o.a.isAnnotation();
        A2.b bVar = this.f6145b;
        if (zIsAnnotation && (yVar = (A4.y) P3.q.L0(((InterfaceC0440c) this.f6148e.invoke()).c(eVar))) != null) {
            N n7 = EnumC2117x.f16341k;
            J4.g gVarV0 = J4.g.V0(this.f6112n, z1.c.K(bVar, yVar), P3.r.Z(yVar.e()), false, yVar.c(), ((K4.a) bVar.f110l).f4708j.b(yVar), false);
            C2264J c2264jF = Z4.l.f(gVarV0, C2159g.a);
            gVarV0.R0(c2264jF, null, null, null);
            kotlin.jvm.internal.l.f("<this>", bVar);
            AbstractC1586x abstractC1586xL = z.l(yVar, new A2.b((K4.a) bVar.f110l, new C0023j(bVar, gVarV0, yVar, 0), (O3.i) bVar.f112n));
            P3.y yVar2 = P3.y.f7779k;
            gVarV0.U0(abstractC1586xL, yVar2, p(), null, yVar2);
            c2264jF.f17395w = abstractC1586xL;
            arrayList.add(gVarV0);
        }
        Set setJ = J(eVar);
        if (setJ.isEmpty()) {
            return;
        }
        w5.h hVar = new w5.h();
        w5.h hVar2 = new w5.h();
        y(setJ, arrayList, hVar, new n(this, 0));
        if (hVar.isEmpty()) {
            setX0 = P3.q.X0(setJ);
        } else if (hVar instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : setJ) {
                if (!hVar.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            setX0 = linkedHashSet;
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(setJ);
            linkedHashSet2.removeAll(hVar);
            setX0 = linkedHashSet2;
        }
        y(setX0, hVar2, null, new n(this, 1));
        LinkedHashSet linkedHashSetT = J.T(setJ, hVar2);
        K4.a aVar = (K4.a) bVar.f110l;
        arrayList.addAll(n6.d.Z(eVar, linkedHashSetT, arrayList, this.f6112n, aVar.f4704f, aVar.f4719u.f13812d));
    }

    @Override // L4.z
    public final Set o(g5.f fVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        if (this.f6113o.a.isAnnotation()) {
            return c();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((InterfaceC0440c) this.f6148e.invoke()).e());
        Collection collectionG = this.f6112n.v().g();
        kotlin.jvm.internal.l.e("getSupertypes(...)", collectionG);
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            P3.v.e0(linkedHashSet, ((AbstractC1586x) it.next()).k0().d());
        }
        return linkedHashSet;
    }

    @Override // L4.z
    public final C2295v p() {
        InterfaceC2099e interfaceC2099e = this.f6112n;
        if (interfaceC2099e != null) {
            int i7 = Z4.e.a;
            return interfaceC2099e.r0();
        }
        Z4.e.a(0);
        throw null;
    }

    @Override // L4.z
    public final InterfaceC2105k q() {
        return this.f6112n;
    }

    @Override // L4.z
    public final boolean r(J4.f fVar) {
        if (this.f6113o.a.isAnnotation()) {
            return false;
        }
        return L(fVar);
    }

    @Override // L4.z
    public final y s(A4.y yVar, ArrayList arrayList, AbstractC1586x abstractC1586x, List list) {
        kotlin.jvm.internal.l.f("method", yVar);
        ((K4.a) this.f6145b.f110l).f4703e.getClass();
        if (this.f6112n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new y(abstractC1586x, list, arrayList, list2);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // L4.z
    public final String toString() {
        return "Lazy Java member scope for " + this.f6113o.c();
    }

    public final void v(ArrayList arrayList, J4.b bVar, int i7, A4.y yVar, AbstractC1586x abstractC1586x, AbstractC1586x abstractC1586x2) {
        AbstractC0013f uVar;
        C2158f c2158f = C2159g.a;
        W4.e eVarC = yVar.c();
        if (abstractC1586x == null) {
            Y.a(2);
            throw null;
        }
        a0 a0VarG = Y.g(abstractC1586x, false);
        Object defaultValue = yVar.a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = AbstractC0011d.a;
            uVar = Enum.class.isAssignableFrom(cls) ? new A4.u(null, (Enum) defaultValue) : defaultValue instanceof Annotation ? new A4.g(null, (Annotation) defaultValue) : defaultValue instanceof Object[] ? new A4.h(null, (Object[]) defaultValue) : defaultValue instanceof Class ? new A4.q(null, (Class) defaultValue) : new A4.w(null, defaultValue);
        } else {
            uVar = null;
        }
        arrayList.add(new C2272S(bVar, null, i7, c2158f, eVarC, a0VarG, uVar != null, false, false, abstractC1586x2 != null ? Y.g(abstractC1586x2, false) : null, ((K4.a) this.f6145b.f110l).f4708j.b(yVar)));
    }

    public final void w(LinkedHashSet linkedHashSet, W4.e eVar, ArrayList arrayList, boolean z7) {
        K4.a aVar = (K4.a) this.f6145b.f110l;
        LinkedHashSet<C2266L> linkedHashSetZ = n6.d.Z(eVar, arrayList, linkedHashSet, this.f6112n, aVar.f4704f, aVar.f4719u.f13812d);
        if (!z7) {
            linkedHashSet.addAll(linkedHashSetZ);
            return;
        }
        ArrayList arrayListG0 = P3.q.G0(linkedHashSet, linkedHashSetZ);
        ArrayList arrayList2 = new ArrayList(P3.r.p(linkedHashSetZ, 10));
        for (C2266L c2266lA : linkedHashSetZ) {
            C2266L c2266l = (C2266L) z1.c.y(c2266lA);
            if (c2266l != null) {
                c2266lA = A(c2266lA, c2266l, arrayListG0);
            }
            arrayList2.add(c2266lA);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(W4.e r11, java.util.LinkedHashSet r12, java.util.LinkedHashSet r13, java.util.AbstractSet r14, e4.k r15) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.o.x(W4.e, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.AbstractSet, e4.k):void");
    }

    public final void y(Set set, AbstractCollection abstractCollection, w5.h hVar, e4.k kVar) {
        C2266L c2266lH;
        C2265K c2265kM;
        J4.d dVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            K k7 = (K) it.next();
            if (C(k7, kVar)) {
                C2266L c2266lG = G(k7, kVar);
                kotlin.jvm.internal.l.c(c2266lG);
                if (k7.A()) {
                    c2266lH = H(k7, kVar);
                    kotlin.jvm.internal.l.c(c2266lH);
                } else {
                    c2266lH = null;
                }
                if (c2266lH != null) {
                    c2266lH.e();
                    c2266lG.e();
                }
                InterfaceC2099e interfaceC2099e = this.f6112n;
                kotlin.jvm.internal.l.f("ownerDescriptor", interfaceC2099e);
                J4.d dVar2 = new J4.d(interfaceC2099e, C2159g.a, c2266lG.e(), c2266lG.getVisibility(), c2266lH != null, k7.getName(), c2266lG.l(), null, 1, false, null);
                AbstractC1586x abstractC1586x = c2266lG.f17494q;
                kotlin.jvm.internal.l.c(abstractC1586x);
                P3.y yVar = P3.y.f7779k;
                dVar2.U0(abstractC1586x, yVar, p(), null, yVar);
                C2264J c2264jL = Z4.l.l(dVar2, c2266lG.getAnnotations(), false, c2266lG.l());
                c2264jL.f17365v = c2266lG;
                c2264jL.Q0(dVar2.getType());
                if (c2266lH != null) {
                    List listM0 = c2266lH.m0();
                    kotlin.jvm.internal.l.e("getValueParameters(...)", listM0);
                    C2272S c2272s = (C2272S) P3.q.t0(listM0);
                    if (c2272s == null) {
                        throw new AssertionError("No parameter found for " + c2266lH);
                    }
                    c2265kM = Z4.l.m(dVar2, c2266lH.getAnnotations(), c2272s.getAnnotations(), false, c2266lH.getVisibility(), c2266lH.l());
                    c2265kM.f17365v = c2266lH;
                } else {
                    c2265kM = null;
                }
                dVar2.R0(c2264jL, c2265kM, null, null);
                dVar = dVar2;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                abstractCollection.add(dVar);
                if (hVar != null) {
                    hVar.add(k7);
                    return;
                }
                return;
            }
        }
    }

    public final Collection z() {
        boolean z7 = this.f6114p;
        InterfaceC2099e interfaceC2099e = this.f6112n;
        if (z7) {
            Collection collectionG = interfaceC2099e.v().g();
            kotlin.jvm.internal.l.e("getSupertypes(...)", collectionG);
            return collectionG;
        }
        ((K4.a) this.f6145b.f110l).f4719u.getClass();
        kotlin.jvm.internal.l.f("classDescriptor", interfaceC2099e);
        Collection collectionG2 = interfaceC2099e.v().g();
        kotlin.jvm.internal.l.e("getSupertypes(...)", collectionG2);
        return collectionG2;
    }
}
