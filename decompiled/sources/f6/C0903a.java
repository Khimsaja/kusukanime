package f6;

import b1.AbstractC0703b;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: f6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0903a {
    public final C0904b a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f11522b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f11523c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f11524d;

    /* renamed from: e, reason: collision with root package name */
    public final C0910h f11525e;

    /* renamed from: f, reason: collision with root package name */
    public final C0904b f11526f;

    /* renamed from: g, reason: collision with root package name */
    public final Proxy f11527g;

    /* renamed from: h, reason: collision with root package name */
    public final ProxySelector f11528h;

    /* renamed from: i, reason: collision with root package name */
    public final C0922t f11529i;

    /* renamed from: j, reason: collision with root package name */
    public final List f11530j;

    /* renamed from: k, reason: collision with root package name */
    public final List f11531k;

    public C0903a(String str, int i7, C0904b c0904b, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0910h c0910h, C0904b c0904b2, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        kotlin.jvm.internal.l.f("uriHost", str);
        kotlin.jvm.internal.l.f("dns", c0904b);
        kotlin.jvm.internal.l.f("socketFactory", socketFactory);
        kotlin.jvm.internal.l.f("proxyAuthenticator", c0904b2);
        kotlin.jvm.internal.l.f("protocols", list);
        kotlin.jvm.internal.l.f("connectionSpecs", list2);
        kotlin.jvm.internal.l.f("proxySelector", proxySelector);
        this.a = c0904b;
        this.f11522b = socketFactory;
        this.f11523c = sSLSocketFactory;
        this.f11524d = hostnameVerifier;
        this.f11525e = c0910h;
        this.f11526f = c0904b2;
        this.f11527g = proxy;
        this.f11528h = proxySelector;
        C0921s c0921s = new C0921s();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c0921s.a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c0921s.a = "https";
        }
        String strK = AbstractC0915m.K(C0904b.e(0, 0, 7, str));
        if (strK == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c0921s.f11599d = strK;
        if (1 > i7 || i7 >= 65536) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "unexpected port: ").toString());
        }
        c0921s.f11600e = i7;
        this.f11529i = c0921s.a();
        this.f11530j = g6.b.w(list);
        this.f11531k = g6.b.w(list2);
    }

    public final boolean a(C0903a c0903a) {
        kotlin.jvm.internal.l.f("that", c0903a);
        return kotlin.jvm.internal.l.a(this.a, c0903a.a) && kotlin.jvm.internal.l.a(this.f11526f, c0903a.f11526f) && kotlin.jvm.internal.l.a(this.f11530j, c0903a.f11530j) && kotlin.jvm.internal.l.a(this.f11531k, c0903a.f11531k) && kotlin.jvm.internal.l.a(this.f11528h, c0903a.f11528h) && kotlin.jvm.internal.l.a(this.f11527g, c0903a.f11527g) && kotlin.jvm.internal.l.a(this.f11523c, c0903a.f11523c) && kotlin.jvm.internal.l.a(this.f11524d, c0903a.f11524d) && kotlin.jvm.internal.l.a(this.f11525e, c0903a.f11525e) && this.f11529i.f11608e == c0903a.f11529i.f11608e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0903a)) {
            return false;
        }
        C0903a c0903a = (C0903a) obj;
        return kotlin.jvm.internal.l.a(this.f11529i, c0903a.f11529i) && a(c0903a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f11525e) + ((Objects.hashCode(this.f11524d) + ((Objects.hashCode(this.f11523c) + ((Objects.hashCode(this.f11527g) + ((this.f11528h.hashCode() + ((this.f11531k.hashCode() + ((this.f11530j.hashCode() + ((this.f11526f.hashCode() + ((this.a.hashCode() + A6.b.b(this.f11529i.f11612i, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        C0922t c0922t = this.f11529i;
        sb.append(c0922t.f11607d);
        sb.append(':');
        sb.append(c0922t.f11608e);
        sb.append(", ");
        Proxy proxy = this.f11527g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f11528h;
        }
        return A6.b.j(sb, str, '}');
    }
}
