package i1;

import D6.RunnableC0131z;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: i1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1054g implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public final View f11973k;

    /* renamed from: l, reason: collision with root package name */
    public ViewTreeObserver f11974l;

    /* renamed from: m, reason: collision with root package name */
    public final RunnableC0131z f11975m;

    public ViewTreeObserverOnPreDrawListenerC1054g(View view, RunnableC0131z runnableC0131z) {
        this.f11973k = view;
        this.f11974l = view.getViewTreeObserver();
        this.f11975m = runnableC0131z;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f11974l.isAlive();
        View view = this.f11973k;
        if (zIsAlive) {
            this.f11974l.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f11975m.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f11974l = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f11974l.isAlive();
        View view2 = this.f11973k;
        if (zIsAlive) {
            this.f11974l.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
