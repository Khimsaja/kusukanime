package H0;

import b1.AbstractC0703b;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class q {
    public final P0.c a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3143b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3144c;

    public q(P0.c cVar, int i7, int i8) {
        this.a = cVar;
        this.f3143b = i7;
        this.f3144c = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a.equals(qVar.a) && this.f3143b == qVar.f3143b && this.f3144c == qVar.f3144c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3144c) + AbstractC1755i.a(this.f3143b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.f3143b);
        sb.append(", endIndex=");
        return AbstractC0703b.l(sb, this.f3144c, ')');
    }
}
