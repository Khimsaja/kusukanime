package o;

import O.C0502l;
import O.C0510p;
import android.view.ViewConfiguration;
import p.C1772x;
import z0.AbstractC2455l0;

/* renamed from: o.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1601M {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final C1772x a(C0510p c0510p) {
        T0.b bVar = (T0.b) c0510p.k(AbstractC2455l0.f18787f);
        boolean zC = c0510p.c(bVar.a());
        Object objH = c0510p.H();
        if (zC || objH == C0502l.a) {
            objH = new C1772x(new X4.y(bVar));
            c0510p.b0(objH);
        }
        return (C1772x) objH;
    }
}
