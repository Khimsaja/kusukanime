package i;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import com.kusukanime.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import m.C1492m;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static b f11858d;
    public final WeakHashMap a = new WeakHashMap(0);

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f11859b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11860c;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        new LinkedHashMap(0, 0.75f, true);
    }

    public static synchronized b a() {
        try {
            if (f11858d == null) {
                f11858d = new b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11858d;
    }

    public final synchronized Drawable b(Context context, long j7) {
        C1492m c1492m = (C1492m) this.a.get(context);
        if (c1492m == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c1492m.b(j7);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c1492m.e(j7);
        }
        return null;
    }

    public final synchronized Drawable c(Context context, int i7) {
        return d(context, i7);
    }

    public final synchronized Drawable d(Context context, int i7) {
        Drawable drawableB;
        if (!this.f11860c) {
            this.f11860c = true;
            Drawable drawableC = c(context, R.drawable.abc_vector_test);
            if (drawableC == null || (!(drawableC instanceof P2.a) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                this.f11860c = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        if (this.f11859b == null) {
            this.f11859b = new TypedValue();
        }
        context.getResources().getValue(i7, this.f11859b, true);
        drawableB = b(context, (r0.assetCookie << 32) | r0.data);
        if (drawableB == null) {
            drawableB = null;
        }
        if (drawableB == null) {
            drawableB = context.getDrawable(i7);
        }
        if (drawableB != null) {
            synchronized (this) {
            }
        }
        if (drawableB != null) {
            int[] iArr = a.a;
            String name = drawableB.getClass().getName();
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 29 && i8 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                int[] state = drawableB.getState();
                if (state == null || state.length == 0) {
                    drawableB.setState(a.a);
                } else {
                    drawableB.setState(a.f11857b);
                }
                drawableB.setState(state);
            }
        }
        return drawableB;
    }
}
