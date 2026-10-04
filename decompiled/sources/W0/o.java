package W0;

import D.x0;
import D6.r;
import H.N;
import android.view.View;
import android.view.ViewTreeObserver;
import f0.AbstractC0851d;
import f0.C0866s;
import f0.InterfaceC0854g;
import f0.InterfaceC0857j;
import f0.InterfaceC0860m;
import f6.AbstractC0905c;
import y0.AbstractC2359f;
import y0.AbstractC2367n;
import y0.e0;
import z0.C2471u;

/* loaded from: classes.dex */
public final class o extends a0.p implements InterfaceC0860m, ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener {

    /* renamed from: x, reason: collision with root package name */
    public View f9580x;

    public final C0866s G0() {
        a0.p pVar = this.f10402k;
        if (!pVar.f10414w) {
            AbstractC0905c.C("visitLocalDescendants called on an unattached node");
            throw null;
        }
        if ((pVar.f10405n & 1024) != 0) {
            boolean z7 = false;
            for (a0.p pVar2 = pVar.f10407p; pVar2 != null; pVar2 = pVar2.f10407p) {
                if ((pVar2.f10404m & 1024) != 0) {
                    a0.p pVarF = pVar2;
                    Q.d dVar = null;
                    while (pVarF != null) {
                        if (pVarF instanceof C0866s) {
                            C0866s c0866s = (C0866s) pVarF;
                            if (z7) {
                                return c0866s;
                            }
                            z7 = true;
                        } else if ((pVarF.f10404m & 1024) != 0 && (pVarF instanceof AbstractC2367n)) {
                            int i7 = 0;
                            for (a0.p pVar3 = ((AbstractC2367n) pVarF).f17880y; pVar3 != null; pVar3 = pVar3.f10407p) {
                                if ((pVar3.f10404m & 1024) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        pVarF = pVar3;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new Q.d(new a0.p[16]);
                                        }
                                        if (pVarF != null) {
                                            dVar.b(pVarF);
                                            pVarF = null;
                                        }
                                        dVar.b(pVar3);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        pVarF = AbstractC2359f.f(dVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // f0.InterfaceC0860m
    public final void Q(InterfaceC0857j interfaceC0857j) {
        interfaceC0857j.b(false);
        interfaceC0857j.c(new x0(1, this, o.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0, 4));
        interfaceC0857j.d(new x0(1, this, o.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0, 5));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (AbstractC2359f.v(this).f17679s == null) {
            return;
        }
        View viewC = k.c(this);
        InterfaceC0854g focusOwner = ((C2471u) AbstractC2359f.w(this)).getFocusOwner();
        e0 e0VarW = AbstractC2359f.w(this);
        boolean z7 = (view == null || view.equals(e0VarW) || !k.a(viewC, view)) ? false : true;
        boolean z8 = (view2 == null || view2.equals(e0VarW) || !k.a(viewC, view2)) ? false : true;
        if (z7 && z8) {
            this.f9580x = view2;
            return;
        }
        if (!z8) {
            if (!z7) {
                this.f9580x = null;
                return;
            }
            this.f9580x = null;
            if (G0().H0().a()) {
                ((androidx.compose.ui.focus.b) focusOwner).a(8, false, false);
                return;
            }
            return;
        }
        this.f9580x = view2;
        C0866s c0866sG0 = G0();
        int iOrdinal = c0866sG0.H0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal != 3) {
            throw new r();
        }
        N n7 = ((androidx.compose.ui.focus.b) focusOwner).f10656h;
        try {
            if (n7.f2900b) {
                N.b(n7);
            }
            n7.f2900b = true;
            AbstractC0851d.x(c0866sG0);
            N.c(n7);
        } catch (Throwable th) {
            N.c(n7);
            throw th;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    @Override // a0.p
    public final void y0() {
        k.c(this).addOnAttachStateChangeListener(this);
    }

    @Override // a0.p
    public final void z0() {
        k.c(this).removeOnAttachStateChangeListener(this);
        this.f9580x = null;
    }
}
