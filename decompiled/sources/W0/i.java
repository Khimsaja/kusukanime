package W0;

import A3.t;
import B1.w;
import D.C0042b;
import D.C0056i;
import D.P0;
import H5.D;
import O.C0506n;
import O.InterfaceC0498j;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.InterfaceC0694v;
import androidx.lifecycle.J;
import com.kusukanime.R;
import e4.InterfaceC0821a;
import f6.AbstractC0905c;
import i1.InterfaceC1052e;
import java.util.LinkedHashMap;
import s0.u;
import y0.C2349D;
import y0.e0;
import y0.f0;
import y0.g0;
import z0.C2471u;
import z0.k1;

/* loaded from: classes.dex */
public abstract class i extends ViewGroup implements InterfaceC1052e, InterfaceC0498j, f0 {

    /* renamed from: A, reason: collision with root package name */
    public final int[] f9538A;

    /* renamed from: B, reason: collision with root package name */
    public int f9539B;

    /* renamed from: C, reason: collision with root package name */
    public int f9540C;

    /* renamed from: D, reason: collision with root package name */
    public final P0 f9541D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9542E;

    /* renamed from: F, reason: collision with root package name */
    public final C2349D f9543F;

    /* renamed from: k, reason: collision with root package name */
    public final r0.e f9544k;

    /* renamed from: l, reason: collision with root package name */
    public final View f9545l;

    /* renamed from: m, reason: collision with root package name */
    public final e0 f9546m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0821a f9547n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9548o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC0821a f9549p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0821a f9550q;

    /* renamed from: r, reason: collision with root package name */
    public a0.q f9551r;

    /* renamed from: s, reason: collision with root package name */
    public e4.k f9552s;

    /* renamed from: t, reason: collision with root package name */
    public T0.b f9553t;

    /* renamed from: u, reason: collision with root package name */
    public e4.k f9554u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0694v f9555v;

    /* renamed from: w, reason: collision with root package name */
    public L2.f f9556w;

    /* renamed from: x, reason: collision with root package name */
    public final h f9557x;

    /* renamed from: y, reason: collision with root package name */
    public final h f9558y;

