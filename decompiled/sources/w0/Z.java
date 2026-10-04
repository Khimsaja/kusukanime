package w0;

import y0.C2349D;

/* loaded from: classes.dex */
public final class Z extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f16851l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f16852m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(a0 a0Var, int i7) {
        super(2);
        this.f16851l = i7;
        this.f16852m = a0Var;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16851l) {
            case 0:
                this.f16852m.a().f16817l = (O.r) obj2;
                break;
            case 1:
                C2169D c2169dA = this.f16852m.a();
                ((C2349D) obj).Y(new C2166A(c2169dA, (e4.n) obj2, c2169dA.f16831z));
                break;
            default:
                C2349D c2349d = (C2349D) obj;
                C2169D c2169d = c2349d.I;
                a0 a0Var = this.f16852m;
                if (c2169d == null) {
                    c2169d = new C2169D(c2349d, a0Var.a);
                    c2349d.I = c2169d;
                }
                a0Var.f16854b = c2169d;
                a0Var.a().e();
                C2169D c2169dA2 = a0Var.a();
                d0 d0Var = c2169dA2.f16818m;
                d0 d0Var2 = a0Var.a;
                if (d0Var != d0Var2) {
                    c2169dA2.f16818m = d0Var2;
                    c2169dA2.f(false);
                    C2349D.T(c2169dA2.f16816k, false, 7);
                }
                break;
        }
        return O3.C.a;
    }
}
