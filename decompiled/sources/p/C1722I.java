package p;

/* renamed from: p.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1722I extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public kotlin.jvm.internal.u f13877k;

    /* renamed from: l, reason: collision with root package name */
    public int f13878l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f13879m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O.Z f13880n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1723J f13881o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722I(O.Z z7, C1723J c1723j, S3.c cVar) {
        super(2, cVar);
        this.f13880n = z7;
        this.f13881o = c1723j;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1722I c1722i = new C1722I(this.f13880n, this.f13881o, cVar);
        c1722i.f13879m = obj;
        return c1722i;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C1722I) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
        return T3.a.f9048k;
    }

    /* JADX WARN: Path cross not found for [B:11:0x003e, B:18:0x0070], limit reached: 22 */
    /* JADX WARN: Path cross not found for [B:18:0x0070, B:11:0x003e], limit reached: 22 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006e -> B:11:0x003e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008b -> B:11:0x003e). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r11.f13878l
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            kotlin.jvm.internal.u r1 = r11.f13877k
            java.lang.Object r4 = r11.f13879m
            H5.A r4 = (H5.A) r4
            P3.r.Y(r12)
            r8 = r1
            r9 = r4
            goto L3e
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            kotlin.jvm.internal.u r1 = r11.f13877k
            java.lang.Object r4 = r11.f13879m
            H5.A r4 = (H5.A) r4
            P3.r.Y(r12)
            r8 = r1
            r9 = r4
            goto L69
        L2c:
            P3.r.Y(r12)
            java.lang.Object r12 = r11.f13879m
            H5.A r12 = (H5.A) r12
            kotlin.jvm.internal.u r1 = new kotlin.jvm.internal.u
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f12717k = r4
            r9 = r12
            r8 = r1
        L3e:
            D.u r5 = new D.u
            O.Z r6 = r11.f13880n
            p.J r7 = r11.f13881o
            r10 = 2
            r5.<init>(r6, r7, r8, r9, r10)
            r11.f13879m = r9
            r11.f13877k = r8
            r11.f13878l = r2
            S3.h r12 = r11.getContext()
            z0.v0 r1 = z0.C2474v0.f18935k
            S3.f r12 = r12.get(r1)
            if (r12 != 0) goto L8e
            S3.h r12 = r11.getContext()
            O.U r12 = O.C0486d.F(r12)
            java.lang.Object r12 = r12.P(r5, r11)
            if (r12 != r0) goto L69
            goto L8d
        L69:
            float r12 = r8.f12717k
            r1 = 0
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L3e
            B.e r12 = new B.e
            r1 = 26
            r12.<init>(r1, r9)
            K5.k r12 = O.C0486d.S(r12)
            p.H r1 = new p.H
            r4 = 0
            r1.<init>(r3, r4)
            r11.f13879m = r9
            r11.f13877k = r8
            r11.f13878l = r3
            java.lang.Object r12 = K5.N.i(r12, r1, r11)
            if (r12 != r0) goto L3e
        L8d:
            return r0
        L8e:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1722I.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
