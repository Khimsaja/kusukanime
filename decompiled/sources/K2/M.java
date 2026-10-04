package K2;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: classes.dex */
public final class M {
    public SparseArray a;

    /* renamed from: b, reason: collision with root package name */
    public int f4490b;

    /* renamed from: c, reason: collision with root package name */
    public Set f4491c;

    public final L a(int i7) {
        SparseArray sparseArray = this.a;
        L l7 = (L) sparseArray.get(i7);
        if (l7 != null) {
            return l7;
        }
        L l8 = new L();
        sparseArray.put(i7, l8);
        return l8;
    }
}
