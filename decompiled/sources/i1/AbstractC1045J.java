package i1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import d1.C0782a;
import e1.AbstractC0817a;
import f.AbstractC0847h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: i1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1045J extends P {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f11948h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f11949i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f11950j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f11951k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f11952l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f11953c;

    /* renamed from: d, reason: collision with root package name */
    public C0782a[] f11954d;

    /* renamed from: e, reason: collision with root package name */
    public C0782a f11955e;

    /* renamed from: f, reason: collision with root package name */
    public S f11956f;

    /* renamed from: g, reason: collision with root package name */
    public C0782a f11957g;

    public AbstractC1045J(S s7, WindowInsets windowInsets) {
        super(s7);
        this.f11955e = null;
        this.f11953c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private C0782a s(int i7, boolean z7) {
        C0782a c0782aA = C0782a.f11199e;
        for (int i8 = 1; i8 <= 256; i8 <<= 1) {
            if ((i7 & i8) != 0) {
                c0782aA = C0782a.a(c0782aA, t(i8, z7));
            }
        }
        return c0782aA;
    }

    private C0782a u() {
        S s7 = this.f11956f;
        return s7 != null ? s7.a.i() : C0782a.f11199e;
    }

    private C0782a v(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f11948h) {
            x();
        }
        Method method = f11949i;
        if (method != null && f11950j != null && f11951k != null) {
            try {
                Object objInvoke = method.invoke(view, new Object[0]);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f11951k.get(f11952l.get(objInvoke));
                if (rect != null) {
                    return C0782a.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e7) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void x() throws ClassNotFoundException, SecurityException {
        try {
            f11949i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f11950j = cls;
            f11951k = cls.getDeclaredField("mVisibleInsets");
            f11952l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f11951k.setAccessible(true);
            f11952l.setAccessible(true);
        } catch (ReflectiveOperationException e7) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
        }
        f11948h = true;
    }

    @Override // i1.P
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C0782a c0782aV = v(view);
        if (c0782aV == null) {
            c0782aV = C0782a.f11199e;
        }
        y(c0782aV);
    }

    @Override // i1.P
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f11957g, ((AbstractC1045J) obj).f11957g);
        }
        return false;
    }

    @Override // i1.P
    public C0782a f(int i7) {
        return s(i7, false);
    }

    @Override // i1.P
    public C0782a g(int i7) {
        return s(i7, true);
    }

    @Override // i1.P
    public final C0782a k() {
        if (this.f11955e == null) {
            WindowInsets windowInsets = this.f11953c;
            this.f11955e = C0782a.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f11955e;
    }

    @Override // i1.P
    public boolean n() {
        return this.f11953c.isRound();
    }

    @Override // i1.P
    @SuppressLint({"WrongConstant"})
    public boolean o(int i7) {
        for (int i8 = 1; i8 <= 256; i8 <<= 1) {
            if ((i7 & i8) != 0 && !w(i8)) {
                return false;
            }
        }
        return true;
    }

    @Override // i1.P
    public void p(C0782a[] c0782aArr) {
        this.f11954d = c0782aArr;
    }

    @Override // i1.P
    public void q(S s7) {
        this.f11956f = s7;
    }

    public C0782a t(int i7, boolean z7) {
        C0782a c0782aI;
        int i8;
        if (i7 == 1) {
            return z7 ? C0782a.b(0, Math.max(u().f11200b, k().f11200b), 0, 0) : C0782a.b(0, k().f11200b, 0, 0);
        }
        if (i7 == 2) {
            if (z7) {
                C0782a c0782aU = u();
                C0782a c0782aI2 = i();
                return C0782a.b(Math.max(c0782aU.a, c0782aI2.a), 0, Math.max(c0782aU.f11201c, c0782aI2.f11201c), Math.max(c0782aU.f11202d, c0782aI2.f11202d));
            }
            C0782a c0782aK = k();
            S s7 = this.f11956f;
            c0782aI = s7 != null ? s7.a.i() : null;
            int iMin = c0782aK.f11202d;
            if (c0782aI != null) {
                iMin = Math.min(iMin, c0782aI.f11202d);
            }
            return C0782a.b(c0782aK.a, 0, c0782aK.f11201c, iMin);
        }
        C0782a c0782a = C0782a.f11199e;
        if (i7 == 8) {
            C0782a[] c0782aArr = this.f11954d;
            c0782aI = c0782aArr != null ? c0782aArr[AbstractC0847h.o(8)] : null;
            if (c0782aI != null) {
                return c0782aI;
            }
            C0782a c0782aK2 = k();
            C0782a c0782aU2 = u();
            int i9 = c0782aK2.f11202d;
            if (i9 > c0782aU2.f11202d) {
                return C0782a.b(0, 0, 0, i9);
            }
            C0782a c0782a2 = this.f11957g;
            if (c0782a2 != null && !c0782a2.equals(c0782a) && (i8 = this.f11957g.f11202d) > c0782aU2.f11202d) {
                return C0782a.b(0, 0, 0, i8);
            }
        } else {
            if (i7 == 16) {
                return j();
            }
            if (i7 == 32) {
                return h();
            }
            if (i7 == 64) {
                return l();
            }
            if (i7 == 128) {
                S s8 = this.f11956f;
                C1050c c1050cE = s8 != null ? s8.a.e() : e();
                if (c1050cE != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    return C0782a.b(i10 >= 28 ? AbstractC0817a.d(c1050cE.a) : 0, i10 >= 28 ? AbstractC0817a.f(c1050cE.a) : 0, i10 >= 28 ? AbstractC0817a.e(c1050cE.a) : 0, i10 >= 28 ? AbstractC0817a.c(c1050cE.a) : 0);
                }
            }
        }
        return c0782a;
    }

    public boolean w(int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 8 && i7 != 128) {
                return true;
            }
        }
        return !t(i7, false).equals(C0782a.f11199e);
    }

    public void y(C0782a c0782a) {
        this.f11957g = c0782a;
    }
}
