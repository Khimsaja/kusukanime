package androidx.recyclerview.widget;

import F.w;
import K2.AbstractC0319x;
import K2.C0311o;
import K2.C0314s;
import K2.G;
import K2.H;
import K2.I;
import K2.N;
import K2.RunnableC0306j;
import K2.S;
import K2.Z;
import K2.a0;
import K2.c0;
import K2.d0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import i1.AbstractC1067u;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import n6.m;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends H {

    /* renamed from: A, reason: collision with root package name */
    public final w f10877A;

    /* renamed from: B, reason: collision with root package name */
    public final int f10878B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f10879C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f10880D;

    /* renamed from: E, reason: collision with root package name */
    public c0 f10881E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f10882F;

    /* renamed from: G, reason: collision with root package name */
    public final Z f10883G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f10884H;
    public int[] I;
    public final RunnableC0306j J;

    /* renamed from: o, reason: collision with root package name */
    public final int f10885o;

    /* renamed from: p, reason: collision with root package name */
    public final d0[] f10886p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC0319x f10887q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC0319x f10888r;

    /* renamed from: s, reason: collision with root package name */
    public final int f10889s;

    /* renamed from: t, reason: collision with root package name */
    public int f10890t;

    /* renamed from: u, reason: collision with root package name */
    public final C0314s f10891u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10892v;

    /* renamed from: x, reason: collision with root package name */
    public final BitSet f10894x;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10893w = false;

    /* renamed from: y, reason: collision with root package name */
    public int f10895y = -1;

    /* renamed from: z, reason: collision with root package name */
    public int f10896z = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f10885o = -1;
        this.f10892v = false;
        w wVar = new w(25, false);
        this.f10877A = wVar;
        this.f10878B = 2;
        this.f10882F = new Rect();
        this.f10883G = new Z(this);
        this.f10884H = true;
        this.J = new RunnableC0306j(2, this);
        G gD = H.D(context, attributeSet, i7, i8);
        int i9 = gD.a;
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        b(null);
        if (i9 != this.f10889s) {
            this.f10889s = i9;
            AbstractC0319x abstractC0319x = this.f10887q;
            this.f10887q = this.f10888r;
            this.f10888r = abstractC0319x;
            h0();
        }
        int i10 = gD.f4468b;
        b(null);
        if (i10 != this.f10885o) {
            wVar.r();
            h0();
            this.f10885o = i10;
            this.f10894x = new BitSet(this.f10885o);
            this.f10886p = new d0[this.f10885o];
            for (int i11 = 0; i11 < this.f10885o; i11++) {
                this.f10886p[i11] = new d0(this, i11);
            }
            h0();
        }
        boolean z7 = gD.f4469c;
        b(null);
        c0 c0Var = this.f10881E;
        if (c0Var != null && c0Var.f4567r != z7) {
            c0Var.f4567r = z7;
        }
        this.f10892v = z7;
        h0();
        C0314s c0314s = new C0314s();
        c0314s.a = true;
        c0314s.f4669f = 0;
        c0314s.f4670g = 0;
        this.f10891u = c0314s;
        this.f10887q = AbstractC0319x.a(this, this.f10889s);
        this.f10888r = AbstractC0319x.a(this, 1 - this.f10889s);
    }

    public static int V0(int i7, int i8, int i9) {
        int mode;
        return (!(i8 == 0 && i9 == 0) && ((mode = View.MeasureSpec.getMode(i7)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - i8) - i9), mode) : i7;
    }

    public final void A0(N n7, S s7, boolean z7) {
        int iG;
        int iE0 = E0(Integer.MIN_VALUE);
        if (iE0 != Integer.MIN_VALUE && (iG = this.f10887q.g() - iE0) > 0) {
            int i7 = iG - (-R0(-iG, n7, s7));
            if (!z7 || i7 <= 0) {
                return;
            }
            this.f10887q.o(i7);
        }
    }

    public final void B0(N n7, S s7, boolean z7) {
        int iK;
        int iF0 = F0(Integer.MAX_VALUE);
        if (iF0 != Integer.MAX_VALUE && (iK = iF0 - this.f10887q.k()) > 0) {
            int iR0 = iK - R0(iK, n7, s7);
            if (!z7 || iR0 <= 0) {
                return;
            }
            this.f10887q.o(-iR0);
        }
    }

    public final int C0() {
        if (u() == 0) {
            return 0;
        }
        return H.C(t(0));
    }

    public final int D0() {
        int iU = u();
        if (iU == 0) {
            return 0;
        }
        return H.C(t(iU - 1));
    }

    public final int E0(int i7) {
        int iH = this.f10886p[0].h(i7);
        for (int i8 = 1; i8 < this.f10885o; i8++) {
            int iH2 = this.f10886p[i8].h(i7);
            if (iH2 > iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    public final int F0(int i7) {
        int iJ = this.f10886p[0].j(i7);
        for (int i8 = 1; i8 < this.f10885o; i8++) {
            int iJ2 = this.f10886p[i8].j(i7);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    @Override // K2.H
    public final boolean G() {
        return this.f10878B != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.G0(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View H0() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.H0():android.view.View");
    }

    public final boolean I0() {
        RecyclerView recyclerView = this.f4471b;
        Field field = AbstractC1067u.a;
        return recyclerView.getLayoutDirection() == 1;
    }

    @Override // K2.H
    public final void J(int i7) {
        super.J(i7);
        for (int i8 = 0; i8 < this.f10885o; i8++) {
            d0 d0Var = this.f10886p[i8];
            int i9 = d0Var.f4574b;
            if (i9 != Integer.MIN_VALUE) {
                d0Var.f4574b = i9 + i7;
            }
            int i10 = d0Var.f4575c;
            if (i10 != Integer.MIN_VALUE) {
                d0Var.f4575c = i10 + i7;
            }
        }
    }

    public final void J0(View view, int i7, int i8) {
        RecyclerView recyclerView = this.f4471b;
        Rect rect = this.f10882F;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.G(view));
        }
        a0 a0Var = (a0) view.getLayoutParams();
        int iV0 = V0(i7, ((ViewGroup.MarginLayoutParams) a0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) a0Var).rightMargin + rect.right);
        int iV02 = V0(i8, ((ViewGroup.MarginLayoutParams) a0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) a0Var).bottomMargin + rect.bottom);
        if (p0(view, iV0, iV02, a0Var)) {
            view.measure(iV0, iV02);
        }
    }

    @Override // K2.H
    public final void K(int i7) {
        super.K(i7);
        for (int i8 = 0; i8 < this.f10885o; i8++) {
            d0 d0Var = this.f10886p[i8];
            int i9 = d0Var.f4574b;
            if (i9 != Integer.MIN_VALUE) {
                d0Var.f4574b = i9 + i7;
            }
            int i10 = d0Var.f4575c;
            if (i10 != Integer.MIN_VALUE) {
                d0Var.f4575c = i10 + i7;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0419  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K0(K2.N r17, K2.S r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.K0(K2.N, K2.S, boolean):void");
    }

    @Override // K2.H
    public final void L() {
        this.f10877A.r();
        for (int i7 = 0; i7 < this.f10885o; i7++) {
            this.f10886p[i7].b();
        }
    }

    public final boolean L0(int i7) {
        if (this.f10889s == 0) {
            return (i7 == -1) != this.f10893w;
        }
        return ((i7 == -1) == this.f10893w) == I0();
    }

    @Override // K2.H
    public final void M(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4471b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.J);
        }
        for (int i7 = 0; i7 < this.f10885o; i7++) {
            this.f10886p[i7].b();
        }
        recyclerView.requestLayout();
    }

    public final void M0(int i7) {
        int iC0;
        int i8;
        if (i7 > 0) {
            iC0 = D0();
            i8 = 1;
        } else {
            iC0 = C0();
            i8 = -1;
        }
        C0314s c0314s = this.f10891u;
        c0314s.a = true;
        T0(iC0);
        S0(i8);
        c0314s.f4666c = iC0 + c0314s.f4667d;
        c0314s.f4665b = Math.abs(i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    @Override // K2.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View N(android.view.View r9, int r10, K2.N r11, K2.S r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N(android.view.View, int, K2.N, K2.S):android.view.View");
    }

    public final void N0(N n7, C0314s c0314s) {
        if (!c0314s.a || c0314s.f4672i) {
            return;
        }
        if (c0314s.f4665b == 0) {
            if (c0314s.f4668e == -1) {
                O0(n7, c0314s.f4670g);
                return;
            } else {
                P0(n7, c0314s.f4669f);
                return;
            }
        }
        int i7 = 1;
        if (c0314s.f4668e == -1) {
            int i8 = c0314s.f4669f;
            int iJ = this.f10886p[0].j(i8);
            while (i7 < this.f10885o) {
                int iJ2 = this.f10886p[i7].j(i8);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                i7++;
            }
            int i9 = i8 - iJ;
            O0(n7, i9 < 0 ? c0314s.f4670g : c0314s.f4670g - Math.min(i9, c0314s.f4665b));
            return;
        }
        int i10 = c0314s.f4670g;
        int iH = this.f10886p[0].h(i10);
        while (i7 < this.f10885o) {
            int iH2 = this.f10886p[i7].h(i10);
            if (iH2 < iH) {
                iH = iH2;
            }
            i7++;
        }
        int i11 = iH - c0314s.f4670g;
        P0(n7, i11 < 0 ? c0314s.f4669f : Math.min(i11, c0314s.f4665b) + c0314s.f4669f);
    }

    @Override // K2.H
    public final void O(AccessibilityEvent accessibilityEvent) {
        super.O(accessibilityEvent);
        if (u() > 0) {
            View viewZ0 = z0(false);
            View viewY0 = y0(false);
            if (viewZ0 == null || viewY0 == null) {
                return;
            }
            int iC = H.C(viewZ0);
            int iC2 = H.C(viewY0);
            if (iC < iC2) {
                accessibilityEvent.setFromIndex(iC);
                accessibilityEvent.setToIndex(iC2);
            } else {
                accessibilityEvent.setFromIndex(iC2);
                accessibilityEvent.setToIndex(iC);
            }
        }
    }

    public final void O0(N n7, int i7) {
        for (int iU = u() - 1; iU >= 0; iU--) {
            View viewT = t(iU);
            if (this.f10887q.e(viewT) < i7 || this.f10887q.n(viewT) < i7) {
                return;
            }
            a0 a0Var = (a0) viewT.getLayoutParams();
            a0Var.getClass();
            if (((ArrayList) a0Var.f4549e.f4578f).size() == 1) {
                return;
            }
            d0 d0Var = a0Var.f4549e;
            ArrayList arrayList = (ArrayList) d0Var.f4578f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            a0 a0Var2 = (a0) view.getLayoutParams();
            a0Var2.f4549e = null;
            if (a0Var2.a.g() || a0Var2.a.j()) {
                d0Var.f4576d -= ((StaggeredGridLayoutManager) d0Var.f4579g).f10887q.c(view);
            }
            if (size == 1) {
                d0Var.f4574b = Integer.MIN_VALUE;
            }
            d0Var.f4575c = Integer.MIN_VALUE;
            e0(viewT, n7);
        }
    }

    public final void P0(N n7, int i7) {
        while (u() > 0) {
            View viewT = t(0);
            if (this.f10887q.b(viewT) > i7 || this.f10887q.m(viewT) > i7) {
                return;
            }
            a0 a0Var = (a0) viewT.getLayoutParams();
            a0Var.getClass();
            if (((ArrayList) a0Var.f4549e.f4578f).size() == 1) {
                return;
            }
            d0 d0Var = a0Var.f4549e;
            ArrayList arrayList = (ArrayList) d0Var.f4578f;
            View view = (View) arrayList.remove(0);
            a0 a0Var2 = (a0) view.getLayoutParams();
            a0Var2.f4549e = null;
            if (arrayList.size() == 0) {
                d0Var.f4575c = Integer.MIN_VALUE;
            }
            if (a0Var2.a.g() || a0Var2.a.j()) {
                d0Var.f4576d -= ((StaggeredGridLayoutManager) d0Var.f4579g).f10887q.c(view);
            }
            d0Var.f4574b = Integer.MIN_VALUE;
            e0(viewT, n7);
        }
    }

    public final void Q0() {
        if (this.f10889s == 1 || !I0()) {
            this.f10893w = this.f10892v;
        } else {
            this.f10893w = !this.f10892v;
        }
    }

    public final int R0(int i7, N n7, S s7) {
        if (u() == 0 || i7 == 0) {
            return 0;
        }
        M0(i7);
        C0314s c0314s = this.f10891u;
        int iX0 = x0(n7, c0314s, s7);
        if (c0314s.f4665b >= iX0) {
            i7 = i7 < 0 ? -iX0 : iX0;
        }
        this.f10887q.o(-i7);
        this.f10879C = this.f10893w;
        c0314s.f4665b = 0;
        N0(n7, c0314s);
        return i7;
    }

    @Override // K2.H
    public final void S(int i7, int i8) {
        G0(i7, i8, 1);
    }

    public final void S0(int i7) {
        C0314s c0314s = this.f10891u;
        c0314s.f4668e = i7;
        c0314s.f4667d = this.f10893w != (i7 == -1) ? -1 : 1;
    }

    @Override // K2.H
    public final void T() {
        this.f10877A.r();
        h0();
    }

    public final void T0(int i7) {
        C0314s c0314s = this.f10891u;
        boolean z7 = false;
        c0314s.f4665b = 0;
        c0314s.f4666c = i7;
        RecyclerView recyclerView = this.f4471b;
        if (recyclerView == null || !recyclerView.f10860r) {
            c0314s.f4670g = this.f10887q.f();
            c0314s.f4669f = 0;
        } else {
            c0314s.f4669f = this.f10887q.k();
            c0314s.f4670g = this.f10887q.g();
        }
        c0314s.f4671h = false;
        c0314s.a = true;
        if (this.f10887q.i() == 0 && this.f10887q.f() == 0) {
            z7 = true;
        }
        c0314s.f4672i = z7;
    }

    @Override // K2.H
    public final void U(int i7, int i8) {
        G0(i7, i8, 8);
    }

    public final void U0(d0 d0Var, int i7, int i8) {
        int i9 = d0Var.f4576d;
        int i10 = d0Var.f4577e;
        if (i7 != -1) {
            int i11 = d0Var.f4575c;
            if (i11 == Integer.MIN_VALUE) {
                d0Var.a();
                i11 = d0Var.f4575c;
            }
            if (i11 - i9 >= i8) {
                this.f10894x.set(i10, false);
                return;
            }
            return;
        }
        int i12 = d0Var.f4574b;
        if (i12 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) d0Var.f4578f).get(0);
            a0 a0Var = (a0) view.getLayoutParams();
            d0Var.f4574b = ((StaggeredGridLayoutManager) d0Var.f4579g).f10887q.e(view);
            a0Var.getClass();
            i12 = d0Var.f4574b;
        }
        if (i12 + i9 <= i8) {
            this.f10894x.set(i10, false);
        }
    }

    @Override // K2.H
    public final void V(int i7, int i8) {
        G0(i7, i8, 2);
    }

    @Override // K2.H
    public final void W(int i7, int i8) {
        G0(i7, i8, 4);
    }

    @Override // K2.H
    public final void X(N n7, S s7) {
        K0(n7, s7, true);
    }

    @Override // K2.H
    public final void Y(S s7) {
        this.f10895y = -1;
        this.f10896z = Integer.MIN_VALUE;
        this.f10881E = null;
        this.f10883G.a();
    }

    @Override // K2.H
    public final void Z(Parcelable parcelable) {
        if (parcelable instanceof c0) {
            c0 c0Var = (c0) parcelable;
            this.f10881E = c0Var;
            if (this.f10895y != -1) {
                c0Var.f4560k = -1;
                c0Var.f4561l = -1;
                c0Var.f4563n = null;
                c0Var.f4562m = 0;
                c0Var.f4564o = 0;
                c0Var.f4565p = null;
                c0Var.f4566q = null;
            }
            h0();
        }
    }

    @Override // K2.H
    public final Parcelable a0() {
        int iJ;
        int iK;
        int[] iArr;
        c0 c0Var = this.f10881E;
        if (c0Var != null) {
            c0 c0Var2 = new c0();
            c0Var2.f4562m = c0Var.f4562m;
            c0Var2.f4560k = c0Var.f4560k;
            c0Var2.f4561l = c0Var.f4561l;
            c0Var2.f4563n = c0Var.f4563n;
            c0Var2.f4564o = c0Var.f4564o;
            c0Var2.f4565p = c0Var.f4565p;
            c0Var2.f4567r = c0Var.f4567r;
            c0Var2.f4568s = c0Var.f4568s;
            c0Var2.f4569t = c0Var.f4569t;
            c0Var2.f4566q = c0Var.f4566q;
            return c0Var2;
        }
        c0 c0Var3 = new c0();
        c0Var3.f4567r = this.f10892v;
        c0Var3.f4568s = this.f10879C;
        c0Var3.f4569t = this.f10880D;
        w wVar = this.f10877A;
        if (wVar == null || (iArr = (int[]) wVar.f2037l) == null) {
            c0Var3.f4564o = 0;
        } else {
            c0Var3.f4565p = iArr;
            c0Var3.f4564o = iArr.length;
            c0Var3.f4566q = (ArrayList) wVar.f2038m;
        }
        if (u() <= 0) {
            c0Var3.f4560k = -1;
            c0Var3.f4561l = -1;
            c0Var3.f4562m = 0;
            return c0Var3;
        }
        c0Var3.f4560k = this.f10879C ? D0() : C0();
        View viewY0 = this.f10893w ? y0(true) : z0(true);
        c0Var3.f4561l = viewY0 != null ? H.C(viewY0) : -1;
        int i7 = this.f10885o;
        c0Var3.f4562m = i7;
        c0Var3.f4563n = new int[i7];
        for (int i8 = 0; i8 < this.f10885o; i8++) {
            if (this.f10879C) {
                iJ = this.f10886p[i8].h(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iK = this.f10887q.g();
                    iJ -= iK;
                }
            } else {
                iJ = this.f10886p[i8].j(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iK = this.f10887q.k();
                    iJ -= iK;
                }
            }
            c0Var3.f4563n[i8] = iJ;
        }
        return c0Var3;
    }

    @Override // K2.H
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.f10881E != null || (recyclerView = this.f4471b) == null) {
            return;
        }
        recyclerView.f(str);
    }

    @Override // K2.H
    public final void b0(int i7) {
        if (i7 == 0) {
            t0();
        }
    }

    @Override // K2.H
    public final boolean c() {
        return this.f10889s == 0;
    }

    @Override // K2.H
    public final boolean d() {
        return this.f10889s == 1;
    }

    @Override // K2.H
    public final boolean e(I i7) {
        return i7 instanceof a0;
    }

    @Override // K2.H
    public final void g(int i7, int i8, S s7, C0311o c0311o) {
        C0314s c0314s;
        int iH;
        int iJ;
        if (this.f10889s != 0) {
            i7 = i8;
        }
        if (u() == 0 || i7 == 0) {
            return;
        }
        M0(i7);
        int[] iArr = this.I;
        if (iArr == null || iArr.length < this.f10885o) {
            this.I = new int[this.f10885o];
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = this.f10885o;
            c0314s = this.f10891u;
            if (i9 >= i11) {
                break;
            }
            if (c0314s.f4667d == -1) {
                iH = c0314s.f4669f;
                iJ = this.f10886p[i9].j(iH);
            } else {
                iH = this.f10886p[i9].h(c0314s.f4670g);
                iJ = c0314s.f4670g;
            }
            int i12 = iH - iJ;
            if (i12 >= 0) {
                this.I[i10] = i12;
                i10++;
            }
            i9++;
        }
        Arrays.sort(this.I, 0, i10);
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = c0314s.f4666c;
            if (i14 < 0 || i14 >= s7.b()) {
                return;
            }
            c0311o.b(c0314s.f4666c, this.I[i13]);
            c0314s.f4666c += c0314s.f4667d;
        }
    }

    @Override // K2.H
    public final int i(S s7) {
        return u0(s7);
    }

    @Override // K2.H
    public final int i0(int i7, N n7, S s7) {
        return R0(i7, n7, s7);
    }

    @Override // K2.H
    public final int j(S s7) {
        return v0(s7);
    }

    @Override // K2.H
    public final int j0(int i7, N n7, S s7) {
        return R0(i7, n7, s7);
    }

    @Override // K2.H
    public final int k(S s7) {
        return w0(s7);
    }

    @Override // K2.H
    public final int l(S s7) {
        return u0(s7);
    }

    @Override // K2.H
    public final int m(S s7) {
        return v0(s7);
    }

    @Override // K2.H
    public final void m0(Rect rect, int i7, int i8) {
        int iF;
        int iF2;
        int i9 = this.f10885o;
        int iA = A() + z();
        int iY = y() + B();
        if (this.f10889s == 1) {
            int iHeight = rect.height() + iY;
            RecyclerView recyclerView = this.f4471b;
            Field field = AbstractC1067u.a;
            iF2 = H.f(i8, iHeight, recyclerView.getMinimumHeight());
            iF = H.f(i7, (this.f10890t * i9) + iA, this.f4471b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iA;
            RecyclerView recyclerView2 = this.f4471b;
            Field field2 = AbstractC1067u.a;
            iF = H.f(i7, iWidth, recyclerView2.getMinimumWidth());
            iF2 = H.f(i8, (this.f10890t * i9) + iY, this.f4471b.getMinimumHeight());
        }
        this.f4471b.setMeasuredDimension(iF, iF2);
    }

    @Override // K2.H
    public final int n(S s7) {
        return w0(s7);
    }

    @Override // K2.H
    public final I q() {
        return this.f10889s == 0 ? new a0(-2, -1) : new a0(-1, -2);
    }

    @Override // K2.H
    public final I r(Context context, AttributeSet attributeSet) {
        return new a0(context, attributeSet);
    }

    @Override // K2.H
    public final I s(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a0((ViewGroup.MarginLayoutParams) layoutParams) : new a0(layoutParams);
    }

    @Override // K2.H
    public final boolean s0() {
        return this.f10881E == null;
    }

    public final boolean t0() {
        int iC0;
        if (u() != 0 && this.f10878B != 0 && this.f4475f) {
            if (this.f10893w) {
                iC0 = D0();
                C0();
            } else {
                iC0 = C0();
                D0();
            }
            w wVar = this.f10877A;
            if (iC0 == 0 && H0() != null) {
                wVar.r();
                this.f4474e = true;
                h0();
                return true;
            }
        }
        return false;
    }

    public final int u0(S s7) {
        if (u() == 0) {
            return 0;
        }
        AbstractC0319x abstractC0319x = this.f10887q;
        boolean z7 = !this.f10884H;
        return m.q(s7, abstractC0319x, z0(z7), y0(z7), this, this.f10884H);
    }

    public final int v0(S s7) {
        if (u() == 0) {
            return 0;
        }
        AbstractC0319x abstractC0319x = this.f10887q;
        boolean z7 = !this.f10884H;
        return m.r(s7, abstractC0319x, z0(z7), y0(z7), this, this.f10884H, this.f10893w);
    }

    public final int w0(S s7) {
        if (u() == 0) {
            return 0;
        }
        AbstractC0319x abstractC0319x = this.f10887q;
        boolean z7 = !this.f10884H;
        return m.s(s7, abstractC0319x, z0(z7), y0(z7), this, this.f10884H);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int x0(N n7, C0314s c0314s, S s7) {
        d0 d0Var;
        ?? r62;
        int i7;
        int iJ;
        int iC;
        int iK;
        int iC2;
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        int i12 = 1;
        this.f10894x.set(0, this.f10885o, true);
        C0314s c0314s2 = this.f10891u;
        int i13 = c0314s2.f4672i ? c0314s.f4668e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0314s.f4668e == 1 ? c0314s.f4670g + c0314s.f4665b : c0314s.f4669f - c0314s.f4665b;
        int i14 = c0314s.f4668e;
        for (int i15 = 0; i15 < this.f10885o; i15++) {
            if (!((ArrayList) this.f10886p[i15].f4578f).isEmpty()) {
                U0(this.f10886p[i15], i14, i13);
            }
        }
        int iG = this.f10893w ? this.f10887q.g() : this.f10887q.k();
        boolean z7 = false;
        while (true) {
            int i16 = c0314s.f4666c;
            if (((i16 < 0 || i16 >= s7.b()) ? i11 : i12) == 0 || (!c0314s2.f4672i && this.f10894x.isEmpty())) {
                break;
            }
            View view = n7.k(c0314s.f4666c, Long.MAX_VALUE).a;
            c0314s.f4666c += c0314s.f4667d;
            a0 a0Var = (a0) view.getLayoutParams();
            int iB = a0Var.a.b();
            w wVar = this.f10877A;
            int[] iArr = (int[]) wVar.f2037l;
            int i17 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i17 == -1) {
                if (L0(c0314s.f4668e)) {
                    i10 = this.f10885o - i12;
                    i9 = -1;
                    i8 = -1;
                } else {
                    i8 = i12;
                    i9 = this.f10885o;
                    i10 = i11;
                }
                d0 d0Var2 = null;
                if (c0314s.f4668e == i12) {
                    int iK2 = this.f10887q.k();
                    int i18 = Integer.MAX_VALUE;
                    while (i10 != i9) {
                        d0 d0Var3 = this.f10886p[i10];
                        int iH = d0Var3.h(iK2);
                        if (iH < i18) {
                            i18 = iH;
                            d0Var2 = d0Var3;
                        }
                        i10 += i8;
                    }
                } else {
                    int iG2 = this.f10887q.g();
                    int i19 = Integer.MIN_VALUE;
                    while (i10 != i9) {
                        d0 d0Var4 = this.f10886p[i10];
                        int iJ2 = d0Var4.j(iG2);
                        if (iJ2 > i19) {
                            d0Var2 = d0Var4;
                            i19 = iJ2;
                        }
                        i10 += i8;
                    }
                }
                d0Var = d0Var2;
                wVar.v(iB);
                ((int[]) wVar.f2037l)[iB] = d0Var.f4577e;
            } else {
                d0Var = this.f10886p[i17];
            }
            a0Var.f4549e = d0Var;
            if (c0314s.f4668e == 1) {
                r62 = 0;
                a(view, -1, false);
            } else {
                r62 = 0;
                a(view, 0, false);
            }
            if (this.f10889s == 1) {
                i7 = 1;
                J0(view, H.v(r62, this.f10890t, this.f4480k, r62, ((ViewGroup.MarginLayoutParams) a0Var).width), H.v(true, this.f4483n, this.f4481l, y() + B(), ((ViewGroup.MarginLayoutParams) a0Var).height));
            } else {
                i7 = 1;
                J0(view, H.v(true, this.f4482m, this.f4480k, A() + z(), ((ViewGroup.MarginLayoutParams) a0Var).width), H.v(false, this.f10890t, this.f4481l, 0, ((ViewGroup.MarginLayoutParams) a0Var).height));
            }
            if (c0314s.f4668e == i7) {
                iC = d0Var.h(iG);
                iJ = this.f10887q.c(view) + iC;
            } else {
                iJ = d0Var.j(iG);
                iC = iJ - this.f10887q.c(view);
            }
            if (c0314s.f4668e == 1) {
                d0 d0Var5 = a0Var.f4549e;
                d0Var5.getClass();
                a0 a0Var2 = (a0) view.getLayoutParams();
                a0Var2.f4549e = d0Var5;
                ArrayList arrayList = (ArrayList) d0Var5.f4578f;
                arrayList.add(view);
                d0Var5.f4575c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    d0Var5.f4574b = Integer.MIN_VALUE;
                }
                if (a0Var2.a.g() || a0Var2.a.j()) {
                    d0Var5.f4576d = ((StaggeredGridLayoutManager) d0Var5.f4579g).f10887q.c(view) + d0Var5.f4576d;
                }
            } else {
                d0 d0Var6 = a0Var.f4549e;
                d0Var6.getClass();
                a0 a0Var3 = (a0) view.getLayoutParams();
                a0Var3.f4549e = d0Var6;
                ArrayList arrayList2 = (ArrayList) d0Var6.f4578f;
                arrayList2.add(0, view);
                d0Var6.f4574b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    d0Var6.f4575c = Integer.MIN_VALUE;
                }
                if (a0Var3.a.g() || a0Var3.a.j()) {
                    d0Var6.f4576d = ((StaggeredGridLayoutManager) d0Var6.f4579g).f10887q.c(view) + d0Var6.f4576d;
                }
            }
            if (I0() && this.f10889s == 1) {
                iC2 = this.f10888r.g() - (((this.f10885o - 1) - d0Var.f4577e) * this.f10890t);
                iK = iC2 - this.f10888r.c(view);
            } else {
                iK = this.f10888r.k() + (d0Var.f4577e * this.f10890t);
                iC2 = this.f10888r.c(view) + iK;
            }
            if (this.f10889s == 1) {
                H.I(view, iK, iC, iC2, iJ);
            } else {
                H.I(view, iC, iK, iJ, iC2);
            }
            U0(d0Var, c0314s2.f4668e, i13);
            N0(n7, c0314s2);
            if (c0314s2.f4671h && view.hasFocusable()) {
                this.f10894x.set(d0Var.f4577e, false);
            }
            i12 = 1;
            z7 = true;
            i11 = 0;
        }
        if (!z7) {
            N0(n7, c0314s2);
        }
        int iK3 = c0314s2.f4668e == -1 ? this.f10887q.k() - F0(this.f10887q.k()) : E0(this.f10887q.g()) - this.f10887q.g();
        if (iK3 > 0) {
            return Math.min(c0314s.f4665b, iK3);
        }
        return 0;
    }

    public final View y0(boolean z7) {
        int iK = this.f10887q.k();
        int iG = this.f10887q.g();
        View view = null;
        for (int iU = u() - 1; iU >= 0; iU--) {
            View viewT = t(iU);
            int iE = this.f10887q.e(viewT);
            int iB = this.f10887q.b(viewT);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z7) {
                    return viewT;
                }
                if (view == null) {
                    view = viewT;
                }
            }
        }
        return view;
    }

    public final View z0(boolean z7) {
        int iK = this.f10887q.k();
        int iG = this.f10887q.g();
        int iU = u();
        View view = null;
        for (int i7 = 0; i7 < iU; i7++) {
            View viewT = t(i7);
            int iE = this.f10887q.e(viewT);
            if (this.f10887q.b(viewT) > iK && iE < iG) {
                if (iE >= iK || !z7) {
                    return viewT;
                }
                if (view == null) {
                    view = viewT;
                }
            }
        }
        return view;
    }
}
