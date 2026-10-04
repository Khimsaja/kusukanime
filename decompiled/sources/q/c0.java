package q;

import b1.AbstractC0703b;
import h0.AbstractC0968M;
import h0.C0998u;

/* loaded from: classes.dex */
public final class c0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final v.Z f14542b;

    public c0() {
        long jD = AbstractC0968M.d(4284900966L);
        v.Z zA = androidx.compose.foundation.layout.a.a(0.0f, 3);
        this.a = jD;
        this.f14542b = zA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration", obj);
        c0 c0Var = (c0) obj;
        return C0998u.c(this.a, c0Var.a) && kotlin.jvm.internal.l.a(this.f14542b, c0Var.f14542b);
    }

    public final int hashCode() {
        int i7 = C0998u.f11835h;
        return this.f14542b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC0703b.x(this.a, ", drawPadding=", sb);
        sb.append(this.f14542b);
        sb.append(')');
        return sb.toString();
    }
}
