package D;

import s.C1909d0;
import s.c1;
import s0.C1955C;

/* loaded from: classes.dex */
public final class E0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f1018k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1019l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M5.c f1020m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O.Z f1021n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u.k f1022o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ O.Z f1023p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(M5.c cVar, O.Z z7, u.k kVar, O.Z z8, S3.c cVar2) {
        super(2, cVar2);
        this.f1020m = cVar;
        this.f1021n = z7;
        this.f1022o = kVar;
        this.f1023p = z8;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        E0 e02 = new E0(this.f1020m, this.f1021n, this.f1022o, this.f1023p, cVar);
        e02.f1019l = obj;
        return e02;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((E0) create((C1955C) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f1018k;
        O3.C c2 = O3.C.a;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1955C c1955c = (C1955C) this.f1019l;
            C0 c02 = new C0(this.f1020m, this.f1021n, this.f1022o, null);
            D0 d02 = new D0(0, this.f1023p);
            this.f1018k = 1;
            s.Q q6 = c1.a;
            Object objJ = H5.D.j(new s.M0(c1955c, c02, d02, new C1909d0(c1955c), null), this);
            if (objJ != aVar) {
                objJ = c2;
            }
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return c2;
    }
}
