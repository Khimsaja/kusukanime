package S0;

/* loaded from: classes.dex */
public abstract class f {
    public static final float a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f8708b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f8709c;

    static {
        a(0.0f);
        a(0.5f);
        a = 0.5f;
        a(-1.0f);
        f8708b = -1.0f;
        a(1.0f);
        f8709c = 1.0f;
    }

    public static void a(float f5) {
        if ((0.0f > f5 || f5 > 1.0f) && f5 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }
}
