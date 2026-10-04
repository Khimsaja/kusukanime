package x4;

import b1.AbstractC0703b;
import m5.C1519h;
import m5.C1523l;
import m5.InterfaceC1526o;
import n5.AbstractC1586x;
import n5.V;
import u4.EnumC2117x;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2103i;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;

/* renamed from: x4.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2269O extends AbstractC2294u implements InterfaceC2268N {

    /* renamed from: Q, reason: collision with root package name */
    public static final C2258D f17401Q;

    /* renamed from: N, reason: collision with root package name */
    public final InterfaceC1526o f17402N;

    /* renamed from: O, reason: collision with root package name */
    public final u4.P f17403O;

    /* renamed from: P, reason: collision with root package name */
    public C2283j f17404P;

    static {
        kotlin.jvm.internal.y.a.h(new kotlin.jvm.internal.r(C2269O.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0));
        f17401Q = new C2258D();
    }

    public C2269O(InterfaceC1526o interfaceC1526o, u4.P p7, C2283j c2283j, InterfaceC2268N interfaceC2268N, v4.h hVar, int i7, u4.M m7) {
        super(i7, W4.g.f9630e, p7, interfaceC2268N, m7, hVar);
        this.f17402N = interfaceC1526o;
        this.f17403O = p7;
        A3.q qVar = new A3.q(29, this, c2283j);
        C1523l c1523l = (C1523l) interfaceC1526o;
        c1523l.getClass();
        new C1519h(c1523l, qVar);
        this.f17404P = c2283j;
    }

    @Override // u4.InterfaceC2104j
    public final boolean B() {
        return this.f17404P.f17435N;
    }

    @Override // u4.InterfaceC2104j
    public final InterfaceC2099e C() {
        InterfaceC2099e interfaceC2099eC = this.f17404P.C();
        kotlin.jvm.internal.l.e("getConstructedClass(...)", interfaceC2099eC);
        return interfaceC2099eC;
    }

    @Override // x4.AbstractC2294u
    public final AbstractC2294u P0(int i7, W4.e eVar, InterfaceC2105k interfaceC2105k, InterfaceC2112s interfaceC2112s, u4.M m7, v4.h hVar) {
        kotlin.jvm.internal.l.f("newOwner", interfaceC2105k);
        AbstractC0703b.w(i7, "kind");
        kotlin.jvm.internal.l.f("annotations", hVar);
        if (i7 != 1) {
        }
        return new C2269O(this.f17402N, this.f17403O, this.f17404P, this, hVar, 1, m7);
    }

    @Override // x4.AbstractC2294u, x4.AbstractC2288o, x4.AbstractC2287n, u4.InterfaceC2105k
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2268N a() {
        InterfaceC2112s interfaceC2112sA = super.a();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor", interfaceC2112sA);
        return (InterfaceC2268N) interfaceC2112sA;
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2112s, u4.O
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public final C2269O b(V v5) {
        kotlin.jvm.internal.l.f("substitutor", v5);
        InterfaceC2112s interfaceC2112sB = super.b(v5);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl", interfaceC2112sB);
        C2269O c2269o = (C2269O) interfaceC2112sB;
        AbstractC1586x abstractC1586x = c2269o.f17494q;
        kotlin.jvm.internal.l.c(abstractC1586x);
        C2283j c2283jB = this.f17404P.M0().b(V.d(abstractC1586x));
        if (c2283jB == null) {
            return null;
        }
        c2269o.f17404P = c2283jB;
        return c2269o;
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2096b
    public final AbstractC1586x getReturnType() {
        AbstractC1586x abstractC1586x = this.f17494q;
        kotlin.jvm.internal.l.c(abstractC1586x);
        return abstractC1586x;
    }

    @Override // x4.AbstractC2288o, u4.InterfaceC2105k
    public final InterfaceC2103i k() {
        return this.f17403O;
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2097c
    public final InterfaceC2097c z(InterfaceC2099e interfaceC2099e, EnumC2117x enumC2117x, H4.o oVar) {
        kotlin.jvm.internal.l.f("newOwner", interfaceC2099e);
        kotlin.jvm.internal.l.f("visibility", oVar);
        AbstractC0703b.w(2, "kind");
        C2293t c2293tT0 = T0(V.f13380b);
        c2293tT0.f17458b = interfaceC2099e;
        c2293tT0.f17459c = enumC2117x;
        c2293tT0.f17460d = oVar;
        c2293tT0.f17462f = 2;
        c2293tT0.f17469m = false;
        y1.L lQ0 = c2293tT0.f17480x.Q0(c2293tT0);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor", lQ0);
        return (InterfaceC2268N) lQ0;
    }

    @Override // x4.AbstractC2288o, u4.InterfaceC2105k
    public final InterfaceC2105k k() {
        return this.f17403O;
    }
}
