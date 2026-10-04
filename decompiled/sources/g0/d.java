package g0;

import b1.AbstractC0703b;
import e5.AbstractC0832b;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f11658e = new d(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11659b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11660c;

    /* renamed from: d, reason: collision with root package name */
    public final float f11661d;

    public d(float f5, float f7, float f8, float f9) {
        this.a = f5;
        this.f11659b = f7;
        this.f11660c = f8;
        this.f11661d = f9;
    }

    public final long a() {
        return AbstractC0832b.e((c() / 2.0f) + this.a, (b() / 2.0f) + this.f11659b);
    }

    public final float b() {
        return this.f11661d - this.f11659b;
    }

    public final float c() {
        return this.f11660c - this.a;
    }

    public final d d(d dVar) {
        return new d(Math.max(this.a, dVar.a), Math.max(this.f11659b, dVar.f11659b), Math.min(this.f11660c, dVar.f11660c), Math.min(this.f11661d, dVar.f11661d));
    }

    public final boolean e() {
        return this.a >= this.f11660c || this.f11659b >= this.f11661d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.a, dVar.a) == 0 && Float.compare(this.f11659b, dVar.f11659b) == 0 && Float.compare(this.f11660c, dVar.f11660c) == 0 && Float.compare(this.f11661d, dVar.f11661d) == 0;
    }

    public final boolean f(d dVar) {
        return this.f11660c > dVar.a && dVar.f11660c > this.a && this.f11661d > dVar.f11659b && dVar.f11661d > this.f11659b;
    }

    public final d g(float f5, float f7) {
        return new d(this.a + f5, this.f11659b + f7, this.f11660c + f5, this.f11661d + f7);
    }

    public final d h(long j7) {
        return new d(c.d(j7) + this.a, c.e(j7) + this.f11659b, c.d(j7) + this.f11660c, c.e(j7) + this.f11661d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f11661d) + AbstractC0703b.b(this.f11660c, AbstractC0703b.b(this.f11659b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + e3.c.K(this.a) + ", " + e3.c.K(this.f11659b) + ", " + e3.c.K(this.f11660c) + ", " + e3.c.K(this.f11661d) + ')';
    }
}
