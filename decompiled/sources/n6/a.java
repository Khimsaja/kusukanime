package n6;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import f.AbstractC0847h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f13426d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f13427c;

    static {
        f13426d = R1.i.r() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList arrayListG0 = P3.m.g0(new o6.m[]{(!R1.i.r() || Build.VERSION.SDK_INT < 29) ? null : new o6.a(), new o6.l(o6.f.f13822f), new o6.l(o6.j.a), new o6.l(o6.h.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListG0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((o6.m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f13427c = arrayList;
    }

    @Override // n6.o
    public final AbstractC0847h b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        o6.b bVar = x509TrustManagerExtensions != null ? new o6.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new s6.a(c(x509TrustManager));
    }

    @Override // n6.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        kotlin.jvm.internal.l.f("protocols", list);
        Iterator it = this.f13427c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((o6.m) next).a(sSLSocket)) {
                    break;
                }
            }
        }
        o6.m mVar = (o6.m) next;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // n6.o
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f13427c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((o6.m) next).a(sSLSocket)) {
                break;
            }
        }
        o6.m mVar = (o6.m) next;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // n6.o
    public final boolean h(String str) {
        kotlin.jvm.internal.l.f("hostname", str);
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
