package W4;

import P3.F;
import io.ktor.http.ContentDisposition;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class b {
    public final c a;

    /* renamed from: b, reason: collision with root package name */
    public final c f9616b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9617c;

    public b(c cVar, c cVar2, boolean z7) {
        l.f("packageFqName", cVar);
        l.f("relativeClassName", cVar2);
        this.a = cVar;
        this.f9616b = cVar2;
        this.f9617c = z7;
        cVar2.a.c();
    }

    public static final String c(c cVar) {
        String str = cVar.a.a;
        return AbstractC2510o.X(str, '/') ? A6.b.d('`', "`", str) : str;
    }

    public final c a() {
        c cVar = this.a;
        boolean zC = cVar.a.c();
        c cVar2 = this.f9616b;
        if (zC) {
            return cVar2;
        }
        return new c(cVar.a.a + '.' + cVar2.a.a);
    }

    public final String b() {
        c cVar = this.a;
        boolean zC = cVar.a.c();
        c cVar2 = this.f9616b;
        if (zC) {
            return c(cVar2);
        }
        return AbstractC2517v.Q(cVar.a.a, '.', '/') + "/" + c(cVar2);
    }

    public final b d(e eVar) {
        l.f(ContentDisposition.Parameters.Name, eVar);
        return new b(this.a, this.f9616b.a(eVar), this.f9617c);
    }

    public final b e() {
        c cVarB = this.f9616b.b();
        if (cVarB.a.c()) {
            return null;
        }
        return new b(this.a, cVarB, this.f9617c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.a, bVar.a) && l.a(this.f9616b, bVar.f9616b) && this.f9617c == bVar.f9617c;
    }

    public final e f() {
        return this.f9616b.a.g();
    }

    public final boolean g() {
        return !this.f9616b.b().a.c();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9617c) + ((this.f9616b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        if (!this.a.a.c()) {
            return b();
        }
        return "/" + b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c cVar, e eVar) {
        this(cVar, F.g0(eVar), false);
        l.f("packageFqName", cVar);
        l.f("topLevelName", eVar);
        c cVar2 = c.f9618c;
    }
}
