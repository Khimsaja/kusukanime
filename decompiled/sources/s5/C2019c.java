package s5;

import a5.InterfaceC0668b;
import kotlin.jvm.internal.l;
import n5.G;
import n5.M;
import n5.N;
import n5.Q;
import n5.b0;

/* renamed from: s5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2019c extends N {
    @Override // n5.N
    public final Q g(M m7) {
        l.f("key", m7);
        InterfaceC0668b interfaceC0668b = m7 instanceof InterfaceC0668b ? (InterfaceC0668b) m7 : null;
        if (interfaceC0668b == null) {
            return null;
        }
        if (interfaceC0668b.a().c()) {
            return new G(interfaceC0668b.a().b(), b0.f13392o);
        }
        return interfaceC0668b.a();
    }
}
