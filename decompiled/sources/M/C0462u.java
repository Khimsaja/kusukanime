package M;

import D.C0056i;
import l4.AbstractC1420H;
import s.EnumC1903a0;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import y0.InterfaceC2375w;

/* renamed from: M.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0462u extends a0.p implements InterfaceC2375w {

    /* renamed from: A, reason: collision with root package name */
    public boolean f6345A;

    /* renamed from: x, reason: collision with root package name */
    public C0460s f6346x;

    /* renamed from: y, reason: collision with root package name */
    public e4.n f6347y;

    /* renamed from: z, reason: collision with root package name */
    public EnumC1903a0 f6348z;

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        w0.S sB = interfaceC2172G.b(j7);
        if (!interfaceC2175J.s() || !this.f6345A) {
            O3.l lVar = (O3.l) this.f6347y.invoke(new T0.j(AbstractC1420H.a(sB.f16840k, sB.f16841l)), new T0.a(j7));
            C0460s c0460s = this.f6346x;
            B b4 = (B) lVar.f7528k;
            if (!kotlin.jvm.internal.l.a(c0460s.d(), b4)) {
                c0460s.f6343m.setValue(b4);
                R5.c cVar = c0460s.f6335e.f6207b;
                boolean zD = cVar.d();
                Object obj = lVar.f7529l;
                if (zD) {
                    try {
                        C0458p c0458p = c0460s.f6344n;
                        float fD = c0460s.d().d(obj);
                        if (!Float.isNaN(fD)) {
                            C0458p.a(c0458p, fD);
                            c0460s.h(null);
                        }
                        c0460s.g(obj);
                    } finally {
                        cVar.e(null);
                    }
                }
                if (!zD) {
                    c0460s.h(obj);
                }
            }
        }
        this.f6345A = interfaceC2175J.s() || this.f6345A;
        return interfaceC2175J.T(sB.f16840k, sB.f16841l, P3.z.f7780k, new C0056i(interfaceC2175J, this, sB, 5));
    }

    @Override // a0.p
    public final void z0() {
        this.f6345A = false;
    }
}
