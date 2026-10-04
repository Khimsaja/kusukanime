package V1;

import B1.AbstractC0015b;
import B1.K;

/* loaded from: classes.dex */
public class s implements A {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9404b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9405c;

    public /* synthetic */ s(int i7, long j7, Object obj) {
        this.a = i7;
        this.f9405c = obj;
        this.f9404b = j7;
    }

    @Override // V1.A
    public final boolean g() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // V1.A
    public final z j(long j7) {
        switch (this.a) {
            case 0:
                t tVar = (t) this.f9405c;
                AbstractC0015b.i(tVar.f9415k);
                L2.e eVar = tVar.f9415k;
                long[] jArr = (long[]) eVar.f6045l;
                int iD = K.d(jArr, K.i((tVar.f9409e * j7) / 1000000, 0L, tVar.f9414j - 1), false);
                long j8 = iD == -1 ? 0L : jArr[iD];
                long[] jArr2 = (long[]) eVar.f6046m;
                long j9 = iD != -1 ? jArr2[iD] : 0L;
                int i7 = tVar.f9409e;
                long j10 = (j8 * 1000000) / i7;
                long j11 = this.f9404b;
                B b4 = new B(j10, j9 + j11);
                if (j10 == j7 || iD == jArr.length - 1) {
                    return new z(b4, b4);
                }
                int i8 = iD + 1;
                return new z(b4, new B((jArr[i8] * 1000000) / i7, j11 + jArr2[i8]));
            case 1:
                return (z) this.f9405c;
            default:
                X1.b bVar = (X1.b) this.f9405c;
                z zVarB = bVar.f9774i[0].b(j7);
                int i9 = 1;
                while (true) {
                    X1.e[] eVarArr = bVar.f9774i;
                    if (i9 >= eVarArr.length) {
                        return zVarB;
                    }
                    z zVarB2 = eVarArr[i9].b(j7);
                    if (zVarB2.a.f9312b < zVarB.a.f9312b) {
                        zVarB = zVarB2;
                    }
                    i9++;
                }
        }
    }

    @Override // V1.A
    public final long l() {
        switch (this.a) {
        }
        return this.f9404b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(long j7) {
        this(j7, 0L);
        this.a = 1;
    }

    public s(long j7, long j8) {
        this.a = 1;
        this.f9404b = j7;
        B b4 = j8 == 0 ? B.f9311c : new B(0L, j8);
        this.f9405c = new z(b4, b4);
    }
}
