package o4;

import l4.InterfaceC1438q;
import x4.C2263I;

/* loaded from: classes.dex */
public class s0 extends q0 {

    /* renamed from: y, reason: collision with root package name */
    public final Object f13749y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(AbstractC1654H abstractC1654H, C2263I c2263i) {
        super(abstractC1654H, c2263i);
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        kotlin.jvm.internal.l.f("descriptor", c2263i);
        this.f13749y = z1.c.B(O3.j.f7525k, new H4.u(22, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1443v
    public final InterfaceC1438q getGetter() {
        return (r0) this.f13749y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // o4.q0
    public final n0 w() {
        return (r0) this.f13749y.getValue();
    }
}
