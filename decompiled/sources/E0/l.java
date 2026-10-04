package E0;

import B1.t;
import F0.n;
import F0.o;
import H5.D;
import M1.u;
import O.C0486d;
import O.C0493g0;
import O.T;
import P3.F;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureTarget;
import android.view.View;
import h0.AbstractC0968M;
import java.util.function.Consumer;
import w0.X;
import y0.Y;

/* loaded from: classes.dex */
public final class l {
    public final C0493g0 a = C0486d.K(Boolean.FALSE, T.f7049p);

    public final void a(View view, o oVar, S3.h hVar, Consumer<ScrollCaptureTarget> consumer) {
        Q.d dVar = new Q.d(new m[16]);
        n6.m.Y(oVar.a(), 0, new k(1, dVar, Q.d.class, "add", "add(Ljava/lang/Object;)Z", 8, 0));
        dVar.p(new u(1, new e4.k[]{d.f1808n, d.f1809o}));
        m mVar = (m) (dVar.k() ? null : dVar.f7827k[dVar.f7829m - 1]);
        if (mVar == null) {
            return;
        }
        M5.c cVarC = D.c(hVar);
        n nVar = mVar.a;
        T0.i iVar = mVar.f1828c;
        f fVar = new f(nVar, iVar, cVarC, this);
        Y y7 = mVar.f1829d;
        g0.d dVarK = X.f(y7).K(y7, true);
        long jB = F.b(iVar.a, iVar.f8841b);
        ScrollCaptureTarget scrollCaptureTargetK = t.k(view, new Rect(Math.round(dVarK.a), Math.round(dVarK.f11659b), Math.round(dVarK.f11660c), Math.round(dVarK.f11661d)), new Point((int) (jB >> 32), (int) (jB & 4294967295L)), fVar);
        scrollCaptureTargetK.setScrollBounds(AbstractC0968M.t(iVar));
        consumer.accept(scrollCaptureTargetK);
    }
}
