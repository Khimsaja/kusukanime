package H;

import s0.C1953A;

/* renamed from: H.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206x extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f3027k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f3028l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e4.k f3029m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0206x(e4.k kVar, S3.c cVar) {
        super(2, cVar);
        this.f3029m = kVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0206x c0206x = new C0206x(this.f3029m, cVar);
        c0206x.f3028l = obj;
        return c0206x;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C0206x) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
        return T3.a.f9048k;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r4.f3027k
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r4.f3028l
            s0.A r1 = (s0.C1953A) r1
            P3.r.Y(r5)
            goto L2e
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            P3.r.Y(r5)
            java.lang.Object r5 = r4.f3028l
            s0.A r5 = (s0.C1953A) r5
            r1 = r5
        L21:
            s0.i r5 = s0.EnumC1964i.f15461k
            r4.f3028l = r1
            r4.f3027k = r2
            java.lang.Object r5 = r1.b(r5, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            s0.h r5 = (s0.C1963h) r5
            boolean r5 = n6.d.L(r5)
            r5 = r5 ^ r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            e4.k r3 = r4.f3029m
            r3.invoke(r5)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: H.C0206x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
