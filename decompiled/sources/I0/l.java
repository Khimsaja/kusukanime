package I0;

import b1.AbstractC0703b;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class l {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3898b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3899c;

    public l(int i7, int i8, boolean z7) {
        this.a = i7;
        this.f3898b = i8;
        this.f3899c = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && this.f3898b == lVar.f3898b && this.f3899c == lVar.f3899c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3899c) + AbstractC1755i.a(this.f3898b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.f3898b);
        sb.append(", isRtl=");
        return AbstractC0703b.n(sb, this.f3899c, ')');
    }
}
