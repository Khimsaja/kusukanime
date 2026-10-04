package T1;

import B1.AbstractC0015b;
import B1.K;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class u implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final u f8960o = new u();

    /* renamed from: k, reason: collision with root package name */
    public volatile long f8961k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f8962l;

    /* renamed from: m, reason: collision with root package name */
    public Choreographer f8963m;

    /* renamed from: n, reason: collision with root package name */
    public int f8964n;

    public u() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i7 = K.a;
        Handler handler = new Handler(looper, this);
        this.f8962l = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.f8961k = j7;
        Choreographer choreographer = this.f8963m;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 1) {
            try {
                this.f8963m = Choreographer.getInstance();
            } catch (RuntimeException e7) {
                AbstractC0015b.w("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e7);
            }
            return true;
        }
        if (i7 == 2) {
            Choreographer choreographer = this.f8963m;
            if (choreographer != null) {
                int i8 = this.f8964n + 1;
                this.f8964n = i8;
                if (i8 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i7 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f8963m;
        if (choreographer2 != null) {
            int i9 = this.f8964n - 1;
            this.f8964n = i9;
            if (i9 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f8961k = -9223372036854775807L;
            }
        }
        return true;
    }
}
