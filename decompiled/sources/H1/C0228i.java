package H1;

/* renamed from: H1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228i {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3492b;

    /* renamed from: c, reason: collision with root package name */
    public long f3493c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f3494d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f3496f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f3497g = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public float f3500j = 0.97f;

    /* renamed from: i, reason: collision with root package name */
    public float f3499i = 1.03f;

    /* renamed from: k, reason: collision with root package name */
    public float f3501k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public long f3502l = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f3495e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f3498h = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public long f3503m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public long f3504n = -9223372036854775807L;

    public C0228i(long j7, long j8) {
        this.a = j7;
        this.f3492b = j8;
    }

    public final void a() {
        long j7;
        long j8 = this.f3493c;
        if (j8 != -9223372036854775807L) {
            j7 = this.f3494d;
            if (j7 == -9223372036854775807L) {
                long j9 = this.f3496f;
                if (j9 != -9223372036854775807L && j8 < j9) {
                    j8 = j9;
                }
                j7 = this.f3497g;
                if (j7 == -9223372036854775807L || j8 <= j7) {
                    j7 = j8;
                }
            }
        } else {
            j7 = -9223372036854775807L;
        }
        if (this.f3495e == j7) {
            return;
        }
        this.f3495e = j7;
        this.f3498h = j7;
        this.f3503m = -9223372036854775807L;
        this.f3504n = -9223372036854775807L;
        this.f3502l = -9223372036854775807L;
    }
}
