package n0;

import b1.AbstractC0703b;

/* renamed from: n0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1550q extends AbstractC1555v {

    /* renamed from: b, reason: collision with root package name */
    public final float f13201b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13202c;

    public C1550q(float f5, float f7) {
        super(3);
        this.f13201b = f5;
        this.f13202c = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1550q)) {
            return false;
        }
        C1550q c1550q = (C1550q) obj;
        return Float.compare(this.f13201b, c1550q.f13201b) == 0 && Float.compare(this.f13202c, c1550q.f13202c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13202c) + (Float.hashCode(this.f13201b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f13201b);
        sb.append(", dy=");
        return AbstractC0703b.k(sb, this.f13202c, ')');
    }
}
