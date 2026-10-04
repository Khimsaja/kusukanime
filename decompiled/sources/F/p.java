package F;

import H5.InterfaceC0265f0;
import H5.u0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class p extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f2033k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f2034l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, S3.c cVar) {
        super(2, cVar);
        this.f2034l = qVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        p pVar = new p(this.f2034l, cVar);
        pVar.f2033k = obj;
        return pVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z7;
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        H5.A a = (H5.A) this.f2033k;
        q qVar = this.f2034l;
        InterfaceC0265f0 interfaceC0265f0 = (InterfaceC0265f0) qVar.a.getAndSet(null);
        AtomicReference atomicReference = qVar.a;
        u0 u0VarX = H5.D.x(a, null, new o(interfaceC0265f0, qVar, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, u0VarX)) {
                z7 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z7 = false;
                break;
            }
        }
        return Boolean.valueOf(z7);
    }
}
