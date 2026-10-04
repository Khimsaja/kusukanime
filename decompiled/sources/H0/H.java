package H0;

import b1.AbstractC0703b;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: b, reason: collision with root package name */
    public static final long f3091b = AbstractC1420H.c(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f3092c = 0;
    public final long a;

    public /* synthetic */ H(long j7) {
        this.a = j7;
    }

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public static final boolean b(long j7) {
        return ((int) (j7 >> 32)) == ((int) (j7 & 4294967295L));
    }

    public static final int c(long j7) {
        return d(j7) - e(j7);
    }

    public static final int d(long j7) {
        int i7 = (int) (j7 >> 32);
        int i8 = (int) (j7 & 4294967295L);
        return i7 > i8 ? i7 : i8;
    }

    public static final int e(long j7) {
        int i7 = (int) (j7 >> 32);
        int i8 = (int) (j7 & 4294967295L);
        return i7 > i8 ? i8 : i7;
    }

    public static final boolean f(long j7) {
        return ((int) (j7 >> 32)) > ((int) (j7 & 4294967295L));
    }

    public static String g(long j7) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j7 >> 32));
        sb.append(", ");
        return AbstractC0703b.l(sb, (int) (j7 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof H) {
            return this.a == ((H) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return g(this.a);
    }
}
