package K2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: K2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302f extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0303g f4589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4590c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f4591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0305i f4592e;

    public /* synthetic */ C0302f(C0305i c0305i, C0303g c0303g, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.a = i7;
        this.f4592e = c0305i;
        this.f4589b = c0303g;
        this.f4590c = viewPropertyAnimator;
        this.f4591d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.f4590c.setListener(null);
                View view = this.f4591d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0303g c0303g = this.f4589b;
                W w7 = c0303g.a;
                C0305i c0305i = this.f4592e;
                c0305i.c(w7);
                c0305i.f4617r.remove(c0303g.a);
                c0305i.i();
                break;
            default:
                this.f4590c.setListener(null);
                View view2 = this.f4591d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0303g c0303g2 = this.f4589b;
                W w8 = c0303g2.f4596b;
                C0305i c0305i2 = this.f4592e;
                c0305i2.c(w8);
                c0305i2.f4617r.remove(c0303g2.f4596b);
                c0305i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                W w7 = this.f4589b.a;
                this.f4592e.getClass();
                break;
            default:
                W w8 = this.f4589b.f4596b;
                this.f4592e.getClass();
                break;
        }
    }
}
