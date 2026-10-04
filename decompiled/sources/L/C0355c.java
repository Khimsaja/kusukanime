package L;

import M.AbstractC0461t;
import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import b1.AbstractC0703b;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2140t;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: L.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355c extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e4.n f5465l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W.a f5466m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f5467n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f5468o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f5469p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ W.a f5470q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0355c(e4.n nVar, W.a aVar, long j7, long j8, long j9, long j10, W.a aVar2) {
        super(2);
        this.f5465l = nVar;
        this.f5466m = aVar;
        this.f5467n = j8;
        this.f5468o = j9;
        this.f5469p = j10;
        this.f5470q = aVar2;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        byte b4 = 0;
        C0510p c0510p = (C0510p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            a0.q qVarG = androidx.compose.foundation.layout.a.g(a0.n.a, AbstractC0379i.f5601e);
            C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p, 0);
            int i7 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, qVarG);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C2361h c2361h = C2363j.f17875f;
            C0486d.R(c0510p, c2361h, c2140tA);
            C2361h c2361h2 = C2363j.f17874e;
            C0486d.R(c0510p, c2361h2, interfaceC0501k0M);
            C2361h c2361h3 = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i7))) {
                AbstractC0703b.u(i7, c0510p, i7, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p, c2361h4, qVarC);
            c0510p.R(-1924971291);
            c0510p.p(false);
            c0510p.R(-1924961479);
            e4.n nVar = this.f5465l;
            if (nVar != null) {
                AbstractC0461t.a(this.f5467n, N2.a(N.c.f6640c, c0510p), W.f.b(434448772, new D.S(4, nVar), c0510p), c0510p, 384);
            }
            c0510p.p(false);
            c0510p.R(-1924936431);
            W.a aVar = this.f5466m;
            if (aVar != null) {
                AbstractC0461t.a(this.f5468o, N2.a(N.c.f6642e, c0510p), W.f.b(-796843771, new C0351b(aVar, (int) b4, b4), c0510p), c0510p, 384);
            }
            c0510p.p(false);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(a0.b.f10395y);
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, false);
            int i8 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p.m();
            a0.q qVarC2 = a0.a.c(c0510p, horizontalAlignElement);
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, c2361h, interfaceC2173HE);
            C0486d.R(c0510p, c2361h2, interfaceC0501k0M2);
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i8))) {
                AbstractC0703b.u(i8, c0510p, i8, c2361h3);
            }
            C0486d.R(c0510p, c2361h4, qVarC2);
            int i9 = N.c.a;
            AbstractC0461t.a(this.f5469p, N2.a(N.u.f6831n, c0510p), this.f5470q, c0510p, 0);
            c0510p.p(true);
            c0510p.p(true);
        }
        return O3.C.a;
    }
}
