package androidx.recyclerview.widget;

import C2.y;
import F.w;
import K2.C0311o;
import K2.C0315t;
import K2.C0316u;
import K2.H;
import K2.I;
import K2.N;
import K2.S;
import K2.r;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import b1.AbstractC0703b;
import i1.AbstractC1067u;
import j1.C1303d;
import java.lang.reflect.Field;
import java.util.Arrays;
import v.c0;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: D, reason: collision with root package name */
    public boolean f10782D;

    /* renamed from: E, reason: collision with root package name */
    public final int f10783E;

    /* renamed from: F, reason: collision with root package name */
    public int[] f10784F;

    /* renamed from: G, reason: collision with root package name */
    public View[] f10785G;

    /* renamed from: H, reason: collision with root package name */
    public final SparseIntArray f10786H;
    public final SparseIntArray I;
    public final w J;

    /* renamed from: K, reason: collision with root package name */
    public final Rect f10787K;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f10782D = false;
        this.f10783E = -1;
        this.f10786H = new SparseIntArray();
        this.I = new SparseIntArray();
        w wVar = new w(24);
        this.J = wVar;
        this.f10787K = new Rect();
        int i9 = H.D(context, attributeSet, i7, i8).f4468b;
        if (i9 == this.f10783E) {
            return;
        }
        this.f10782D = true;
        if (i9 < 1) {
            throw new IllegalArgumentException(AbstractC0703b.g(i9, "Span count should be at least 1. Provided "));
        }
        this.f10783E = i9;
        wVar.C();
        h0();
    }

    @Override // K2.H
    public final int E(N n7, S s7) {
        if (this.f10791o == 0) {
            return this.f10783E;
        }
        if (s7.b() < 1) {
            return 0;
        }
        return Y0(s7.b() - 1, n7, s7) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View E0(N n7, S s7, boolean z7, boolean z8) {
        int i7;
        int iU;
        int iU2 = u();
        int i8 = 1;
        if (z8) {
            iU = u() - 1;
            i7 = -1;
            i8 = -1;
        } else {
            i7 = iU2;
            iU = 0;
        }
        int iB = s7.b();
        y0();
        int iK = this.f10793q.k();
        int iG = this.f10793q.g();
        View view = null;
        View view2 = null;
        while (iU != i7) {
            View viewT = t(iU);
            int iC = H.C(viewT);
            if (iC >= 0 && iC < iB && Z0(iC, n7, s7) == 0) {
                if (((I) viewT.getLayoutParams()).a.g()) {
                    if (view2 == null) {
                        view2 = viewT;
                    }
                } else {
                    if (this.f10793q.e(viewT) < iG && this.f10793q.b(viewT) >= iK) {
                        return viewT;
                    }
                    if (view == null) {
                        view = viewT;
                    }
                }
            }
            iU += i8;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void K0(N n7, S s7, C0316u c0316u, C0315t c0315t) {
        int i7;
        int i8;
        int i9;
        int iD;
        int iZ;
        int iB;
        int iD2;
        int iV;
        int iV2;
        ?? r8;
        int i10;
        View viewB;
        int iJ = this.f10793q.j();
        boolean z7 = iJ != 1073741824;
        int i11 = u() > 0 ? this.f10784F[this.f10783E] : 0;
        if (z7) {
            c1();
        }
        boolean z8 = c0316u.f4679e == 1;
        int iZ0 = this.f10783E;
        if (!z8) {
            iZ0 = Z0(c0316u.f4678d, n7, s7) + a1(c0316u.f4678d, n7, s7);
        }
        int i12 = 0;
        while (i12 < this.f10783E && (i10 = c0316u.f4678d) >= 0 && i10 < s7.b() && iZ0 > 0) {
            int i13 = c0316u.f4678d;
            int iA1 = a1(i13, n7, s7);
            if (iA1 > this.f10783E) {
                StringBuilder sbB = c0.b("Item at position ", i13, " requires ", iA1, " spans but GridLayoutManager has only ");
                sbB.append(this.f10783E);
                sbB.append(" spans.");
                throw new IllegalArgumentException(sbB.toString());
            }
            iZ0 -= iA1;
            if (iZ0 < 0 || (viewB = c0316u.b(n7)) == null) {
                break;
            }
            this.f10785G[i12] = viewB;
            i12++;
        }
        if (i12 == 0) {
            c0315t.f4673b = true;
            return;
        }
        if (z8) {
            i9 = 1;
            i8 = i12;
            i7 = 0;
        } else {
            i7 = i12 - 1;
            i8 = -1;
            i9 = -1;
        }
        int i14 = 0;
        while (i7 != i8) {
            View view = this.f10785G[i7];
            r rVar = (r) view.getLayoutParams();
            int iA12 = a1(H.C(view), n7, s7);
            rVar.f4664f = iA12;
            rVar.f4663e = i14;
            i14 += iA12;
            i7 += i9;
        }
        float f5 = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            View view2 = this.f10785G[i16];
            if (c0316u.f4685k != null) {
                r8 = 0;
                r8 = 0;
                if (z8) {
                    a(view2, -1, true);
                } else {
                    a(view2, 0, true);
                }
            } else if (z8) {
                r8 = 0;
                a(view2, -1, false);
            } else {
                r8 = 0;
                a(view2, 0, false);
            }
            RecyclerView recyclerView = this.f4471b;
            Rect rect = this.f10787K;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.G(view2));
            }
            b1(view2, iJ, r8);
            int iC = this.f10793q.c(view2);
            if (iC > i15) {
                i15 = iC;
            }
            float fD = (this.f10793q.d(view2) * 1.0f) / ((r) view2.getLayoutParams()).f4664f;
            if (fD > f5) {
                f5 = fD;
            }
        }
        if (z7) {
            V0(Math.max(Math.round(f5 * this.f10783E), i11));
            i15 = 0;
            for (int i17 = 0; i17 < i12; i17++) {
                View view3 = this.f10785G[i17];
                b1(view3, 1073741824, true);
                int iC2 = this.f10793q.c(view3);
                if (iC2 > i15) {
                    i15 = iC2;
                }
            }
        }
        for (int i18 = 0; i18 < i12; i18++) {
            View view4 = this.f10785G[i18];
            if (this.f10793q.c(view4) != i15) {
                r rVar2 = (r) view4.getLayoutParams();
                Rect rect2 = rVar2.f4484b;
                int i19 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) rVar2).topMargin + ((ViewGroup.MarginLayoutParams) rVar2).bottomMargin;
                int i20 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) rVar2).leftMargin + ((ViewGroup.MarginLayoutParams) rVar2).rightMargin;
                int iX0 = X0(rVar2.f4663e, rVar2.f4664f);
                if (this.f10791o == 1) {
                    iV2 = H.v(false, iX0, 1073741824, i20, ((ViewGroup.MarginLayoutParams) rVar2).width);
                    iV = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    iV = H.v(false, iX0, 1073741824, i19, ((ViewGroup.MarginLayoutParams) rVar2).height);
                    iV2 = iMakeMeasureSpec;
                }
                if (r0(view4, iV2, iV, (I) view4.getLayoutParams())) {
                    view4.measure(iV2, iV);
                }
            }
        }
        c0315t.a = i15;
        if (this.f10791o != 1) {
            if (c0316u.f4680f == -1) {
                int i21 = c0316u.f4676b;
                iZ = i21 - i15;
                iD = i21;
            } else {
                int i22 = c0316u.f4676b;
                iD = i22 + i15;
                iZ = i22;
            }
            iB = 0;
            iD2 = 0;
        } else if (c0316u.f4680f == -1) {
            iD2 = c0316u.f4676b;
            iB = iD2 - i15;
            iZ = 0;
            iD = 0;
        } else {
            int i23 = c0316u.f4676b;
            iB = i23;
            iD = 0;
            iD2 = i23 + i15;
            iZ = 0;
        }
        for (int i24 = 0; i24 < i12; i24++) {
            View view5 = this.f10785G[i24];
            r rVar3 = (r) view5.getLayoutParams();
            if (this.f10791o != 1) {
                iB = B() + this.f10784F[rVar3.f4663e];
                iD2 = this.f10793q.d(view5) + iB;
            } else if (J0()) {
                int iZ2 = z() + this.f10784F[this.f10783E - rVar3.f4663e];
                iD = iZ2;
                iZ = iZ2 - this.f10793q.d(view5);
            } else {
                iZ = z() + this.f10784F[rVar3.f4663e];
                iD = this.f10793q.d(view5) + iZ;
            }
            H.I(view5, iZ, iB, iD, iD2);
            if (rVar3.a.g() || rVar3.a.j()) {
                c0315t.f4674c = true;
            }
            c0315t.f4675d = view5.hasFocusable() | c0315t.f4675d;
        }
        Arrays.fill(this.f10785G, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void L0(N n7, S s7, y yVar, int i7) {
        c1();
        if (s7.b() > 0 && !s7.f4504f) {
            boolean z7 = i7 == 1;
            int iZ0 = Z0(yVar.f937c, n7, s7);
            if (z7) {
                while (iZ0 > 0) {
                    int i8 = yVar.f937c;
                    if (i8 <= 0) {
                        break;
                    }
                    int i9 = i8 - 1;
                    yVar.f937c = i9;
                    iZ0 = Z0(i9, n7, s7);
                }
            } else {
                int iB = s7.b() - 1;
                int i10 = yVar.f937c;
                while (i10 < iB) {
                    int i11 = i10 + 1;
                    int iZ02 = Z0(i11, n7, s7);
                    if (iZ02 <= iZ0) {
                        break;
                    }
                    i10 = i11;
                    iZ0 = iZ02;
                }
                yVar.f937c = i10;
            }
        }
        W0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0142, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, K2.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View N(android.view.View r23, int r24, K2.N r25, K2.S r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.N(android.view.View, int, K2.N, K2.S):android.view.View");
    }

    @Override // K2.H
    public final void P(N n7, S s7, C1303d c1303d) {
        super.P(n7, s7, c1303d);
        c1303d.g("android.widget.GridView");
    }

    @Override // K2.H
    public final void Q(N n7, S s7, View view, C1303d c1303d) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof r)) {
            R(view, c1303d);
            return;
        }
        r rVar = (r) layoutParams;
        int iY0 = Y0(rVar.a.b(), n7, s7);
        int i7 = this.f10791o;
        AccessibilityNodeInfo accessibilityNodeInfo = c1303d.a;
        if (i7 == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(rVar.f4663e, rVar.f4664f, iY0, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iY0, 1, rVar.f4663e, rVar.f4664f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void R0(boolean z7) {
        if (z7) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.R0(false);
    }

    @Override // K2.H
    public final void S(int i7, int i8) {
        w wVar = this.J;
        wVar.C();
        ((SparseIntArray) wVar.f2038m).clear();
    }

    @Override // K2.H
    public final void T() {
        w wVar = this.J;
        wVar.C();
        ((SparseIntArray) wVar.f2038m).clear();
    }

    @Override // K2.H
    public final void U(int i7, int i8) {
        w wVar = this.J;
        wVar.C();
        ((SparseIntArray) wVar.f2038m).clear();
    }

    @Override // K2.H
    public final void V(int i7, int i8) {
        w wVar = this.J;
        wVar.C();
        ((SparseIntArray) wVar.f2038m).clear();
    }

    public final void V0(int i7) {
        int i8;
        int[] iArr = this.f10784F;
        int i9 = this.f10783E;
        if (iArr == null || iArr.length != i9 + 1 || iArr[iArr.length - 1] != i7) {
            iArr = new int[i9 + 1];
        }
        int i10 = 0;
        iArr[0] = 0;
        int i11 = i7 / i9;
        int i12 = i7 % i9;
        int i13 = 0;
        for (int i14 = 1; i14 <= i9; i14++) {
            i10 += i12;
            if (i10 <= 0 || i9 - i10 >= i12) {
                i8 = i11;
            } else {
                i8 = i11 + 1;
                i10 -= i9;
            }
            i13 += i8;
            iArr[i14] = i13;
        }
        this.f10784F = iArr;
    }

    @Override // K2.H
    public final void W(int i7, int i8) {
        w wVar = this.J;
        wVar.C();
        ((SparseIntArray) wVar.f2038m).clear();
    }

    public final void W0() {
        View[] viewArr = this.f10785G;
        if (viewArr == null || viewArr.length != this.f10783E) {
            this.f10785G = new View[this.f10783E];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, K2.H
    public final void X(N n7, S s7) {
        boolean z7 = s7.f4504f;
        SparseIntArray sparseIntArray = this.I;
        SparseIntArray sparseIntArray2 = this.f10786H;
        if (z7) {
            int iU = u();
            for (int i7 = 0; i7 < iU; i7++) {
                r rVar = (r) t(i7).getLayoutParams();
                int iB = rVar.a.b();
                sparseIntArray2.put(iB, rVar.f4664f);
                sparseIntArray.put(iB, rVar.f4663e);
            }
        }
        super.X(n7, s7);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final int X0(int i7, int i8) {
        if (this.f10791o != 1 || !J0()) {
            int[] iArr = this.f10784F;
            return iArr[i8 + i7] - iArr[i7];
        }
        int[] iArr2 = this.f10784F;
        int i9 = this.f10783E;
        return iArr2[i9 - i7] - iArr2[(i9 - i7) - i8];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, K2.H
    public final void Y(S s7) {
        super.Y(s7);
        this.f10782D = false;
    }

    public final int Y0(int i7, N n7, S s7) {
        boolean z7 = s7.f4504f;
        w wVar = this.J;
        if (!z7) {
            int i8 = this.f10783E;
            wVar.getClass();
            return w.A(i7, i8);
        }
        int iB = n7.b(i7);
        if (iB != -1) {
            int i9 = this.f10783E;
            wVar.getClass();
            return w.A(iB, i9);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i7);
        return 0;
    }

    public final int Z0(int i7, N n7, S s7) {
        boolean z7 = s7.f4504f;
        w wVar = this.J;
        if (!z7) {
            int i8 = this.f10783E;
            wVar.getClass();
            return i7 % i8;
        }
        int i9 = this.I.get(i7, -1);
        if (i9 != -1) {
            return i9;
        }
        int iB = n7.b(i7);
        if (iB != -1) {
            int i10 = this.f10783E;
            wVar.getClass();
            return iB % i10;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
        return 0;
    }

    public final int a1(int i7, N n7, S s7) {
        boolean z7 = s7.f4504f;
        w wVar = this.J;
        if (!z7) {
            wVar.getClass();
            return 1;
        }
        int i8 = this.f10786H.get(i7, -1);
        if (i8 != -1) {
            return i8;
        }
        if (n7.b(i7) != -1) {
            wVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
        return 1;
    }

    public final void b1(View view, int i7, boolean z7) {
        int iV;
        int iV2;
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.f4484b;
        int i8 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        int i9 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        int iX0 = X0(rVar.f4663e, rVar.f4664f);
        if (this.f10791o == 1) {
            iV2 = H.v(false, iX0, i7, i9, ((ViewGroup.MarginLayoutParams) rVar).width);
            iV = H.v(true, this.f10793q.l(), this.f4481l, i8, ((ViewGroup.MarginLayoutParams) rVar).height);
        } else {
            int iV3 = H.v(false, iX0, i7, i8, ((ViewGroup.MarginLayoutParams) rVar).height);
            int iV4 = H.v(true, this.f10793q.l(), this.f4480k, i9, ((ViewGroup.MarginLayoutParams) rVar).width);
            iV = iV3;
            iV2 = iV4;
        }
        I i10 = (I) view.getLayoutParams();
        if (z7 ? r0(view, iV2, iV, i10) : p0(view, iV2, iV, i10)) {
            view.measure(iV2, iV);
        }
    }

    public final void c1() {
        int iY;
        int iB;
        if (this.f10791o == 1) {
            iY = this.f4482m - A();
            iB = z();
        } else {
            iY = this.f4483n - y();
            iB = B();
        }
        V0(iY - iB);
    }

    @Override // K2.H
    public final boolean e(I i7) {
        return i7 instanceof r;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, K2.H
    public final int i0(int i7, N n7, S s7) {
        c1();
        W0();
        return super.i0(i7, n7, s7);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, K2.H
    public final int j(S s7) {
        return v0(s7);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, K2.H
    public final int j0(int i7, N n7, S s7) {
        c1();
        W0();
        return super.j0(i7, n7, s7);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, K2.H
    public final int k(S s7) {
        return w0(s7);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, K2.H
    public final int m(S s7) {
        return v0(s7);
    }

    @Override // K2.H
    public final void m0(Rect rect, int i7, int i8) {
        int iF;
        int iF2;
        if (this.f10784F == null) {
            super.m0(rect, i7, i8);
        }
        int iA = A() + z();
        int iY = y() + B();
        if (this.f10791o == 1) {
            int iHeight = rect.height() + iY;
            RecyclerView recyclerView = this.f4471b;
            Field field = AbstractC1067u.a;
            iF2 = H.f(i8, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f10784F;
            iF = H.f(i7, iArr[iArr.length - 1] + iA, this.f4471b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iA;
            RecyclerView recyclerView2 = this.f4471b;
            Field field2 = AbstractC1067u.a;
            iF = H.f(i7, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f10784F;
            iF2 = H.f(i8, iArr2[iArr2.length - 1] + iY, this.f4471b.getMinimumHeight());
        }
        this.f4471b.setMeasuredDimension(iF, iF2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, K2.H
    public final int n(S s7) {
        return w0(s7);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, K2.H
    public final I q() {
        return this.f10791o == 0 ? new r(-2, -1) : new r(-1, -2);
    }

    @Override // K2.H
    public final I r(Context context, AttributeSet attributeSet) {
        r rVar = new r(context, attributeSet);
        rVar.f4663e = -1;
        rVar.f4664f = 0;
        return rVar;
    }

    @Override // K2.H
    public final I s(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            r rVar = new r((ViewGroup.MarginLayoutParams) layoutParams);
            rVar.f4663e = -1;
            rVar.f4664f = 0;
            return rVar;
        }
        r rVar2 = new r(layoutParams);
        rVar2.f4663e = -1;
        rVar2.f4664f = 0;
        return rVar2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, K2.H
    public final boolean s0() {
        return this.f10801y == null && !this.f10782D;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void t0(S s7, C0316u c0316u, C0311o c0311o) {
        int i7;
        int i8 = this.f10783E;
        for (int i9 = 0; i9 < this.f10783E && (i7 = c0316u.f4678d) >= 0 && i7 < s7.b() && i8 > 0; i9++) {
            c0311o.b(c0316u.f4678d, Math.max(0, c0316u.f4681g));
            this.J.getClass();
            i8--;
            c0316u.f4678d += c0316u.f4679e;
        }
    }

    @Override // K2.H
    public final int w(N n7, S s7) {
        if (this.f10791o == 1) {
            return this.f10783E;
        }
        if (s7.b() < 1) {
            return 0;
        }
        return Y0(s7.b() - 1, n7, s7) + 1;
    }
}
