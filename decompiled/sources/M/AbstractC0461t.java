package M;

import L.H2;
import O.C0486d;
import O.C0507n0;
import O.C0509o0;
import O.C0510p;
import O.C0525y;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import h0.C0998u;

/* renamed from: M.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0461t {
    public static final H0.w a = new H0.w(null, new H0.u());

    public static final void a(long j7, H0.I i7, e4.n nVar, C0510p c0510p, int i8) {
        int i9;
        c0510p.T(-716124955);
        if ((i8 & 6) == 0) {
            i9 = (c0510p.e(j7) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= c0510p.f(i7) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= c0510p.h(nVar) ? 256 : 128;
        }
        if ((i9 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            C0525y c0525y = H2.a;
            C0486d.b(new C0507n0[]{L.X.a.a(new C0998u(j7)), c0525y.a(((H0.I) c0510p.k(c0525y)).d(i7))}, nVar, c0510p, ((i9 >> 3) & 112) | 8);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new I(j7, i7, nVar, i8, 0);
        }
    }

    public static final String b(int i7, C0510p c0510p) {
        c0510p.k(AndroidCompositionLocals_androidKt.a);
        return ((Context) c0510p.k(AndroidCompositionLocals_androidKt.f10669b)).getResources().getString(i7);
    }
}
