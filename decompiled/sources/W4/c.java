package W4;

import io.ktor.http.ContentDisposition;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f9618c = new c("");
    public final d a;

    /* renamed from: b, reason: collision with root package name */
    public transient c f9619b;

    public c(String str) {
        l.f("fqName", str);
        this.a = new d(this, str);
    }

    public final c a(e eVar) {
        l.f(ContentDisposition.Parameters.Name, eVar);
        return new c(this.a.a(eVar), this);
    }

    public final c b() {
        c cVar = this.f9619b;
        if (cVar != null) {
            return cVar;
        }
        d dVar = this.a;
        if (dVar.c()) {
            throw new IllegalStateException("root");
        }
        c cVar2 = new c(dVar.e());
        this.f9619b = cVar2;
        return cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return l.a(this.a, ((c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public c(d dVar) {
        l.f("fqName", dVar);
        this.a = dVar;
    }

    public c(d dVar, c cVar) {
        this.a = dVar;
        this.f9619b = cVar;
    }
}
