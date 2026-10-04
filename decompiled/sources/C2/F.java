package C2;

import io.ktor.util.cio.ByteBufferPoolKt;

/* loaded from: classes.dex */
public final class F implements L {
    public final E a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.B f658b = new B1.B(32);

    /* renamed from: c, reason: collision with root package name */
    public int f659c;

    /* renamed from: d, reason: collision with root package name */
    public int f660d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f661e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f662f;

    public F(E e7) {
        this.a = e7;
    }

    @Override // C2.L
    public final void a() {
        this.f662f = true;
    }

    @Override // C2.L
    public final void b(int i7, B1.B b4) {
        boolean z7 = (i7 & 1) != 0;
        int iT = z7 ? b4.f288b + b4.t() : -1;
        if (this.f662f) {
            if (!z7) {
                return;
            }
            this.f662f = false;
            b4.F(iT);
            this.f660d = 0;
        }
        while (b4.a() > 0) {
            int i8 = this.f660d;
            B1.B b7 = this.f658b;
            if (i8 < 3) {
                if (i8 == 0) {
                    int iT2 = b4.t();
                    b4.F(b4.f288b - 1);
                    if (iT2 == 255) {
                        this.f662f = true;
                        return;
                    }
                }
                int iMin = Math.min(b4.a(), 3 - this.f660d);
                b4.e(b7.a, this.f660d, iMin);
                int i9 = this.f660d + iMin;
                this.f660d = i9;
                if (i9 == 3) {
                    b7.F(0);
                    b7.E(3);
                    b7.G(1);
                    int iT3 = b7.t();
                    int iT4 = b7.t();
                    this.f661e = (iT3 & 128) != 0;
                    int i10 = (((iT3 & 15) << 8) | iT4) + 3;
                    this.f659c = i10;
                    byte[] bArr = b7.a;
                    if (bArr.length < i10) {
                        b7.b(Math.min(ByteBufferPoolKt.DEFAULT_BUFFER_SIZE, Math.max(i10, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(b4.a(), this.f659c - this.f660d);
                b4.e(b7.a, this.f660d, iMin2);
                int i11 = this.f660d + iMin2;
                this.f660d = i11;
                int i12 = this.f659c;
                if (i11 != i12) {
                    continue;
                } else {
                    if (!this.f661e) {
                        b7.E(i12);
                    } else {
                        if (B1.K.k(0, i12, -1, b7.a) != 0) {
                            this.f662f = true;
                            return;
                        }
                        b7.E(this.f659c - 4);
                    }
                    b7.F(0);
                    this.a.b(b7);
                    this.f660d = 0;
                }
            }
        }
    }

    @Override // C2.L
    public final void c(B1.H h7, V1.p pVar, K k7) {
        this.a.c(h7, pVar, k7);
        this.f662f = true;
    }
}
