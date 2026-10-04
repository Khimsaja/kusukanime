package C;

import g0.f;

/* loaded from: classes.dex */
public final class c implements a {
    public final float a;

    public c(float f5) {
        this.a = f5;
        if (f5 < 0.0f || f5 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // C.a
    public final float a(long j7, T0.b bVar) {
        return (this.a / 100.0f) * f.c(j7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.a, ((c) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
