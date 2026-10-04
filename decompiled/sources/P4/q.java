package P4;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: i, reason: collision with root package name */
    public static final q f7813i = new q(new q(null, 2047), 2012);
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7814b;

    /* renamed from: c, reason: collision with root package name */
    public final q f7815c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7816d;

    /* renamed from: e, reason: collision with root package name */
    public final q f7817e;

    /* renamed from: f, reason: collision with root package name */
    public final q f7818f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7819g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7820h;

    public q(boolean z7, boolean z8, q qVar, boolean z9, q qVar2, q qVar3, boolean z10, boolean z11) {
        this.a = z7;
        this.f7814b = z8;
        this.f7815c = qVar;
        this.f7816d = z9;
        this.f7817e = qVar2;
        this.f7818f = qVar3;
        this.f7819g = z10;
        this.f7820h = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q(q qVar, int i7) {
        boolean z7 = (i7 & 1) != 0;
        boolean z8 = (i7 & 2) != 0;
        q qVar2 = (i7 & 32) != 0 ? null : qVar;
        this(z7, z8, qVar2, true, qVar2, qVar2, (i7 & 512) == 0, (i7 & 1024) == 0);
    }
}
