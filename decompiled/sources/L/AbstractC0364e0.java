package L;

import O.C0510p;
import h0.C0998u;

/* renamed from: L.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0364e0 {
    public static final float a = N.h.a;

    public static C0350a2 a(long j7, long j8, long j9, C0510p c0510p, int i7) {
        long j10 = C0998u.f11834g;
        long j11 = (i7 & 128) != 0 ? j10 : j8;
        long j12 = (i7 & 512) != 0 ? j10 : j9;
        C0350a2 c0350a2B = b((N) c0510p.k(P.a));
        long j13 = j7 != 16 ? j7 : c0350a2B.a;
        long j14 = j10 != 16 ? j10 : c0350a2B.f5446b;
        long j15 = j10 != 16 ? j10 : c0350a2B.f5447c;
        long j16 = j10 != 16 ? j10 : c0350a2B.f5448d;
        long j17 = j10 != 16 ? j10 : c0350a2B.f5449e;
        long j18 = j10 != 16 ? j10 : c0350a2B.f5450f;
        long j19 = j10 != 16 ? j10 : c0350a2B.f5451g;
        long j20 = j10 != 16 ? j10 : c0350a2B.f5452h;
        if (j11 == 16) {
            j11 = c0350a2B.f5453i;
        }
        long j21 = j11;
        long j22 = j10 != 16 ? j10 : c0350a2B.f5454j;
        if (j12 == 16) {
            j12 = c0350a2B.f5455k;
        }
        long j23 = j12;
        long j24 = j10 != 16 ? j10 : c0350a2B.f5456l;
        if (j10 == 16) {
            j10 = c0350a2B.f5457m;
        }
        return new C0350a2(j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j10);
    }

    public static C0350a2 b(N n7) {
        C0350a2 c0350a2 = n7.f5236O;
        if (c0350a2 != null) {
            return c0350a2;
        }
        long j7 = C0998u.f11833f;
        long jC = P.c(n7, N.h.f6679r);
        int i7 = N.h.f6682u;
        long jC2 = P.c(n7, i7);
        long jC3 = P.c(n7, i7);
        long jB = C0998u.b(0.38f, P.c(n7, 18));
        int i8 = N.h.f6680s;
        long jC4 = P.c(n7, i8);
        float f5 = N.h.f6673l;
        long jB2 = C0998u.b(f5, jC4);
        long jB3 = C0998u.b(f5, P.c(n7, i8));
        long jC5 = P.c(n7, N.h.f6676o);
        long jB4 = C0998u.b(N.h.f6665d, P.c(n7, N.h.f6674m));
        long jC6 = P.c(n7, N.h.f6678q);
        int i9 = N.h.f6681t;
        C0350a2 c0350a22 = new C0350a2(j7, jC, jC2, jC3, j7, jB, jB2, jB3, jC5, jB4, jC6, P.c(n7, i9), P.c(n7, i9));
        n7.f5236O = c0350a22;
        return c0350a22;
    }
}
