package f6;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: f6.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0898L {
    public final C0903a a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f11513b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f11514c;

    public C0898L(C0903a c0903a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        kotlin.jvm.internal.l.f("socketAddress", inetSocketAddress);
        this.a = c0903a;
        this.f11513b = proxy;
        this.f11514c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0898L)) {
            return false;
        }
        C0898L c0898l = (C0898L) obj;
        return kotlin.jvm.internal.l.a(c0898l.a, this.a) && kotlin.jvm.internal.l.a(c0898l.f11513b, this.f11513b) && kotlin.jvm.internal.l.a(c0898l.f11514c, this.f11514c);
    }

    public final int hashCode() {
        return this.f11514c.hashCode() + ((this.f11513b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f11514c + '}';
    }
}
