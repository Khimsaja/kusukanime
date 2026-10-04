package androidx.recyclerview.widget;

import C2.y;
import K2.AbstractC0319x;
import K2.C0311o;
import K2.C0315t;
import K2.C0316u;
import K2.C0317v;
import K2.G;
import K2.H;
import K2.I;
import K2.N;
import K2.S;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b1.AbstractC0703b;
import i1.AbstractC1067u;
import java.lang.reflect.Field;
import n6.m;

/* loaded from: classes.dex */
public class LinearLayoutManager extends H {

    /* renamed from: A, reason: collision with root package name */
    public final C0315t f10788A;

    /* renamed from: B, reason: collision with root package name */
    public final int f10789B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f10790C;

    /* renamed from: o, reason: collision with root package name */
    public int f10791o;

    /* renamed from: p, reason: collision with root package name */
    public C0316u f10792p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC0319x f10793q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10794r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f10795s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10796t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10797u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f10798v;

    /* renamed from: w, reason: collision with root package name */
    public int f10799w;

    /* renamed from: x, reason: collision with root package name */
    public int f10800x;

    /* renamed from: y, reason: collision with root package name */
    public C0317v f10801y;

    /* renamed from: z, reason: collision with root package name */
    public final y f10802z;

    public LinearLayoutManager() {
        this.f10791o = 1;
        this.f10795s = false;
        this.f10796t = false;
        this.f10797u = false;
        this.f10798v = true;
        this.f10799w = -1;
        this.f10800x = Integer.MIN_VALUE;
        this.f10801y = null;
        this.f10802z = new y();
        this.f10788A = new C0315t();
        this.f10789B = 2;
        this.f10790C = new int[2];
        Q0(1);
        b(null);
        if (this.f10795s) {
            this.f10795s = false;
            h0();
        }
    }

    public final View A0(boolean z7) {
        return this.f10796t ? D0(0, u(), z7) : D0(u() - 1, -1, z7);
    }

    public final View B0(boolean z7) {
        return this.f10796t ? D0(u() - 1, -1, z7) : D0(0, u(), z7);
    }

    public final View C0(int i7, int i8) {
        int i9;
        int i10;
        y0();
        if (i8 <= i7 && i8 >= i7) {
            return t(i7);
        }
        if (this.f10793q.e(t(i7)) < this.f10793q.k()) {
            i9 = 16644;
            i10 = 16388;
        } else {
            i9 = 4161;
            i10 = 4097;
        }
        return this.f10791o == 0 ? this.f4472c.w(i7, i8, i9, i10) : this.f4473d.w(i7, i8, i9, i10);
    }

