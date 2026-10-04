package androidx.compose.ui.layout;

import a0.q;
import e4.k;
import e4.o;
import w0.C2200s;
import w0.InterfaceC2172G;

/* loaded from: classes.dex */
public abstract class a {
    public static final Object a(InterfaceC2172G interfaceC2172G) {
        Object objH = interfaceC2172G.h();
        C2200s c2200s = objH instanceof C2200s ? (C2200s) objH : null;
        if (c2200s != null) {
            return c2200s.f16877x;
        }
        return null;
    }

    public static final q b(q qVar, o oVar) {
        return qVar.k(new LayoutElement(oVar));
    }

    public static final q c(q qVar, String str) {
        return qVar.k(new LayoutIdElement(str));
    }

    public static final q d(q qVar, k kVar) {
        return qVar.k(new OnGloballyPositionedElement(kVar));
    }

    public static final q e(q qVar, k kVar) {
        return qVar.k(new OnSizeChangedModifier(kVar));
    }
}
