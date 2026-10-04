package y1;

import f6.AbstractC0905c;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class C {
    public final B[] a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17930b;

    public C(B... bArr) {
        this(-9223372036854775807L, bArr);
    }

    public final C a(B... bArr) {
        if (bArr.length == 0) {
            return this;
        }
        int i7 = B1.K.a;
        B[] bArr2 = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(bArr2, bArr2.length + bArr.length);
        System.arraycopy(bArr, 0, objArrCopyOf, bArr2.length, bArr.length);
        return new C(this.f17930b, (B[]) objArrCopyOf);
    }

    public final C b(C c2) {
        return c2 == null ? this : a(c2.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C.class == obj.getClass()) {
            C c2 = (C) obj;
            if (Arrays.equals(this.a, c2.a) && this.f17930b == c2.f17930b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0905c.u(this.f17930b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j7 = this.f17930b;
        if (j7 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j7;
        }
        sb.append(str);
        return sb.toString();
    }

    public C(long j7, B... bArr) {
        this.f17930b = j7;
        this.a = bArr;
    }

    public C(List list) {
        this((B[]) list.toArray(new B[0]));
    }
}
