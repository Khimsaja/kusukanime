package h0;

/* renamed from: h0.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0976V {

    /* renamed from: b, reason: collision with root package name */
    public static final long f11815b = AbstractC0968M.i(0.5f, 0.5f);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11816c = 0;
    public final long a;

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public static final float b(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    public static final float c(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    public static String d(long j7) {
        return "TransformOrigin(packedValue=" + j7 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0976V) {
            return this.a == ((C0976V) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
