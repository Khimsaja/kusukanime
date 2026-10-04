package y1;

import B1.AbstractC0015b;
import android.util.SparseBooleanArray;

/* renamed from: y1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2391m {
    public final SparseBooleanArray a;

    public C2391m(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i7) {
        SparseBooleanArray sparseBooleanArray = this.a;
        AbstractC0015b.f(i7, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2391m)) {
            return false;
        }
        C2391m c2391m = (C2391m) obj;
        int i7 = B1.K.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i7 >= 24) {
            return sparseBooleanArray.equals(c2391m.a);
        }
        if (sparseBooleanArray.size() != c2391m.a.size()) {
            return false;
        }
        for (int i8 = 0; i8 < sparseBooleanArray.size(); i8++) {
            if (a(i8) != c2391m.a(i8)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i7 = B1.K.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i7 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i8 = 0; i8 < sparseBooleanArray.size(); i8++) {
            size = (size * 31) + a(i8);
        }
        return size;
    }
}
