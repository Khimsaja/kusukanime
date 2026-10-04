package androidx.compose.foundation;

import F0.f;
import a0.n;
import a0.q;
import e4.InterfaceC0821a;
import h0.AbstractC0968M;
import h0.C0961F;
import h0.InterfaceC0973S;
import q.M;
import q.S;
import u.k;

/* loaded from: classes.dex */
public abstract class a {
    public static q a(q qVar, C0961F c0961f) {
        return qVar.k(new BackgroundElement(0L, c0961f, AbstractC0968M.a, 1));
    }

    public static final q b(q qVar, long j7, InterfaceC0973S interfaceC0973S) {
        return qVar.k(new BackgroundElement(j7, null, interfaceC0973S, 2));
    }

    public static final q c(q qVar, k kVar, M m7, boolean z7, String str, f fVar, InterfaceC0821a interfaceC0821a) {
        q qVarK;
        if (m7 instanceof S) {
            qVarK = new ClickableElement(kVar, (S) m7, z7, str, fVar, interfaceC0821a);
        } else if (m7 == null) {
            qVarK = new ClickableElement(kVar, null, z7, str, fVar, interfaceC0821a);
        } else {
            n nVar = n.a;
            qVarK = kVar != null ? d.a(nVar, kVar, m7).k(new ClickableElement(kVar, null, z7, str, fVar, interfaceC0821a)) : a0.a.a(nVar, new b(m7, z7, str, fVar, interfaceC0821a));
        }
        return qVar.k(qVarK);
    }

    public static /* synthetic */ q d(q qVar, k kVar, M m7, boolean z7, f fVar, InterfaceC0821a interfaceC0821a, int i7) {
        if ((i7 & 16) != 0) {
            fVar = null;
        }
        return c(qVar, kVar, m7, z7, null, fVar, interfaceC0821a);
    }

    public static q e(q qVar, boolean z7, String str, InterfaceC0821a interfaceC0821a, int i7) {
        if ((i7 & 1) != 0) {
            z7 = true;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        return a0.a.a(qVar, new B.c(z7, str, interfaceC0821a, 3));
    }
}
