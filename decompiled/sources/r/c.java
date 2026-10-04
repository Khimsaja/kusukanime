package r;

import O3.C;
import P3.r;
import f6.AbstractC0915m;
import o.C1622t;
import s0.C1955C;

/* loaded from: classes.dex */
public final class c extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f14759k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f14760l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f14761m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, S3.c cVar) {
        super(2, cVar);
        this.f14761m = lVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        c cVar2 = new c(this.f14761m, cVar);
        cVar2.f14760l = obj;
        return cVar2;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((C1955C) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f14759k;
        C c2 = C.a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            return c2;
        }
        r.Y(obj);
        C1955C c1955c = (C1955C) this.f14760l;
        C1622t c1622t = new C1622t(4, this.f14761m);
        this.f14759k = 1;
        Object objF = AbstractC0915m.f(c1955c, new d(c1622t, null), this);
        if (objF != aVar) {
            objF = c2;
        }
        return objF == aVar ? aVar : c2;
    }
}
