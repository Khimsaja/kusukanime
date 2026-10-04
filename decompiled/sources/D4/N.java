package D4;

import io.ktor.http.ContentDisposition;

/* loaded from: classes.dex */
public final class N extends n6.d {

    /* renamed from: h, reason: collision with root package name */
    public final String f1523h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(String str) {
        super(2);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        this.f1523h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N) && kotlin.jvm.internal.l.a(this.f1523h, ((N) obj).f1523h);
    }

    @Override // n6.d
    public final int hashCode() {
        return this.f1523h.hashCode();
    }

    @Override // n6.d
    public final String toString() {
        return A6.b.j(new StringBuilder("Class(name="), this.f1523h, ')');
    }
}
