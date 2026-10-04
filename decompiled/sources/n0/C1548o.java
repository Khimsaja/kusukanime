package n0;

import b1.AbstractC0703b;

/* renamed from: n0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1548o extends AbstractC1555v {

    /* renamed from: b, reason: collision with root package name */
    public final float f13194b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13195c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13196d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13197e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13198f;

    /* renamed from: g, reason: collision with root package name */
    public final float f13199g;

    public C1548o(float f5, float f7, float f8, float f9, float f10, float f11) {
        super(2);
        this.f13194b = f5;
        this.f13195c = f7;
        this.f13196d = f8;
        this.f13197e = f9;
        this.f13198f = f10;
        this.f13199g = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1548o)) {
            return false;
        }
        C1548o c1548o = (C1548o) obj;
        return Float.compare(this.f13194b, c1548o.f13194b) == 0 && Float.compare(this.f13195c, c1548o.f13195c) == 0 && Float.compare(this.f13196d, c1548o.f13196d) == 0 && Float.compare(this.f13197e, c1548o.f13197e) == 0 && Float.compare(this.f13198f, c1548o.f13198f) == 0 && Float.compare(this.f13199g, c1548o.f13199g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13199g) + AbstractC0703b.b(this.f13198f, AbstractC0703b.b(this.f13197e, AbstractC0703b.b(this.f13196d, AbstractC0703b.b(this.f13195c, Float.hashCode(this.f13194b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f13194b);
        sb.append(", dy1=");
        sb.append(this.f13195c);
        sb.append(", dx2=");
        sb.append(this.f13196d);
        sb.append(", dy2=");
        sb.append(this.f13197e);
        sb.append(", dx3=");
        sb.append(this.f13198f);
        sb.append(", dy3=");
        return AbstractC0703b.k(sb, this.f13199g, ')');
    }
}
