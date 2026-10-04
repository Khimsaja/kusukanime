package T1;

import B1.G;
import B1.K;
import B1.RunnableC0016c;
import android.os.SystemClock;
import java.util.NoSuchElementException;
import v.c0;
import y1.C2392n;
import y1.C2393o;
import y1.D;
import y1.b0;

/* loaded from: classes.dex */
public final class w {
    public final L2.e a;

    /* renamed from: b, reason: collision with root package name */
    public final s f8981b;

    /* renamed from: c, reason: collision with root package name */
    public final r f8982c = new r();

    /* renamed from: d, reason: collision with root package name */
    public final G f8983d = new G(0, (byte) 0);

    /* renamed from: e, reason: collision with root package name */
    public final G f8984e = new G(0, (byte) 0);

    /* renamed from: f, reason: collision with root package name */
    public final B1.s f8985f;

    /* renamed from: g, reason: collision with root package name */
    public long f8986g;

    /* renamed from: h, reason: collision with root package name */
    public b0 f8987h;

    /* renamed from: i, reason: collision with root package name */
    public long f8988i;

    public w(L2.e eVar, s sVar) {
        this.a = eVar;
        this.f8981b = sVar;
        B1.s sVar2 = new B1.s(0);
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        sVar2.f358b = 0;
        sVar2.f359c = 0;
        sVar2.f361e = new long[iHighestOneBit];
        sVar2.f360d = iHighestOneBit - 1;
        this.f8985f = sVar2;
        this.f8986g = -9223372036854775807L;
        this.f8987h = b0.f18027d;
    }

    public final void a(long j7, long j8) {
        int iA;
        do {
            B1.s sVar = this.f8985f;
            int i7 = sVar.f359c;
            if (i7 == 0) {
                return;
            }
            if (i7 == 0) {
                throw new NoSuchElementException();
            }
            long j9 = ((long[]) sVar.f361e)[sVar.f358b];
            Long l7 = (Long) this.f8984e.v(j9);
            s sVar2 = this.f8981b;
            if (l7 != null && l7.longValue() != this.f8988i) {
                this.f8988i = l7.longValue();
                sVar2.d(2);
            }
            iA = this.f8981b.a(j9, j7, j8, this.f8988i, false, false, this.f8982c);
            final L2.e eVar = this.a;
            c cVar = (c) eVar.f6046m;
            if (iA == 0 || iA == 1) {
                long jF = sVar.f();
                b0 b0Var = (b0) this.f8983d.v(jF);
                if (b0Var != null && !b0Var.equals(b0.f18027d) && !b0Var.equals(this.f8987h)) {
                    this.f8987h = b0Var;
                    C2392n c2392n = new C2392n();
                    c2392n.f18081t = b0Var.a;
                    c2392n.f18082u = b0Var.f18028b;
                    c2392n.f18074m = D.m("video/raw");
                    eVar.f6045l = new C2393o(c2392n);
                    cVar.f8858h.execute(new RunnableC0016c(16, eVar, b0Var));
                }
                boolean z7 = sVar2.f8949e != 3;
                sVar2.f8949e = 3;
                sVar2.f8956l.getClass();
                sVar2.f8951g = K.F(SystemClock.elapsedRealtime());
                if (z7) {
                    cVar.getClass();
                }
                C2393o c2393o = (C2393o) eVar.f6045l;
                C2393o c2393o2 = c2393o == null ? new C2393o(new C2392n()) : c2393o;
                q qVar = cVar.f8859i;
                cVar.f8852b.getClass();
                qVar.a(jF, System.nanoTime(), c2393o2, null);
                c0.e(cVar.f8854d.remove());
                throw null;
            }
            if (iA == 2 || iA == 3) {
                sVar.f();
                final int i8 = 1;
                cVar.f8858h.execute(new Runnable() { // from class: T1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i8) {
                            case 0:
                                ((c) eVar.f6046m).f8857g.getClass();
                                break;
                            default:
                                ((c) eVar.f6046m).f8857g.getClass();
                                break;
                        }
                    }
                });
                c0.e(cVar.f8854d.remove());
                throw null;
            }
        } while (iA == 4);
        if (iA != 5) {
            throw new IllegalStateException(String.valueOf(iA));
        }
    }
}
