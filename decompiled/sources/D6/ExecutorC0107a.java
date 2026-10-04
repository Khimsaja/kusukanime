package D6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: D6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0107a implements Executor {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1735k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f1736l;

    public ExecutorC0107a() {
        this.f1735k = 0;
        this.f1736l = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1735k) {
            case 0:
                this.f1736l.post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.f1736l;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public ExecutorC0107a(Handler handler) {
        this.f1735k = 1;
        this.f1736l = handler;
    }
}
