package V1;

import B1.AbstractC0015b;
import B1.K;

/* loaded from: classes.dex */
public final class x implements A {
    public final B1.r a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.r f9431b;

    /* renamed from: c, reason: collision with root package name */
    public long f9432c;

    public x(long j7, long[] jArr, long[] jArr2) {
        AbstractC0015b.c(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new B1.r(length);
            this.f9431b = new B1.r(length);
        } else {
            int i7 = length + 1;
            B1.r rVar = new B1.r(i7);
            this.a = rVar;
            B1.r rVar2 = new B1.r(i7);
            this.f9431b = rVar2;
            rVar.a(0L);
            rVar2.a(0L);
        }
        this.a.c(jArr);
        this.f9431b.c(jArr2);
        this.f9432c = j7;
    }

    @Override // V1.A
    public final boolean g() {
        return this.f9431b.a > 0;
    }

    @Override // V1.A
    public final z j(long j7) {
        B1.r rVar = this.f9431b;
        if (rVar.a == 0) {
            B b4 = B.f9311c;
            return new z(b4, b4);
        }
        int iB = K.b(rVar, j7);
        long jE = rVar.e(iB);
        B1.r rVar2 = this.a;
        B b7 = new B(jE, rVar2.e(iB));
        if (jE == j7 || iB == rVar.a - 1) {
            return new z(b7, b7);
        }
        int i7 = iB + 1;
        return new z(b7, new B(rVar.e(i7), rVar2.e(i7)));
    }

    @Override // V1.A
    public final long l() {
        return this.f9432c;
    }
}
