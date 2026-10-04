package i1;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: i1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1062o {
    public static S a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        S sB = S.b(null, rootWindowInsets);
        P p7 = sB.a;
        p7.q(sB);
        p7.d(view.getRootView());
        return sB;
    }
}
