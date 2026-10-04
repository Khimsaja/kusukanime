package q2;

import B1.B;
import O1.W;
import V1.AbstractC0597b;
import V1.t;
import java.util.Arrays;
import n5.P;
import y1.C2392n;
import y1.C2393o;
import y1.D;

/* renamed from: q2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1849c extends j {

    /* renamed from: n, reason: collision with root package name */
    public t f14690n;

    /* renamed from: o, reason: collision with root package name */
    public W f14691o;

    @Override // q2.j
    public final long b(B b4) {
        byte[] bArr = b4.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i7 = (bArr[2] & 255) >> 4;
        if (i7 == 6 || i7 == 7) {
            b4.G(4);
            b4.A();
        }
        int iS = AbstractC0597b.s(i7, b4);
        b4.F(0);
        return iS;
    }

    @Override // q2.j
    public final boolean c(B b4, long j7, P p7) {
        byte[] bArr = b4.a;
        t tVar = this.f14690n;
        if (tVar == null) {
            t tVar2 = new t(bArr, 17);
            this.f14690n = tVar2;
            C2392n c2392nA = tVar2.c(Arrays.copyOfRange(bArr, 9, b4.f289c), null).a();
            c2392nA.f18073l = D.m("audio/ogg");
            p7.f13378l = new C2393o(c2392nA);
            return true;
        }
        byte b7 = bArr[0];
        if ((b7 & 127) != 3) {
            if (b7 != -1) {
                return true;
            }
            W w7 = this.f14691o;
            if (w7 != null) {
                w7.f7366k = j7;
                p7.f13379m = w7;
            }
            ((C2393o) p7.f13378l).getClass();
            return false;
        }
        L2.e eVarT = AbstractC0597b.t(b4);
        t tVar3 = new t(tVar.a, tVar.f9406b, tVar.f9407c, tVar.f9408d, tVar.f9409e, tVar.f9411g, tVar.f9412h, tVar.f9414j, eVarT, tVar.f9416l);
        this.f14690n = tVar3;
        W w8 = new W();
        w8.f7368m = tVar3;
        w8.f7369n = eVarT;
        w8.f7366k = -1L;
        w8.f7367l = -1L;
        this.f14691o = w8;
        return true;
    }

    @Override // q2.j
    public final void d(boolean z7) {
        super.d(z7);
        if (z7) {
            this.f14690n = null;
            this.f14691o = null;
        }
    }
}
