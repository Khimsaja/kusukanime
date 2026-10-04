package x6;

import java.io.IOException;
import kotlin.jvm.internal.l;
import w6.C2224i;
import w6.H;
import w6.q;

/* loaded from: classes.dex */
public final class d extends q {

    /* renamed from: l, reason: collision with root package name */
    public final long f17527l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f17528m;

    /* renamed from: n, reason: collision with root package name */
    public long f17529n;

    public d(H h7, long j7, boolean z7) {
        super(h7);
        this.f17527l = j7;
        this.f17528m = z7;
    }

    @Override // w6.q, w6.H
    public final long F(C2224i c2224i, long j7) throws IOException {
        l.f("sink", c2224i);
        long j8 = this.f17529n;
        long j9 = this.f17527l;
        if (j8 > j9) {
            j7 = 0;
        } else if (this.f17528m) {
            long j10 = j9 - j8;
            if (j10 == 0) {
                return -1L;
            }
            j7 = Math.min(j7, j10);
        }
        long jF = super.F(c2224i, j7);
        if (jF != -1) {
            this.f17529n += jF;
        }
        long j11 = this.f17529n;
        if ((j11 >= j9 || jF != -1) && j11 <= j9) {
            return jF;
        }
        if (jF > 0 && j11 > j9) {
            long j12 = c2224i.f17156l - (j11 - j9);
            C2224i c2224i2 = new C2224i();
            c2224i2.l(c2224i);
            c2224i.f(c2224i2, j12);
            c2224i2.b();
        }
        StringBuilder sbK = A6.b.k("expected ", j9, " bytes but got ");
        sbK.append(this.f17529n);
        throw new IOException(sbK.toString());
    }
}
