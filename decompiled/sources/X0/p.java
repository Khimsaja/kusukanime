package X0;

import D.S;
import O.C0486d;
import O.C0493g0;
import O.C0509o0;
import O.C0510p;
import O.T;
import android.content.Context;
import android.view.View;
import android.view.Window;
import z0.AbstractC2432a;

/* loaded from: classes.dex */
public final class p extends AbstractC2432a implements r {

    /* renamed from: s, reason: collision with root package name */
    public final Window f9727s;

    /* renamed from: t, reason: collision with root package name */
    public final C0493g0 f9728t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9729u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9730v;

    public p(Context context, Window window) {
        super(context);
        this.f9727s = window;
        this.f9728t = C0486d.K(n.a, T.f7049p);
    }

    @Override // X0.r
    public final Window a() {
        return this.f9727s;
    }

    @Override // z0.AbstractC2432a
    public final void b(int i7, C0510p c0510p) {
        c0510p.T(1735448596);
        if ((((c0510p.h(this) ? 4 : 2) | i7) & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            ((e4.n) this.f9728t.getValue()).invoke(c0510p, 0);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new S(i7, 12, this);
        }
    }

    @Override // z0.AbstractC2432a
    public final void g(boolean z7, int i7, int i8, int i9, int i10) {
        View childAt;
        super.g(z7, i7, i8, i9, i10);
        if (this.f9729u || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f9727s.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // z0.AbstractC2432a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f9730v;
    }

    @Override // z0.AbstractC2432a
    public final void h(int i7, int i8) {
        if (this.f9729u) {
            super.h(i7, i8);
            return;
        }
        super.h(View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }
}
