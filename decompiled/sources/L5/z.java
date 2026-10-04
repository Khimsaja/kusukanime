package L5;

import K5.InterfaceC0330i;
import O3.C;

/* loaded from: classes.dex */
public final class z extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f6204k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6205l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0330i f6206m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(InterfaceC0330i interfaceC0330i, S3.c cVar) {
        super(2, cVar);
        this.f6206m = interfaceC0330i;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        z zVar = new z(this.f6206m, cVar);
        zVar.f6205l = obj;
        return zVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create(obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f6204k;
        if (i7 == 0) {
            P3.r.Y(obj);
            Object obj2 = this.f6205l;
            this.f6204k = 1;
            if (this.f6206m.emit(obj2, this) == aVar) {
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
