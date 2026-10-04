package i0;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1018b {
    public static final long a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f11862b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f11863c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f11864d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f11865e = 0;

    static {
        long j7 = 3;
        long j8 = j7 << 32;
        a = (0 & 4294967295L) | j8;
        f11862b = (1 & 4294967295L) | j8;
        f11863c = j8 | (2 & 4294967295L);
        f11864d = (j7 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public static String b(long j7) {
        return a(j7, a) ? "Rgb" : a(j7, f11862b) ? "Xyz" : a(j7, f11863c) ? "Lab" : a(j7, f11864d) ? "Cmyk" : "Unknown";
    }
}
