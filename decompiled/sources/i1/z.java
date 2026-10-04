package i1;

import D6.RunnableC0131z;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import d1.C0782a;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z implements View.OnApplyWindowInsetsListener {
    public final v.P a;

    /* renamed from: b, reason: collision with root package name */
    public S f11994b;

    public z(View view, v.P p7) {
        S sB;
        this.a = p7;
        Field field = AbstractC1067u.a;
        S sA = AbstractC1062o.a(view);
        if (sA != null) {
            int i7 = Build.VERSION.SDK_INT;
            sB = (i7 >= 30 ? new C1043H(sA) : i7 >= 29 ? new C1042G(sA) : new C1041F(sA)).b();
        } else {
            sB = null;
        }
        this.f11994b = sB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        P p7;
        if (!view.isLaidOut()) {
            this.f11994b = S.b(view, windowInsets);
            return C1036A.h(view, windowInsets);
        }
        S sB = S.b(view, windowInsets);
        if (this.f11994b == null) {
            Field field = AbstractC1067u.a;
            this.f11994b = AbstractC1062o.a(view);
        }
        if (this.f11994b == null) {
            this.f11994b = sB;
            return C1036A.h(view, windowInsets);
        }
        v.P pI = C1036A.i(view);
        if (pI != null && Objects.equals(pI.f16401k, windowInsets)) {
            return C1036A.h(view, windowInsets);
        }
        S s7 = this.f11994b;
        int i7 = 1;
        int i8 = 0;
        while (true) {
            p7 = sB.a;
            if (i7 > 256) {
                break;
            }
            if (!p7.f(i7).equals(s7.a.f(i7))) {
                i8 |= i7;
            }
            i7 <<= 1;
        }
        if (i8 == 0) {
            return C1036A.h(view, windowInsets);
        }
        S s8 = this.f11994b;
        C1040E c1040e = new C1040E(i8, (i8 & 8) != 0 ? p7.f(8).f11202d > s8.a.f(8).f11202d ? C1036A.f11933d : C1036A.f11934e : C1036A.f11935f, 160L);
        c1040e.a.c(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1040e.a.a());
        C0782a c0782aF = p7.f(i8);
        C0782a c0782aF2 = s8.a.f(i8);
        int iMin = Math.min(c0782aF.a, c0782aF2.a);
        int i9 = c0782aF.f11200b;
        int i10 = c0782aF2.f11200b;
        int iMin2 = Math.min(i9, i10);
        int i11 = c0782aF.f11201c;
        int i12 = c0782aF2.f11201c;
        int iMin3 = Math.min(i11, i12);
        int i13 = c0782aF.f11202d;
        int i14 = c0782aF2.f11202d;
        int i15 = i8;
        L2.e eVar = new L2.e(25, C0782a.b(iMin, iMin2, iMin3, Math.min(i13, i14)), C0782a.b(Math.max(c0782aF.a, c0782aF2.a), Math.max(i9, i10), Math.max(i11, i12), Math.max(i13, i14)));
        C1036A.e(view, windowInsets, false);
        duration.addUpdateListener(new y(c1040e, sB, s8, i15, view));
        duration.addListener(new F2.x(view, c1040e));
        ViewTreeObserverOnPreDrawListenerC1054g viewTreeObserverOnPreDrawListenerC1054g = new ViewTreeObserverOnPreDrawListenerC1054g(view, new RunnableC0131z(view, c1040e, eVar, duration));
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1054g);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1054g);
        this.f11994b = sB;
        return C1036A.h(view, windowInsets);
    }
}
