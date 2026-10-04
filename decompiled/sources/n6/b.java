package n6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements s6.d {
    public final X509TrustManager a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f13428b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.a = x509TrustManager;
        this.f13428b = method;
    }

    @Override // s6.d
    public final X509Certificate a(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = this.f13428b.invoke(this.a, x509Certificate);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.security.cert.TrustAnchor", objInvoke);
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e7) {
            throw new AssertionError("unable to get issues and signature", e7);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.l.a(this.a, bVar.a) && kotlin.jvm.internal.l.a(this.f13428b, bVar.f13428b);
    }

    public final int hashCode() {
        return this.f13428b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.f13428b + ')';
    }
}
