package L;

import O.C0510p;
import com.kusukanime.BuildConfig;
import h0.C0998u;
import io.ktor.util.GzipHeaderFlags;
import io.ktor.util.collections.ConcurrentMapKt;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public abstract class P {
    public static final O.S0 a = new O.S0(O.f5270m);

    /* renamed from: b, reason: collision with root package name */
    public static final O.S0 f5292b = new O.S0(O.f5271n);

    public static final long a(N n7, long j7) {
        if (C0998u.c(j7, n7.a)) {
            return n7.f5243b;
        }
        if (C0998u.c(j7, n7.f5247f)) {
            return n7.f5248g;
        }
        if (C0998u.c(j7, n7.f5251j)) {
            return n7.f5252k;
        }
        if (C0998u.c(j7, n7.f5255n)) {
            return n7.f5256o;
        }
        if (C0998u.c(j7, n7.f5264w)) {
            return n7.f5265x;
        }
        if (C0998u.c(j7, n7.f5244c)) {
            return n7.f5245d;
        }
        if (C0998u.c(j7, n7.f5249h)) {
            return n7.f5250i;
        }
        if (C0998u.c(j7, n7.f5253l)) {
            return n7.f5254m;
        }
        if (C0998u.c(j7, n7.f5266y)) {
            return n7.f5267z;
        }
        if (C0998u.c(j7, n7.f5262u)) {
            return n7.f5263v;
        }
        boolean zC = C0998u.c(j7, n7.f5257p);
        long j8 = n7.f5258q;
        if (zC) {
            return j8;
        }
        if (C0998u.c(j7, n7.f5259r)) {
            return n7.f5260s;
        }
        if (C0998u.c(j7, n7.f5227D) || C0998u.c(j7, n7.f5229F) || C0998u.c(j7, n7.f5230G) || C0998u.c(j7, n7.f5231H) || C0998u.c(j7, n7.I) || C0998u.c(j7, n7.J)) {
            return j8;
        }
        int i7 = C0998u.f11835h;
        return C0998u.f11834g;
    }

    public static final long b(long j7, C0510p c0510p) {
        c0510p.R(-1680936624);
        long jA = a((N) c0510p.k(a), j7);
        if (jA == 16) {
            jA = ((C0998u) c0510p.k(X.a)).a;
        }
        c0510p.p(false);
        return jA;
    }

    public static final long c(N n7, int i7) {
        switch (AbstractC1755i.b(i7)) {
            case 0:
                return n7.f5255n;
            case 1:
                return n7.f5264w;
            case 2:
                return n7.f5266y;
            case 3:
                return n7.f5263v;
            case GzipHeaderFlags.EXTRA /* 4 */:
                return n7.f5246e;
            case 5:
                return n7.f5262u;
            case 6:
                return n7.f5256o;
            case 7:
                return n7.f5265x;
            case 8:
                return n7.f5267z;
            case 9:
                return n7.f5243b;
            case 10:
                return n7.f5245d;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case ConcurrentMapKt.INITIAL_CAPACITY /* 32 */:
            case 33:
            default:
                return C0998u.f11834g;
            case 13:
                return n7.f5248g;
            case 14:
                return n7.f5250i;
            case 17:
                return n7.f5258q;
            case 18:
                return n7.f5260s;
            case 19:
                return n7.f5252k;
            case 20:
                return n7.f5254m;
            case 23:
                return n7.f5224A;
            case 24:
                return n7.f5225B;
            case 25:
                return n7.a;
            case 26:
                return n7.f5244c;
            case 29:
                return n7.f5226C;
            case BuildConfig.VERSION_CODE /* 30 */:
                return n7.f5247f;
            case 31:
                return n7.f5249h;
            case 34:
                return n7.f5257p;
            case 35:
                return n7.f5227D;
            case 36:
                return n7.f5229F;
            case 37:
                return n7.f5230G;
            case 38:
                return n7.f5231H;
            case 39:
                return n7.I;
            case 40:
                return n7.J;
            case 41:
                return n7.f5228E;
            case 42:
                return n7.f5261t;
            case 43:
                return n7.f5259r;
            case 44:
                return n7.f5251j;
            case 45:
                return n7.f5253l;
        }
    }

    public static final long d(int i7, C0510p c0510p) {
        return c((N) c0510p.k(a), i7);
    }

    public static N e(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, int i7, int i8) {
        long j39 = (i7 & 1) != 0 ? N.b.f6632t : j7;
        return new N(j39, (i7 & 2) != 0 ? N.b.f6622j : j8, (i7 & 4) != 0 ? N.b.f6633u : j9, (i7 & 8) != 0 ? N.b.f6623k : j10, N.b.f6617e, (i7 & 32) != 0 ? N.b.f6635w : j11, (i7 & 64) != 0 ? N.b.f6624l : j12, (i7 & 128) != 0 ? N.b.f6636x : j13, (i7 & 256) != 0 ? N.b.f6625m : j14, (i7 & 512) != 0 ? N.b.f6613H : j15, (i7 & 1024) != 0 ? N.b.f6628p : j16, (i7 & 2048) != 0 ? N.b.I : j17, (i7 & 4096) != 0 ? N.b.f6629q : j18, (i7 & 8192) != 0 ? N.b.a : j19, (i7 & 16384) != 0 ? N.b.f6619g : j20, (32768 & i7) != 0 ? N.b.f6637y : j21, (65536 & i7) != 0 ? N.b.f6626n : j22, (131072 & i7) != 0 ? N.b.f6612G : j23, (262144 & i7) != 0 ? N.b.f6627o : j24, (524288 & i7) != 0 ? j39 : j25, (1048576 & i7) != 0 ? N.b.f6618f : j26, (2097152 & i7) != 0 ? N.b.f6616d : j27, (4194304 & i7) != 0 ? N.b.f6614b : j28, (8388608 & i7) != 0 ? N.b.f6620h : j29, (16777216 & i7) != 0 ? N.b.f6615c : j30, (33554432 & i7) != 0 ? N.b.f6621i : j31, (67108864 & i7) != 0 ? N.b.f6630r : j32, (134217728 & i7) != 0 ? N.b.f6631s : j33, N.b.f6634v, N.b.f6638z, N.b.f6611F, (1073741824 & i7) != 0 ? N.b.f6606A : j34, (i7 & Integer.MIN_VALUE) != 0 ? N.b.f6607B : j35, (i8 & 1) != 0 ? N.b.f6608C : j36, (i8 & 2) != 0 ? N.b.f6609D : j37, (i8 & 4) != 0 ? N.b.f6610E : j38);
    }
}
