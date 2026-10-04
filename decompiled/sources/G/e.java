package G;

import b1.AbstractC0703b;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public String f2579b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2580c = false;

    /* renamed from: d, reason: collision with root package name */
    public d f2581d = null;

    public e(String str, String str2) {
        this.a = str;
        this.f2579b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.a, eVar.a) && l.a(this.f2579b, eVar.f2579b) && this.f2580c == eVar.f2580c && l.a(this.f2581d, eVar.f2581d);
    }

    public final int hashCode() {
        int iD = AbstractC0703b.d(A6.b.b(this.f2579b, this.a.hashCode() * 31, 31), 31, this.f2580c);
        d dVar = this.f2581d;
        return iD + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.f2581d);
        sb.append(", isShowingSubstitution=");
        return AbstractC0703b.n(sb, this.f2580c, ')');
    }
}
