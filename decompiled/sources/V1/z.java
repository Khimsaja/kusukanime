package V1;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class z {
    public final B a;

    /* renamed from: b, reason: collision with root package name */
    public final B f9439b;

    public z(B b4, B b7) {
        this.a = b4;
        this.f9439b = b7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.a.equals(zVar.a) && this.f9439b.equals(zVar.f9439b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9439b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        B b4 = this.a;
        sb.append(b4);
        B b7 = this.f9439b;
        if (b4.equals(b7)) {
            str = "";
        } else {
            str = ", " + b7;
        }
        return AbstractC0703b.m(sb, str, "]");
    }
}
