package Y;

import O3.C;

/* loaded from: classes.dex */
public final class l extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int[] f9988k;

    /* renamed from: l, reason: collision with root package name */
    public int f9989l;

    /* renamed from: m, reason: collision with root package name */
    public int f9990m;

    /* renamed from: n, reason: collision with root package name */
    public int f9991n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f9992o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f9993p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, S3.c cVar) {
        super(2, cVar);
        this.f9993p = mVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        l lVar = new l(this.f9993p, cVar);
        lVar.f9992o = obj;
        return lVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((y5.j) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0084 -> B:26:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00aa -> B:36:0x00c1). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
