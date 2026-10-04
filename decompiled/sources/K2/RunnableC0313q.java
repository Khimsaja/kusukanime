package K2;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import f1.AbstractC0872e;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: K2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0313q implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public static final ThreadLocal f4657o = new ThreadLocal();

    /* renamed from: p, reason: collision with root package name */
    public static final G3.q f4658p = new G3.q(1);

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f4659k;

    /* renamed from: l, reason: collision with root package name */
    public long f4660l;

    /* renamed from: m, reason: collision with root package name */
    public long f4661m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f4662n;

    public static W c(RecyclerView recyclerView, int i7, long j7) {
        int iC = recyclerView.f10856p.C();
        for (int i8 = 0; i8 < iC; i8++) {
            W wF = RecyclerView.F(recyclerView.f10856p.B(i8));
            if (wF.f4521c == i7 && !wF.e()) {
                return null;
            }
        }
        N n7 = recyclerView.f10850m;
        try {
            recyclerView.L();
            W wK = n7.k(i7, j7);
            if (wK != null) {
                if (!wK.d() || wK.e()) {
                    n7.a(wK, false);
                } else {
                    n7.h(wK.a);
                }
            }
            recyclerView.M(false);
            return wK;
        } catch (Throwable th) {
            recyclerView.M(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i7, int i8) {
        if (recyclerView.f10811B && this.f4660l == 0) {
            this.f4660l = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0311o c0311o = recyclerView.f10851m0;
        c0311o.f4650b = i7;
        c0311o.f4651c = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r17) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.RunnableC0313q.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i7 = AbstractC0872e.a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f4659k;
            if (arrayList.isEmpty()) {
                this.f4660l = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i8 = 0; i8 < size; i8++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i8);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f4660l = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f4661m);
                this.f4660l = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f4660l = 0L;
            int i9 = AbstractC0872e.a;
            Trace.endSection();
            throw th;
        }
    }
}
