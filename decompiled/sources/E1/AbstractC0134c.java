package E1;

import B1.AbstractC0015b;
import B1.K;
import android.os.SystemClock;
import j3.X;
import java.util.ArrayList;

/* renamed from: E1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0134c implements h {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1857k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1858l = new ArrayList(1);

    /* renamed from: m, reason: collision with root package name */
    public int f1859m;

    /* renamed from: n, reason: collision with root package name */
    public k f1860n;

    public AbstractC0134c(boolean z7) {
        this.f1857k = z7;
    }

    public final void b(int i7) {
        boolean z7;
        k kVar = this.f1860n;
        int i8 = K.a;
        for (int i9 = 0; i9 < this.f1859m; i9++) {
            D d4 = (D) this.f1858l.get(i9);
            boolean z8 = this.f1857k;
            R1.h hVar = (R1.h) d4;
            synchronized (hVar) {
                X x7 = R1.h.f8043p;
                if (z8) {
                    int i10 = kVar.f1889i;
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    hVar.f8057i += i7;
                }
            }
        }
    }

    @Override // E1.h
    public final void j(D d4) {
        d4.getClass();
        ArrayList arrayList = this.f1858l;
        if (arrayList.contains(d4)) {
            return;
        }
        arrayList.add(d4);
        this.f1859m++;
    }

    public final void k() {
        boolean z7;
        k kVar = this.f1860n;
        int i7 = K.a;
        for (int i8 = 0; i8 < this.f1859m; i8++) {
            D d4 = (D) this.f1858l.get(i8);
            boolean z8 = this.f1857k;
            R1.h hVar = (R1.h) d4;
            synchronized (hVar) {
                try {
                    X x7 = R1.h.f8043p;
                    if (z8) {
                        int i9 = kVar.f1889i;
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        AbstractC0015b.h(hVar.f8055g > 0);
                        hVar.f8052d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i10 = (int) (jElapsedRealtime - hVar.f8056h);
                        hVar.f8058j += i10;
                        long j7 = hVar.f8059k;
                        long j8 = hVar.f8057i;
                        hVar.f8059k = j7 + j8;
                        if (i10 > 0) {
                            hVar.f8054f.a((j8 * 8000.0f) / i10, (int) Math.sqrt(j8));
                            if (hVar.f8058j >= 2000 || hVar.f8059k >= 524288) {
                                hVar.f8060l = (long) hVar.f8054f.b();
                            }
                            hVar.b(i10, hVar.f8057i, hVar.f8060l);
                            hVar.f8056h = jElapsedRealtime;
                            hVar.f8057i = 0L;
                        }
                        hVar.f8055g--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f1860n = null;
    }

    public final void m() {
        for (int i7 = 0; i7 < this.f1859m; i7++) {
            ((D) this.f1858l.get(i7)).getClass();
        }
    }

    public final void q(k kVar) {
        boolean z7;
        this.f1860n = kVar;
        for (int i7 = 0; i7 < this.f1859m; i7++) {
            D d4 = (D) this.f1858l.get(i7);
            boolean z8 = this.f1857k;
            R1.h hVar = (R1.h) d4;
            synchronized (hVar) {
                try {
                    X x7 = R1.h.f8043p;
                    if (z8) {
                        int i8 = kVar.f1889i;
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        if (hVar.f8055g == 0) {
                            hVar.f8052d.getClass();
                            hVar.f8056h = SystemClock.elapsedRealtime();
                        }
                        hVar.f8055g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
