package r;

import O3.C;
import o.C1622t;
import s0.C1953A;

/* loaded from: classes.dex */
public final class d extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f14762k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f14763l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1622t f14764m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C1622t c1622t, S3.c cVar) {
        super(2, cVar);
        this.f14764m = c1622t;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        d dVar = new d(this.f14764m, cVar);
        dVar.f14763l = obj;
        return dVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r7.f14762k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            P3.r.Y(r8)
            goto L58
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            java.lang.Object r1 = r7.f14763l
            s0.A r1 = (s0.C1953A) r1
            P3.r.Y(r8)
            goto L33
        L20:
            P3.r.Y(r8)
            java.lang.Object r8 = r7.f14763l
            r1 = r8
            s0.A r1 = (s0.C1953A) r1
            r7.f14763l = r1
            r7.f14762k = r3
            java.lang.Object r8 = f.AbstractC0841b.d(r1, r7)
            if (r8 != r0) goto L33
            goto L57
        L33:
            s0.r r8 = (s0.r) r8
            r8.a()
            o.t r3 = r7.f14764m
            r.j r4 = new r.j
            long r5 = r8.f15470c
            r4.<init>(r5)
            java.lang.Object r8 = r3.f13534m
            r.l r8 = (r.l) r8
            O.g0 r8 = r8.a
            r8.setValue(r4)
            r8 = 0
            r7.f14763l = r8
            r7.f14762k = r2
            s0.i r8 = s0.EnumC1964i.f15462l
            java.lang.Object r8 = s.c1.e(r1, r8, r7)
            if (r8 != r0) goto L58
        L57:
            return r0
        L58:
            s0.r r8 = (s0.r) r8
            if (r8 == 0) goto L5f
            r8.a()
        L5f:
            O3.C r8 = O3.C.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
