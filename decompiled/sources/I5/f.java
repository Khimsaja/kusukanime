package I5;

import O3.n;
import P3.r;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class f {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objR;
        try {
            objR = new e(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            objR = r.r(th);
        }
        if (objR instanceof n) {
            objR = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            l.d("null cannot be cast to non-null type android.os.Handler", objInvoke);
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
