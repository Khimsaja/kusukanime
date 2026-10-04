package z0;

import C2.C0034g;
import K2.RunnableC0306j;
import M0.InterfaceC0475h;
import O.C0486d;
import O.C0493g0;
import O.C0517t;
import O3.InterfaceC0554c;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.InterfaceC0679f;
import androidx.lifecycle.InterfaceC0694v;
import b0.C0700a;
import b0.InterfaceC0701b;
import b1.AbstractC0702a;
import c0.C0744a;
import c0.ViewOnAttachStateChangeListenerC0746c;
import d0.InterfaceC0781b;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import f0.AbstractC0851d;
import f0.C0849b;
import f0.C0853f;
import f0.C0856i;
import f0.C0866s;
import f0.InterfaceC0854g;
import f6.AbstractC0905c;
import f6.AbstractC0915m;
import h0.AbstractC0968M;
import h0.C0962G;
import h0.C0984g;
import h0.C0996s;
import h0.InterfaceC0958C;
import i1.AbstractC1067u;
import i1.AbstractC1068v;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import o.C1622t;
import o0.C1630b;
import o0.InterfaceC1629a;
import p.AbstractC1755i;
import p0.C1775a;
import p0.C1777c;
import p0.InterfaceC1776b;
import s0.C1955C;
import s0.C1960e;
import s0.InterfaceC1970o;
import u0.C2065a;
import w0.AbstractC2182Q;
import w0.C2170E;
import x0.C2244d;
import y0.AbstractC2359f;
import y0.AbstractC2367n;
import y0.C2349D;
import y0.C2350E;
import y0.C2351F;
import y0.C2372t;

