package M;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class Y implements E {
    public final a0.e a;

    public Y(a0.e eVar) {
        this.a = eVar;
    }

    @Override // M.E
    public final int a(T0.i iVar, long j7, int i7, T0.k kVar) {
        int i8 = (int) (j7 >> 32);
        if (i7 < i8) {
            return e3.c.k(this.a.a(i7, i8, kVar), 0, i8 - i7);
        }
        return AbstractC0703b.a(1, kVar != T0.k.f8844k ? 0.0f * (-1) : 0.0f, (i8 - i7) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y) {
            return this.a.equals(((Y) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
