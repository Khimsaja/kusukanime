package X0;

import C2.G;
import D.S;
import L.N0;
import O.C0486d;
import O.C0493g0;
import O.C0509o0;
import O.C0510p;
import O.E;
import O.T;
import P3.F;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.J;
import com.kusukanime.R;
import e4.InterfaceC0821a;
import java.util.UUID;
import l4.AbstractC1420H;
import z0.AbstractC2432a;

/* loaded from: classes.dex */
public final class v extends AbstractC2432a {

    /* renamed from: A, reason: collision with root package name */
    public T0.k f9746A;

    /* renamed from: B, reason: collision with root package name */
    public final C0493g0 f9747B;

    /* renamed from: C, reason: collision with root package name */
    public final C0493g0 f9748C;

    /* renamed from: D, reason: collision with root package name */
    public T0.i f9749D;

    /* renamed from: E, reason: collision with root package name */
    public final E f9750E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f9751F;

    /* renamed from: G, reason: collision with root package name */
    public final Y.u f9752G;

    /* renamed from: H, reason: collision with root package name */
    public Object f9753H;
    public final C0493g0 I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final int[] f9754K;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0821a f9755s;

    /* renamed from: t, reason: collision with root package name */
    public z f9756t;

    /* renamed from: u, reason: collision with root package name */
    public String f9757u;

    /* renamed from: v, reason: collision with root package name */
    public final View f9758v;

    /* renamed from: w, reason: collision with root package name */
    public final x f9759w;

    /* renamed from: x, reason: collision with root package name */
    public final WindowManager f9760x;

    /* renamed from: y, reason: collision with root package name */
    public final WindowManager.LayoutParams f9761y;

