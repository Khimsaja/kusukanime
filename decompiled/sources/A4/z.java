package A4;

import java.util.Collection;

/* loaded from: classes.dex */
public final class z extends t implements N4.b {
    public final W4.c a;

    public z(W4.c cVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        this.a = cVar;
    }

    @Override // N4.b
    public final C0012e a(W4.c cVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return kotlin.jvm.internal.l.a(this.a, ((z) obj).a);
        }
        return false;
    }

    @Override // N4.b
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return P3.y.f7779k;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return z.class.getName() + ": " + this.a;
    }
}
