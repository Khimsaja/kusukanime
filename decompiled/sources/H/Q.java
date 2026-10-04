package H;

import C2.C0028a;
import D.C0053g0;
import D.InterfaceC0071p0;
import D.N0;
import e5.AbstractC0832b;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0071p0 {
    public final /* synthetic */ S a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2912b;

    public Q(S s7, boolean z7) {
        this.a = s7;
        this.f2912b = z7;
    }

    @Override // D.InterfaceC0071p0
    public final void a() {
        S s7 = this.a;
        s7.f2926o.setValue(null);
        s7.f2927p.setValue(null);
        s7.p(true);
    }

    @Override // D.InterfaceC0071p0
    public final void b() {
        S s7 = this.a;
        s7.f2926o.setValue(null);
        s7.f2927p.setValue(null);
        s7.p(true);
    }

    @Override // D.InterfaceC0071p0
    public final void d() {
        N0 n0D;
        boolean z7 = this.f2912b;
        D.V v5 = z7 ? D.V.f1104l : D.V.f1105m;
        S s7 = this.a;
        s7.f2926o.setValue(v5);
        long jI = s7.i(z7);
        float f5 = A.a;
        long jE = AbstractC0832b.e(g0.c.d(jI), g0.c.e(jI) - 1.0f);
        C0053g0 c0053g0 = s7.f2915d;
        if (c0053g0 == null || (n0D = c0053g0.d()) == null) {
            return;
        }
        long jE2 = n0D.e(jE);
        s7.f2923l = jE2;
        s7.f2927p.setValue(new g0.c(jE2));
        s7.f2925n = 0L;
        s7.f2928q = -1;
        C0053g0 c0053g02 = s7.f2915d;
        if (c0053g02 != null) {
            c0053g02.f1158q.setValue(Boolean.TRUE);
        }
        s7.p(false);
    }

    @Override // D.InterfaceC0071p0
    public final void e(long j7) {
        S s7 = this.a;
        long jH = g0.c.h(s7.f2925n, j7);
        s7.f2925n = jH;
        s7.f2927p.setValue(new g0.c(g0.c.h(s7.f2923l, jH)));
        N0.w wVarJ = s7.j();
        g0.c cVarG = s7.g();
        kotlin.jvm.internal.l.c(cVarG);
        C0028a c0028a = C0199p.f2998g;
        S.a(s7, wVarJ, cVarG.a, false, this.f2912b, c0028a, true);
        s7.p(false);
    }

    @Override // D.InterfaceC0071p0
    public final void onCancel() {
    }

    @Override // D.InterfaceC0071p0
    public final void c(long j7) {
    }
}
