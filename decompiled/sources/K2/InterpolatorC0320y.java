package K2;

import android.view.animation.Interpolator;

/* renamed from: K2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class InterpolatorC0320y implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        float f7 = f5 - 1.0f;
        return (f7 * f7 * f7 * f7 * f7) + 1.0f;
    }
}
