package n6;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import f.AbstractC0847h;
import io.ktor.http.ContentType;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f13429e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f13430c;

    /* renamed from: d, reason: collision with root package name */
    public final U3.f f13431d;

    static {
        boolean z7 = false;
        if (R1.i.r() && Build.VERSION.SDK_INT < 30) {
            z7 = true;
        }
        f13429e = z7;
    }

    public c() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        o6.n nVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            nVar = new o6.n(cls);
        } catch (Exception e7) {
            o.a.getClass();
            o.i("unable to load android socket classes", 5, e7);
            nVar = null;
        }
        ArrayList arrayListG0 = P3.m.g0(new o6.m[]{nVar, new o6.l(o6.f.f13822f), new o6.l(o6.j.a), new o6.l(o6.h.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListG0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((o6.m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f13430c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f13431d = new U3.f(method3, method2, method);
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
    public final s6.d c(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // n6.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        kotlin.jvm.internal.l.f("protocols", list);
        Iterator it = this.f13430c.iterator();
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i7) throws IOException {
        kotlin.jvm.internal.l.f("address", inetSocketAddress);
        try {
            socket.connect(inetSocketAddress, i7);
        } catch (ClassCastException e7) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e7;
            }
            throw new IOException("Exception in connect", e7);
        }
    }

    @Override // n6.o
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f13430c.iterator();
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
    public final Object g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        U3.f fVar = this.f13431d;
        fVar.getClass();
        Method method = fVar.a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = fVar.f9227b;
                kotlin.jvm.internal.l.c(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // n6.o
    public final boolean h(String str) {
        kotlin.jvm.internal.l.f("hostname", str);
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // n6.o
    public final void k(String str, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
        U3.f fVar = this.f13431d;
        fVar.getClass();
        if (obj != null) {
            try {
                Method method = fVar.f9228c;
                kotlin.jvm.internal.l.c(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        o.j(this, str, 4);
    }
}
