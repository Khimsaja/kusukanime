package i1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.kusukanime.R;

/* renamed from: i1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1061n {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void b(View view, InterfaceC1053f interfaceC1053f) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC1053f);
        }
        if (interfaceC1053f == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC1060m(view, interfaceC1053f));
        }
    }

    public static void c(View view) {
        view.stopNestedScroll();
    }
}
