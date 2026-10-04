package e1;

import android.graphics.drawable.Icon;
import android.os.Handler;
import android.os.Looper;
import android.view.DisplayCutout;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0817a {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static int b(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static int c(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
