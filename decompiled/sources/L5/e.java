package L5;

import H5.A;
import K5.InterfaceC0330i;
import K5.N;
import O3.C;

/* loaded from: classes.dex */
public final class e extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f6162k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6163l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0330i f6164m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f6165n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC0330i interfaceC0330i, g gVar, S3.c cVar) {
        super(2, cVar);
        this.f6164m = interfaceC0330i;
        this.f6165n = gVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        e eVar = new e(this.f6164m, this.f6165n, cVar);
        eVar.f6163l = obj;
        return eVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f6162k;
        C c2 = C.a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return c2;
        }
        P3.r.Y(obj);
        J5.u uVarG = this.f6165n.g((A) this.f6163l);
        this.f6162k = 1;
        Object objG = N.g(this.f6164m, uVarG, true, this);
        if (objG != aVar) {
            objG = c2;
        }
        return objG == aVar ? aVar : c2;
    }
}
