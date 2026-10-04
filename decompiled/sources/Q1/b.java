package Q1;

import B1.AbstractC0015b;
import j3.D;
import java.util.ArrayList;
import java.util.Arrays;
import y1.C2393o;
import y1.Q;

/* loaded from: classes.dex */
public final class b implements s {
    public final Q a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7842b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f7843c;

    /* renamed from: d, reason: collision with root package name */
    public final C2393o[] f7844d;

    /* renamed from: e, reason: collision with root package name */
    public int f7845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7846f;

    public b(int i7, Q q6, int[] iArr) {
        C2393o[] c2393oArr;
        this.f7846f = i7;
        AbstractC0015b.h(iArr.length > 0);
        q6.getClass();
        this.a = q6;
        int length = iArr.length;
        this.f7842b = length;
        this.f7844d = new C2393o[length];
        int i8 = 0;
        while (true) {
            int length2 = iArr.length;
            c2393oArr = q6.f17971d;
            if (i8 >= length2) {
                break;
            }
            this.f7844d[i8] = c2393oArr[iArr[i8]];
            i8++;
        }
        Arrays.sort(this.f7844d, new B2.e(6));
        this.f7843c = new int[this.f7842b];
        int i9 = 0;
        while (true) {
            int i10 = this.f7842b;
            if (i9 >= i10) {
                long[] jArr = new long[i10];
                return;
            }
            int[] iArr2 = this.f7843c;
            C2393o c2393o = this.f7844d[i9];
            int i11 = 0;
            while (true) {
                if (i11 >= c2393oArr.length) {
                    i11 = -1;
                    break;
                } else if (c2393o == c2393oArr[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
            iArr2[i9] = i11;
            i9++;
        }
    }

    public static void m(ArrayList arrayList, long[] jArr) {
        long j7 = 0;
        for (long j8 : jArr) {
            j7 += j8;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            D d4 = (D) arrayList.get(i7);
            if (d4 != null) {
                d4.a(new a(j7, jArr[i7]));
            }
        }
    }

    @Override // Q1.s
    public final C2393o b(int i7) {
        return this.f7844d[i7];
    }

    @Override // Q1.s
    public void c() {
        int i7 = this.f7846f;
    }

    @Override // Q1.s
    public final int d(int i7) {
        return this.f7843c[i7];
    }

    @Override // Q1.s
    public void e() {
        int i7 = this.f7846f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && Arrays.equals(this.f7843c, bVar.f7843c)) {
                return true;
            }
        }
        return false;
    }

    @Override // Q1.s
    public final int f() {
        return this.f7843c[0];
    }

    @Override // Q1.s
    public final Q g() {
        return this.a;
    }

    @Override // Q1.s
    public final C2393o h() {
        return this.f7844d[0];
    }

    public final int hashCode() {
        if (this.f7845e == 0) {
            this.f7845e = Arrays.hashCode(this.f7843c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f7845e;
    }

    @Override // Q1.s
    public void i(float f5) {
        int i7 = this.f7846f;
    }

    @Override // Q1.s
    public final int l(int i7) {
        for (int i8 = 0; i8 < this.f7842b; i8++) {
            if (this.f7843c[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    @Override // Q1.s
    public final int length() {
        return this.f7843c.length;
    }

    private final void n() {
    }

    private final void p() {
    }

    public final void o() {
    }

    public final void q() {
    }

    private final void r(float f5) {
    }

    @Override // Q1.s
    public final void a(boolean z7) {
    }

    public final void s(float f5) {
    }
}