    public final View D0(int i7, int i8, boolean z7) {
        y0();
        int i9 = z7 ? 24579 : 320;
        return this.f10791o == 0 ? this.f4472c.w(i7, i8, i9, 320) : this.f4473d.w(i7, i8, i9, 320);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View E0(K2.N r17, K2.S r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.y0()
            int r1 = r0.u()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.u()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            K2.x r7 = r0.f10793q
            int r7 = r7.k()
            K2.x r8 = r0.f10793q
            int r8 = r8.g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.t(r1)
            int r13 = K2.H.C(r12)
            K2.x r14 = r0.f10793q
            int r14 = r14.e(r12)
            K2.x r15 = r0.f10793q
            int r15 = r15.b(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            K2.I r13 = (K2.I) r13
            K2.W r13 = r13.a
            boolean r13 = r13.g()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.E0(K2.N, K2.S, boolean, boolean):android.view.View");
    }

    public final int F0(int i7, N n7, S s7, boolean z7) {
        int iG;
        int iG2 = this.f10793q.g() - i7;
        if (iG2 <= 0) {
            return 0;
        }
        int i8 = -P0(-iG2, n7, s7);
        int i9 = i7 + i8;
        if (!z7 || (iG = this.f10793q.g() - i9) <= 0) {
            return i8;
        }
        this.f10793q.o(iG);
        return iG + i8;
    }

    @Override // K2.H
    public final boolean G() {
        return true;
    }

    public final int G0(int i7, N n7, S s7, boolean z7) {
        int iK;
        int iK2 = i7 - this.f10793q.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i8 = -P0(iK2, n7, s7);
        int i9 = i7 + i8;
        if (!z7 || (iK = i9 - this.f10793q.k()) <= 0) {
            return i8;
        }
        this.f10793q.o(-iK);
        return i8 - iK;
    }

    public final View H0() {
        return t(this.f10796t ? 0 : u() - 1);
    }

    public final View I0() {
        return t(this.f10796t ? u() - 1 : 0);
    }

    public final boolean J0() {
        RecyclerView recyclerView = this.f4471b;
        Field field = AbstractC1067u.a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public void K0(N n7, S s7, C0316u c0316u, C0315t c0315t) {
        int iZ;
        int i7;
        int i8;
        int iD;
        View viewB = c0316u.b(n7);
        if (viewB == null) {
            c0315t.f4673b = true;
            return;
        }
        I i9 = (I) viewB.getLayoutParams();
        if (c0316u.f4685k == null) {
            if (this.f10796t == (c0316u.f4680f == -1)) {
                a(viewB, -1, false);
            } else {
                a(viewB, 0, false);
            }
        } else {
            if (this.f10796t == (c0316u.f4680f == -1)) {
                a(viewB, -1, true);
            } else {
                a(viewB, 0, true);
            }
        }
        I i10 = (I) viewB.getLayoutParams();
        Rect rectG = this.f4471b.G(viewB);
        int i11 = rectG.left + rectG.right;
        int i12 = rectG.top + rectG.bottom;
        int iV = H.v(c(), this.f4482m, this.f4480k, A() + z() + ((ViewGroup.MarginLayoutParams) i10).leftMargin + ((ViewGroup.MarginLayoutParams) i10).rightMargin + i11, ((ViewGroup.MarginLayoutParams) i10).width);
        int iV2 = H.v(d(), this.f4483n, this.f4481l, y() + B() + ((ViewGroup.MarginLayoutParams) i10).topMargin + ((ViewGroup.MarginLayoutParams) i10).bottomMargin + i12, ((ViewGroup.MarginLayoutParams) i10).height);
        if (p0(viewB, iV, iV2, i10)) {
            viewB.measure(iV, iV2);
        }
        c0315t.a = this.f10793q.c(viewB);
        if (this.f10791o == 1) {
            if (J0()) {
                iD = this.f4482m - A();
                iZ = iD - this.f10793q.d(viewB);
            } else {
                iZ = z();
                iD = this.f10793q.d(viewB) + iZ;
            }
            if (c0316u.f4680f == -1) {
                i7 = c0316u.f4676b;
                i8 = i7 - c0315t.a;
            } else {
                i8 = c0316u.f4676b;
                i7 = c0315t.a + i8;
            }
        } else {
            int iB = B();
            int iD2 = this.f10793q.d(viewB) + iB;
            if (c0316u.f4680f == -1) {
                int i13 = c0316u.f4676b;
                int i14 = i13 - c0315t.a;
                iD = i13;
                i7 = iD2;
                iZ = i14;
                i8 = iB;
            } else {
                int i15 = c0316u.f4676b;
                int i16 = c0315t.a + i15;
                iZ = i15;
                i7 = iD2;
                i8 = iB;
                iD = i16;
            }
        }
        H.I(viewB, iZ, i8, iD, i7);
        if (i9.a.g() || i9.a.j()) {
            c0315t.f4674c = true;
        }
        c0315t.f4675d = viewB.hasFocusable();
    }

    public final void M0(N n7, C0316u c0316u) {
        if (!c0316u.a || c0316u.f4686l) {
            return;
        }
        int i7 = c0316u.f4681g;
        int i8 = c0316u.f4683i;
        if (c0316u.f4680f == -1) {
            int iU = u();
            if (i7 < 0) {
                return;
            }
            int iF = (this.f10793q.f() - i7) + i8;
            if (this.f10796t) {
                for (int i9 = 0; i9 < iU; i9++) {
                    View viewT = t(i9);
                    if (this.f10793q.e(viewT) < iF || this.f10793q.n(viewT) < iF) {
                        N0(n7, 0, i9);
                        return;
                    }
                }
                return;
            }
            int i10 = iU - 1;
            for (int i11 = i10; i11 >= 0; i11--) {
                View viewT2 = t(i11);
                if (this.f10793q.e(viewT2) < iF || this.f10793q.n(viewT2) < iF) {
                    N0(n7, i10, i11);
                    return;
                }
            }
            return;
        }
        if (i7 < 0) {
            return;
        }
        int i12 = i7 - i8;
        int iU2 = u();
        if (!this.f10796t) {
            for (int i13 = 0; i13 < iU2; i13++) {
                View viewT3 = t(i13);
                if (this.f10793q.b(viewT3) > i12 || this.f10793q.m(viewT3) > i12) {
                    N0(n7, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iU2 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewT4 = t(i15);
            if (this.f10793q.b(viewT4) > i12 || this.f10793q.m(viewT4) > i12) {
                N0(n7, i14, i15);
                return;
            }
        }
    }

    @Override // K2.H
    public View N(View view, int i7, N n7, S s7) {
        int iX0;
        O0();
        if (u() != 0 && (iX0 = x0(i7)) != Integer.MIN_VALUE) {
            y0();
            S0(iX0, (int) (this.f10793q.l() * 0.33333334f), false, s7);
            C0316u c0316u = this.f10792p;
            c0316u.f4681g = Integer.MIN_VALUE;
            c0316u.a = false;
            z0(n7, c0316u, s7, true);
            View viewC0 = iX0 == -1 ? this.f10796t ? C0(u() - 1, -1) : C0(0, u()) : this.f10796t ? C0(0, u()) : C0(u() - 1, -1);
            View viewI0 = iX0 == -1 ? I0() : H0();
            if (!viewI0.hasFocusable()) {
                return viewC0;
            }
            if (viewC0 != null) {
                return viewI0;
            }
        }
        return null;
    }

    public final void N0(N n7, int i7, int i8) {
        if (i7 == i8) {
            return;
        }
        if (i8 <= i7) {
            while (i7 > i8) {
                View viewT = t(i7);
                f0(i7);
                n7.h(viewT);
                i7--;
            }
            return;
        }
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            View viewT2 = t(i9);
            f0(i9);
            n7.h(viewT2);
        }
    }

    @Override // K2.H
    public final void O(AccessibilityEvent accessibilityEvent) {
        super.O(accessibilityEvent);
        if (u() > 0) {
            View viewD0 = D0(0, u(), false);
            accessibilityEvent.setFromIndex(viewD0 == null ? -1 : H.C(viewD0));
            View viewD02 = D0(u() - 1, -1, false);
            accessibilityEvent.setToIndex(viewD02 != null ? H.C(viewD02) : -1);
        }
    }

    public final void O0() {
        if (this.f10791o == 1 || !J0()) {
            this.f10796t = this.f10795s;
        } else {
            this.f10796t = !this.f10795s;
        }
    }

    public final int P0(int i7, N n7, S s7) {
        if (u() != 0 && i7 != 0) {
            y0();
            this.f10792p.a = true;
            int i8 = i7 > 0 ? 1 : -1;
            int iAbs = Math.abs(i7);
            S0(i8, iAbs, true, s7);
            C0316u c0316u = this.f10792p;
            int iZ0 = z0(n7, c0316u, s7, false) + c0316u.f4681g;
            if (iZ0 >= 0) {
                if (iAbs > iZ0) {
                    i7 = i8 * iZ0;
                }
                this.f10793q.o(-i7);
                this.f10792p.f4684j = i7;
                return i7;
            }
        }
        return 0;
    }

    public final void Q0(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "invalid orientation:"));
        }
        b(null);
        if (i7 != this.f10791o || this.f10793q == null) {
            AbstractC0319x abstractC0319xA = AbstractC0319x.a(this, i7);
            this.f10793q = abstractC0319xA;
            this.f10802z.f940f = abstractC0319xA;
            this.f10791o = i7;
            h0();
        }
    }

    public void R0(boolean z7) {
        b(null);
        if (this.f10797u == z7) {
            return;
        }
        this.f10797u = z7;
        h0();
    }

    public final void S0(int i7, int i8, boolean z7, S s7) {
        int iK;
        this.f10792p.f4686l = this.f10793q.i() == 0 && this.f10793q.f() == 0;
        this.f10792p.f4680f = i7;
        int[] iArr = this.f10790C;
        iArr[0] = 0;
        iArr[1] = 0;
        s7.getClass();
        int i9 = this.f10792p.f4680f;
        iArr[0] = 0;
        iArr[1] = 0;
        int iMax = Math.max(0, 0);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z8 = i7 == 1;
        C0316u c0316u = this.f10792p;
        int i10 = z8 ? iMax2 : iMax;
        c0316u.f4682h = i10;
        if (!z8) {
            iMax = iMax2;
        }
        c0316u.f4683i = iMax;
        if (z8) {
            c0316u.f4682h = this.f10793q.h() + i10;
            View viewH0 = H0();
            C0316u c0316u2 = this.f10792p;
            c0316u2.f4679e = this.f10796t ? -1 : 1;
            int iC = H.C(viewH0);
            C0316u c0316u3 = this.f10792p;
            c0316u2.f4678d = iC + c0316u3.f4679e;
            c0316u3.f4676b = this.f10793q.b(viewH0);
            iK = this.f10793q.b(viewH0) - this.f10793q.g();
        } else {
            View viewI0 = I0();
            C0316u c0316u4 = this.f10792p;
            c0316u4.f4682h = this.f10793q.k() + c0316u4.f4682h;
            C0316u c0316u5 = this.f10792p;
            c0316u5.f4679e = this.f10796t ? 1 : -1;
            int iC2 = H.C(viewI0);
            C0316u c0316u6 = this.f10792p;
            c0316u5.f4678d = iC2 + c0316u6.f4679e;
            c0316u6.f4676b = this.f10793q.e(viewI0);
            iK = (-this.f10793q.e(viewI0)) + this.f10793q.k();
        }
        C0316u c0316u7 = this.f10792p;
        c0316u7.f4677c = i8;
        if (z7) {
            c0316u7.f4677c = i8 - iK;
        }
        c0316u7.f4681g = iK;
    }

    public final void T0(int i7, int i8) {
        this.f10792p.f4677c = this.f10793q.g() - i8;
        C0316u c0316u = this.f10792p;
        c0316u.f4679e = this.f10796t ? -1 : 1;
        c0316u.f4678d = i7;
        c0316u.f4680f = 1;
        c0316u.f4676b = i8;
        c0316u.f4681g = Integer.MIN_VALUE;
    }

    public final void U0(int i7, int i8) {
        this.f10792p.f4677c = i8 - this.f10793q.k();
        C0316u c0316u = this.f10792p;
        c0316u.f4678d = i7;
        c0316u.f4679e = this.f10796t ? 1 : -1;
        c0316u.f4680f = -1;
        c0316u.f4676b = i8;
        c0316u.f4681g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0194  */
    @Override // K2.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X(K2.N r18, K2.S r19) {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.X(K2.N, K2.S):void");
    }

    @Override // K2.H
    public void Y(S s7) {
        this.f10801y = null;
        this.f10799w = -1;
        this.f10800x = Integer.MIN_VALUE;
        this.f10802z.g();
    }

    @Override // K2.H
    public final void Z(Parcelable parcelable) {
        if (parcelable instanceof C0317v) {
            C0317v c0317v = (C0317v) parcelable;
            this.f10801y = c0317v;
            if (this.f10799w != -1) {
                c0317v.f4687k = -1;
            }
            h0();
        }
    }

    @Override // K2.H
    public final Parcelable a0() {
        C0317v c0317v = this.f10801y;
        if (c0317v != null) {
            C0317v c0317v2 = new C0317v();
            c0317v2.f4687k = c0317v.f4687k;
            c0317v2.f4688l = c0317v.f4688l;
            c0317v2.f4689m = c0317v.f4689m;
            return c0317v2;
        }
        C0317v c0317v3 = new C0317v();
        if (u() <= 0) {
            c0317v3.f4687k = -1;
            return c0317v3;
        }
        y0();
        boolean z7 = this.f10794r ^ this.f10796t;
        c0317v3.f4689m = z7;
        if (z7) {
            View viewH0 = H0();
            c0317v3.f4688l = this.f10793q.g() - this.f10793q.b(viewH0);
            c0317v3.f4687k = H.C(viewH0);
            return c0317v3;
        }
        View viewI0 = I0();
        c0317v3.f4687k = H.C(viewI0);
        c0317v3.f4688l = this.f10793q.e(viewI0) - this.f10793q.k();
        return c0317v3;
    }

    @Override // K2.H
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.f10801y != null || (recyclerView = this.f4471b) == null) {
            return;
        }
        recyclerView.f(str);
    }

