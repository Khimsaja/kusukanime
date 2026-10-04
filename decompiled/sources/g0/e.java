package g0;

import b1.AbstractC0703b;
import f6.AbstractC0915m;

/* loaded from: classes.dex */
public final class e {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11662b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11663c;

    /* renamed from: d, reason: collision with root package name */
    public final float f11664d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11665e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11666f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11667g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11668h;

    static {
        long j7 = AbstractC0932a.a;
        AbstractC0915m.a(AbstractC0932a.b(j7), AbstractC0932a.c(j7));
    }

    public e(float f5, float f7, float f8, float f9, long j7, long j8, long j9, long j10) {
        this.a = f5;
        this.f11662b = f7;
        this.f11663c = f8;
        this.f11664d = f9;
        this.f11665e = j7;
        this.f11666f = j8;
        this.f11667g = j9;
        this.f11668h = j10;
    }

    public final float a() {
        return this.f11664d - this.f11662b;
    }

    public final float b() {
        return this.f11663c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.a, eVar.a) == 0 && Float.compare(this.f11662b, eVar.f11662b) == 0 && Float.compare(this.f11663c, eVar.f11663c) == 0 && Float.compare(this.f11664d, eVar.f11664d) == 0 && AbstractC0932a.a(this.f11665e, eVar.f11665e) && AbstractC0932a.a(this.f11666f, eVar.f11666f) && AbstractC0932a.a(this.f11667g, eVar.f11667g) && AbstractC0932a.a(this.f11668h, eVar.f11668h);
    }

    public final int hashCode() {
        int iB = AbstractC0703b.b(this.f11664d, AbstractC0703b.b(this.f11663c, AbstractC0703b.b(this.f11662b, Float.hashCode(this.a) * 31, 31), 31), 31);
        int i7 = AbstractC0932a.f11654b;
        return Long.hashCode(this.f11668h) + AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(iB, 31, this.f11665e), 31, this.f11666f), 31, this.f11667g);
    }

    public final String toString() {
        String str = e3.c.K(this.a) + ", " + e3.c.K(this.f11662b) + ", " + e3.c.K(this.f11663c) + ", " + e3.c.K(this.f11664d);
        long j7 = this.f11665e;
        long j8 = this.f11666f;
        boolean zA = AbstractC0932a.a(j7, j8);
        long j9 = this.f11667g;
        long j10 = this.f11668h;
        if (!zA || !AbstractC0932a.a(j8, j9) || !AbstractC0932a.a(j9, j10)) {
            StringBuilder sbQ = AbstractC0703b.q("RoundRect(rect=", str, ", topLeft=");
            sbQ.append((Object) AbstractC0932a.d(j7));
            sbQ.append(", topRight=");
            sbQ.append((Object) AbstractC0932a.d(j8));
            sbQ.append(", bottomRight=");
            sbQ.append((Object) AbstractC0932a.d(j9));
            sbQ.append(", bottomLeft=");
            sbQ.append((Object) AbstractC0932a.d(j10));
            sbQ.append(')');
            return sbQ.toString();
        }
        if (AbstractC0932a.b(j7) == AbstractC0932a.c(j7)) {
            StringBuilder sbQ2 = AbstractC0703b.q("RoundRect(rect=", str, ", radius=");
            sbQ2.append(e3.c.K(AbstractC0932a.b(j7)));
            sbQ2.append(')');
            return sbQ2.toString();
        }
        StringBuilder sbQ3 = AbstractC0703b.q("RoundRect(rect=", str, ", x=");
        sbQ3.append(e3.c.K(AbstractC0932a.b(j7)));
        sbQ3.append(", y=");
        sbQ3.append(e3.c.K(AbstractC0932a.c(j7)));
        sbQ3.append(')');
        return sbQ3.toString();
    }
}
