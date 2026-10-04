package q;

import f6.AbstractC0915m;
import s0.C1955C;

/* renamed from: q.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1830l extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f14573k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f14574l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1831m f14575m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1830l(C1831m c1831m, S3.c cVar) {
        super(2, cVar);
        this.f14575m = c1831m;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1830l c1830l = new C1830l(this.f14575m, cVar);
        c1830l.f14574l = obj;
        return c1830l;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1830l) create((C1955C) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f14573k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1955C c1955c = (C1955C) this.f14574l;
            C1829k c1829k = new C1829k(this.f14575m, null);
            this.f14573k = 1;
            if (AbstractC0915m.f(c1955c, c1829k, this) == aVar) {
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
