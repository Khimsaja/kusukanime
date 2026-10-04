package K;

import H.F;
import K5.InterfaceC0329h;

/* loaded from: classes.dex */
public final class v extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f4423k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4424l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f4425m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, S3.c cVar) {
        super(2, cVar);
        this.f4425m = wVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        v vVar = new v(this.f4425m, cVar);
        vVar.f4424l = obj;
        return vVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f4423k;
        if (i7 == 0) {
            P3.r.Y(obj);
            H5.A a = (H5.A) this.f4424l;
            w wVar = this.f4425m;
            InterfaceC0329h interfaceC0329hA = wVar.f4433x.a();
            F f5 = new F(3, wVar, a);
            this.f4423k = 1;
            if (interfaceC0329hA.collect(f5, this) == aVar) {
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
