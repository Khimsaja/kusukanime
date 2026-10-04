package s4;

import P3.A;
import P3.q;
import e5.AbstractC0832b;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k5.C1399c;
import m5.C1523l;
import u4.InterfaceC2099e;
import w4.InterfaceC2213c;
import x4.C2255A;
import x4.C2297x;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2015a implements InterfaceC2213c {
    public final C1523l a;

    /* renamed from: b, reason: collision with root package name */
    public final C2255A f15817b;

    public C2015a(C1523l c1523l, C2255A c2255a) {
        kotlin.jvm.internal.l.f("module", c2255a);
        this.a = c1523l;
        this.f15817b = c2255a;
    }

    @Override // w4.InterfaceC2213c
    public final Collection a(W4.c cVar) {
        kotlin.jvm.internal.l.f("packageFqName", cVar);
        return A.f7737k;
    }

    @Override // w4.InterfaceC2213c
    public final InterfaceC2099e b(W4.b bVar) {
        kotlin.jvm.internal.l.f("classId", bVar);
        if (bVar.f9617c || bVar.g()) {
            return null;
        }
        String str = bVar.f9616b.a.a;
        if (!AbstractC2510o.W(str, "Function", false)) {
            return null;
        }
        m mVar = m.f15836b;
        W4.c cVar = bVar.a;
        l lVarA = mVar.a(cVar, str);
        if (lVarA == null) {
            return null;
        }
        List list = (List) AbstractC0832b.u(((C2297x) this.f15817b.F(cVar)).f17512o, C2297x.f17509r[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C1399c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (q.t0(arrayList2) != null) {
            throw new ClassCastException();
        }
        return new c(this.a, (C1399c) q.r0(arrayList), lVarA.a, lVarA.f15835b);
    }

    @Override // w4.InterfaceC2213c
    public final boolean c(W4.c cVar, W4.e eVar) {
        kotlin.jvm.internal.l.f("packageFqName", cVar);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        String strB = eVar.b();
        kotlin.jvm.internal.l.e("asString(...)", strB);
        return (AbstractC2517v.T(strB, "Function", false) || AbstractC2517v.T(strB, "KFunction", false) || AbstractC2517v.T(strB, "SuspendFunction", false) || AbstractC2517v.T(strB, "KSuspendFunction", false)) && m.f15836b.a(cVar, strB) != null;
    }
}
