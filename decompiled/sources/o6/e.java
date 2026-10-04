package o6;

import javax.net.ssl.SSLSocket;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class e implements k {
    @Override // o6.k
    public final boolean a(SSLSocket sSLSocket) {
        return AbstractC2517v.T(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // o6.k
    public final m b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new f(superclass);
    }
}
