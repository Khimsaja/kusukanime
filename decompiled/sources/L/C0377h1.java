package L;

import e4.InterfaceC0821a;
import s0.C1955C;

/* renamed from: L.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377h1 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f5593k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f5594l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f5595m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0377h1(S3.c cVar, InterfaceC0821a interfaceC0821a) {
        super(2, cVar);
        this.f5595m = interfaceC0821a;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0377h1 c0377h1 = new C0377h1(cVar, this.f5595m);
        c0377h1.f5594l = obj;
        return c0377h1;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0377h1) create((C1955C) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f5593k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1955C c1955c = (C1955C) this.f5594l;
            H.X x7 = new H.X(this.f5595m, 2);
            this.f5593k = 1;
            if (s.c1.d(c1955c, null, x7, this, 7) == aVar) {
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
