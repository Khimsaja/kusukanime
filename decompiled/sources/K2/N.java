package K2;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b1.AbstractC0703b;
import f1.AbstractC0870c;
import i1.AbstractC1067u;
import i1.C1049b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class N {
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4492b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4493c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4494d;

    /* renamed from: e, reason: collision with root package name */
    public int f4495e;

    /* renamed from: f, reason: collision with root package name */
    public int f4496f;

    /* renamed from: g, reason: collision with root package name */
    public M f4497g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4498h;

    public N(RecyclerView recyclerView) {
        this.f4498h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.f4492b = null;
        this.f4493c = new ArrayList();
        this.f4494d = Collections.unmodifiableList(arrayList);
        this.f4495e = 2;
        this.f4496f = 2;
    }

    public final void a(W w7, boolean z7) {
        RecyclerView.g(w7);
        RecyclerView recyclerView = this.f4498h;
        Y y7 = recyclerView.f10867u0;
        View view = w7.a;
        if (y7 != null) {
            X x7 = y7.f4540e;
            AbstractC1067u.b(view, x7 != null ? (C1049b) x7.f4538e.remove(view) : null);
        }
        if (z7) {
            ArrayList arrayList = recyclerView.f10871x;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.f10853n0 != null) {
                recyclerView.f10858q.M(w7);
            }
        }
        w7.f4536r = null;
        w7.f4535q = null;
        M mC = c();
        mC.getClass();
        int i7 = w7.f4523e;
        ArrayList arrayList2 = mC.a(i7).a;
        if (((L) mC.a.get(i7)).f4487b <= arrayList2.size()) {
            AbstractC0870c.J(view);
        } else {
            w7.l();
            arrayList2.add(w7);
        }
    }

    public final int b(int i7) {
        RecyclerView recyclerView = this.f4498h;
        if (i7 >= 0 && i7 < recyclerView.f10853n0.b()) {
            return !recyclerView.f10853n0.f4504f ? i7 : recyclerView.f10854o.v(i7, 0);
        }
        StringBuilder sbP = AbstractC0703b.p(i7, "invalid position ", ". State item count is ");
        sbP.append(recyclerView.f10853n0.b());
        sbP.append(recyclerView.w());
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    public final M c() {
        if (this.f4497g == null) {
            M m7 = new M();
            m7.a = new SparseArray();
            m7.f4490b = 0;
            m7.f4491c = Collections.newSetFromMap(new IdentityHashMap());
            this.f4497g = m7;
            d();
        }
        return this.f4497g;
    }

    public final void d() {
        RecyclerView recyclerView;
        A a;
        M m7 = this.f4497g;
        if (m7 == null || (a = (recyclerView = this.f4498h).f10868v) == null || !recyclerView.f10811B) {
            return;
        }
        m7.f4491c.add(a);
    }

    public final void e(A a, boolean z7) {
        M m7 = this.f4497g;
        if (m7 == null) {
            return;
        }
        Set set = m7.f4491c;
        set.remove(a);
        if (set.size() != 0 || z7) {
            return;
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = m7.a;
            if (i7 >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((L) sparseArray.get(sparseArray.keyAt(i7))).a;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                AbstractC0870c.J(((W) arrayList.get(i8)).a);
            }
            i7++;
        }
    }

    public final void f() {
        ArrayList arrayList = this.f4493c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.f10806J0) {
            C0311o c0311o = this.f4498h.f10851m0;
            int[] iArr = c0311o.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0311o.f4652d = 0;
        }
    }

    public final void g(int i7) {
        ArrayList arrayList = this.f4493c;
        a((W) arrayList.get(i7), true);
        arrayList.remove(i7);
    }

    public final void h(View view) {
        W wF = RecyclerView.F(view);
        boolean zI = wF.i();
        RecyclerView recyclerView = this.f4498h;
        if (zI) {
            recyclerView.removeDetachedView(view, false);
        }
        if (wF.h()) {
            wF.f4531m.l(wF);
        } else if (wF.o()) {
            wF.f4527i &= -33;
        }
        i(wF);
        if (recyclerView.f10832T == null || wF.f()) {
            return;
        }
        recyclerView.f10832T.d(wF);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0090, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(K2.W r13) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.N.i(K2.W):void");
    }

    public final void j(View view) {
        E e7;
        W wF = RecyclerView.F(view);
        boolean z7 = (wF.f4527i & 12) != 0;
        RecyclerView recyclerView = this.f4498h;
        if (!z7 && wF.j() && (e7 = recyclerView.f10832T) != null) {
            C0305i c0305i = (C0305i) e7;
            if (wF.c().isEmpty() && c0305i.f4606g && !wF.e()) {
                if (this.f4492b == null) {
                    this.f4492b = new ArrayList();
                }
                wF.f4531m = this;
                wF.f4532n = true;
                this.f4492b.add(wF);
                return;
            }
        }
        if (!wF.e() || wF.g()) {
            wF.f4531m = this;
            wF.f4532n = false;
            this.a.add(wF);
        } else {
            recyclerView.f10868v.getClass();
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.w());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02e5 A[PHI: r11
      0x02e5: PHI (r11v3 K2.W) = (r11v2 K2.W), (r11v5 K2.W) binds: [B:113:0x01f9, B:138:0x0266] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x045f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final K2.W k(int r24, long r25) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.N.k(int, long):K2.W");
    }

    public final void l(W w7) {
        if (w7.f4532n) {
            this.f4492b.remove(w7);
        } else {
            this.a.remove(w7);
        }
        w7.f4531m = null;
        w7.f4532n = false;
        w7.f4527i &= -33;
    }

    public final void m() {
        H h7 = this.f4498h.f10869w;
        this.f4496f = this.f4495e + (h7 != null ? h7.f4478i : 0);
        ArrayList arrayList = this.f4493c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f4496f; size--) {
            g(size);
        }
    }
}
