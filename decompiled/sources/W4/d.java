package W4;

import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final e f9620e = e.g("<root>");
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public transient c f9621b;

    /* renamed from: c, reason: collision with root package name */
    public transient d f9622c;

    /* renamed from: d, reason: collision with root package name */
    public transient e f9623d;

    static {
        l.e("compile(...)", Pattern.compile("\\."));
    }

    public d(c cVar, String str) {
        l.f("fqName", str);
        l.f("safe", cVar);
        this.a = str;
        this.f9621b = cVar;
    }

    public static final List f(d dVar) {
        if (dVar.c()) {
            return new ArrayList();
        }
        List listF = f(dVar.e());
        listF.add(dVar.g());
        return listF;
    }

    public final d a(e eVar) {
        String strB;
        l.f(ContentDisposition.Parameters.Name, eVar);
        if (c()) {
            strB = eVar.b();
        } else {
            strB = this.a + '.' + eVar.b();
        }
        l.c(strB);
        return new d(strB, this, eVar);
    }

    public final void b() {
        String str = this.a;
        int length = str.length() - 1;
        boolean z7 = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z7) {
                break;
            }
            if (cCharAt == '`') {
                z7 = !z7;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length < 0) {
            this.f9623d = e.d(str);
            this.f9622c = c.f9618c.a;
            return;
        }
        String strSubstring = str.substring(length + 1);
        l.e("substring(...)", strSubstring);
        this.f9623d = e.d(strSubstring);
        String strSubstring2 = str.substring(0, length);
        l.e("substring(...)", strSubstring2);
        this.f9622c = new d(strSubstring2);
    }

    public final boolean c() {
        return this.a.length() == 0;
    }

    public final boolean d() {
        return this.f9621b != null || AbstractC2510o.d0(this.a, '<', 0, 6) < 0;
    }

    public final d e() {
        d dVar = this.f9622c;
        if (dVar != null) {
            return dVar;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        b();
        d dVar2 = this.f9622c;
        l.c(dVar2);
        return dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return l.a(this.a, ((d) obj).a);
        }
        return false;
    }

    public final e g() {
        e eVar = this.f9623d;
        if (eVar != null) {
            return eVar;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        b();
        e eVar2 = this.f9623d;
        l.c(eVar2);
        return eVar2;
    }

    public final boolean h(e eVar) {
        l.f("segment", eVar);
        if (!c()) {
            String str = this.a;
            int iD0 = AbstractC2510o.d0(str, '.', 0, 6);
            if (iD0 == -1) {
                iD0 = str.length();
            }
            int i7 = iD0;
            String strB = eVar.b();
            l.e("asString(...)", strB);
            if (i7 == strB.length() && AbstractC2517v.O(0, 0, i7, this.a, strB, false)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final c i() {
        c cVar = this.f9621b;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f9621b = cVar2;
        return cVar2;
    }

    public final String toString() {
        if (!c()) {
            return this.a;
        }
        String strB = f9620e.b();
        l.e("asString(...)", strB);
        return strB;
    }

    public d(String str) {
        this.a = str;
    }

    public d(String str, d dVar, e eVar) {
        this.a = str;
        this.f9622c = dVar;
        this.f9623d = eVar;
    }
}
