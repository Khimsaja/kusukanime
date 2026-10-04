package X1;

import B1.AbstractC0015b;
import B1.K;
import V1.B;
import V1.G;
import V1.z;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class e {
    public final d a;

    /* renamed from: b, reason: collision with root package name */
    public final G f9789b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9790c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9791d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9792e;

    /* renamed from: f, reason: collision with root package name */
    public int f9793f;

    /* renamed from: g, reason: collision with root package name */
    public int f9794g;

    /* renamed from: h, reason: collision with root package name */
    public int f9795h;

    /* renamed from: i, reason: collision with root package name */
    public int f9796i;

    /* renamed from: j, reason: collision with root package name */
    public int f9797j;

    /* renamed from: k, reason: collision with root package name */
    public int f9798k;

    /* renamed from: l, reason: collision with root package name */
    public long f9799l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f9800m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f9801n;

    public e(int i7, d dVar, G g4) {
        this.a = dVar;
        int iA = dVar.a();
        boolean z7 = true;
        if (iA != 1 && iA != 2) {
            z7 = false;
        }
        AbstractC0015b.c(z7);
        int i8 = (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48);
        this.f9790c = (iA == 2 ? 1667497984 : 1651965952) | i8;
        int i9 = dVar.f9786d;
        long j7 = dVar.f9784b * 1000000;
        long j8 = dVar.f9785c;
        int i10 = K.a;
        this.f9792e = K.L(i9, j7, j8, RoundingMode.DOWN);
        this.f9789b = g4;
        this.f9791d = iA == 2 ? i8 | 1650720768 : -1;
        this.f9799l = -1L;
        this.f9800m = new long[512];
        this.f9801n = new int[512];
        this.f9793f = i9;
    }

    public final B a(int i7) {
        return new B(((this.f9792e * 1) / this.f9793f) * this.f9801n[i7], this.f9800m[i7]);
    }

    public final z b(long j7) {
        if (this.f9798k == 0) {
            B b4 = new B(0L, this.f9799l);
            return new z(b4, b4);
        }
        int i7 = (int) (j7 / ((this.f9792e * 1) / this.f9793f));
        int iC = K.c(this.f9801n, i7, true, true);
        if (this.f9801n[iC] == i7) {
            B bA = a(iC);
            return new z(bA, bA);
        }
        B bA2 = a(iC);
        int i8 = iC + 1;
        return i8 < this.f9800m.length ? new z(bA2, a(i8)) : new z(bA2, bA2);
    }
}
