package T0;

import b1.AbstractC0703b;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f8840e = new i(0, 0, 0, 0);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8841b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8842c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8843d;

    public i(int i7, int i8, int i9, int i10) {
        this.a = i7;
        this.f8841b = i8;
        this.f8842c = i9;
        this.f8843d = i10;
    }

    public final int a() {
        return this.f8843d - this.f8841b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.f8841b == iVar.f8841b && this.f8842c == iVar.f8842c && this.f8843d == iVar.f8843d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8843d) + AbstractC1755i.a(this.f8842c, AbstractC1755i.a(this.f8841b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f8841b);
        sb.append(", ");
        sb.append(this.f8842c);
        sb.append(", ");
        return AbstractC0703b.l(sb, this.f8843d, ')');
    }
}
