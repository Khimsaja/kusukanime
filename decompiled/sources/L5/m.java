package L5;

import D.C0070p;
import H5.A;
import K5.InterfaceC0329h;
import K5.InterfaceC0330i;
import O3.C;

/* loaded from: classes.dex */
public final class m extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f6185k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6186l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f6187m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0330i f6188n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC0330i interfaceC0330i, S3.c cVar) {
        super(2, cVar);
        this.f6187m = nVar;
        this.f6188n = interfaceC0330i;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        m mVar = new m(this.f6187m, this.f6188n, cVar);
        mVar.f6186l = obj;
        return mVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f6185k;
        if (i7 == 0) {
            P3.r.Y(obj);
            A a = (A) this.f6186l;
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            n nVar = this.f6187m;
            InterfaceC0329h interfaceC0329h = nVar.f6175n;
            C0070p c0070p = new C0070p(xVar, a, nVar, this.f6188n, 1);
            this.f6185k = 1;
            if (interfaceC0329h.collect(c0070p, this) == aVar) {
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
