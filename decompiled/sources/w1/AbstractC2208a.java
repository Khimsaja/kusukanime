package w1;

import O.C0510p;
import O.C0525y;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.J;
import androidx.lifecycle.W;
import io.ktor.http.c;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2208a {
    public static final C0525y a = new C0525y(new c(18));

    public static W a(C0510p c0510p) {
        W w7 = (W) c0510p.k(a);
        if (w7 != null) {
            c0510p.R(1260196493);
            c0510p.p(false);
            return w7;
        }
        c0510p.R(1260197609);
        W wF = J.f((View) c0510p.k(AndroidCompositionLocals_androidKt.f10673f));
        c0510p.p(false);
        return wF;
    }
}
