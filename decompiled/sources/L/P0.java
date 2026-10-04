package L;

import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.kusukanime.R;
import e4.InterfaceC0821a;
import f.AbstractC0841b;
import f1.AbstractC0870c;
import java.util.UUID;
import p.C1743c;

/* loaded from: classes.dex */
public final class P0 extends c.o {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0821a f5293n;

    /* renamed from: o, reason: collision with root package name */
    public C0385j1 f5294o;

    /* renamed from: p, reason: collision with root package name */
    public final View f5295p;

    /* renamed from: q, reason: collision with root package name */
    public final M0 f5296q;

    public P0(InterfaceC0821a interfaceC0821a, C0385j1 c0385j1, View view, T0.k kVar, T0.b bVar, UUID uuid, C1743c c1743c, M5.c cVar, boolean z7) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme));
        this.f5293n = interfaceC0821a;
        this.f5294o = c0385j1;
        this.f5295p = view;
        float f5 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC0841b.p(window, false);
        Context context = getContext();
        this.f5294o.getClass();
        M0 m02 = new M0(context, window, this.f5293n, c1743c, cVar);
        m02.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        m02.setClipChildren(false);
        m02.setElevation(bVar.x(f5));
        m02.setOutlineProvider(new N0(0));
        this.f5296q = m02;
        setContentView(m02);
        androidx.lifecycle.J.i(m02, androidx.lifecycle.J.e(view));
        m02.setTag(R.id.view_tree_view_model_store_owner, androidx.lifecycle.J.f(view));
        m02.setTag(R.id.view_tree_saved_state_registry_owner, android.support.v4.media.session.b.t(view));
        e(this.f5293n, this.f5294o, kVar);
        X4.y yVar = new X4.y(window.getDecorView());
        int i7 = Build.VERSION.SDK_INT;
        AbstractC0870c v5 = i7 >= 35 ? new i1.V(window, yVar, 1) : i7 >= 30 ? new i1.T(window, yVar, 1) : i7 >= 26 ? new i1.U(window, yVar, 0) : new i1.T(window, yVar, 0);
        boolean z8 = !z7;
        v5.e0(z8);
        v5.d0(z8);
        P3.F.g(this.f11090m, this, new O0(this, 0));
    }

    public final void e(InterfaceC0821a interfaceC0821a, C0385j1 c0385j1, T0.k kVar) {
        this.f5293n = interfaceC0821a;
        this.f5294o = c0385j1;
        c0385j1.getClass();
        ViewGroup.LayoutParams layoutParams = this.f5295p.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i7 = 0;
        boolean z7 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        Window window = getWindow();
        kotlin.jvm.internal.l.c(window);
        window.setFlags(z7 ? 8192 : -8193, 8192);
        int iOrdinal = kVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new D6.r();
            }
            i7 = 1;
        }
        this.f5296q.setLayoutDirection(i7);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f5293n.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
