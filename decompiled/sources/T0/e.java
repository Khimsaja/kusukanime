package T0;

/* loaded from: classes.dex */
public final class e implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final float f8839k;

    public static final boolean a(float f5, float f7) {
        return Float.compare(f5, f7) == 0;
    }

    public static String b(float f5) {
        if (Float.isNaN(f5)) {
            return "Dp.Unspecified";
        }
        return f5 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f8839k, ((e) obj).f8839k);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return Float.compare(this.f8839k, ((e) obj).f8839k) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8839k);
    }

    public final String toString() {
        return b(this.f8839k);
    }
}
