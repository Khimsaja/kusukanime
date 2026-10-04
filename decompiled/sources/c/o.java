package c;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.EnumC0688o;
import androidx.lifecycle.InterfaceC0694v;
import androidx.lifecycle.J;
import com.kusukanime.R;

/* loaded from: classes.dex */
public abstract class o extends Dialog implements InterfaceC0694v, y, L2.f {

    /* renamed from: k, reason: collision with root package name */
    public androidx.lifecycle.x f11088k;

    /* renamed from: l, reason: collision with root package name */
    public final L2.e f11089l;

    /* renamed from: m, reason: collision with root package name */
    public final x f11090m;

    public o(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, 0);
        this.f11089l = new L2.e(new M2.a(this, new B3.q(1, this)));
        this.f11090m = new x(new B1.w(18, this));
    }

    public static void c(o oVar) {
        super.onBackPressed();
    }

    @Override // c.y
    public final x a() {
        return this.f11090m;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.l.f("view", view);
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // L2.f
    public final F.w b() {
        return (F.w) this.f11089l.f6046m;
    }

    public final void d() {
        Window window = getWindow();
        kotlin.jvm.internal.l.c(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.l.e("window!!.decorView", decorView);
        J.i(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.l.c(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.l.e("window!!.decorView", decorView2);
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.l.c(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.l.e("window!!.decorView", decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.InterfaceC0694v
    public final AbstractC0690q f() {
        androidx.lifecycle.x xVar = this.f11088k;
        if (xVar != null) {
            return xVar;
        }
        androidx.lifecycle.x xVar2 = new androidx.lifecycle.x(this);
        this.f11088k = xVar2;
        return xVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f11090m.c();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.l.e("onBackInvokedDispatcher", onBackInvokedDispatcher);
            x xVar = this.f11090m;
            xVar.f11112e = onBackInvokedDispatcher;
            xVar.d(xVar.f11114g);
        }
        this.f11089l.p1(bundle);
        androidx.lifecycle.x xVar2 = this.f11088k;
        if (xVar2 == null) {
            xVar2 = new androidx.lifecycle.x(this);
            this.f11088k = xVar2;
        }
        xVar2.f(EnumC0688o.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.l.e("super.onSaveInstanceState()", bundleOnSaveInstanceState);
        this.f11089l.q1(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.x xVar = this.f11088k;
        if (xVar == null) {
            xVar = new androidx.lifecycle.x(this);
            this.f11088k = xVar;
        }
        xVar.f(EnumC0688o.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        androidx.lifecycle.x xVar = this.f11088k;
        if (xVar == null) {
            xVar = new androidx.lifecycle.x(this);
            this.f11088k = xVar;
        }
        xVar.f(EnumC0688o.ON_DESTROY);
        this.f11088k = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(int i7) {
        d();
        super.setContentView(i7);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        kotlin.jvm.internal.l.f("view", view);
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.l.f("view", view);
        d();
        super.setContentView(view, layoutParams);
    }
}
