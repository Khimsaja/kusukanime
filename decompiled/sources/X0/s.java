package X0;

import L.N0;
import P3.F;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.J;
import com.kusukanime.R;
import e4.InterfaceC0821a;
import f.AbstractC0841b;
import java.util.UUID;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class s extends c.o {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0821a f9734n;

    /* renamed from: o, reason: collision with root package name */
    public q f9735o;

    /* renamed from: p, reason: collision with root package name */
    public final View f9736p;

    /* renamed from: q, reason: collision with root package name */
    public final p f9737q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9738r;

    public s(InterfaceC0821a interfaceC0821a, q qVar, View view, T0.k kVar, T0.b bVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), (Build.VERSION.SDK_INT >= 31 || qVar.f9733d) ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme));
        this.f9734n = interfaceC0821a;
        this.f9735o = qVar;
        this.f9736p = view;
        float f5 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.f9738r = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC0841b.p(window, this.f9735o.f9733d);
        p pVar = new p(getContext(), window);
        pVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        pVar.setClipChildren(false);
        pVar.setElevation(bVar.x(f5));
        pVar.setOutlineProvider(new N0(1));
        this.f9737q = pVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(pVar);
        J.i(pVar, J.e(view));
        pVar.setTag(R.id.view_tree_view_model_store_owner, J.f(view));
        pVar.setTag(R.id.view_tree_saved_state_registry_owner, android.support.v4.media.session.b.t(view));
        g(this.f9734n, this.f9735o, kVar);
        F.g(this.f11090m, this, new a(this, 1));
    }

    public static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof p) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    public final void g(InterfaceC0821a interfaceC0821a, q qVar, T0.k kVar) {
        Window window;
        this.f9734n = interfaceC0821a;
        this.f9735o = qVar;
        qVar.getClass();
        boolean zB = k.b(this.f9736p);
        int i7 = 1;
        int iB = AbstractC1755i.b(1);
        if (iB != 0) {
            if (iB == 1) {
                zB = true;
            } else {
                if (iB != 2) {
                    throw new D6.r();
                }
                zB = false;
            }
        }
        Window window2 = getWindow();
        kotlin.jvm.internal.l.c(window2);
        window2.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal = kVar.ordinal();
        if (iOrdinal == 0) {
            i7 = 0;
        } else if (iOrdinal != 1) {
            throw new D6.r();
        }
        p pVar = this.f9737q;
        pVar.setLayoutDirection(i7);
        boolean z7 = qVar.f9732c;
        if (z7 && !pVar.f9729u && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        pVar.f9729u = z7;
        if (Build.VERSION.SDK_INT < 31) {
            if (qVar.f9733d) {
                Window window3 = getWindow();
                if (window3 != null) {
                    window3.setSoftInputMode(this.f9738r);
                    return;
                }
                return;
            }
            Window window4 = getWindow();
            if (window4 != null) {
                window4.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent && this.f9735o.f9731b) {
            this.f9734n.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
