package o6;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class i implements k {
    @Override // o6.k
    public final boolean a(SSLSocket sSLSocket) {
        return n6.h.f13440d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // o6.k
    public final m b(SSLSocket sSLSocket) {
        return new j();
    }
}
