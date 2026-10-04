package z0;

import java.util.List;
import m.AbstractC1490k;
import m.C1496q;
import m.C1497r;

/* loaded from: classes.dex */
public final class L0 {
    public final F0.i a;

    /* renamed from: b, reason: collision with root package name */
    public final C1497r f18642b;

    public L0(F0.n nVar, C1496q c1496q) {
        this.a = nVar.f2104d;
        int[] iArr = AbstractC1490k.a;
        this.f18642b = new C1497r();
        List listH = F0.n.h(nVar, 4);
        int size = listH.size();
        for (int i7 = 0; i7 < size; i7++) {
            F0.n nVar2 = (F0.n) listH.get(i7);
            if (c1496q.b(nVar2.f2107g)) {
                this.f18642b.a(nVar2.f2107g);
            }
        }
    }
}
