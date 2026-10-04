package y5;

import B3.q;
import P3.p;
import P3.r;
import P3.y;
import e4.InterfaceC0821a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import s3.T;
import v.c0;

/* loaded from: classes.dex */
public abstract class k extends l {
    public static h N(Iterator it) {
        kotlin.jvm.internal.l.f("<this>", it);
        return new C2418a(new p(3, it));
    }

    public static int O(h hVar) {
        Iterator it = hVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            it.next();
            i7++;
            if (i7 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i7;
    }

    public static h P(h hVar, int i7) {
        if (i7 >= 0) {
            return i7 == 0 ? hVar : hVar instanceof c ? ((c) hVar).b(i7) : new C2419b(hVar, i7, 0);
        }
        throw new IllegalArgumentException(c0.a(i7, "Requested element count ", " is less than zero.").toString());
    }

    public static final g Q(h hVar) {
        T t7 = new T(14);
        if (!(hVar instanceof o)) {
            return new g(hVar, new T(15), t7);
        }
        o oVar = (o) hVar;
        return new g(oVar.a, oVar.f18392b, t7);
    }

    public static h R(InterfaceC0821a interfaceC0821a) {
        return new C2418a(new Z3.h(interfaceC0821a, new io.ktor.util.collections.a(interfaceC0821a, 2)));
    }

    public static h S(e4.k kVar, Object obj) {
        kotlin.jvm.internal.l.f("nextFunction", kVar);
        return obj == null ? d.a : new Z3.h(new q(18, obj), kVar);
    }

    public static Object T(h hVar) {
        kotlin.jvm.internal.l.f("<this>", hVar);
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static o U(h hVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("<this>", hVar);
        kotlin.jvm.internal.l.f("transform", kVar);
        return new o(hVar, kVar);
    }

    public static f V(h hVar, e4.k kVar) {
        return new f(new o(hVar, kVar), false, new T(16));
    }

    public static List W(h hVar) {
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return y.f7779k;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return r.H(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
