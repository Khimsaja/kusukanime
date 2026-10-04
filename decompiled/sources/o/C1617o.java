package o;

import K5.C0327f;
import K5.C0332k;
import O.C0486d;
import O.C0503l0;
import O.Z;
import p.u0;

/* renamed from: o.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1617o extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f13522k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f13523l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u0 f13524m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f13525n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1617o(u0 u0Var, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f13524m = u0Var;
        this.f13525n = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1617o c1617o = new C1617o(this.f13524m, this.f13525n, cVar);
        c1617o.f13523l = obj;
        return c1617o;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1617o) create((C0503l0) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f13522k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C0503l0 c0503l0 = (C0503l0) this.f13523l;
            u0 u0Var = this.f13524m;
            C0332k c0332kS = C0486d.S(new C1616n(u0Var, 0));
            C0327f c0327f = new C0327f(c0503l0, u0Var, this.f13525n, 4);
            this.f13522k = 1;
            if (c0332kS.collect(c0327f, this) == aVar) {
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
