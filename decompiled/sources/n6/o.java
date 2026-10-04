package n6;

import f.AbstractC0847h;
import io.ktor.http.ContentType;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class o {
    public static volatile o a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f13459b;

    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    static {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.o.<clinit>():void");
    }

    public static void i(String str, int i7, Throwable th) {
        kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
        f13459b.log(i7 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public static /* synthetic */ void j(o oVar, String str, int i7) {
        int i8 = (i7 & 2) != 0 ? 4 : 5;
        oVar.getClass();
        i(str, i8, null);
    }

    public AbstractC0847h b(X509TrustManager x509TrustManager) {
        return new s6.a(c(x509TrustManager));
    }

    public s6.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        kotlin.jvm.internal.l.e("trustManager.acceptedIssuers", acceptedIssuers);
        return new s6.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i7) throws IOException {
        kotlin.jvm.internal.l.f("address", inetSocketAddress);
        socket.connect(inetSocketAddress, i7);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f13459b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        kotlin.jvm.internal.l.f("hostname", str);
        return true;
    }

    public void k(String str, Object obj) {
        kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        kotlin.jvm.internal.l.e("getInstance(\"TLS\")", sSLContext);
        return sSLContext;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) throws KeyManagementException {
        try {
            SSLContext sSLContextL = l();
            sSLContextL.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
            kotlin.jvm.internal.l.e("newSSLContext().apply {\n…ll)\n      }.socketFactory", socketFactory);
            return socketFactory;
        } catch (GeneralSecurityException e7) {
            throw new AssertionError("No System TLS: " + e7, e7);
        }
    }

    public X509TrustManager n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.l.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type javax.net.ssl.X509TrustManager", trustManager);
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        kotlin.jvm.internal.l.e("toString(this)", string);
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
