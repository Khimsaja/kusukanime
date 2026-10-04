package C2;

/* loaded from: classes.dex */
public final class w implements InterfaceC0037j {

    /* renamed from: e, reason: collision with root package name */
    public String f917e;

    /* renamed from: f, reason: collision with root package name */
    public V1.G f918f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f921i;

    /* renamed from: k, reason: collision with root package name */
    public int f923k;

    /* renamed from: l, reason: collision with root package name */
    public int f924l;

    /* renamed from: n, reason: collision with root package name */
    public int f926n;

    /* renamed from: o, reason: collision with root package name */
    public int f927o;

    /* renamed from: s, reason: collision with root package name */
    public int f931s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f933u;

    /* renamed from: d, reason: collision with root package name */
    public int f916d = 0;
    public final B1.B a = new B1.B(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    public final B1.A f914b = new B1.A();

    /* renamed from: c, reason: collision with root package name */
    public final B1.B f915c = new B1.B();

    /* renamed from: p, reason: collision with root package name */
    public final x f928p = new x();

    /* renamed from: q, reason: collision with root package name */
    public int f929q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f930r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f932t = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f922j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f925m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f919g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f920h = -9.223372036854776E18d;

    @Override // C2.InterfaceC0037j
    public final void a() {
        this.f916d = 0;
        this.f924l = 0;
        this.a.C(2);
        this.f926n = 0;
        this.f927o = 0;
        this.f929q = -2147483647;
        this.f930r = -1;
        this.f931s = 0;
        this.f932t = -1L;
        this.f933u = false;
        this.f921i = false;
        this.f925m = true;
        this.f922j = true;
        this.f919g = -9.223372036854776E18d;
        this.f920h = -9.223372036854776E18d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x041d  */
    @Override // C2.InterfaceC0037j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(B1.B r24) throws y1.E {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.w.b(B1.B):void");
    }

    @Override // C2.InterfaceC0037j
    public final void d(int i7, long j7) {
        this.f923k = i7;
        if (!this.f922j && (this.f927o != 0 || !this.f925m)) {
            this.f921i = true;
        }
        if (j7 != -9223372036854775807L) {
            if (this.f921i) {
                this.f920h = j7;
            } else {
                this.f919g = j7;
            }
        }
    }

    @Override // C2.InterfaceC0037j
    public final void e(V1.p pVar, K k7) {
        k7.a();
        k7.b();
        this.f917e = k7.f689e;
        k7.b();
        this.f918f = pVar.m(k7.f688d, 1);
    }

    @Override // C2.InterfaceC0037j
    public final void c(boolean z7) {
    }
}
