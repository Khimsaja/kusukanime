package O3;

import f6.AbstractC0915m;

/* loaded from: classes.dex */
public final class x implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final long f7548k;

    public /* synthetic */ x(long j7) {
        this.f7548k = j7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.l.h(this.f7548k ^ Long.MIN_VALUE, ((x) obj).f7548k ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f7548k == ((x) obj).f7548k;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7548k);
    }

    public final String toString() {
        long j7 = this.f7548k;
        if (j7 >= 0) {
            AbstractC0915m.k(10);
            String string = Long.toString(j7, 10);
            kotlin.jvm.internal.l.e("toString(...)", string);
            return string;
        }
        long j8 = 10;
        long j9 = ((j7 >>> 1) / j8) << 1;
        long j10 = j7 - (j9 * j8);
        if (j10 >= j8) {
            j10 -= j8;
            j9++;
        }
        AbstractC0915m.k(10);
        String string2 = Long.toString(j9, 10);
        kotlin.jvm.internal.l.e("toString(...)", string2);
        AbstractC0915m.k(10);
        String string3 = Long.toString(j10, 10);
        kotlin.jvm.internal.l.e("toString(...)", string3);
        return string2.concat(string3);
    }
}
