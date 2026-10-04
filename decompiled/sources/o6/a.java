package o6;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import n6.o;

/* loaded from: classes.dex */
public final class a implements m {
    @Override // o6.m
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // o6.m
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // o6.m
    public final boolean c() {
        o oVar = o.a;
        return R1.i.r() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // o6.m
    public final void d(SSLSocket sSLSocket, String str, List list) throws IOException {
        kotlin.jvm.internal.l.f("protocols", list);
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            o oVar = o.a;
            sSLParameters.setApplicationProtocols((String[]) R1.i.l(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e7) {
            throw new IOException("Android internal error", e7);
        }
    }
}
