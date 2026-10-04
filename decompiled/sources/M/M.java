package M;

import D.AbstractC0052g;
import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import b1.AbstractC0703b;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* loaded from: classes.dex */
public final class M extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6229l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f6230m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f6231n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(int i7, long j7, Object obj) {
        super(2);
        this.f6229l = i7;
        this.f6230m = j7;
        this.f6231n = obj;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6229l) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    W.c(this.f6230m, (e4.n) this.f6231n, c0510p, 0);
                }
                break;
            case 1:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    W.c(this.f6230m, (e4.n) this.f6231n, c0510p2, 0);
                }
                break;
            default:
                C0510p c0510p3 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    long j7 = this.f6230m;
                    if (j7 != 9205357640488583168L) {
                        c0510p3.R(1828881000);
                        a0.q qVarI = androidx.compose.foundation.layout.c.i((a0.q) this.f6231n, Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), 0.0f, 0.0f, 12);
                        InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10382l, false);
                        int i7 = c0510p3.f7128P;
                        InterfaceC0501k0 interfaceC0501k0M = c0510p3.m();
                        a0.q qVarC = a0.a.c(c0510p3, qVarI);
                        InterfaceC2364k.f17877j.getClass();
                        C2362i c2362i = C2363j.f17871b;
                        c0510p3.V();
                        if (c0510p3.f7127O) {
                            c0510p3.l(c2362i);
                        } else {
                            c0510p3.e0();
                        }
                        C0486d.R(c0510p3, C2363j.f17875f, interfaceC2173HE);
                        C0486d.R(c0510p3, C2363j.f17874e, interfaceC0501k0M);
                        C2361h c2361h = C2363j.f17876g;
                        if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i7))) {
                            AbstractC0703b.u(i7, c0510p3, i7, c2361h);
                        }
                        C0486d.R(c0510p3, C2363j.f17873d, qVarC);
                        AbstractC0052g.b(null, c0510p3, 0, 1);
                        c0510p3.p(true);
                        c0510p3.p(false);
                    } else {
                        c0510p3.R(1829217412);
                        AbstractC0052g.b((a0.q) this.f6231n, c0510p3, 0, 0);
                        c0510p3.p(false);
                    }
                }
                break;
        }
        return O3.C.a;
    }
}