/* renamed from: z0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2471u extends ViewGroup implements y0.e0, y0.k0, InterfaceC0679f {

    /* renamed from: J0, reason: collision with root package name */
    public static Class f18843J0;

    /* renamed from: K0, reason: collision with root package name */
    public static Method f18844K0;

    /* renamed from: A, reason: collision with root package name */
    public final b0.g f18845A;
    public final Q.d A0;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f18846B;

    /* renamed from: B0, reason: collision with root package name */
    public final RunnableC0306j f18847B0;

    /* renamed from: C, reason: collision with root package name */
    public ArrayList f18848C;

    /* renamed from: C0, reason: collision with root package name */
    public final B1.w f18849C0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f18850D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f18851D0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f18852E;

    /* renamed from: E0, reason: collision with root package name */
    public final C2467s f18853E0;

    /* renamed from: F, reason: collision with root package name */
    public final C1960e f18854F;

    /* renamed from: F0, reason: collision with root package name */
    public final InterfaceC2443f0 f18855F0;

    /* renamed from: G, reason: collision with root package name */
    public final F1.m f18856G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f18857G0;

    /* renamed from: H, reason: collision with root package name */
    public e4.k f18858H;

    /* renamed from: H0, reason: collision with root package name */
    public final E0.l f18859H0;
    public final C0700a I;

    /* renamed from: I0, reason: collision with root package name */
    public final r f18860I0;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final C2446h f18861K;

    /* renamed from: L, reason: collision with root package name */
    public final y0.g0 f18862L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f18863M;

    /* renamed from: N, reason: collision with root package name */
    public C2441e0 f18864N;

    /* renamed from: O, reason: collision with root package name */
    public C2466r0 f18865O;

    /* renamed from: P, reason: collision with root package name */
    public T0.a f18866P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f18867Q;

    /* renamed from: R, reason: collision with root package name */
    public final y0.Q f18868R;

    /* renamed from: S, reason: collision with root package name */
    public final C2437c0 f18869S;

    /* renamed from: T, reason: collision with root package name */
    public long f18870T;

    /* renamed from: U, reason: collision with root package name */
    public final int[] f18871U;

    /* renamed from: V, reason: collision with root package name */
    public final float[] f18872V;

    /* renamed from: W, reason: collision with root package name */
    public final float[] f18873W;

    /* renamed from: a0, reason: collision with root package name */
    public final float[] f18874a0;

    /* renamed from: b0, reason: collision with root package name */
    public long f18875b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f18876c0;

    /* renamed from: d0, reason: collision with root package name */
    public long f18877d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f18878e0;

    /* renamed from: f0, reason: collision with root package name */
    public final C0493g0 f18879f0;

    /* renamed from: g0, reason: collision with root package name */
    public final O.E f18880g0;

    /* renamed from: h0, reason: collision with root package name */
    public e4.k f18881h0;

    /* renamed from: i0, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC2448i f18882i0;

    /* renamed from: j0, reason: collision with root package name */
    public final ViewTreeObserverOnScrollChangedListenerC2450j f18883j0;

    /* renamed from: k, reason: collision with root package name */
    public long f18884k;

    /* renamed from: k0, reason: collision with root package name */
    public final ViewTreeObserverOnTouchModeChangeListenerC2452k f18885k0;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f18886l;

    /* renamed from: l0, reason: collision with root package name */
    public final N0.z f18887l0;

    /* renamed from: m, reason: collision with root package name */
    public final C2351F f18888m;

    /* renamed from: m0, reason: collision with root package name */
    public final N0.x f18889m0;

    /* renamed from: n, reason: collision with root package name */
    public final C0493g0 f18890n;

    /* renamed from: n0, reason: collision with root package name */
    public final AtomicReference f18891n0;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.compose.ui.focus.b f18892o;

    /* renamed from: o0, reason: collision with root package name */
    public final C2457m0 f18893o0;

    /* renamed from: p, reason: collision with root package name */
    public S3.h f18894p;

    /* renamed from: p0, reason: collision with root package name */
    public final C2474v0 f18895p0;

    /* renamed from: q, reason: collision with root package name */
    public final ViewOnDragListenerC2465q0 f18896q;

    /* renamed from: q0, reason: collision with root package name */
    public final C0493g0 f18897q0;

    /* renamed from: r, reason: collision with root package name */
    public final Z0 f18898r;

    /* renamed from: r0, reason: collision with root package name */
    public int f18899r0;

    /* renamed from: s, reason: collision with root package name */
    public final C0996s f18900s;

    /* renamed from: s0, reason: collision with root package name */
    public final C0493g0 f18901s0;

    /* renamed from: t, reason: collision with root package name */
    public final C2349D f18902t;

    /* renamed from: t0, reason: collision with root package name */
    public final C1630b f18903t0;

    /* renamed from: u, reason: collision with root package name */
    public final C2471u f18904u;

    /* renamed from: u0, reason: collision with root package name */
    public final C1777c f18905u0;

    /* renamed from: v, reason: collision with root package name */
    public final F0.o f18906v;
    public final C2244d v0;

    /* renamed from: w, reason: collision with root package name */
    public final F f18907w;

    /* renamed from: w0, reason: collision with root package name */
    public final X f18908w0;

    /* renamed from: x, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC0746c f18909x;

    /* renamed from: x0, reason: collision with root package name */
    public MotionEvent f18910x0;

    /* renamed from: y, reason: collision with root package name */
    public final C2444g f18911y;

    /* renamed from: y0, reason: collision with root package name */
    public long f18912y0;

    /* renamed from: z, reason: collision with root package name */
    public final C0984g f18913z;

    /* renamed from: z0, reason: collision with root package name */
    public final n5.P f18914z0;

    /* JADX WARN: Type inference failed for: r7v11, types: [z0.i] */
    /* JADX WARN: Type inference failed for: r7v12, types: [z0.j] */
    /* JADX WARN: Type inference failed for: r7v13, types: [z0.k] */
    public C2471u(Context context, S3.h hVar) {
        super(context);
        this.f18884k = 9205357640488583168L;
        this.f18886l = true;
        this.f18888m = new C2351F();
        T0.d dVarA = n6.m.a(context);
        O.T t7 = O.T.f7047n;
        this.f18890n = C0486d.K(dVarA, t7);
        F0.d dVar = new F0.d();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar);
        this.f18892o = new androidx.compose.ui.focus.b(new D.x0(1, this, C2471u.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0, 11), new b6.r(2, this, C2471u.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0, 3), new D.x0(1, this, C2471u.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0, 12), new c.w(0, this, C2471u.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0, 5), new c.w(0, this, C2471u.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0, 6), new M.K(0, 2, C2471u.class, this, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;"));
        ViewOnDragListenerC2465q0 viewOnDragListenerC2465q0 = new ViewOnDragListenerC2465q0();
        this.f18894p = hVar;
        this.f18896q = viewOnDragListenerC2465q0;
        this.f18898r = new Z0();
        a0.q qVarA = androidx.compose.ui.input.key.a.a(new C2464q(this, 0));
        a0.q qVarA2 = androidx.compose.ui.input.rotary.a.a();
        this.f18900s = new C0996s();
        C2349D c2349d = new C2349D(3);
        c2349d.Y(w0.V.f16849b);
        c2349d.W(getDensity());
        c2349d.Z(emptySemanticsElement.k(qVarA2).k(qVarA).k(((androidx.compose.ui.focus.b) getFocusOwner()).f10657i).k(viewOnDragListenerC2465q0.f18831c));
        this.f18902t = c2349d;
        this.f18904u = this;
        this.f18906v = new F0.o(getRoot(), dVar);
        F f5 = new F(this);
        this.f18907w = f5;
        this.f18909x = new ViewOnAttachStateChangeListenerC0746c(this, new c.w(0, this, O.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 4));
        C2444g c2444g = new C2444g();
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager", systemService);
        this.f18911y = c2444g;
        this.f18913z = new C0984g(this);
        this.f18845A = new b0.g();
        this.f18846B = new ArrayList();
        this.f18854F = new C1960e();
        C2349D root = getRoot();
        F1.m mVar = new F1.m();
        mVar.f2205b = root;
        mVar.f2206c = new B2.l((C2372t) root.f17660G.f7173c);
        mVar.f2207d = new p2.l(2);
        mVar.f2208e = new y0.r();
        this.f18856G = mVar;
        this.f18858H = C2458n.f18809m;
        int i7 = Build.VERSION.SDK_INT;
        this.I = i7 >= 26 ? new C0700a(this, getAutofillTree()) : null;
        this.f18861K = new C2446h(context);
        this.f18862L = new y0.g0(new C2464q(this, 1));
        this.f18868R = new y0.Q(getRoot());
        this.f18869S = new C2437c0(ViewConfiguration.get(context));
        this.f18870T = P3.F.b(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f18871U = new int[]{0, 0};
        float[] fArrA = C0962G.a();
        this.f18872V = fArrA;
        this.f18873W = C0962G.a();
        this.f18874a0 = C0962G.a();
        this.f18875b0 = -1L;
        this.f18877d0 = 9187343241974906880L;
        this.f18878e0 = true;
        O.T t8 = O.T.f7049p;
        this.f18879f0 = C0486d.K(null, t8);
        this.f18880g0 = C0486d.D(new C2467s(this, 1));
        this.f18882i0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: z0.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.a.F();
            }
        };
        this.f18883j0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: z0.j
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.a.F();
            }
        };
        this.f18885k0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: z0.k
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z7) {
                C1777c c1777c = this.a.f18905u0;
                int i8 = z7 ? 1 : 2;
                c1777c.getClass();
                c1777c.a.setValue(new C1775a(i8));
            }
        };
        N0.z zVar = new N0.z(getView(), this);
        this.f18887l0 = zVar;
        this.f18889m0 = new N0.x(zVar);
        this.f18891n0 = new AtomicReference(null);
        this.f18893o0 = new C2457m0(getTextInputService());
        this.f18895p0 = new C2474v0();
        this.f18897q0 = C0486d.K(q0.c.y(context), t7);
        this.f18899r0 = i7 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        T0.k kVar = T0.k.f8844k;
        T0.k kVar2 = layoutDirection != 0 ? layoutDirection != 1 ? null : T0.k.f8845l : kVar;
        this.f18901s0 = C0486d.K(kVar2 != null ? kVar2 : kVar, t8);
        this.f18903t0 = new C1630b(this);
        this.f18905u0 = new C1777c(isInTouchMode() ? 1 : 2);
        this.v0 = new C2244d(this);
        this.f18908w0 = new X(this);
        this.f18914z0 = new n5.P(15);
        this.A0 = new Q.d(new InterfaceC0821a[16]);
        this.f18847B0 = new RunnableC0306j(5, this);
        this.f18849C0 = new B1.w(23, this);
        this.f18853E0 = new C2467s(this, 0);
        this.f18855F0 = i7 < 29 ? new n5.P(fArrA) : new C2445g0();
        addOnAttachStateChangeListener(this.f18909x);
        setWillNotDraw(false);
        setFocusable(true);
        if (i7 >= 26) {
            N.a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        AbstractC1067u.b(this, f5);
        setOnDragListener(viewOnDragListenerC2465q0);
        getRoot().e(this);
        if (i7 >= 29) {
            H.a.a(this);
        }
        this.f18859H0 = i7 >= 31 ? new E0.l() : null;
        this.f18860I0 = new r(this);
    }

    public static final void a(C2471u c2471u, int i7, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iE;
        F f5 = c2471u.f18907w;
        if (kotlin.jvm.internal.l.a(str, f5.f18593E)) {
            int iE2 = f5.f18591C.e(i7);
            if (iE2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iE2);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.l.a(str, f5.f18594F) || (iE = f5.f18592D.e(i7)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iE);
    }

    public static final boolean e(C2471u c2471u, C0849b c0849b, g0.d dVar) {
        Integer numI;
        if (c2471u.isFocused() || c2471u.hasFocus()) {
            return true;
        }
        return super.requestFocus((c0849b == null || (numI = AbstractC0851d.I(c0849b.a)) == null) ? 130 : numI.intValue(), dVar != null ? AbstractC0968M.u(dVar) : null);
    }

    public static void f(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof C2471u) {
                ((C2471u) childAt).s();
            } else if (childAt instanceof ViewGroup) {
                f((ViewGroup) childAt);
            }
        }
    }

    public static long g(int i7) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j7 = size;
        return (j7 << 32) | j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2454l get_viewTreeOwners() {
        return (C2454l) this.f18879f0.getValue();
    }

    public static View h(View view, int i7) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (kotlin.jvm.internal.l.a(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i7))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View viewH = h(viewGroup.getChildAt(i8), i7);
            if (viewH != null) {
                return viewH;
            }
        }
        return null;
    }

    public static void j(C2349D c2349d) {
        c2349d.A();
        Q.d dVarV = c2349d.v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                j((C2349D) objArr[i8]);
                i8++;
            } while (i8 < i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[LOOP:0: B:22:0x004c->B:39:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085 A[EDGE_INSN: B:41:0x0085->B:40:0x0085 BREAK  A[LOOP:0: B:22:0x004c->B:39:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean l(android.view.MotionEvent r6) {
        /*
            float r0 = r6.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            if (r0 != 0) goto L85
            int r1 = r6.getPointerCount()
            r4 = r3
        L4c:
            if (r4 >= r1) goto L85
            float r0 = r6.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            float r0 = r6.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L7d
            z0.z0 r0 = z0.C2482z0.a
            boolean r0 = r0.a(r6, r4)
            if (r0 != 0) goto L7d
            goto L7f
        L7d:
            r0 = r2
            goto L80
        L7f:
            r0 = r3
        L80:
            if (r0 != 0) goto L85
            int r4 = r4 + 1
            goto L4c
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.C2471u.l(android.view.MotionEvent):boolean");
    }

    private void setDensity(T0.b bVar) {
        this.f18890n.setValue(bVar);
    }

    private void setFontFamilyResolver(M0.i iVar) {
        this.f18897q0.setValue(iVar);
    }

    private void setLayoutDirection(T0.k kVar) {
        this.f18901s0.setValue(kVar);
    }

    private final void set_viewTreeOwners(C2454l c2454l) {
        this.f18879f0.setValue(c2454l);
    }

    public final void A(C2349D c2349d) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c2349d != null) {
            while (c2349d != null && c2349d.f17661H.f17761r.f17739u == 1) {
                if (!this.f18867Q) {
                    C2349D c2349dS = c2349d.s();
                    if (c2349dS == null) {
                        break;
                    }
                    long j7 = ((C2372t) c2349dS.f17660G.f7173c).f16843n;
                    if (T0.a.f(j7) && T0.a.e(j7)) {
                        break;
                    }
                }
                c2349d = c2349d.s();
            }
            if (c2349d == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long B(long j7) {
        y();
        float fD = g0.c.d(j7) - g0.c.d(this.f18877d0);
        float fE = g0.c.e(j7) - g0.c.e(this.f18877d0);
        return C0962G.b(AbstractC0832b.e(fD, fE), this.f18874a0);
    }

    public final int C(MotionEvent motionEvent) {
        Object obj;
        if (this.f18857G0) {
            this.f18857G0 = false;
            int metaState = motionEvent.getMetaState();
            this.f18898r.getClass();
            Z0.f18713b.setValue(new s0.v(metaState));
        }
        C1960e c1960e = this.f18854F;
        n5.P pA = c1960e.a(motionEvent, this);
        F1.m mVar = this.f18856G;
        if (pA == null) {
            mVar.m();
            return 0;
        }
        ArrayList arrayList = (ArrayList) pA.f13378l;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i7 = size - 1;
                obj = arrayList.get(size);
                if (((s0.t) obj).f15486e) {
                    break;
                }
                if (i7 < 0) {
                    break;
                }
                size = i7;
            }
            obj = null;
        } else {
            obj = null;
        }
        s0.t tVar = (s0.t) obj;
        if (tVar != null) {
            this.f18884k = tVar.f15485d;
        }
        int iL = mVar.l(pA, this, m(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iL & 1) != 0) {
            return iL;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c1960e.f15446c.delete(pointerId);
        c1960e.f15445b.delete(pointerId);
        return iL;
    }

    public final void D(MotionEvent motionEvent, int i7, long j7, boolean z7) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i7 != 9 && i7 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i8 = 0; i8 < pointerCount; i8++) {
            pointerPropertiesArr[i8] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i9 = 0; i9 < pointerCount; i9++) {
            pointerCoordsArr[i9] = new MotionEvent.PointerCoords();
        }
        int i10 = 0;
        while (i10 < pointerCount) {
            int i11 = ((actionIndex < 0 || i10 < actionIndex) ? 0 : 1) + i10;
            motionEvent.getPointerProperties(i11, pointerPropertiesArr[i10]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i10];
            motionEvent.getPointerCoords(i11, pointerCoords);
            long jO = o(AbstractC0832b.e(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = g0.c.d(jO);
            pointerCoords.y = g0.c.e(jO);
            i10++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j7 : motionEvent.getDownTime(), j7, i7, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z7 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        n5.P pA = this.f18854F.a(motionEventObtain, this);
        kotlin.jvm.internal.l.c(pA);
        this.f18856G.l(pA, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(F.C0143f r6, U3.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof z0.C2469t
            if (r0 == 0) goto L13
            r0 = r7
            z0.t r0 = (z0.C2469t) r0
            int r1 = r0.f18841m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18841m = r1
            goto L18
        L13:
            z0.t r0 = new z0.t
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f18839k
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f18841m
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            P3.r.Y(r7)
            goto L49
        L2f:
            P3.r.Y(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f18891n0
            z0.q r2 = new z0.q
            r4 = 2
            r2.<init>(r5, r4)
            r0.f18841m = r3
            a0.t r3 = new a0.t
            r4 = 0
            r3.<init>(r2, r7, r6, r4)
            java.lang.Object r6 = H5.D.j(r3, r0)
            if (r6 != r1) goto L49
            return
        L49:
            D6.r r6 = new D6.r
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.C2471u.E(F.f, U3.c):void");
    }

    public final void F() {
        int[] iArr = this.f18871U;
        getLocationOnScreen(iArr);
        long j7 = this.f18870T;
        int i7 = (int) (j7 >> 32);
        int i8 = (int) (j7 & 4294967295L);
        boolean z7 = false;
        int i9 = iArr[0];
        if (i7 != i9 || i8 != iArr[1]) {
            this.f18870T = P3.F.b(i9, iArr[1]);
            if (i7 != Integer.MAX_VALUE && i8 != Integer.MAX_VALUE) {
                getRoot().f17661H.f17761r.v0();
                z7 = true;
            }
        }
        this.f18868R.a(z7);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C0700a c0700a;
        if (Build.VERSION.SDK_INT < 26 || (c0700a = this.I) == null) {
            return;
        }
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            int iKeyAt = sparseArray.keyAt(i7);
            AutofillValue autofillValueF = B5.a.f(sparseArray.get(iKeyAt));
            b0.e eVar = b0.e.a;
            if (eVar.d(autofillValueF)) {
                eVar.i(autofillValueF).toString();
                if (c0700a.f10902b.a.get(Integer.valueOf(iKeyAt)) != null) {
                    throw new ClassCastException();
                }
            } else {
                if (eVar.b(autofillValueF)) {
                    throw new O3.k("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (eVar.c(autofillValueF)) {
                    throw new O3.k("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (eVar.e(autofillValueF)) {
                    throw new O3.k("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return this.f18907w.m(i7, this.f18884k, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i7) {
        return this.f18907w.m(i7, this.f18884k, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            boolean r0 = r6.isAttachedToWindow()
            if (r0 != 0) goto Ld
            y0.D r0 = r6.getRoot()
            j(r0)
        Ld:
            r0 = 1
            r6.p(r0)
            java.lang.Object r1 = Y.o.f10002b
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference r2 = Y.o.f10009i     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L2b
            Y.c r2 = (Y.c) r2     // Catch: java.lang.Throwable -> L2b
            m.B r2 = r2.f9968h     // Catch: java.lang.Throwable -> L2b
            r3 = 0
            if (r2 == 0) goto L29
            boolean r2 = r2.h()     // Catch: java.lang.Throwable -> L2b
            if (r2 != r0) goto L29
            r2 = r0
            goto L2d
        L29:
            r2 = r3
            goto L2d
        L2b:
            r7 = move-exception
            goto L8e
        L2d:
            monitor-exit(r1)
            if (r2 == 0) goto L33
            Y.o.a()
        L33:
            r6.f18850D = r0
            h0.s r0 = r6.f18900s
            h0.d r1 = r0.a
            android.graphics.Canvas r2 = r1.a
            r1.a = r7
            y0.D r4 = r6.getRoot()
            r5 = 0
            r4.j(r1, r5)
            h0.d r0 = r0.a
            r0.a = r2
            java.util.ArrayList r0 = r6.f18846B
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L68
            java.util.ArrayList r0 = r6.f18846B
            int r0 = r0.size()
            r1 = r3
        L58:
            if (r1 >= r0) goto L68
            java.util.ArrayList r2 = r6.f18846B
            java.lang.Object r2 = r2.get(r1)
            y0.d0 r2 = (y0.d0) r2
            r2.j()
            int r1 = r1 + 1
            goto L58
        L68:
            boolean r0 = z0.U0.f18685D
            if (r0 == 0) goto L7a
            int r0 = r7.save()
            r1 = 0
            r7.clipRect(r1, r1, r1, r1)
            super.dispatchDraw(r7)
            r7.restoreToCount(r0)
        L7a:
            java.util.ArrayList r7 = r6.f18846B
            r7.clear()
            r6.f18850D = r3
            java.util.ArrayList r7 = r6.f18848C
            if (r7 == 0) goto L8d
            java.util.ArrayList r0 = r6.f18846B
            r0.addAll(r7)
            r7.clear()
        L8d:
            return
        L8e:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.C2471u.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C2065a c2065a;
        int size;
        C0517t c0517t;
        a0.p pVarF;
        C0517t c0517t2;
        if (this.f18851D0) {
            B1.w wVar = this.f18849C0;
            removeCallbacks(wVar);
            if (motionEvent.getActionMasked() == 8) {
                this.f18851D0 = false;
            } else {
                wVar.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (l(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (i(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            Method method = AbstractC1068v.a;
            AbstractC0702a.b(viewConfiguration);
        } else {
            AbstractC1068v.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i7 >= 26) {
            AbstractC0702a.a(viewConfiguration);
        } else {
            AbstractC1068v.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
        if (bVar.f10655g.a()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        C0866s c0866sG = AbstractC0851d.g(bVar.f10654f);
        if (c0866sG != null) {
            a0.p pVar = c0866sG.f10402k;
            if (!pVar.f10414w) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            C2349D c2349dV = AbstractC2359f.v(c0866sG);
            loop0: while (true) {
                if (c2349dV == null) {
                    pVarF = null;
                    break;
                }
                if ((((a0.p) c2349dV.f17660G.f7176f).f10405n & 16384) != 0) {
                    while (pVar != null) {
                        if ((pVar.f10404m & 16384) != 0) {
                            Q.d dVar = null;
                            pVarF = pVar;
                            while (pVarF != null) {
                                if (pVarF instanceof C2065a) {
                                    break loop0;
                                }
                                if ((pVarF.f10404m & 16384) != 0 && (pVarF instanceof AbstractC2367n)) {
                                    int i8 = 0;
                                    for (a0.p pVar2 = ((AbstractC2367n) pVarF).f17880y; pVar2 != null; pVar2 = pVar2.f10407p) {
                                        if ((pVar2.f10404m & 16384) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                pVarF = pVar2;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new Q.d(new a0.p[16]);
                                                }
                                                if (pVarF != null) {
                                                    dVar.b(pVarF);
                                                    pVarF = null;
                                                }
                                                dVar.b(pVar2);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                pVarF = AbstractC2359f.f(dVar);
                            }
                        }
                        pVar = pVar.f10406o;
                    }
                }
                c2349dV = c2349dV.s();
                pVar = (c2349dV == null || (c0517t2 = c2349dV.f17660G) == null) ? null : (y0.m0) c0517t2.f7175e;
            }
            c2065a = (C2065a) pVarF;
        } else {
            c2065a = null;
        }
        if (c2065a != null) {
            C2065a c2065a2 = c2065a;
            a0.p pVar3 = c2065a2.f10402k;
            if (!pVar3.f10414w) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            a0.p pVar4 = pVar3.f10406o;
            C2349D c2349dV2 = AbstractC2359f.v(c2065a);
            ArrayList arrayList = null;
            while (c2349dV2 != null) {
                if ((((a0.p) c2349dV2.f17660G.f7176f).f10405n & 16384) != 0) {
                    while (pVar4 != null) {
                        if ((pVar4.f10404m & 16384) != 0) {
                            a0.p pVarF2 = pVar4;
                            Q.d dVar2 = null;
                            while (pVarF2 != null) {
                                if (pVarF2 instanceof C2065a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(pVarF2);
                                } else if ((pVarF2.f10404m & 16384) != 0 && (pVarF2 instanceof AbstractC2367n)) {
                                    int i9 = 0;
                                    for (a0.p pVar5 = ((AbstractC2367n) pVarF2).f17880y; pVar5 != null; pVar5 = pVar5.f10407p) {
                                        if ((pVar5.f10404m & 16384) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                pVarF2 = pVar5;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new Q.d(new a0.p[16]);
                                                }
                                                if (pVarF2 != null) {
                                                    dVar2.b(pVarF2);
                                                    pVarF2 = null;
                                                }
                                                dVar2.b(pVar5);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                pVarF2 = AbstractC2359f.f(dVar2);
                            }
                        }
                        pVar4 = pVar4.f10406o;
                    }
                }
                c2349dV2 = c2349dV2.s();
                pVar4 = (c2349dV2 == null || (c0517t = c2349dV2.f17660G) == null) ? null : (y0.m0) c0517t.f7175e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i10 = size - 1;
                    ((C2065a) arrayList.get(size)).getClass();
                    if (i10 < 0) {
                        break;
                    }
                    size = i10;
                }
            }
            a0.p pVarF3 = c2065a2.f10402k;
            Q.d dVar3 = null;
            while (pVarF3 != null) {
                if (pVarF3 instanceof C2065a) {
                } else if ((pVarF3.f10404m & 16384) != 0 && (pVarF3 instanceof AbstractC2367n)) {
                    int i11 = 0;
                    for (a0.p pVar6 = ((AbstractC2367n) pVarF3).f17880y; pVar6 != null; pVar6 = pVar6.f10407p) {
                        if ((pVar6.f10404m & 16384) != 0) {
                            i11++;
                            if (i11 == 1) {
                                pVarF3 = pVar6;
                            } else {
                                if (dVar3 == null) {
                                    dVar3 = new Q.d(new a0.p[16]);
                                }
                                if (pVarF3 != null) {
                                    dVar3.b(pVarF3);
                                    pVarF3 = null;
                                }
                                dVar3.b(pVar6);
                            }
                        }
                    }
                    if (i11 == 1) {
                    }
                }
                pVarF3 = AbstractC2359f.f(dVar3);
            }
            a0.p pVarF4 = c2065a2.f10402k;
            Q.d dVar4 = null;
            while (pVarF4 != null) {
                if (pVarF4 instanceof C2065a) {
                } else if ((pVarF4.f10404m & 16384) != 0 && (pVarF4 instanceof AbstractC2367n)) {
                    int i12 = 0;
                    for (a0.p pVar7 = ((AbstractC2367n) pVarF4).f17880y; pVar7 != null; pVar7 = pVar7.f10407p) {
                        if ((pVar7.f10404m & 16384) != 0) {
                            i12++;
                            if (i12 == 1) {
                                pVarF4 = pVar7;
                            } else {
                                if (dVar4 == null) {
                                    dVar4 = new Q.d(new a0.p[16]);
                                }
                                if (pVarF4 != null) {
                                    dVar4.b(pVarF4);
                                    pVarF4 = null;
                                }
                                dVar4.b(pVar7);
                            }
                        }
                    }
                    if (i12 == 1) {
                    }
                }
                pVarF4 = AbstractC2359f.f(dVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    C2458n c2458n = ((C2065a) arrayList.get(i13)).f16215x;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0147 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.C2471u.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((androidx.compose.ui.focus.b) getFocusOwner()).b(keyEvent, new A.m(17, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f18898r.getClass();
        Z0.f18713b.setValue(new s0.v(metaState));
        return ((androidx.compose.ui.focus.b) getFocusOwner()).b(keyEvent, C0853f.f11395m) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0517t c0517t;
        if (isFocused()) {
            androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
            if (bVar.f10655g.a()) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                C0866s c0866sG = AbstractC0851d.g(bVar.f10654f);
                if (c0866sG != null) {
                    a0.p pVar = c0866sG.f10402k;
                    if (!pVar.f10414w) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    C2349D c2349dV = AbstractC2359f.v(c0866sG);
                    while (c2349dV != null) {
                        if ((((a0.p) c2349dV.f17660G.f7176f).f10405n & 131072) != 0) {
                            while (pVar != null) {
                                if ((pVar.f10404m & 131072) != 0) {
                                    a0.p pVarF = pVar;
                                    Q.d dVar = null;
                                    while (pVarF != null) {
                                        if ((pVarF.f10404m & 131072) != 0 && (pVarF instanceof AbstractC2367n)) {
                                            int i7 = 0;
                                            for (a0.p pVar2 = ((AbstractC2367n) pVarF).f17880y; pVar2 != null; pVar2 = pVar2.f10407p) {
                                                if ((pVar2.f10404m & 131072) != 0) {
                                                    i7++;
                                                    if (i7 == 1) {
                                                        pVarF = pVar2;
                                                    } else {
                                                        if (dVar == null) {
                                                            dVar = new Q.d(new a0.p[16]);
                                                        }
                                                        if (pVarF != null) {
                                                            dVar.b(pVarF);
                                                            pVarF = null;
                                                        }
                                                        dVar.b(pVar2);
                                                    }
                                                }
                                            }
                                            if (i7 == 1) {
                                            }
                                        }
                                        pVarF = AbstractC2359f.f(dVar);
                                    }
                                }
                                pVar = pVar.f10406o;
                            }
                        }
                        c2349dV = c2349dV.s();
                        pVar = (c2349dV == null || (c0517t = c2349dV.f17660G) == null) ? null : (y0.m0) c0517t.f7175e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            G.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f18851D0) {
            B1.w wVar = this.f18849C0;
            removeCallbacks(wVar);
            MotionEvent motionEvent2 = this.f18910x0;
            kotlin.jvm.internal.l.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f18851D0 = false;
            } else {
                wVar.run();
            }
        }
        if (!l(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || n(motionEvent))) {
            int i7 = i(motionEvent);
            if ((i7 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((i7 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i7) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return h(this, i7);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i7));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        if (view != null) {
            g0.d dVarD = AbstractC0851d.d(view);
            C0849b c0849bJ = AbstractC0851d.J(i7);
            if (kotlin.jvm.internal.l.a(((androidx.compose.ui.focus.b) getFocusOwner()).c(c0849bJ != null ? c0849bJ.a : 6, dVarD, C2458n.f18810n), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i7);
    }

    public final C2441e0 getAndroidViewsHandler$ui_release() {
        if (this.f18864N == null) {
            C2441e0 c2441e0 = new C2441e0(getContext());
            this.f18864N = c2441e0;
            addView(c2441e0, -1);
            requestLayout();
        }
        C2441e0 c2441e02 = this.f18864N;
        kotlin.jvm.internal.l.c(c2441e02);
        return c2441e02;
    }

    public InterfaceC0701b getAutofill() {
        return this.I;
    }

    public b0.g getAutofillTree() {
        return this.f18845A;
    }

    public final e4.k getConfigurationChangeObserver() {
        return this.f18858H;
    }

    public final ViewOnAttachStateChangeListenerC0746c getContentCaptureManager$ui_release() {
        return this.f18909x;
    }

    public S3.h getCoroutineContext() {
        return this.f18894p;
    }

    public T0.b getDensity() {
        return (T0.b) this.f18890n.getValue();
    }

    public InterfaceC0781b getDragAndDropManager() {
        return this.f18896q;
    }

    public InterfaceC0854g getFocusOwner() {
        return this.f18892o;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        O3.C c2;
        g0.d dVarT = t();
        if (dVarT != null) {
            rect.left = Math.round(dVarT.a);
            rect.top = Math.round(dVarT.f11659b);
            rect.right = Math.round(dVarT.f11660c);
            rect.bottom = Math.round(dVarT.f11661d);
            c2 = O3.C.a;
        } else {
            c2 = null;
        }
        if (c2 == null) {
            super.getFocusedRect(rect);
        }
    }

    public M0.i getFontFamilyResolver() {
        return (M0.i) this.f18897q0.getValue();
    }

    public InterfaceC0475h getFontLoader() {
        return this.f18895p0;
    }

    public InterfaceC0958C getGraphicsContext() {
        return this.f18913z;
    }

    public InterfaceC1629a getHapticFeedBack() {
        return this.f18903t0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f18868R.f17784b.m();
    }

    public InterfaceC1776b getInputModeManager() {
        return this.f18905u0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f18875b0;
    }

    @Override // android.view.View, android.view.ViewParent
    public T0.k getLayoutDirection() {
        return (T0.k) this.f18901s0.getValue();
    }

    public long getMeasureIteration() {
        y0.Q q6 = this.f18868R;
        if (q6.f17785c) {
            return q6.f17789g;
        }
        AbstractC0905c.B("measureIteration should be only used during the measure/layout pass");
        throw null;
    }

    public C2244d getModifierLocalManager() {
        return this.v0;
    }

    public AbstractC2182Q getPlacementScope() {
        int i7 = w0.U.f16848b;
        return new C2170E(1, this);
    }

    public InterfaceC1970o getPointerIconService() {
        return this.f18860I0;
    }

    public C2349D getRoot() {
        return this.f18902t;
    }

    public y0.k0 getRootForTest() {
        return this.f18904u;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        E0.l lVar;
        if (Build.VERSION.SDK_INT < 31 || (lVar = this.f18859H0) == null) {
            return false;
        }
        return ((Boolean) lVar.a.getValue()).booleanValue();
    }

    public F0.o getSemanticsOwner() {
        return this.f18906v;
    }

    public C2351F getSharedDrawScope() {
        return this.f18888m;
    }

    public boolean getShowLayoutBounds() {
        return this.f18863M;
    }

    public y0.g0 getSnapshotObserver() {
        return this.f18862L;
    }

    public N0 getSoftwareKeyboardController() {
        return this.f18893o0;
    }

    public N0.x getTextInputService() {
        return this.f18889m0;
    }

    public O0 getTextToolbar() {
        return this.f18908w0;
    }

    public S0 getViewConfiguration() {
        return this.f18869S;
    }

    public final C2454l getViewTreeOwners() {
        return (C2454l) this.f18880g0.getValue();
    }

    public Y0 getWindowInfo() {
        return this.f18898r;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.C2471u.i(android.view.MotionEvent):int");
    }

    public final void k(C2349D c2349d) {
        int i7 = 0;
        this.f18868R.o(c2349d, false);
        Q.d dVarV = c2349d.v();
        int i8 = dVarV.f7829m;
        if (i8 > 0) {
            Object[] objArr = dVarV.f7827k;
            do {
                k((C2349D) objArr[i7]);
                i7++;
            } while (i7 < i8);
        }
    }

    public final boolean m(MotionEvent motionEvent) {
        float x7 = motionEvent.getX();
        float y7 = motionEvent.getY();
        return 0.0f <= x7 && x7 <= ((float) getWidth()) && 0.0f <= y7 && y7 <= ((float) getHeight());
    }

    public final boolean n(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f18910x0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long o(long j7) {
        y();
        long jB = C0962G.b(j7, this.f18873W);
        return AbstractC0832b.e(g0.c.d(this.f18877d0) + g0.c.d(jB), g0.c.e(this.f18877d0) + g0.c.e(jB));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AbstractC0690q abstractC0690qF;
        InterfaceC0694v interfaceC0694v;
        C0700a c0700a;
        super.onAttachedToWindow();
        this.f18898r.a.setValue(Boolean.valueOf(hasWindowFocus()));
        k(getRoot());
        j(getRoot());
        getSnapshotObserver().a.e();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && (c0700a = this.I) != null) {
            b0.f.a.a(c0700a);
        }
        InterfaceC0694v interfaceC0694vE = androidx.lifecycle.J.e(this);
        L2.f fVarT = android.support.v4.media.session.b.t(this);
        C2454l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (interfaceC0694vE != null && fVarT != null && (interfaceC0694vE != (interfaceC0694v = viewTreeOwners.a) || fVarT != interfaceC0694v))) {
            if (interfaceC0694vE == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (fVarT == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (abstractC0690qF = viewTreeOwners.a.f()) != null) {
                abstractC0690qF.c(this);
            }
            interfaceC0694vE.f().a(this);
            C2454l c2454l = new C2454l(interfaceC0694vE, fVarT);
            set_viewTreeOwners(c2454l);
            e4.k kVar = this.f18881h0;
            if (kVar != null) {
                kVar.invoke(c2454l);
            }
            this.f18881h0 = null;
        }
        int i8 = isInTouchMode() ? 1 : 2;
        C1777c c1777c = this.f18905u0;
        c1777c.getClass();
        c1777c.a.setValue(new C1775a(i8));
        C2454l viewTreeOwners2 = getViewTreeOwners();
        AbstractC0690q abstractC0690qF2 = viewTreeOwners2 != null ? viewTreeOwners2.a.f() : null;
        if (abstractC0690qF2 == null) {
            AbstractC0905c.D("No lifecycle owner exists");
            throw null;
        }
        abstractC0690qF2.a(this);
        abstractC0690qF2.a(this.f18909x);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f18882i0);
        getViewTreeObserver().addOnScrollChangedListener(this.f18883j0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f18885k0);
        if (i7 >= 31) {
            K.a.b(this);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        a0.s sVar = (a0.s) this.f18891n0.get();
        W w7 = (W) (sVar != null ? sVar.f10415b : null);
        if (w7 == null) {
            return this.f18887l0.f6906d;
        }
        a0.s sVar2 = (a0.s) w7.f18708n.get();
        C2476w0 c2476w0 = (C2476w0) (sVar2 != null ? sVar2.f10415b : null);
        return c2476w0 != null && (c2476w0.f18940e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(n6.m.a(getContext()));
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f18899r0) {
            this.f18899r0 = i7 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(q0.c.y(getContext()));
        }
        this.f18858H.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i7;
        a0.s sVar = (a0.s) this.f18891n0.get();
        W w7 = (W) (sVar != null ? sVar.f10415b : null);
        if (w7 == null) {
            N0.z zVar = this.f18887l0;
            if (zVar.f6906d) {
                N0.l lVar = zVar.f6910h;
                N0.w wVar = zVar.f6909g;
                int i8 = lVar.f6883e;
                boolean z7 = lVar.a;
                if (i8 == 1) {
                    i7 = z7 ? 6 : 0;
                } else if (i8 == 0) {
                    i7 = 1;
                } else if (i8 == 2) {
                    i7 = 2;
                } else if (i8 == 6) {
                    i7 = 5;
                } else if (i8 == 5) {
                    i7 = 7;
                } else if (i8 == 3) {
                    i7 = 3;
                } else if (i8 == 4) {
                    i7 = 4;
                } else {
                    if (i8 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                }
                editorInfo.imeOptions = i7;
                int i9 = lVar.f6882d;
                if (i9 == 1) {
                    editorInfo.inputType = 1;
                } else if (i9 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i7;
                } else if (i9 == 3) {
                    editorInfo.inputType = 2;
                } else if (i9 == 4) {
                    editorInfo.inputType = 3;
                } else if (i9 == 5) {
                    editorInfo.inputType = 17;
                } else if (i9 == 6) {
                    editorInfo.inputType = 33;
                } else if (i9 == 7) {
                    editorInfo.inputType = 129;
                } else if (i9 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i9 != 9) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z7) {
                    int i10 = editorInfo.inputType;
                    if ((i10 & 1) == 1) {
                        editorInfo.inputType = i10 | 131072;
                        if (i8 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i11 = editorInfo.inputType;
                if ((i11 & 1) == 1) {
                    int i12 = lVar.f6880b;
                    if (i12 == 1) {
                        editorInfo.inputType = i11 | 4096;
                    } else if (i12 == 2) {
                        editorInfo.inputType = i11 | 8192;
                    } else if (i12 == 3) {
                        editorInfo.inputType = i11 | 16384;
                    }
                    if (lVar.f6881c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j7 = wVar.f6896b;
                int i13 = H0.H.f3092c;
                editorInfo.initialSelStart = (int) (j7 >> 32);
                editorInfo.initialSelEnd = (int) (j7 & 4294967295L);
                AbstractC0915m.H(editorInfo, wVar.a.a);
                editorInfo.imeOptions |= 33554432;
                if (p1.g.c()) {
                    p1.g.a().f(editorInfo);
                }
                N0.s sVar2 = new N0.s(zVar.f6909g, new C0034g(20, zVar), zVar.f6910h.f6881c);
                zVar.f6911i.add(new WeakReference(sVar2));
                return sVar2;
            }
        } else {
            a0.s sVar3 = (a0.s) w7.f18708n.get();
            C2476w0 c2476w0 = (C2476w0) (sVar3 != null ? sVar3.f10415b : null);
            if (c2476w0 != null) {
                synchronized (c2476w0.f18938c) {
                    if (c2476w0.f18940e) {
                        return null;
                    }
                    F.E eA = c2476w0.a.a(editorInfo);
                    C1622t c1622t = new C1622t(20, c2476w0);
                    int i14 = Build.VERSION.SDK_INT;
                    InputConnection oVar = i14 >= 34 ? new N0.o(eA, c1622t) : i14 >= 25 ? new N0.n(eA, c1622t) : new N0.m(eA, c1622t);
                    c2476w0.f18939d.b(new WeakReference(oVar));
                    return oVar;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        ViewOnAttachStateChangeListenerC0746c viewOnAttachStateChangeListenerC0746c = this.f18909x;
        viewOnAttachStateChangeListenerC0746c.getClass();
        C0744a.a.b(viewOnAttachStateChangeListenerC0746c, jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0700a c0700a;
        super.onDetachedFromWindow();
        Y.u uVar = getSnapshotObserver().a;
        C2.G g4 = uVar.f10032g;
        if (g4 != null) {
            g4.f();
        }
        uVar.b();
        C2454l viewTreeOwners = getViewTreeOwners();
        AbstractC0690q abstractC0690qF = viewTreeOwners != null ? viewTreeOwners.a.f() : null;
        if (abstractC0690qF == null) {
            AbstractC0905c.D("No lifecycle owner exists");
            throw null;
        }
        abstractC0690qF.c(this.f18909x);
        abstractC0690qF.c(this);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && (c0700a = this.I) != null) {
            b0.f.a.b(c0700a);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f18882i0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f18883j0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f18885k0);
        if (i7 >= 31) {
            K.a.a(this);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z7, int i7, Rect rect) {
        super.onFocusChanged(z7, i7, rect);
        if (z7 || hasFocus()) {
            return;
        }
        androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
        H.N n7 = bVar.f10656h;
        boolean z8 = n7.f2900b;
        C0866s c0866s = bVar.f10654f;
        if (z8) {
            AbstractC0851d.e(c0866s, true);
            return;
        }
        try {
            n7.f2900b = true;
            AbstractC0851d.e(c0866s, true);
        } finally {
            H.N.c(n7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        this.f18868R.i(this.f18853E0);
        this.f18866P = null;
        F();
        if (this.f18864N != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i9 - i7, i10 - i8);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        y0.Q q6 = this.f18868R;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                k(getRoot());
            }
            long jG = g(i7);
            int i9 = (int) (jG >>> 32);
            int i10 = (int) (jG & 4294967295L);
            long jG2 = g(i8);
            int i11 = (int) (4294967295L & jG2);
            int iMin = Math.min((int) (jG2 >>> 32), 262142);
            int iMin2 = Integer.MAX_VALUE;
            int iMin3 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
            int iF = q0.c.f(iMin3 == Integer.MAX_VALUE ? iMin : iMin3);
            if (i10 != Integer.MAX_VALUE) {
                iMin2 = Math.min(iF, i10);
            }
            long jA = q0.c.a(Math.min(iF, i9), iMin2, iMin, iMin3);
            T0.a aVar = this.f18866P;
            if (aVar == null) {
                this.f18866P = new T0.a(jA);
                this.f18867Q = false;
            } else if (!T0.a.b(aVar.a, jA)) {
                this.f18867Q = true;
            }
            q6.p(jA);
            q6.k();
            setMeasuredDimension(getRoot().f17661H.f17761r.f16840k, getRoot().f17661H.f17761r.f16841l);
            if (this.f18864N != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f17661H.f17761r.f16840k, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f17661H.f17761r.f16841l, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i7) {
        C0700a c0700a;
        if (Build.VERSION.SDK_INT < 26 || viewStructure == null || (c0700a = this.I) == null) {
            return;
        }
        b0.c cVar = b0.c.a;
        b0.g gVar = c0700a.f10902b;
        int iA = cVar.a(viewStructure, gVar.a.size());
        Iterator it = gVar.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            Iterator it2 = it;
            ViewStructure viewStructureB = cVar.b(viewStructure, iA);
            if (viewStructureB != null) {
                b0.e eVar = b0.e.a;
                AutofillId autofillIdA = eVar.a(viewStructure);
                kotlin.jvm.internal.l.c(autofillIdA);
                eVar.g(viewStructureB, autofillIdA, iIntValue);
                cVar.d(viewStructureB, iIntValue, c0700a.a.getContext().getPackageName(), null, null);
                eVar.h(viewStructureB, 1);
                throw null;
            }
            iA++;
            it = it2;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0679f
    public final void onResume(InterfaceC0694v interfaceC0694v) {
        setShowLayoutBounds(C2474v0.a());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        if (this.f18886l) {
            T0.k kVar = T0.k.f8844k;
            T0.k kVar2 = i7 != 0 ? i7 != 1 ? null : T0.k.f8845l : kVar;
            if (kVar2 != null) {
                kVar = kVar2;
            }
            setLayoutDirection(kVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        E0.l lVar;
        if (Build.VERSION.SDK_INT < 31 || (lVar = this.f18859H0) == null) {
            return;
        }
        lVar.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC0746c viewOnAttachStateChangeListenerC0746c = this.f18909x;
        viewOnAttachStateChangeListenerC0746c.getClass();
        C0744a.a.c(viewOnAttachStateChangeListenerC0746c, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z7) {
        boolean zA;
        this.f18898r.a.setValue(Boolean.valueOf(z7));
        this.f18857G0 = true;
        super.onWindowFocusChanged(z7);
        if (!z7 || getShowLayoutBounds() == (zA = C2474v0.a())) {
            return;
        }
        setShowLayoutBounds(zA);
        j(getRoot());
    }

    public final void p(boolean z7) {
        C2467s c2467s;
        y0.Q q6 = this.f18868R;
        if (q6.f17784b.m() || ((Q.d) q6.f17787e.f13378l).l()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z7) {
                try {
                    c2467s = this.f18853E0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                c2467s = null;
            }
            if (q6.i(c2467s)) {
                requestLayout();
            }
            q6.a(false);
            if (this.f18852E) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f18852E = false;
            }
            Trace.endSection();
        }
    }

    public final void q(C2349D c2349d, long j7) {
        y0.Q q6 = this.f18868R;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            q6.j(c2349d, j7);
            if (!q6.f17784b.m()) {
                q6.a(false);
                if (this.f18852E) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f18852E = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void r(y0.d0 d0Var, boolean z7) {
        ArrayList arrayList = this.f18846B;
        if (!z7) {
            if (this.f18850D) {
                return;
            }
            arrayList.remove(d0Var);
            ArrayList arrayList2 = this.f18848C;
            if (arrayList2 != null) {
                arrayList2.remove(d0Var);
                return;
            }
            return;
        }
        if (!this.f18850D) {
            arrayList.add(d0Var);
            return;
        }
        ArrayList arrayList3 = this.f18848C;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f18848C = arrayList3;
        }
        arrayList3.add(d0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int iOrdinal = ((androidx.compose.ui.focus.b) getFocusOwner()).f10654f.H0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return super.requestFocus(i7, rect);
        }
        if (iOrdinal != 3) {
            throw new D6.r();
        }
        C0849b c0849bJ = AbstractC0851d.J(i7);
        int i8 = c0849bJ != null ? c0849bJ.a : 7;
        Boolean boolC = ((androidx.compose.ui.focus.b) getFocusOwner()).c(i8, rect != null ? new g0.d(rect.left, rect.top, rect.right, rect.bottom) : null, new C0856i(i8, 1));
        if (boolC != null) {
            return boolC.booleanValue();
        }
        return false;
    }

    public final void s() {
        if (this.J) {
            Y.u uVar = getSnapshotObserver().a;
            synchronized (uVar.f10031f) {
                try {
                    Q.d dVar = uVar.f10031f;
                    int i7 = dVar.f7829m;
                    int i8 = 0;
                    for (int i9 = 0; i9 < i7; i9++) {
                        Y.t tVar = (Y.t) dVar.f7827k[i9];
                        tVar.e();
                        if (!(tVar.f10020f.f12943e != 0)) {
                            i8++;
                        } else if (i8 > 0) {
                            Object[] objArr = dVar.f7827k;
                            objArr[i9 - i8] = objArr[i9];
                        }
                    }
                    int i10 = i7 - i8;
                    P3.m.c0(dVar.f7827k, i10, i7);
                    dVar.f7829m = i10;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.J = false;
        }
        C2441e0 c2441e0 = this.f18864N;
        if (c2441e0 != null) {
            f(c2441e0);
        }
        while (this.A0.l()) {
            int i11 = this.A0.f7829m;
            for (int i12 = 0; i12 < i11; i12++) {
                Object[] objArr2 = this.A0.f7827k;
                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objArr2[i12];
                objArr2[i12] = null;
                if (interfaceC0821a != null) {
                    interfaceC0821a.invoke();
                }
            }
            this.A0.o(0, i11);
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j7) {
        this.f18907w.f18604h = j7;
    }

    public final void setConfigurationChangeObserver(e4.k kVar) {
        this.f18858H = kVar;
    }

    public final void setContentCaptureManager$ui_release(ViewOnAttachStateChangeListenerC0746c viewOnAttachStateChangeListenerC0746c) {
        this.f18909x = viewOnAttachStateChangeListenerC0746c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public void setCoroutineContext(S3.h hVar) {
        int i7;
        int i8;
        this.f18894p = hVar;
        a0.p pVar = (a0.p) getRoot().f17660G.f7176f;
        if (pVar instanceof C1955C) {
            ((C1955C) pVar).I0();
        }
        a0.p pVar2 = pVar.f10402k;
        if (!pVar2.f10414w) {
            AbstractC0905c.C("visitSubtree called on an unattached node");
            throw null;
        }
        a0.p pVar3 = pVar2.f10407p;
        C2349D c2349dV = AbstractC2359f.v(pVar);
        int[] iArrCopyOf = new int[16];
        Q.d[] dVarArr = new Q.d[16];
        int i9 = 0;
        while (c2349dV != null) {
            if (pVar3 == null) {
                pVar3 = (a0.p) c2349dV.f17660G.f7176f;
            }
            if ((pVar3.f10405n & 16) != 0) {
                while (pVar3 != null) {
                    if ((pVar3.f10404m & 16) != 0) {
                        AbstractC2367n abstractC2367nF = pVar3;
                        ?? dVar = 0;
                        while (abstractC2367nF != 0) {
                            if (abstractC2367nF instanceof y0.j0) {
                                y0.j0 j0Var = (y0.j0) abstractC2367nF;
                                if (j0Var instanceof C1955C) {
                                    ((C1955C) j0Var).I0();
                                }
                            } else if ((abstractC2367nF.f10404m & 16) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                                a0.p pVar4 = abstractC2367nF.f17880y;
                                int i10 = 0;
                                abstractC2367nF = abstractC2367nF;
                                dVar = dVar;
                                while (pVar4 != null) {
                                    if ((pVar4.f10404m & 16) != 0) {
                                        i10++;
                                        dVar = dVar;
                                        if (i10 == 1) {
                                            abstractC2367nF = pVar4;
                                        } else {
                                            if (dVar == 0) {
                                                dVar = new Q.d(new a0.p[16]);
                                            }
                                            if (abstractC2367nF != 0) {
                                                dVar.b(abstractC2367nF);
                                                abstractC2367nF = 0;
                                            }
                                            dVar.b(pVar4);
                                        }
                                    }
                                    pVar4 = pVar4.f10407p;
                                    abstractC2367nF = abstractC2367nF;
                                    dVar = dVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC2367nF = AbstractC2359f.f(dVar);
                        }
                    }
                    pVar3 = pVar3.f10407p;
                }
            }
            Q.d dVarV = c2349dV.v();
            if (!dVarV.k()) {
                if (i9 >= iArrCopyOf.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                    kotlin.jvm.internal.l.e("copyOf(this, newSize)", iArrCopyOf);
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf);
                    dVarArr = (Q.d[]) objArrCopyOf;
                }
                iArrCopyOf[i9] = dVarV.f7829m - 1;
                dVarArr[i9] = dVarV;
                i9++;
            }
            if (i9 <= 0 || (i8 = iArrCopyOf[i9 - 1]) < 0) {
                c2349dV = null;
            } else {
                if (i9 <= 0) {
                    throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
                }
                Q.d dVar2 = dVarArr[i7];
                kotlin.jvm.internal.l.c(dVar2);
                if (i8 > 0) {
                    iArrCopyOf[i7] = iArrCopyOf[i7] - 1;
                } else if (i8 == 0) {
                    dVarArr[i7] = null;
                    i9--;
                }
                c2349dV = (C2349D) dVar2.f7827k[i8];
            }
            pVar3 = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j7) {
        this.f18875b0 = j7;
    }

    public final void setOnViewTreeOwnersAvailable(e4.k kVar) {
        C2454l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            kVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f18881h0 = kVar;
    }

    public void setShowLayoutBounds(boolean z7) {
        this.f18863M = z7;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final g0.d t() {
        if (isFocused()) {
            C0866s c0866sG = AbstractC0851d.g(((androidx.compose.ui.focus.b) getFocusOwner()).f10654f);
            if (c0866sG != null) {
                return AbstractC0851d.j(c0866sG);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return AbstractC0851d.d(viewFindFocus);
        }
        return null;
    }

    public final void u(C2349D c2349d) {
        F f5 = this.f18907w;
        f5.f18621y = true;
        if (f5.x()) {
            f5.z(c2349d);
        }
        ViewOnAttachStateChangeListenerC0746c viewOnAttachStateChangeListenerC0746c = this.f18909x;
        viewOnAttachStateChangeListenerC0746c.f11128r = true;
        if (viewOnAttachStateChangeListenerC0746c.d() && viewOnAttachStateChangeListenerC0746c.f11129s.add(c2349d)) {
            viewOnAttachStateChangeListenerC0746c.f11130t.mo2trySendJP2dKIU(O3.C.a);
        }
    }

    public final void v(C2349D c2349d, boolean z7, boolean z8, boolean z9) {
        C2349D c2349dS;
        C2349D c2349dS2;
        y0.I i7;
        C2350E c2350e;
        y0.Q q6 = this.f18868R;
        if (!z7) {
            if (q6.o(c2349d, z8) && z9) {
                A(c2349d);
                return;
            }
            return;
        }
        q6.getClass();
        if (c2349d.f17673m == null) {
            AbstractC0905c.C("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            throw null;
        }
        y0.K k7 = c2349d.f17661H;
        int iB = AbstractC1755i.b(k7.f17746c);
        if (iB != 0) {
            if (iB == 1) {
                return;
            }
            if (iB != 2 && iB != 3) {
                if (iB != 4) {
                    throw new D6.r();
                }
                if (!k7.f17750g || z8) {
                    k7.f17750g = true;
                    k7.f17747d = true;
                    if (c2349d.f17668Q) {
                        return;
                    }
                    boolean zA = kotlin.jvm.internal.l.a(c2349d.G(), Boolean.TRUE);
                    n5.P p7 = q6.f17784b;
                    if ((zA || (k7.f17750g && (c2349d.q() == 1 || !((i7 = k7.f17762s) == null || (c2350e = i7.f17701A) == null || !c2350e.e())))) && ((c2349dS = c2349d.s()) == null || !c2349dS.f17661H.f17750g)) {
                        p7.g(c2349d, true);
                    } else if ((c2349d.F() || (k7.f17747d && y0.Q.h(c2349d))) && ((c2349dS2 = c2349d.s()) == null || !c2349dS2.f17661H.f17747d)) {
                        p7.g(c2349d, false);
                    }
                    if (q6.f17786d || !z9) {
                        return;
                    }
                    A(c2349d);
                    return;
                }
                return;
            }
        }
        q6.f17790h.b(new y0.P(c2349d, true, z8));
    }

    public final void w(C2349D c2349d, boolean z7, boolean z8) {
        y0.Q q6 = this.f18868R;
        if (!z7) {
            q6.getClass();
            int iB = AbstractC1755i.b(c2349d.f17661H.f17746c);
            if (iB == 0 || iB == 1 || iB == 2 || iB == 3) {
                return;
            }
            if (iB != 4) {
                throw new D6.r();
            }
            y0.K k7 = c2349d.f17661H;
            if (!z8 && c2349d.F() == k7.f17761r.f17722C && (k7.f17747d || k7.f17748e)) {
                return;
            }
            k7.f17748e = true;
            k7.f17749f = true;
            if (!c2349d.f17668Q && k7.f17761r.f17722C) {
                C2349D c2349dS = c2349d.s();
                if ((c2349dS == null || !c2349dS.f17661H.f17748e) && (c2349dS == null || !c2349dS.f17661H.f17747d)) {
                    q6.f17784b.g(c2349d, false);
                }
                if (q6.f17786d) {
                    return;
                }
                A(null);
                return;
            }
            return;
        }
        q6.getClass();
        int iB2 = AbstractC1755i.b(c2349d.f17661H.f17746c);
        if (iB2 != 0) {
            if (iB2 == 1) {
                return;
            }
            if (iB2 != 2) {
                if (iB2 == 3) {
                    return;
                }
                if (iB2 != 4) {
                    throw new D6.r();
                }
            }
        }
        y0.K k8 = c2349d.f17661H;
        if ((k8.f17750g || k8.f17751h) && !z8) {
            return;
        }
        k8.f17751h = true;
        k8.f17752i = true;
        k8.f17748e = true;
        k8.f17749f = true;
        if (c2349d.f17668Q) {
            return;
        }
        C2349D c2349dS2 = c2349d.s();
        boolean zA = kotlin.jvm.internal.l.a(c2349d.G(), Boolean.TRUE);
        n5.P p7 = q6.f17784b;
        if (zA && ((c2349dS2 == null || !c2349dS2.f17661H.f17750g) && (c2349dS2 == null || !c2349dS2.f17661H.f17751h))) {
            p7.g(c2349d, true);
        } else if (c2349d.F() && ((c2349dS2 == null || !c2349dS2.f17661H.f17748e) && (c2349dS2 == null || !c2349dS2.f17661H.f17747d))) {
            p7.g(c2349d, false);
        }
        if (q6.f17786d) {
            return;
        }
        A(null);
    }

    public final void x() {
        F f5 = this.f18907w;
        f5.f18621y = true;
        if (f5.x() && !f5.J) {
            f5.J = true;
            f5.f18608l.post(f5.f18597K);
        }
        ViewOnAttachStateChangeListenerC0746c viewOnAttachStateChangeListenerC0746c = this.f18909x;
        viewOnAttachStateChangeListenerC0746c.f11128r = true;
        if (!viewOnAttachStateChangeListenerC0746c.d() || viewOnAttachStateChangeListenerC0746c.f11136z) {
            return;
        }
        viewOnAttachStateChangeListenerC0746c.f11136z = true;
        viewOnAttachStateChangeListenerC0746c.f11131u.post(viewOnAttachStateChangeListenerC0746c.f11120A);
    }

    public final void y() {
        if (this.f18876c0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f18875b0) {
            this.f18875b0 = jCurrentAnimationTimeMillis;
            InterfaceC2443f0 interfaceC2443f0 = this.f18855F0;
            float[] fArr = this.f18873W;
            interfaceC2443f0.b(this, fArr);
            O.t(fArr, this.f18874a0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f18871U;
            view.getLocationOnScreen(iArr);
            float f5 = iArr[0];
            float f7 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f18877d0 = AbstractC0832b.e(f5 - iArr[0], f7 - iArr[1]);
        }
    }

    public final void z(y0.d0 d0Var) {
        n5.P p7;
        Reference referencePoll;
        Q.d dVar;
        if (this.f18865O != null) {
            L.N0 n02 = U0.f18686z;
        }
        do {
            p7 = this.f18914z0;
            referencePoll = ((ReferenceQueue) p7.f13379m).poll();
            dVar = (Q.d) p7.f13378l;
            if (referencePoll != null) {
                dVar.m(referencePoll);
            }
        } while (referencePoll != null);
        dVar.b(new WeakReference(d0Var, (ReferenceQueue) p7.f13379m));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        kotlin.jvm.internal.l.c(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i7, layoutParams, true);
    }

    public C2444g getAccessibilityManager() {
        return this.f18911y;
    }

    public C2446h getClipboardManager() {
        return this.f18861K;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, int i8) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i7;
        layoutParamsGenerateDefaultLayoutParams.height = i8;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i7, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @InterfaceC0554c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
