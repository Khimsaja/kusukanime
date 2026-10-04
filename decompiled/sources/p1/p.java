package p1;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class p {
    public final SparseArray a;

    /* renamed from: b, reason: collision with root package name */
    public q f14192b;

    public p(int i7) {
        this.a = new SparseArray(i7);
    }

    public final void a(q qVar, int i7, int i8) {
        int iA = qVar.a(i7);
        SparseArray sparseArray = this.a;
        p pVar = sparseArray == null ? null : (p) sparseArray.get(iA);
        if (pVar == null) {
            pVar = new p(1);
            sparseArray.put(qVar.a(i7), pVar);
        }
        if (i8 > i7) {
            pVar.a(qVar, i7 + 1, i8);
        } else {
            pVar.f14192b = qVar;
        }
    }
}
