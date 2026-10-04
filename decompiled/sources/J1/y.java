package J1;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Executor {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4288k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4289l;

    public /* synthetic */ y(int i7, Object obj) {
        this.f4288k = i7;
        this.f4289l = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        switch (this.f4288k) {
            case 0:
                ((Handler) this.f4289l).post(runnable);
                break;
            default:
                ((Choreographer) this.f4289l).postFrameCallback(new Choreographer.FrameCallback() { // from class: N0.A
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j7) {
                        runnable.run();
                    }
                });
                break;
        }
    }
}
