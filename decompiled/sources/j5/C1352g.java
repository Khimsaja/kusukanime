package j5;

import java.util.Set;
import l4.AbstractC1420H;
import m5.C1521j;
import r4.AbstractC1886o;
import u4.InterfaceC2099e;

/* renamed from: j5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1352g {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f12412c;
    public final C1354i a;

    /* renamed from: b, reason: collision with root package name */
    public final C1521j f12413b;

    static {
        W4.c cVarI = AbstractC1886o.f14990c.i();
        f12412c = AbstractC1420H.K(new W4.b(cVarI.b(), cVarI.a.g()));
    }

    public C1352g(C1354i c1354i) {
        kotlin.jvm.internal.l.f("components", c1354i);
        this.a = c1354i;
        this.f12413b = c1354i.a.c(new A4.j(17, this));
    }

    public final InterfaceC2099e a(W4.b bVar, C1349d c1349d) {
        kotlin.jvm.internal.l.f("classId", bVar);
        return (InterfaceC2099e) this.f12413b.invoke(new C1351f(bVar, c1349d));
    }
}
