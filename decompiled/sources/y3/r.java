package y3;

import O.Z;
import androidx.media3.exoplayer.ExoPlayer;

/* loaded from: classes.dex */
public final class r extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18346k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f18347l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f18348m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e4.n f18349n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f18350o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ExoPlayer exoPlayer, int i7, e4.n nVar, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f18347l = exoPlayer;
        this.f18348m = i7;
        this.f18349n = nVar;
        this.f18350o = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new r(this.f18347l, this.f18348m, this.f18349n, this.f18350o, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((r) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
        return T3.a.f9048k;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Path cross not found for [B:16:0x0038, B:21:0x0061], limit reached: 27 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:12:0x0025). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f18346k
            r3 = 1000(0x3e8, double:4.94E-321)
            r5 = 1
            if (r2 == 0) goto L19
            if (r2 != r5) goto L11
            P3.r.Y(r18)
            goto L25
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L19:
            P3.r.Y(r18)
        L1c:
            r0.f18346k = r5
            java.lang.Object r2 = H5.D.k(r3, r0)
            if (r2 != r1) goto L25
            return r1
        L25:
            androidx.media3.exoplayer.ExoPlayer r2 = r0.f18347l
            r6 = r2
            H1.G r6 = (H1.G) r6
            long r7 = r6.X0()
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L81
            int r11 = r0.f18348m
            if (r11 <= 0) goto L61
            z5.m r12 = y3.C.a
            O.Z r12 = r0.f18350o
            java.lang.Object r13 = r12.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L61
            long r13 = r6.S0()
            r15 = r3
            long r3 = (long) r11
            long r3 = r3 * r15
            long r3 = r7 - r3
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 < 0) goto L62
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r12.setValue(r3)
            Q4.c r2 = (Q4.c) r2
            r3 = 5
            r2.D0(r3, r7)
            goto L62
        L61:
            r15 = r3
        L62:
            long r2 = r6.S0()
            r11 = 10
            long r2 = r2 % r11
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L82
            long r2 = r6.S0()
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r7)
            e4.n r3 = r0.f18349n
            r3.invoke(r4, r2)
            goto L82
        L81:
            r15 = r3
        L82:
            r3 = r15
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