    @Override // K2.H
    public final boolean c() {
        return this.f10791o == 0;
    }

    @Override // K2.H
    public final boolean d() {
        return this.f10791o == 1;
    }

    @Override // K2.H
    public final void g(int i7, int i8, S s7, C0311o c0311o) {
        if (this.f10791o != 0) {
            i7 = i8;
        }
        if (u() == 0 || i7 == 0) {
            return;
        }
        y0();
        S0(i7 > 0 ? 1 : -1, Math.abs(i7), true, s7);
        t0(s7, this.f10792p, c0311o);
    }

    @Override // K2.H
    public final void h(int i7, C0311o c0311o) {
        boolean z7;
        int i8;
        C0317v c0317v = this.f10801y;
        if (c0317v == null || (i8 = c0317v.f4687k) < 0) {
            O0();
            z7 = this.f10796t;
            i8 = this.f10799w;
            if (i8 == -1) {
                i8 = z7 ? i7 - 1 : 0;
            }
        } else {
            z7 = c0317v.f4689m;
        }
        int i9 = z7 ? -1 : 1;
        for (int i10 = 0; i10 < this.f10789B && i8 >= 0 && i8 < i7; i10++) {
            c0311o.b(i8, 0);
            i8 += i9;
        }
    }

    @Override // K2.H
    public final int i(S s7) {
        return u0(s7);
    }

