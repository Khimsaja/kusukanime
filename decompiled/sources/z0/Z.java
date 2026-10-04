package z0;

import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Z implements Choreographer.FrameCallback, Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2433a0 f18712k;

    public Z(C2433a0 c2433a0) {
        this.f18712k = c2433a0;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.f18712k.f18725m.removeCallbacks(this);
        C2433a0.a0(this.f18712k);
        C2433a0 c2433a0 = this.f18712k;
        synchronized (c2433a0.f18726n) {
            if (c2433a0.f18731s) {
                c2433a0.f18731s = false;
                ArrayList arrayList = c2433a0.f18728p;
                c2433a0.f18728p = c2433a0.f18729q;
                c2433a0.f18729q = arrayList;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((Choreographer.FrameCallback) arrayList.get(i7)).doFrame(j7);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2433a0.a0(this.f18712k);
        C2433a0 c2433a0 = this.f18712k;
        synchronized (c2433a0.f18726n) {
            if (c2433a0.f18728p.isEmpty()) {
                c2433a0.f18724l.removeFrameCallback(this);
                c2433a0.f18731s = false;
            }
        }
    }
}
