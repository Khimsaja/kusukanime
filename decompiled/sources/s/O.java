package s;

/* loaded from: classes.dex */
public final class O extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public kotlin.jvm.internal.x f15185k;

    /* renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.x f15186l;

    /* renamed from: m, reason: collision with root package name */
    public int f15187m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f15188n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ P f15189o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p7, S3.c cVar) {
        super(2, cVar);
        this.f15189o = p7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        O o7 = new O(this.f15189o, cVar);
        o7.f15188n = obj;
        return o7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
    
        if (s.P.J0(r3, r6) != r0) goto L11;
     */
    /* JADX WARN: Path cross not found for [B:44:0x00c8, B:40:0x00b1], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:46:0x00cc, B:19:0x0056], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[PHI: r1 r4
      0x0032: PHI (r1v11 kotlin.jvm.internal.x) = (r1v3 kotlin.jvm.internal.x), (r1v16 kotlin.jvm.internal.x) binds: [B:13:0x002f, B:36:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r4v6 H5.A) = (r4v4 H5.A), (r4v7 H5.A) binds: [B:13:0x002f, B:36:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[PHI: r5
      0x0056: PHI (r5v7 H5.A) = (r5v0 H5.A), (r5v3 H5.A), (r5v3 H5.A), (r5v3 H5.A), (r5v5 H5.A), (r5v8 H5.A) binds: [B:18:0x004e, B:45:0x00ca, B:47:0x00d7, B:41:0x00c3, B:30:0x0082, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:38:0x00ab, B:40:0x00b1, B:44:0x00c8, B:46:0x00cc), top: B:59:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:38:0x00ab, B:40:0x00b1, B:44:0x00c8, B:46:0x00cc), top: B:59:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c3 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ca -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d7 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00e5 -> B:11:0x0027). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.O.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
