package z0;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e4.InterfaceC0821a;
import f0.AbstractC0851d;
import f0.C0849b;
import f0.InterfaceC0854g;
import h0.AbstractC0968M;
import q0.C1844a;

/* renamed from: z0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2464q extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18828l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2471u f18829m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2464q(C2471u c2471u, int i7) {
        super(1);
        this.f18828l = i7;
        this.f18829m = c2471u;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        C0849b c0849b;
        switch (this.f18828l) {
            case 0:
                KeyEvent keyEvent = ((q0.b) obj).a;
                C2471u c2471u = this.f18829m;
                c2471u.getClass();
                long jB = q0.c.B(keyEvent);
                if (C1844a.a(jB, C1844a.f14664h)) {
                    c0849b = new C0849b(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (C1844a.a(jB, C1844a.f14662f)) {
                    c0849b = new C0849b(4);
                } else if (C1844a.a(jB, C1844a.f14661e)) {
                    c0849b = new C0849b(3);
                } else {
                    c0849b = C1844a.a(jB, C1844a.f14659c) ? true : C1844a.a(jB, C1844a.f14667k) ? new C0849b(5) : C1844a.a(jB, C1844a.f14660d) ? true : C1844a.a(jB, C1844a.f14668l) ? new C0849b(6) : C1844a.a(jB, C1844a.f14663g) ? true : C1844a.a(jB, C1844a.f14665i) ? true : C1844a.a(jB, C1844a.f14669m) ? new C0849b(7) : C1844a.a(jB, C1844a.f14658b) ? true : C1844a.a(jB, C1844a.f14666j) ? new C0849b(8) : null;
                }
                if (c0849b != null) {
                    if (q0.c.D(keyEvent) == 2) {
                        g0.d dVarT = c2471u.t();
                        InterfaceC0854g focusOwner = c2471u.getFocusOwner();
                        C2462p c2462p = new C2462p(c0849b, 1);
                        int i7 = c0849b.a;
                        Boolean boolC = ((androidx.compose.ui.focus.b) focusOwner).c(i7, dVarT, c2462p);
                        if (boolC != null ? boolC.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i7 == 1 || i7 == 2)) {
                            return Boolean.FALSE;
                        }
                        Integer numI = AbstractC0851d.I(i7);
                        if (numI == null) {
                            throw new IllegalStateException("Invalid focus direction");
                        }
                        int iIntValue = numI.intValue();
                        Rect rectU = dVarT != null ? AbstractC0968M.u(dVarT) : null;
                        if (rectU == null) {
                            throw new IllegalStateException("Invalid rect");
                        }
                        View viewFindNextFocus = c2471u;
                        while (true) {
                            if (viewFindNextFocus != null) {
                                FocusFinder focusFinder = FocusFinder.getInstance();
                                View rootView = c2471u.getRootView();
                                kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.ViewGroup", rootView);
                                viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, iIntValue);
                                if (viewFindNextFocus != null) {
                                    if (!viewFindNextFocus.equals(c2471u)) {
                                        for (ViewParent parent = viewFindNextFocus.getParent(); parent != null; parent = parent.getParent()) {
                                            if (parent == c2471u) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                viewFindNextFocus = null;
                            }
                        }
                        if (kotlin.jvm.internal.l.a(viewFindNextFocus, c2471u)) {
                            viewFindNextFocus = null;
                        }
                        if (viewFindNextFocus != null && AbstractC0851d.D(viewFindNextFocus, Integer.valueOf(iIntValue), rectU)) {
                            return Boolean.TRUE;
                        }
                        if (!((androidx.compose.ui.focus.b) c2471u.getFocusOwner()).a(i7, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean boolC2 = ((androidx.compose.ui.focus.b) c2471u.getFocusOwner()).c(i7, null, new C2462p(c0849b, 0));
                        return Boolean.valueOf(boolC2 != null ? boolC2.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            case 1:
                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) obj;
                C2471u c2471u2 = this.f18829m;
                Handler handler = c2471u2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC0821a.invoke();
                } else {
                    Handler handler2 = c2471u2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new X0.t(interfaceC0821a, 1));
                    }
                }
                return O3.C.a;
            default:
                C2471u c2471u3 = this.f18829m;
                return new W(c2471u3, c2471u3.getTextInputService(), (H5.A) obj);
        }
    }
}
