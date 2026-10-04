package p;

import H5.C0270k;

/* loaded from: classes.dex */
public final class w0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public R5.c f14158k;

    /* renamed from: l, reason: collision with root package name */
    public Q4.c f14159l;

    /* renamed from: m, reason: collision with root package name */
    public int f14160m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Q4.c f14161n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Q4.c cVar, S3.c cVar2) {
        super(2, cVar2);
        this.f14161n = cVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new w0(this.f14161n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [O3.i, java.lang.Object] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        R5.c cVar;
        Q4.c cVar2;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f14160m;
        if (i7 == 0) {
            P3.r.Y(obj);
            Q4.c cVar3 = this.f14161n;
            C1746d0 c1746d0 = (C1746d0) cVar3;
            c1746d0.getClass();
            ((Y.u) z0.a.getValue()).d(c1746d0, m0.f14062o, c1746d0.f13987q);
            cVar = c1746d0.f13990t;
            this.f14158k = cVar;
            this.f14159l = cVar3;
            this.f14160m = 1;
            if (cVar.c(this) == aVar) {
                return aVar;
            }
            cVar2 = cVar3;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = this.f14159l;
            cVar = this.f14158k;
            P3.r.Y(obj);
        }
        try {
            ((C1746d0) cVar2).f13984n = cVar2.w0();
            C0270k c0270k = ((C1746d0) cVar2).f13989s;
            if (c0270k != null) {
                c0270k.resumeWith(cVar2.w0());
            }
            ((C1746d0) cVar2).f13989s = null;
            cVar.e(null);
            return O3.C.a;
        } catch (Throwable th) {
            cVar.e(null);
            throw th;
        }
    }
}
