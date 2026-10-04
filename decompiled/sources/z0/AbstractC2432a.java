package z0;

import H1.C0221b;
import O.C0497i0;
import O.C0510p;
import O.C0522v0;
import O.EnumC0511p0;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.InterfaceC0694v;
import com.kusukanime.R;
import f1.AbstractC0870c;
import f6.AbstractC0905c;
import java.lang.ref.WeakReference;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2432a extends ViewGroup {

    /* renamed from: k, reason: collision with root package name */
    public WeakReference f18714k;

    /* renamed from: l, reason: collision with root package name */
    public IBinder f18715l;

    /* renamed from: m, reason: collision with root package name */
    public o1 f18716m;

    /* renamed from: n, reason: collision with root package name */
    public O.r f18717n;

    /* renamed from: o, reason: collision with root package name */
    public A.j f18718o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18719p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18720q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18721r;

    public AbstractC2432a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        ViewOnAttachStateChangeListenerC2477x viewOnAttachStateChangeListenerC2477x = new ViewOnAttachStateChangeListenerC2477x(1, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2477x);
        Q0 q02 = new Q0(this);
        AbstractC0870c.V(this).a.add(q02);
        this.f18718o = new A.j(this, viewOnAttachStateChangeListenerC2477x, q02, 10);
    }

    private final void setParentContext(O.r rVar) {
        if (this.f18717n != rVar) {
            this.f18717n = rVar;
            if (rVar != null) {
                this.f18714k = null;
            }
            o1 o1Var = this.f18716m;
            if (o1Var != null) {
                o1Var.a();
                this.f18716m = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f18715l != iBinder) {
            this.f18715l = iBinder;
            this.f18714k = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i7, layoutParams);
    }

    public abstract void b(int i7, C0510p c0510p);

    public final void c() {
        if (this.f18720q) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        if (this.f18717n == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        f();
    }

    public final void e() {
        o1 o1Var = this.f18716m;
        if (o1Var != null) {
            o1Var.a();
        }
        this.f18716m = null;
        requestLayout();
    }

    public final void f() {
        if (this.f18716m == null) {
            try {
                this.f18720q = true;
                this.f18716m = q1.a(this, i(), new W.a(true, -656146368, new D.S(26, this)));
            } finally {
                this.f18720q = false;
            }
        }
    }

    public void g(boolean z7, int i7, int i8, int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i9 - i7) - getPaddingRight(), (i10 - i8) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.f18716m != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f18719p;
    }

    public void h(int i7, int i8) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i7, i8);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i7)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i8) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i8)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final O.r i() {
        C0522v0 c0522v0;
        S3.h hVar;
        C0497i0 c0497i0;
        int i7 = 2;
        O.r rVarB = this.f18717n;
        if (rVarB == null) {
            rVarB = k1.b(this);
            if (rVarB == null) {
                for (ViewParent parent = getParent(); rVarB == null && (parent instanceof View); parent = parent.getParent()) {
                    rVarB = k1.b((View) parent);
                }
            }
            if (rVarB != null) {
                O.r rVar = (!(rVarB instanceof C0522v0) || ((EnumC0511p0) ((C0522v0) rVarB).f7237r.getValue()).compareTo(EnumC0511p0.f7155l) > 0) ? rVarB : null;
                if (rVar != null) {
                    this.f18714k = new WeakReference(rVar);
                }
            } else {
                rVarB = null;
            }
            if (rVarB == null) {
                WeakReference weakReference = this.f18714k;
                if (weakReference == null || (rVarB = (O.r) weakReference.get()) == null || ((rVarB instanceof C0522v0) && ((EnumC0511p0) ((C0522v0) rVarB).f7237r.getValue()).compareTo(EnumC0511p0.f7155l) <= 0)) {
                    rVarB = null;
                }
                if (rVarB == null) {
                    if (!isAttachedToWindow()) {
                        AbstractC0905c.C("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                        throw null;
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    O.r rVarB2 = k1.b(view);
                    if (rVarB2 == null) {
                        ((a1) c1.a.get()).getClass();
                        S3.i iVar = S3.i.f8767k;
                        O3.q qVar = C2433a0.f18722v;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            hVar = (S3.h) C2433a0.f18722v.getValue();
                        } else {
                            hVar = (S3.h) C2433a0.f18723w.get();
                            if (hVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        S3.h hVarPlus = hVar.plus(iVar);
                        O.U u5 = (O.U) hVarPlus.get(O.T.f7045l);
                        if (u5 != null) {
                            C0497i0 c0497i02 = new C0497i0(u5);
                            C0221b c0221b = (C0221b) c0497i02.f7087m;
                            synchronized (c0221b.f3405l) {
                                c0221b.f3404k = false;
                                c0497i0 = c0497i02;
                            }
                        } else {
                            c0497i0 = 0;
                        }
                        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        S3.h c2480y0 = (a0.r) hVarPlus.get(a0.b.f10396z);
                        if (c2480y0 == null) {
                            c2480y0 = new C2480y0();
                            xVar.f12720k = c2480y0;
                        }
                        if (c0497i0 != 0) {
                            iVar = c0497i0;
                        }
                        S3.h hVarPlus2 = hVarPlus.plus(iVar).plus(c2480y0);
                        c0522v0 = new C0522v0(hVarPlus2);
                        synchronized (c0522v0.f7221b) {
                            c0522v0.f7236q = true;
                        }
                        M5.c cVarC = H5.D.c(hVarPlus2);
                        InterfaceC0694v interfaceC0694vE = androidx.lifecycle.J.e(view);
                        AbstractC0690q abstractC0690qF = interfaceC0694vE != null ? interfaceC0694vE.f() : null;
                        if (abstractC0690qF == null) {
                            AbstractC0905c.D("ViewTreeLifecycleOwner not found from " + view);
                            throw null;
                        }
                        view.addOnAttachStateChangeListener(new d1(view, c0522v0));
                        abstractC0690qF.a(new h1(cVarC, c0497i0, c0522v0, xVar, view));
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, c0522v0);
                        H5.Y y7 = H5.Y.f3831k;
                        Handler handler = view.getHandler();
                        int i8 = I5.f.a;
                        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2477x(i7, H5.D.x(y7, new I5.e(handler, "windowRecomposer cleanup", false).f4075o, new b1(c0522v0, view, null), 2)));
                    } else {
                        if (!(rVarB2 instanceof C0522v0)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        c0522v0 = (C0522v0) rVarB2;
                    }
                    C0522v0 c0522v02 = ((EnumC0511p0) c0522v0.f7237r.getValue()).compareTo(EnumC0511p0.f7155l) > 0 ? c0522v0 : null;
                    if (c0522v02 != null) {
                        this.f18714k = new WeakReference(c0522v02);
                    }
                    return c0522v0;
                }
            }
        }
        return rVarB;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f18721r || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        g(z7, i7, i8, i9, i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        f();
        h(i7, i8);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i7);
    }

    public final void setParentCompositionContext(O.r rVar) {
        setParentContext(rVar);
    }

    public final void setShowLayoutBounds(boolean z7) {
        this.f18719p = z7;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((C2471u) ((y0.e0) childAt)).setShowLayoutBounds(z7);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z7) {
        super.setTransitionGroup(z7);
        this.f18721r = true;
    }

    public final void setViewCompositionStrategy(R0 r02) {
        A.j jVar = this.f18718o;
        if (jVar != null) {
            jVar.invoke();
        }
        ((O) r02).getClass();
        ViewOnAttachStateChangeListenerC2477x viewOnAttachStateChangeListenerC2477x = new ViewOnAttachStateChangeListenerC2477x(1, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2477x);
        Q0 q02 = new Q0(this);
        AbstractC0870c.V(this).a.add(q02);
        this.f18718o = new A.j(this, viewOnAttachStateChangeListenerC2477x, q02, 10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        c();
        super.addView(view, i7);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z7) {
        c();
        return super.addViewInLayout(view, i7, layoutParams, z7);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, int i8) {
        c();
        super.addView(view, i7, i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i7, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
