package k4;

/* renamed from: k4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1395d {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12671b;

    public C1395d(float f5, float f7) {
        this.a = f5;
        this.f12671b = f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final Comparable a() {
        return Float.valueOf(this.f12671b);
    }

    public final Comparable b() {
        return Float.valueOf(this.a);
    }

    public final boolean c() {
        return this.a > this.f12671b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1395d)) {
            return false;
        }
        if (c() && ((C1395d) obj).c()) {
            return true;
        }
        C1395d c1395d = (C1395d) obj;
        return this.a == c1395d.a && this.f12671b == c1395d.f12671b;
    }

    public final int hashCode() {
        if (c()) {
            return -1;
        }
        return Float.hashCode(this.f12671b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return this.a + ".." + this.f12671b;
    }
}
