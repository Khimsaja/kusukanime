package m;

import b1.AbstractC0703b;

/* renamed from: m.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1487h {
    public final long a;

    public static long a(int i7, int i8) {
        return (i8 & 4294967295L) | (i7 << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1487h) {
            return this.a == ((C1487h) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j7 = this.a;
        sb.append((int) (j7 >> 32));
        sb.append(", ");
        return AbstractC0703b.l(sb, (int) (j7 & 4294967295L), ')');
    }
}
