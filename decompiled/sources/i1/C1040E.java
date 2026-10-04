package i1;

import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: i1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1040E {
    public AbstractC1039D a;

    public C1040E(int i7, Interpolator interpolator, long j7) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new C1038C(B1.u.k(i7, interpolator, j7));
        } else {
            this.a = new C1036A(interpolator, j7);
        }
    }
}
