package x4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m5.C1523l;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import n5.C1570g;
import n5.C1572i;
import n5.V;
import n5.Y;
import n5.b0;
import o5.C1706f;
import u4.C2113t;
import u4.C2119z;
import u4.EnumC2100f;
import u4.EnumC2117x;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import u4.InterfaceC2106l;

/* renamed from: x4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2298y extends AbstractC2299z {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC2299z f17515k;

    /* renamed from: l, reason: collision with root package name */
    public final V f17516l;

    /* renamed from: m, reason: collision with root package name */
    public V f17517m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f17518n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f17519o;

    /* renamed from: p, reason: collision with root package name */
    public C1572i f17520p;

    public C2298y(AbstractC2299z abstractC2299z, V v5) {
        this.f17515k = abstractC2299z;
        this.f17516l = v5;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void S(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C2298y.S(int):void");
    }

    @Override // u4.InterfaceC2099e
    public final boolean E() {
        return this.f17515k.E();
    }

    @Override // u4.InterfaceC2099e
    public final g5.o N(n5.T t7) {
        d5.e.i(Z4.e.d(this));
        return f(t7, C1706f.a);
    }

    @Override // u4.InterfaceC2116w
    public final boolean Q() {
        return this.f17515k.Q();
    }

    @Override // u4.InterfaceC2099e
    public final g5.o Y() {
        g5.o oVarY = this.f17515k.Y();
        if (oVarY != null) {
            return oVarY;
        }
        S(28);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final u4.S Z() {
        u4.S sZ = this.f17515k.Z();
        if (sZ == null) {
            return null;
        }
        boolean z7 = sZ instanceof C2113t;
        V v5 = this.f17516l;
        if (z7) {
            C2113t c2113t = (C2113t) sZ;
            n5.B b4 = (n5.B) c2113t.f16340b;
            if (b4 != null && !v5.a.e()) {
                b4 = (n5.B) j0().i(b4, b0.f13390m);
            }
            return new C2113t(c2113t.a, b4);
        }
        if (!(sZ instanceof C2119z)) {
            throw new D6.r();
        }
        ArrayList arrayList = ((C2119z) sZ).a;
        ArrayList arrayList2 = new ArrayList(P3.r.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            O3.l lVar = (O3.l) it.next();
            W4.e eVar = (W4.e) lVar.f7528k;
            n5.B b7 = (n5.B) ((q5.e) lVar.f7529l);
            if (b7 != null && !v5.a.e()) {
                b7 = (n5.B) j0().i(b7, b0.f13390m);
            }
            arrayList2.add(new O3.l(eVar, b7));
        }
        return new C2119z(arrayList2);
    }

    @Override // x4.AbstractC2299z, u4.InterfaceC2099e, u4.InterfaceC2105k
    public final InterfaceC2099e a() {
        InterfaceC2099e interfaceC2099eA = this.f17515k.a();
        if (interfaceC2099eA != null) {
            return interfaceC2099eA;
        }
        S(21);
        throw null;
    }

    @Override // u4.O
    public final InterfaceC2106l b(V v5) {
        if (v5 != null) {
            return v5.a.e() ? this : new C2298y(this, V.e(v5.f(), j0().f()));
        }
        S(23);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final C2283j b0() {
        return this.f17515k.b0();
    }

    @Override // u4.InterfaceC2099e
    public final EnumC2100f c() {
        EnumC2100f enumC2100fC = this.f17515k.c();
        if (enumC2100fC != null) {
            return enumC2100fC;
        }
        S(25);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final g5.o c0() {
        g5.o oVarC0 = this.f17515k.c0();
        if (oVarC0 != null) {
            return oVarC0;
        }
        S(15);
        throw null;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w
    public final EnumC2117x e() {
        EnumC2117x enumC2117xE = this.f17515k.e();
        if (enumC2117xE != null) {
            return enumC2117xE;
        }
        S(26);
        throw null;
    }

    @Override // x4.AbstractC2299z
    public final g5.o f(n5.T t7, C1706f c1706f) {
        g5.o oVarF = this.f17515k.f(t7, c1706f);
        if (!this.f17516l.a.e()) {
            return new g5.t(oVarF, j0());
        }
        if (oVarF != null) {
            return oVarF;
        }
        S(7);
        throw null;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2102h
    public final n5.B g() {
        n5.I iB1;
        List listD = Y.d(v().getParameters());
        v4.h annotations = getAnnotations();
        if (annotations.isEmpty()) {
            n5.I.f13362l.getClass();
            iB1 = n5.I.f13363m;
        } else {
            L2.e eVar = n5.I.f13362l;
            List listH = P3.r.H(new C1570g(annotations));
            eVar.getClass();
            iB1 = L2.e.b1(listH);
        }
        return AbstractC1566c.v(g0(), listD, iB1, v(), false);
    }

    @Override // u4.InterfaceC2099e
    public final g5.o g0() {
        d5.e.i(Z4.e.d(this.f17515k));
        return q(C1706f.a);
    }

    @Override // v4.InterfaceC2153a
    public final v4.h getAnnotations() {
        v4.h annotations = this.f17515k.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        S(19);
        throw null;
    }

    @Override // u4.InterfaceC2105k
    public final W4.e getName() {
        W4.e name = this.f17515k.getName();
        if (name != null) {
            return name;
        }
        S(20);
        throw null;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w, u4.InterfaceC2107m
    public final H4.o getVisibility() {
        H4.o visibility = this.f17515k.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        S(27);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final boolean i() {
        return this.f17515k.i();
    }

    @Override // u4.InterfaceC2116w
    public final boolean i0() {
        return this.f17515k.i0();
    }

    @Override // u4.InterfaceC2116w
    public final boolean isExternal() {
        return this.f17515k.isExternal();
    }

    @Override // u4.InterfaceC2099e
    public final boolean isInline() {
        return this.f17515k.isInline();
    }

    @Override // u4.InterfaceC2103i
    public final boolean j() {
        return this.f17515k.j();
    }

    public final V j0() {
        if (this.f17517m == null) {
            V v5 = this.f17516l;
            if (v5.a.e()) {
                this.f17517m = v5;
            } else {
                List parameters = this.f17515k.v().getParameters();
                this.f17518n = new ArrayList(parameters.size());
                this.f17517m = AbstractC1566c.A(parameters, v5.f(), this, this.f17518n);
                ArrayList arrayList = this.f17518n;
                kotlin.jvm.internal.l.f("<this>", arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((u4.Q) obj).I()) {
                        arrayList2.add(obj);
                    }
                }
                this.f17519o = arrayList2;
            }
        }
        return this.f17517m;
    }

    @Override // u4.InterfaceC2105k
    public final InterfaceC2105k k() {
        InterfaceC2105k interfaceC2105kK = this.f17515k.k();
        if (interfaceC2105kK != null) {
            return interfaceC2105kK;
        }
        S(22);
        throw null;
    }

    @Override // u4.InterfaceC2106l
    public final u4.M l() {
        return u4.M.f16295i;
    }

    @Override // u4.InterfaceC2099e
    public final List l0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        S(17);
        throw null;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2103i
    public final List n() {
        j0();
        ArrayList arrayList = this.f17519o;
        if (arrayList != null) {
            return arrayList;
        }
        S(30);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final boolean p0() {
        return this.f17515k.p0();
    }

    @Override // x4.AbstractC2299z
    public final g5.o q(C1706f c1706f) {
        g5.o oVarQ = this.f17515k.q(c1706f);
        if (!this.f17516l.a.e()) {
            return new g5.t(oVarQ, j0());
        }
        if (oVarQ != null) {
            return oVarQ;
        }
        S(14);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final C2295v r0() {
        throw new UnsupportedOperationException();
    }

    @Override // u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        return yVar.H(this, obj);
    }

    @Override // u4.InterfaceC2102h
    public final n5.M v() {
        n5.M mV = this.f17515k.v();
        if (this.f17516l.a.e()) {
            if (mV != null) {
                return mV;
            }
            S(0);
            throw null;
        }
        if (this.f17520p == null) {
            V vJ0 = j0();
            Collection collectionG = mV.g();
            ArrayList arrayList = new ArrayList(collectionG.size());
            Iterator it = collectionG.iterator();
            while (it.hasNext()) {
                arrayList.add(vJ0.i((AbstractC1586x) it.next(), b0.f13390m));
            }
            this.f17520p = new C1572i(this, this.f17518n, arrayList, C1523l.f12991e);
        }
        C1572i c1572i = this.f17520p;
        if (c1572i != null) {
            return c1572i;
        }
        S(1);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final boolean x() {
        return this.f17515k.x();
    }

    @Override // u4.InterfaceC2099e
    public final Collection y() {
        Collection<C2283j> collectionY = this.f17515k.y();
        ArrayList arrayList = new ArrayList(collectionY.size());
        for (C2283j c2283j : collectionY) {
            C2283j c2283j2 = c2283j;
            c2283j2.getClass();
            C2293t c2293tT0 = c2283j2.T0(V.f13380b);
            c2293tT0.f17461e = c2283j.M0();
            c2293tT0.j(c2283j2.e());
            c2293tT0.h(c2283j2.getVisibility());
            c2293tT0.i(c2283j2.c());
            c2293tT0.f17469m = false;
            arrayList.add(((C2283j) c2293tT0.f17480x.Q0(c2293tT0)).b(j0()));
        }
        return arrayList;
    }
}
