package O1;

import B1.AbstractC0015b;
import java.util.List;

/* renamed from: O1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539m implements b0 {

    /* renamed from: k, reason: collision with root package name */
    public final j3.X f7463k;

    /* renamed from: l, reason: collision with root package name */
    public long f7464l;

    public C0539m(List list, List list2) {
        j3.D dR = j3.G.r();
        AbstractC0015b.c(list.size() == list2.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            dR.a(new C0538l((b0) list.get(i7), (List) list2.get(i7)));
        }
        this.f7463k = dR.f();
        this.f7464l = -9223372036854775807L;
    }

    @Override // O1.b0
    public final boolean a() {
        int i7 = 0;
        while (true) {
            j3.X x7 = this.f7463k;
            if (i7 >= x7.f12306n) {
                return false;
            }
            if (((C0538l) x7.get(i7)).f7461k.a()) {
                return true;
            }
            i7++;
        }
    }

    @Override // O1.b0
    public final boolean e(H1.O o7) {
        boolean zE;
        boolean z7 = false;
        do {
            long jF = f();
            if (jF == Long.MIN_VALUE) {
                return z7;
            }
            int i7 = 0;
            zE = false;
            while (true) {
                j3.X x7 = this.f7463k;
                if (i7 >= x7.f12306n) {
                    break;
                }
                long jF2 = ((C0538l) x7.get(i7)).f7461k.f();
                boolean z8 = jF2 != Long.MIN_VALUE && jF2 <= o7.a;
                if (jF2 == jF || z8) {
                    zE |= ((C0538l) x7.get(i7)).f7461k.e(o7);
                }
                i7++;
            }
            z7 |= zE;
        } while (zE);
        return z7;
    }

    @Override // O1.b0
    public final long f() {
        int i7 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            j3.X x7 = this.f7463k;
            if (i7 >= x7.f12306n) {
                break;
            }
            long jF = ((C0538l) x7.get(i7)).f7461k.f();
            if (jF != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jF);
            }
            i7++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // O1.b0
    public final long n() {
        int i7 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            j3.X x7 = this.f7463k;
            if (i7 >= x7.f12306n) {
                break;
            }
            C0538l c0538l = (C0538l) x7.get(i7);
            long jN = c0538l.f7461k.n();
            j3.G g4 = c0538l.f7462l;
            if ((g4.contains(1) || g4.contains(2) || g4.contains(4)) && jN != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jN);
            }
            if (jN != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jN);
            }
            i7++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f7464l = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j7 = this.f7464l;
        return j7 != -9223372036854775807L ? j7 : jMin2;
    }

    @Override // O1.b0
    public final void t(long j7) {
        int i7 = 0;
        while (true) {
            j3.X x7 = this.f7463k;
            if (i7 >= x7.f12306n) {
                return;
            }
            ((C0538l) x7.get(i7)).t(j7);
            i7++;
        }
    }
}
