package C2;

import B1.AbstractC0015b;
import O1.S;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: C2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032e implements V1.n {

    /* renamed from: c, reason: collision with root package name */
    public final B1.B f710c;

    /* renamed from: d, reason: collision with root package name */
    public final B1.A f711d;

    /* renamed from: e, reason: collision with root package name */
    public S f712e;

    /* renamed from: f, reason: collision with root package name */
    public long f713f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f715h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f716i;
    public final C0033f a = new C0033f(0, null, "audio/mp4a-latm", true);

    /* renamed from: b, reason: collision with root package name */
    public final B1.B f709b = new B1.B(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f714g = -1;

    public C0032e() {
        B1.B b4 = new B1.B(10);
        this.f710c = b4;
        byte[] bArr = b4.a;
        this.f711d = new B1.A(bArr, bArr.length);
    }

    @Override // V1.n
    public final boolean b(V1.o oVar) throws EOFException, InterruptedIOException {
        V1.k kVar = (V1.k) oVar;
        int i7 = 0;
        while (true) {
            B1.B b4 = this.f710c;
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
        if (this.f714g == -1) {
            this.f714g = i7;
        }
        int i8 = i7;
        int i9 = 0;
        int i10 = 0;
        do {
            B1.B b7 = this.f710c;
            kVar.h(b7.a, 0, 2, false);
            b7.F(0);
            if ((b7.z() & 65526) == 65520) {
                i9++;
                if (i9 >= 4 && i10 > 188) {
                    return true;
                }
                kVar.h(b7.a, 0, 4, false);
                B1.A a = this.f711d;
                a.q(14);
                int i11 = a.i(13);
                if (i11 <= 6) {
                    i8++;
                    kVar.f9394p = 0;
                    kVar.b(i8, false);
                } else {
                    kVar.b(i11 - 6, false);
                    i10 += i11;
                }
            } else {
                i8++;
                kVar.f9394p = 0;
                kVar.b(i8, false);
            }
            i9 = 0;
            i10 = 0;
        } while (i8 - i7 < 8192);
        return false;
    }

    @Override // V1.n
    public final void d(V1.p pVar) {
        this.f712e = (S) pVar;
        this.a.e(pVar, new K(0, 1));
        ((S) pVar).b();
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        this.f715h = false;
        this.a.a();
        this.f713f = j8;
    }

    @Override // V1.n
    public final int i(V1.o oVar, V1.r rVar) throws EOFException, InterruptedIOException {
        AbstractC0015b.i(this.f712e);
        long j7 = ((V1.k) oVar).f9391m;
        B1.B b4 = this.f709b;
        int iO = ((V1.k) oVar).o(b4.a, 0, 2048);
        boolean z7 = iO == -1;
        if (!this.f716i) {
            this.f712e.k(new V1.s(-9223372036854775807L));
            this.f716i = true;
        }
        if (z7) {
            return -1;
        }
        b4.F(0);
        b4.E(iO);
        boolean z8 = this.f715h;
        C0033f c0033f = this.a;
        if (!z8) {
            c0033f.f737u = this.f713f;
            this.f715h = true;
        }
        c0033f.b(b4);
        return 0;
    }

    @Override // V1.n
    public final void a() {
    }
}
