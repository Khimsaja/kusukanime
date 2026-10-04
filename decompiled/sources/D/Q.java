package D;

import s0.C1955C;

/* loaded from: classes.dex */
public final class Q extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f1094k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1095l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0071p0 f1096m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H.S f1097n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(InterfaceC0071p0 interfaceC0071p0, H.S s7, S3.c cVar) {
        super(2, cVar);
        this.f1096m = interfaceC0071p0;
        this.f1097n = s7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        Q q6 = new Q(this.f1096m, this.f1097n, cVar);
        q6.f1095l = obj;
        return q6;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((C1955C) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f1094k;
        if (i7 == 0) {
            P3.r.Y(obj);
            P p7 = new P((C1955C) this.f1095l, this.f1096m, this.f1097n, null);
            this.f1094k = 1;
            if (H5.D.j(p7, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return O3.C.a;
    }
}
