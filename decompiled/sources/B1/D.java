package B1;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class D {
    public static final D a = new D();

    public final F a(Looper looper, Handler.Callback callback) {
        return new F(new Handler(looper, callback));
    }
}
