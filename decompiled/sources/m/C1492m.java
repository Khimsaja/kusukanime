package m;

import java.util.Arrays;
import n.AbstractC1529a;

/* renamed from: m.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1492m implements Cloneable {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f12894k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ long[] f12895l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object[] f12896m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ int f12897n;

    public C1492m(int i7) {
        if (i7 == 0) {
            this.f12895l = AbstractC1529a.f13114b;
            this.f12896m = AbstractC1529a.f13115c;
            return;
        }
        int i8 = i7 * 8;
        int i9 = 4;
        while (true) {
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (i8 <= i10) {
                i8 = i10;
                break;
            }
            i9++;
        }
        int i11 = i8 / 8;
        this.f12895l = new long[i11];
        this.f12896m = new Object[i11];
    }

    public final void a() {
        int i7 = this.f12897n;
        Object[] objArr = this.f12896m;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f12897n = 0;
        this.f12894k = false;
    }

    public final Object b(long j7) {
        Object obj;
        int iB = AbstractC1529a.b(this.f12895l, this.f12897n, j7);
        if (iB < 0 || (obj = this.f12896m[iB]) == AbstractC1493n.a) {
            return null;
        }
        return obj;
    }

    public final long c(int i7) {
        if (!(i7 >= 0 && i7 < this.f12897n)) {
            AbstractC1529a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        if (this.f12894k) {
            int i8 = this.f12897n;
            long[] jArr = this.f12895l;
            Object[] objArr = this.f12896m;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != AbstractC1493n.a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f12894k = false;
            this.f12897n = i9;
        }
        return this.f12895l[i7];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>", objClone);
        C1492m c1492m = (C1492m) objClone;
        c1492m.f12895l = (long[]) this.f12895l.clone();
        c1492m.f12896m = (Object[]) this.f12896m.clone();
        return c1492m;
    }

    public final void d(long j7, Object obj) {
        int iB = AbstractC1529a.b(this.f12895l, this.f12897n, j7);
        if (iB >= 0) {
            this.f12896m[iB] = obj;
            return;
        }
        int i7 = ~iB;
        int i8 = this.f12897n;
        Object obj2 = AbstractC1493n.a;
        if (i7 < i8) {
            Object[] objArr = this.f12896m;
            if (objArr[i7] == obj2) {
                this.f12895l[i7] = j7;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f12894k) {
            long[] jArr = this.f12895l;
            if (i8 >= jArr.length) {
                Object[] objArr2 = this.f12896m;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj3 = objArr2[i10];
                    if (obj3 != obj2) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr2[i9] = obj3;
                            objArr2[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f12894k = false;
                this.f12897n = i9;
                i7 = ~AbstractC1529a.b(this.f12895l, i9, j7);
            }
        }
        int i11 = this.f12897n;
        if (i11 >= this.f12895l.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f12895l, i15);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", jArrCopyOf);
            this.f12895l = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12896m, i15);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf);
            this.f12896m = objArrCopyOf;
        }
        int i16 = this.f12897n - i7;
        if (i16 != 0) {
            long[] jArr2 = this.f12895l;
            int i17 = i7 + 1;
            kotlin.jvm.internal.l.f("<this>", jArr2);
            System.arraycopy(jArr2, i7, jArr2, i17, i16);
            Object[] objArr3 = this.f12896m;
            P3.m.W(i17, i7, this.f12897n, objArr3, objArr3);
        }
        this.f12895l[i7] = j7;
        this.f12896m[i7] = obj;
        this.f12897n++;
    }

    public final void e(long j7) {
        int iB = AbstractC1529a.b(this.f12895l, this.f12897n, j7);
        if (iB >= 0) {
            Object[] objArr = this.f12896m;
            Object obj = objArr[iB];
            Object obj2 = AbstractC1493n.a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f12894k = true;
            }
        }
    }

    public final int f() {
        if (this.f12894k) {
            int i7 = this.f12897n;
            long[] jArr = this.f12895l;
            Object[] objArr = this.f12896m;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != AbstractC1493n.a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f12894k = false;
            this.f12897n = i8;
        }
        return this.f12897n;
    }

    public final Object g(int i7) {
        if (!(i7 >= 0 && i7 < this.f12897n)) {
            AbstractC1529a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        if (this.f12894k) {
            int i8 = this.f12897n;
            long[] jArr = this.f12895l;
            Object[] objArr = this.f12896m;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != AbstractC1493n.a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f12894k = false;
            this.f12897n = i9;
        }
        return this.f12896m[i7];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12897n * 28);
        sb.append('{');
        int i7 = this.f12897n;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(c(i8));
            sb.append('=');
            Object objG = g(i8);
            if (objG != sb) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.l.e("StringBuilder(capacity).…builderAction).toString()", string);
        return string;
    }

    public /* synthetic */ C1492m(Object obj) {
        this(10);
    }
}
