package x6;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import w6.C2221f;

/* loaded from: classes.dex */
public final class f extends C2221f {

    /* renamed from: n, reason: collision with root package name */
    public final Socket f17534n;

    public f(Socket socket) {
        this.f17534n = socket;
    }

    @Override // w6.C2221f
    public final void k() throws IOException {
        Socket socket = this.f17534n;
        try {
            socket.close();
        } catch (AssertionError e7) {
            if (!j.a(e7)) {
                throw e7;
            }
            j.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e7);
        } catch (Exception e8) {
            j.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e8);
        }
    }

    public final IOException l(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
