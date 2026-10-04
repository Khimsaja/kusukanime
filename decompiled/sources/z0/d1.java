package z0;

import O.C0522v0;
import android.view.View;

/* loaded from: classes.dex */
public final class d1 implements View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f18746k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0522v0 f18747l;

    public d1(View view, C0522v0 c0522v0) {
        this.f18746k = view;
        this.f18747l = c0522v0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f18746k.removeOnAttachStateChangeListener(this);
        this.f18747l.s();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
