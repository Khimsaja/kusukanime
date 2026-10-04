package L;

import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import androidx.compose.material3.MinimumInteractiveModifier;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import h0.InterfaceC0973S;
import q.C1837t;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z0.AbstractC2455l0;

/* loaded from: classes.dex */
public final class p2 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0.q f5727l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0973S f5728m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f5729n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f5730o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1837t f5731p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f5732q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u.k f5733r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f5734s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f5735t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f5736u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ W.a f5737v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(a0.q qVar, InterfaceC0973S interfaceC0973S, long j7, float f5, C1837t c1837t, boolean z7, u.k kVar, boolean z8, InterfaceC0821a interfaceC0821a, float f7, W.a aVar) {
        super(2);
        this.f5727l = qVar;
        this.f5728m = interfaceC0973S;
        this.f5729n = j7;
        this.f5730o = f5;
        this.f5731p = c1837t;
        this.f5732q = z7;
        this.f5733r = kVar;
        this.f5734s = z8;
        this.f5735t = interfaceC0821a;
        this.f5736u = f7;
        this.f5737v = aVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C0510p c0510p = (C0510p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            O.S0 s02 = AbstractC0388k0.a;
            a0.q qVarC = q2.c(this.f5727l.k(MinimumInteractiveModifier.a), this.f5728m, q2.d(this.f5729n, this.f5730o, c0510p), this.f5731p, ((T0.b) c0510p.k(AbstractC2455l0.f18787f)).x(this.f5736u));
            q.M mA = S1.a(false, 0.0f, c0510p, 0, 7);
            a0.q qVarA = androidx.compose.foundation.selection.b.a(qVarC, this.f5732q, this.f5733r, mA, this.f5734s, null, this.f5735t);
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, true);
            int i7 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC2 = a0.a.c(c0510p, qVarA);
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
            C0486d.R(c0510p, C2363j.f17873d, qVarC2);
            this.f5737v.invoke(c0510p, 0);
            c0510p.p(true);
        }
        return O3.C.a;
    }
}
