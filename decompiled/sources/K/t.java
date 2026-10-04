package K;

import P3.F;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import e4.InterfaceC0821a;
import h0.AbstractC0968M;
import h0.C0998u;

/* loaded from: classes.dex */
public final class t extends View {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f4416p = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f4417q = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public E f4418k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f4419l;

    /* renamed from: m, reason: collision with root package name */
    public Long f4420m;

    /* renamed from: n, reason: collision with root package name */
    public B1.w f4421n;

    /* renamed from: o, reason: collision with root package name */
    public kotlin.jvm.internal.m f4422o;

    private final void setRippleState(boolean z7) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f4421n;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l7 = this.f4420m;
        long jLongValue = jCurrentAnimationTimeMillis - (l7 != null ? l7.longValue() : 0L);
        if (z7 || jLongValue >= 5) {
            int[] iArr = z7 ? f4416p : f4417q;
            E e7 = this.f4418k;
            if (e7 != null) {
                e7.setState(iArr);
            }
        } else {
            B1.w wVar = new B1.w(9, this);
            this.f4421n = wVar;
            postDelayed(wVar, 50L);
        }
        this.f4420m = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(t tVar) {
        E e7 = tVar.f4418k;
        if (e7 != null) {
            e7.setState(f4417q);
        }
        tVar.f4421n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(u.m mVar, boolean z7, long j7, int i7, long j8, float f5, InterfaceC0821a interfaceC0821a) {
        if (this.f4418k == null || !Boolean.valueOf(z7).equals(this.f4419l)) {
            E e7 = new E(z7);
            setBackground(e7);
            this.f4418k = e7;
            this.f4419l = Boolean.valueOf(z7);
        }
        E e8 = this.f4418k;
        kotlin.jvm.internal.l.c(e8);
        this.f4422o = (kotlin.jvm.internal.m) interfaceC0821a;
        Integer num = e8.f4355m;
        if (num == null || num.intValue() != i7) {
            e8.f4355m = Integer.valueOf(i7);
            D.a.a(e8, i7);
        }
        e(f5, j7, j8);
        if (z7) {
            e8.setHotspot(g0.c.d(mVar.a), g0.c.e(mVar.a));
        } else {
            e8.setHotspot(e8.getBounds().centerX(), e8.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f4422o = null;
        B1.w wVar = this.f4421n;
        if (wVar != null) {
            removeCallbacks(wVar);
            B1.w wVar2 = this.f4421n;
            kotlin.jvm.internal.l.c(wVar2);
            wVar2.run();
        } else {
            E e7 = this.f4418k;
            if (e7 != null) {
                e7.setState(f4417q);
            }
        }
        E e8 = this.f4418k;
        if (e8 == null) {
            return;
        }
        e8.setVisible(false, false);
        unscheduleDrawable(e8);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(float f5, long j7, long j8) {
        E e7 = this.f4418k;
        if (e7 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f5 *= 2;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        long jB = C0998u.b(f5, j8);
        C0998u c0998u = e7.f4354l;
        if (!(c0998u == null ? false : C0998u.c(c0998u.a, jB))) {
            e7.f4354l = new C0998u(jB);
            e7.setColor(ColorStateList.valueOf(AbstractC0968M.w(jB)));
        }
        Rect rect = new Rect(0, 0, F.W(g0.f.d(j7)), F.W(g0.f.b(j7)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        e7.setBounds(rect);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e4.a, kotlin.jvm.internal.m] */
    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ?? r12 = this.f4422o;
        if (r12 != 0) {
            r12.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
    }
}
