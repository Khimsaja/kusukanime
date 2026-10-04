package F;

import K5.M;
import O.C0486d;
import O.V;

/* renamed from: F.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140c extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f2009k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0144g f2010l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f2011m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0140c(C0144g c0144g, w wVar, S3.c cVar) {
        super(2, cVar);
        this.f2010l = c0144g;
        this.f2011m = wVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C0140c(this.f2010l, this.f2011m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0140c) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f2009k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C0138a c0138a = C0138a.f2003m;
            this.f2009k = 1;
            if (C0486d.F(getContext()).P(new V(0, c0138a), this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
                throw new D6.r();
            }
            P3.r.Y(obj);
        }
        K5.F fI = this.f2010l.i();
        if (fI == null) {
            return O3.C.a;
        }
        C0139b c0139b = new C0139b(0, this.f2011m);
        this.f2009k = 2;
        M.j((M) fI, c0139b, this);
        return aVar;
    }
}
