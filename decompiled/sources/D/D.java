package D;

import O.C0493g0;
import z0.Y0;
import z0.Z0;

/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0053g0 f1004l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1005m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y0 f1006n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ H.S f1007o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N0.w f1008p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N0.q f1009q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C0053g0 c0053g0, boolean z7, Y0 y02, H.S s7, N0.w wVar, N0.q qVar) {
        super(1);
        this.f1004l = c0053g0;
        this.f1005m = z7;
        this.f1006n = y02;
        this.f1007o = s7;
        this.f1008p = wVar;
        this.f1009q = qVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        N0.B b4;
        w0.r rVar;
        w0.r rVar2;
        w0.r rVar3 = (w0.r) obj;
        C0053g0 c0053g0 = this.f1004l;
        c0053g0.f1149h = rVar3;
        N0 n0D = c0053g0.d();
        if (n0D != null) {
            n0D.f1080b = rVar3;
        }
        if (this.f1005m) {
            W wA = c0053g0.a();
            W w7 = W.f1108l;
            N0.w wVar = this.f1008p;
            H.S s7 = this.f1007o;
            C0493g0 c0493g0 = c0053g0.f1156o;
            if (wA == w7) {
                if (((Boolean) c0053g0.f1153l.getValue()).booleanValue() && ((Z0) this.f1006n).a()) {
                    s7.o();
                } else {
                    s7.k();
                }
                c0053g0.f1154m.setValue(Boolean.valueOf(P3.r.G(s7, true)));
                c0053g0.f1155n.setValue(Boolean.valueOf(P3.r.G(s7, false)));
                c0493g0.setValue(Boolean.valueOf(H0.H.b(wVar.f6896b)));
            } else if (c0053g0.a() == W.f1109m) {
                c0493g0.setValue(Boolean.valueOf(P3.r.G(s7, true)));
            }
            N0.q qVar = this.f1009q;
            AbstractC0047d0.q(c0053g0, wVar, qVar);
            N0 n0D2 = c0053g0.d();
            if (n0D2 != null && (b4 = c0053g0.f1146e) != null && c0053g0.b() && (rVar = n0D2.f1080b) != null && rVar.B() && (rVar2 = n0D2.f1081c) != null) {
                C0042b c0042b = new C0042b(1, rVar);
                g0.d dVarU = q0.c.U(rVar);
                g0.d dVarK = rVar.K(rVar2, false);
                if (kotlin.jvm.internal.l.a((N0.B) b4.a.f6898b.get(), b4)) {
                    b4.f6850b.h(wVar, qVar, n0D2.a, c0042b, dVarU, dVarK);
                }
            }
        }
        return O3.C.a;
    }
}
