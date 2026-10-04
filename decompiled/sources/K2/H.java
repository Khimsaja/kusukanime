package K2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import i1.AbstractC1067u;
import j1.C1303d;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class H {
    public B2.l a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f4471b;

    /* renamed from: c, reason: collision with root package name */
    public final F.w f4472c;

    /* renamed from: d, reason: collision with root package name */
    public final F.w f4473d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4474e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4475f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4476g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4477h;

    /* renamed from: i, reason: collision with root package name */
    public int f4478i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4479j;

    /* renamed from: k, reason: collision with root package name */
    public int f4480k;

    /* renamed from: l, reason: collision with root package name */
    public int f4481l;

    /* renamed from: m, reason: collision with root package name */
    public int f4482m;

    /* renamed from: n, reason: collision with root package name */
    public int f4483n;

    public H() {
        F f5 = new F(this, 0);
        F f7 = new F(this, 1);
        this.f4472c = new F.w(f5);
        this.f4473d = new F.w(f7);
        this.f4474e = false;
        this.f4475f = false;
        this.f4476g = true;
        this.f4477h = true;
    }

    public static int C(View view) {
        return ((I) view.getLayoutParams()).a.b();
    }

    public static G D(Context context, AttributeSet attributeSet, int i7, int i8) {
        G g4 = new G();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J2.a.a, i7, i8);
        g4.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        g4.f4468b = typedArrayObtainStyledAttributes.getInt(10, 1);
        g4.f4469c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        g4.f4470d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return g4;
    }

    public static boolean H(int i7, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (i9 > 0 && i7 != i9) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i7;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i7;
        }
        return true;
    }

    public static void I(View view, int i7, int i8, int i9, int i10) {
        I i11 = (I) view.getLayoutParams();
        Rect rect = i11.f4484b;
        view.layout(i7 + rect.left + ((ViewGroup.MarginLayoutParams) i11).leftMargin, i8 + rect.top + ((ViewGroup.MarginLayoutParams) i11).topMargin, (i9 - rect.right) - ((ViewGroup.MarginLayoutParams) i11).rightMargin, (i10 - rect.bottom) - ((ViewGroup.MarginLayoutParams) i11).bottomMargin);
    }

    public static int f(int i7, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i8, i9) : size : Math.min(size, Math.max(i8, i9));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int v(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.H.v(boolean, int, int, int, int):int");
    }

    public static void x(View view, Rect rect) {
        int[] iArr = RecyclerView.f10803G0;
        I i7 = (I) view.getLayoutParams();
        Rect rect2 = i7.f4484b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) i7).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) i7).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) i7).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) i7).bottomMargin);
    }

    public final int A() {
        RecyclerView recyclerView = this.f4471b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int B() {
        RecyclerView recyclerView = this.f4471b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int E(N n7, S s7) {
        return -1;
    }

    public final void F(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((I) view.getLayoutParams()).f4484b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f4471b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f4471b.f10866u;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean G();

    public void J(int i7) {
        RecyclerView recyclerView = this.f4471b;
        if (recyclerView != null) {
            int iV = recyclerView.f10856p.v();
            for (int i8 = 0; i8 < iV; i8++) {
                recyclerView.f10856p.u(i8).offsetLeftAndRight(i7);
            }
        }
    }

    public void K(int i7) {
        RecyclerView recyclerView = this.f4471b;
        if (recyclerView != null) {
            int iV = recyclerView.f10856p.v();
            for (int i8 = 0; i8 < iV; i8++) {
                recyclerView.f10856p.u(i8).offsetTopAndBottom(i7);
            }
        }
    }

    public abstract void M(RecyclerView recyclerView);

    public abstract View N(View view, int i7, N n7, S s7);

    public void O(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f4471b;
        N n7 = recyclerView.f10850m;
        S s7 = recyclerView.f10853n0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z7 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f4471b.canScrollVertically(-1) && !this.f4471b.canScrollHorizontally(-1) && !this.f4471b.canScrollHorizontally(1)) {
            z7 = false;
        }
        accessibilityEvent.setScrollable(z7);
        A a = this.f4471b.f10868v;
        if (a != null) {
            accessibilityEvent.setItemCount(a.a());
        }
    }

    public void P(N n7, S s7, C1303d c1303d) {
        boolean zCanScrollVertically = this.f4471b.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = c1303d.a;
        if (zCanScrollVertically || this.f4471b.canScrollHorizontally(-1)) {
            c1303d.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f4471b.canScrollVertically(1) || this.f4471b.canScrollHorizontally(1)) {
            c1303d.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(E(n7, s7), w(n7, s7), false, 0));
    }

    public final void R(View view, C1303d c1303d) {
        W wF = RecyclerView.F(view);
        if (wF == null || wF.g() || ((ArrayList) this.a.f418n).contains(wF.a)) {
            return;
        }
        RecyclerView recyclerView = this.f4471b;
        Q(recyclerView.f10850m, recyclerView.f10853n0, view, c1303d);
    }

    public abstract void X(N n7, S s7);

    public abstract void Y(S s7);

    public abstract void Z(Parcelable parcelable);

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.H.a(android.view.View, int, boolean):void");
    }

    public abstract Parcelable a0();

    public abstract void b(String str);

    public abstract boolean c();

    public final void c0(N n7) {
        for (int iU = u() - 1; iU >= 0; iU--) {
            if (!RecyclerView.F(t(iU)).n()) {
                View viewT = t(iU);
                f0(iU);
                n7.h(viewT);
            }
        }
    }

    public abstract boolean d();

    public final void d0(N n7) {
        ArrayList arrayList;
        int size = n7.a.size();
        int i7 = size - 1;
        while (true) {
            arrayList = n7.a;
            if (i7 < 0) {
                break;
            }
            View view = ((W) arrayList.get(i7)).a;
            W wF = RecyclerView.F(view);
            if (!wF.n()) {
                wF.m(false);
                if (wF.i()) {
                    this.f4471b.removeDetachedView(view, false);
                }
                E e7 = this.f4471b.f10832T;
                if (e7 != null) {
                    e7.d(wF);
                }
                wF.m(true);
                W wF2 = RecyclerView.F(view);
                wF2.f4531m = null;
                wF2.f4532n = false;
                wF2.f4527i &= -33;
                n7.i(wF2);
            }
            i7--;
        }
        arrayList.clear();
        ArrayList arrayList2 = n7.f4492b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f4471b.invalidate();
        }
    }

    public boolean e(I i7) {
        return i7 != null;
    }

    public final void e0(View view, N n7) {
        B2.l lVar = this.a;
        C0321z c0321z = (C0321z) lVar.f416l;
        int iIndexOfChild = c0321z.a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((C0298b) lVar.f417m).x(iIndexOfChild)) {
                lVar.S(view);
            }
            c0321z.h(iIndexOfChild);
        }
        n7.h(view);
    }

    public final void f0(int i7) {
        if (t(i7) != null) {
            B2.l lVar = this.a;
            int iZ = lVar.z(i7);
            C0321z c0321z = (C0321z) lVar.f416l;
            View childAt = c0321z.a.getChildAt(iZ);
            if (childAt == null) {
                return;
            }
            if (((C0298b) lVar.f417m).x(iZ)) {
                lVar.S(childAt);
            }
            c0321z.h(iZ);
        }
    }

    public abstract void g(int i7, int i8, S s7, C0311o c0311o);

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.z()
            int r1 = r8.B()
            int r2 = r8.f4482m
            int r3 = r8.A()
            int r2 = r2 - r3
            int r3 = r8.f4483n
            int r4 = r8.y()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.f4471b
            java.lang.reflect.Field r7 = i1.AbstractC1067u.a
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L60
            if (r2 == 0) goto L5b
            goto L68
        L5b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L68
        L60:
            if (r6 == 0) goto L63
            goto L67
        L63:
            int r6 = java.lang.Math.min(r4, r2)
        L67:
            r2 = r6
        L68:
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            int r1 = java.lang.Math.min(r5, r11)
        L6f:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb2
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L80
            goto Lb7
        L80:
            int r1 = r8.z()
            int r2 = r8.B()
            int r3 = r8.f4482m
            int r4 = r8.A()
            int r3 = r3 - r4
            int r4 = r8.f4483n
            int r5 = r8.y()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f4471b
            android.graphics.Rect r5 = r5.f10862s
            x(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb7
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb7
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb7
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb2
            goto Lb7
        Lb2:
            if (r11 != 0) goto Lb8
            if (r10 == 0) goto Lb7
            goto Lb8
        Lb7:
            return r0
        Lb8:
            if (r12 == 0) goto Lbe
            r9.scrollBy(r11, r10)
            return r7
        Lbe:
            r9.X(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.H.g0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final void h0() {
        RecyclerView recyclerView = this.f4471b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int i(S s7);

    public abstract int i0(int i7, N n7, S s7);

    public abstract int j(S s7);

    public abstract int j0(int i7, N n7, S s7);

    public abstract int k(S s7);

    public final void k0(RecyclerView recyclerView) {
        l0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int l(S s7);

    public final void l0(int i7, int i8) {
        this.f4482m = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        this.f4480k = mode;
        if (mode == 0 && !RecyclerView.f10805I0) {
            this.f4482m = 0;
        }
        this.f4483n = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i8);
        this.f4481l = mode2;
        if (mode2 != 0 || RecyclerView.f10805I0) {
            return;
        }
        this.f4483n = 0;
    }

    public abstract int m(S s7);

    public void m0(Rect rect, int i7, int i8) {
        int iA = A() + z() + rect.width();
        int iY = y() + B() + rect.height();
        RecyclerView recyclerView = this.f4471b;
        Field field = AbstractC1067u.a;
        this.f4471b.setMeasuredDimension(f(i7, iA, recyclerView.getMinimumWidth()), f(i8, iY, this.f4471b.getMinimumHeight()));
    }

    public abstract int n(S s7);

    public final void n0(int i7, int i8) {
        int iU = u();
        if (iU == 0) {
            this.f4471b.l(i7, i8);
            return;
        }
        int i9 = Integer.MIN_VALUE;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < iU; i13++) {
            View viewT = t(i13);
            Rect rect = this.f4471b.f10862s;
            x(viewT, rect);
            int i14 = rect.left;
            if (i14 < i12) {
                i12 = i14;
            }
            int i15 = rect.right;
            if (i15 > i9) {
                i9 = i15;
            }
            int i16 = rect.top;
            if (i16 < i10) {
                i10 = i16;
            }
            int i17 = rect.bottom;
            if (i17 > i11) {
                i11 = i17;
            }
        }
        this.f4471b.f10862s.set(i12, i10, i9, i11);
        m0(this.f4471b.f10862s, i7, i8);
    }

    public final void o(N n7) {
        for (int iU = u() - 1; iU >= 0; iU--) {
            View viewT = t(iU);
            W wF = RecyclerView.F(viewT);
            if (!wF.n()) {
                if (!wF.e() || wF.g()) {
                    t(iU);
                    this.a.p(iU);
                    n7.j(viewT);
                    this.f4471b.f10858q.L(wF);
                } else {
                    this.f4471b.f10868v.getClass();
                    f0(iU);
                    n7.i(wF);
                }
            }
        }
    }

    public final void o0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f4471b = null;
            this.a = null;
            this.f4482m = 0;
            this.f4483n = 0;
        } else {
            this.f4471b = recyclerView;
            this.a = recyclerView.f10856p;
            this.f4482m = recyclerView.getWidth();
            this.f4483n = recyclerView.getHeight();
        }
        this.f4480k = 1073741824;
        this.f4481l = 1073741824;
    }

    public View p(int i7) {
        int iU = u();
        for (int i8 = 0; i8 < iU; i8++) {
            View viewT = t(i8);
            W wF = RecyclerView.F(viewT);
            if (wF != null && wF.b() == i7 && !wF.n() && (this.f4471b.f10853n0.f4504f || !wF.g())) {
                return viewT;
            }
        }
        return null;
    }

    public final boolean p0(View view, int i7, int i8, I i9) {
        return (!view.isLayoutRequested() && this.f4476g && H(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) i9).width) && H(view.getHeight(), i8, ((ViewGroup.MarginLayoutParams) i9).height)) ? false : true;
    }

    public abstract I q();

    public boolean q0() {
        return false;
    }

    public I r(Context context, AttributeSet attributeSet) {
        return new I(context, attributeSet);
    }

    public final boolean r0(View view, int i7, int i8, I i9) {
        return (this.f4476g && H(view.getMeasuredWidth(), i7, ((ViewGroup.MarginLayoutParams) i9).width) && H(view.getMeasuredHeight(), i8, ((ViewGroup.MarginLayoutParams) i9).height)) ? false : true;
    }

    public I s(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof I ? new I((I) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new I((ViewGroup.MarginLayoutParams) layoutParams) : new I(layoutParams);
    }

    public abstract boolean s0();

    public final View t(int i7) {
        B2.l lVar = this.a;
        if (lVar != null) {
            return lVar.u(i7);
        }
        return null;
    }

    public final int u() {
        B2.l lVar = this.a;
        if (lVar != null) {
            return lVar.v();
        }
        return 0;
    }

    public int w(N n7, S s7) {
        return -1;
    }

    public final int y() {
        RecyclerView recyclerView = this.f4471b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int z() {
        RecyclerView recyclerView = this.f4471b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public void L() {
    }

    public void T() {
    }

    public void b0(int i7) {
    }

    public void S(int i7, int i8) {
    }

    public void U(int i7, int i8) {
    }

    public void V(int i7, int i8) {
    }

    public void W(int i7, int i8) {
    }

    public void h(int i7, C0311o c0311o) {
    }

    public void Q(N n7, S s7, View view, C1303d c1303d) {
    }
}
