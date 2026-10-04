package z;

import D.S;
import p.InterfaceC1760l;
import s.InterfaceC1911e0;

/* loaded from: classes.dex */
public final class F extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18429k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f18430l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f18431m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f18432n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p2.l f18433o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f18434p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1760l f18435q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(S s7, int i7, p2.l lVar, float f5, InterfaceC1760l interfaceC1760l, S3.c cVar) {
        super(2, cVar);
        this.f18431m = s7;
        this.f18432n = i7;
        this.f18433o = lVar;
        this.f18434p = f5;
        this.f18435q = interfaceC1760l;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        F f5 = new F(this.f18431m, this.f18432n, this.f18433o, this.f18434p, this.f18435q, cVar);
        f5.f18430l = obj;
        return f5;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((InterfaceC1911e0) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.List] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.F.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
