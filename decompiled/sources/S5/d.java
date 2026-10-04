package S5;

/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: k, reason: collision with root package name */
    public final n f8787k;

    /* renamed from: l, reason: collision with root package name */
    public final a f8788l;

    /* renamed from: m, reason: collision with root package name */
    public j f8789m;

    /* renamed from: n, reason: collision with root package name */
    public int f8790n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8791o;

    /* renamed from: p, reason: collision with root package name */
    public long f8792p;

    public d(n nVar) {
        this.f8787k = nVar;
        a aVarA = nVar.a();
        this.f8788l = aVarA;
        j jVar = aVarA.f8782k;
        this.f8789m = jVar;
        this.f8790n = jVar != null ? jVar.f8801b : -1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f8791o = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f8801b) goto L15;
     */
    @Override // S5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long readAtMostTo(S5.a r12, long r13) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.d.readAtMostTo(S5.a, long):long");
    }
}