    @Override // K2.H
    public int i0(int i7, N n7, S s7) {
        if (this.f10791o == 1) {
            return 0;
        }
        return P0(i7, n7, s7);
    }

    @Override // K2.H
    public int j(S s7) {
        return v0(s7);
    }

    @Override // K2.H
    public int j0(int i7, N n7, S s7) {
        if (this.f10791o == 0) {
            return 0;
        }
        return P0(i7, n7, s7);
    }

    @Override // K2.H
    public int k(S s7) {
        return w0(s7);
    }

    @Override // K2.H
    public final int l(S s7) {
        return u0(s7);
    }

    @Override // K2.H
    public int m(S s7) {
        return v0(s7);
    }

    @Override // K2.H
    public int n(S s7) {
        return w0(s7);
    }

    @Override // K2.H
    public final View p(int i7) {
        int iU = u();
        if (iU == 0) {
            return null;
        }
        int iC = i7 - H.C(t(0));
        if (iC >= 0 && iC < iU) {
            View viewT = t(iC);
            if (H.C(viewT) == i7) {
                return viewT;
            }
        }
        return super.p(i7);
    }

    @Override // K2.H
    public I q() {
        return new I(-2, -2);
    }

    @Override // K2.H
    public final boolean q0() {
        if (this.f4481l != 1073741824 && this.f4480k != 1073741824) {
            int iU = u();
            for (int i7 = 0; i7 < iU; i7++) {
                ViewGroup.LayoutParams layoutParams = t(i7).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // K2.H
    public boolean s0() {
        return this.f10801y == null && this.f10794r == this.f10797u;
    }

    public void t0(S s7, C0316u c0316u, C0311o c0311o) {
        int i7 = c0316u.f4678d;
        if (i7 < 0 || i7 >= s7.b()) {
            return;
        }
        c0311o.b(i7, Math.max(0, c0316u.f4681g));
    }

    public final int u0(S s7) {
        if (u() == 0) {
            return 0;
        }
        y0();
        AbstractC0319x abstractC0319x = this.f10793q;
        boolean z7 = !this.f10798v;
        return m.q(s7, abstractC0319x, B0(z7), A0(z7), this, this.f10798v);
    }

    public final int v0(S s7) {
        if (u() == 0) {
            return 0;
        }
        y0();
        AbstractC0319x abstractC0319x = this.f10793q;
        boolean z7 = !this.f10798v;
        return m.r(s7, abstractC0319x, B0(z7), A0(z7), this, this.f10798v, this.f10796t);
    }

    public final int w0(S s7) {
        if (u() == 0) {
            return 0;
        }
        y0();
        AbstractC0319x abstractC0319x = this.f10793q;
        boolean z7 = !this.f10798v;
        return m.s(s7, abstractC0319x, B0(z7), A0(z7), this, this.f10798v);
    }

    public final int x0(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 17 ? i7 != 33 ? i7 != 66 ? (i7 == 130 && this.f10791o == 1) ? 1 : Integer.MIN_VALUE : this.f10791o == 0 ? 1 : Integer.MIN_VALUE : this.f10791o == 1 ? -1 : Integer.MIN_VALUE : this.f10791o == 0 ? -1 : Integer.MIN_VALUE : (this.f10791o != 1 && J0()) ? -1 : 1 : (this.f10791o != 1 && J0()) ? 1 : -1;
    }

    public final void y0() {
        if (this.f10792p == null) {
            C0316u c0316u = new C0316u();
            c0316u.a = true;
            c0316u.f4682h = 0;
            c0316u.f4683i = 0;
            c0316u.f4685k = null;
            this.f10792p = c0316u;
        }
    }

    public final int z0(N n7, C0316u c0316u, S s7, boolean z7) {
        int i7;
        int i8 = c0316u.f4677c;
        int i9 = c0316u.f4681g;
        if (i9 != Integer.MIN_VALUE) {
            if (i8 < 0) {
                c0316u.f4681g = i9 + i8;
            }
            M0(n7, c0316u);
        }
        int i10 = c0316u.f4677c + c0316u.f4682h;
        while (true) {
            if ((!c0316u.f4686l && i10 <= 0) || (i7 = c0316u.f4678d) < 0 || i7 >= s7.b()) {
                break;
            }
            C0315t c0315t = this.f10788A;
            c0315t.a = 0;
            c0315t.f4673b = false;
            c0315t.f4674c = false;
            c0315t.f4675d = false;
            K0(n7, s7, c0316u, c0315t);
            if (!c0315t.f4673b) {
                int i11 = c0316u.f4676b;
                int i12 = c0315t.a;
                c0316u.f4676b = (c0316u.f4680f * i12) + i11;
                if (!c0315t.f4674c || c0316u.f4685k != null || !s7.f4504f) {
                    c0316u.f4677c -= i12;
                    i10 -= i12;
                }
                int i13 = c0316u.f4681g;
                if (i13 != Integer.MIN_VALUE) {
                    int i14 = i13 + i12;
                    c0316u.f4681g = i14;
                    int i15 = c0316u.f4677c;
                    if (i15 < 0) {
                        c0316u.f4681g = i14 + i15;
                    }
                    M0(n7, c0316u);
                }
                if (z7 && c0315t.f4675d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i8 - c0316u.f4677c;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f10791o = 1;
        this.f10795s = false;
        this.f10796t = false;
        this.f10797u = false;
        this.f10798v = true;
        this.f10799w = -1;
        this.f10800x = Integer.MIN_VALUE;
        this.f10801y = null;
        this.f10802z = new y();
        this.f10788A = new C0315t();
        this.f10789B = 2;
        this.f10790C = new int[2];
        G gD = H.D(context, attributeSet, i7, i8);
        Q0(gD.a);
        boolean z7 = gD.f4469c;
        b(null);
        if (z7 != this.f10795s) {
            this.f10795s = z7;
            h0();
        }
        R0(gD.f4470d);
    }

    @Override // K2.H
    public final void M(RecyclerView recyclerView) {
    }

    public void L0(N n7, S s7, y yVar, int i7) {
    }
}
