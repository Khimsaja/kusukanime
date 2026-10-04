package v3;

import O.Z;
import O3.C;
import s0.C1955C;

/* loaded from: classes.dex */
public final class k extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16571k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f16572l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f16573m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Z z7, S3.c cVar) {
        super(2, cVar);
        this.f16573m = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        k kVar = new k(this.f16573m, cVar);
        kVar.f16572l = obj;
        return kVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((C1955C) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1955C c1955c = (C1955C) this.f16572l;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16571k;
        if (i7 == 0) {
            P3.r.Y(obj);
            j jVar = new j(this.f16573m, null);
            this.f16572l = null;
            this.f16571k = 1;
            if (c1955c.G0(jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return C.a;
    }
}
