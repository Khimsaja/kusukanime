package v;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class d0 {
    public float a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16437b = true;

    /* renamed from: c, reason: collision with root package name */
    public C2143w f16438c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Float.compare(this.a, d0Var.a) == 0 && this.f16437b == d0Var.f16437b && kotlin.jvm.internal.l.a(this.f16438c, d0Var.f16438c);
    }

    public final int hashCode() {
        int iD = AbstractC0703b.d(Float.hashCode(this.a) * 31, 31, this.f16437b);
        C2143w c2143w = this.f16438c;
        return (iD + (c2143w == null ? 0 : c2143w.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.f16437b + ", crossAxisAlignment=" + this.f16438c + ", flowLayoutData=null)";
    }
}
