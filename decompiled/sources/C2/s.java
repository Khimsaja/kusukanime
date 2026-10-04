package C2;

/* loaded from: classes.dex */
public final class s {
    public final V1.G a;

    /* renamed from: b, reason: collision with root package name */
    public long f855b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f856c;

    /* renamed from: d, reason: collision with root package name */
    public int f857d;

    /* renamed from: e, reason: collision with root package name */
    public long f858e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f859f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f860g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f861h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f862i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f863j;

    /* renamed from: k, reason: collision with root package name */
    public long f864k;

    /* renamed from: l, reason: collision with root package name */
    public long f865l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f866m;

    public s(V1.G g4) {
        this.a = g4;
    }

    public final void a(int i7) {
        long j7 = this.f865l;
        if (j7 != -9223372036854775807L) {
            long j8 = this.f855b;
            long j9 = this.f864k;
            if (j8 == j9) {
                return;
            }
            int i8 = (int) (j8 - j9);
            this.a.b(j7, this.f866m ? 1 : 0, i8, i7, null);
        }
    }
}
