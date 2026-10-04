package q;

import h0.C0981d;
import h0.C0985h;
import h0.C0987j;
import j0.C1296b;

/* renamed from: q.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1834p {
    public C0985h a = null;

    /* renamed from: b, reason: collision with root package name */
    public C0981d f14605b = null;

    /* renamed from: c, reason: collision with root package name */
    public C1296b f14606c = null;

    /* renamed from: d, reason: collision with root package name */
    public C0987j f14607d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1834p)) {
            return false;
        }
        C1834p c1834p = (C1834p) obj;
        return kotlin.jvm.internal.l.a(this.a, c1834p.a) && kotlin.jvm.internal.l.a(this.f14605b, c1834p.f14605b) && kotlin.jvm.internal.l.a(this.f14606c, c1834p.f14606c) && kotlin.jvm.internal.l.a(this.f14607d, c1834p.f14607d);
    }

    public final int hashCode() {
        C0985h c0985h = this.a;
        int iHashCode = (c0985h == null ? 0 : c0985h.hashCode()) * 31;
        C0981d c0981d = this.f14605b;
        int iHashCode2 = (iHashCode + (c0981d == null ? 0 : c0981d.hashCode())) * 31;
        C1296b c1296b = this.f14606c;
        int iHashCode3 = (iHashCode2 + (c1296b == null ? 0 : c1296b.hashCode())) * 31;
        C0987j c0987j = this.f14607d;
        return iHashCode3 + (c0987j != null ? c0987j.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.f14605b + ", canvasDrawScope=" + this.f14606c + ", borderPath=" + this.f14607d + ')';
    }
}
