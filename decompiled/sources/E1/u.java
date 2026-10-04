package E1;

import f1.AbstractC0871d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class u extends i {

    /* renamed from: m, reason: collision with root package name */
    public final int f1925m;

    public u() {
        super(2008);
        this.f1925m = 1;
    }

    public static u a(int i7, IOException iOException) {
        String message = iOException.getMessage();
        int i8 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC0871d.r0(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i8 == 2007 ? new t("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new u(i8, i7, iOException);
    }

    public u(String str, int i7) {
        super(str, i7 == 2000 ? 2001 : i7);
        this.f1925m = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u(int i7, int i8, IOException iOException) {
        if (i7 == 2000 && i8 == 1) {
            i7 = 2001;
        }
        super(iOException, i7);
        this.f1925m = i8;
    }

    public u(String str, IOException iOException, int i7) {
        super(str, iOException, i7 == 2000 ? 2001 : i7);
        this.f1925m = 1;
    }
}
