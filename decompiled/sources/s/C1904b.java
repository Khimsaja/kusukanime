package s;

import H5.InterfaceC0269j;
import java.util.concurrent.CancellationException;
import m.C1492m;
import s0.C1962g;
import y.C2327h;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1904b {
    public final Q.d a;

    public C1904b(int i7) {
        switch (i7) {
            case 1:
                this.a = new Q.d(new C1962g[16]);
                break;
            case 2:
                this.a = new Q.d(new C2327h[16]);
                break;
            default:
                this.a = new Q.d(new C1918i[16]);
                break;
        }
    }

    public boolean a(C1492m c1492m, w0.r rVar, H.N n7, boolean z7) {
        Q.d dVar = this.a;
        int i7 = dVar.f7829m;
        if (i7 <= 0) {
            return false;
        }
        Object[] objArr = dVar.f7827k;
        int i8 = 0;
        boolean z8 = false;
        do {
            z8 = ((C1962g) objArr[i8]).a(c1492m, rVar, n7, z7) || z8;
            i8++;
        } while (i8 < i7);
        return z8;
    }

    public void b(CancellationException cancellationException) {
        Q.d dVar = this.a;
        int i7 = dVar.f7829m;
        InterfaceC0269j[] interfaceC0269jArr = new InterfaceC0269j[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            interfaceC0269jArr[i8] = ((C1918i) dVar.f7827k[i8]).f15307b;
        }
        for (int i9 = 0; i9 < i7; i9++) {
            interfaceC0269jArr[i9].cancel(cancellationException);
        }
        if (!dVar.k()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public void c(H.N n7) {
        Q.d dVar = this.a;
        int i7 = dVar.f7829m;
        while (true) {
            i7--;
            if (-1 >= i7) {
                return;
            }
            if (((C1962g) dVar.f7827k[i7]).f15451c.a == 0) {
                dVar.n(i7);
            }
        }
    }

    public void d() {
        int i7 = 0;
        while (true) {
            Q.d dVar = this.a;
            if (i7 >= dVar.f7829m) {
                return;
            }
            C1962g c1962g = (C1962g) dVar.f7827k[i7];
            if (c1962g.f15450b.f10414w) {
                i7++;
                c1962g.d();
            } else {
                c1962g.f();
                dVar.n(i7);
            }
        }
    }

    public void e() {
        Q.d dVar = this.a;
        int i7 = 0;
        int i8 = new k4.g(0, dVar.f7829m - 1, 1).f12673l;
        if (i8 >= 0) {
            while (true) {
                ((C1918i) dVar.f7827k[i7]).f15307b.resumeWith(O3.C.a);
                if (i7 == i8) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        dVar.g();
    }
}
