package z;

import f6.AbstractC0915m;
import s0.C1955C;

/* renamed from: z.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2429h extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18469k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1955C f18470l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2425d f18471m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2429h(C1955C c1955c, C2425d c2425d, S3.c cVar) {
        super(2, cVar);
        this.f18470l = c1955c;
        this.f18471m = c2425d;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C2429h(this.f18470l, this.f18471m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2429h) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f18469k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C2428g c2428g = new C2428g(this.f18471m, null);
            this.f18469k = 1;
            if (AbstractC0915m.f(this.f18470l, c2428g, this) == aVar) {
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
