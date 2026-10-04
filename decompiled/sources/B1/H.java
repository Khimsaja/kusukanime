package B1;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class H {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public long f297b;

    /* renamed from: c, reason: collision with root package name */
    public long f298c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f299d = new ThreadLocal();

    public H(long j7) {
        e(j7);
    }

    public final synchronized long a(long j7) {
        long j8;
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.f297b != -9223372036854775807L)) {
                    long jLongValue = this.a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l7 = (Long) this.f299d.get();
                        l7.getClass();
                        jLongValue = l7.longValue();
                    }
                    this.f297b = jLongValue - j7;
                    notifyAll();
                }
                this.f298c = j7;
                j8 = j7 + this.f297b;
            }
            return j8;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j8 = this.f298c;
            if (j8 != -9223372036854775807L) {
                int i7 = K.a;
                long jL = K.L(j8, 90000L, 1000000L, RoundingMode.DOWN);
                long j9 = (4294967296L + jL) / 8589934592L;
                long j10 = ((j9 - 1) * 8589934592L) + j7;
                long j11 = (j9 * 8589934592L) + j7;
                j7 = Math.abs(j10 - jL) < Math.abs(j11 - jL) ? j10 : j11;
            }
            long j12 = j7;
            int i8 = K.a;
            return a(K.L(j12, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j8 = this.f298c;
            if (j8 != -9223372036854775807L) {
                int i7 = K.a;
                long jL = K.L(j8, 90000L, 1000000L, RoundingMode.DOWN);
                long j9 = jL / 8589934592L;
                long j10 = (j9 * 8589934592L) + j7;
                j7 = j10 >= jL ? j10 : ((j9 + 1) * 8589934592L) + j7;
            }
            long j11 = j7;
            int i8 = K.a;
            return a(K.L(j11, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j7;
        j7 = this.a;
        if (j7 == Long.MAX_VALUE || j7 == 9223372036854775806L) {
            j7 = -9223372036854775807L;
        }
        return j7;
    }

    public final synchronized void e(long j7) {
        this.a = j7;
        this.f297b = j7 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f298c = -9223372036854775807L;
    }
}
