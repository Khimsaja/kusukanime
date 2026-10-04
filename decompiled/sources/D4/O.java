package D4;

import io.ktor.http.ContentDisposition;

/* loaded from: classes.dex */
public final class O extends n6.d {

    /* renamed from: h, reason: collision with root package name */
    public final String f1524h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(String str) {
        super(2);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        this.f1524h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof O) && kotlin.jvm.internal.l.a(this.f1524h, ((O) obj).f1524h);
    }

    @Override // n6.d
    public final int hashCode() {
        return this.f1524h.hashCode();
    }

    @Override // n6.d
    public final String toString() {
        return A6.b.j(new StringBuilder("TypeAlias(name="), this.f1524h, ')');
    }
}
