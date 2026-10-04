package K2;

import D.P0;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: K2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321z {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ C0321z(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(C0297a c0297a) {
        int i7 = c0297a.a;
        RecyclerView recyclerView = this.a;
        if (i7 == 1) {
            recyclerView.f10869w.S(c0297a.f4547b, c0297a.f4548c);
            return;
        }
        if (i7 == 2) {
            recyclerView.f10869w.V(c0297a.f4547b, c0297a.f4548c);
        } else if (i7 == 4) {
            recyclerView.f10869w.W(c0297a.f4547b, c0297a.f4548c);
        } else {
            if (i7 != 8) {
                return;
            }
            recyclerView.f10869w.U(c0297a.f4547b, c0297a.f4548c);
        }
    }

    public W b(int i7) {
        RecyclerView recyclerView = this.a;
        int iC = recyclerView.f10856p.C();
        int i8 = 0;
        W w7 = null;
        while (true) {
            if (i8 >= iC) {
                break;
            }
            W wF = RecyclerView.F(recyclerView.f10856p.B(i8));
            if (wF != null && !wF.g() && wF.f4521c == i7) {
                if (!((ArrayList) recyclerView.f10856p.f418n).contains(wF.a)) {
                    w7 = wF;
                    break;
                }
                w7 = wF;
            }
            i8++;
        }
        if (w7 == null || ((ArrayList) recyclerView.f10856p.f418n).contains(w7.a)) {
            return null;
        }
        return w7;
    }

    public void c(int i7, int i8) {
        int i9;
        int i10;
        RecyclerView recyclerView = this.a;
        int iC = recyclerView.f10856p.C();
        int i11 = i8 + i7;
        for (int i12 = 0; i12 < iC; i12++) {
            View viewB = recyclerView.f10856p.B(i12);
            W wF = RecyclerView.F(viewB);
            if (wF != null && !wF.n() && (i10 = wF.f4521c) >= i7 && i10 < i11) {
                wF.a(2);
                wF.a(1024);
                ((I) viewB.getLayoutParams()).f4485c = true;
            }
        }
        N n7 = recyclerView.f10850m;
        ArrayList arrayList = n7.f4493c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            W w7 = (W) arrayList.get(size);
            if (w7 != null && (i9 = w7.f4521c) >= i7 && i9 < i11) {
                w7.a(2);
                n7.g(size);
            }
        }
        recyclerView.f10861r0 = true;
    }

    public void d(int i7, int i8) {
        RecyclerView recyclerView = this.a;
        int iC = recyclerView.f10856p.C();
        for (int i9 = 0; i9 < iC; i9++) {
            W wF = RecyclerView.F(recyclerView.f10856p.B(i9));
            if (wF != null && !wF.n() && wF.f4521c >= i7) {
                wF.k(i8, false);
                recyclerView.f10853n0.f4503e = true;
            }
        }
        ArrayList arrayList = recyclerView.f10850m.f4493c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            W w7 = (W) arrayList.get(i10);
            if (w7 != null && w7.f4521c >= i7) {
                w7.k(i8, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f10859q0 = true;
    }

    public void e(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        RecyclerView recyclerView = this.a;
        int iC = recyclerView.f10856p.C();
        int i16 = -1;
        if (i7 < i8) {
            i10 = i7;
            i9 = i8;
            i11 = -1;
        } else {
            i9 = i7;
            i10 = i8;
            i11 = 1;
        }
        for (int i17 = 0; i17 < iC; i17++) {
            W wF = RecyclerView.F(recyclerView.f10856p.B(i17));
            if (wF != null && (i15 = wF.f4521c) >= i10 && i15 <= i9) {
                if (i15 == i7) {
                    wF.k(i8 - i7, false);
                } else {
                    wF.k(i11, false);
                }
                recyclerView.f10853n0.f4503e = true;
            }
        }
        N n7 = recyclerView.f10850m;
        n7.getClass();
        if (i7 < i8) {
            i13 = i7;
            i12 = i8;
        } else {
            i12 = i7;
            i13 = i8;
            i16 = 1;
        }
        ArrayList arrayList = n7.f4493c;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            W w7 = (W) arrayList.get(i18);
            if (w7 != null && (i14 = w7.f4521c) >= i13 && i14 <= i12) {
                if (i14 == i7) {
                    w7.k(i8 - i7, false);
                } else {
                    w7.k(i16, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f10859q0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(K2.W r9, D.P0 r10, D.P0 r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.a
            r0.getClass()
            r1 = 0
            r9.m(r1)
            K2.E r1 = r0.f10832T
            r2 = r1
            K2.i r2 = (K2.C0305i) r2
            if (r10 == 0) goto L20
            r2.getClass()
            int r4 = r10.a
            int r6 = r11.a
            if (r4 != r6) goto L22
            int r1 = r10.f1093b
            int r3 = r11.f1093b
            if (r1 == r3) goto L20
            goto L22
        L20:
            r3 = r9
            goto L2c
        L22:
            int r5 = r10.f1093b
            int r7 = r11.f1093b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L3b
        L2c:
            r2.l(r3)
            android.view.View r9 = r3.a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.f4608i
            r9.add(r3)
            r9 = 1
        L3b:
            if (r9 == 0) goto L40
            r0.O()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.C0321z.f(K2.W, D.P0, D.P0):void");
    }

    public void g(W w7, P0 p02, P0 p03) {
        boolean zG;
        RecyclerView recyclerView = this.a;
        recyclerView.f10850m.l(w7);
        recyclerView.e(w7);
        w7.m(false);
        C0305i c0305i = (C0305i) recyclerView.f10832T;
        c0305i.getClass();
        int i7 = p02.a;
        int i8 = p02.f1093b;
        View view = w7.a;
        int left = p03 == null ? view.getLeft() : p03.a;
        int top = p03 == null ? view.getTop() : p03.f1093b;
        if (w7.g() || (i7 == left && i8 == top)) {
            c0305i.l(w7);
            c0305i.f4607h.add(w7);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = c0305i.g(w7, i7, i8, left, top);
        }
        if (zG) {
            recyclerView.O();
        }
    }

    public void h(int i7) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i7);
        if (childAt != null) {
            RecyclerView.F(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i7);
    }
}
