package s0;

import io.ktor.client.utils.CIOKt;

/* renamed from: s0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1971p {
    public static final C1956a a = new C1956a(CIOKt.DEFAULT_HTTP_POOL_SIZE);

    /* renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f15468b;

    static {
        new C1956a(1007);
        new C1956a(1008);
        new C1956a(1002);
        f15468b = new StackTraceElement[0];
    }

    public static final boolean a(r rVar) {
        return !rVar.f15475h && rVar.f15471d;
    }

    public static final boolean b(r rVar) {
        return (rVar.b() || !rVar.f15475h || rVar.f15471d) ? false : true;
    }

    public static final boolean c(r rVar) {
        return rVar.f15475h && !rVar.f15471d;
    }

    public static final boolean d(r rVar, long j7) {
        long j8 = rVar.f15470c;
        float fD = g0.c.d(j8);
        float fE = g0.c.e(j8);
        return fD < 0.0f || fD > ((float) ((int) (j7 >> 32))) || fE < 0.0f || fE > ((float) ((int) (j7 & 4294967295L)));
    }

    public static final boolean e(r rVar, long j7, long j8) {
        if (rVar.f15476i != 1) {
            return d(rVar, j7);
        }
        long j9 = rVar.f15470c;
        float fD = g0.c.d(j9);
        float fE = g0.c.e(j9);
        return fD < (-g0.f.d(j8)) || fD > g0.f.d(j8) + ((float) ((int) (j7 >> 32))) || fE < (-g0.f.b(j8)) || fE > g0.f.b(j8) + ((float) ((int) (j7 & 4294967295L)));
    }

    public static final long f(r rVar, boolean z7) {
        long jG = g0.c.g(rVar.f15470c, rVar.f15474g);
        if (z7 || !rVar.b()) {
            return jG;
        }
        return 0L;
    }
}
