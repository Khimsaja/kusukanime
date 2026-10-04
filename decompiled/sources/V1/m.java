package V1;

import java.io.EOFException;
import y1.C2393o;
import y1.InterfaceC2385g;

/* loaded from: classes.dex */
public final class m implements G {
    public final byte[] a = new byte[4096];

    @Override // V1.G
    public final void c(B1.B b4, int i7, int i8) {
        b4.G(i7);
    }

    @Override // V1.G
    public final int d(InterfaceC2385g interfaceC2385g, int i7, boolean z7) throws EOFException {
        byte[] bArr = this.a;
        int iO = interfaceC2385g.o(bArr, 0, Math.min(bArr.length, i7));
        if (iO != -1) {
            return iO;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // V1.G
    public final void a(C2393o c2393o) {
    }

    @Override // V1.G
    public final void b(long j7, int i7, int i8, int i9, F f5) {
    }
}
