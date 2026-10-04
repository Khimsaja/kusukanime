package o6;

import java.util.List;
import javax.net.ssl.SSLSocket;
import n6.o;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements m {
    public static final i a = new i();

    @Override // o6.m
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // o6.m
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // o6.m
    public final boolean c() {
        boolean z7 = n6.h.f13440d;
        return n6.h.f13440d;
    }

    @Override // o6.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            o oVar = o.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) R1.i.l(list).toArray(new String[0]));
        }
    }
}
