package B1;

import b1.AbstractC0703b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f357b;

    public r() {
        this(32);
    }

    public void a(long j7) {
        int i7 = this.a;
        long[] jArr = this.f357b;
        if (i7 == jArr.length) {
            this.f357b = Arrays.copyOf(jArr, i7 * 2);
        }
        long[] jArr2 = this.f357b;
        int i8 = this.a;
        this.a = i8 + 1;
        jArr2[i8] = j7;
    }

    public void b(long j7) {
        if (d(j7)) {
            return;
        }
        int i7 = this.a;
        long[] jArr = this.f357b;
        if (i7 >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i7 + 1, jArr.length * 2));
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", jArrCopyOf);
            this.f357b = jArrCopyOf;
        }
        this.f357b[i7] = j7;
        if (i7 >= this.a) {
            this.a = i7 + 1;
        }
    }

    public void c(long[] jArr) {
        int length = this.a + jArr.length;
        long[] jArr2 = this.f357b;
        if (length > jArr2.length) {
            this.f357b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f357b, this.a, jArr.length);
        this.a = length;
    }

    public boolean d(long j7) {
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f357b[i8] == j7) {
                return true;
            }
        }
        return false;
    }

    public long e(int i7) {
        if (i7 >= 0 && i7 < this.a) {
            return this.f357b[i7];
        }
        StringBuilder sbP = AbstractC0703b.p(i7, "Invalid index ", ", size is ");
        sbP.append(this.a);
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    public void f(int i7) {
        int i8 = this.a;
        if (i7 < i8) {
            int i9 = i8 - 1;
            while (i7 < i9) {
                long[] jArr = this.f357b;
                int i10 = i7 + 1;
                jArr[i7] = jArr[i10];
                i7 = i10;
            }
            this.a--;
        }
    }

    public r(int i7) {
        this.f357b = new long[i7];
    }
}
