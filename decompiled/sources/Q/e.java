package Q;

import O3.C;
import U3.i;
import e4.n;
import y5.j;

/* loaded from: classes.dex */
public final class e extends i implements n {

    /* renamed from: k, reason: collision with root package name */
    public Object[] f7830k;

    /* renamed from: l, reason: collision with root package name */
    public long[] f7831l;

    /* renamed from: m, reason: collision with root package name */
    public int f7832m;

    /* renamed from: n, reason: collision with root package name */
    public int f7833n;

    /* renamed from: o, reason: collision with root package name */
    public int f7834o;

    /* renamed from: p, reason: collision with root package name */
    public int f7835p;

    /* renamed from: q, reason: collision with root package name */
    public long f7836q;

    /* renamed from: r, reason: collision with root package name */
    public int f7837r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f7838s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f7839t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, S3.c cVar) {
        super(2, cVar);
        this.f7839t = fVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        e eVar = new e(this.f7839t, cVar);
        eVar.f7838s = obj;
        return eVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:19:0x008a). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            r20 = this;
            r0 = r20
            r1 = 1
            T3.a r2 = T3.a.f9048k
            int r3 = r0.f7837r
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2c
            if (r3 != r1) goto L24
            int r3 = r0.f7835p
            int r6 = r0.f7834o
            long r7 = r0.f7836q
            int r9 = r0.f7833n
            int r10 = r0.f7832m
            long[] r11 = r0.f7831l
            java.lang.Object[] r12 = r0.f7830k
            java.lang.Object r13 = r0.f7838s
            y5.j r13 = (y5.j) r13
            P3.r.Y(r21)
            goto L8a
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            P3.r.Y(r21)
            java.lang.Object r3 = r0.f7838s
            y5.j r3 = (y5.j) r3
            Q.f r6 = r0.f7839t
            m.B r6 = r6.f7840k
            java.lang.Object[] r7 = r6.f12864b
            long[] r6 = r6.a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L97
            r9 = r4
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L93
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r3
            r3 = r4
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L62:
            if (r3 >= r6) goto L8d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8a
            int r4 = r9 << 3
            int r4 = r4 + r3
            r4 = r12[r4]
            r0.f7838s = r13
            r0.f7830k = r12
            r0.f7831l = r11
            r0.f7832m = r10
            r0.f7833n = r9
            r0.f7836q = r7
            r0.f7834o = r6
            r0.f7835p = r3
            r0.f7837r = r1
            r13.a(r4, r0)
            T3.a r1 = T3.a.f9048k
            return r2
        L8a:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L62
        L8d:
            if (r6 != r5) goto L97
            r8 = r10
            r6 = r11
            r7 = r12
            r3 = r13
        L93:
            if (r9 == r8) goto L97
            int r9 = r9 + r1
            goto L41
        L97:
            O3.C r1 = O3.C.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
