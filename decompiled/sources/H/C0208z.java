package H;

import b1.AbstractC0703b;
import p.AbstractC1755i;

/* renamed from: H.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208z {
    public final D.V a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3033b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3034c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3035d;

    public C0208z(D.V v5, long j7, int i7, boolean z7) {
        this.a = v5;
        this.f3033b = j7;
        this.f3034c = i7;
        this.f3035d = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0208z)) {
            return false;
        }
        C0208z c0208z = (C0208z) obj;
        return this.a == c0208z.a && g0.c.b(this.f3033b, c0208z.f3033b) && this.f3034c == c0208z.f3034c && this.f3035d == c0208z.f3035d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3035d) + ((AbstractC1755i.b(this.f3034c) + AbstractC0703b.c(this.a.hashCode() * 31, 31, this.f3033b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) g0.c.j(this.f3033b));
        sb.append(", anchor=");
        int i7 = this.f3034c;
        sb.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "Right" : "Middle" : "Left");
        sb.append(", visible=");
        return AbstractC0703b.n(sb, this.f3035d, ')');
    }
}
