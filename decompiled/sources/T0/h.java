package T0;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class h {
    public final long a;

    public /* synthetic */ h(long j7) {
        this.a = j7;
    }

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public static final long b(long j7, long j8) {
        return ((((int) (j7 >> 32)) - ((int) (j8 >> 32))) << 32) | ((((int) (j7 & 4294967295L)) - ((int) (j8 & 4294967295L))) & 4294967295L);
    }

    public static final long c(long j7, long j8) {
        return ((((int) (j7 >> 32)) + ((int) (j8 >> 32))) << 32) | ((((int) (j7 & 4294967295L)) + ((int) (j8 & 4294967295L))) & 4294967295L);
    }

    public static String d(long j7) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j7 >> 32));
        sb.append(", ");
        return AbstractC0703b.l(sb, (int) (j7 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.a == ((h) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
