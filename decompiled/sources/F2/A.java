package F2;

import C2.C0034g;
import D6.RunnableC0121o;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.ui.SubtitleView;
import y1.b0;

/* loaded from: classes.dex */
public final class A implements y1.J, View.OnClickListener, InterfaceC0162s, InterfaceC0154j {
    public final y1.N a = new y1.N();

    /* renamed from: b, reason: collision with root package name */
    public Object f2227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E f2228c;

    public A(E e7) {
        this.f2228c = e7;
    }

    @Override // y1.J
    public final void D(int i7, int i8) {
        if (B1.K.a == 34) {
            E e7 = this.f2228c;
            if ((e7.f2248n instanceof SurfaceView) && e7.f2244Q) {
                C0034g c0034g = e7.f2250p;
                c0034g.getClass();
                e7.f2259y.post(new RunnableC0121o(c0034g, (SurfaceView) e7.f2248n, new B1.w(3, e7), 2));
            }
        }
    }

    @Override // y1.J
    public final void E(b0 b0Var) {
        E e7;
        y1.L l7;
        if (b0Var.equals(b0.f18027d) || (l7 = (e7 = this.f2228c).f2232C) == null || ((H1.G) l7).Z0() == 1) {
            return;
        }
        e7.k();
    }

    @Override // y1.J
    public final void b(int i7, y1.K k7, y1.K k8) {
        C0163t c0163t;
        E e7 = this.f2228c;
        if (e7.e() && e7.f2242O && (c0163t = e7.f2256v) != null) {
            c0163t.f();
        }
    }

    @Override // y1.J
    public final void f(A1.c cVar) {
        SubtitleView subtitleView = this.f2228c.f2253s;
        if (subtitleView != null) {
            subtitleView.setCues(cVar.a);
        }
    }

    @Override // y1.J
    public final void l() {
        E e7 = this.f2228c;
        View view = e7.f2247m;
        if (view != null) {
            view.setVisibility(4);
            if (!e7.b()) {
                e7.d();
                return;
            }
            ImageView imageView = e7.f2251q;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    @Override // y1.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(y1.X r8) {
        /*
            r7 = this;
            F2.E r8 = r7.f2228c
            y1.L r0 = r8.f2232C
            r0.getClass()
            r1 = r0
            Q4.c r1 = (Q4.c) r1
            r2 = 17
            boolean r2 = r1.y0(r2)
            if (r2 == 0) goto L1a
            r2 = r0
            H1.G r2 = (H1.G) r2
            y1.P r2 = r2.U0()
            goto L1c
        L1a:
            y1.M r2 = y1.P.a
        L1c:
            boolean r3 = r2.p()
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L27
            r7.f2227b = r5
            goto L81
        L27:
            r3 = 30
            boolean r1 = r1.y0(r3)
            y1.N r3 = r7.a
            if (r1 == 0) goto L65
            r1 = r0
            H1.G r1 = (H1.G) r1
            y1.X r6 = r1.V0()
            j3.G r6 = r6.a
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L65
            r1.u1()
            H1.d0 r0 = r1.f3264q0
            y1.P r0 = r0.a
            boolean r0 = r0.p()
            if (r0 == 0) goto L4f
            r0 = r4
            goto L5b
        L4f:
            H1.d0 r0 = r1.f3264q0
            y1.P r1 = r0.a
            O1.B r0 = r0.f3426b
            java.lang.Object r0 = r0.a
            int r0 = r1.b(r0)
        L5b:
            r1 = 1
            y1.N r0 = r2.f(r0, r3, r1)
            java.lang.Object r0 = r0.f17947b
            r7.f2227b = r0
            goto L81
        L65:
            java.lang.Object r1 = r7.f2227b
            if (r1 == 0) goto L81
            int r1 = r2.b(r1)
            r6 = -1
            if (r1 == r6) goto L7f
            y1.N r1 = r2.f(r1, r3, r4)
            int r1 = r1.f17948c
            H1.G r0 = (H1.G) r0
            int r0 = r0.R0()
            if (r0 != r1) goto L7f
            return
        L7f:
            r7.f2227b = r5
        L81:
            r8.o(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.A.o(y1.X):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f2228c.j();
    }

    @Override // y1.J
    public final void q(int i7, boolean z7) {
        E e7 = this.f2228c;
        e7.l();
        if (!e7.e() || !e7.f2242O) {
            e7.f(false);
            return;
        }
        C0163t c0163t = e7.f2256v;
        if (c0163t != null) {
            c0163t.f();
        }
    }

    @Override // y1.J
    public final void w(int i7) {
        E e7 = this.f2228c;
        e7.l();
        e7.n();
        if (!e7.e() || !e7.f2242O) {
            e7.f(false);
            return;
        }
        C0163t c0163t = e7.f2256v;
        if (c0163t != null) {
            c0163t.f();
        }
    }
}
