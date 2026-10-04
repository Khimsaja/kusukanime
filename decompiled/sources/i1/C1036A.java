package i1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.kusukanime.R;
import s1.InterpolatorC1972a;
import v.n0;

/* renamed from: i1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1036A extends AbstractC1039D {

    /* renamed from: d, reason: collision with root package name */
    public static final PathInterpolator f11933d = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final InterpolatorC1972a f11934e = new InterpolatorC1972a(InterpolatorC1972a.f15506c);

    /* renamed from: f, reason: collision with root package name */
    public static final DecelerateInterpolator f11935f = new DecelerateInterpolator();

    public static void d(View view, C1040E c1040e) {
        v.P pI = i(view);
        if (pI != null) {
            pI.b(c1040e);
            if (pI.f16402l == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                d(viewGroup.getChildAt(i7), c1040e);
            }
        }
    }

    public static void e(View view, WindowInsets windowInsets, boolean z7) {
        v.P pI = i(view);
        if (pI != null) {
            pI.f16401k = windowInsets;
            if (!z7) {
                z7 = true;
                pI.f16404n = true;
                pI.f16405o = true;
                if (pI.f16402l != 0) {
                    z7 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                e(viewGroup.getChildAt(i7), windowInsets, z7);
            }
        }
    }

    public static void f(View view, S s7) {
        v.P pI = i(view);
        if (pI != null) {
            n0 n0Var = pI.f16403m;
            n0.a(n0Var, s7);
            if (n0Var.f16488s) {
                s7 = S.f11964b;
            }
            if (pI.f16402l == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                f(viewGroup.getChildAt(i7), s7);
            }
        }
    }

    public static void g(View view) {
        v.P pI = i(view);
        if (pI != null) {
            pI.f16404n = false;
            if (pI.f16402l == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                g(viewGroup.getChildAt(i7));
            }
        }
    }

    public static WindowInsets h(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static v.P i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof z) {
            return ((z) tag).a;
        }
        return null;
    }
}
