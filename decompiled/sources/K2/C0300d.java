package K2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: K2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300d extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f4570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f4571c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0305i f4573e;

    public C0300d(C0305i c0305i, W w7, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4573e = c0305i;
        this.f4570b = w7;
        this.f4572d = viewPropertyAnimator;
        this.f4571c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.f4571c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.f4572d.setListener(null);
                this.f4571c.setAlpha(1.0f);
                C0305i c0305i = this.f4573e;
                W w7 = this.f4570b;
                c0305i.c(w7);
                c0305i.f4616q.remove(w7);
                c0305i.i();
                break;
            default:
                this.f4572d.setListener(null);
                C0305i c0305i2 = this.f4573e;
                W w8 = this.f4570b;
                c0305i2.c(w8);
                c0305i2.f4614o.remove(w8);
                c0305i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.f4573e.getClass();
                break;
            default:
                this.f4573e.getClass();
                break;
        }
    }

    public C0300d(C0305i c0305i, W w7, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4573e = c0305i;
        this.f4570b = w7;
        this.f4571c = view;
        this.f4572d = viewPropertyAnimator;
    }
}
