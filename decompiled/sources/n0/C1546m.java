package n0;

import b1.AbstractC0703b;

/* renamed from: n0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1546m extends AbstractC1555v {

    /* renamed from: b, reason: collision with root package name */
    public final float f13187b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13188c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13189d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13190e;

    public C1546m(float f5, float f7, float f8, float f9) {
        super(2);
        this.f13187b = f5;
        this.f13188c = f7;
        this.f13189d = f8;
        this.f13190e = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1546m)) {
            return false;
        }
        C1546m c1546m = (C1546m) obj;
        return Float.compare(this.f13187b, c1546m.f13187b) == 0 && Float.compare(this.f13188c, c1546m.f13188c) == 0 && Float.compare(this.f13189d, c1546m.f13189d) == 0 && Float.compare(this.f13190e, c1546m.f13190e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13190e) + AbstractC0703b.b(this.f13189d, AbstractC0703b.b(this.f13188c, Float.hashCode(this.f13187b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f13187b);
        sb.append(", y1=");
        sb.append(this.f13188c);
        sb.append(", x2=");
        sb.append(this.f13189d);
        sb.append(", y2=");
        return AbstractC0703b.k(sb, this.f13190e, ')');
    }
}
