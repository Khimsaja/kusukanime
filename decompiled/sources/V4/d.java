package V4;

import io.ktor.http.ContentDisposition;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d extends n6.d {

    /* renamed from: h, reason: collision with root package name */
    public final String f9482h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9483i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        super(24);
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("desc", str2);
        this.f9482h = str;
        this.f9483i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f9482h, dVar.f9482h) && l.a(this.f9483i, dVar.f9483i);
    }

    @Override // n6.d
    public final int hashCode() {
        return this.f9483i.hashCode() + (this.f9482h.hashCode() * 31);
    }

    @Override // n6.d
    public final String s() {
        return this.f9482h + ':' + this.f9483i;
    }
}
