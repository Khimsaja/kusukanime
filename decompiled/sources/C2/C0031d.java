package C2;

import O1.S;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: C2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031d implements V1.n {
    public final C0030c a = new C0030c(0, 1, null, "audio/ac4");

    /* renamed from: b, reason: collision with root package name */
    public final B1.B f707b = new B1.B(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f708c;

    @Override // V1.n
    public final boolean b(V1.o oVar) throws EOFException, InterruptedIOException {
        V1.k kVar;
        int i7;
        B1.B b4 = new B1.B(10);
        int i8 = 0;
        while (true) {
            kVar = (V1.k) oVar;
            kVar.h(b4.a, 0, 10, false);
            b4.F(0);
            if (b4.w() != 4801587) {
                break;
            }
            b4.G(3);
            int iS = b4.s();
            i8 += iS + 10;
            kVar.b(iS, false);
        }
        kVar.f9394p = 0;
        kVar.b(i8, false);
        int i9 = 0;
        int i10 = i8;
        while (true) {
            int i11 = 7;
            kVar.h(b4.a, 0, 7, false);
            b4.F(0);
            int iZ = b4.z();
            if (iZ == 44096 || iZ == 44097) {
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                byte[] bArr = b4.a;
                if (bArr.length < 7) {
                    i7 = -1;
                } else {
                    int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i12 == 65535) {
                        i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i11 = 4;
                    }
                    if (iZ == 44097) {
                        i11 += 2;
                    }
                    i7 = i12 + i11;
                }
                if (i7 == -1) {
                    break;
                }
                kVar.b(i7 - 7, false);
            } else {
                kVar.f9394p = 0;
                i10++;
                if (i10 - i8 >= 8192) {
                    break;
                }
                kVar.b(i10, false);
                i9 = 0;
            }
        }
        return false;
    }

    @Override // V1.n
    public final void d(V1.p pVar) {
        this.a.e(pVar, new K(0, 1));
        S s7 = (S) pVar;
        s7.b();
        s7.k(new V1.s(-9223372036854775807L));
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        this.f708c = false;
        this.a.a();
    }

    @Override // V1.n
    public final int i(V1.o oVar, V1.r rVar) throws EOFException, InterruptedIOException {
        B1.B b4 = this.f707b;
        int iO = ((V1.k) oVar).o(b4.a, 0, 16384);
        if (iO == -1) {
            return -1;
        }
        b4.F(0);
        b4.E(iO);
        boolean z7 = this.f708c;
        C0030c c0030c = this.a;
        if (!z7) {
            c0030c.f706o = 0L;
            this.f708c = true;
        }
        c0030c.b(b4);
        return 0;
    }

    @Override // V1.n
    public final void a() {
    }
}
