package q;

import s.C1909d0;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1822d extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public boolean f14543k;

    /* renamed from: l, reason: collision with root package name */
    public int f14544l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f14545m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1909d0 f14546n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f14547o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u.k f14548p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1839v f14549q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1822d(C1909d0 c1909d0, long j7, u.k kVar, C1839v c1839v, S3.c cVar) {
        super(2, cVar);
        this.f14546n = c1909d0;
        this.f14547o = j7;
        this.f14548p = kVar;
        this.f14549q = c1839v;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1822d c1822d = new C1822d(this.f14546n, this.f14547o, this.f14548p, this.f14549q, cVar);
        c1822d.f14545m = obj;
        return c1822d;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1822d) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        if (r11.b(r2, r18) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cc, code lost:
    
        if (r11.b(r4, r18) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C1822d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
