package w0;

/* renamed from: w0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2182Q {
    public boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AbstractC2182Q abstractC2182Q, S s7) {
        abstractC2182Q.getClass();
        if (s7 instanceof y0.T) {
            ((y0.T) s7).M(abstractC2182Q.a);
        }
    }

    public static void d(AbstractC2182Q abstractC2182Q, S s7, int i7, int i8) {
        abstractC2182Q.getClass();
        long jB = P3.F.b(i7, i8);
        a(abstractC2182Q, s7);
        s7.j0(T0.h.c(jB, s7.f16844o), 0.0f, null);
    }

    public static void e(AbstractC2182Q abstractC2182Q, S s7, long j7) {
        abstractC2182Q.getClass();
        a(abstractC2182Q, s7);
        s7.j0(T0.h.c(j7, s7.f16844o), 0.0f, null);
    }

    public static void f(AbstractC2182Q abstractC2182Q, S s7, int i7, int i8) {
        long jB = P3.F.b(i7, i8);
        if (abstractC2182Q.b() == T0.k.f8844k || abstractC2182Q.c() == 0) {
            a(abstractC2182Q, s7);
            s7.j0(T0.h.c(jB, s7.f16844o), 0.0f, null);
        } else {
            long jB2 = P3.F.b((abstractC2182Q.c() - s7.f16840k) - ((int) (jB >> 32)), (int) (jB & 4294967295L));
            a(abstractC2182Q, s7);
            s7.j0(T0.h.c(jB2, s7.f16844o), 0.0f, null);
        }
    }

    public static void g(AbstractC2182Q abstractC2182Q, S s7, int i7, int i8) {
        int i9 = U.f16848b;
        T t7 = T.f16845m;
        long jB = P3.F.b(i7, i8);
        if (abstractC2182Q.b() == T0.k.f8844k || abstractC2182Q.c() == 0) {
            a(abstractC2182Q, s7);
            s7.j0(T0.h.c(jB, s7.f16844o), 0.0f, t7);
        } else {
            long jB2 = P3.F.b((abstractC2182Q.c() - s7.f16840k) - ((int) (jB >> 32)), (int) (jB & 4294967295L));
            a(abstractC2182Q, s7);
            s7.j0(T0.h.c(jB2, s7.f16844o), 0.0f, t7);
        }
    }

    public static void h(AbstractC2182Q abstractC2182Q, S s7, long j7) {
        int i7 = U.f16848b;
        T t7 = T.f16845m;
        if (abstractC2182Q.b() == T0.k.f8844k || abstractC2182Q.c() == 0) {
            a(abstractC2182Q, s7);
            s7.j0(T0.h.c(j7, s7.f16844o), 0.0f, t7);
        } else {
            long jB = P3.F.b((abstractC2182Q.c() - s7.f16840k) - ((int) (j7 >> 32)), (int) (j7 & 4294967295L));
            a(abstractC2182Q, s7);
            s7.j0(T0.h.c(jB, s7.f16844o), 0.0f, t7);
        }
    }

    public static void i(AbstractC2182Q abstractC2182Q, S s7, e4.k kVar) {
        abstractC2182Q.getClass();
        long jB = P3.F.b(0, 0);
        a(abstractC2182Q, s7);
        s7.j0(T0.h.c(jB, s7.f16844o), 0.0f, kVar);
    }

    public static void j(AbstractC2182Q abstractC2182Q, S s7, long j7) {
        int i7 = U.f16848b;
        T t7 = T.f16845m;
        abstractC2182Q.getClass();
        a(abstractC2182Q, s7);
        s7.j0(T0.h.c(j7, s7.f16844o), 0.0f, t7);
    }

    public abstract T0.k b();

    public abstract int c();
}
