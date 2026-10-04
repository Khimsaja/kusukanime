package s;

import e4.InterfaceC0821a;
import s0.C1953A;
import y3.C2411A;

/* renamed from: s.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1896D extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public kotlin.jvm.internal.u f15091k;

    /* renamed from: l, reason: collision with root package name */
    public int f15092l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f15093m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e4.k f15094n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2411A f15095o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f15096p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f15097q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1896D(e4.k kVar, C2411A c2411a, InterfaceC0821a interfaceC0821a, InterfaceC0821a interfaceC0821a2, S3.c cVar) {
        super(2, cVar);
        this.f15094n = kVar;
        this.f15095o = c2411a;
        this.f15096p = interfaceC0821a;
        this.f15097q = interfaceC0821a2;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1896D c1896d = new C1896D(this.f15094n, this.f15095o, this.f15096p, this.f15097q, cVar);
        c1896d.f15093m = obj;
        return c1896d;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1896D) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (r11 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r10.f15092l
            r2 = 2
            r3 = 3
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 == r4) goto L28
            if (r1 == r2) goto L1d
            if (r1 != r3) goto L15
            P3.r.Y(r11)
            r9 = r10
            goto L98
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            kotlin.jvm.internal.u r1 = r10.f15091k
            java.lang.Object r2 = r10.f15093m
            s0.A r2 = (s0.C1953A) r2
            P3.r.Y(r11)
            r9 = r10
            goto L66
        L28:
            java.lang.Object r1 = r10.f15093m
            s0.A r1 = (s0.C1953A) r1
            P3.r.Y(r11)
        L2f:
            r4 = r1
            goto L45
        L31:
            P3.r.Y(r11)
            java.lang.Object r11 = r10.f15093m
            r1 = r11
            s0.A r1 = (s0.C1953A) r1
            r10.f15093m = r1
            r10.f15092l = r4
            java.lang.Object r11 = s.c1.c(r1, r10, r2)
            if (r11 != r0) goto L2f
            r9 = r10
            goto L97
        L45:
            s0.r r11 = (s0.r) r11
            kotlin.jvm.internal.u r1 = new kotlin.jvm.internal.u
            r1.<init>()
            long r5 = r11.a
            D.S r8 = new D.S
            r7 = 18
            r8.<init>(r7, r1)
            r10.f15093m = r4
            r10.f15091k = r1
            r10.f15092l = r2
            int r7 = r11.f15476i
            r9 = r10
            java.lang.Object r11 = s.AbstractC1899G.c(r4, r5, r7, r8, r9)
            if (r11 != r0) goto L65
            goto L97
        L65:
            r2 = r4
        L66:
            s0.r r11 = (s0.r) r11
            if (r11 == 0) goto Lab
            g0.c r4 = new g0.c
            long r5 = r11.f15470c
            r4.<init>(r5)
            e4.k r5 = r9.f15094n
            r5.invoke(r4)
            float r1 = r1.f12717k
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r1)
            y3.A r1 = r9.f15095o
            r1.invoke(r11, r4)
            o.t r4 = new o.t
            r5 = 6
            r4.<init>(r5, r1)
            r1 = 0
            r9.f15093m = r1
            r9.f15091k = r1
            r9.f15092l = r3
            long r5 = r11.a
            java.lang.Object r11 = s.AbstractC1899G.f(r2, r5, r4, r10)
            if (r11 != r0) goto L98
        L97:
            return r0
        L98:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto La6
            e4.a r11 = r9.f15096p
            r11.invoke()
            goto Lab
        La6:
            e4.a r11 = r9.f15097q
            r11.invoke()
        Lab:
            O3.C r11 = O3.C.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C1896D.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
