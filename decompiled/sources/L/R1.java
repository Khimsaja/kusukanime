package L;

import h0.C0998u;

/* loaded from: classes.dex */
public final class R1 {
    public final long a = C0998u.f11834g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof R1) {
            return C0998u.c(this.a, ((R1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0998u.f11835h;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C0998u.i(this.a)) + ", rippleAlpha=null)";
    }
}
