package F2;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;

/* renamed from: F2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0153i implements y1.J, View.OnClickListener, PopupWindow.OnDismissListener {
    public final /* synthetic */ C0163t a;

    public ViewOnClickListenerC0153i(C0163t c0163t) {
        this.a = c0163t;
    }

    @Override // y1.J
    public final void A(y1.I i7) {
        boolean zA = i7.a(4, 5, 13);
        C0163t c0163t = this.a;
        if (zA) {
            c0163t.m();
        }
        if (i7.a(4, 5, 7, 13)) {
            c0163t.o();
        }
        if (i7.a(8, 13)) {
            c0163t.p();
        }
        if (i7.a(9, 13)) {
            c0163t.r();
        }
        if (i7.a(8, 9, 11, 0, 16, 17, 13)) {
            c0163t.l();
        }
        if (i7.a(11, 0, 13)) {
            c0163t.s();
        }
        if (i7.a(12, 13)) {
            c0163t.n();
        }
        if (i7.a(2, 13)) {
            c0163t.t();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0163t c0163t = this.a;
        y1.L l7 = c0163t.f2447t0;
        if (l7 == null) {
            return;
        }
        y yVar = c0163t.f2428k;
        yVar.g();
        if (c0163t.f2453x == view) {
            Q4.c cVar = (Q4.c) l7;
            if (cVar.y0(9)) {
                cVar.E0();
                return;
            }
            return;
        }
        if (c0163t.f2451w == view) {
            Q4.c cVar2 = (Q4.c) l7;
            if (cVar2.y0(7)) {
                cVar2.G0();
                return;
            }
            return;
        }
        if (c0163t.f2457z == view) {
            if (((H1.G) l7).Z0() != 4) {
                Q4.c cVar3 = (Q4.c) l7;
                if (cVar3.y0(12)) {
                    H1.G g4 = (H1.G) cVar3;
                    g4.u1();
                    cVar3.F0(12, g4.f3223F);
                    return;
                }
                return;
            }
            return;
        }
        if (c0163t.f2388A == view) {
            Q4.c cVar4 = (Q4.c) l7;
            if (cVar4.y0(11)) {
                H1.G g7 = (H1.G) cVar4;
                g7.u1();
                cVar4.F0(11, -g7.f3222E);
                return;
            }
            return;
        }
        if (c0163t.f2455y == view) {
            if (B1.K.N(l7, c0163t.f2456y0)) {
                B1.K.y(l7);
                return;
            }
            Q4.c cVar5 = (Q4.c) l7;
            if (cVar5.y0(1)) {
                H1.G g8 = (H1.G) cVar5;
                g8.u1();
                g8.r1(1, false);
                return;
            }
            return;
        }
        if (c0163t.f2393D == view) {
            if (((Q4.c) l7).y0(15)) {
                H1.G g9 = (H1.G) l7;
                g9.u1();
                int i7 = g9.f3231P;
                int i8 = c0163t.f2394D0;
                for (int i9 = 1; i9 <= 2; i9++) {
                    int i10 = (i7 + i9) % 3;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 != 2 || (i8 & 2) == 0) {
                            }
                        } else if ((i8 & 1) == 0) {
                        }
                    }
                    i7 = i10;
                }
                g9.n1(i7);
                return;
            }
            return;
        }
        if (c0163t.f2395E == view) {
            if (((Q4.c) l7).y0(14)) {
                H1.G g10 = (H1.G) l7;
                g10.u1();
                boolean z7 = !g10.f3232Q;
                g10.u1();
                if (g10.f3232Q != z7) {
                    g10.f3232Q = z7;
                    B1.F f5 = g10.f3271v.f3328r;
                    f5.getClass();
                    B1.E eB = B1.F.b();
                    eB.a = f5.a.obtainMessage(12, z7 ? 1 : 0, 0);
                    eB.b();
                    H1.A a = new H1.A(z7, 0);
                    B1.q qVar = g10.f3272w;
                    qVar.c(9, a);
                    g10.q1();
                    qVar.b();
                    return;
                }
                return;
            }
            return;
        }
        View view2 = c0163t.J;
        if (view2 == view) {
            yVar.f();
            c0163t.d(c0163t.f2438p, view2);
            return;
        }
        View view3 = c0163t.f2405K;
        if (view3 == view) {
            yVar.f();
            c0163t.d(c0163t.f2440q, view3);
            return;
        }
        View view4 = c0163t.f2406L;
        if (view4 == view) {
            yVar.f();
            c0163t.d(c0163t.f2444s, view4);
            return;
        }
        ImageView imageView = c0163t.f2399G;
        if (imageView == view) {
            yVar.f();
            c0163t.d(c0163t.f2442r, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0163t c0163t = this.a;
        if (c0163t.f2404J0) {
            c0163t.f2428k.g();
        }
    }
}
