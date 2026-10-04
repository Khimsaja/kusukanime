package l5;

import R4.W;
import X4.AbstractC0605b;
import java.util.List;
import m5.C1523l;
import n5.AbstractC1566c;
import n5.B;
import n5.I;
import n5.M;
import n5.V;
import n5.Y;
import n5.b0;
import u4.AbstractC2115v;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;
import u4.InterfaceC2106l;
import x4.AbstractC2279f;
import x4.C2277d;
import x4.C2278e;

/* renamed from: l5.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1467t extends AbstractC2279f implements InterfaceC1459l {

    /* renamed from: A, reason: collision with root package name */
    public B f12832A;

    /* renamed from: s, reason: collision with root package name */
    public final W f12833s;

    /* renamed from: t, reason: collision with root package name */
    public final T4.g f12834t;

    /* renamed from: u, reason: collision with root package name */
    public final T4.i f12835u;

    /* renamed from: v, reason: collision with root package name */
    public final T4.k f12836v;

    /* renamed from: w, reason: collision with root package name */
    public final P4.g f12837w;

    /* renamed from: x, reason: collision with root package name */
    public B f12838x;

    /* renamed from: y, reason: collision with root package name */
    public B f12839y;

    /* renamed from: z, reason: collision with root package name */
    public List f12840z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1467t(C1523l c1523l, InterfaceC2105k interfaceC2105k, v4.h hVar, W4.e eVar, H4.o oVar, W w7, T4.g gVar, T4.i iVar, T4.k kVar, P4.g gVar2) {
        super(c1523l, interfaceC2105k, hVar, eVar, oVar);
        kotlin.jvm.internal.l.f("storageManager", c1523l);
        kotlin.jvm.internal.l.f("containingDeclaration", interfaceC2105k);
        kotlin.jvm.internal.l.f("visibility", oVar);
        kotlin.jvm.internal.l.f("proto", w7);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        kotlin.jvm.internal.l.f("typeTable", iVar);
        kotlin.jvm.internal.l.f("versionRequirementTable", kVar);
        this.f12833s = w7;
        this.f12834t = gVar;
        this.f12835u = iVar;
        this.f12836v = kVar;
        this.f12837w = gVar2;
    }

    @Override // l5.InterfaceC1459l
    public final AbstractC0605b H() {
        return this.f12833s;
    }

    public final InterfaceC2099e N0() {
        if (AbstractC1566c.k(O0())) {
            return null;
        }
        InterfaceC2102h interfaceC2102hF = O0().t0().f();
        if (interfaceC2102hF instanceof InterfaceC2099e) {
            return (InterfaceC2099e) interfaceC2102hF;
        }
        return null;
    }

    public final B O0() {
        B b4 = this.f12839y;
        if (b4 != null) {
            return b4;
        }
        kotlin.jvm.internal.l.l("expandedType");
        throw null;
    }

    public final B P0() {
        B b4 = this.f12838x;
        if (b4 != null) {
            return b4;
        }
        kotlin.jvm.internal.l.l("underlyingType");
        throw null;
    }

    public final void Q0(List list, B b4, B b7) {
        g5.o oVarG0;
        B bW;
        kotlin.jvm.internal.l.f("underlyingType", b4);
        kotlin.jvm.internal.l.f("expandedType", b7);
        this.f17423q = list;
        this.f12838x = b4;
        this.f12839y = b7;
        this.f12840z = AbstractC2115v.c(this);
        InterfaceC2099e interfaceC2099eN0 = N0();
        if (interfaceC2099eN0 == null || (oVarG0 = interfaceC2099eN0.g0()) == null) {
            oVarG0 = g5.n.f11759b;
        }
        g5.o oVar = oVarG0;
        C2277d c2277d = new C2277d();
        p5.i iVar = Y.a;
        if (p5.l.f(this)) {
            bW = p5.l.c(p5.k.f14447u, toString());
        } else {
            M mV = v();
            if (mV == null) {
                Y.a(12);
                throw null;
            }
            List listD = Y.d(((C2278e) mV).getParameters());
            I.f13362l.getClass();
            bW = AbstractC1566c.w(I.f13363m, mV, listD, false, oVar, c2277d);
        }
        this.f12832A = bW;
    }

    @Override // u4.O
    public final InterfaceC2106l b(V v5) {
        kotlin.jvm.internal.l.f("substitutor", v5);
        if (v5.a.e()) {
            return this;
        }
        InterfaceC2105k interfaceC2105kK = k();
        kotlin.jvm.internal.l.e("getContainingDeclaration(...)", interfaceC2105kK);
        v4.h annotations = getAnnotations();
        kotlin.jvm.internal.l.e("<get-annotations>(...)", annotations);
        W4.e name = getName();
        kotlin.jvm.internal.l.e("getName(...)", name);
        C1467t c1467t = new C1467t(this.f17421o, interfaceC2105kK, annotations, name, this.f17422p, this.f12833s, this.f12834t, this.f12835u, this.f12836v, this.f12837w);
        List listN = n();
        B bP0 = P0();
        b0 b0Var = b0.f13390m;
        c1467t.Q0(listN, AbstractC1566c.b(v5.g(bP0, b0Var)), AbstractC1566c.b(v5.g(O0(), b0Var)));
        return c1467t;
    }

    @Override // l5.InterfaceC1459l
    public final T4.i d0() {
        return this.f12835u;
    }

    @Override // u4.InterfaceC2102h
    public final B g() {
        B b4 = this.f12832A;
        if (b4 != null) {
            return b4;
        }
        kotlin.jvm.internal.l.l("defaultTypeImpl");
        throw null;
    }

    @Override // l5.InterfaceC1459l
    public final T4.g n0() {
        return this.f12834t;
    }

    @Override // l5.InterfaceC1459l
    public final InterfaceC1458k p() {
        return this.f12837w;
    }
}
