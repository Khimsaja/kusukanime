package G;

/* loaded from: classes.dex */
public abstract class a {
    public static final long a = a(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2553b = 0;

    public static long a(float f5, float f7) {
        return (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }
}
