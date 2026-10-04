package t4;

import e5.AbstractC0832b;
import kotlin.jvm.internal.y;
import l4.InterfaceC1443v;
import m5.C1520i;
import m5.C1523l;
import r4.AbstractC1880i;
import r4.C1883l;
import w4.InterfaceC2212b;
import w4.InterfaceC2214d;
import x4.C2255A;

/* renamed from: t4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2059j extends AbstractC1880i {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f16060h = {y.a.h(new kotlin.jvm.internal.r(C2059j.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* renamed from: f, reason: collision with root package name */
    public C1883l f16061f;

    /* renamed from: g, reason: collision with root package name */
    public final C1520i f16062g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2059j(C1523l c1523l) {
        super(c1523l);
        EnumC2057h[] enumC2057hArr = EnumC2057h.f16059k;
        this.f16062g = new C1520i(c1523l, new A3.q(22, this, c1523l));
    }

    public final o J() {
        return (o) AbstractC0832b.u(this.f16062g, f16060h[0]);
    }

    @Override // r4.AbstractC1880i
    public final InterfaceC2212b d() {
        return J();
    }

    @Override // r4.AbstractC1880i
    public final Iterable m() {
        Iterable iterableM = super.m();
        C1523l c1523l = this.f14940d;
        C2255A c2255aL = l();
        kotlin.jvm.internal.l.e("getBuiltInsModule(...)", c2255aL);
        return P3.q.F0(iterableM, new C2056g(c1523l, c2255aL));
    }

    @Override // r4.AbstractC1880i
    public final InterfaceC2214d p() {
        return J();
    }
}
