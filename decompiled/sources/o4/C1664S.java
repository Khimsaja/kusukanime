package o4;

import l4.InterfaceC1429h;
import l4.InterfaceC1434m;
import x4.C2263I;

/* renamed from: o4.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1664S extends s0 implements InterfaceC1434m {

    /* renamed from: z, reason: collision with root package name */
    public final Object f13654z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1664S(AbstractC1654H abstractC1654H, C2263I c2263i) {
        super(abstractC1654H, c2263i);
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        kotlin.jvm.internal.l.f("descriptor", c2263i);
        this.f13654z = z1.c.B(O3.j.f7525k, new H4.u(21, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1434m
    public final InterfaceC1429h getSetter() {
        return (C1663Q) this.f13654z.getValue();
    }
}
