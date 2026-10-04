package n0;

import b1.AbstractC0703b;

/* renamed from: n0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1542i extends AbstractC1555v {

    /* renamed from: b, reason: collision with root package name */
    public final float f13176b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13177c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13178d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13179e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13180f;

    /* renamed from: g, reason: collision with root package name */
    public final float f13181g;

    public C1542i(float f5, float f7, float f8, float f9, float f10, float f11) {
        super(2);
        this.f13176b = f5;
        this.f13177c = f7;
        this.f13178d = f8;
        this.f13179e = f9;
        this.f13180f = f10;
        this.f13181g = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1542i)) {
            return false;
        }
        C1542i c1542i = (C1542i) obj;
        return Float.compare(this.f13176b, c1542i.f13176b) == 0 && Float.compare(this.f13177c, c1542i.f13177c) == 0 && Float.compare(this.f13178d, c1542i.f13178d) == 0 && Float.compare(this.f13179e, c1542i.f13179e) == 0 && Float.compare(this.f13180f, c1542i.f13180f) == 0 && Float.compare(this.f13181g, c1542i.f13181g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13181g) + AbstractC0703b.b(this.f13180f, AbstractC0703b.b(this.f13179e, AbstractC0703b.b(this.f13178d, AbstractC0703b.b(this.f13177c, Float.hashCode(this.f13176b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f13176b);
        sb.append(", y1=");
        sb.append(this.f13177c);
        sb.append(", x2=");
        sb.append(this.f13178d);
        sb.append(", y2=");
        sb.append(this.f13179e);
        sb.append(", x3=");
        sb.append(this.f13180f);
        sb.append(", y3=");
        return AbstractC0703b.k(sb, this.f13181g, ')');
    }
}
