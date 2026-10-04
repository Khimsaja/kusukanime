package s3;

import O.Z;
import com.kusukanime.data.UserRepo;

/* loaded from: classes.dex */
public final class w extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15803k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserRepo f15804l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f15805m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f15806n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(UserRepo userRepo, String str, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f15804l = userRepo;
        this.f15805m = str;
        this.f15806n = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new w(this.f15804l, this.f15805m, this.f15806n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r5.addBookmark(r1, r6) == r0) goto L19;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r6.f15803k
            O.Z r2 = r6.f15806n
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1a
            if (r1 == r4) goto Le
            if (r1 != r3) goto L12
        Le:
            P3.r.Y(r7)     // Catch: java.lang.Throwable -> L51
            goto L3f
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            P3.r.Y(r7)
            java.lang.Object r7 = r2.getValue()     // Catch: java.lang.Throwable -> L51
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L51
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = r6.f15805m
            com.kusukanime.data.UserRepo r5 = r6.f15804l
            if (r7 == 0) goto L36
            r6.f15803k = r4     // Catch: java.lang.Throwable -> L51
            java.lang.Object r7 = r5.delBookmark(r1, r6)     // Catch: java.lang.Throwable -> L51
            if (r7 != r0) goto L3f
            goto L3e
        L36:
            r6.f15803k = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r7 = r5.addBookmark(r1, r6)     // Catch: java.lang.Throwable -> L51
            if (r7 != r0) goto L3f
        L3e:
            return r0
        L3f:
            java.lang.Object r7 = r2.getValue()     // Catch: java.lang.Throwable -> L51
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L51
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L51
            r7 = r7 ^ r4
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L51
            r2.setValue(r7)     // Catch: java.lang.Throwable -> L51
        L51:
            O3.C r7 = O3.C.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
