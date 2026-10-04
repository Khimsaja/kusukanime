package p5;

import F2.G;
import O3.q;
import P3.y;
import java.util.Collection;
import java.util.List;
import r4.AbstractC1880i;
import u4.InterfaceC2092H;
import u4.InterfaceC2105k;
import u4.InterfaceC2118y;
import v4.C2159g;

/* loaded from: classes.dex */
public final class e implements InterfaceC2118y {

    /* renamed from: k, reason: collision with root package name */
    public static final e f14403k = new e();

    /* renamed from: l, reason: collision with root package name */
    public static final W4.e f14404l;

    /* renamed from: m, reason: collision with root package name */
    public static final y f14405m;

    /* renamed from: n, reason: collision with root package name */
    public static final q f14406n;

    static {
        b[] bVarArr = b.f14401k;
        f14404l = W4.e.g("<Error module>");
        f14405m = y.f7779k;
        f14406n = z1.c.C(d.f14402k);
    }

    @Override // u4.InterfaceC2118y
    public final InterfaceC2092H F(W4.c cVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        throw new IllegalStateException("Should not be called!");
    }

    @Override // u4.InterfaceC2118y
    public final List P() {
        return f14405m;
    }

    @Override // u4.InterfaceC2118y
    public final AbstractC1880i d() {
        return (AbstractC1880i) f14406n.getValue();
    }

    @Override // v4.InterfaceC2153a
    public final v4.h getAnnotations() {
        return C2159g.a;
    }

    @Override // u4.InterfaceC2105k
    public final W4.e getName() {
        return f14404l;
    }

    @Override // u4.InterfaceC2118y
    public final Collection h(W4.c cVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        return y.f7779k;
    }

    @Override // u4.InterfaceC2105k
    public final InterfaceC2105k k() {
        return null;
    }

    @Override // u4.InterfaceC2118y
    public final Object o0(G g4) {
        kotlin.jvm.internal.l.f("capability", g4);
        return null;
    }

    @Override // u4.InterfaceC2118y
    public final boolean r(InterfaceC2118y interfaceC2118y) {
        kotlin.jvm.internal.l.f("targetModule", interfaceC2118y);
        return false;
    }

    @Override // u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        return null;
    }

    @Override // u4.InterfaceC2105k
    public final InterfaceC2105k a() {
        return this;
    }
}
