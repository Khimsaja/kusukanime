package o4;

import l4.InterfaceC1438q;
import x4.C2263I;

/* loaded from: classes.dex */
public class j0 extends q0 implements e4.n {

    /* renamed from: y, reason: collision with root package name */
    public final Object f13712y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(AbstractC1654H abstractC1654H, C2263I c2263i) {
        super(abstractC1654H, c2263i);
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        kotlin.jvm.internal.l.f("descriptor", c2263i);
        O3.j jVar = O3.j.f7525k;
        this.f13712y = z1.c.B(jVar, new h0(this, 0));
        z1.c.B(jVar, new h0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1443v
    public final InterfaceC1438q getGetter() {
        return (i0) this.f13712y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) this.f13712y.getValue()).call(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // o4.q0
    public final n0 w() {
        return (i0) this.f13712y.getValue();
    }
}
