package w3;

import H5.A;
import K5.Y;
import O3.C;

/* loaded from: classes.dex */
public final class w extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public boolean f17066k;

    /* renamed from: l, reason: collision with root package name */
    public Y f17067l;

    /* renamed from: m, reason: collision with root package name */
    public Y f17068m;

    /* renamed from: n, reason: collision with root package name */
    public int f17069n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y f17070o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, S3.c cVar) {
        super(2, cVar);
        this.f17070o = yVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new w(this.f17070o, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r8.f17069n
            P3.y r2 = P3.y.f7779k
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            w3.y r7 = r8.f17070o
            if (r1 == 0) goto L33
            if (r1 == r5) goto L2f
            if (r1 == r4) goto L25
            if (r1 != r3) goto L1d
            K5.Y r0 = r8.f17068m
            K5.Y r1 = r8.f17067l
            P3.r.Y(r9)     // Catch: java.lang.Exception -> L97
            goto L92
        L1d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L25:
            boolean r1 = r8.f17066k
            K5.Y r4 = r8.f17068m
            K5.Y r5 = r8.f17067l
            P3.r.Y(r9)     // Catch: java.lang.Exception -> L75
            goto L71
        L2f:
            P3.r.Y(r9)     // Catch: java.lang.Exception -> La8
            goto L4b
        L33:
            P3.r.Y(r9)
            K5.Y r9 = r7.f17080h
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r9.getClass()
            r9.i(r6, r1)
            com.kusukanime.data.SessionGate r9 = com.kusukanime.data.SessionGate.INSTANCE     // Catch: java.lang.Exception -> La8
            r8.f17069n = r5     // Catch: java.lang.Exception -> La8
            java.lang.Object r9 = r9.ensure(r8)     // Catch: java.lang.Exception -> La8
            if (r9 != r0) goto L4b
            goto L8e
        L4b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> La8
            boolean r1 = r9.booleanValue()     // Catch: java.lang.Exception -> La8
            K5.Y r5 = r7.f17076d     // Catch: java.lang.Exception -> La8
            r5.getClass()     // Catch: java.lang.Exception -> La8
            r5.i(r6, r9)     // Catch: java.lang.Exception -> La8
            K5.Y r9 = r7.f17074b
            if (r1 == 0) goto L9c
            com.kusukanime.data.UserRepo r5 = r7.f17090r     // Catch: java.lang.Exception -> L74
            r8.f17067l = r9     // Catch: java.lang.Exception -> L74
            r8.f17068m = r9     // Catch: java.lang.Exception -> L74
            r8.f17066k = r1     // Catch: java.lang.Exception -> L74
            r8.f17069n = r4     // Catch: java.lang.Exception -> L74
            java.lang.Object r4 = r5.profile(r8)     // Catch: java.lang.Exception -> L74
            if (r4 != r0) goto L6e
            goto L8e
        L6e:
            r5 = r9
            r9 = r4
            r4 = r5
        L71:
            com.kusukanime.data.ProfileRow r9 = (com.kusukanime.data.ProfileRow) r9     // Catch: java.lang.Exception -> L75
            goto L77
        L74:
            r5 = r9
        L75:
            r4 = r5
            r9 = r6
        L77:
            r4.h(r9)     // Catch: java.lang.Exception -> La8
            K5.Y r9 = r7.f17078f     // Catch: java.lang.Exception -> La8
            com.kusukanime.data.UserRepo r4 = r7.f17090r     // Catch: java.lang.Exception -> L96
            r8.f17067l = r9     // Catch: java.lang.Exception -> L96
            r8.f17068m = r9     // Catch: java.lang.Exception -> L96
            r8.f17066k = r1     // Catch: java.lang.Exception -> L96
            r8.f17069n = r3     // Catch: java.lang.Exception -> L96
            r1 = 10
            java.lang.Object r1 = r4.history(r1, r8)     // Catch: java.lang.Exception -> L96
            if (r1 != r0) goto L8f
        L8e:
            return r0
        L8f:
            r0 = r9
            r9 = r1
            r1 = r0
        L92:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L97
            r2 = r9
            goto L98
        L96:
            r1 = r9
        L97:
            r0 = r1
        L98:
            r0.h(r2)     // Catch: java.lang.Exception -> La8
            goto Lb2
        L9c:
            r9.h(r6)     // Catch: java.lang.Exception -> La8
            K5.Y r9 = r7.f17078f     // Catch: java.lang.Exception -> La8
            r9.getClass()     // Catch: java.lang.Exception -> La8
            r9.i(r6, r2)     // Catch: java.lang.Exception -> La8
            goto Lb2
        La8:
            K5.Y r9 = r7.f17076d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.getClass()
            r9.i(r6, r0)
        Lb2:
            K5.Y r9 = r7.f17080h
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.getClass()
            r9.i(r6, r0)
            O3.C r9 = O3.C.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
