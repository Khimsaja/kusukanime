package f6;

import f.AbstractC0847h;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: A, reason: collision with root package name */
    public X4.y f11628A;
    public A2.b a = new A2.b(8);

    /* renamed from: b, reason: collision with root package name */
    public X4.y f11629b = new X4.y(10);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f11630c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11631d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public I1.e f11632e = new I1.e(18);

    /* renamed from: f, reason: collision with root package name */
    public boolean f11633f = true;

    /* renamed from: g, reason: collision with root package name */
    public C0904b f11634g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11635h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11636i;

    /* renamed from: j, reason: collision with root package name */
    public C0904b f11637j;

    /* renamed from: k, reason: collision with root package name */
    public C0904b f11638k;

    /* renamed from: l, reason: collision with root package name */
    public Proxy f11639l;

    /* renamed from: m, reason: collision with root package name */
    public ProxySelector f11640m;

    /* renamed from: n, reason: collision with root package name */
    public C0904b f11641n;

    /* renamed from: o, reason: collision with root package name */
    public SocketFactory f11642o;

    /* renamed from: p, reason: collision with root package name */
    public SSLSocketFactory f11643p;

    /* renamed from: q, reason: collision with root package name */
    public X509TrustManager f11644q;

    /* renamed from: r, reason: collision with root package name */
    public List f11645r;

    /* renamed from: s, reason: collision with root package name */
    public List f11646s;

    /* renamed from: t, reason: collision with root package name */
    public s6.c f11647t;

    /* renamed from: u, reason: collision with root package name */
    public C0910h f11648u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC0847h f11649v;

    /* renamed from: w, reason: collision with root package name */
    public int f11650w;

    /* renamed from: x, reason: collision with root package name */
    public int f11651x;

    /* renamed from: y, reason: collision with root package name */
    public int f11652y;

    /* renamed from: z, reason: collision with root package name */
    public long f11653z;

    public z() {
        C0904b c0904b = C0904b.a;
        this.f11634g = c0904b;
        this.f11635h = true;
        this.f11636i = true;
        this.f11637j = C0904b.f11532b;
        this.f11638k = C0904b.f11533c;
        this.f11641n = c0904b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        kotlin.jvm.internal.l.e("getDefault()", socketFactory);
        this.f11642o = socketFactory;
        this.f11645r = C0887A.f11437M;
        this.f11646s = C0887A.f11436L;
        this.f11647t = s6.c.a;
        this.f11648u = C0910h.f11548c;
        this.f11650w = 10000;
        this.f11651x = 10000;
        this.f11652y = 10000;
        this.f11653z = 1024L;
    }

    public final void a(long j7, TimeUnit timeUnit) {
        kotlin.jvm.internal.l.f("unit", timeUnit);
        this.f11650w = g6.b.b(j7, timeUnit);
    }
}
