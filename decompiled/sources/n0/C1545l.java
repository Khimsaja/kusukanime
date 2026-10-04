package n0;

import b1.AbstractC0703b;

/* renamed from: n0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1545l extends AbstractC1555v {

    /* renamed from: b, reason: collision with root package name */
    public final float f13185b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13186c;

    public C1545l(float f5, float f7) {
        super(3);
        this.f13185b = f5;
        this.f13186c = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1545l)) {
            return false;
        }
        C1545l c1545l = (C1545l) obj;
        return Float.compare(this.f13185b, c1545l.f13185b) == 0 && Float.compare(this.f13186c, c1545l.f13186c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13186c) + (Float.hashCode(this.f13185b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f13185b);
        sb.append(", y=");
        return AbstractC0703b.k(sb, this.f13186c, ')');
    }
}
