package O;

/* renamed from: O.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516s0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public C2.G f7166k;

    /* renamed from: l, reason: collision with root package name */
    public int f7167l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f7168m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0522v0 f7169n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0520u0 f7170o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ U f7171p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0516s0(C0522v0 c0522v0, C0520u0 c0520u0, U u5, S3.c cVar) {
        super(2, cVar);
        this.f7169n = c0522v0;
        this.f7170o = c0520u0;
        this.f7171p = u5;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0516s0 c0516s0 = new C0516s0(this.f7169n, this.f7170o, this.f7171p, cVar);
        c0516s0.f7168m = obj;
        return c0516s0;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0516s0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Collection] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0516s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
