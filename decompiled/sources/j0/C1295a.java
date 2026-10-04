package j0;

import T0.k;
import h0.InterfaceC0995r;
import kotlin.jvm.internal.l;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1295a {
    public T0.b a;

    /* renamed from: b, reason: collision with root package name */
    public k f12201b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0995r f12202c;

    /* renamed from: d, reason: collision with root package name */
    public long f12203d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1295a)) {
            return false;
        }
        C1295a c1295a = (C1295a) obj;
        return l.a(this.a, c1295a.a) && this.f12201b == c1295a.f12201b && l.a(this.f12202c, c1295a.f12202c) && g0.f.a(this.f12203d, c1295a.f12203d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f12203d) + ((this.f12202c.hashCode() + ((this.f12201b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.f12201b + ", canvas=" + this.f12202c + ", size=" + ((Object) g0.f.f(this.f12203d)) + ')';
    }
}
