package H2;

import G2.C0174k;
import O.C0485c0;
import O.Z;
import O3.C;
import java.util.List;
import p.C1746d0;

/* loaded from: classes.dex */
public final class u extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f3649k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1746d0 f3650l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f3651m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0485c0 f3652n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C1746d0 c1746d0, Z z7, C0485c0 c0485c0, S3.c cVar) {
        super(2, cVar);
        this.f3650l = c1746d0;
        this.f3651m = z7;
        this.f3652n = c0485c0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new u(this.f3650l, this.f3651m, this.f3652n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f3649k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C0174k c0174k = (C0174k) ((List) this.f3651m.getValue()).get(((List) r4.getValue()).size() - 2);
            float f5 = this.f3652n.f();
            this.f3649k = 1;
            if (this.f3650l.S0(f5, c0174k, this) == aVar) {
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
