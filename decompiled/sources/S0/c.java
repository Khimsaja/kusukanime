package S0;

import h0.AbstractC0993p;
import h0.C0998u;

/* loaded from: classes.dex */
public final class c implements m {
    public final long a;

    public c(long j7) {
        this.a = j7;
        if (j7 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // S0.m
    public final float a() {
        return C0998u.d(this.a);
    }

    @Override // S0.m
    public final long b() {
        return this.a;
    }

    @Override // S0.m
    public final AbstractC0993p c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && C0998u.c(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        int i7 = C0998u.f11835h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C0998u.i(this.a)) + ')';
    }
}
