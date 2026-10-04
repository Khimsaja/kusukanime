package i1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import d1.C0782a;
import java.util.Collections;

/* loaded from: classes.dex */
public final class y implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C1040E a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f11990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S f11991c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f11993e;

    public y(C1040E c1040e, S s7, S s8, int i7, View view) {
        this.a = c1040e;
        this.f11990b = s7;
        this.f11991c = s8;
        this.f11992d = i7;
        this.f11993e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f5;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C1040E c1040e = this.a;
        c1040e.a.c(animatedFraction);
        float fB = c1040e.a.b();
        PathInterpolator pathInterpolator = C1036A.f11933d;
        int i7 = Build.VERSION.SDK_INT;
        S s7 = this.f11990b;
        AbstractC1044I c1043h = i7 >= 30 ? new C1043H(s7) : i7 >= 29 ? new C1042G(s7) : new C1041F(s7);
        int i8 = 1;
        while (i8 <= 256) {
            int i9 = this.f11992d & i8;
            P p7 = s7.a;
            if (i9 == 0) {
                c1043h.c(i8, p7.f(i8));
                f5 = fB;
            } else {
                C0782a c0782aF = p7.f(i8);
                C0782a c0782aF2 = this.f11991c.a.f(i8);
                int i10 = c0782aF.a;
                float f7 = 1.0f - fB;
                int i11 = (int) (((i10 - c0782aF2.a) * f7) + 0.5d);
                int i12 = c0782aF2.f11200b;
                int i13 = c0782aF.f11200b;
                f5 = fB;
                int i14 = (int) (((i13 - i12) * f7) + 0.5d);
                int i15 = c0782aF2.f11201c;
                int i16 = c0782aF.f11201c;
                int i17 = (int) (((i16 - i15) * f7) + 0.5d);
                int i18 = c0782aF2.f11202d;
                int i19 = c0782aF.f11202d;
                int i20 = (int) (((i19 - i18) * f7) + 0.5d);
                int iMax = Math.max(0, i10 - i11);
                int iMax2 = Math.max(0, i13 - i14);
                int iMax3 = Math.max(0, i16 - i17);
                int iMax4 = Math.max(0, i19 - i20);
                c1043h.c(i8, (iMax == i11 && iMax2 == i14 && iMax3 == i17 && iMax4 == i20) ? c0782aF : C0782a.b(iMax, iMax2, iMax3, iMax4));
            }
            i8 <<= 1;
            fB = f5;
        }
        S sB = c1043h.b();
        Collections.singletonList(c1040e);
        C1036A.f(this.f11993e, sB);
    }
}
