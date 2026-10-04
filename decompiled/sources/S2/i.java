package S2;

import H5.A;
import H5.D;
import H5.H;
import H5.M;
import O3.C;
import P3.r;
import d3.C0797i;
import e4.n;

/* loaded from: classes.dex */
public final class i extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f8738k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8739l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0797i f8740m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f8741n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, S3.c cVar, C0797i c0797i) {
        super(2, cVar);
        this.f8740m = c0797i;
        this.f8741n = mVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        i iVar = new i(this.f8741n, cVar, this.f8740m);
        iVar.f8739l = obj;
        return iVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f8738k;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            return obj;
        }
        r.Y(obj);
        A a = (A) this.f8739l;
        O5.e eVar = M.a;
        H hF = D.f(a, M5.m.a.f4075o, new h(this.f8741n, null, this.f8740m), 2);
        this.f8738k = 1;
        Object objK = hF.k(this);
        return objK == aVar ? aVar : objK;
    }
}
