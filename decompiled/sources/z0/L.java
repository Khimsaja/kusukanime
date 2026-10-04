package z0;

import android.view.PointerIcon;
import android.view.View;
import io.ktor.client.utils.CIOKt;
import s0.C1956a;
import s0.InterfaceC1969n;

/* loaded from: classes.dex */
public final class L {
    public static final L a = new L();

    public final void a(View view, InterfaceC1969n interfaceC1969n) {
        PointerIcon systemIcon = interfaceC1969n instanceof C1956a ? PointerIcon.getSystemIcon(view.getContext(), ((C1956a) interfaceC1969n).f15440b) : PointerIcon.getSystemIcon(view.getContext(), CIOKt.DEFAULT_HTTP_POOL_SIZE);
        if (kotlin.jvm.internal.l.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
