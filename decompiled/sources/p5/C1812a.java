package p5;

import P3.y;
import g5.o;
import java.util.List;
import l4.AbstractC1420H;
import m5.C1523l;
import n5.T;
import n5.V;
import o5.C1706f;
import u4.AbstractC2108n;
import u4.EnumC2100f;
import u4.EnumC2117x;
import u4.InterfaceC2099e;
import u4.InterfaceC2106l;
import u4.M;
import u4.N;
import v4.C2159g;
import x4.C2283j;
import x4.C2285l;

/* renamed from: p5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1812a extends C2285l {
    /* JADX WARN: Illegal instructions before constructor call */
    public C1812a(W4.e eVar) {
        l lVar = l.a;
        e eVar2 = l.f14455b;
        EnumC2117x enumC2117x = EnumC2117x.f16344n;
        EnumC2100f enumC2100f = EnumC2100f.f16311k;
        List list = y.f7779k;
        N n7 = M.f16295i;
        super(eVar2, eVar, enumC2117x, enumC2100f, list, C1523l.f12991e);
        C2283j c2283j = new C2283j(this, null, C2159g.a, true, 1, n7);
        c2283j.b1(list, AbstractC2108n.f16322e);
        h hVar = h.f14413p;
        String str = c2283j.getName().f9624k;
        kotlin.jvm.internal.l.e("toString(...)", str);
        g gVarB = l.b(hVar, str, "");
        k kVar = k.f14430F;
        c2283j.f17494q = new i(l.d(kVar, new String[0]), gVarB, kVar, list, false, new String[0]);
        q0(gVarB, AbstractC1420H.K(c2283j), c2283j);
    }

    @Override // x4.AbstractC2275b, u4.O
    public final InterfaceC2106l b(V v5) {
        kotlin.jvm.internal.l.f("substitutor", v5);
        return this;
    }

    @Override // x4.AbstractC2275b, x4.AbstractC2299z
    public final o f(T t7, C1706f c1706f) {
        h hVar = h.f14413p;
        String str = getName().f9624k;
        kotlin.jvm.internal.l.e("toString(...)", str);
        return l.b(hVar, str, t7.toString());
    }

    @Override // x4.AbstractC2275b
    /* renamed from: j0 */
    public final InterfaceC2099e b(V v5) {
        kotlin.jvm.internal.l.f("substitutor", v5);
        return this;
    }

    @Override // x4.C2285l
    public final String toString() {
        String strB = getName().b();
        kotlin.jvm.internal.l.e("asString(...)", strB);
        return strB;
    }
}
