package L4;

import A4.AbstractC0011d;
import A4.C0012e;
import A4.F;
import b1.AbstractC0703b;
import b5.C0719a;
import e5.AbstractC0832b;
import io.ktor.http.LinkHeader;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import l4.InterfaceC1443v;
import m5.C1519h;
import m5.C1520i;
import m5.C1523l;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import n5.Q;
import n5.W;
import n5.b0;
import r4.AbstractC1880i;
import r4.AbstractC1886o;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.M;
import x4.C2272S;
import z4.C2495g;

/* loaded from: classes.dex */
public final class f implements J4.h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f6067h;
    public final A2.b a;

    /* renamed from: b, reason: collision with root package name */
    public final C0012e f6068b;

    /* renamed from: c, reason: collision with root package name */
    public final C1519h f6069c;

    /* renamed from: d, reason: collision with root package name */
    public final C1520i f6070d;

    /* renamed from: e, reason: collision with root package name */
    public final C2495g f6071e;

    /* renamed from: f, reason: collision with root package name */
    public final C1520i f6072f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6073g;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(f.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0);
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        f6067h = new InterfaceC1443v[]{zVar.h(rVar), AbstractC0703b.r(f.class, LinkHeader.Parameters.Type, "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, zVar), AbstractC0703b.r(f.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0, zVar)};
    }

    public f(A2.b bVar, C0012e c0012e, boolean z7) {
        kotlin.jvm.internal.l.f("c", bVar);
        kotlin.jvm.internal.l.f("javaAnnotation", c0012e);
        this.a = bVar;
        this.f6068b = c0012e;
        K4.a aVar = (K4.a) bVar.f110l;
        C1523l c1523l = aVar.a;
        C0442e c0442e = new C0442e(this, 0);
        c1523l.getClass();
        this.f6069c = new C1519h(c1523l, c0442e);
        C0442e c0442e2 = new C0442e(this, 1);
        c1523l.getClass();
        this.f6070d = new C1520i(c1523l, c0442e2);
        this.f6071e = aVar.f4708j.b(c0012e);
        C0442e c0442e3 = new C0442e(this, 2);
        c1523l.getClass();
        this.f6072f = new C1520i(c1523l, c0442e3);
        this.f6073g = z7;
    }

    @Override // v4.InterfaceC2154b
    public final W4.c a() {
        C1519h c1519h = this.f6069c;
        InterfaceC1443v interfaceC1443v = f6067h[0];
        kotlin.jvm.internal.l.f("<this>", c1519h);
        kotlin.jvm.internal.l.f("p", interfaceC1443v);
        return (W4.c) c1519h.invoke();
    }

    @Override // v4.InterfaceC2154b
    public final Map b() {
        return (Map) AbstractC0832b.u(this.f6072f, f6067h[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b5.g c(N4.a aVar) {
        AbstractC1586x abstractC1586xH;
        if (aVar instanceof A4.w) {
            return b5.h.a.b(((A4.w) aVar).f236b, null);
        }
        if (aVar instanceof A4.u) {
            A4.u uVar = (A4.u) aVar;
            Class<?> enclosingClass = uVar.f235b.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            kotlin.jvm.internal.l.c(enclosingClass);
            return new b5.i(AbstractC0011d.a(enclosingClass), W4.e.e(uVar.f235b.name()));
        }
        boolean z7 = aVar instanceof A4.h;
        A2.b bVar = this.a;
        if (z7) {
            A4.h hVar = (A4.h) aVar;
            W4.e eVar = hVar.a;
            if (eVar == null) {
                eVar = H4.x.f3755b;
            }
            kotlin.jvm.internal.l.c(eVar);
            ArrayList arrayListA = hVar.a();
            if (!AbstractC1566c.k((n5.B) AbstractC0832b.u(this.f6070d, f6067h[1]))) {
                InterfaceC2099e interfaceC2099eD = d5.e.d(this);
                kotlin.jvm.internal.l.c(interfaceC2099eD);
                C2272S c2272sY = n6.d.y(eVar, interfaceC2099eD);
                if (c2272sY == null || (abstractC1586xH = c2272sY.getType()) == null) {
                    AbstractC1880i abstractC1880i = ((K4.a) bVar.f110l).f4713o.f17339n;
                    b0 b0Var = b0.f13390m;
                    abstractC1586xH = abstractC1880i.h(p5.l.c(p5.k.f14436N, new String[0]));
                }
                ArrayList arrayList = new ArrayList(P3.r.p(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    b5.g gVarC = c((N4.a) it.next());
                    if (gVarC == null) {
                        gVarC = new b5.u(null);
                    }
                    arrayList.add(gVarC);
                }
                return new b5.x(arrayList, abstractC1586xH);
            }
        } else {
            if (aVar instanceof A4.g) {
                return new C0719a((Object) new f(bVar, new C0012e(((A4.g) aVar).f222b), false));
            }
            if (aVar instanceof A4.q) {
                Class cls = ((A4.q) aVar).f233b;
                AbstractC1586x abstractC1586xR = ((B2.l) bVar.f113o).R(cls.isPrimitive() ? new A4.A(cls) : ((cls instanceof GenericArrayType) || cls.isArray()) ? new A4.i(cls) : cls instanceof WildcardType ? new F((WildcardType) cls) : new A4.r(cls), n6.d.f0(W.f13382l, false, null, 7));
                if (!AbstractC1566c.k(abstractC1586xR)) {
                    AbstractC1586x abstractC1586xB = abstractC1586xR;
                    int i7 = 0;
                    while (AbstractC1880i.y(abstractC1586xB)) {
                        abstractC1586xB = ((Q) P3.q.K0(abstractC1586xB.q0())).b();
                        kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB);
                        i7++;
                    }
                    InterfaceC2102h interfaceC2102hF = abstractC1586xB.t0().f();
                    if (interfaceC2102hF instanceof InterfaceC2099e) {
                        W4.b bVarF = d5.e.f(interfaceC2102hF);
                        return bVarF == null ? new b5.s(new b5.p(abstractC1586xR)) : new b5.s(bVarF, i7);
                    }
                    if (interfaceC2102hF instanceof u4.Q) {
                        W4.c cVarI = AbstractC1886o.a.i();
                        return new b5.s(new W4.b(cVarI.b(), cVarI.a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // v4.InterfaceC2154b
    public final AbstractC1586x getType() {
        return (n5.B) AbstractC0832b.u(this.f6070d, f6067h[1]);
    }

    @Override // v4.InterfaceC2154b
    public final M l() {
        return this.f6071e;
    }

    public final String toString() {
        return Y4.h.f10162c.u(this, null);
    }
}
