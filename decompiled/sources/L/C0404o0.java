package L;

import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import b1.AbstractC0703b;
import h0.C0998u;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: L.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404o0 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5691l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0392l0 f5692m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e4.n f5693n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0404o0(C0392l0 c0392l0, e4.n nVar, int i7) {
        super(2);
        this.f5691l = i7;
        this.f5692m = c0392l0;
        this.f5693n = nVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5691l) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    a0.q qVarL = androidx.compose.foundation.layout.a.l(a0.n.a, 0.0f, 0.0f, AbstractC0412r0.f5759e, 0.0f, 11);
                    InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, false);
                    int i7 = c0510p.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
                    a0.q qVarC = a0.a.c(c0510p, qVarL);
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
                    C0486d.a(X.a.a(new C0998u(this.f5692m.f5641c)), this.f5693n, c0510p, 8);
                    c0510p.p(true);
                }
                break;
            default:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    a0.q qVarL2 = androidx.compose.foundation.layout.a.l(a0.n.a, AbstractC0412r0.f5760f, 0.0f, 0.0f, 0.0f, 14);
                    InterfaceC2173H interfaceC2173HE2 = AbstractC2136o.e(a0.b.f10381k, false);
                    int i8 = c0510p2.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
                    a0.q qVarC2 = a0.a.c(c0510p2, qVarL2);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i2 = C2363j.f17871b;
                    c0510p2.V();
                    if (c0510p2.f7127O) {
                        c0510p2.l(c2362i2);
                    } else {
                        c0510p2.e0();
                    }
                    C0486d.R(c0510p2, C2363j.f17875f, interfaceC2173HE2);
                    C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M2);
                    C2361h c2361h2 = C2363j.f17876g;
                    if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i8))) {
                        AbstractC0703b.u(i8, c0510p2, i8, c2361h2);
                    }
                    C0486d.R(c0510p2, C2363j.f17873d, qVarC2);
                    C0392l0 c0392l0 = this.f5692m;
                    AbstractC0412r0.c(c0392l0.f5642d, N.j.f6690h, this.f5693n, c0510p2, 48);
                    c0510p2.p(true);
                }
                break;
        }
        return O3.C.a;
    }
}
