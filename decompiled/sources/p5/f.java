package p5;

import H4.o;
import P3.y;
import b1.AbstractC0703b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import n5.AbstractC1586x;
import n5.V;
import u4.AbstractC2108n;
import u4.EnumC2117x;
import u4.InterfaceC2095a;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import u4.K;
import u4.M;
import x4.C2263I;
import x4.C2264J;
import x4.C2265K;
import x4.C2292s;
import x4.C2295v;

/* loaded from: classes.dex */
public final class f implements K {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2263I f14407k;

    public f() {
        l lVar = l.a;
        C1812a c1812a = l.f14456c;
        EnumC2117x enumC2117x = EnumC2117x.f16344n;
        o oVar = AbstractC2108n.f16322e;
        b[] bVarArr = b.f14401k;
        C2263I c2263iO0 = C2263I.O0(c1812a, enumC2117x, oVar, true, W4.e.g("<Error property>"), 1, M.f16295i);
        i iVar = l.f14458e;
        y yVar = y.f7779k;
        c2263iO0.U0(iVar, yVar, null, null, yVar);
        this.f14407k = c2263iO0;
    }

    @Override // u4.U
    public final boolean A() {
        return this.f14407k.f17384p;
    }

    @Override // u4.InterfaceC2096b
    public final C2295v D() {
        return this.f14407k.f17380E;
    }

    @Override // u4.K
    public final C2292s G() {
        return this.f14407k.J;
    }

    @Override // u4.InterfaceC2096b
    public final boolean K() {
        this.f14407k.getClass();
        return false;
    }

    @Override // u4.K
    public final C2292s L() {
        return this.f14407k.I;
    }

    @Override // u4.InterfaceC2096b
    public final List M() {
        List listM = this.f14407k.M();
        kotlin.jvm.internal.l.e("getContextReceiverParameters(...)", listM);
        return listM;
    }

    @Override // u4.U
    public final boolean O() {
        return this.f14407k.f17392x;
    }

    @Override // u4.InterfaceC2116w
    public final boolean Q() {
        return this.f14407k.f17394z;
    }

    @Override // u4.K
    public final boolean U() {
        return this.f14407k.f17377B;
    }

    @Override // u4.InterfaceC2097c
    public final void W(Collection collection) {
        this.f14407k.f17389u = collection;
    }

    @Override // u4.InterfaceC2105k
    public final K a() {
        K kA = this.f14407k.a();
        kotlin.jvm.internal.l.e("getOriginal(...)", kA);
        return kA;
    }

    @Override // u4.InterfaceC2096b
    public final Object a0(InterfaceC2095a interfaceC2095a) {
        this.f14407k.getClass();
        return null;
    }

    @Override // u4.O
    public final K b(V v5) {
        kotlin.jvm.internal.l.f("substitutor", v5);
        return this.f14407k.b(v5);
    }

    @Override // u4.InterfaceC2097c
    public final int c() {
        int iC = this.f14407k.c();
        AbstractC0703b.A(iC, "getKind(...)");
        return iC;
    }

    @Override // u4.InterfaceC2116w
    public final EnumC2117x e() {
        EnumC2117x enumC2117xE = this.f14407k.e();
        kotlin.jvm.internal.l.e("getModality(...)", enumC2117xE);
        return enumC2117xE;
    }

    @Override // v4.InterfaceC2153a
    public final v4.h getAnnotations() {
        v4.h annotations = this.f14407k.getAnnotations();
        kotlin.jvm.internal.l.e("<get-annotations>(...)", annotations);
        return annotations;
    }

    @Override // u4.K
    public final C2264J getGetter() {
        return this.f14407k.f17382G;
    }

    @Override // u4.InterfaceC2105k
    public final W4.e getName() {
        W4.e name = this.f14407k.getName();
        kotlin.jvm.internal.l.e("getName(...)", name);
        return name;
    }

    @Override // u4.InterfaceC2096b
    public final AbstractC1586x getReturnType() {
        return this.f14407k.getReturnType();
    }

    @Override // u4.K
    public final C2265K getSetter() {
        return this.f14407k.f17383H;
    }

    @Override // u4.T
    public final AbstractC1586x getType() {
        AbstractC1586x type = this.f14407k.getType();
        kotlin.jvm.internal.l.e("getType(...)", type);
        return type;
    }

    @Override // u4.InterfaceC2096b
    public final List getTypeParameters() {
        return this.f14407k.getTypeParameters();
    }

    @Override // u4.InterfaceC2107m
    public final o getVisibility() {
        o visibility = this.f14407k.getVisibility();
        kotlin.jvm.internal.l.e("getVisibility(...)", visibility);
        return visibility;
    }

    @Override // u4.U
    public final b5.g h0() {
        return this.f14407k.h0();
    }

    @Override // u4.InterfaceC2116w
    public final boolean i0() {
        this.f14407k.getClass();
        return false;
    }

    @Override // u4.U
    public final boolean isConst() {
        return this.f14407k.isConst();
    }

    @Override // u4.InterfaceC2116w
    public final boolean isExternal() {
        return this.f14407k.isExternal();
    }

    @Override // u4.InterfaceC2105k
    public final InterfaceC2105k k() {
        InterfaceC2105k interfaceC2105kK = this.f14407k.k();
        kotlin.jvm.internal.l.e("getContainingDeclaration(...)", interfaceC2105kK);
        return interfaceC2105kK;
    }

    @Override // u4.InterfaceC2106l
    public final M l() {
        M mL = this.f14407k.l();
        kotlin.jvm.internal.l.e("getSource(...)", mL);
        return mL;
    }

    @Override // u4.InterfaceC2097c, u4.InterfaceC2096b
    public final Collection m() {
        Collection collectionM = this.f14407k.m();
        kotlin.jvm.internal.l.e("getOverriddenDescriptors(...)", collectionM);
        return collectionM;
    }

    @Override // u4.InterfaceC2096b
    public final List m0() {
        this.f14407k.m0();
        List list = Collections.EMPTY_LIST;
        kotlin.jvm.internal.l.e("getValueParameters(...)", list);
        return list;
    }

    @Override // u4.K
    public final ArrayList o() {
        return this.f14407k.o();
    }

    @Override // u4.InterfaceC2096b
    public final C2295v t() {
        return this.f14407k.f17379D;
    }

    @Override // u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        C2263I c2263i = this.f14407k;
        c2263i.getClass();
        return yVar.M(c2263i, obj);
    }

    @Override // u4.InterfaceC2097c
    public final InterfaceC2097c z(InterfaceC2099e interfaceC2099e, EnumC2117x enumC2117x, o oVar) {
        return this.f14407k.z(interfaceC2099e, enumC2117x, oVar);
    }
}
