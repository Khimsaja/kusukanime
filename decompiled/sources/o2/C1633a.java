package o2;

import V1.A;
import V1.B;
import V1.z;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1633a implements f, A {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13556b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13557c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13558d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13559e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13560f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13561g;

    /* renamed from: h, reason: collision with root package name */
    public final long f13562h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13563i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13564j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f13565k;

    /* renamed from: l, reason: collision with root package name */
    public final long f13566l;

    public C1633a(long j7, long j8, int i7, int i8, boolean z7) {
        this.a = j7;
        this.f13556b = j8;
        this.f13557c = i8 == -1 ? 1 : i8;
        this.f13559e = i7;
        this.f13561g = z7;
        if (j7 == -1) {
            this.f13558d = -1L;
            this.f13560f = -9223372036854775807L;
        } else {
            long j9 = j7 - j8;
            this.f13558d = j9;
            this.f13560f = (Math.max(0L, j9) * 8000000) / i7;
        }
        this.f13562h = j8;
        this.f13563i = i7;
        this.f13564j = i8;
        this.f13565k = z7;
        this.f13566l = j7 == -1 ? -1L : j7;
    }

    @Override // o2.f
    public final long c() {
        return this.f13566l;
    }

    @Override // V1.A
    public final boolean g() {
        return this.f13558d != -1 || this.f13561g;
    }

    @Override // o2.f
    public final long h(long j7) {
        return (Math.max(0L, j7 - this.f13556b) * 8000000) / this.f13559e;
    }

    @Override // V1.A
    public final z j(long j7) {
        long j8 = this.f13558d;
        long j9 = this.f13556b;
        if (j8 == -1 && !this.f13561g) {
            B b4 = new B(0L, j9);
            return new z(b4, b4);
        }
        int i7 = this.f13559e;
        long j10 = this.f13557c;
        long jMin = (((i7 * j7) / 8000000) / j10) * j10;
        if (j8 != -1) {
            jMin = Math.min(jMin, j8 - j10);
        }
        long jMax = Math.max(jMin, 0L) + j9;
        long jMax2 = (Math.max(0L, jMax - j9) * 8000000) / i7;
        B b7 = new B(jMax2, jMax);
        if (j8 != -1 && jMax2 < j7) {
            long j11 = jMax + j10;
            if (j11 < this.a) {
                return new z(b7, new B((Math.max(0L, j11 - j9) * 8000000) / i7, j11));
            }
        }
        return new z(b7, b7);
    }

    @Override // o2.f
    public final int k() {
        return this.f13563i;
    }

    @Override // V1.A
    public final long l() {
        return this.f13560f;
    }
}
