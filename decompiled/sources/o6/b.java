package o6;

import android.net.http.X509TrustManagerExtensions;
import f.AbstractC0847h;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends AbstractC0847h {
    public final X509TrustManager a;

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManagerExtensions f13820b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.a = x509TrustManager;
        this.f13820b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).a == this.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // f.AbstractC0847h
    public final List j(String str, List list) throws CertificateException, SSLPeerUnverifiedException {
        kotlin.jvm.internal.l.f("chain", list);
        kotlin.jvm.internal.l.f("hostname", str);
        try {
            List<X509Certificate> listCheckServerTrusted = this.f13820b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            kotlin.jvm.internal.l.e("x509TrustManagerExtensio…ficates, \"RSA\", hostname)", listCheckServerTrusted);
            return listCheckServerTrusted;
        } catch (CertificateException e7) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e7.getMessage());
            sSLPeerUnverifiedException.initCause(e7);
            throw sSLPeerUnverifiedException;
        }
    }
}
