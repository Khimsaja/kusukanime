package L5;

import K5.InterfaceC0330i;
import O3.C;

/* loaded from: classes.dex */
public final class h extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f6172k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6173l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f6174m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, S3.c cVar) {
        super(2, cVar);
        this.f6174m = iVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        h hVar = new h(this.f6174m, cVar);
        hVar.f6173l = obj;
        return hVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC0330i) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f6172k;
        if (i7 == 0) {
            P3.r.Y(obj);
            InterfaceC0330i interfaceC0330i = (InterfaceC0330i) this.f6173l;
            this.f6172k = 1;
            if (this.f6174m.h(interfaceC0330i, this) == aVar) {
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
