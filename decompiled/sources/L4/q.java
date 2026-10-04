package L4;

import C2.C0034g;
import b1.AbstractC0703b;
import l4.InterfaceC1443v;
import m5.C1514c;
import m5.C1520i;
import m5.C1523l;
import u4.M;
import v4.C2159g;
import x4.AbstractC2257C;

/* loaded from: classes.dex */
public final class q extends AbstractC2257C {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f6122w;

    /* renamed from: q, reason: collision with root package name */
    public final A4.z f6123q;

    /* renamed from: r, reason: collision with root package name */
    public final A2.b f6124r;

    /* renamed from: s, reason: collision with root package name */
    public final C1520i f6125s;

    /* renamed from: t, reason: collision with root package name */
    public final C0441d f6126t;

    /* renamed from: u, reason: collision with root package name */
    public final C1514c f6127u;

    /* renamed from: v, reason: collision with root package name */
    public final v4.h f6128v;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(q.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0);
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        f6122w = new InterfaceC1443v[]{zVar.h(rVar), AbstractC0703b.r(q.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0, zVar)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(A2.b bVar, A4.z zVar) {
        kotlin.jvm.internal.l.f("outerContext", bVar);
        K4.a aVar = (K4.a) bVar.f110l;
        super(aVar.f4713o, zVar.a);
        this.f6123q = zVar;
        A2.b bVarN = q0.c.n(bVar, this, null, 6);
        this.f6124r = bVarN;
        aVar.f4702d.c().f12415c.getClass();
        T4.f fVar = T4.f.f9107g;
        K4.a aVar2 = (K4.a) bVarN.f110l;
        C1523l c1523l = aVar2.a;
        p pVar = new p(this, 0);
        c1523l.getClass();
        this.f6125s = new C1520i(c1523l, pVar);
        this.f6126t = new C0441d(bVarN, zVar, this);
        p pVar2 = new p(this, 1);
        c1523l.getClass();
        this.f6127u = new C1514c(c1523l, pVar2);
        this.f6128v = aVar2.f4720v.f2900b ? C2159g.a : z1.c.K(bVarN, zVar);
        c1523l.a(new p(this, 2));
    }

    @Override // Q4.c, v4.InterfaceC2153a
    public final v4.h getAnnotations() {
        return this.f6128v;
    }

    @Override // u4.InterfaceC2088D
    public final g5.o k0() {
        return this.f6126t;
    }

    @Override // x4.AbstractC2257C, x4.AbstractC2288o, u4.InterfaceC2106l
    public final M l() {
        return new C0034g(this);
    }

    @Override // x4.AbstractC2257C, x4.AbstractC2287n
    public final String toString() {
        return "Lazy Java package fragment: " + this.f17354o + " of module " + ((K4.a) this.f6124r.f110l).f4713o;
    }
}
