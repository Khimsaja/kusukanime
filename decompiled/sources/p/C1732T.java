package p;

import m.C1502w;

/* renamed from: p.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1732T extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13908l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1746d0 f13909m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1732T(C1746d0 c1746d0, int i7) {
        super(1);
        this.f13908l = i7;
        this.f13909m = c1746d0;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f13908l) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                C1746d0 c1746d0 = this.f13909m;
                long j7 = jLongValue - c1746d0.f13992v;
                c1746d0.f13992v = jLongValue;
                long jX = P3.F.X(j7 / c1746d0.f13996z);
                C1502w c1502w = c1746d0.f13993w;
                int i7 = c1502w.f12934b;
                int i8 = 0;
                if (i7 != 0) {
                    Object[] objArr = c1502w.a;
                    for (int i9 = 0; i9 < i7; i9++) {
                        C1731S c1731s = (C1731S) objArr[i9];
                        C1746d0.M0(c1746d0, c1731s, jX);
                        c1731s.f13902c = true;
                    }
                    u0 u0Var = c1746d0.f13985o;
                    if (u0Var != null) {
                        u0Var.p();
                    }
                    int i10 = c1502w.f12934b;
                    Object[] objArr2 = c1502w.a;
                    k4.g gVarL = e3.c.L(0, i10);
                    int i11 = gVarL.f12672k;
                    int i12 = gVarL.f12673l;
                    if (i11 <= i12) {
                        while (true) {
                            objArr2[i11 - i8] = objArr2[i11];
                            if (((C1731S) objArr2[i11]).f13902c) {
                                i8++;
                            }
                            if (i11 != i12) {
                                i11++;
                            }
                        }
                    }
                    P3.m.c0(objArr2, i10 - i8, i10);
                    c1502w.f12934b -= i8;
                }
                C1731S c1731s2 = c1746d0.f13994x;
                if (c1731s2 != null) {
                    c1731s2.f13906g = c1746d0.f13986p;
                    C1746d0.M0(c1746d0, c1731s2, jX);
                    c1746d0.U0(c1731s2.f13903d);
                    if (c1731s2.f13903d == 1.0f) {
                        c1746d0.f13994x = null;
                    }
                    c1746d0.T0();
                }
                break;
            default:
                this.f13909m.f13992v = ((Number) obj).longValue();
                break;
        }
        return O3.C.a;
    }
}
