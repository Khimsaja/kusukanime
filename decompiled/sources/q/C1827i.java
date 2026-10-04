package q;

import o.C1622t;
import s.C1909d0;
import s.M0;
import s.c1;
import s0.C1955C;

/* renamed from: q.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1827i extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f14558k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f14559l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1839v f14560m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1827i(C1839v c1839v, S3.c cVar) {
        super(2, cVar);
        this.f14560m = c1839v;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1827i c1827i = new C1827i(this.f14560m, cVar);
        c1827i.f14559l = obj;
        return c1827i;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1827i) create((C1955C) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f14558k;
        O3.C c2 = O3.C.a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return c2;
        }
        P3.r.Y(obj);
        C1955C c1955c = (C1955C) this.f14559l;
        this.f14558k = 1;
        C1839v c1839v = this.f14560m;
        c1839v.getClass();
        C1838u c1838u = new C1838u(c1839v, null);
        C1622t c1622t = new C1622t(2, c1839v);
        s.Q q6 = c1.a;
        Object objJ = H5.D.j(new M0(c1955c, c1838u, c1622t, new C1909d0(c1955c), null), this);
        if (objJ != aVar) {
            objJ = c2;
        }
        if (objJ != aVar) {
            objJ = c2;
        }
        return objJ == aVar ? aVar : c2;
    }
}
