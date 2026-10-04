package H4;

import u4.InterfaceC2096b;
import u4.InterfaceC2099e;
import u4.K;

/* loaded from: classes.dex */
public final class k implements Z4.f {
    @Override // Z4.f
    public final int a(InterfaceC2096b interfaceC2096b, InterfaceC2096b interfaceC2096b2, InterfaceC2099e interfaceC2099e) {
        kotlin.jvm.internal.l.f("superDescriptor", interfaceC2096b);
        kotlin.jvm.internal.l.f("subDescriptor", interfaceC2096b2);
        if (!(interfaceC2096b2 instanceof K) || !(interfaceC2096b instanceof K)) {
            return 3;
        }
        K k7 = (K) interfaceC2096b2;
        K k8 = (K) interfaceC2096b;
        if (!kotlin.jvm.internal.l.a(k7.getName(), k8.getName())) {
            return 3;
        }
        if (P3.F.F(k7) && P3.F.F(k8)) {
            return 1;
        }
        return (P3.F.F(k7) || P3.F.F(k8)) ? 2 : 3;
    }

    @Override // Z4.f
    public final int b() {
        return 3;
    }
}
