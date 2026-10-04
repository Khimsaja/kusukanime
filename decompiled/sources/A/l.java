package A;

import O3.C;
import android.graphics.Rect;
import android.view.View;
import e4.InterfaceC0821a;
import y0.AbstractC2359f;
import y0.InterfaceC2366m;
import y0.Y;

/* loaded from: classes.dex */
public final class l implements a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2366m f34k;

    public l(InterfaceC2366m interfaceC2366m) {
        this.f34k = interfaceC2366m;
    }

    @Override // A.a
    public final Object C(Y y7, InterfaceC0821a interfaceC0821a, U3.c cVar) {
        View viewX = AbstractC2359f.x(this.f34k);
        long jS = y7.S(0L);
        g0.d dVar = (g0.d) interfaceC0821a.invoke();
        g0.d dVarH = dVar != null ? dVar.h(jS) : null;
        if (dVarH != null) {
            viewX.requestRectangleOnScreen(new Rect((int) dVarH.a, (int) dVarH.f11659b, (int) dVarH.f11660c, (int) dVarH.f11661d), false);
        }
        return C.a;
    }
}
