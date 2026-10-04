package H2;

import G2.C0174k;
import G2.H;
import G2.N;
import G2.O;
import K5.Y;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@N("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LH2/p;", "LG2/O;", "LH2/o;", "<init>", "()V", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p extends O {
    @Override // G2.O
    public final G2.y a() {
        W.a aVar = e.a;
        return new o(this);
    }

    @Override // G2.O
    public final void d(List list, H h7) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((C0174k) it.next());
        }
    }

    @Override // G2.O
    public final void e(C0174k c0174k, boolean z7) {
        b().e(c0174k, z7);
        int iV0 = P3.q.v0((Iterable) ((Y) b().f2724f.f4751k).getValue(), c0174k);
        int i7 = 0;
        for (Object obj : (Iterable) ((Y) b().f2724f.f4751k).getValue()) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                P3.r.X();
                throw null;
            }
            C0174k c0174k2 = (C0174k) obj;
            if (i7 > iV0) {
                b().b(c0174k2);
            }
            i7 = i8;
        }
    }
}
