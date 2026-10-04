package f1;

import android.graphics.Insets;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0868a {
    public static void a(int i7) {
        SdkExtensions.getExtensionVersion(i7);
    }

    public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets c(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void d(Window window, boolean z7) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z7 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z7);
    }

    public static void e(Window window, boolean z7) {
        window.setDecorFitsSystemWindows(z7);
    }

    public static void f(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void g(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
