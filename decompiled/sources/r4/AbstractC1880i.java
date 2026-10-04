package r4;

import D.x0;
import X4.y;
import e5.AbstractC0832b;
import j5.C1354i;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k5.C1397a;
import k5.C1398b;
import k5.C1399c;
import k5.C1400d;
import m5.C1516e;
import m5.C1520i;
import m5.C1523l;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import n5.B;
import n5.G;
import n5.M;
import n5.Y;
import n5.b0;
import s4.C2015a;
import u4.AbstractC2115v;
import u4.C2090F;
import u4.InterfaceC2088D;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import u4.K;
import v4.C2159g;
import w4.C2211a;
import w4.InterfaceC2212b;
import w4.InterfaceC2214d;
import x4.AbstractC2257C;
import x4.C2255A;
import x4.C2264J;
import x4.C2265K;

/* renamed from: r4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1880i {

    /* renamed from: e, reason: collision with root package name */
    public static final W4.e f14937e = W4.e.g("<built-ins module>");
    public C2255A a;

    /* renamed from: b, reason: collision with root package name */
    public final C1520i f14938b;

    /* renamed from: c, reason: collision with root package name */
    public final C1516e f14939c;

    /* renamed from: d, reason: collision with root package name */
    public final C1523l f14940d;

    public AbstractC1880i(C1523l c1523l) {
        this.f14940d = c1523l;
        c1523l.a(new C1877f(this, 0));
        this.f14938b = new C1520i(c1523l, new C1877f(this, 1));
        this.f14939c = c1523l.b(new C1878g(this, 0));
    }

    public static boolean A(AbstractC1586x abstractC1586x, W4.d dVar) {
        if (abstractC1586x == null) {
            a(97);
            throw null;
        }
        if (dVar != null) {
            return H(abstractC1586x.t0(), dVar);
        }
        a(98);
        throw null;
    }

    public static boolean B(AbstractC1586x abstractC1586x, W4.d dVar) {
        if (dVar != null) {
            return A(abstractC1586x, dVar) && !abstractC1586x.u0();
        }
        a(135);
        throw null;
    }

    public static boolean C(InterfaceC2112s interfaceC2112s) {
        if (interfaceC2112s.a().getAnnotations().d(AbstractC1886o.f15005m)) {
            return true;
        }
        if (!(interfaceC2112s instanceof K)) {
            return false;
        }
        K k7 = (K) interfaceC2112s;
        boolean zA = k7.A();
        C2264J getter = k7.getGetter();
        C2265K setter = k7.getSetter();
        if (getter == null || !C(getter)) {
            return false;
        }
        if (zA) {
            return setter != null && C(setter);
        }
        return true;
    }

    public static boolean D(AbstractC1586x abstractC1586x, W4.d dVar) {
        if (abstractC1586x == null) {
            a(105);
            throw null;
        }
        if (dVar != null) {
            return !abstractC1586x.u0() && A(abstractC1586x, dVar);
        }
        a(106);
        throw null;
    }

    public static boolean E(AbstractC1586x abstractC1586x) {
        if (abstractC1586x != null) {
            return A(abstractC1586x, AbstractC1886o.f14988b) && !Y.e(abstractC1586x);
        }
        a(136);
        throw null;
    }

    public static boolean F(AbstractC1586x abstractC1586x) {
        if (abstractC1586x == null) {
            a(94);
            throw null;
        }
        if (abstractC1586x.u0()) {
            return false;
        }
        InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
        if (!(interfaceC2102hF instanceof InterfaceC2099e)) {
            return false;
        }
        InterfaceC2099e interfaceC2099e = (InterfaceC2099e) interfaceC2102hF;
        if (interfaceC2099e != null) {
            return t(interfaceC2099e) != null;
        }
        a(96);
        throw null;
    }

    public static boolean G(AbstractC1586x abstractC1586x) {
        return D(abstractC1586x, AbstractC1886o.f14996f);
    }

    public static boolean H(M m7, W4.d dVar) {
        if (m7 == null) {
            a(101);
            throw null;
        }
        if (dVar != null) {
            InterfaceC2102h interfaceC2102hF = m7.f();
            return (interfaceC2102hF instanceof InterfaceC2099e) && b((InterfaceC2099e) interfaceC2102hF, dVar);
        }
        a(102);
        throw null;
    }

    public static boolean I(InterfaceC2102h interfaceC2102h) {
        if (interfaceC2102h == null) {
            a(10);
            throw null;
        }
        for (InterfaceC2102h interfaceC2102hK = interfaceC2102h; interfaceC2102hK != null; interfaceC2102hK = interfaceC2102hK.k()) {
            if (interfaceC2102hK instanceof InterfaceC2088D) {
                W4.e eVar = AbstractC1887p.f15027j;
                W4.c cVar = ((AbstractC2257C) ((InterfaceC2088D) interfaceC2102hK)).f17354o;
                cVar.getClass();
                kotlin.jvm.internal.l.f("segment", eVar);
                return cVar.a.h(eVar);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r23) {
        /*
            Method dump skipped, instructions count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.AbstractC1880i.a(int):void");
    }

    public static boolean b(InterfaceC2099e interfaceC2099e, W4.d dVar) {
        if (interfaceC2099e == null) {
            a(103);
            throw null;
        }
        if (dVar != null) {
            return interfaceC2099e.getName().equals(dVar.g()) && dVar.equals(Z4.e.g(interfaceC2099e));
        }
        a(104);
        throw null;
    }

    public static EnumC1882k r(InterfaceC2102h interfaceC2102h) {
        if (interfaceC2102h == null) {
            a(77);
            throw null;
        }
        if (AbstractC1886o.f14995e0.contains(interfaceC2102h.getName())) {
            return (EnumC1882k) AbstractC1886o.f14999g0.get(Z4.e.g(interfaceC2102h));
        }
        return null;
    }

    public static EnumC1882k t(InterfaceC2099e interfaceC2099e) {
        if (interfaceC2099e == null) {
            a(76);
            throw null;
        }
        if (AbstractC1886o.f14993d0.contains(interfaceC2099e.getName())) {
            return (EnumC1882k) AbstractC1886o.f14997f0.get(Z4.e.g(interfaceC2099e));
        }
        return null;
    }

    public static boolean x(AbstractC1586x abstractC1586x) {
        if (abstractC1586x != null) {
            return A(abstractC1586x, AbstractC1886o.a);
        }
        a(139);
        throw null;
    }

    public static boolean y(AbstractC1586x abstractC1586x) {
        if (abstractC1586x != null) {
            return A(abstractC1586x, AbstractC1886o.f14998g);
        }
        a(88);
        throw null;
    }

    public static boolean z(InterfaceC2105k interfaceC2105k) {
        if (interfaceC2105k != null) {
            return Z4.e.i(interfaceC2105k, C1399c.class, false) != null;
        }
        a(9);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [O3.i, java.lang.Object] */
    public final void c() {
        W4.e eVar = f14937e;
        kotlin.jvm.internal.l.f("moduleName", eVar);
        C1523l c1523l = this.f14940d;
        C2255A c2255a = new C2255A(eVar, c1523l, this, 48);
        this.a = c2255a;
        InterfaceC1874c.a.getClass();
        InterfaceC1874c interfaceC1874c = (InterfaceC1874c) C1873b.f14930b.getValue();
        C2255A c2255a2 = this.a;
        Iterable iterableM = m();
        InterfaceC2214d interfaceC2214dP = p();
        InterfaceC2212b interfaceC2212bD = d();
        C1398b c1398b = (C1398b) interfaceC1874c;
        c1398b.getClass();
        kotlin.jvm.internal.l.f("builtInsModule", c2255a2);
        kotlin.jvm.internal.l.f("classDescriptorFactories", iterableM);
        kotlin.jvm.internal.l.f("platformDependentDeclarationFilter", interfaceC2214dP);
        kotlin.jvm.internal.l.f("additionalClassPartsProvider", interfaceC2212bD);
        Set<W4.c> set = AbstractC1887p.f15034q;
        x0 x0Var = new x0(1, c1398b.f12689b, C1400d.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0, 7);
        kotlin.jvm.internal.l.f("packageFqNames", set);
        ArrayList arrayList = new ArrayList();
        for (W4.c cVar : set) {
            C1397a.f12688m.getClass();
            InputStream inputStream = (InputStream) x0Var.invoke(C1397a.a(cVar));
            C1399c c1399cN = inputStream != null ? AbstractC0832b.n(cVar, c1523l, c2255a2, inputStream) : null;
            if (c1399cN != null) {
                arrayList.add(c1399cN);
            }
        }
        C2090F c2090f = new C2090F(arrayList);
        A2.b bVar = new A2.b(c1523l, c2255a2);
        y yVar = new y(18, c2090f);
        C1397a c1397a = C1397a.f12688m;
        C1354i c1354i = new C1354i(c1523l, c2255a2, yVar, new L2.e(c2255a2, bVar, c1397a), c2090f, iterableM, bVar, interfaceC2212bD, interfaceC2214dP, c1397a.a, null, new R1.i(c1523l), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C1399c) it.next()).O0(c1354i);
        }
        c2255a.f17343r = c2090f;
        C2255A c2255a3 = this.a;
        c2255a3.getClass();
        c2255a3.f17342q = new T4.i(P3.m.u0(new C2255A[]{c2255a3}));
    }

    public InterfaceC2212b d() {
        return C2211a.f17092b;
    }

    public final B e() {
        B bG = k("Any").g();
        if (bG != null) {
            return bG;
        }
        a(51);
        throw null;
    }

    public final AbstractC1586x f(AbstractC1586x abstractC1586x) {
        if (abstractC1586x == null) {
            a(68);
            throw null;
        }
        AbstractC1586x abstractC1586xG = g(abstractC1586x);
        if (abstractC1586xG != null) {
            return abstractC1586xG;
        }
        throw new IllegalStateException("not array: " + abstractC1586x);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n5.AbstractC1586x g(n5.AbstractC1586x r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L92
            boolean r1 = y(r5)
            r2 = 0
            if (r1 == 0) goto L26
            java.util.List r1 = r5.q0()
            int r1 = r1.size()
            r3 = 1
            if (r1 == r3) goto L17
            goto L91
        L17:
            java.util.List r5 = r5.q0()
            java.lang.Object r5 = r5.get(r2)
            n5.Q r5 = (n5.Q) r5
            n5.x r5 = r5.b()
            return r5
        L26:
            n5.a0 r5 = n5.Y.g(r5, r2)
            m5.i r1 = r4.f14938b
            java.lang.Object r1 = r1.invoke()
            r4.h r1 = (r4.C1879h) r1
            java.util.HashMap r1 = r1.f14936b
            java.lang.Object r1 = r1.get(r5)
            n5.x r1 = (n5.AbstractC1586x) r1
            if (r1 == 0) goto L3d
            return r1
        L3d:
            int r1 = Z4.e.a
            n5.M r1 = r5.t0()
            u4.h r1 = r1.f()
            if (r1 != 0) goto L4b
            r1 = r0
            goto L4f
        L4b:
            u4.y r1 = Z4.e.e(r1)
        L4f:
            if (r1 == 0) goto L91
            n5.M r5 = r5.t0()
            u4.h r5 = r5.f()
            if (r5 != 0) goto L5d
        L5b:
            r5 = r0
            goto L8e
        L5d:
            java.util.Set r2 = r4.AbstractC1891t.a
            W4.e r2 = r5.getName()
            java.lang.String r3 = "name"
            kotlin.jvm.internal.l.f(r3, r2)
            java.util.LinkedHashSet r3 = r4.AbstractC1891t.f15047d
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L71
            goto L5b
        L71:
            W4.b r5 = d5.e.f(r5)
            if (r5 != 0) goto L78
            goto L5b
        L78:
            java.util.HashMap r2 = r4.AbstractC1891t.f15045b
            java.lang.Object r5 = r2.get(r5)
            W4.b r5 = (W4.b) r5
            if (r5 != 0) goto L83
            goto L5b
        L83:
            u4.e r5 = u4.AbstractC2115v.d(r1, r5)
            if (r5 != 0) goto L8a
            goto L5b
        L8a:
            n5.B r5 = r5.g()
        L8e:
            if (r5 == 0) goto L91
            return r5
        L91:
            return r0
        L92:
            r5 = 70
            a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.AbstractC1880i.g(n5.x):n5.x");
    }

    public final B h(AbstractC1586x abstractC1586x) {
        b0 b0Var = b0.f13390m;
        if (abstractC1586x != null) {
            return i(b0Var, abstractC1586x, C2159g.a);
        }
        a(83);
        throw null;
    }

    public final B i(b0 b0Var, AbstractC1586x abstractC1586x, v4.h hVar) {
        if (abstractC1586x != null) {
            return AbstractC1566c.t(AbstractC1566c.D(hVar), k("Array"), Collections.singletonList(new G(abstractC1586x, b0Var)));
        }
        a(79);
        throw null;
    }

    public final InterfaceC2099e j(W4.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        C2255A c2255aL = l();
        C4.c cVar2 = C4.c.f959k;
        InterfaceC2099e interfaceC2099eJ = AbstractC2115v.j(c2255aL, cVar);
        if (interfaceC2099eJ != null) {
            return interfaceC2099eJ;
        }
        a(13);
        throw null;
    }

    public final InterfaceC2099e k(String str) {
        if (str != null) {
            return (InterfaceC2099e) this.f14939c.invoke(W4.e.e(str));
        }
        a(14);
        throw null;
    }

    public final C2255A l() {
        this.a.getClass();
        C2255A c2255a = this.a;
        if (c2255a != null) {
            return c2255a;
        }
        a(7);
        throw null;
    }

    public Iterable m() {
        List listSingletonList = Collections.singletonList(new C2015a(this.f14940d, l()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final B n() {
        B bG = k("Nothing").g();
        if (bG != null) {
            return bG;
        }
        a(49);
        throw null;
    }

    public final B o() {
        B bA0 = e().x0(true);
        if (bA0 != null) {
            return bA0;
        }
        a(52);
        throw null;
    }

    public InterfaceC2214d p() {
        return C2211a.f17094d;
    }

    public final B q(EnumC1882k enumC1882k) {
        if (enumC1882k == null) {
            a(73);
            throw null;
        }
        B b4 = (B) ((C1879h) this.f14938b.invoke()).a.get(enumC1882k);
        if (b4 != null) {
            return b4;
        }
        a(74);
        throw null;
    }

    public final B s(EnumC1882k enumC1882k) {
        if (enumC1882k == null) {
            a(54);
            throw null;
        }
        B bG = k(enumC1882k.f14953k.b()).g();
        if (bG != null) {
            return bG;
        }
        a(55);
        throw null;
    }

    public final B u() {
        B bG = k("String").g();
        if (bG != null) {
            return bG;
        }
        a(66);
        throw null;
    }

    public final InterfaceC2099e v(int i7) {
        return j(AbstractC1887p.f15023f.a(W4.e.e(s4.j.f15833c.f15834b + i7)));
    }

    public final B w() {
        B bG = k("Unit").g();
        if (bG != null) {
            return bG;
        }
        a(65);
        throw null;
    }
}
