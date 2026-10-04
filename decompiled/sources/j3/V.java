package j3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class V extends W implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public static final V f12301l = new V(0);

    /* renamed from: m, reason: collision with root package name */
    public static final V f12302m = new V(1);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12303k;

    public /* synthetic */ V(int i7) {
        this.f12303k = i7;
    }

    @Override // j3.W
    public final W a() {
        switch (this.f12303k) {
            case 0:
                return f12302m;
            default:
                return f12301l;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f12303k) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f12303k) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
