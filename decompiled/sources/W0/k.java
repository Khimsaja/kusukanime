package W0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import f0.AbstractC0851d;
import f0.C0866s;
import f0.InterfaceC0854g;
import y0.AbstractC2359f;
import y0.C2349D;
import y0.C2372t;

/* loaded from: classes.dex */
public abstract class k {
    public static final j a = new j();

    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(InterfaceC0854g interfaceC0854g, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        C0866s c0866sG = AbstractC0851d.g(((androidx.compose.ui.focus.b) interfaceC0854g).f10654f);
        g0.d dVarJ = c0866sG != null ? AbstractC0851d.j(c0866sG) : null;
        if (dVarJ == null) {
            return null;
        }
        int i7 = (int) dVarJ.a;
        int i8 = iArr[0];
        int i9 = iArr2[0];
        int i10 = (int) dVarJ.f11659b;
        int i11 = iArr[1];
        int i12 = iArr2[1];
        return new Rect((i7 + i8) - i9, (i10 + i11) - i12, (((int) dVarJ.f11660c) + i8) - i9, (((int) dVarJ.f11661d) + i11) - i12);
    }

    public static final View c(a0.p pVar) {
        q qVar = AbstractC2359f.v(pVar.f10402k).f17680t;
        View interopView = qVar != null ? qVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final void d(q qVar, C2349D c2349d) {
        long jS = ((C2372t) c2349d.f17660G.f7173c).S(0L);
        int iRound = Math.round(g0.c.d(jS));
        int iRound2 = Math.round(g0.c.e(jS));
        qVar.layout(iRound, iRound2, qVar.getMeasuredWidth() + iRound, qVar.getMeasuredHeight() + iRound2);
    }
}
