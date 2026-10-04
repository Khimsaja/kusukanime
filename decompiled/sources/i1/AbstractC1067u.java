package i1;

import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.kusukanime.R;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* renamed from: i1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1067u {
    public static Field a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f11985b = false;

    static {
        new WeakHashMap();
    }

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return r.a(view);
        }
        if (f11985b) {
            return null;
        }
        if (a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f11985b = true;
                return null;
            }
        }
        try {
            Object obj = a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f11985b = true;
            return null;
        }
    }

    public static void b(View view, C1049b c1049b) {
        if (c1049b == null && (a(view) instanceof C1048a)) {
            c1049b = new C1049b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c1049b == null ? null : c1049b.f11968b);
    }

    public static void c(View view, v.P p7) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(p7 != null ? new C1037B(p7) : null);
            return;
        }
        PathInterpolator pathInterpolator = C1036A.f11933d;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (p7 == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener zVar = new z(view, p7);
        view.setTag(R.id.tag_window_insets_animation_callback, zVar);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(zVar);
        }
    }
}
