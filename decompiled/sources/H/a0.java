package H;

import b1.AbstractC0703b;
import h0.C0998u;

/* loaded from: classes.dex */
public final class a0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2950b;

    public a0(long j7, long j8) {
        this.a = j7;
        this.f2950b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return C0998u.c(this.a, a0Var.a) && C0998u.c(this.f2950b, a0Var.f2950b);
    }

    public final int hashCode() {
        int i7 = C0998u.f11835h;
        return Long.hashCode(this.f2950b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC0703b.x(this.a, ", selectionBackgroundColor=", sb);
        sb.append((Object) C0998u.i(this.f2950b));
        sb.append(')');
        return sb.toString();
    }
}
