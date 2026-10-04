package r3;

import H5.A;
import O3.C;

/* loaded from: classes.dex */
public final class j extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public boolean f14891k;

    /* renamed from: l, reason: collision with root package name */
    public int f14892l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f14893m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, S3.c cVar) {
        super(2, cVar);
        this.f14893m = mVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new j(this.f14893m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r11 != r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092 A[Catch: all -> 0x00a2, PHI: r1
      0x0092: PHI (r1v10 boolean) = (r1v9 boolean), (r1v12 boolean) binds: [B:31:0x008f, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00a2, blocks: (B:8:0x0015, B:36:0x009f, B:33:0x0092), top: B:53:0x000b }] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
