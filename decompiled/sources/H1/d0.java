package H1;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: u, reason: collision with root package name */
    public static final O1.B f3425u = new O1.B(new Object());
    public final y1.P a;

    /* renamed from: b, reason: collision with root package name */
    public final O1.B f3426b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3427c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3428d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3429e;

    /* renamed from: f, reason: collision with root package name */
    public final C0234o f3430f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3431g;

    /* renamed from: h, reason: collision with root package name */
    public final O1.g0 f3432h;

    /* renamed from: i, reason: collision with root package name */
    public final Q1.u f3433i;

    /* renamed from: j, reason: collision with root package name */
    public final List f3434j;

    /* renamed from: k, reason: collision with root package name */
    public final O1.B f3435k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3436l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3437m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3438n;

    /* renamed from: o, reason: collision with root package name */
    public final y1.G f3439o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3440p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f3441q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f3442r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f3443s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f3444t;

    public d0(y1.P p7, O1.B b4, long j7, long j8, int i7, C0234o c0234o, boolean z7, O1.g0 g0Var, Q1.u uVar, List list, O1.B b7, boolean z8, int i8, int i9, y1.G g4, long j9, long j10, long j11, long j12, boolean z9) {
        this.a = p7;
        this.f3426b = b4;
        this.f3427c = j7;
        this.f3428d = j8;
        this.f3429e = i7;
        this.f3430f = c0234o;
        this.f3431g = z7;
        this.f3432h = g0Var;
        this.f3433i = uVar;
        this.f3434j = list;
        this.f3435k = b7;
        this.f3436l = z8;
        this.f3437m = i8;
        this.f3438n = i9;
        this.f3439o = g4;
        this.f3441q = j9;
        this.f3442r = j10;
        this.f3443s = j11;
        this.f3444t = j12;
        this.f3440p = z9;
    }

    public static d0 j(Q1.u uVar) {
        y1.M m7 = y1.P.a;
        O1.B b4 = f3425u;
        return new d0(m7, b4, -9223372036854775807L, 0L, 1, null, false, O1.g0.f7448d, uVar, j3.X.f12304o, b4, false, 1, 0, y1.G.f17936d, 0L, 0L, 0L, 0L, false);
    }

    public final d0 a() {
        return new d0(this.a, this.f3426b, this.f3427c, this.f3428d, this.f3429e, this.f3430f, this.f3431g, this.f3432h, this.f3433i, this.f3434j, this.f3435k, this.f3436l, this.f3437m, this.f3438n, this.f3439o, this.f3441q, this.f3442r, k(), SystemClock.elapsedRealtime(), this.f3440p);
    }

    public final d0 b(boolean z7) {
        return new d0(this.a, this.f3426b, this.f3427c, this.f3428d, this.f3429e, this.f3430f, z7, this.f3432h, this.f3433i, this.f3434j, this.f3435k, this.f3436l, this.f3437m, this.f3438n, this.f3439o, this.f3441q, this.f3442r, this.f3443s, this.f3444t, this.f3440p);
    }

    public final d0 c(O1.B b4) {
        return new d0(this.a, this.f3426b, this.f3427c, this.f3428d, this.f3429e, this.f3430f, this.f3431g, this.f3432h, this.f3433i, this.f3434j, b4, this.f3436l, this.f3437m, this.f3438n, this.f3439o, this.f3441q, this.f3442r, this.f3443s, this.f3444t, this.f3440p);
    }

    public final d0 d(O1.B b4, long j7, long j8, long j9, long j10, O1.g0 g0Var, Q1.u uVar, List list) {
        return new d0(this.a, b4, j8, j9, this.f3429e, this.f3430f, this.f3431g, g0Var, uVar, list, this.f3435k, this.f3436l, this.f3437m, this.f3438n, this.f3439o, this.f3441q, j10, j7, SystemClock.elapsedRealtime(), this.f3440p);
    }

    public final d0 e(int i7, int i8, boolean z7) {
        return new d0(this.a, this.f3426b, this.f3427c, this.f3428d, this.f3429e, this.f3430f, this.f3431g, this.f3432h, this.f3433i, this.f3434j, this.f3435k, z7, i7, i8, this.f3439o, this.f3441q, this.f3442r, this.f3443s, this.f3444t, this.f3440p);
    }

    public final d0 f(C0234o c0234o) {
        return new d0(this.a, this.f3426b, this.f3427c, this.f3428d, this.f3429e, c0234o, this.f3431g, this.f3432h, this.f3433i, this.f3434j, this.f3435k, this.f3436l, this.f3437m, this.f3438n, this.f3439o, this.f3441q, this.f3442r, this.f3443s, this.f3444t, this.f3440p);
    }

    public final d0 g(y1.G g4) {
        return new d0(this.a, this.f3426b, this.f3427c, this.f3428d, this.f3429e, this.f3430f, this.f3431g, this.f3432h, this.f3433i, this.f3434j, this.f3435k, this.f3436l, this.f3437m, this.f3438n, g4, this.f3441q, this.f3442r, this.f3443s, this.f3444t, this.f3440p);
    }

    public final d0 h(int i7) {
        return new d0(this.a, this.f3426b, this.f3427c, this.f3428d, i7, this.f3430f, this.f3431g, this.f3432h, this.f3433i, this.f3434j, this.f3435k, this.f3436l, this.f3437m, this.f3438n, this.f3439o, this.f3441q, this.f3442r, this.f3443s, this.f3444t, this.f3440p);
    }

    public final d0 i(y1.P p7) {
        return new d0(p7, this.f3426b, this.f3427c, this.f3428d, this.f3429e, this.f3430f, this.f3431g, this.f3432h, this.f3433i, this.f3434j, this.f3435k, this.f3436l, this.f3437m, this.f3438n, this.f3439o, this.f3441q, this.f3442r, this.f3443s, this.f3444t, this.f3440p);
    }

    public final long k() {
        long j7;
        long j8;
        if (!l()) {
            return this.f3443s;
        }
        do {
            j7 = this.f3444t;
            j8 = this.f3443s;
        } while (j7 != this.f3444t);
        return B1.K.F(B1.K.P(j8) + ((long) ((SystemClock.elapsedRealtime() - j7) * this.f3439o.a)));
    }

    public final boolean l() {
        return this.f3429e == 3 && this.f3436l && this.f3438n == 0;
    }
}
