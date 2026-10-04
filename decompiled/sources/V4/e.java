package V4;

import io.ktor.http.ContentDisposition;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e extends n6.d {

    /* renamed from: h, reason: collision with root package name */
    public final String f9484h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9485i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2) {
        super(24);
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("desc", str2);
        this.f9484h = str;
        this.f9485i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f9484h, eVar.f9484h) && l.a(this.f9485i, eVar.f9485i);
    }

    @Override // n6.d
    public final int hashCode() {
        return this.f9485i.hashCode() + (this.f9484h.hashCode() * 31);
    }

    @Override // n6.d
    public final String s() {
        return this.f9484h + this.f9485i;
    }
}
