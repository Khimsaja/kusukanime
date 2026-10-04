package G2;

import D.C0042b;
import K5.Y;
import java.util.List;
import java.util.ListIterator;
import s3.T;

/* loaded from: classes.dex */
public abstract class O {
    public C0178o a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2681b;

    public abstract y a();

    public final C0178o b() {
        C0178o c0178o = this.a;
        if (c0178o != null) {
            return c0178o;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, H h7) {
        y5.e eVar = new y5.e(new y5.f(y5.k.U(P3.q.l0(list), new C0042b(this, h7)), false, new T(16)));
        while (eVar.hasNext()) {
            b().f((C0174k) eVar.next());
        }
    }

    public void e(C0174k c0174k, boolean z7) {
        kotlin.jvm.internal.l.f("popUpTo", c0174k);
        List list = (List) ((Y) b().f2723e.f4751k).getValue();
        if (!list.contains(c0174k)) {
            throw new IllegalStateException(("popBackStack was called with " + c0174k + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C0174k c0174k2 = null;
        while (f()) {
            c0174k2 = (C0174k) listIterator.previous();
            if (kotlin.jvm.internal.l.a(c0174k2, c0174k)) {
                break;
            }
        }
        if (c0174k2 != null) {
            b().c(c0174k2, z7);
        }
    }

    public boolean f() {
        return true;
    }

    public y c(y yVar) {
        return yVar;
    }
}
