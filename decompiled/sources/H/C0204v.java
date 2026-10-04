package H;

import C2.C0034g;
import D.InterfaceC0071p0;
import f6.AbstractC0915m;
import s0.C1955C;
import y0.AbstractC2359f;

/* renamed from: H.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204v extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f3018k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f3019l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0034g f3020m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0071p0 f3021n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0204v(C0034g c0034g, InterfaceC0071p0 interfaceC0071p0, S3.c cVar) {
        super(2, cVar);
        this.f3020m = c0034g;
        this.f3021n = interfaceC0071p0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0204v c0204v = new C0204v(this.f3020m, this.f3021n, cVar);
        c0204v.f3019l = obj;
        return c0204v;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0204v) create((C1955C) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f3018k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1955C c1955c = (C1955C) this.f3019l;
            c1955c.getClass();
            C0203u c0203u = new C0203u(this.f3020m, new C2.H(AbstractC2359f.v(c1955c).f17657D), this.f3021n, null);
            this.f3018k = 1;
            if (AbstractC0915m.f(c1955c, c0203u, this) == aVar) {
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
