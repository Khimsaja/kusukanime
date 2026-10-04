package y1;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import v.c0;

/* renamed from: y1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2401x {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final C2398u f18138b;

    /* renamed from: c, reason: collision with root package name */
    public final C2397t f18139c;

    /* renamed from: d, reason: collision with root package name */
    public final A f18140d;

    /* renamed from: e, reason: collision with root package name */
    public final r f18141e;

    /* renamed from: f, reason: collision with root package name */
    public final C2399v f18142f;

    static {
        V1.r rVar = new V1.r();
        j3.E e7 = j3.G.f12277l;
        j3.X x7 = j3.X.f12304o;
        List list = Collections.EMPTY_LIST;
        j3.X x8 = j3.X.f12304o;
        C2396s c2396s = new C2396s();
        C2399v c2399v = C2399v.a;
        rVar.b();
        c2396s.a();
        A a = A.f17903B;
        c0.d(0, 1, 2, 3, 4);
        B1.K.B(5);
    }

    public C2401x(String str, r rVar, C2398u c2398u, C2397t c2397t, A a, C2399v c2399v) {
        this.a = str;
        this.f18138b = c2398u;
        this.f18139c = c2397t;
        this.f18140d = a;
        this.f18141e = rVar;
        this.f18142f = c2399v;
    }

    public static C2401x a(String str) {
        V1.r rVar = new V1.r();
        j3.E e7 = j3.G.f12277l;
        j3.X x7 = j3.X.f12304o;
        List list = Collections.EMPTY_LIST;
        j3.X x8 = j3.X.f12304o;
        C2396s c2396s = new C2396s();
        C2399v c2399v = C2399v.a;
        Uri uri = str == null ? null : Uri.parse(str);
        return new C2401x("", new r(rVar), uri != null ? new C2398u(uri, null, null, list, x8, -9223372036854775807L) : null, new C2397t(c2396s), A.f17903B, c2399v);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2401x)) {
            return false;
        }
        C2401x c2401x = (C2401x) obj;
        return Objects.equals(this.a, c2401x.a) && this.f18141e.equals(c2401x.f18141e) && Objects.equals(this.f18138b, c2401x.f18138b) && this.f18139c.equals(c2401x.f18139c) && Objects.equals(this.f18140d, c2401x.f18140d) && Objects.equals(this.f18142f, c2401x.f18142f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        C2398u c2398u = this.f18138b;
        int iHashCode2 = (this.f18140d.hashCode() + ((this.f18141e.hashCode() + ((this.f18139c.hashCode() + ((iHashCode + (c2398u != null ? c2398u.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f18142f.getClass();
        return iHashCode2;
    }
}
