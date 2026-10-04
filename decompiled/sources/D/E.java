package D;

import G2.C0174k;
import O.C0493g0;
import f0.C0855h;
import f0.C0862o;
import h0.C0970O;
import h0.C0976V;
import l4.AbstractC1420H;
import p.C1727N;
import z0.C2457m0;

/* loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1012l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1013m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1014n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1015o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1016p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f1017q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C0053g0 c0053g0, C0862o c0862o, boolean z7, H.S s7, N0.q qVar) {
        super(1);
        this.f1014n = c0053g0;
        this.f1015o = c0862o;
        this.f1013m = z7;
        this.f1016p = s7;
        this.f1017q = qVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f1012l) {
            case 0:
                long j7 = ((g0.c) obj).a;
                C0053g0 c0053g0 = (C0053g0) this.f1014n;
                if (c0053g0.b()) {
                    z0.N0 n02 = c0053g0.f1144c;
                    if (n02 != null) {
                        ((C2457m0) n02).b();
                    }
                } else {
                    ((C0862o) this.f1015o).a(C0855h.f11401p);
                }
                if (c0053g0.b() && this.f1013m) {
                    if (c0053g0.a() != W.f1108l) {
                        N0 n0D = c0053g0.d();
                        if (n0D != null) {
                            int iA = ((N0.q) this.f1017q).a(n0D.b(j7, true));
                            c0053g0.f1161t.invoke(N0.w.a((N0.w) c0053g0.f1145d.f6045l, null, AbstractC1420H.c(iA, iA), 5));
                            if (c0053g0.a.a.a.length() > 0) {
                                c0053g0.f1152k.setValue(W.f1109m);
                            }
                        }
                    } else {
                        ((H.S) this.f1016p).e(new g0.c(j7));
                    }
                }
                break;
            case 1:
                C0174k c0174k = (C0174k) obj;
                kotlin.jvm.internal.l.f("entry", c0174k);
                ((kotlin.jvm.internal.t) this.f1014n).f12716k = true;
                ((kotlin.jvm.internal.t) this.f1015o).f12716k = true;
                ((G2.E) this.f1016p).p(c0174k, this.f1013m, (P3.l) this.f1017q);
                break;
            default:
                C0970O c0970o = (C0970O) obj;
                C1727N c1727n = (C1727N) this.f1014n;
                float fFloatValue = 0.8f;
                p.s0 s0Var = (p.s0) this.f1016p;
                float fFloatValue2 = 1.0f;
                C0493g0 c0493g0 = c1727n.f13892m;
                boolean z7 = this.f1013m;
                c0970o.f(!z7 ? ((Number) s0Var.f14105t.getValue()).floatValue() : ((Boolean) c0493g0.getValue()).booleanValue() ? 1.0f : 0.8f);
                if (!z7) {
                    fFloatValue = ((Number) s0Var.f14105t.getValue()).floatValue();
                } else if (((Boolean) c0493g0.getValue()).booleanValue()) {
                    fFloatValue = 1.0f;
                }
                c0970o.g(fFloatValue);
                if (!z7) {
                    fFloatValue2 = ((Number) ((p.s0) this.f1017q).f14105t.getValue()).floatValue();
                } else if (!((Boolean) c0493g0.getValue()).booleanValue()) {
                    fFloatValue2 = 0.0f;
                }
                c0970o.b(fFloatValue2);
                c0970o.k(((C0976V) ((O.Z) this.f1015o).getValue()).a);
                break;
        }
        return O3.C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(kotlin.jvm.internal.t tVar, kotlin.jvm.internal.t tVar2, G2.E e7, boolean z7, P3.l lVar) {
        super(1);
        this.f1014n = tVar;
        this.f1015o = tVar2;
        this.f1016p = e7;
        this.f1013m = z7;
        this.f1017q = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(boolean z7, C1727N c1727n, O.Z z8, p.s0 s0Var, p.s0 s0Var2) {
        super(1);
        this.f1013m = z7;
        this.f1014n = c1727n;
        this.f1015o = z8;
        this.f1016p = s0Var;
        this.f1017q = s0Var2;
    }
}
