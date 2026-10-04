package H;

import D.C0053g0;
import D.InterfaceC0071p0;
import D.N0;
import O.C0493g0;
import e5.AbstractC0832b;
import l4.AbstractC1420H;
import o0.C1630b;
import o0.InterfaceC1629a;

/* loaded from: classes.dex */
public final class P implements InterfaceC0071p0 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f2911b;

    public /* synthetic */ P(S s7, int i7) {
        this.a = i7;
        this.f2911b = s7;
    }

    @Override // D.InterfaceC0071p0
    public final void a() {
        switch (this.a) {
            case 0:
                S s7 = this.f2911b;
                s7.f2926o.setValue(null);
                s7.f2927p.setValue(null);
                break;
            default:
                i();
                break;
        }
    }

    @Override // D.InterfaceC0071p0
    public final void b() {
        switch (this.a) {
            case 0:
                S s7 = this.f2911b;
                s7.f2926o.setValue(null);
                s7.f2927p.setValue(null);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r15v10, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // D.InterfaceC0071p0
    public final void c(long j7) {
        N0 n0D;
        long j8;
        N0 n0D2;
        N0 n0D3;
        switch (this.a) {
            case 0:
                S s7 = this.f2911b;
                long jI = s7.i(true);
                float f5 = A.a;
                long jE = AbstractC0832b.e(g0.c.d(jI), g0.c.e(jI) - 1.0f);
                C0053g0 c0053g0 = s7.f2915d;
                if (c0053g0 != null && (n0D = c0053g0.d()) != null) {
                    long jE2 = n0D.e(jE);
                    s7.f2923l = jE2;
                    s7.f2927p.setValue(new g0.c(jE2));
                    s7.f2925n = 0L;
                    s7.f2926o.setValue(D.V.f1103k);
                    s7.p(false);
                    break;
                }
                break;
            default:
                S s8 = this.f2911b;
                if (s8.h()) {
                    C0493g0 c0493g0 = s8.f2926o;
                    if (((D.V) c0493g0.getValue()) == null) {
                        c0493g0.setValue(D.V.f1105m);
                        s8.f2928q = -1;
                        s8.k();
                        C0053g0 c0053g02 = s8.f2915d;
                        if (c0053g02 == null || (n0D3 = c0053g02.d()) == null || !n0D3.c(j7)) {
                            j8 = j7;
                            C0053g0 c0053g03 = s8.f2915d;
                            if (c0053g03 != null && (n0D2 = c0053g03.d()) != null) {
                                int iA = s8.f2913b.a(n0D2.b(j8, true));
                                N0.w wVarC = S.c(s8.j().a, AbstractC1420H.c(iA, iA));
                                s8.f(false);
                                InterfaceC1629a interfaceC1629a = s8.f2919h;
                                if (interfaceC1629a != null) {
                                    ((C1630b) interfaceC1629a).a();
                                }
                                s8.f2914c.invoke(wVarC);
                            }
                        } else if (s8.j().a.a.length() != 0) {
                            s8.f(false);
                            j8 = j7;
                            s8.f2924m = Integer.valueOf((int) (S.a(s8, N0.w.a(s8.j(), null, H0.H.f3091b, 5), j8, true, false, C0199p.f2996e, true) >> 32));
                        }
                        s8.n(D.W.f1107k);
                        s8.f2923l = j8;
                        s8.f2927p.setValue(new g0.c(j8));
                        s8.f2925n = 0L;
                        break;
                    }
                }
                break;
        }
    }

    @Override // D.InterfaceC0071p0
    public final void d() {
        int i7 = this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Type inference failed for: r0v6, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // D.InterfaceC0071p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r11) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.P.e(long):void");
    }

    public void i() {
        S s7 = this.f2911b;
        s7.f2926o.setValue(null);
        s7.f2927p.setValue(null);
        s7.p(true);
        s7.f2924m = null;
        boolean zB = H0.H.b(s7.j().f6896b);
        s7.n(zB ? D.W.f1109m : D.W.f1108l);
        C0053g0 c0053g0 = s7.f2915d;
        if (c0053g0 != null) {
            c0053g0.f1154m.setValue(Boolean.valueOf(!zB && P3.r.G(s7, true)));
        }
        C0053g0 c0053g02 = s7.f2915d;
        if (c0053g02 != null) {
            c0053g02.f1155n.setValue(Boolean.valueOf(!zB && P3.r.G(s7, false)));
        }
        C0053g0 c0053g03 = s7.f2915d;
        if (c0053g03 == null) {
            return;
        }
        c0053g03.f1156o.setValue(Boolean.valueOf(zB && P3.r.G(s7, true)));
    }

    @Override // D.InterfaceC0071p0
    public final void onCancel() {
        switch (this.a) {
            case 0:
                break;
            default:
                i();
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void j() {
    }
}
