package m1;

import android.widget.EdgeEffect;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1509b {
    public static float a(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float b(EdgeEffect edgeEffect, float f5, float f7) {
        try {
            return edgeEffect.onPullDistance(f5, f7);
        } catch (Throwable unused) {
            edgeEffect.onPull(f5, f7);
            return 0.0f;
        }
    }
}
