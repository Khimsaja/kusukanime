package c;

import android.app.Activity;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import f.C0840a;

/* loaded from: classes.dex */
public abstract class h {
    public static OnBackInvokedDispatcher a(Activity activity) {
        kotlin.jvm.internal.l.f("activity", activity);
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        kotlin.jvm.internal.l.e("activity.getOnBackInvokedDispatcher()", onBackInvokedDispatcher);
        return onBackInvokedDispatcher;
    }

    public static Object b(String str, Bundle bundle) {
        return bundle.getParcelable(str, C0840a.class);
    }

    public static String c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void e(Object obj, Object obj2) {
        kotlin.jvm.internal.l.f("dispatcher", obj);
        kotlin.jvm.internal.l.f("callback", obj2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
    }

    public static void f(Object obj, Object obj2) {
        kotlin.jvm.internal.l.f("dispatcher", obj);
        kotlin.jvm.internal.l.f("callback", obj2);
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
