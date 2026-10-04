package s;

import s0.C1953A;

/* loaded from: classes.dex */
public final class F0 extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public long f15123k;

    /* renamed from: l, reason: collision with root package name */
    public int f15124l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f15125m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s0.r f15126n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(s0.r rVar, S3.c cVar) {
        super(2, cVar);
        this.f15126n = rVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        F0 f02 = new F0(this.f15126n, cVar);
        f02.f15125m = obj;
        return f02;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((F0) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r7.f15124l
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.f15123k
            java.lang.Object r1 = r7.f15125m
            s0.A r1 = (s0.C1953A) r1
            P3.r.Y(r8)
            goto L40
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            P3.r.Y(r8)
            java.lang.Object r8 = r7.f15125m
            s0.A r8 = (s0.C1953A) r8
            s0.r r1 = r7.f15126n
            long r3 = r1.f15469b
            z0.S0 r1 = r8.f()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L32:
            r7.f15125m = r1
            r7.f15123k = r3
            r7.f15124l = r2
            r8 = 3
            java.lang.Object r8 = s.c1.c(r1, r7, r8)
            if (r8 != r0) goto L40
            return r0
        L40:
            s0.r r8 = (s0.r) r8
            long r5 = r8.f15469b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L32
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s.F0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
