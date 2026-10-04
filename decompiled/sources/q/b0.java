package q;

import h0.AbstractC0966K;
import h0.C0964I;
import h0.InterfaceC0973S;
import o.C1622t;
import s.B0;
import s.D0;
import y0.C2351F;

/* loaded from: classes.dex */
public final class b0 implements N, e0, InterfaceC0973S {

    /* renamed from: l, reason: collision with root package name */
    public static final b0 f14534l = new b0(0);

    /* renamed from: m, reason: collision with root package name */
    public static final b0 f14535m = new b0(1);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14536k;

    public /* synthetic */ b0(int i7) {
        this.f14536k = i7;
    }

    @Override // q.e0
    public boolean a() {
        return false;
    }

    @Override // q.e0
    public Object b(long j7, B0 b02, S3.c cVar) {
        B0 b03 = new B0(b02.f15069n, cVar);
        b03.f15068m = j7;
        O3.C c2 = O3.C.a;
        Object objInvokeSuspend = b03.invokeSuspend(c2);
        return objInvokeSuspend == T3.a.f9048k ? objInvokeSuspend : c2;
    }

    @Override // h0.InterfaceC0973S
    public AbstractC0966K c(long j7, T0.k kVar, T0.b bVar) {
        switch (this.f14536k) {
            case 3:
                float fO = bVar.O(AbstractC1841x.a);
                return new C0964I(new g0.d(0.0f, -fO, g0.f.d(j7), g0.f.b(j7) + fO));
            default:
                float fO2 = bVar.O(AbstractC1841x.a);
                return new C0964I(new g0.d(-fO2, 0.0f, g0.f.d(j7) + fO2, g0.f.b(j7)));
        }
    }

    @Override // q.N
    public void d(C2351F c2351f) {
        c2351f.b();
    }

    @Override // q.e0
    public a0.q e() {
        return a0.n.a;
    }

    @Override // q.e0
    public long f(long j7, int i7, C1622t c1622t) {
        c1622t.getClass();
        D0 d02 = (D0) c1622t.f13534m;
        return new g0.c(D0.a(d02, d02.f15104h, j7, d02.f15103g)).a;
    }
}
