package v3;

import O.Z;
import O3.C;
import s0.C1953A;

/* loaded from: classes.dex */
public final class j extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16568k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f16569l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f16570m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Z z7, S3.c cVar) {
        super(2, cVar);
        this.f16570m = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        j jVar = new j(this.f16570m, cVar);
        jVar.f16569l = obj;
        return jVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((j) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(C.a);
        return T3.a.f9048k;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Path cross not found for [B:14:0x002f, B:17:0x0036], limit reached: 27 */
    /* JADX WARN: Path cross not found for [B:17:0x0036, B:14:0x002f], limit reached: 27 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x001c A[EDGE_INSN: B:25:0x001c->B:9:0x001c BREAK  A[LOOP:0: B:18:0x003a->B:27:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:12:0x0029). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f16569l
            s0.A r0 = (s0.C1953A) r0
            T3.a r1 = T3.a.f9048k
            int r2 = r8.f16568k
            r3 = 1
            if (r2 == 0) goto L19
            if (r2 != r3) goto L11
            P3.r.Y(r9)
            goto L29
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            P3.r.Y(r9)
        L1c:
            s0.i r9 = s0.EnumC1964i.f15461k
            r8.f16569l = r0
            r8.f16568k = r3
            java.lang.Object r9 = r0.b(r9, r8)
            if (r9 != r1) goto L29
            return r1
        L29:
            s0.h r9 = (s0.C1963h) r9
            java.lang.Object r9 = r9.a
            if (r9 == 0) goto L36
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L36
            goto L1c
        L36:
            java.util.Iterator r9 = r9.iterator()
        L3a:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r9.next()
            s0.r r2 = (s0.r) r2
            long r4 = r2.f15470c
            long r6 = r2.f15474g
            boolean r2 = g0.c.b(r4, r6)
            if (r2 != 0) goto L3a
            O.Z r9 = r8.f16570m
            java.lang.Object r2 = r9.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L1c
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r9.setValue(r2)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
