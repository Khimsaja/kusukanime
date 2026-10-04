package i1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import d1.C0782a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: i1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041F extends AbstractC1044I {

    /* renamed from: d, reason: collision with root package name */
    public static Field f11941d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f11942e = false;

    /* renamed from: f, reason: collision with root package name */
    public static Constructor f11943f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f11944g = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f11945c;

    public C1041F() {
        this.f11945c = h();
    }

    private static WindowInsets h() {
        if (!f11942e) {
            try {
                f11941d = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f11942e = true;
        }
        Field field = f11941d;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e8);
            }
        }
        if (!f11944g) {
            try {
                f11943f = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e9);
            }
            f11944g = true;
        }
        Constructor constructor = f11943f;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e10);
            }
        }
        return null;
    }

    @Override // i1.AbstractC1044I
    public S b() {
        a();
        S sB = S.b(null, this.f11945c);
        C0782a[] c0782aArr = this.f11947b;
        P p7 = sB.a;
        p7.p(c0782aArr);
        p7.r(null);
        return sB;
    }

    @Override // i1.AbstractC1044I
    public void f(C0782a c0782a) {
        WindowInsets windowInsets = this.f11945c;
        if (windowInsets != null) {
            this.f11945c = windowInsets.replaceSystemWindowInsets(c0782a.a, c0782a.f11200b, c0782a.f11201c, c0782a.f11202d);
        }
    }

    public C1041F(S s7) {
        super(s7);
        this.f11945c = s7.a();
    }
}
