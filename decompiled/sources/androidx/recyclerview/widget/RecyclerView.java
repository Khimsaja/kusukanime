package androidx.recyclerview.widget;

import A.e;
import B1.C0017d;
import B2.l;
import D.P0;
import F.w;
import J2.a;
import K2.A;
import K2.C;
import K2.C0297a;
import K2.C0298b;
import K2.C0305i;
import K2.C0310n;
import K2.C0311o;
import K2.C0321z;
import K2.D;
import K2.E;
import K2.H;
import K2.I;
import K2.InterpolatorC0320y;
import K2.J;
import K2.K;
import K2.L;
import K2.M;
import K2.N;
import K2.O;
import K2.Q;
import K2.RunnableC0306j;
import K2.RunnableC0313q;
import K2.S;
import K2.T;
import K2.U;
import K2.V;
import K2.W;
import K2.Y;
import K2.f0;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import b1.AbstractC0702a;
import f1.AbstractC0870c;
import f1.AbstractC0872e;
import i1.AbstractC1061n;
import i1.AbstractC1063p;
import i1.AbstractC1067u;
import i1.AbstractC1068v;
import i1.C1051d;
import i1.r;
import io.ktor.sse.ServerSentEventKt;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import m.C1477G;
import m.C1492m;
import p.AbstractC1755i;
import z0.Q0;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: G0, reason: collision with root package name */
    public static final int[] f10803G0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: H0, reason: collision with root package name */
    public static final float f10804H0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: I0, reason: collision with root package name */
    public static final boolean f10805I0 = true;

    /* renamed from: J0, reason: collision with root package name */
    public static final boolean f10806J0 = true;

    /* renamed from: K0, reason: collision with root package name */
    public static final Class[] f10807K0;

    /* renamed from: L0, reason: collision with root package name */
    public static final InterpolatorC0320y f10808L0;

    /* renamed from: M0, reason: collision with root package name */
    public static final T f10809M0;

    /* renamed from: A, reason: collision with root package name */
    public C0310n f10810A;
    public final ArrayList A0;

    /* renamed from: B, reason: collision with root package name */
    public boolean f10811B;

    /* renamed from: B0, reason: collision with root package name */
    public final RunnableC0306j f10812B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f10813C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f10814C0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f10815D;

    /* renamed from: D0, reason: collision with root package name */
    public int f10816D0;

    /* renamed from: E, reason: collision with root package name */
    public int f10817E;

    /* renamed from: E0, reason: collision with root package name */
    public int f10818E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f10819F;

    /* renamed from: F0, reason: collision with root package name */
    public final C0321z f10820F0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f10821G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f10822H;
    public int I;
    public final AccessibilityManager J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f10823K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f10824L;

    /* renamed from: M, reason: collision with root package name */
    public int f10825M;

    /* renamed from: N, reason: collision with root package name */
    public int f10826N;

    /* renamed from: O, reason: collision with root package name */
    public D f10827O;

    /* renamed from: P, reason: collision with root package name */
    public EdgeEffect f10828P;

    /* renamed from: Q, reason: collision with root package name */
    public EdgeEffect f10829Q;

    /* renamed from: R, reason: collision with root package name */
    public EdgeEffect f10830R;

    /* renamed from: S, reason: collision with root package name */
    public EdgeEffect f10831S;

    /* renamed from: T, reason: collision with root package name */
    public E f10832T;

    /* renamed from: U, reason: collision with root package name */
    public int f10833U;

    /* renamed from: V, reason: collision with root package name */
    public int f10834V;

    /* renamed from: W, reason: collision with root package name */
    public VelocityTracker f10835W;

    /* renamed from: a0, reason: collision with root package name */
    public int f10836a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f10837b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f10838c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f10839d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f10840e0;

    /* renamed from: f0, reason: collision with root package name */
    public final int f10841f0;

    /* renamed from: g0, reason: collision with root package name */
    public final int f10842g0;

    /* renamed from: h0, reason: collision with root package name */
    public final float f10843h0;

    /* renamed from: i0, reason: collision with root package name */
    public final float f10844i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f10845j0;

    /* renamed from: k, reason: collision with root package name */
    public final float f10846k;

    /* renamed from: k0, reason: collision with root package name */
    public final V f10847k0;

    /* renamed from: l, reason: collision with root package name */
    public final e f10848l;

    /* renamed from: l0, reason: collision with root package name */
    public RunnableC0313q f10849l0;

    /* renamed from: m, reason: collision with root package name */
    public final N f10850m;

    /* renamed from: m0, reason: collision with root package name */
    public final C0311o f10851m0;

    /* renamed from: n, reason: collision with root package name */
    public Q f10852n;

    /* renamed from: n0, reason: collision with root package name */
    public final S f10853n0;

    /* renamed from: o, reason: collision with root package name */
    public final C0017d f10854o;

    /* renamed from: o0, reason: collision with root package name */
    public K f10855o0;

    /* renamed from: p, reason: collision with root package name */
    public final l f10856p;

    /* renamed from: p0, reason: collision with root package name */
    public ArrayList f10857p0;

    /* renamed from: q, reason: collision with root package name */
    public final w f10858q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f10859q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10860r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f10861r0;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f10862s;

    /* renamed from: s0, reason: collision with root package name */
    public final C0321z f10863s0;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f10864t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f10865t0;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f10866u;

    /* renamed from: u0, reason: collision with root package name */
    public Y f10867u0;

    /* renamed from: v, reason: collision with root package name */
    public A f10868v;
    public final int[] v0;

    /* renamed from: w, reason: collision with root package name */
    public H f10869w;

    /* renamed from: w0, reason: collision with root package name */
    public C1051d f10870w0;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f10871x;

    /* renamed from: x0, reason: collision with root package name */
    public final int[] f10872x0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f10873y;

    /* renamed from: y0, reason: collision with root package name */
    public final int[] f10874y0;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f10875z;

    /* renamed from: z0, reason: collision with root package name */
    public final int[] f10876z0;

    static {
        Class cls = Integer.TYPE;
        f10807K0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f10808L0 = new InterpolatorC0320y();
        f10809M0 = new T();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        float fA;
        AttributeSet attributeSet2;
        char c2;
        int i7;
        char c4;
        TypedArray typedArray;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, com.kusukanime.R.attr.recyclerViewStyle);
        int i8 = 1;
        this.f10848l = new e(16);
        this.f10850m = new N(this);
        this.f10858q = new w(27);
        this.f10862s = new Rect();
        this.f10864t = new Rect();
        this.f10866u = new RectF();
        this.f10871x = new ArrayList();
        this.f10873y = new ArrayList();
        this.f10875z = new ArrayList();
        this.f10817E = 0;
        this.f10823K = false;
        this.f10824L = false;
        this.f10825M = 0;
        this.f10826N = 0;
        this.f10827O = f10809M0;
        C0305i c0305i = new C0305i();
        c0305i.a = null;
        c0305i.f4462b = new ArrayList();
        c0305i.f4463c = 120L;
        c0305i.f4464d = 120L;
        c0305i.f4465e = 250L;
        c0305i.f4466f = 250L;
        c0305i.f4606g = true;
        c0305i.f4607h = new ArrayList();
        c0305i.f4608i = new ArrayList();
        c0305i.f4609j = new ArrayList();
        c0305i.f4610k = new ArrayList();
        c0305i.f4611l = new ArrayList();
        c0305i.f4612m = new ArrayList();
        c0305i.f4613n = new ArrayList();
        c0305i.f4614o = new ArrayList();
        c0305i.f4615p = new ArrayList();
        c0305i.f4616q = new ArrayList();
        c0305i.f4617r = new ArrayList();
        this.f10832T = c0305i;
        this.f10833U = 0;
        this.f10834V = -1;
        this.f10843h0 = Float.MIN_VALUE;
        this.f10844i0 = Float.MIN_VALUE;
        this.f10845j0 = true;
        this.f10847k0 = new V(this);
        this.f10851m0 = f10806J0 ? new C0311o() : null;
        S s7 = new S();
        s7.a = 0;
        s7.f4500b = 0;
        s7.f4501c = 1;
        s7.f4502d = 0;
        s7.f4503e = false;
        s7.f4504f = false;
        s7.f4505g = false;
        s7.f4506h = false;
        s7.f4507i = false;
        s7.f4508j = false;
        this.f10853n0 = s7;
        this.f10859q0 = false;
        this.f10861r0 = false;
        C0321z c0321z = new C0321z(this);
        this.f10863s0 = c0321z;
        this.f10865t0 = false;
        this.v0 = new int[2];
        this.f10872x0 = new int[2];
        this.f10874y0 = new int[2];
        this.f10876z0 = new int[2];
        this.A0 = new ArrayList();
        this.f10812B0 = new RunnableC0306j(i8, this);
        this.f10816D0 = 0;
        this.f10818E0 = 0;
        this.f10820F0 = new C0321z(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f10840e0 = viewConfiguration.getScaledTouchSlop();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            Method method = AbstractC1068v.a;
            fA = AbstractC0702a.a(viewConfiguration);
        } else {
            fA = AbstractC1068v.a(viewConfiguration, context);
        }
        this.f10843h0 = fA;
        this.f10844i0 = i9 >= 26 ? AbstractC0702a.b(viewConfiguration) : AbstractC1068v.a(viewConfiguration, context);
        this.f10841f0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10842g0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f10846k = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f10832T.a = c0321z;
        this.f10854o = new C0017d(new C0321z(this));
        this.f10856p = new l(new C0321z(this));
        Field field = AbstractC1067u.a;
        if ((i9 >= 26 ? AbstractC1063p.a(this) : 0) == 0 && i9 >= 26) {
            AbstractC1063p.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.J = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new Y(this));
        int[] iArr = a.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.kusukanime.R.attr.recyclerViewStyle, 0);
        if (i9 >= 29) {
            r.b(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, com.kusukanime.R.attr.recyclerViewStyle, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f10860r = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + w());
            }
            Resources resources = getContext().getResources();
            c2 = 3;
            c4 = 2;
            typedArray = typedArrayObtainStyledAttributes;
            i7 = 4;
            attributeSet2 = attributeSet;
            new C0310n(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.kusukanime.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.kusukanime.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.kusukanime.R.dimen.fastscroll_margin));
        } else {
            attributeSet2 = attributeSet;
            c2 = 3;
            i7 = 4;
            c4 = 2;
            typedArray = typedArrayObtainStyledAttributes;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(H.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f10807K0);
                        objArr = new Object[i7];
                        objArr[0] = context;
                        objArr[1] = attributeSet2;
                        objArr[c4] = Integer.valueOf(com.kusukanime.R.attr.recyclerViewStyle);
                        objArr[c2] = 0;
                    } catch (NoSuchMethodException e7) {
                        try {
                            constructor = clsAsSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e8) {
                            e8.initCause(e7);
                            throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Error creating LayoutManager " + str, e8);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((H) constructor.newInstance(objArr));
                } catch (ClassCastException e9) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Class is not a LayoutManager " + str, e9);
                } catch (ClassNotFoundException e10) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Unable to find LayoutManager " + str, e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Cannot access non-public constructor " + str, e11);
                } catch (InstantiationException e12) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                }
            }
        }
        int[] iArr2 = f10803G0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, iArr2, com.kusukanime.R.attr.recyclerViewStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            r.b(this, context, iArr2, attributeSet2, typedArrayObtainStyledAttributes2, com.kusukanime.R.attr.recyclerViewStyle, 0);
        }
        boolean z7 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z7);
        setTag(com.kusukanime.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView B(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            RecyclerView recyclerViewB = B(viewGroup.getChildAt(i7));
            if (recyclerViewB != null) {
                return recyclerViewB;
            }
        }
        return null;
    }

    public static W F(View view) {
        if (view == null) {
            return null;
        }
        return ((I) view.getLayoutParams()).a;
    }

    public static void g(W w7) {
        WeakReference weakReference = w7.f4520b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == w7.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            w7.f4520b = null;
        }
    }

    private C1051d getScrollingChildHelper() {
        if (this.f10870w0 == null) {
            this.f10870w0 = new C1051d(this);
        }
        return this.f10870w0;
    }

    public static int j(int i7, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i8) {
        if (i7 > 0 && edgeEffect != null && AbstractC0870c.S(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC0870c.a0(edgeEffect, ((-i7) * 4.0f) / i8, 0.5f) * ((-i8) / 4.0f));
            if (iRound != i7) {
                edgeEffect.finish();
            }
            return i7 - iRound;
        }
        if (i7 >= 0 || edgeEffect2 == null || AbstractC0870c.S(edgeEffect2) == 0.0f) {
            return i7;
        }
        float f5 = i8;
        int iRound2 = Math.round(AbstractC0870c.a0(edgeEffect2, (i7 * 4.0f) / f5, 0.5f) * (f5 / 4.0f));
        if (iRound2 != i7) {
            edgeEffect2.finish();
        }
        return i7 - iRound2;
    }

    public final void A(int[] iArr) {
        int iV = this.f10856p.v();
        if (iV == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        for (int i9 = 0; i9 < iV; i9++) {
            W wF = F(this.f10856p.u(i9));
            if (!wF.n()) {
                int iB = wF.b();
                if (iB < i7) {
                    i7 = iB;
                }
                if (iB > i8) {
                    i8 = iB;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
    }

    public final W C(int i7) {
        W w7 = null;
        if (this.f10823K) {
            return null;
        }
        int iC = this.f10856p.C();
        for (int i8 = 0; i8 < iC; i8++) {
            W wF = F(this.f10856p.B(i8));
            if (wF != null && !wF.g() && D(wF) == i7) {
                if (!((ArrayList) this.f10856p.f418n).contains(wF.a)) {
                    return wF;
                }
                w7 = wF;
            }
        }
        return w7;
    }

    public final int D(W w7) {
        if (((w7.f4527i & 524) != 0) || !w7.d()) {
            return -1;
        }
        C0017d c0017d = this.f10854o;
        int i7 = w7.f4521c;
        ArrayList arrayList = (ArrayList) c0017d.f319m;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C0297a c0297a = (C0297a) arrayList.get(i8);
            int i9 = c0297a.a;
            if (i9 != 1) {
                if (i9 == 2) {
                    int i10 = c0297a.f4547b;
                    if (i10 <= i7) {
                        int i11 = c0297a.f4548c;
                        if (i10 + i11 > i7) {
                            return -1;
                        }
                        i7 -= i11;
                    } else {
                        continue;
                    }
                } else if (i9 == 8) {
                    int i12 = c0297a.f4547b;
                    if (i12 == i7) {
                        i7 = c0297a.f4548c;
                    } else {
                        if (i12 < i7) {
                            i7--;
                        }
                        if (c0297a.f4548c <= i7) {
                            i7++;
                        }
                    }
                }
            } else if (c0297a.f4547b <= i7) {
                i7 += c0297a.f4548c;
            }
        }
        return i7;
    }

    public final W E(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return F(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect G(View view) {
        I i7 = (I) view.getLayoutParams();
        boolean z7 = i7.f4485c;
        Rect rect = i7.f4484b;
        if (!z7 || (this.f10853n0.f4504f && (i7.a.j() || i7.a.e()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f10873y;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Rect rect2 = this.f10862s;
            rect2.set(0, 0, 0, 0);
            ((C0310n) arrayList.get(i8)).getClass();
            ((I) view.getLayoutParams()).a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        i7.f4485c = false;
        return rect;
    }

    public final boolean H() {
        return !this.f10815D || this.f10823K || ((ArrayList) this.f10854o.f319m).size() > 0;
    }

    public final boolean I() {
        return this.f10825M > 0;
    }

    public final void J() {
        int iC = this.f10856p.C();
        for (int i7 = 0; i7 < iC; i7++) {
            ((I) this.f10856p.B(i7).getLayoutParams()).f4485c = true;
        }
        ArrayList arrayList = this.f10850m.f4493c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            I i9 = (I) ((W) arrayList.get(i8)).a.getLayoutParams();
            if (i9 != null) {
                i9.f4485c = true;
            }
        }
    }

    public final void K(int i7, int i8, boolean z7) {
        int i9 = i7 + i8;
        int iC = this.f10856p.C();
        for (int i10 = 0; i10 < iC; i10++) {
            W wF = F(this.f10856p.B(i10));
            if (wF != null && !wF.n()) {
                int i11 = wF.f4521c;
                S s7 = this.f10853n0;
                if (i11 >= i9) {
                    wF.k(-i8, z7);
                    s7.f4503e = true;
                } else if (i11 >= i7) {
                    wF.a(8);
                    wF.k(-i8, z7);
                    wF.f4521c = i7 - 1;
                    s7.f4503e = true;
                }
            }
        }
        N n7 = this.f10850m;
        ArrayList arrayList = n7.f4493c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            W w7 = (W) arrayList.get(size);
            if (w7 != null) {
                int i12 = w7.f4521c;
                if (i12 >= i9) {
                    w7.k(-i8, z7);
                } else if (i12 >= i7) {
                    w7.a(8);
                    n7.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void L() {
        this.f10825M++;
    }

    public final void M(boolean z7) {
        int i7;
        AccessibilityManager accessibilityManager;
        int i8 = this.f10825M - 1;
        this.f10825M = i8;
        if (i8 < 1) {
            this.f10825M = 0;
            if (z7) {
                int i9 = this.I;
                this.I = 0;
                if (i9 != 0 && (accessibilityManager = this.J) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i9);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.A0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    W w7 = (W) arrayList.get(size);
                    if (w7.a.getParent() == this && !w7.n() && (i7 = w7.f4534p) != -1) {
                        Field field = AbstractC1067u.a;
                        w7.a.setImportantForAccessibility(i7);
                        w7.f4534p = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void N(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f10834V) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f10834V = motionEvent.getPointerId(i7);
            int x7 = (int) (motionEvent.getX(i7) + 0.5f);
            this.f10838c0 = x7;
            this.f10836a0 = x7;
            int y7 = (int) (motionEvent.getY(i7) + 0.5f);
            this.f10839d0 = y7;
            this.f10837b0 = y7;
        }
    }

    public final void O() {
        if (this.f10865t0 || !this.f10811B) {
            return;
        }
        Field field = AbstractC1067u.a;
        postOnAnimation(this.f10812B0);
        this.f10865t0 = true;
    }

    public final void P(W w7, P0 p02) {
        w7.f4527i &= -8193;
        boolean z7 = this.f10853n0.f4505g;
        w wVar = this.f10858q;
        if (z7 && w7.j() && !w7.g() && !w7.n()) {
            this.f10868v.getClass();
            ((C1492m) wVar.f2038m).d(w7.f4521c, w7);
        }
        C1477G c1477g = (C1477G) wVar.f2037l;
        f0 f0VarA = (f0) c1477g.get(w7);
        if (f0VarA == null) {
            f0VarA = f0.a();
            c1477g.put(w7, f0VarA);
        }
        f0VarA.f4594b = p02;
        f0VarA.a |= 4;
    }

    public final int Q(float f5, int i7) {
        float height = f5 / getHeight();
        float width = i7 / getWidth();
        EdgeEffect edgeEffect = this.f10828P;
        float f7 = 0.0f;
        if (edgeEffect == null || AbstractC0870c.S(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f10830R;
            if (edgeEffect2 != null && AbstractC0870c.S(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f10830R.onRelease();
                } else {
                    float fA0 = AbstractC0870c.a0(this.f10830R, width, height);
                    if (AbstractC0870c.S(this.f10830R) == 0.0f) {
                        this.f10830R.onRelease();
                    }
                    f7 = fA0;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f10828P.onRelease();
            } else {
                float f8 = -AbstractC0870c.a0(this.f10828P, -width, 1.0f - height);
                if (AbstractC0870c.S(this.f10828P) == 0.0f) {
                    this.f10828P.onRelease();
                }
                f7 = f8;
            }
            invalidate();
        }
        return Math.round(f7 * getWidth());
    }

    public final int R(float f5, int i7) {
        float width = f5 / getWidth();
        float height = i7 / getHeight();
        EdgeEffect edgeEffect = this.f10829Q;
        float f7 = 0.0f;
        if (edgeEffect == null || AbstractC0870c.S(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f10831S;
            if (edgeEffect2 != null && AbstractC0870c.S(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f10831S.onRelease();
                } else {
                    float fA0 = AbstractC0870c.a0(this.f10831S, height, 1.0f - width);
                    if (AbstractC0870c.S(this.f10831S) == 0.0f) {
                        this.f10831S.onRelease();
                    }
                    f7 = fA0;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f10829Q.onRelease();
            } else {
                float f8 = -AbstractC0870c.a0(this.f10829Q, -height, width);
                if (AbstractC0870c.S(this.f10829Q) == 0.0f) {
                    this.f10829Q.onRelease();
                }
                f7 = f8;
            }
            invalidate();
        }
        return Math.round(f7 * getHeight());
    }

    public final void S(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f10862s;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof I) {
            I i7 = (I) layoutParams;
            if (!i7.f4485c) {
                int i8 = rect.left;
                Rect rect2 = i7.f4484b;
                rect.left = i8 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f10869w.g0(this, view, this.f10862s, !this.f10815D, view2 == null);
    }

    public final void T() {
        VelocityTracker velocityTracker = this.f10835W;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        a0(0);
        EdgeEffect edgeEffect = this.f10828P;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f10828P.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f10829Q;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f10829Q.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f10830R;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f10830R.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f10831S;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f10831S.isFinished();
        }
        if (zIsFinished) {
            Field field = AbstractC1067u.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.U(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void V(int i7, int i8, int[] iArr) {
        W w7;
        l lVar = this.f10856p;
        Y();
        L();
        int i9 = AbstractC0872e.a;
        Trace.beginSection("RV Scroll");
        S s7 = this.f10853n0;
        x(s7);
        N n7 = this.f10850m;
        int iI0 = i7 != 0 ? this.f10869w.i0(i7, n7, s7) : 0;
        int iJ0 = i8 != 0 ? this.f10869w.j0(i8, n7, s7) : 0;
        Trace.endSection();
        int iV = lVar.v();
        for (int i10 = 0; i10 < iV; i10++) {
            View viewU = lVar.u(i10);
            W wE = E(viewU);
            if (wE != null && (w7 = wE.f4526h) != null) {
                int left = viewU.getLeft();
                int top = viewU.getTop();
                View view = w7.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        M(true);
        Z(false);
        if (iArr != null) {
            iArr[0] = iI0;
            iArr[1] = iJ0;
        }
    }

    public final boolean W(EdgeEffect edgeEffect, int i7, int i8) {
        if (i7 > 0) {
            return true;
        }
        float fS = AbstractC0870c.S(edgeEffect) * i8;
        float fAbs = Math.abs(-i7) * 0.35f;
        float f5 = this.f10846k * 0.015f;
        double dLog = Math.log(fAbs / f5);
        double d4 = f10804H0;
        return ((float) (Math.exp((d4 / (d4 - 1.0d)) * dLog) * ((double) f5))) < fS;
    }

    public final void X(int i7, int i8, boolean z7) {
        H h7 = this.f10869w;
        if (h7 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f10821G) {
            return;
        }
        int i9 = !h7.c() ? 0 : i7;
        int i10 = !this.f10869w.d() ? 0 : i8;
        if (i9 == 0 && i10 == 0) {
            return;
        }
        if (z7) {
            int i11 = i9 != 0 ? 1 : 0;
            if (i10 != 0) {
                i11 |= 2;
            }
            getScrollingChildHelper().d(i11, 1);
        }
        V v5 = this.f10847k0;
        RecyclerView recyclerView = v5.f4518q;
        int iAbs = Math.abs(i9);
        int iAbs2 = Math.abs(i10);
        boolean z8 = iAbs > iAbs2;
        int width = z8 ? recyclerView.getWidth() : recyclerView.getHeight();
        if (!z8) {
            iAbs = iAbs2;
        }
        int iMin = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        Interpolator interpolator = v5.f4515n;
        InterpolatorC0320y interpolatorC0320y = f10808L0;
        if (interpolator != interpolatorC0320y) {
            v5.f4515n = interpolatorC0320y;
            v5.f4514m = new OverScroller(recyclerView.getContext(), interpolatorC0320y);
        }
        v5.f4513l = 0;
        v5.f4512k = 0;
        recyclerView.setScrollState(2);
        v5.f4514m.startScroll(0, 0, i9, i10, iMin);
        if (v5.f4516o) {
            v5.f4517p = true;
            return;
        }
        RecyclerView recyclerView2 = v5.f4518q;
        recyclerView2.removeCallbacks(v5);
        Field field = AbstractC1067u.a;
        recyclerView2.postOnAnimation(v5);
    }

    public final void Y() {
        int i7 = this.f10817E + 1;
        this.f10817E = i7;
        if (i7 != 1 || this.f10821G) {
            return;
        }
        this.f10819F = false;
    }

    public final void Z(boolean z7) {
        if (this.f10817E < 1) {
            this.f10817E = 1;
        }
        if (!z7 && !this.f10821G) {
            this.f10819F = false;
        }
        if (this.f10817E == 1) {
            if (z7 && this.f10819F && !this.f10821G && this.f10869w != null && this.f10868v != null) {
                m();
            }
            if (!this.f10821G) {
                this.f10819F = false;
            }
        }
        this.f10817E--;
    }

    public final void a0(int i7) {
        getScrollingChildHelper().e(i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i7, int i8) {
        H h7 = this.f10869w;
        if (h7 != null) {
            h7.getClass();
        }
        super.addFocusables(arrayList, i7, i8);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof I) && this.f10869w.e((I) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        H h7 = this.f10869w;
        if (h7 != null && h7.c()) {
            return this.f10869w.i(this.f10853n0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        H h7 = this.f10869w;
        if (h7 != null && h7.c()) {
            return this.f10869w.j(this.f10853n0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        H h7 = this.f10869w;
        if (h7 != null && h7.c()) {
            return this.f10869w.k(this.f10853n0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        H h7 = this.f10869w;
        if (h7 != null && h7.d()) {
            return this.f10869w.l(this.f10853n0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        H h7 = this.f10869w;
        if (h7 != null && h7.d()) {
            return this.f10869w.m(this.f10853n0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        H h7 = this.f10869w;
        if (h7 != null && h7.d()) {
            return this.f10869w.n(this.f10853n0);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f5, float f7, boolean z7) {
        ViewParent viewParentC;
        C1051d scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f11971d && (viewParentC = scrollingChildHelper.c(0)) != null) {
            try {
                return viewParentC.onNestedFling(scrollingChildHelper.f11970c, f5, f7, z7);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedFling", e7);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f5, float f7) {
        ViewParent viewParentC;
        C1051d scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f11971d && (viewParentC = scrollingChildHelper.c(0)) != null) {
            try {
                return viewParentC.onNestedPreFling(scrollingChildHelper.f11970c, f5, f7);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedPreFling", e7);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i7, i8, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return getScrollingChildHelper().b(i7, i8, i9, i10, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z7;
        super.draw(canvas);
        ArrayList arrayList = this.f10873y;
        int size = arrayList.size();
        boolean z8 = false;
        for (int i7 = 0; i7 < size; i7++) {
            C0310n c0310n = (C0310n) arrayList.get(i7);
            if (c0310n.f4640q != c0310n.f4642s.getWidth() || c0310n.f4641r != c0310n.f4642s.getHeight()) {
                c0310n.f4640q = c0310n.f4642s.getWidth();
                c0310n.f4641r = c0310n.f4642s.getHeight();
                c0310n.d(0);
            } else if (c0310n.f4623A != 0) {
                if (c0310n.f4643t) {
                    int i8 = c0310n.f4640q;
                    int i9 = c0310n.f4628e;
                    int i10 = i8 - i9;
                    int i11 = c0310n.f4635l;
                    int i12 = c0310n.f4634k;
                    int i13 = i11 - (i12 / 2);
                    StateListDrawable stateListDrawable = c0310n.f4626c;
                    stateListDrawable.setBounds(0, 0, i9, i12);
                    int i14 = c0310n.f4641r;
                    Drawable drawable = c0310n.f4627d;
                    drawable.setBounds(0, 0, c0310n.f4629f, i14);
                    RecyclerView recyclerView = c0310n.f4642s;
                    Field field = AbstractC1067u.a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i9, i13);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i9, -i13);
                    } else {
                        canvas.translate(i10, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i13);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i10, -i13);
                    }
                }
                if (c0310n.f4644u) {
                    int i15 = c0310n.f4641r;
                    int i16 = c0310n.f4632i;
                    int i17 = i15 - i16;
                    int i18 = c0310n.f4638o;
                    int i19 = c0310n.f4637n;
                    int i20 = i18 - (i19 / 2);
                    StateListDrawable stateListDrawable2 = c0310n.f4630g;
                    stateListDrawable2.setBounds(0, 0, i19, i16);
                    int i21 = c0310n.f4640q;
                    Drawable drawable2 = c0310n.f4631h;
                    drawable2.setBounds(0, 0, i21, c0310n.f4633j);
                    canvas.translate(0.0f, i17);
                    drawable2.draw(canvas);
                    canvas.translate(i20, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i20, -i17);
                }
            }
        }
        EdgeEffect edgeEffect = this.f10828P;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z7 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f10860r ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f10828P;
            z7 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f10829Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f10860r) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f10829Q;
            z7 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f10830R;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f10860r ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f10830R;
            z7 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f10831S;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f10860r) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f10831S;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z8 = true;
            }
            z7 |= z8;
            canvas.restoreToCount(iSave4);
        }
        if ((z7 || this.f10832T == null || arrayList.size() <= 0 || !this.f10832T.f()) ? z7 : true) {
            Field field2 = AbstractC1067u.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        return super.drawChild(canvas, view, j7);
    }

    public final void e(W w7) {
        View view = w7.a;
        boolean z7 = view.getParent() == this;
        this.f10850m.l(E(view));
        if (w7.i()) {
            this.f10856p.k(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z7) {
            this.f10856p.j(view, -1, true);
            return;
        }
        l lVar = this.f10856p;
        int iIndexOfChild = ((C0321z) lVar.f416l).a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C0298b) lVar.f417m).z(iIndexOfChild);
            lVar.F(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void f(String str) {
        if (I()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + w());
        }
        if (this.f10826N > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + w()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0 A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        H h7 = this.f10869w;
        if (h7 != null) {
            return h7.q();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + w());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        H h7 = this.f10869w;
        if (h7 != null) {
            return h7.r(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + w());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public A getAdapter() {
        return this.f10868v;
    }

    @Override // android.view.View
    public int getBaseline() {
        H h7 = this.f10869w;
        if (h7 == null) {
            return super.getBaseline();
        }
        h7.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i8) {
        return super.getChildDrawingOrder(i7, i8);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f10860r;
    }

    public Y getCompatAccessibilityDelegate() {
        return this.f10867u0;
    }

    public D getEdgeEffectFactory() {
        return this.f10827O;
    }

    public E getItemAnimator() {
        return this.f10832T;
    }

    public int getItemDecorationCount() {
        return this.f10873y.size();
    }

    public H getLayoutManager() {
        return this.f10869w;
    }

    public int getMaxFlingVelocity() {
        return this.f10842g0;
    }

    public int getMinFlingVelocity() {
        return this.f10841f0;
    }

    public long getNanoTime() {
        if (f10806J0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public J getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f10845j0;
    }

    public M getRecycledViewPool() {
        return this.f10850m.c();
    }

    public int getScrollState() {
        return this.f10833U;
    }

    public final void h() {
        int iC = this.f10856p.C();
        for (int i7 = 0; i7 < iC; i7++) {
            W wF = F(this.f10856p.B(i7));
            if (!wF.n()) {
                wF.f4522d = -1;
                wF.f4524f = -1;
            }
        }
        N n7 = this.f10850m;
        ArrayList arrayList = n7.f4493c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            W w7 = (W) arrayList.get(i8);
            w7.f4522d = -1;
            w7.f4524f = -1;
        }
        ArrayList arrayList2 = n7.a;
        int size2 = arrayList2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            W w8 = (W) arrayList2.get(i9);
            w8.f4522d = -1;
            w8.f4524f = -1;
        }
        ArrayList arrayList3 = n7.f4492b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i10 = 0; i10 < size3; i10++) {
                W w9 = (W) n7.f4492b.get(i10);
                w9.f4522d = -1;
                w9.f4524f = -1;
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().c(0) != null;
    }

    public final void i(int i7, int i8) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f10828P;
        if (edgeEffect == null || edgeEffect.isFinished() || i7 <= 0) {
            zIsFinished = false;
        } else {
            this.f10828P.onRelease();
            zIsFinished = this.f10828P.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f10830R;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i7 < 0) {
            this.f10830R.onRelease();
            zIsFinished |= this.f10830R.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f10829Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i8 > 0) {
            this.f10829Q.onRelease();
            zIsFinished |= this.f10829Q.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f10831S;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i8 < 0) {
            this.f10831S.onRelease();
            zIsFinished |= this.f10831S.isFinished();
        }
        if (zIsFinished) {
            Field field = AbstractC1067u.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f10811B;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f10821G;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f11971d;
    }

    public final void k() {
        C0017d c0017d = this.f10854o;
        if (!this.f10815D || this.f10823K) {
            int i7 = AbstractC0872e.a;
            Trace.beginSection("RV FullInvalidate");
            m();
            Trace.endSection();
            return;
        }
        if (((ArrayList) c0017d.f319m).size() > 0) {
            c0017d.getClass();
            if (((ArrayList) c0017d.f319m).size() > 0) {
                int i8 = AbstractC0872e.a;
                Trace.beginSection("RV FullInvalidate");
                m();
                Trace.endSection();
            }
        }
    }

    public final void l(int i7, int i8) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = AbstractC1067u.a;
        setMeasuredDimension(H.f(i7, paddingRight, getMinimumWidth()), H.f(i8, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0341  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 1349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n():void");
    }

    public final void o() {
        Y();
        L();
        S s7 = this.f10853n0;
        s7.a(6);
        this.f10854o.s();
        s7.f4502d = this.f10868v.a();
        s7.f4500b = 0;
        if (this.f10852n != null) {
            A a = this.f10868v;
            int iB = AbstractC1755i.b(a.f4461b);
            if (iB == 1 ? a.a() > 0 : iB != 2) {
                Parcelable parcelable = this.f10852n.f4499m;
                if (parcelable != null) {
                    this.f10869w.Z(parcelable);
                }
                this.f10852n = null;
            }
        }
        s7.f4504f = false;
        this.f10869w.X(this.f10850m, s7);
        s7.f4503e = false;
        s7.f4507i = s7.f4507i && this.f10832T != null;
        s7.f4501c = 4;
        M(true);
        Z(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f10825M = r0
            r1 = 1
            r5.f10811B = r1
            boolean r2 = r5.f10815D
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f10815D = r2
            K2.N r2 = r5.f10850m
            r2.d()
            K2.H r2 = r5.f10869w
            if (r2 == 0) goto L23
            r2.f4475f = r1
        L23:
            r5.f10865t0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f10806J0
            if (r0 == 0) goto L78
            java.lang.ThreadLocal r0 = K2.RunnableC0313q.f4657o
            java.lang.Object r1 = r0.get()
            K2.q r1 = (K2.RunnableC0313q) r1
            r5.f10849l0 = r1
            if (r1 != 0) goto L71
            K2.q r1 = new K2.q
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4659k = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4662n = r2
            r5.f10849l0 = r1
            java.lang.reflect.Field r1 = i1.AbstractC1067u.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L63
            if (r1 == 0) goto L63
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L63
            goto L65
        L63:
            r1 = 1114636288(0x42700000, float:60.0)
        L65:
            K2.q r2 = r5.f10849l0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f4661m = r3
            r0.set(r2)
        L71:
            K2.q r0 = r5.f10849l0
            java.util.ArrayList r0 = r0.f4659k
            r0.add(r5)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        N n7;
        RunnableC0313q runnableC0313q;
        super.onDetachedFromWindow();
        E e7 = this.f10832T;
        if (e7 != null) {
            e7.e();
        }
        int i7 = 0;
        setScrollState(0);
        V v5 = this.f10847k0;
        v5.f4518q.removeCallbacks(v5);
        v5.f4514m.abortAnimation();
        this.f10811B = false;
        H h7 = this.f10869w;
        if (h7 != null) {
            h7.f4475f = false;
            h7.M(this);
        }
        this.A0.clear();
        removeCallbacks(this.f10812B0);
        this.f10858q.getClass();
        while (f0.f4593d.b() != null) {
        }
        int i8 = 0;
        while (true) {
            n7 = this.f10850m;
            ArrayList arrayList = n7.f4493c;
            if (i8 >= arrayList.size()) {
                break;
            }
            AbstractC0870c.J(((W) arrayList.get(i8)).a);
            i8++;
        }
        n7.e(n7.f4498h.f10868v, false);
        while (i7 < getChildCount()) {
            int i9 = i7 + 1;
            View childAt = getChildAt(i7);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = AbstractC0870c.V(childAt).a;
            for (int iY = P3.r.y(arrayList2); -1 < iY; iY--) {
                ((Q0) arrayList2.get(iY)).a.e();
            }
            i7 = i9;
        }
        if (!f10806J0 || (runnableC0313q = this.f10849l0) == null) {
            return;
        }
        runnableC0313q.f4659k.remove(this);
        this.f10849l0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f10873y;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C0310n) arrayList.get(i7)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        boolean z8;
        if (!this.f10821G) {
            this.f10810A = null;
            if (z(motionEvent)) {
                T();
                setScrollState(0);
                return true;
            }
            H h7 = this.f10869w;
            if (h7 != null) {
                boolean zC = h7.c();
                boolean zD = this.f10869w.d();
                if (this.f10835W == null) {
                    this.f10835W = VelocityTracker.obtain();
                }
                this.f10835W.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f10822H) {
                        this.f10822H = false;
                    }
                    this.f10834V = motionEvent.getPointerId(0);
                    int x7 = (int) (motionEvent.getX() + 0.5f);
                    this.f10838c0 = x7;
                    this.f10836a0 = x7;
                    int y7 = (int) (motionEvent.getY() + 0.5f);
                    this.f10839d0 = y7;
                    this.f10837b0 = y7;
                    EdgeEffect edgeEffect = this.f10828P;
                    if (edgeEffect == null || AbstractC0870c.S(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z7 = false;
                    } else {
                        AbstractC0870c.a0(this.f10828P, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z7 = true;
                    }
                    EdgeEffect edgeEffect2 = this.f10830R;
                    boolean z9 = z7;
                    if (edgeEffect2 != null) {
                        z9 = z7;
                        if (AbstractC0870c.S(edgeEffect2) != 0.0f) {
                            z9 = z7;
                            if (!canScrollHorizontally(1)) {
                                AbstractC0870c.a0(this.f10830R, 0.0f, motionEvent.getY() / getHeight());
                                z9 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect3 = this.f10829Q;
                    boolean z10 = z9;
                    if (edgeEffect3 != null) {
                        z10 = z9;
                        if (AbstractC0870c.S(edgeEffect3) != 0.0f) {
                            z10 = z9;
                            if (!canScrollVertically(-1)) {
                                AbstractC0870c.a0(this.f10829Q, 0.0f, motionEvent.getX() / getWidth());
                                z10 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect4 = this.f10831S;
                    boolean z11 = z10;
                    if (edgeEffect4 != null) {
                        z11 = z10;
                        if (AbstractC0870c.S(edgeEffect4) != 0.0f) {
                            z11 = z10;
                            if (!canScrollVertically(1)) {
                                AbstractC0870c.a0(this.f10831S, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                                z11 = true;
                            }
                        }
                    }
                    if (z11 || this.f10833U == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        a0(1);
                    }
                    int[] iArr = this.f10874y0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i7 = zC;
                    if (zD) {
                        i7 = (zC ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().d(i7, 0);
                } else if (actionMasked == 1) {
                    this.f10835W.clear();
                    a0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f10834V);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f10834V + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x8 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y8 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f10833U != 1) {
                        int i8 = x8 - this.f10836a0;
                        int i9 = y8 - this.f10837b0;
                        if (zC == 0 || Math.abs(i8) <= this.f10840e0) {
                            z8 = false;
                        } else {
                            this.f10838c0 = x8;
                            z8 = true;
                        }
                        if (zD && Math.abs(i9) > this.f10840e0) {
                            this.f10839d0 = y8;
                            z8 = true;
                        }
                        if (z8) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    T();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f10834V = motionEvent.getPointerId(actionIndex);
                    int x9 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f10838c0 = x9;
                    this.f10836a0 = x9;
                    int y9 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f10839d0 = y9;
                    this.f10837b0 = y9;
                } else if (actionMasked == 6) {
                    N(motionEvent);
                }
                if (this.f10833U == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int i11 = AbstractC0872e.a;
        Trace.beginSection("RV OnLayout");
        m();
        Trace.endSection();
        this.f10815D = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        H h7 = this.f10869w;
        if (h7 == null) {
            l(i7, i8);
            return;
        }
        boolean zG = h7.G();
        boolean z7 = false;
        S s7 = this.f10853n0;
        if (!zG) {
            if (this.f10813C) {
                this.f10869w.f4471b.l(i7, i8);
                return;
            }
            if (s7.f4508j) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            A a = this.f10868v;
            if (a != null) {
                s7.f4502d = a.a();
            } else {
                s7.f4502d = 0;
            }
            Y();
            this.f10869w.f4471b.l(i7, i8);
            Z(false);
            s7.f4504f = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        this.f10869w.f4471b.l(i7, i8);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z7 = true;
        }
        this.f10814C0 = z7;
        if (z7 || this.f10868v == null) {
            return;
        }
        if (s7.f4501c == 1) {
            n();
        }
        this.f10869w.l0(i7, i8);
        s7.f4506h = true;
        o();
        this.f10869w.n0(i7, i8);
        if (this.f10869w.q0()) {
            this.f10869w.l0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            s7.f4506h = true;
            o();
            this.f10869w.n0(i7, i8);
        }
        this.f10816D0 = getMeasuredWidth();
        this.f10818E0 = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (I()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Q)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Q q6 = (Q) parcelable;
        this.f10852n = q6;
        super.onRestoreInstanceState(q6.f13555k);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Q q6 = new Q(super.onSaveInstanceState());
        Q q7 = this.f10852n;
        if (q7 != null) {
            q6.f4499m = q7.f4499m;
            return q6;
        }
        H h7 = this.f10869w;
        if (h7 != null) {
            q6.f4499m = h7.a0();
            return q6;
        }
        q6.f4499m = null;
        return q6;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 == i9 && i8 == i10) {
            return;
        }
        this.f10831S = null;
        this.f10829Q = null;
        this.f10830R = null;
        this.f10828P = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x038b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f7 A[PHI: r1
      0x01f7: PHI (r1v59 int) = (r1v43 int), (r1v63 int) binds: [B:90:0x01e0, B:94:0x01f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i7, i8, i9, iArr, iArr2);
    }

    public final void q(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        getScrollingChildHelper().b(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    public final void r(int i7, int i8) {
        this.f10826N++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i7, scrollY - i8);
        K k7 = this.f10855o0;
        if (k7 != null) {
            k7.a(this);
        }
        ArrayList arrayList = this.f10857p0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((K) this.f10857p0.get(size)).a(this);
            }
        }
        this.f10826N--;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z7) {
        W wF = F(view);
        if (wF != null) {
            if (wF.i()) {
                wF.f4527i &= -257;
            } else if (!wF.n()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + wF + w());
            }
        }
        view.clearAnimation();
        F(view);
        super.removeDetachedView(view, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f10869w.getClass();
        if (!I() && view2 != null) {
            S(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        return this.f10869w.g0(this, view, rect, z7, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z7) {
        ArrayList arrayList = this.f10875z;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C0310n) arrayList.get(i7)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f10817E != 0 || this.f10821G) {
            this.f10819F = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        if (this.f10831S != null) {
            return;
        }
        ((T) this.f10827O).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f10831S = edgeEffect;
        if (this.f10860r) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i8) {
        H h7 = this.f10869w;
        if (h7 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f10821G) {
            return;
        }
        boolean zC = h7.c();
        boolean zD = this.f10869w.d();
        if (zC || zD) {
            if (!zC) {
                i7 = 0;
            }
            if (!zD) {
                i8 = 0;
            }
            U(i7, i8, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!I()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.I |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(Y y7) {
        this.f10867u0 = y7;
        AbstractC1067u.b(this, y7);
    }

    public void setAdapter(A a) {
        setLayoutFrozen(false);
        A a7 = this.f10868v;
        e eVar = this.f10848l;
        if (a7 != null) {
            a7.a.unregisterObserver(eVar);
            this.f10868v.getClass();
        }
        E e7 = this.f10832T;
        if (e7 != null) {
            e7.e();
        }
        H h7 = this.f10869w;
        N n7 = this.f10850m;
        if (h7 != null) {
            h7.c0(n7);
            this.f10869w.d0(n7);
        }
        n7.a.clear();
        n7.f();
        C0017d c0017d = this.f10854o;
        c0017d.D((ArrayList) c0017d.f319m);
        c0017d.D((ArrayList) c0017d.f320n);
        A a8 = this.f10868v;
        this.f10868v = a;
        if (a != null) {
            a.a.registerObserver(eVar);
        }
        H h8 = this.f10869w;
        if (h8 != null) {
            h8.L();
        }
        A a9 = this.f10868v;
        n7.a.clear();
        n7.f();
        n7.e(a8, true);
        M mC = n7.c();
        if (a8 != null) {
            mC.f4490b--;
        }
        if (mC.f4490b == 0) {
            int i7 = 0;
            while (true) {
                SparseArray sparseArray = mC.a;
                if (i7 >= sparseArray.size()) {
                    break;
                }
                L l7 = (L) sparseArray.valueAt(i7);
                Iterator it = l7.a.iterator();
                while (it.hasNext()) {
                    AbstractC0870c.J(((W) it.next()).a);
                }
                l7.a.clear();
                i7++;
            }
        }
        if (a9 != null) {
            mC.f4490b++;
        }
        n7.d();
        this.f10853n0.f4503e = true;
        this.f10824L = this.f10824L;
        this.f10823K = true;
        int iC = this.f10856p.C();
        for (int i8 = 0; i8 < iC; i8++) {
            W wF = F(this.f10856p.B(i8));
            if (wF != null && !wF.n()) {
                wF.a(6);
            }
        }
        J();
        ArrayList arrayList = n7.f4493c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            W w7 = (W) arrayList.get(i9);
            if (w7 != null) {
                w7.a(6);
                w7.a(1024);
            }
        }
        n7.f();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C c2) {
        if (c2 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z7) {
        if (z7 != this.f10860r) {
            this.f10831S = null;
            this.f10829Q = null;
            this.f10830R = null;
            this.f10828P = null;
        }
        this.f10860r = z7;
        super.setClipToPadding(z7);
        if (this.f10815D) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(D d4) {
        d4.getClass();
        this.f10827O = d4;
        this.f10831S = null;
        this.f10829Q = null;
        this.f10830R = null;
        this.f10828P = null;
    }

    public void setHasFixedSize(boolean z7) {
        this.f10813C = z7;
    }

    public void setItemAnimator(E e7) {
        E e8 = this.f10832T;
        if (e8 != null) {
            e8.e();
            this.f10832T.a = null;
        }
        this.f10832T = e7;
        if (e7 != null) {
            e7.a = this.f10863s0;
        }
    }

    public void setItemViewCacheSize(int i7) {
        N n7 = this.f10850m;
        n7.f4495e = i7;
        n7.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z7) {
        suppressLayout(z7);
    }

    public void setLayoutManager(H h7) {
        RecyclerView recyclerView;
        if (h7 == this.f10869w) {
            return;
        }
        setScrollState(0);
        V v5 = this.f10847k0;
        v5.f4518q.removeCallbacks(v5);
        v5.f4514m.abortAnimation();
        H h8 = this.f10869w;
        N n7 = this.f10850m;
        if (h8 != null) {
            E e7 = this.f10832T;
            if (e7 != null) {
                e7.e();
            }
            this.f10869w.c0(n7);
            this.f10869w.d0(n7);
            n7.a.clear();
            n7.f();
            if (this.f10811B) {
                H h9 = this.f10869w;
                h9.f4475f = false;
                h9.M(this);
            }
            this.f10869w.o0(null);
            this.f10869w = null;
        } else {
            n7.a.clear();
            n7.f();
        }
        l lVar = this.f10856p;
        ((C0298b) lVar.f417m).y();
        ArrayList arrayList = (ArrayList) lVar.f418n;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C0321z) lVar.f416l).a;
            if (size < 0) {
                break;
            }
            W wF = F((View) arrayList.get(size));
            if (wF != null) {
                int i7 = wF.f4533o;
                if (recyclerView.I()) {
                    wF.f4534p = i7;
                    recyclerView.A0.add(wF);
                } else {
                    Field field = AbstractC1067u.a;
                    wF.a.setImportantForAccessibility(i7);
                }
                wF.f4533o = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = recyclerView.getChildAt(i8);
            F(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f10869w = h7;
        if (h7 != null) {
            if (h7.f4471b != null) {
                throw new IllegalArgumentException("LayoutManager " + h7 + " is already attached to a RecyclerView:" + h7.f4471b.w());
            }
            h7.o0(this);
            if (this.f10811B) {
                this.f10869w.f4475f = true;
            }
        }
        n7.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        C1051d scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f11971d) {
            Field field = AbstractC1067u.a;
            AbstractC1061n.c(scrollingChildHelper.f11970c);
        }
        scrollingChildHelper.f11971d = z7;
    }

    @Deprecated
    public void setOnScrollListener(K k7) {
        this.f10855o0 = k7;
    }

    public void setPreserveFocusAfterLayout(boolean z7) {
        this.f10845j0 = z7;
    }

    public void setRecycledViewPool(M m7) {
        N n7 = this.f10850m;
        RecyclerView recyclerView = n7.f4498h;
        n7.e(recyclerView.f10868v, false);
        if (n7.f4497g != null) {
            r2.f4490b--;
        }
        n7.f4497g = m7;
        if (m7 != null && recyclerView.getAdapter() != null) {
            n7.f4497g.f4490b++;
        }
        n7.d();
    }

    public void setScrollState(int i7) {
        if (i7 == this.f10833U) {
            return;
        }
        this.f10833U = i7;
        if (i7 != 2) {
            V v5 = this.f10847k0;
            v5.f4518q.removeCallbacks(v5);
            v5.f4514m.abortAnimation();
        }
        H h7 = this.f10869w;
        if (h7 != null) {
            h7.b0(i7);
        }
        ArrayList arrayList = this.f10857p0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((K) this.f10857p0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i7) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i7 != 0) {
            if (i7 == 1) {
                this.f10840e0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i7 + "; using default value");
        }
        this.f10840e0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(U u5) {
        this.f10850m.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return getScrollingChildHelper().d(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().e(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z7) {
        if (z7 != this.f10821G) {
            f("Do not suppressLayout in layout or scroll");
            if (!z7) {
                this.f10821G = false;
                if (this.f10819F && this.f10869w != null && this.f10868v != null) {
                    requestLayout();
                }
                this.f10819F = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f10821G = true;
            this.f10822H = true;
            setScrollState(0);
            V v5 = this.f10847k0;
            v5.f4518q.removeCallbacks(v5);
            v5.f4514m.abortAnimation();
        }
    }

    public final void t() {
        if (this.f10828P != null) {
            return;
        }
        ((T) this.f10827O).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f10828P = edgeEffect;
        if (this.f10860r) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void u() {
        if (this.f10830R != null) {
            return;
        }
        ((T) this.f10827O).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f10830R = edgeEffect;
        if (this.f10860r) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void v() {
        if (this.f10829Q != null) {
            return;
        }
        ((T) this.f10827O).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f10829Q = edgeEffect;
        if (this.f10860r) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String w() {
        return ServerSentEventKt.SPACE + super.toString() + ", adapter:" + this.f10868v + ", layout:" + this.f10869w + ", context:" + getContext();
    }

    public final void x(S s7) {
        if (getScrollState() != 2) {
            s7.getClass();
            return;
        }
        OverScroller overScroller = this.f10847k0.f4514m;
        overScroller.getFinalX();
        overScroller.getCurrX();
        s7.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View y(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f10875z
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            K2.n r5 = (K2.C0310n) r5
            int r6 = r5.f4645v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.b(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.a(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f4646w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f4639p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f4646w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f4636m = r6
        L55:
            r5.d(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f10810A = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.z(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        H h7 = this.f10869w;
        if (h7 != null) {
            return h7.s(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + w());
    }

    public void setOnFlingListener(J j7) {
    }

    @Deprecated
    public void setRecyclerListener(O o7) {
    }
}
