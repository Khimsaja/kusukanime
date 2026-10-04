package f6;

import f.AbstractC0847h;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: f6.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0887A implements Cloneable, InterfaceC0907e, InterfaceC0900N {

    /* renamed from: L, reason: collision with root package name */
    public static final List f11436L = g6.b.l(EnumC0888B.HTTP_2, EnumC0888B.HTTP_1_1);

    /* renamed from: M, reason: collision with root package name */
    public static final List f11437M = g6.b.l(C0914l.f11572e, C0914l.f11573f);

    /* renamed from: A, reason: collision with root package name */
    public final X509TrustManager f11438A;

    /* renamed from: B, reason: collision with root package name */
    public final List f11439B;

    /* renamed from: C, reason: collision with root package name */
    public final List f11440C;

    /* renamed from: D, reason: collision with root package name */
    public final s6.c f11441D;

    /* renamed from: E, reason: collision with root package name */
    public final C0910h f11442E;

    /* renamed from: F, reason: collision with root package name */
    public final AbstractC0847h f11443F;

    /* renamed from: G, reason: collision with root package name */
    public final int f11444G;

    /* renamed from: H, reason: collision with root package name */
    public final int f11445H;
    public final int I;
    public final long J;

    /* renamed from: K, reason: collision with root package name */
    public final X4.y f11446K;

    /* renamed from: k, reason: collision with root package name */
    public final A2.b f11447k;

    /* renamed from: l, reason: collision with root package name */
    public final X4.y f11448l;

    /* renamed from: m, reason: collision with root package name */
    public final List f11449m;

    /* renamed from: n, reason: collision with root package name */
    public final List f11450n;

    /* renamed from: o, reason: collision with root package name */
    public final I1.e f11451o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f11452p;

    /* renamed from: q, reason: collision with root package name */
    public final C0904b f11453q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f11454r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f11455s;

    /* renamed from: t, reason: collision with root package name */
    public final C0904b f11456t;

    /* renamed from: u, reason: collision with root package name */
    public final C0904b f11457u;

    /* renamed from: v, reason: collision with root package name */
    public final Proxy f11458v;

    /* renamed from: w, reason: collision with root package name */
    public final ProxySelector f11459w;

    /* renamed from: x, reason: collision with root package name */
    public final C0904b f11460x;

    /* renamed from: y, reason: collision with root package name */
    public final SocketFactory f11461y;

    /* renamed from: z, reason: collision with root package name */
    public final SSLSocketFactory f11462z;

    public C0887A(z zVar) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        this.f11447k = zVar.a;
        this.f11448l = zVar.f11629b;
        this.f11449m = g6.b.w(zVar.f11630c);
        this.f11450n = g6.b.w(zVar.f11631d);
        this.f11451o = zVar.f11632e;
        this.f11452p = zVar.f11633f;
        this.f11453q = zVar.f11634g;
        this.f11454r = zVar.f11635h;
        this.f11455s = zVar.f11636i;
        this.f11456t = zVar.f11637j;
        this.f11457u = zVar.f11638k;
        Proxy proxy = zVar.f11639l;
        this.f11458v = proxy;
        if (proxy != null) {
            proxySelector = p6.a.a;
        } else {
            proxySelector = zVar.f11640m;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = p6.a.a;
            }
        }
        this.f11459w = proxySelector;
        this.f11460x = zVar.f11641n;
        this.f11461y = zVar.f11642o;
        List list = zVar.f11645r;
        this.f11439B = list;
        this.f11440C = zVar.f11646s;
        this.f11441D = zVar.f11647t;
        this.f11444G = zVar.f11650w;
        this.f11445H = zVar.f11651x;
        this.I = zVar.f11652y;
        this.J = zVar.f11653z;
        X4.y yVar = zVar.f11628A;
        this.f11446K = yVar == null ? new X4.y(19) : yVar;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C0914l) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = zVar.f11643p;
                    if (sSLSocketFactory != null) {
                        this.f11462z = sSLSocketFactory;
                        AbstractC0847h abstractC0847h = zVar.f11649v;
                        kotlin.jvm.internal.l.c(abstractC0847h);
                        this.f11443F = abstractC0847h;
                        X509TrustManager x509TrustManager = zVar.f11644q;
                        kotlin.jvm.internal.l.c(x509TrustManager);
                        this.f11438A = x509TrustManager;
                        C0910h c0910h = zVar.f11648u;
                        c0910h.getClass();
                        this.f11442E = kotlin.jvm.internal.l.a(c0910h.f11549b, abstractC0847h) ? c0910h : new C0910h(c0910h.a, abstractC0847h);
                    } else {
                        n6.o oVar = n6.o.a;
                        X509TrustManager x509TrustManagerN = n6.o.a.n();
                        this.f11438A = x509TrustManagerN;
                        this.f11462z = n6.o.a.m(x509TrustManagerN);
                        AbstractC0847h abstractC0847hB = n6.o.a.b(x509TrustManagerN);
                        this.f11443F = abstractC0847hB;
                        C0910h c0910h2 = zVar.f11648u;
                        c0910h2.getClass();
                        this.f11442E = kotlin.jvm.internal.l.a(c0910h2.f11549b, abstractC0847hB) ? c0910h2 : new C0910h(c0910h2.a, abstractC0847hB);
                    }
                }
            }
            this.f11462z = null;
            this.f11443F = null;
            this.f11438A = null;
            this.f11442E = C0910h.f11548c;
        } else {
            this.f11462z = null;
            this.f11443F = null;
            this.f11438A = null;
            this.f11442E = C0910h.f11548c;
        }
        List list2 = this.f11449m;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>", list2);
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list2).toString());
        }
        List list3 = this.f11450n;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>", list3);
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        X509TrustManager x509TrustManager2 = this.f11438A;
        AbstractC0847h abstractC0847h2 = this.f11443F;
        SSLSocketFactory sSLSocketFactory2 = this.f11462z;
        List list4 = this.f11439B;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((C0914l) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (abstractC0847h2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (abstractC0847h2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!kotlin.jvm.internal.l.a(this.f11442E, C0910h.f11548c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final z a() {
        z zVar = new z();
        zVar.a = this.f11447k;
        zVar.f11629b = this.f11448l;
        P3.v.e0(zVar.f11630c, this.f11449m);
        P3.v.e0(zVar.f11631d, this.f11450n);
        zVar.f11632e = this.f11451o;
        zVar.f11633f = this.f11452p;
        zVar.f11634g = this.f11453q;
        zVar.f11635h = this.f11454r;
        zVar.f11636i = this.f11455s;
        zVar.f11637j = this.f11456t;
        zVar.f11638k = this.f11457u;
        zVar.f11639l = this.f11458v;
        zVar.f11640m = this.f11459w;
        zVar.f11641n = this.f11460x;
        zVar.f11642o = this.f11461y;
        zVar.f11643p = this.f11462z;
        zVar.f11644q = this.f11438A;
        zVar.f11645r = this.f11439B;
        zVar.f11646s = this.f11440C;
        zVar.f11647t = this.f11441D;
        zVar.f11648u = this.f11442E;
        zVar.f11649v = this.f11443F;
        zVar.f11650w = this.f11444G;
        zVar.f11651x = this.f11445H;
        zVar.f11652y = this.I;
        zVar.f11653z = this.J;
        zVar.f11628A = this.f11446K;
        return zVar;
    }

    public final j6.i b(C0890D c0890d) {
        kotlin.jvm.internal.l.f("request", c0890d);
        return new j6.i(this, c0890d, false);
    }

    public final Object clone() {
        return super.clone();
    }
}
