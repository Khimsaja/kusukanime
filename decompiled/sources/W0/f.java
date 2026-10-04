package W0;

import H5.A;
import O3.C;
import P3.r;

/* loaded from: classes.dex */
public final class f extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f9529k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f9530l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f9531m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, long j7, S3.c cVar) {
        super(2, cVar);
        this.f9530l = iVar;
        this.f9531m = j7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new f(this.f9530l, this.f9531m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f9529k;
        if (i7 == 0) {
            r.Y(obj);
            i iVar = this.f9530l;
            this.f9529k = 1;
            if (iVar.f9544k.b(this.f9531m, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
        }
        return C.a;
    }
}
