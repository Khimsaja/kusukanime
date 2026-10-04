package s2;

import B1.InterfaceC0021h;
import j3.D;
import j3.G;

/* renamed from: s2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1982j {
    default InterfaceC1976d h(byte[] bArr, int i7, int i8) {
        D dR = G.r();
        p(bArr, 0, i8, C1981i.f15520c, new C2.G(17, dR));
        return new C1974b(dR.f());
    }

    void p(byte[] bArr, int i7, int i8, C1981i c1981i, InterfaceC0021h interfaceC0021h);

    default void reset() {
    }
}
