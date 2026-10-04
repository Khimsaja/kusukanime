package V1;

import B1.AbstractC0015b;

/* loaded from: classes.dex */
public final class H {
    public final byte[] a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f9322b;

    /* renamed from: c, reason: collision with root package name */
    public int f9323c;

    /* renamed from: d, reason: collision with root package name */
    public long f9324d;

    /* renamed from: e, reason: collision with root package name */
    public int f9325e;

    /* renamed from: f, reason: collision with root package name */
    public int f9326f;

    /* renamed from: g, reason: collision with root package name */
    public int f9327g;

    public final void a(G g4, F f5) {
        if (this.f9323c > 0) {
            g4.b(this.f9324d, this.f9325e, this.f9326f, this.f9327g, f5);
            this.f9323c = 0;
        }
    }

    public final void b(G g4, long j7, int i7, int i8, int i9, F f5) {
        AbstractC0015b.g("TrueHD chunk samples must be contiguous in the sample queue.", this.f9327g <= i8 + i9);
        if (this.f9322b) {
            int i10 = this.f9323c;
            int i11 = i10 + 1;
            this.f9323c = i11;
            if (i10 == 0) {
                this.f9324d = j7;
                this.f9325e = i7;
                this.f9326f = 0;
            }
            this.f9326f += i8;
            this.f9327g = i9;
            if (i11 >= 16) {
                a(g4, f5);
            }
        }
    }

    public final void c(o oVar) {
        if (this.f9322b) {
            return;
        }
        byte[] bArr = this.a;
        int i7 = 0;
        oVar.l(bArr, 0, 10);
        oVar.e();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b4 = bArr[7];
            if ((b4 & 254) == 186) {
                i7 = 40 << ((bArr[(b4 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i7 == 0) {
            return;
        }
        this.f9322b = true;
    }
}
