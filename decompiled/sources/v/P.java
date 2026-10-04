package v;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import i1.C1040E;
import i1.InterfaceC1053f;

/* loaded from: classes.dex */
public final class P implements Runnable, InterfaceC1053f, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public WindowInsets f16401k;

    /* renamed from: l, reason: collision with root package name */
    public final int f16402l;

    /* renamed from: m, reason: collision with root package name */
    public final n0 f16403m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16404n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16405o;

    /* renamed from: p, reason: collision with root package name */
    public i1.S f16406p;

    public P(n0 n0Var) {
        this.f16402l = !n0Var.f16488s ? 1 : 0;
        this.f16403m = n0Var;
    }

    public final i1.S a(View view, i1.S s7) {
        this.f16406p = s7;
        n0 n0Var = this.f16403m;
        n0Var.getClass();
        i1.P p7 = s7.a;
        n0Var.f16486q.f(AbstractC2123b.i(p7.f(8)));
        if (this.f16404n) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f16405o) {
            n0Var.f16487r.f(AbstractC2123b.i(p7.f(8)));
            n0.a(n0Var, s7);
        }
        return n0Var.f16488s ? i1.S.f11964b : s7;
    }

    public final void b(C1040E c1040e) {
        this.f16404n = false;
        this.f16405o = false;
        i1.S s7 = this.f16406p;
        if (c1040e.a.a() != 0 && s7 != null) {
            n0 n0Var = this.f16403m;
            n0Var.getClass();
            i1.P p7 = s7.a;
            n0Var.f16487r.f(AbstractC2123b.i(p7.f(8)));
            n0Var.f16486q.f(AbstractC2123b.i(p7.f(8)));
            n0.a(n0Var, s7);
        }
        this.f16406p = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f16404n) {
            this.f16404n = false;
            this.f16405o = false;
            i1.S s7 = this.f16406p;
            if (s7 != null) {
                n0 n0Var = this.f16403m;
                n0Var.getClass();
                n0Var.f16487r.f(AbstractC2123b.i(s7.a.f(8)));
                n0.a(n0Var, s7);
                this.f16406p = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
