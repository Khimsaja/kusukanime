package C2;

/* loaded from: classes.dex */
public final class B {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.H f634b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.B f635c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f636d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f637e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f638f;

    /* renamed from: g, reason: collision with root package name */
    public long f639g;

    /* renamed from: h, reason: collision with root package name */
    public long f640h;

    /* renamed from: i, reason: collision with root package name */
    public long f641i;

    public B(int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.f634b = new B1.H(0L);
                this.f639g = -9223372036854775807L;
                this.f640h = -9223372036854775807L;
                this.f641i = -9223372036854775807L;
                this.f635c = new B1.B();
                break;
            default:
                this.f634b = new B1.H(0L);
                this.f639g = -9223372036854775807L;
                this.f640h = -9223372036854775807L;
                this.f641i = -9223372036854775807L;
                this.f635c = new B1.B();
                break;
        }
    }

    public static int b(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static long c(B1.B b4) {
        int i7 = b4.f288b;
        if (b4.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        b4.e(bArr, 0, 9);
        b4.F(i7);
        byte b7 = bArr[0];
        if ((b7 & 196) == 68) {
            byte b8 = bArr[2];
            if ((b8 & 4) == 4) {
                byte b9 = bArr[4];
                if ((b9 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j7 = b7;
                    long j8 = b8;
                    return ((j8 & 3) << 13) | ((j7 & 3) << 28) | (((56 & j7) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j8 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b9 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(V1.k kVar) {
        switch (this.a) {
            case 0:
                byte[] bArr = B1.K.f302c;
                B1.B b4 = this.f635c;
                b4.getClass();
                b4.D(bArr, bArr.length);
                this.f636d = true;
                kVar.f9394p = 0;
                break;
            default:
                byte[] bArr2 = B1.K.f302c;
                B1.B b7 = this.f635c;
                b7.getClass();
                b7.D(bArr2, bArr2.length);
                this.f636d = true;
                kVar.f9394p = 0;
                break;
        }
    }
}
