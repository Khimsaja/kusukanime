package F;

import D.r0;
import z0.W;

/* renamed from: F.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143f extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f2019k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2020l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r0 f2021m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0144g f2022n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y f2023o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0143f(r0 r0Var, C0144g c0144g, y yVar, S3.c cVar) {
        super(2, cVar);
        this.f2021m = r0Var;
        this.f2022n = c0144g;
        this.f2023o = yVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0143f c0143f = new C0143f(this.f2021m, this.f2022n, this.f2023o, cVar);
        c0143f.f2020l = obj;
        return c0143f;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C0143f) create((W) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
        return T3.a.f9048k;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f2019k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C0142e c0142e = new C0142e((W) this.f2020l, this.f2021m, this.f2022n, this.f2023o, null);
            this.f2019k = 1;
            if (H5.D.j(c0142e, this) == aVar) {
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
