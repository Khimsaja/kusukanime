package z;

import s.EnumC1903a0;

/* loaded from: classes.dex */
public abstract class G {
    public static final float a = 56;

    /* renamed from: b, reason: collision with root package name */
    public static final v f18436b = new v(0, 0, 0, 0, 0, t.l.a, new D(), H5.D.c(S3.i.f8767k));

    /* renamed from: c, reason: collision with root package name */
    public static final E f18437c = new E();

    public static final long a(v vVar, int i7) {
        long j7 = (i7 * (vVar.f18521c + vVar.f18520b)) + (-vVar.f18524f) + vVar.f18522d;
        EnumC1903a0 enumC1903a0 = EnumC1903a0.f15260l;
        EnumC1903a0 enumC1903a02 = vVar.f18523e;
        long jA = vVar.a();
        int i8 = (int) (enumC1903a02 == enumC1903a0 ? jA >> 32 : jA & 4294967295L);
        vVar.f18531m.getClass();
        long jK = j7 - (i8 - e3.c.k(0, 0, i8));
        if (jK < 0) {
            return 0L;
        }
        return jK;
    }
}
