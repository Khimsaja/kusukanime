package V1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class y {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f9433b;

    /* renamed from: c, reason: collision with root package name */
    public int f9434c;

    /* renamed from: d, reason: collision with root package name */
    public int f9435d;

    /* renamed from: e, reason: collision with root package name */
    public int f9436e;

    /* renamed from: f, reason: collision with root package name */
    public int f9437f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f9438g;

    public boolean a(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (!((i7 & (-2097152)) == -2097152) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i8;
        this.f9438g = AbstractC0597b.f9347s[3 - i9];
        int i12 = AbstractC0597b.f9348t[i11];
        this.f9434c = i12;
        if (i8 == 2) {
            this.f9434c = i12 / 2;
        } else if (i8 == 0) {
            this.f9434c = i12 / 4;
        }
        int i13 = (i7 >>> 9) & 1;
        int i14 = 1152;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    throw new IllegalArgumentException();
                }
                i14 = 384;
            }
        } else if (i8 != 3) {
            i14 = 576;
        }
        this.f9437f = i14;
        if (i9 == 3) {
            int i15 = i8 == 3 ? AbstractC0597b.f9349u[i10 - 1] : AbstractC0597b.f9350v[i10 - 1];
            this.f9436e = i15;
            this.f9433b = (((i15 * 12) / this.f9434c) + i13) * 4;
        } else {
            if (i8 == 3) {
                int i16 = i9 == 2 ? AbstractC0597b.f9351w[i10 - 1] : AbstractC0597b.f9352x[i10 - 1];
                this.f9436e = i16;
                this.f9433b = ((i16 * 144) / this.f9434c) + i13;
            } else {
                int i17 = AbstractC0597b.f9353y[i10 - 1];
                this.f9436e = i17;
                this.f9433b = (((i9 == 1 ? 72 : 144) * i17) / this.f9434c) + i13;
            }
        }
        this.f9435d = ((i7 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
