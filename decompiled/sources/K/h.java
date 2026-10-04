package K;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class h {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4382b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4383c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4384d;

    public h(float f5, float f7, float f8, float f9) {
        this.a = f5;
        this.f4382b = f7;
        this.f4383c = f8;
        this.f4384d = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.f4382b == hVar.f4382b && this.f4383c == hVar.f4383c && this.f4384d == hVar.f4384d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4384d) + AbstractC0703b.b(this.f4383c, AbstractC0703b.b(this.f4382b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.a);
        sb.append(", focusedAlpha=");
        sb.append(this.f4382b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f4383c);
        sb.append(", pressedAlpha=");
        return AbstractC0703b.k(sb, this.f4384d, ')');
    }
}
