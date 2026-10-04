package y1;

import android.net.Uri;
import f1.AbstractC0871d;
import java.util.List;
import java.util.Objects;
import v.c0;

/* renamed from: y1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2398u {
    public final Uri a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18134b;

    /* renamed from: c, reason: collision with root package name */
    public final List f18135c;

    /* renamed from: d, reason: collision with root package name */
    public final j3.G f18136d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18137e;

    static {
        c0.d(0, 1, 2, 3, 4);
        B1.K.B(5);
        B1.K.B(6);
        B1.K.B(7);
    }

    public C2398u(Uri uri, String str, AbstractC0871d abstractC0871d, List list, j3.G g4, long j7) {
        this.a = uri;
        this.f18134b = D.m(str);
        this.f18135c = list;
        this.f18136d = g4;
        j3.D dR = j3.G.r();
        for (int i7 = 0; i7 < g4.size(); i7++) {
            ((C2400w) g4.get(i7)).getClass();
            dR.a(new C2400w());
        }
        dR.f();
        this.f18137e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2398u)) {
            return false;
        }
        C2398u c2398u = (C2398u) obj;
        return this.a.equals(c2398u.a) && Objects.equals(this.f18134b, c2398u.f18134b) && Objects.equals(null, null) && this.f18135c.equals(c2398u.f18135c) && this.f18136d.equals(c2398u.f18136d) && this.f18137e == c2398u.f18137e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        return (int) (((this.f18136d.hashCode() + ((this.f18135c.hashCode() + ((iHashCode + (this.f18134b == null ? 0 : r1.hashCode())) * 29791)) * 961)) * 31 * 31) + this.f18137e);
    }
}
