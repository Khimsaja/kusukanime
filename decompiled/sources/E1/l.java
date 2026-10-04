package E1;

import B1.AbstractC0015b;
import B1.K;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: k, reason: collision with root package name */
    public final Context f1890k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1891l;

    /* renamed from: m, reason: collision with root package name */
    public final h f1892m;

    /* renamed from: n, reason: collision with root package name */
    public s f1893n;

    /* renamed from: o, reason: collision with root package name */
    public C0133b f1894o;

    /* renamed from: p, reason: collision with root package name */
    public C0136e f1895p;

    /* renamed from: q, reason: collision with root package name */
    public h f1896q;

    /* renamed from: r, reason: collision with root package name */
    public F f1897r;

    /* renamed from: s, reason: collision with root package name */
    public C0137f f1898s;

    /* renamed from: t, reason: collision with root package name */
    public A f1899t;

    /* renamed from: u, reason: collision with root package name */
    public h f1900u;

    public l(Context context, h hVar) {
        this.f1890k = context.getApplicationContext();
        hVar.getClass();
        this.f1892m = hVar;
        this.f1891l = new ArrayList();
    }

    public static void k(h hVar, D d4) {
        if (hVar != null) {
            hVar.j(d4);
        }
    }

    public final void b(h hVar) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f1891l;
            if (i7 >= arrayList.size()) {
                return;
            }
            hVar.j((D) arrayList.get(i7));
            i7++;
        }
    }

    @Override // E1.h
    public final void close() {
        h hVar = this.f1900u;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f1900u = null;
            }
        }
    }

    @Override // E1.h
    public final Map d() {
        h hVar = this.f1900u;
        return hVar == null ? Collections.EMPTY_MAP : hVar.d();
    }

    @Override // E1.h
    public final long g(k kVar) {
        AbstractC0015b.h(this.f1900u == null);
        String scheme = kVar.a.getScheme();
        int i7 = K.a;
        Uri uri = kVar.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f1890k;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f1893n == null) {
                    s sVar = new s(false);
                    this.f1893n = sVar;
                    b(sVar);
                }
                this.f1900u = this.f1893n;
            } else {
                if (this.f1894o == null) {
                    C0133b c0133b = new C0133b(context);
                    this.f1894o = c0133b;
                    b(c0133b);
                }
                this.f1900u = this.f1894o;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f1894o == null) {
                C0133b c0133b2 = new C0133b(context);
                this.f1894o = c0133b2;
                b(c0133b2);
            }
            this.f1900u = this.f1894o;
        } else if ("content".equals(scheme)) {
            if (this.f1895p == null) {
                C0136e c0136e = new C0136e(context);
                this.f1895p = c0136e;
                b(c0136e);
            }
            this.f1900u = this.f1895p;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            h hVar = this.f1892m;
            if (zEquals) {
                if (this.f1896q == null) {
                    try {
                        h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f1896q = hVar2;
                        b(hVar2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC0015b.v("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e7) {
                        throw new RuntimeException("Error instantiating RTMP extension", e7);
                    }
                    if (this.f1896q == null) {
                        this.f1896q = hVar;
                    }
                }
                this.f1900u = this.f1896q;
            } else if ("udp".equals(scheme)) {
                if (this.f1897r == null) {
                    F f5 = new F();
                    this.f1897r = f5;
                    b(f5);
                }
                this.f1900u = this.f1897r;
            } else if ("data".equals(scheme)) {
                if (this.f1898s == null) {
                    C0137f c0137f = new C0137f(false);
                    this.f1898s = c0137f;
                    b(c0137f);
                }
                this.f1900u = this.f1898s;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f1899t == null) {
                    A a = new A(context);
                    this.f1899t = a;
                    b(a);
                }
                this.f1900u = this.f1899t;
            } else {
                this.f1900u = hVar;
            }
        }
        return this.f1900u.g(kVar);
    }

    @Override // E1.h
    public final Uri getUri() {
        h hVar = this.f1900u;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override // E1.h
    public final void j(D d4) {
        d4.getClass();
        this.f1892m.j(d4);
        this.f1891l.add(d4);
        k(this.f1893n, d4);
        k(this.f1894o, d4);
        k(this.f1895p, d4);
        k(this.f1896q, d4);
        k(this.f1897r, d4);
        k(this.f1898s, d4);
        k(this.f1899t, d4);
    }

    @Override // y1.InterfaceC2385g
    public final int o(byte[] bArr, int i7, int i8) {
        h hVar = this.f1900u;
        hVar.getClass();
        return hVar.o(bArr, i7, i8);
    }
}