    /* renamed from: z, reason: collision with root package name */
    public e4.k f9559z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, C0506n c0506n, int i7, r0.e eVar, View view, e0 e0Var) {
        super(context);
        int i8 = 2;
        int i9 = 1;
        int i10 = 0;
        this.f9544k = eVar;
        this.f9545l = view;
        this.f9546m = e0Var;
        LinkedHashMap linkedHashMap = k1.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, c0506n);
        setSaveFromParentEnabled(false);
        addView(view);
        this.f9547n = g.f9534o;
        this.f9549p = g.f9533n;
        this.f9550q = g.f9532m;
        a0.n nVar = a0.n.a;
        this.f9551r = nVar;
        this.f9553t = z1.c.a();
        q qVar = (q) this;
        this.f9557x = new h(qVar, i9);
        this.f9558y = new h(qVar, i10);
        this.f9538A = new int[2];
        this.f9539B = Integer.MIN_VALUE;
        this.f9540C = Integer.MIN_VALUE;
        this.f9541D = new P0();
        C2349D c2349d = new C2349D(3);
        c2349d.f17680t = qVar;
        a0.q qVarA = F0.k.a(androidx.compose.ui.input.nestedscroll.a.a(nVar, k.a, eVar), true, a.f9516o);
        u uVar = new u();
        uVar.a = new c(qVar, i9);
        A4.j jVar = new A4.j();
        A4.j jVar2 = uVar.f15493b;
        if (jVar2 != null) {
            jVar2.f227l = null;
        }
        uVar.f15493b = jVar;
        jVar.f227l = uVar;
        setOnRequestDisallowInterceptTouchEvent$ui_release(jVar);
        a0.q qVarD = androidx.compose.ui.layout.a.d(androidx.compose.ui.draw.a.a(qVarA.k(uVar), new C0056i(qVar, c2349d, qVar, 6)), new b(qVar, c2349d, i8));
        c2349d.Z(this.f9551r.k(qVarD));
        this.f9552s = new t(24, c2349d, qVarD);
        c2349d.W(this.f9553t);
        this.f9554u = new C0042b(20, c2349d);
        c2349d.f17665N = new b(qVar, c2349d, i10);
        c2349d.f17666O = new c(qVar, i10);
        c2349d.Y(new d(qVar, c2349d));
        this.f9543F = c2349d;
    }

    public static final int e(q qVar, int i7, int i8, int i9) {
        return (i9 >= 0 || i7 == i8) ? View.MeasureSpec.makeMeasureSpec(e3.c.k(i9, i7, i8), 1073741824) : (i9 != -2 || i8 == Integer.MAX_VALUE) ? (i9 != -1 || i8 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g0 getSnapshotObserver() {
        if (isAttachedToWindow()) {
            return ((C2471u) this.f9546m).getSnapshotObserver();
        }
        AbstractC0905c.C("Expected AndroidViewHolder to be attached when observing reads.");
        throw null;
    }

    @Override // O.InterfaceC0498j
    public final void a() {
        View view = this.f9545l;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f9549p.invoke();
        }
    }

    @Override // O.InterfaceC0498j
    public final void b() {
        this.f9550q.invoke();
    }

    @Override // O.InterfaceC0498j
    public final void c() {
        this.f9549p.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f9538A;
        getLocationInWindow(iArr);
        int i7 = iArr[0];
        region.op(i7, iArr[1], getWidth() + i7, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final T0.b getDensity() {
        return this.f9553t;
    }

    public final View getInteropView() {
        return this.f9545l;
    }

    public final C2349D getLayoutNode() {
        return this.f9543F;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f9545l.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC0694v getLifecycleOwner() {
        return this.f9555v;
    }

    public final a0.q getModifier() {
        return this.f9551r;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        P0 p02 = this.f9541D;
        return p02.f1093b | p02.a;
    }

    public final e4.k getOnDensityChanged$ui_release() {
        return this.f9554u;
    }

    public final e4.k getOnModifierChanged$ui_release() {
        return this.f9552s;
    }

    public final e4.k getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f9559z;
    }

    public final InterfaceC0821a getRelease() {
        return this.f9550q;
    }

    public final InterfaceC0821a getReset() {
        return this.f9549p;
    }

    public final L2.f getSavedStateRegistryOwner() {
        return this.f9556w;
    }

    public final InterfaceC0821a getUpdate() {
        return this.f9547n;
    }

    public final View getView() {
        return this.f9545l;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f9542E) {
            this.f9543F.y();
            return null;
        }
        this.f9545l.postOnAnimation(new w(13, this.f9558y));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f9545l.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9557x.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f9542E) {
            this.f9543F.y();
            return;
        }
        this.f9545l.postOnAnimation(new w(13, this.f9558y));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        this.f9545l.layout(0, 0, i9 - i7, i10 - i8);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        View view = this.f9545l;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i8));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i7, i8);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f9539B = i7;
        this.f9540C = i8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f7, boolean z7) {
        if (!this.f9545l.isNestedScrollingEnabled()) {
            return false;
        }
        D.x(this.f9544k.c(), null, new e(z7, this, n6.m.g(f5 * (-1.0f), f7 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f7) {
        if (!this.f9545l.isNestedScrollingEnabled()) {
            return false;
        }
        D.x(this.f9544k.c(), null, new f(this, n6.m.g(f5 * (-1.0f), f7 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z7) {
        e4.k kVar = this.f9559z;
        if (kVar != null) {
            kVar.invoke(Boolean.valueOf(z7));
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    public final void setDensity(T0.b bVar) {
        if (bVar != this.f9553t) {
            this.f9553t = bVar;
            e4.k kVar = this.f9554u;
            if (kVar != null) {
                kVar.invoke(bVar);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC0694v interfaceC0694v) {
        if (interfaceC0694v != this.f9555v) {
            this.f9555v = interfaceC0694v;
            J.i(this, interfaceC0694v);
        }
    }

    public final void setModifier(a0.q qVar) {
        if (qVar != this.f9551r) {
            this.f9551r = qVar;
            e4.k kVar = this.f9552s;
            if (kVar != null) {
                kVar.invoke(qVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(e4.k kVar) {
        this.f9554u = kVar;
    }

    public final void setOnModifierChanged$ui_release(e4.k kVar) {
        this.f9552s = kVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(e4.k kVar) {
        this.f9559z = kVar;
    }

    public final void setRelease(InterfaceC0821a interfaceC0821a) {
        this.f9550q = interfaceC0821a;
    }

    public final void setReset(InterfaceC0821a interfaceC0821a) {
        this.f9549p = interfaceC0821a;
    }

    public final void setSavedStateRegistryOwner(L2.f fVar) {
        if (fVar != this.f9556w) {
            this.f9556w = fVar;
            setTag(R.id.view_tree_saved_state_registry_owner, fVar);
        }
    }

    public final void setUpdate(InterfaceC0821a interfaceC0821a) {
        this.f9547n = interfaceC0821a;
        this.f9548o = true;
        this.f9557x.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // y0.f0
    public final boolean z() {
        return isAttachedToWindow();
    }
}
