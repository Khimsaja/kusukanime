package c;

import android.app.ActivityOptions;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.BackEvent;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0739a {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static float e(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static void f(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }

    public static int g(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static float h(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static float i(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
