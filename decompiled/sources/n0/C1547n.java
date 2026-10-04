package n0;

import b1.AbstractC0703b;

/* renamed from: n0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1547n extends AbstractC1555v {

    /* renamed from: b, reason: collision with root package name */
    public final float f13191b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13192c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13193d;

    public C1547n(float f5, float f7, float f8) {
        super(3);
        this.f13191b = f5;
        this.f13192c = f7;
        this.f13193d = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1547n)) {
            return false;
        }
        C1547n c1547n = (C1547n) obj;
        return Float.compare(this.f13191b, c1547n.f13191b) == 0 && Float.compare(this.f13192c, c1547n.f13192c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f13193d, c1547n.f13193d) == 0 && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + AbstractC0703b.b(this.f13193d, AbstractC0703b.d(AbstractC0703b.d(AbstractC0703b.b(0.0f, AbstractC0703b.b(this.f13192c, Float.hashCode(this.f13191b) * 31, 31), 31), 31, true), 31, true), 31);
    }

    public final String toString() {
        return "RelativeArcTo(horizontalEllipseRadius=" + this.f13191b + ", verticalEllipseRadius=" + this.f13192c + ", theta=0.0, isMoreThanHalf=true, isPositiveArc=true, arcStartDx=" + this.f13193d + ", arcStartDy=0.0)";
    }
}
