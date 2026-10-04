package J1;

import android.os.SystemClock;
import p.AbstractC1766r;
import p.D0;
import p.E0;

/* loaded from: classes.dex */
public final class x implements D0 {

    /* renamed from: k, reason: collision with root package name */
    public long f4285k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public long f4286l = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public Object f4287m;

    @Override // p.D0
    public boolean a() {
        return true;
    }

    @Override // p.D0
    public long b(AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        return Long.MAX_VALUE;
    }

    public long c(long j7) {
        long j8 = j7 + this.f4286l;
        if (j8 <= 0) {
            return 0L;
        }
        long j9 = this.f4285k;
        return j8 - ((j8 / j9) * j9);
    }

    @Override // p.D0
    public AbstractC1766r e(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        return ((E0) this.f4287m).e(c(j7), abstractC1766r, abstractC1766r2, f(j7, abstractC1766r, abstractC1766r3, abstractC1766r2));
    }

    public AbstractC1766r f(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        long j8 = this.f4286l;
        long j9 = j7 + j8;
        long j10 = this.f4285k;
        return j9 > j10 ? ((E0) this.f4287m).e(j10 - j8, abstractC1766r, abstractC1766r3, abstractC1766r2) : abstractC1766r2;
    }

    public void g(Exception exc) {
        boolean z7;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f4287m) == null) {
            this.f4287m = exc;
        }
        if (this.f4285k == -9223372036854775807L) {
            synchronized (A.f4079j0) {
                z7 = A.f4081l0 > 0;
            }
            if (!z7) {
                this.f4285k = 200 + jElapsedRealtime;
            }
        }
        long j7 = this.f4285k;
        if (j7 == -9223372036854775807L || jElapsedRealtime < j7) {
            this.f4286l = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f4287m;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f4287m;
        this.f4287m = null;
        this.f4285k = -9223372036854775807L;
        this.f4286l = -9223372036854775807L;
        throw exc3;
    }

    @Override // p.D0
    public AbstractC1766r i(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        return ((E0) this.f4287m).i(c(j7), abstractC1766r, abstractC1766r2, f(j7, abstractC1766r, abstractC1766r3, abstractC1766r2));
    }
}
