package L4;

import io.ktor.http.ContentDisposition;

/* loaded from: classes.dex */
public final class r {
    public final W4.e a;

    /* renamed from: b, reason: collision with root package name */
    public final A4.p f6129b;

    public r(W4.e eVar, A4.p pVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        this.a = eVar;
        this.f6129b = pVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return kotlin.jvm.internal.l.a(this.a, ((r) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
