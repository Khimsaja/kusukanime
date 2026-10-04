package L;

import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import b1.AbstractC0703b;
import h0.InterfaceC0973S;
import q.C1837t;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z0.AbstractC2455l0;

/* renamed from: L.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402n2 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0.q f5682l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0973S f5683m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f5684n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f5685o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1837t f5686p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f5687q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W.a f5688r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0402n2(a0.q qVar, InterfaceC0973S interfaceC0973S, long j7, float f5, C1837t c1837t, float f7, W.a aVar) {
        super(2);
        this.f5682l = qVar;
        this.f5683m = interfaceC0973S;
        this.f5684n = j7;
        this.f5685o = f5;
        this.f5686p = c1837t;
        this.f5687q = f7;
        this.f5688r = aVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C0510p c0510p = (C0510p) obj;
        int iIntValue = ((Number) obj2).intValue() & 3;
        O3.C c2 = O3.C.a;
        if (iIntValue == 2 && c0510p.y()) {
            c0510p.M();
            return c2;
        }
        long jD = q2.d(this.f5684n, this.f5685o, c0510p);
        float fX = ((T0.b) c0510p.k(AbstractC2455l0.f18787f)).x(this.f5687q);
        a0.q qVarA = s0.w.a(F0.k.a(q2.c(this.f5682l, this.f5683m, jD, this.f5686p, fX), false, C0429x.f5920v), c2, new C0398m2(2, null));
        InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, true);
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
        this.f5688r.invoke(c0510p, 0);
        c0510p.p(true);
        return c2;
    }
}
