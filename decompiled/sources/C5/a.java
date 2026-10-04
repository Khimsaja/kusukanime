package C5;

import P3.F;
import java.io.Serializable;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class a implements Comparable, Serializable {

    /* renamed from: m, reason: collision with root package name */
    public static final a f968m = new a(0, 0);

    /* renamed from: k, reason: collision with root package name */
    public final long f969k;

    /* renamed from: l, reason: collision with root package name */
    public final long f970l;

    public a(long j7, long j8) {
        this.f969k = j7;
        this.f970l = j8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        l.f("other", aVar);
        long j7 = this.f969k;
        long j8 = aVar.f969k;
        return j7 != j8 ? Long.compare(j7 ^ Long.MIN_VALUE, j8 ^ Long.MIN_VALUE) : Long.compare(this.f970l ^ Long.MIN_VALUE, aVar.f970l ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f969k == aVar.f969k && this.f970l == aVar.f970l;
    }

    public final int hashCode() {
        return Long.hashCode(this.f969k ^ this.f970l);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        F.t(this.f969k, bArr, 0, 0, 4);
        bArr[8] = 45;
        F.t(this.f969k, bArr, 9, 4, 6);
        bArr[13] = 45;
        F.t(this.f969k, bArr, 14, 6, 8);
        bArr[18] = 45;
        F.t(this.f970l, bArr, 19, 0, 2);
        bArr[23] = 45;
        F.t(this.f970l, bArr, 24, 2, 8);
        return AbstractC2517v.I(bArr);
    }
}
