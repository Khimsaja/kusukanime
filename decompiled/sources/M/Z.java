package M;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class Z implements F {
    public final a0.h a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6278b;

    public Z(a0.h hVar, int i7) {
        this.a = hVar;
        this.f6278b = i7;
    }

    @Override // M.F
    public final int a(T0.i iVar, long j7, int i7) {
        int i8 = (int) (j7 & 4294967295L);
        int i9 = this.f6278b;
        if (i7 < i8 - (i9 * 2)) {
            return e3.c.k(this.a.a(i7, i8), i9, (i8 - i9) - i7);
        }
        return AbstractC0703b.a(1, 0.0f, (i8 - i7) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z7 = (Z) obj;
        return this.a.equals(z7.a) && this.f6278b == z7.f6278b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6278b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return AbstractC0703b.l(sb, this.f6278b, ')');
    }
}
