package H;

import K5.C0332k;
import O.C0486d;
import O.R0;
import p.C1743c;

/* loaded from: classes.dex */
public final class G extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f2885k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2886l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ R0 f2887m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1743c f2888n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(R0 r02, C1743c c1743c, S3.c cVar) {
        super(2, cVar);
        this.f2887m = r02;
        this.f2888n = c1743c;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        G g4 = new G(this.f2887m, this.f2888n, cVar);
        g4.f2886l = obj;
        return g4;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f2885k;
        if (i7 == 0) {
            P3.r.Y(obj);
            H5.A a = (H5.A) this.f2886l;
            C0332k c0332kS = C0486d.S(new D(this.f2887m, 0));
            F f5 = new F(0, this.f2888n, a);
            this.f2885k = 1;
            if (c0332kS.collect(f5, this) == aVar) {
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
