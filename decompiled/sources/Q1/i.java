package Q1;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import y1.U;

/* loaded from: classes.dex */
public final class i extends U {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f7881A;

    /* renamed from: B, reason: collision with root package name */
    public final SparseArray f7882B;

    /* renamed from: C, reason: collision with root package name */
    public final SparseBooleanArray f7883C;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f7884u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f7885v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f7886w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f7887x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f7888y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f7889z;

    public i(j jVar) {
        b(jVar);
        this.f7884u = jVar.f7894u;
        this.f7885v = jVar.f7895v;
        this.f7886w = jVar.f7896w;
        this.f7887x = jVar.f7897x;
        this.f7888y = jVar.f7898y;
        this.f7889z = jVar.f7899z;
        this.f7881A = jVar.f7891A;
        SparseArray sparseArray = new SparseArray();
        int i7 = 0;
        while (true) {
            SparseArray sparseArray2 = jVar.f7892B;
            if (i7 >= sparseArray2.size()) {
                this.f7882B = sparseArray;
                this.f7883C = jVar.f7893C.clone();
                return;
            } else {
                sparseArray.put(sparseArray2.keyAt(i7), new HashMap((Map) sparseArray2.valueAt(i7)));
                i7++;
            }
        }
    }

    @Override // y1.U
    public final U c(String[] strArr) {
        super.c(strArr);
        return this;
    }

    public final void d(int i7) {
        this.f17992t.remove(Integer.valueOf(i7));
    }

    public i() {
        this.f7882B = new SparseArray();
        this.f7883C = new SparseBooleanArray();
        this.f7884u = true;
        this.f7885v = true;
        this.f7886w = true;
        this.f7887x = true;
        this.f7888y = true;
        this.f7889z = true;
        this.f7881A = true;
    }
}
