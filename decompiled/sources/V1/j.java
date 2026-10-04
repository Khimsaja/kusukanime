package V1;

import B1.K;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements A {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f9384b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f9385c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f9386d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f9387e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9388f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f9384b = iArr;
        this.f9385c = jArr;
        this.f9386d = jArr2;
        this.f9387e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f9388f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f9388f = 0L;
        }
    }

    @Override // V1.A
    public final boolean g() {
        return true;
    }

    @Override // V1.A
    public final z j(long j7) {
        long[] jArr = this.f9387e;
        int iD = K.d(jArr, j7, true);
        long j8 = jArr[iD];
        long[] jArr2 = this.f9385c;
        B b4 = new B(j8, jArr2[iD]);
        if (j8 >= j7 || iD == this.a - 1) {
            return new z(b4, b4);
        }
        int i7 = iD + 1;
        return new z(b4, new B(jArr[i7], jArr2[i7]));
    }

    @Override // V1.A
    public final long l() {
        return this.f9388f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.f9384b) + ", offsets=" + Arrays.toString(this.f9385c) + ", timeUs=" + Arrays.toString(this.f9387e) + ", durationsUs=" + Arrays.toString(this.f9386d) + ")";
    }
}
