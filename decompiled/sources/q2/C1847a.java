package q2;

import B1.K;
import V1.A;
import V1.B;
import V1.z;
import java.math.BigInteger;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1847a implements A {
    public final /* synthetic */ C1848b a;

    public C1847a(C1848b c1848b) {
        this.a = c1848b;
    }

    @Override // V1.A
    public final boolean g() {
        return true;
    }

    @Override // V1.A
    public final z j(long j7) {
        C1848b c1848b = this.a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((c1848b.f14681n.f14715i * j7) / 1000000);
        long j8 = c1848b.f14680m;
        long j9 = c1848b.f14679l;
        B b4 = new B(j7, K.i((bigIntegerValueOf.multiply(BigInteger.valueOf(j8 - j9)).divide(BigInteger.valueOf(c1848b.f14683p)).longValue() + j9) - 30000, c1848b.f14679l, j8 - 1));
        return new z(b4, b4);
    }

    @Override // V1.A
    public final long l() {
        return (this.a.f14683p * 1000000) / r0.f14681n.f14715i;
    }
}
