package androidx.compose.ui.graphics;

import a0.q;
import e4.k;
import h0.AbstractC0959D;
import h0.AbstractC0968M;
import h0.C0976V;
import h0.InterfaceC0973S;

/* loaded from: classes.dex */
public abstract class a {
    public static final q a(q qVar, k kVar) {
        return qVar.k(new BlockGraphicsLayerElement(kVar));
    }

    public static q b(q qVar, float f5, float f7, InterfaceC0973S interfaceC0973S, boolean z7, int i7) {
        if ((i7 & 4) != 0) {
            f5 = 1.0f;
        }
        float f8 = f5;
        if ((i7 & 32) != 0) {
            f7 = 0.0f;
        }
        float f9 = f7;
        long j7 = C0976V.f11815b;
        InterfaceC0973S interfaceC0973S2 = (i7 & 2048) != 0 ? AbstractC0968M.a : interfaceC0973S;
        boolean z8 = (i7 & 4096) != 0 ? false : z7;
        long j8 = AbstractC0959D.a;
        return qVar.k(new GraphicsLayerElement(f8, f9, j7, interfaceC0973S2, z8, j8, j8));
    }
}
