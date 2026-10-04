package L;

import O.C0486d;
import O.C0493g0;
import O.C0509o0;
import O.C0510p;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import e4.InterfaceC0821a;
import p.C1743c;
import z0.AbstractC2432a;

/* loaded from: classes.dex */
public final class M0 extends AbstractC2432a implements X0.r {

    /* renamed from: s, reason: collision with root package name */
    public final Window f5201s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f5202t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC0821a f5203u;

    /* renamed from: v, reason: collision with root package name */
    public final C1743c f5204v;

    /* renamed from: w, reason: collision with root package name */
    public final M5.c f5205w;

    /* renamed from: x, reason: collision with root package name */
    public final C0493g0 f5206x;

    /* renamed from: y, reason: collision with root package name */
    public Object f5207y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5208z;

    public M0(Context context, Window window, InterfaceC0821a interfaceC0821a, C1743c c1743c, M5.c cVar) {
        super(context);
        this.f5201s = window;
        this.f5202t = true;
        this.f5203u = interfaceC0821a;
        this.f5204v = c1743c;
        this.f5205w = cVar;
        this.f5206x = C0486d.K(V.a, O.T.f7049p);
    }

    @Override // X0.r
    public final Window a() {
        return this.f5201s;
    }

    @Override // z0.AbstractC2432a
    public final void b(int i7, C0510p c0510p) {
        c0510p.T(576708319);
        if ((((c0510p.h(this) ? 4 : 2) | i7) & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            ((e4.n) this.f5206x.getValue()).invoke(c0510p, 0);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new D.S(i7, 6, this);
        }
    }

    @Override // z0.AbstractC2432a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f5208z;
    }

    @Override // z0.AbstractC2432a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i7;
        super.onAttachedToWindow();
        if (!this.f5202t || (i7 = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.f5207y == null) {
            InterfaceC0821a interfaceC0821a = this.f5203u;
            this.f5207y = i7 >= 34 ? F.j.l(L0.a(interfaceC0821a, this.f5204v, this.f5205w)) : G0.a(interfaceC0821a);
        }
        G0.b(this, this.f5207y);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            G0.c(this, this.f5207y);
        }
        this.f5207y = null;
    }
}
