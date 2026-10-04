package P1;

import B1.AbstractC0015b;
import I1.e;
import j3.C1330p;
import j3.C1339z;
import j3.D;
import j3.E;
import j3.G;
import j3.V;
import j3.X;
import java.util.ArrayList;
import s2.C1973a;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: l, reason: collision with root package name */
    public static final C1339z f7716l = new C1339z(new C1330p(new e(10), V.f12301l), new C1330p(new e(11), V.f12302m));

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f7717k = new ArrayList();

    @Override // P1.a
    public final G a(long j7) {
        ArrayList arrayList = this.f7717k;
        if (!arrayList.isEmpty()) {
            if (j7 >= ((C1973a) arrayList.get(0)).f15508b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    C1973a c1973a = (C1973a) arrayList.get(i7);
                    if (j7 >= c1973a.f15508b && j7 < c1973a.f15510d) {
                        arrayList2.add(c1973a);
                    }
                    if (j7 < c1973a.f15508b) {
                        break;
                    }
                }
                X xY = G.y(f7716l, arrayList2);
                D dR = G.r();
                for (int i8 = 0; i8 < xY.f12306n; i8++) {
                    dR.c(((C1973a) xY.get(i8)).a);
                }
                return dR.f();
            }
        }
        E e7 = G.f12277l;
        return X.f12304o;
    }

    @Override // P1.a
    public final long b(long j7) {
        int i7 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f7717k;
            if (i7 >= arrayList.size()) {
                break;
            }
            long j8 = ((C1973a) arrayList.get(i7)).f15508b;
            long j9 = ((C1973a) arrayList.get(i7)).f15510d;
            if (j7 < j8) {
                jMin = jMin == -9223372036854775807L ? j8 : Math.min(jMin, j8);
            } else {
                if (j7 < j9) {
                    jMin = jMin == -9223372036854775807L ? j9 : Math.min(jMin, j9);
                }
                i7++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // P1.a
    public final boolean c(C1973a c1973a, long j7) {
        long j8 = c1973a.f15508b;
        AbstractC0015b.c(j8 != -9223372036854775807L);
        AbstractC0015b.c(c1973a.f15509c != -9223372036854775807L);
        boolean z7 = j8 <= j7 && j7 < c1973a.f15510d;
        ArrayList arrayList = this.f7717k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j8 >= ((C1973a) arrayList.get(size)).f15508b) {
                arrayList.add(size + 1, c1973a);
                return z7;
            }
        }
        arrayList.add(0, c1973a);
        return z7;
    }

    @Override // P1.a
    public final void clear() {
        this.f7717k.clear();
    }

    @Override // P1.a
    public final long d(long j7) {
        ArrayList arrayList = this.f7717k;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j7 < ((C1973a) arrayList.get(0)).f15508b) {
            return -9223372036854775807L;
        }
        long jMax = ((C1973a) arrayList.get(0)).f15508b;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long j8 = ((C1973a) arrayList.get(i7)).f15508b;
            long j9 = ((C1973a) arrayList.get(i7)).f15510d;
            if (j9 > j7) {
                if (j8 > j7) {
                    break;
                }
                jMax = Math.max(jMax, j8);
            } else {
                jMax = Math.max(jMax, j9);
            }
        }
        return jMax;
    }

    @Override // P1.a
    public final void e(long j7) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f7717k;
            if (i7 >= arrayList.size()) {
                return;
            }
            long j8 = ((C1973a) arrayList.get(i7)).f15508b;
            if (j7 > j8 && j7 > ((C1973a) arrayList.get(i7)).f15510d) {
                arrayList.remove(i7);
                i7--;
            } else if (j7 < j8) {
                return;
            }
            i7++;
        }
    }
}
