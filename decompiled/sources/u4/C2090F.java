package u4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import x4.AbstractC2257C;

/* renamed from: u4.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2090F implements InterfaceC2091G {
    public final ArrayList a;

    public C2090F(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // u4.InterfaceC2091G
    public final boolean a(W4.c cVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l.a(((AbstractC2257C) ((InterfaceC2088D) it.next())).f17354o, cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // u4.InterfaceC2091G
    public final void b(W4.c cVar, ArrayList arrayList) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        for (Object obj : this.a) {
            if (kotlin.jvm.internal.l.a(((AbstractC2257C) ((InterfaceC2088D) obj)).f17354o, cVar)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // u4.InterfaceC2091G
    public final Collection h(W4.c cVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        return y5.k.W(new y5.f(y5.k.U(P3.q.l0(this.a), C2110p.f16334m), true, new C2089E(cVar, 0)));
    }
}
