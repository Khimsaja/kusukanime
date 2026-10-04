package K4;

import A4.z;
import L4.q;
import O3.f;
import P3.y;
import e4.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.l;
import m5.C1516e;
import m5.C1517f;
import m5.C1518g;
import m5.C1523l;
import u4.InterfaceC2091G;

/* loaded from: classes.dex */
public final class d implements InterfaceC2091G {
    public final A2.b a;

    /* renamed from: b, reason: collision with root package name */
    public final C1516e f4729b;

    public d(a aVar) {
        this.a = new A2.b(aVar, b.f4724l, new f(null));
        C1523l c1523l = aVar.a;
        c1523l.getClass();
        this.f4729b = new C1516e(c1523l, new ConcurrentHashMap(3, 1.0f, 2), new C1517f(), 0);
    }

    @Override // u4.InterfaceC2091G
    public final boolean a(W4.c cVar) {
        l.f("fqName", cVar);
        ((a) this.a.f110l).f4700b.getClass();
        return false;
    }

    @Override // u4.InterfaceC2091G
    public final void b(W4.c cVar, ArrayList arrayList) {
        l.f("fqName", cVar);
        arrayList.add(c(cVar));
    }

    public final q c(W4.c cVar) throws Throwable {
        ((a) this.a.f110l).f4700b.getClass();
        l.f("fqName", cVar);
        A3.q qVar = new A3.q(5, this, new z(cVar));
        C1516e c1516e = this.f4729b;
        c1516e.getClass();
        Object objInvoke = c1516e.invoke(new C1518g(cVar, qVar));
        if (objInvoke != null) {
            return (q) objInvoke;
        }
        C1516e.a(3);
        throw null;
    }

    @Override // u4.InterfaceC2091G
    public final Collection h(W4.c cVar, k kVar) {
        l.f("fqName", cVar);
        List list = (List) c(cVar).f6127u.invoke();
        return list == null ? y.f7779k : list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((a) this.a.f110l).f4713o;
    }
}
