package S0;

import b1.AbstractC0703b;
import h0.AbstractC0971P;
import h0.AbstractC0993p;
import h0.C0998u;

/* loaded from: classes.dex */
public final class b implements m {
    public final AbstractC0971P a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8706b;

    public b(AbstractC0971P abstractC0971P, float f5) {
        this.a = abstractC0971P;
        this.f8706b = f5;
    }

    @Override // S0.m
    public final float a() {
        return this.f8706b;
    }

    @Override // S0.m
    public final long b() {
        int i7 = C0998u.f11835h;
        return C0998u.f11834g;
    }

    @Override // S0.m
    public final AbstractC0993p c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.l.a(this.a, bVar.a) && Float.compare(this.f8706b, bVar.f8706b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8706b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return AbstractC0703b.k(sb, this.f8706b, ')');
    }
}
