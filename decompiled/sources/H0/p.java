package H0;

import b1.AbstractC0703b;
import l4.AbstractC1420H;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class p {
    public final C0209a a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3137b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3138c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3139d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3140e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3141f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3142g;

    public p(C0209a c0209a, int i7, int i8, int i9, int i10, float f5, float f7) {
        this.a = c0209a;
        this.f3137b = i7;
        this.f3138c = i8;
        this.f3139d = i9;
        this.f3140e = i10;
        this.f3141f = f5;
        this.f3142g = f7;
    }

    public final long a(long j7, boolean z7) {
        if (z7) {
            long j8 = H.f3091b;
            if (H.a(j7, j8)) {
                return j8;
            }
        }
        int i7 = H.f3092c;
        int i8 = (int) (j7 >> 32);
        int i9 = this.f3137b;
        return AbstractC1420H.c(i8 + i9, ((int) (j7 & 4294967295L)) + i9);
    }

    public final int b(int i7) {
        int i8 = this.f3138c;
        int i9 = this.f3137b;
        return e3.c.k(i7, i9, i8) - i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a.equals(pVar.a) && this.f3137b == pVar.f3137b && this.f3138c == pVar.f3138c && this.f3139d == pVar.f3139d && this.f3140e == pVar.f3140e && Float.compare(this.f3141f, pVar.f3141f) == 0 && Float.compare(this.f3142g, pVar.f3142g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3142g) + AbstractC0703b.b(this.f3141f, AbstractC1755i.a(this.f3140e, AbstractC1755i.a(this.f3139d, AbstractC1755i.a(this.f3138c, AbstractC1755i.a(this.f3137b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.f3137b);
        sb.append(", endIndex=");
        sb.append(this.f3138c);
        sb.append(", startLineIndex=");
        sb.append(this.f3139d);
        sb.append(", endLineIndex=");
        sb.append(this.f3140e);
        sb.append(", top=");
        sb.append(this.f3141f);
        sb.append(", bottom=");
        return AbstractC0703b.k(sb, this.f3142g, ')');
    }
}
