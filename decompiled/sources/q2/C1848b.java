package q2;

import B1.AbstractC0015b;
import B1.K;
import V1.A;

/* renamed from: q2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1848b implements h {

    /* renamed from: k, reason: collision with root package name */
    public final g f14678k;

    /* renamed from: l, reason: collision with root package name */
    public final long f14679l;

    /* renamed from: m, reason: collision with root package name */
    public final long f14680m;

    /* renamed from: n, reason: collision with root package name */
    public final j f14681n;

    /* renamed from: o, reason: collision with root package name */
    public int f14682o;

    /* renamed from: p, reason: collision with root package name */
    public long f14683p;

    /* renamed from: q, reason: collision with root package name */
    public long f14684q;

    /* renamed from: r, reason: collision with root package name */
    public long f14685r;

    /* renamed from: s, reason: collision with root package name */
    public long f14686s;

    /* renamed from: t, reason: collision with root package name */
    public long f14687t;

    /* renamed from: u, reason: collision with root package name */
    public long f14688u;

    /* renamed from: v, reason: collision with root package name */
    public long f14689v;

    public C1848b(j jVar, long j7, long j8, long j9, long j10, boolean z7) {
        AbstractC0015b.c(j7 >= 0 && j8 > j7);
        this.f14681n = jVar;
        this.f14679l = j7;
        this.f14680m = j8;
        if (j9 == j8 - j7 || z7) {
            this.f14683p = j10;
            this.f14682o = 4;
        } else {
            this.f14682o = 0;
        }
        this.f14678k = new g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // q2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(V1.k r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.C1848b.f(V1.k):long");
    }

    @Override // q2.h
    public final A g() {
        if (this.f14683p != 0) {
            return new C1847a(this);
        }
        return null;
    }

    @Override // q2.h
    public final void j(long j7) {
        this.f14685r = K.i(j7, 0L, this.f14683p - 1);
        this.f14682o = 2;
        this.f14686s = this.f14679l;
        this.f14687t = this.f14680m;
        this.f14688u = 0L;
        this.f14689v = this.f14683p;
    }
}
