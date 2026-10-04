package H1;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class n0 implements P {

    /* renamed from: k, reason: collision with root package name */
    public final B1.D f3543k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3544l;

    /* renamed from: m, reason: collision with root package name */
    public long f3545m;

    /* renamed from: n, reason: collision with root package name */
    public long f3546n;

    /* renamed from: o, reason: collision with root package name */
    public y1.G f3547o = y1.G.f17936d;

    public n0(B1.D d4) {
        this.f3543k = d4;
    }

    @Override // H1.P
    public final void a(y1.G g4) {
        if (this.f3544l) {
            c(e());
        }
        this.f3547o = g4;
    }

    public final void c(long j7) {
        this.f3545m = j7;
        if (this.f3544l) {
            this.f3543k.getClass();
            this.f3546n = SystemClock.elapsedRealtime();
        }
    }

    @Override // H1.P
    public final y1.G d() {
        return this.f3547o;
    }

    @Override // H1.P
    public final long e() {
        long j7 = this.f3545m;
        if (!this.f3544l) {
            return j7;
        }
        this.f3543k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f3546n;
        return this.f3547o.a == 1.0f ? B1.K.F(jElapsedRealtime) + j7 : (jElapsedRealtime * r4.f17938c) + j7;
    }

    public final void f() {
        if (this.f3544l) {
            return;
        }
        this.f3543k.getClass();
        this.f3546n = SystemClock.elapsedRealtime();
        this.f3544l = true;
    }
}
