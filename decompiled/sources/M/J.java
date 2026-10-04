package M;

import O.C0489e0;
import O.C0493g0;
import O.G0;
import f1.AbstractC0870c;
import p.u0;

/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6218l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f6219m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f6220n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(float f5, O.Z z7) {
        super(1);
        this.f6219m = f5;
        this.f6220n = z7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f6218l) {
            case 0:
                long j7 = ((g0.f) obj).a;
                float fD = g0.f.d(j7);
                float f5 = this.f6219m;
                float f7 = fD * f5;
                float fB = g0.f.b(j7) * f5;
                O.Z z7 = (O.Z) this.f6220n;
                if (g0.f.d(((g0.f) z7.getValue()).a) != f7 || g0.f.b(((g0.f) z7.getValue()).a) != fB) {
                    z7.setValue(new g0.f(AbstractC0870c.F(f7, fB)));
                }
                break;
            default:
                long jLongValue = ((Number) obj).longValue();
                u0 u0Var = (u0) this.f6220n;
                if (!u0Var.g()) {
                    C0489e0 c0489e0 = u0Var.f14139g;
                    if (((G0) Y.o.t(c0489e0.f7066l, c0489e0)).f6997c == Long.MIN_VALUE) {
                        c0489e0.f(jLongValue);
                        ((C0493g0) u0Var.a.f8011k).setValue(Boolean.TRUE);
                    }
                    long jX = jLongValue - ((G0) Y.o.t(c0489e0.f7066l, c0489e0)).f6997c;
                    float f8 = this.f6219m;
                    if (f8 != 0.0f) {
                        jX = P3.F.X(jX / f8);
                    }
                    u0Var.o(jX);
                    u0Var.h(jX, f8 == 0.0f);
                }
                break;
        }
        return O3.C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(u0 u0Var, float f5) {
        super(1);
        this.f6220n = u0Var;
        this.f6219m = f5;
    }
}