    /* renamed from: z, reason: collision with root package name */
    public y f9762z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(InterfaceC0821a interfaceC0821a, z zVar, String str, View view, T0.b bVar, y yVar, UUID uuid) {
        super(view.getContext());
        x wVar = Build.VERSION.SDK_INT >= 29 ? new w() : new x();
        this.f9755s = interfaceC0821a;
        this.f9756t = zVar;
        this.f9757u = str;
        this.f9758v = view;
        this.f9759w = wVar;
        Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.WindowManager", systemService);
        this.f9760x = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        z zVar2 = this.f9756t;
        boolean zB = k.b(view);
        boolean z7 = zVar2.f9763b;
        int i7 = zVar2.a;
        if (z7 && zB) {
            i7 |= 8192;
        } else if (z7 && !zB) {
            i7 &= -8193;
        }
        layoutParams.flags = i7;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f9761y = layoutParams;
        this.f9762z = yVar;
        this.f9746A = T0.k.f8844k;
        T t7 = T.f7049p;
        this.f9747B = C0486d.K(null, t7);
        this.f9748C = C0486d.K(null, t7);
        this.f9750E = C0486d.D(new B.e(21, this));
        this.f9751F = new Rect();
        this.f9752G = new Y.u(new h(this, 2));
        setId(android.R.id.content);
        J.i(this, J.e(view));
        setTag(R.id.view_tree_view_model_store_owner, J.f(view));
        setTag(R.id.view_tree_saved_state_registry_owner, android.support.v4.media.session.b.t(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(bVar.x((float) 8));
        setOutlineProvider(new N0(2));
        this.I = C0486d.K(o.a, t7);
        this.f9754K = new int[2];
    }

    private final e4.n getContent() {
        return (e4.n) this.I.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w0.r getParentLayoutCoordinates() {
        return (w0.r) this.f9748C.getValue();
    }

    private final void setContent(e4.n nVar) {
        this.I.setValue(nVar);
    }

    private final void setParentLayoutCoordinates(w0.r rVar) {
        this.f9748C.setValue(rVar);
    }

    @Override // z0.AbstractC2432a
    public final void b(int i7, C0510p c0510p) {
        c0510p.T(-857613600);
        if ((((c0510p.h(this) ? 4 : 2) | i7) & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            getContent().invoke(c0510p, 0);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new S(i7, 13, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f9756t.f9764c) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC0821a interfaceC0821a = this.f9755s;
                if (interfaceC0821a != null) {
                    interfaceC0821a.invoke();
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // z0.AbstractC2432a
    public final void g(boolean z7, int i7, int i8, int i9, int i10) {
        super.g(z7, i7, i8, i9, i10);
        this.f9756t.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f9761y;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f9759w.getClass();
        this.f9760x.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f9750E.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f9761y;
    }

    public final T0.k getParentLayoutDirection() {
        return this.f9746A;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final T0.j m3getPopupContentSizebOM6tXw() {
        return (T0.j) this.f9747B.getValue();
    }

    public final y getPositionProvider() {
        return this.f9762z;
    }

    @Override // z0.AbstractC2432a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.J;
    }

    public final String getTestTag() {
        return this.f9757u;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // z0.AbstractC2432a
    public final void h(int i7, int i8) {
        this.f9756t.getClass();
        super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    public final void k(O.r rVar, e4.n nVar) {
        setParentCompositionContext(rVar);
        setContent(nVar);
        this.J = true;
    }

    public final void l(InterfaceC0821a interfaceC0821a, z zVar, String str, T0.k kVar) {
        int i7;
        this.f9755s = interfaceC0821a;
        this.f9757u = str;
        if (!kotlin.jvm.internal.l.a(this.f9756t, zVar)) {
            zVar.getClass();
            WindowManager.LayoutParams layoutParams = this.f9761y;
            this.f9756t = zVar;
            boolean zB = k.b(this.f9758v);
            boolean z7 = zVar.f9763b;
            int i8 = zVar.a;
            if (z7 && zB) {
                i8 |= 8192;
            } else if (z7 && !zB) {
                i8 &= -8193;
            }
            layoutParams.flags = i8;
            this.f9759w.getClass();
            this.f9760x.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = kVar.ordinal();
        if (iOrdinal != 0) {
            i7 = 1;
            if (iOrdinal != 1) {
                throw new D6.r();
            }
        } else {
            i7 = 0;
        }
        super.setLayoutDirection(i7);
    }

    public final void m() {
        w0.r parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.B()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jQ = parentLayoutCoordinates.Q();
            long jG = parentLayoutCoordinates.g(0L);
            long jB = F.b(Math.round(g0.c.d(jG)), Math.round(g0.c.e(jG)));
            int i7 = (int) (jB >> 32);
            int i8 = (int) (jB & 4294967295L);
            T0.i iVar = new T0.i(i7, i8, ((int) (jQ >> 32)) + i7, ((int) (jQ & 4294967295L)) + i8);
            if (iVar.equals(this.f9749D)) {
                return;
            }
            this.f9749D = iVar;
            o();
        }
    }

    public final void n(w0.r rVar) {
        setParentLayoutCoordinates(rVar);
        m();
    }

    public final void o() {
        T0.j jVarM3getPopupContentSizebOM6tXw;
        T0.i iVar = this.f9749D;
        if (iVar == null || (jVarM3getPopupContentSizebOM6tXw = m3getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        x xVar = this.f9759w;
        xVar.getClass();
        View view = this.f9758v;
        Rect rect = this.f9751F;
        view.getWindowVisibleDisplayFrame(rect);
        long jA = AbstractC1420H.a(rect.right - rect.left, rect.bottom - rect.top);
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        wVar.f12719k = 0L;
        this.f9752G.d(this, b.f9699r, new u(wVar, this, iVar, jA, jVarM3getPopupContentSizebOM6tXw.a));
        WindowManager.LayoutParams layoutParams = this.f9761y;
        long j7 = wVar.f12719k;
        layoutParams.x = (int) (j7 >> 32);
        layoutParams.y = (int) (j7 & 4294967295L);
        if (this.f9756t.f9766e) {
            xVar.a(this, (int) (jA >> 32), (int) (jA & 4294967295L));
        }
        this.f9760x.updateViewLayout(this, layoutParams);
    }

    @Override // z0.AbstractC2432a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9752G.e();
        if (!this.f9756t.f9764c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f9753H == null) {
            this.f9753H = l.a(this.f9755s);
        }
        l.b(this, this.f9753H);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Y.u uVar = this.f9752G;
        G g4 = uVar.f10032g;
        if (g4 != null) {
            g4.f();
        }
        uVar.b();
        if (Build.VERSION.SDK_INT >= 33) {
            l.c(this, this.f9753H);
        }
        this.f9753H = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f9756t.f9765d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC0821a interfaceC0821a = this.f9755s;
            if (interfaceC0821a != null) {
                interfaceC0821a.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            InterfaceC0821a interfaceC0821a2 = this.f9755s;
            if (interfaceC0821a2 != null) {
                interfaceC0821a2.invoke();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(T0.k kVar) {
        this.f9746A = kVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m4setPopupContentSizefhxjrPA(T0.j jVar) {
        this.f9747B.setValue(jVar);
    }

    public final void setPositionProvider(y yVar) {
        this.f9762z = yVar;
    }

    public final void setTestTag(String str) {
        this.f9757u = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public AbstractC2432a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i7) {
    }
}
