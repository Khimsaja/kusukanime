package c;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: k, reason: collision with root package name */
    public final long f11057k = SystemClock.uptimeMillis() + 10000;

    /* renamed from: l, reason: collision with root package name */
    public Runnable f11058l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11059m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f11060n;

    public k(n nVar) {
        this.f11060n = nVar;
    }

    public final void a(View view) {
        if (this.f11059m) {
            return;
        }
        this.f11059m = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.l.f("runnable", runnable);
        this.f11058l = runnable;
        View decorView = this.f11060n.getWindow().getDecorView();
        kotlin.jvm.internal.l.e("window.decorView", decorView);
        if (!this.f11059m) {
            decorView.postOnAnimation(new B1.w(16, this));
        } else if (kotlin.jvm.internal.l.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z7;
        Runnable runnable = this.f11058l;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f11057k) {
                this.f11059m = false;
                this.f11060n.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f11058l = null;
        p pVar = (p) this.f11060n.f11078q.getValue();
        synchronized (pVar.a) {
            z7 = pVar.f11091b;
        }
        if (z7) {
            this.f11059m = false;
            this.f11060n.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11060n.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
