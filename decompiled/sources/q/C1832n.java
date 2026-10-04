package q;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: q.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1832n {
    public static final C1832n a = new C1832n();

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final float c(EdgeEffect edgeEffect, float f5, float f7) {
        try {
            return edgeEffect.onPullDistance(f5, f7);
        } catch (Throwable unused) {
            edgeEffect.onPull(f5, f7);
            return 0.0f;
        }
    }
}
