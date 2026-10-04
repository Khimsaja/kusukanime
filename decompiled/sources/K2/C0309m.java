package K2;

import android.animation.ValueAnimator;

/* renamed from: K2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309m implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C0310n a;

    public C0309m(C0310n c0310n) {
        this.a = c0310n;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0310n c0310n = this.a;
        c0310n.f4626c.setAlpha(iFloatValue);
        c0310n.f4627d.setAlpha(iFloatValue);
        c0310n.f4642s.invalidate();
    }
}
