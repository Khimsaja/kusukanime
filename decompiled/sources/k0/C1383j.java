package k0;

import android.graphics.Outline;
import h0.C0987j;
import h0.InterfaceC0967L;

/* renamed from: k0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1383j {
    public static final C1383j a = new C1383j();

    public final void a(Outline outline, InterfaceC0967L interfaceC0967L) {
        if (!(interfaceC0967L instanceof C0987j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C0987j) interfaceC0967L).a);
    }
}
