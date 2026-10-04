package v3;

import H5.A;
import O3.C;

/* loaded from: classes.dex */
public final class y extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16612k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f16613l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, S3.c cVar) {
        super(2, cVar);
        this.f16613l = zVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new y(this.f16613l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0101, code lost:
    
        if (r14 == r2) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013c  */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
