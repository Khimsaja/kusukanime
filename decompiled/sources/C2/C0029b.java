package C2;

import O1.S;
import V1.AbstractC0597b;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: C2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029b implements V1.n {
    public final C0030c a = new C0030c("audio/ac3");

    /* renamed from: b, reason: collision with root package name */
    public final B1.B f691b = new B1.B(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f692c;

    @Override // V1.n
    public final boolean b(V1.o oVar) throws EOFException, InterruptedIOException {
        V1.k kVar;
        int iF;
        B1.B b4 = new B1.B(10);
        int i7 = 0;
        while (true) {
            kVar = (V1.k) oVar;
            kVar.h(b4.a, 0, 10, false);
            b4.F(0);
            if (b4.w() != 4801587) {
                break;
            }
            b4.G(3);
            int iS = b4.s();
            i7 += iS + 10;
            kVar.b(iS, false);
        }
        kVar.f9394p = 0;
        kVar.b(i7, false);
        int i8 = 0;
        int i9 = i7;
        while (true) {
            kVar.h(b4.a, 0, 6, false);
            b4.F(0);
            if (b4.z() != 2935) {
                kVar.f9394p = 0;
                i9++;
                if (i9 - i7 >= 8192) {
                    break;
                }
                kVar.b(i9, false);
                i8 = 0;
            } else {
                i8++;
                if (i8 >= 4) {
                    return true;
                }
                byte[] bArr = b4.a;
                if (bArr.length < 6) {
                    iF = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iF = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b7 = bArr[4];
                    iF = AbstractC0597b.f((b7 & 192) >> 6, b7 & 63);
                }
                if (iF == -1) {
                    break;
                }
                kVar.b(iF - 6, false);
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
        this.f692c = false;
        this.a.a();
    }

    @Override // V1.n
    public final int i(V1.o oVar, V1.r rVar) throws EOFException, InterruptedIOException {
        B1.B b4 = this.f691b;
        int iO = ((V1.k) oVar).o(b4.a, 0, 2786);
        if (iO == -1) {
            return -1;
        }
        b4.F(0);
        b4.E(iO);
        boolean z7 = this.f692c;
        C0030c c0030c = this.a;
        if (!z7) {
            c0030c.f706o = 0L;
            this.f692c = true;
        }
        c0030c.b(b4);
        return 0;
    }

    @Override // V1.n
    public final void a() {
    }
}
