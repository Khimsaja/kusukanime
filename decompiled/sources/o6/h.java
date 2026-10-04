package o6;

import java.util.List;
import javax.net.ssl.SSLSocket;
import n6.o;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements m {
    public static final g a = new g();

    @Override // o6.m
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // o6.m
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // o6.m
    public final boolean c() {
        boolean z7 = n6.e.f13438d;
        return n6.e.f13438d;
    }

    @Override // o6.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            o oVar = o.a;
            parameters.setApplicationProtocols((String[]) R1.i.l(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
