package z0;

import O.C0486d;
import O.C0493g0;
import O.C0509o0;
import O.C0510p;
import com.kusukanime.MainActivity;

/* renamed from: z0.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2453k0 extends AbstractC2432a {

    /* renamed from: s, reason: collision with root package name */
    public final C0493g0 f18780s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18781t;

    public C2453k0(MainActivity mainActivity) {
        super(mainActivity);
        this.f18780s = C0486d.K(null, O.T.f7049p);
    }

    @Override // z0.AbstractC2432a
    public final void b(int i7, C0510p c0510p) {
        c0510p.T(420213850);
        if ((((c0510p.h(this) ? 4 : 2) | i7) & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            e4.n nVar = (e4.n) this.f18780s.getValue();
            if (nVar == null) {
                c0510p.R(358373017);
            } else {
                c0510p.R(150107752);
                nVar.invoke(c0510p, 0);
            }
            c0510p.p(false);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new D.S(i7, 27, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C2453k0.class.getName();
    }

    @Override // z0.AbstractC2432a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f18781t;
    }

    public final void setContent(e4.n nVar) {
        this.f18781t = true;
        this.f18780s.setValue(nVar);
        if (isAttachedToWindow()) {
            d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
