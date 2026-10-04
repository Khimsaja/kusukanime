package H2;

import G2.C0174k;
import G2.C0178o;
import G2.H;
import G2.N;
import G2.O;
import K5.I;
import K5.Y;
import O.C0486d;
import O.C0493g0;
import O.T;
import P3.J;
import androidx.lifecycle.EnumC0689p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@N("composable")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LH2/i;", "LG2/O;", "LH2/h;", "<init>", "()V", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i extends O {

    /* renamed from: c, reason: collision with root package name */
    public final C0493g0 f3614c = C0486d.K(Boolean.FALSE, T.f7049p);

    @Override // G2.O
    public final G2.y a() {
        return new h(this, c.a);
    }

    @Override // G2.O
    public final void d(List list, H h7) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0174k c0174k = (C0174k) it.next();
            C0178o c0178oB = b();
            kotlin.jvm.internal.l.f("backStackEntry", c0174k);
            Y y7 = c0178oB.f2721c;
            Iterable iterable = (Iterable) y7.getValue();
            boolean z7 = iterable instanceof Collection;
            I i7 = c0178oB.f2723e;
            if (!z7 || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((C0174k) it2.next()) == c0174k) {
                        Iterable iterable2 = (Iterable) ((Y) i7.f4751k).getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((C0174k) it3.next()) == c0174k) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            C0174k c0174k2 = (C0174k) P3.q.B0((List) ((Y) i7.f4751k).getValue());
            if (c0174k2 != null) {
                y7.i(null, J.U((Set) y7.getValue(), c0174k2));
            }
            y7.i(null, J.U((Set) y7.getValue(), c0174k));
            c0178oB.f(c0174k);
        }
        this.f3614c.setValue(Boolean.FALSE);
    }

    @Override // G2.O
    public final void e(C0174k c0174k, boolean z7) {
        b().e(c0174k, z7);
        this.f3614c.setValue(Boolean.TRUE);
    }

    public final void g(C0174k c0174k) {
        C0178o c0178oB = b();
        kotlin.jvm.internal.l.f("entry", c0174k);
        Y y7 = c0178oB.f2721c;
        y7.i(null, J.U((Set) y7.getValue(), c0174k));
        if (!c0178oB.f2726h.f2638g.contains(c0174k)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        c0174k.h(EnumC0689p.f10739n);
    }
}
