package n0;

import b1.AbstractC0703b;

/* renamed from: n0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1552s extends AbstractC1555v {

    /* renamed from: b, reason: collision with root package name */
    public final float f13204b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13205c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13206d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13207e;

    public C1552s(float f5, float f7, float f8, float f9) {
        super(2);
        this.f13204b = f5;
        this.f13205c = f7;
        this.f13206d = f8;
        this.f13207e = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1552s)) {
            return false;
        }
        C1552s c1552s = (C1552s) obj;
        return Float.compare(this.f13204b, c1552s.f13204b) == 0 && Float.compare(this.f13205c, c1552s.f13205c) == 0 && Float.compare(this.f13206d, c1552s.f13206d) == 0 && Float.compare(this.f13207e, c1552s.f13207e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13207e) + AbstractC0703b.b(this.f13206d, AbstractC0703b.b(this.f13205c, Float.hashCode(this.f13204b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f13204b);
        sb.append(", dy1=");
        sb.append(this.f13205c);
        sb.append(", dx2=");
        sb.append(this.f13206d);
        sb.append(", dy2=");
        return AbstractC0703b.k(sb, this.f13207e, ')');
    }
}
