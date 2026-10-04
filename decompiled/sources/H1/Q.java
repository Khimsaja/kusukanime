package H1;

import B1.AbstractC0015b;
import O1.C0529c;
import O1.C0545t;
import android.util.Pair;

/* loaded from: classes.dex */
public final class Q {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3343b;

    /* renamed from: c, reason: collision with root package name */
    public final O1.a0[] f3344c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3345d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3346e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3347f;

    /* renamed from: g, reason: collision with root package name */
    public S f3348g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3349h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f3350i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0225f[] f3351j;

    /* renamed from: k, reason: collision with root package name */
    public final Q1.t f3352k;

    /* renamed from: l, reason: collision with root package name */
    public final c0 f3353l;

    /* renamed from: m, reason: collision with root package name */
    public Q f3354m;

    /* renamed from: n, reason: collision with root package name */
    public O1.g0 f3355n;

    /* renamed from: o, reason: collision with root package name */
    public Q1.u f3356o;

    /* renamed from: p, reason: collision with root package name */
    public long f3357p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [O1.c] */
    public Q(AbstractC0225f[] abstractC0225fArr, long j7, Q1.t tVar, R1.f fVar, c0 c0Var, S s7, Q1.u uVar) {
        this.f3351j = abstractC0225fArr;
        this.f3357p = j7;
        this.f3352k = tVar;
        this.f3353l = c0Var;
        O1.B b4 = s7.a;
        this.f3343b = b4.a;
        this.f3348g = s7;
        this.f3355n = O1.g0.f7448d;
        this.f3356o = uVar;
        this.f3344c = new O1.a0[abstractC0225fArr.length];
        this.f3350i = new boolean[abstractC0225fArr.length];
        c0Var.getClass();
        int i7 = j0.f3508k;
        Pair pair = (Pair) b4.a;
        Object obj = pair.first;
        O1.B bA = b4.a(pair.second);
        b0 b0Var = (b0) c0Var.f3414d.get(obj);
        b0Var.getClass();
        c0Var.f3417g.add(b0Var);
        a0 a0Var = (a0) c0Var.f3416f.get(b0Var);
        if (a0Var != null) {
            a0Var.a.d(a0Var.f3402b);
        }
        b0Var.f3409c.add(bA);
        C0545t c0545tA = b0Var.a.a(bA, fVar, s7.f3358b);
        c0Var.f3413c.put(c0545tA, b0Var);
        c0Var.c();
        long j8 = s7.f3360d;
        this.a = j8 != -9223372036854775807L ? new C0529c(c0545tA, !s7.f3362f, 0L, j8) : c0545tA;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [O1.z, java.lang.Object] */
    public final long a(Q1.u uVar, long j7, boolean z7, boolean[] zArr) {
        AbstractC0225f[] abstractC0225fArr;
        O1.a0[] a0VarArr;
        int i7 = 0;
        while (true) {
            boolean z8 = true;
            if (i7 >= uVar.a) {
                break;
            }
            if (z7 || !uVar.a(this.f3356o, i7)) {
                z8 = false;
            }
            this.f3350i[i7] = z8;
            i7++;
        }
        int i8 = 0;
        while (true) {
            abstractC0225fArr = this.f3351j;
            int length = abstractC0225fArr.length;
            a0VarArr = this.f3344c;
            if (i8 >= length) {
                break;
            }
            if (abstractC0225fArr[i8].f3457l == -2) {
                a0VarArr[i8] = null;
            }
            i8++;
        }
        b();
        this.f3356o = uVar;
        c();
        long jD = this.a.d(uVar.f7941c, this.f3350i, this.f3344c, zArr, j7);
        for (int i9 = 0; i9 < abstractC0225fArr.length; i9++) {
            if (abstractC0225fArr[i9].f3457l == -2 && this.f3356o.b(i9)) {
                a0VarArr[i9] = new A.e(24);
            }
        }
        this.f3347f = false;
        for (int i10 = 0; i10 < a0VarArr.length; i10++) {
            if (a0VarArr[i10] != null) {
                AbstractC0015b.h(uVar.b(i10));
                if (abstractC0225fArr[i10].f3457l != -2) {
                    this.f3347f = true;
                }
            } else {
                AbstractC0015b.h(uVar.f7941c[i10] == null);
            }
        }
        return jD;
    }

    public final void b() {
        if (this.f3354m != null) {
            return;
        }
        int i7 = 0;
        while (true) {
            Q1.u uVar = this.f3356o;
            if (i7 >= uVar.a) {
                return;
            }
            boolean zB = uVar.b(i7);
            Q1.s sVar = this.f3356o.f7941c[i7];
            if (zB && sVar != null) {
                sVar.e();
            }
            i7++;
        }
    }

    public final void c() {
        if (this.f3354m != null) {
            return;
        }
        int i7 = 0;
        while (true) {
            Q1.u uVar = this.f3356o;
            if (i7 >= uVar.a) {
                return;
            }
            boolean zB = uVar.b(i7);
            Q1.s sVar = this.f3356o.f7941c[i7];
            if (zB && sVar != null) {
                sVar.c();
            }
            i7++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [O1.b0, java.lang.Object] */
    public final long d() {
        if (!this.f3346e) {
            return this.f3348g.f3358b;
        }
        long jN = this.f3347f ? this.a.n() : Long.MIN_VALUE;
        return jN == Long.MIN_VALUE ? this.f3348g.f3361e : jN;
    }

    public final long e() {
        return this.f3348g.f3358b + this.f3357p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O1.z, java.lang.Object] */
    public final void f(float f5, y1.P p7, boolean z7) {
        this.f3346e = true;
        this.f3355n = this.a.j();
        Q1.u uVarJ = j(f5, p7, z7);
        S s7 = this.f3348g;
        long j7 = s7.f3361e;
        long jMax = s7.f3358b;
        if (j7 != -9223372036854775807L && jMax >= j7) {
            jMax = Math.max(0L, j7 - 1);
        }
        long jA = a(uVarJ, jMax, false, new boolean[this.f3351j.length]);
        long j8 = this.f3357p;
        S s8 = this.f3348g;
        this.f3357p = (s8.f3358b - jA) + j8;
        this.f3348g = s8.b(jA);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [O1.b0, java.lang.Object] */
    public final boolean g() {
        if (this.f3346e) {
            return !this.f3347f || this.a.n() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.f3346e) {
            return g() || d() - this.f3348g.f3358b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [O1.z, java.lang.Object] */
    public final void i() {
        b();
        ?? r02 = this.a;
        try {
            boolean z7 = r02 instanceof C0529c;
            c0 c0Var = this.f3353l;
            if (z7) {
                c0Var.f(((C0529c) r02).f7413k);
            } else {
                c0Var.f(r02);
            }
        } catch (RuntimeException e7) {
            AbstractC0015b.n("MediaPeriodHolder", "Period release failed.", e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Q1.u j(float r30, y1.P r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 2300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.Q.j(float, y1.P, boolean):Q1.u");
    }

    public final void k() {
        Object obj = this.a;
        if (obj instanceof C0529c) {
            long j7 = this.f3348g.f3360d;
            if (j7 == -9223372036854775807L) {
                j7 = Long.MIN_VALUE;
            }
            C0529c c0529c = (C0529c) obj;
            c0529c.f7417o = 0L;
            c0529c.f7418p = j7;
        }
    }
}
