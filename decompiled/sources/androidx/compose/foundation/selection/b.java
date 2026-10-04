package androidx.compose.foundation.selection;

import F0.f;
import a0.n;
import a0.q;
import androidx.compose.foundation.d;
import e4.InterfaceC0821a;
import q.M;
import q.S;
import u.k;

/* loaded from: classes.dex */
public abstract class b {
    public static final q a(q qVar, boolean z7, k kVar, M m7, boolean z8, f fVar, InterfaceC0821a interfaceC0821a) {
        q qVarK;
        if (m7 instanceof S) {
            qVarK = new SelectableElement(z7, kVar, (S) m7, z8, fVar, interfaceC0821a);
        } else if (m7 == null) {
            qVarK = new SelectableElement(z7, kVar, null, z8, fVar, interfaceC0821a);
        } else {
            n nVar = n.a;
            qVarK = kVar != null ? d.a(nVar, kVar, m7).k(new SelectableElement(z7, kVar, null, z8, fVar, interfaceC0821a)) : a0.a.a(nVar, new a(m7, z7, z8, fVar, interfaceC0821a));
        }
        return qVar.k(qVarK);
    }

    public static final q b(q qVar, boolean z7, k kVar, M m7, f fVar, e4.k kVar2) {
        q qVarK;
        if (m7 instanceof S) {
            qVarK = new ToggleableElement(z7, kVar, (S) m7, fVar, kVar2);
        } else if (m7 == null) {
            qVarK = new ToggleableElement(z7, kVar, null, fVar, kVar2);
        } else {
            n nVar = n.a;
            qVarK = kVar != null ? d.a(nVar, kVar, m7).k(new ToggleableElement(z7, kVar, null, fVar, kVar2)) : a0.a.a(nVar, new c(m7, z7, fVar, kVar2));
        }
        return qVar.k(qVarK);
    }
}
