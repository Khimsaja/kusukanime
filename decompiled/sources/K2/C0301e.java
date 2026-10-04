package K2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: K2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301e extends AnimatorListenerAdapter {
    public final /* synthetic */ W a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f4581c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0305i f4584f;

    public C0301e(C0305i c0305i, W w7, int i7, View view, int i8, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4584f = c0305i;
        this.a = w7;
        this.f4580b = i7;
        this.f4581c = view;
        this.f4582d = i8;
        this.f4583e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i7 = this.f4580b;
        View view = this.f4581c;
        if (i7 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f4582d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4583e.setListener(null);
        C0305i c0305i = this.f4584f;
        W w7 = this.a;
        c0305i.c(w7);
        c0305i.f4615p.remove(w7);
        c0305i.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4584f.getClass();
    }
}
