package W4;

import P3.F;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class a {
    public final c a;

    /* renamed from: b, reason: collision with root package name */
    public final e f9615b;

    static {
        e eVar = g.f9631f;
        c cVar = c.f9618c;
        F.g0(eVar);
    }

    public a(c cVar, e eVar) {
        l.f("packageName", cVar);
        this.a = cVar;
        this.f9615b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.a, aVar.a) && this.f9615b.equals(aVar.f9615b);
    }

    public final int hashCode() {
        return this.f9615b.hashCode() + ((this.a.hashCode() + 527) * 961);
    }

    public final String toString() {
        return AbstractC2517v.Q(this.a.a.a, '.', '/') + "/" + this.f9615b;
    }
}
