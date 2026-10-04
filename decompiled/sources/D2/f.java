package D2;

import B1.K;
import V1.A;
import V1.B;
import V1.z;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class f implements A {
    public final e a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1420b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1421c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1422d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1423e;

    public f(e eVar, int i7, long j7, long j8) {
        this.a = eVar;
        this.f1420b = i7;
        this.f1421c = j7;
        long j9 = (j8 - j7) / eVar.f1417n;
        this.f1422d = j9;
        this.f1423e = a(j9);
    }

    public final long a(long j7) {
        long j8 = j7 * this.f1420b;
        long j9 = this.a.f1416m;
        int i7 = K.a;
        return K.L(j8, 1000000L, j9, RoundingMode.DOWN);
    }

    @Override // V1.A
    public final boolean g() {
        return true;
    }

    @Override // V1.A
    public final z j(long j7) {
        e eVar = this.a;
        long j8 = this.f1422d;
        long jI = K.i((eVar.f1416m * j7) / (this.f1420b * 1000000), 0L, j8 - 1);
        long j9 = this.f1421c;
        long jA = a(jI);
        B b4 = new B(jA, (eVar.f1417n * jI) + j9);
        if (jA >= j7 || jI == j8 - 1) {
            return new z(b4, b4);
        }
        long j10 = jI + 1;
        return new z(b4, new B(a(j10), (eVar.f1417n * j10) + j9));
    }

    @Override // V1.A
    public final long l() {
        return this.f1423e;
    }
}
