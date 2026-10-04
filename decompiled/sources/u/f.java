package u;

import H.F;
import H5.A;
import K5.InterfaceC0329h;
import O.Z;
import O3.C;
import P3.r;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16212k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f16213l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f16214m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f16213l = jVar;
        this.f16214m = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new f(this.f16213l, this.f16214m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16212k;
        if (i7 == 0) {
            r.Y(obj);
            ArrayList arrayList = new ArrayList();
            InterfaceC0329h interfaceC0329hA = this.f16213l.a();
            F f5 = new F(8, arrayList, this.f16214m);
            this.f16212k = 1;
            if (interfaceC0329hA.collect(f5, this) == aVar) {
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
