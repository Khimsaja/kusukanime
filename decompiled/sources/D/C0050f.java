package D;

import O.C0502l;
import O.C0510p;

/* renamed from: D.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050f extends kotlin.jvm.internal.m implements e4.o {

    /* renamed from: l, reason: collision with root package name */
    public static final C0050f f1140l = new C0050f(3);

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a0.q qVar = (a0.q) obj;
        C0510p c0510p = (C0510p) obj2;
        ((Number) obj3).intValue();
        c0510p.R(-2126899193);
        long j7 = ((H.a0) c0510p.k(H.b0.a)).a;
        a0.n nVar = a0.n.a;
        boolean zE = c0510p.e(j7);
        Object objH = c0510p.H();
        if (zE || objH == C0502l.a) {
            objH = new C0048e(j7, 0);
            c0510p.b0(objH);
        }
        a0.q qVarK = qVar.k(androidx.compose.ui.draw.a.b(nVar, (e4.k) objH));
        c0510p.p(false);
        return qVarK;
    }
}
