package z0;

import H5.C0270k;

/* loaded from: classes.dex */
public final class V extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18702k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f18703l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W f18704m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w7, S3.c cVar) {
        super(2, cVar);
        this.f18704m = w7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        V v5 = new V(this.f18704m, cVar);
        v5.f18703l = obj;
        return v5;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((V) create((C2476w0) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
        return T3.a.f9048k;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f18702k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C2476w0 c2476w0 = (C2476w0) this.f18703l;
            this.f18703l = c2476w0;
            W w7 = this.f18704m;
            this.f18702k = 1;
            C0270k c0270k = new C0270k(1, P3.r.E(this));
            c0270k.r();
            N0.x xVar = w7.f18706l;
            N0.r rVar = xVar.a;
            rVar.a();
            xVar.f6898b.set(new N0.B(xVar, rVar));
            c0270k.t(new U(1, c2476w0, w7));
            if (c0270k.q() == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        throw new D6.r();
    }
}
