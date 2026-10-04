package s;

import H5.InterfaceC0265f0;
import java.util.concurrent.CancellationException;

/* renamed from: s.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1922k extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15318k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15319l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1924l f15320m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e1 f15321n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1910e f15322o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1922k(C1924l c1924l, e1 e1Var, InterfaceC1910e interfaceC1910e, S3.c cVar) {
        super(2, cVar);
        this.f15320m = c1924l;
        this.f15321n = e1Var;
        this.f15322o = interfaceC1910e;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1922k c1922k = new C1922k(this.f15320m, this.f15321n, this.f15322o, cVar);
        c1922k.f15319l = obj;
        return c1922k;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1922k) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15318k;
        C1924l c1924l = this.f15320m;
        try {
            try {
                if (i7 == 0) {
                    P3.r.Y(obj);
                    InterfaceC0265f0 interfaceC0265f0Q = H5.D.q(((H5.A) this.f15319l).getCoroutineContext());
                    c1924l.f15334G = true;
                    D0 d02 = c1924l.f15336y;
                    q.X x7 = q.X.f14513k;
                    C1920j c1920j = new C1920j(this.f15321n, c1924l, this.f15322o, interfaceC0265f0Q, null);
                    this.f15318k = 1;
                    if (d02.e(x7, c1920j, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    P3.r.Y(obj);
                }
                c1924l.f15329B.e();
                c1924l.f15334G = false;
                c1924l.f15329B.b(null);
                c1924l.f15332E = false;
                return O3.C.a;
            } catch (CancellationException e7) {
                throw e7;
            }
        } catch (Throwable th) {
            c1924l.f15334G = false;
            c1924l.f15329B.b(null);
            c1924l.f15332E = false;
            throw th;
        }
    }
}
