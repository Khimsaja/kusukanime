package n6;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.net.ssl.OpenJSSE;

/* loaded from: classes.dex */
public final class n extends o {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f13457d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f13458c = new OpenJSSE();

    static {
        boolean z7 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, m.class.getClassLoader());
            z7 = true;
        } catch (ClassNotFoundException unused) {
        }
        f13457d = z7;
    }

    @Override // n6.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
    }

    @Override // n6.o
    public final String f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // n6.o
    public final SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f13458c);
        kotlin.jvm.internal.l.e("getInstance(\"TLSv1.3\", provider)", sSLContext);
        return sSLContext;
    }

    @Override // n6.o
    public final X509TrustManager n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f13458c);
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
}
