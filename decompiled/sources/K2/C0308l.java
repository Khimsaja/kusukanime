package K2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: K2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308l extends AnimatorListenerAdapter {
    public boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0310n f4620b;

    public C0308l(C0310n c0310n) {
        this.f4620b = c0310n;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        C0310n c0310n = this.f4620b;
        if (((Float) c0310n.f4649z.getAnimatedValue()).floatValue() == 0.0f) {
            c0310n.f4623A = 0;
            c0310n.d(0);
        } else {
            c0310n.f4623A = 2;
            c0310n.f4642s.invalidate();
        }
    }
}
