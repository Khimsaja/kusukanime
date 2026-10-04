package M;

import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.InterfaceC0501k0;
import b1.AbstractC0703b;
import p.s0;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* loaded from: classes.dex */
public final class P extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s0 f6238l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f6239m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H0.I f6240n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e4.n f6241o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(s0 s0Var, long j7, H0.I i7, e4.n nVar) {
        super(2);
        this.f6238l = s0Var;
        this.f6239m = j7;
        this.f6240n = i7;
        this.f6241o = nVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C0510p c0510p = (C0510p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            a0.n nVar = a0.n.a;
            s0 s0Var = this.f6238l;
            boolean zF = c0510p.f(s0Var);
            Object objH = c0510p.H();
            if (zF || objH == C0502l.a) {
                objH = new N(s0Var, 1);
                c0510p.b0(objH);
            }
            a0.q qVarA = androidx.compose.ui.graphics.a.a(nVar, (e4.k) objH);
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, false);
            int i7 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, qVarA);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, C2363j.f17875f, interfaceC2173HE);
            C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i7))) {
                AbstractC0703b.u(i7, c0510p, i7, c2361h);
            }
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            W.b(this.f6239m, this.f6240n, this.f6241o, c0510p, 0);
            c0510p.p(true);
        }
        return O3.C.a;
    }
}
