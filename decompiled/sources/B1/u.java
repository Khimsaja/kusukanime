package B1;

import android.graphics.Insets;
import android.media.RouteDiscoveryPreference;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder g(j3.G g4) {
        return new RouteDiscoveryPreference.Builder(g4, false);
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds j(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation k(int i7, Interpolator interpolator, long j7) {
        return new WindowInsetsAnimation(i7, interpolator, j7);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation l(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void n() {
    }
}
