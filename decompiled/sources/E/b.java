package E;

import O3.C;
import P3.r;
import U3.j;
import e4.n;
import f6.AbstractC0915m;
import s0.C1955C;

/* loaded from: classes.dex */
public final class b extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f1781k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1782l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f1783m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, S3.c cVar) {
        super(2, cVar);
        this.f1783m = dVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        b bVar = new b(this.f1783m, cVar);
        bVar.f1782l = obj;
        return bVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((C1955C) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f1781k;
        if (i7 == 0) {
            r.Y(obj);
            C1955C c1955c = (C1955C) this.f1782l;
            a aVar2 = new a(this.f1783m, null);
            this.f1781k = 1;
            if (AbstractC0915m.f(c1955c, aVar2, this) == aVar) {
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
