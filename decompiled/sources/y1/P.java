package y1;

import B1.AbstractC0015b;
import android.util.Pair;

/* loaded from: classes.dex */
public abstract class P {
    public static final M a = new M();

    static {
        B1.K.B(0);
        B1.K.B(1);
        B1.K.B(2);
    }

    public int a(boolean z7) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z7) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i7, N n7, O o7, int i8, boolean z7) {
        int i9 = f(i7, n7, false).f17948c;
        if (m(i9, o7, 0L).f17967n != i7) {
            return i7 + 1;
        }
        int iE = e(i9, i8, z7);
        if (iE == -1) {
            return -1;
        }
        return m(iE, o7, 0L).f17966m;
    }

    public int e(int i7, int i8, boolean z7) {
        if (i8 == 0) {
            if (i7 == c(z7)) {
                return -1;
            }
            return i7 + 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == c(z7) ? a(z7) : i7 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof P) {
                P p7 = (P) obj;
                if (p7.o() == o() && p7.h() == h()) {
                    O o7 = new O();
                    N n7 = new N();
                    O o8 = new O();
                    N n8 = new N();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= o()) {
                            int i8 = 0;
                            while (true) {
                                if (i8 >= h()) {
                                    int iA = a(true);
                                    if (iA == p7.a(true) && (iC = c(true)) == p7.c(true)) {
                                        while (iA != iC) {
                                            int iE = e(iA, 0, true);
                                            if (iE == p7.e(iA, 0, true)) {
                                                iA = iE;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i8, n7, true).equals(p7.f(i8, n8, true))) {
                                        break;
                                    }
                                    i8++;
                                }
                            }
                        } else {
                            if (!m(i7, o7, 0L).equals(p7.m(i7, o8, 0L))) {
                                break;
                            }
                            i7++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract N f(int i7, N n7, boolean z7);

    public N g(Object obj, N n7) {
        return f(b(obj), n7, true);
    }

    public abstract int h();

    public int hashCode() {
        O o7 = new O();
        N n7 = new N();
        int iO = o() + 217;
        for (int i7 = 0; i7 < o(); i7++) {
            iO = (iO * 31) + m(i7, o7, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i8 = 0; i8 < h(); i8++) {
            iH = (iH * 31) + f(i8, n7, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(O o7, N n7, int i7, long j7) {
        Pair pairJ = j(o7, n7, i7, j7, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(O o7, N n7, int i7, long j7, long j8) {
        AbstractC0015b.f(i7, o());
        m(i7, o7, j8);
        if (j7 == -9223372036854775807L) {
            j7 = o7.f17964k;
            if (j7 == -9223372036854775807L) {
                return null;
            }
        }
        int i8 = o7.f17966m;
        f(i8, n7, false);
        while (i8 < o7.f17967n && n7.f17950e != j7) {
            int i9 = i8 + 1;
            if (f(i9, n7, false).f17950e > j7) {
                break;
            }
            i8 = i9;
        }
        f(i8, n7, true);
        long jMin = j7 - n7.f17950e;
        long j9 = n7.f17949d;
        if (j9 != -9223372036854775807L) {
            jMin = Math.min(jMin, j9 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = n7.f17947b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i7, int i8, boolean z7) {
        if (i8 == 0) {
            if (i7 == a(z7)) {
                return -1;
            }
            return i7 - 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == a(z7) ? c(z7) : i7 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i7);

    public abstract O m(int i7, O o7, long j7);

    public final void n(int i7, O o7) {
        m(i7, o7, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
