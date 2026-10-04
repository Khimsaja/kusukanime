package i1;

import D.P0;
import android.util.Log;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import e5.AbstractC0832b;
import y0.AbstractC2359f;

/* renamed from: i1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1051d {
    public ViewParent a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f11969b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f11970c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11971d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f11972e;

    public C1051d(RecyclerView recyclerView) {
        this.f11970c = recyclerView;
    }

    public final boolean a(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        ViewParent viewParentC;
        int i10;
        int i11;
        if (!this.f11971d || (viewParentC = c(i9)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        RecyclerView recyclerView = this.f11970c;
        if (iArr2 != null) {
            recyclerView.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            if (this.f11972e == null) {
                this.f11972e = new int[2];
            }
            iArr = this.f11972e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (viewParentC instanceof InterfaceC1052e) {
            W0.i iVar = (W0.i) ((InterfaceC1052e) viewParentC);
            if (iVar.f9545l.isNestedScrollingEnabled()) {
                float f5 = -1;
                long jE = AbstractC0832b.e(i7 * f5, i8 * f5);
                int i12 = i9 == 0 ? 1 : 2;
                r0.h hVar = iVar.f9544k.a;
                r0.h hVar2 = null;
                if (hVar != null && hVar.f10414w) {
                    hVar2 = (r0.h) AbstractC2359f.k(hVar);
                }
                long jL0 = hVar2 != null ? hVar2.l0(i12, jE) : 0L;
                iArr[0] = z0.O.o(g0.c.d(jL0));
                iArr[1] = z0.O.o(g0.c.e(jL0));
            }
        } else if (i9 == 0) {
            try {
                viewParentC.onNestedPreScroll(recyclerView, i7, i8, iArr);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedPreScroll", e7);
            }
        }
        if (iArr2 != null) {
            recyclerView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public final boolean b(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        ViewParent viewParentC;
        int i12;
        int i13;
        int[] iArr3;
        if (this.f11971d && (viewParentC = c(i11)) != null) {
            if (i7 != 0 || i8 != 0 || i9 != 0 || i10 != 0) {
                RecyclerView recyclerView = this.f11970c;
                if (iArr != null) {
                    recyclerView.getLocationInWindow(iArr);
                    i12 = iArr[0];
                    i13 = iArr[1];
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                if (iArr2 == null) {
                    if (this.f11972e == null) {
                        this.f11972e = new int[2];
                    }
                    iArr3 = this.f11972e;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                } else {
                    iArr3 = iArr2;
                }
                boolean z7 = viewParentC instanceof InterfaceC1052e;
                r0.h hVar = null;
                if (z7) {
                    W0.i iVar = (W0.i) ((InterfaceC1052e) viewParentC);
                    if (iVar.f9545l.isNestedScrollingEnabled()) {
                        float f5 = -1;
                        long jE = AbstractC0832b.e(i7 * f5, i8 * f5);
                        long jE2 = AbstractC0832b.e(i9 * f5, i10 * f5);
                        int i14 = i11 == 0 ? 1 : 2;
                        r0.h hVar2 = iVar.f9544k.a;
                        if (hVar2 != null && hVar2.f10414w) {
                            hVar = (r0.h) AbstractC2359f.k(hVar2);
                        }
                        r0.h hVar3 = hVar;
                        long jM = hVar3 != null ? hVar3.M(i14, jE, jE2) : 0L;
                        iArr3[0] = z0.O.o(g0.c.d(jM));
                        iArr3[1] = z0.O.o(g0.c.e(jM));
                    }
                } else {
                    iArr3[0] = iArr3[0] + i9;
                    iArr3[1] = iArr3[1] + i10;
                    if (z7) {
                        W0.i iVar2 = (W0.i) ((InterfaceC1052e) viewParentC);
                        if (iVar2.f9545l.isNestedScrollingEnabled()) {
                            float f7 = -1;
                            long jE3 = AbstractC0832b.e(i7 * f7, i8 * f7);
                            long jE4 = AbstractC0832b.e(i9 * f7, i10 * f7);
                            int i15 = i11 == 0 ? 1 : 2;
                            r0.h hVar4 = iVar2.f9544k.a;
                            if (hVar4 != null && hVar4.f10414w) {
                                hVar = (r0.h) AbstractC2359f.k(hVar4);
                            }
                            r0.h hVar5 = hVar;
                            if (hVar5 != null) {
                                hVar5.M(i15, jE3, jE4);
                            }
                        }
                    } else if (i11 == 0) {
                        try {
                            viewParentC.onNestedScroll(recyclerView, i7, i8, i9, i10);
                        } catch (AbstractMethodError e7) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedScroll", e7);
                        }
                    }
                }
                if (iArr != null) {
                    recyclerView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i12;
                    iArr[1] = iArr[1] - i13;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent c(int i7) {
        if (i7 == 0) {
            return this.a;
        }
        if (i7 != 1) {
            return null;
        }
        return this.f11969b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0053 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(int r12, int r13) {
        /*
            r11 = this;
            android.view.ViewParent r0 = r11.c(r13)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == 0) goto Lf
            goto L88
        Lf:
            boolean r0 = r11.f11971d
            if (r0 == 0) goto L95
            androidx.recyclerview.widget.RecyclerView r0 = r11.f11970c
            android.view.ViewParent r3 = r0.getParent()
            r4 = r0
        L1a:
            if (r3 == 0) goto L95
            boolean r5 = r3 instanceof i1.InterfaceC1052e
            java.lang.String r6 = "ViewParentCompat"
            java.lang.String r7 = "ViewParent "
            if (r5 == 0) goto L34
            r8 = r3
            i1.e r8 = (i1.InterfaceC1052e) r8
            r8 = r12 & 2
            if (r8 != 0) goto L32
            r8 = r12 & 1
            if (r8 == 0) goto L30
            goto L32
        L30:
            r8 = r1
            goto L51
        L32:
            r8 = r2
            goto L51
        L34:
            if (r13 != 0) goto L30
            boolean r8 = r3.onStartNestedScroll(r4, r0, r12)     // Catch: java.lang.AbstractMethodError -> L3b
            goto L51
        L3b:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r7)
            r9.append(r3)
            java.lang.String r10 = " does not implement interface method onStartNestedScroll"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.e(r6, r9, r8)
            goto L30
        L51:
            if (r8 == 0) goto L89
            if (r13 == 0) goto L5b
            if (r13 == r2) goto L58
            goto L5d
        L58:
            r11.f11969b = r3
            goto L5d
        L5b:
            r11.a = r3
        L5d:
            if (r5 == 0) goto L6d
            i1.e r3 = (i1.InterfaceC1052e) r3
            W0.i r3 = (W0.i) r3
            D.P0 r0 = r3.f9541D
            if (r13 != r2) goto L6a
            r0.f1093b = r12
            goto L88
        L6a:
            r0.a = r12
            goto L88
        L6d:
            if (r13 != 0) goto L88
            r3.onNestedScrollAccepted(r4, r0, r12)     // Catch: java.lang.AbstractMethodError -> L73
            goto L88
        L73:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r7)
            r13.append(r3)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            android.util.Log.e(r6, r13, r12)
        L88:
            return r2
        L89:
            boolean r5 = r3 instanceof android.view.View
            if (r5 == 0) goto L90
            r4 = r3
            android.view.View r4 = (android.view.View) r4
        L90:
            android.view.ViewParent r3 = r3.getParent()
            goto L1a
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C1051d.d(int, int):boolean");
    }

    public final void e(int i7) {
        ViewParent viewParentC = c(i7);
        if (viewParentC != null) {
            RecyclerView recyclerView = this.f11970c;
            if (viewParentC instanceof InterfaceC1052e) {
                P0 p02 = ((W0.i) ((InterfaceC1052e) viewParentC)).f9541D;
                if (i7 == 1) {
                    p02.f1093b = 0;
                } else {
                    p02.a = 0;
                }
            } else if (i7 == 0) {
                try {
                    viewParentC.onStopNestedScroll(recyclerView);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onStopNestedScroll", e7);
                }
            }
            if (i7 == 0) {
                this.a = null;
            } else {
                if (i7 != 1) {
                    return;
                }
                this.f11969b = null;
            }
        }
    }
}
