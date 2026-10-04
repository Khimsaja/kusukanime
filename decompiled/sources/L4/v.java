package L4;

import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import m5.C1519h;
import m5.C1521j;
import m5.C1523l;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;

/* loaded from: classes.dex */
public final class v extends D {

    /* renamed from: n, reason: collision with root package name */
    public final A4.z f6133n;

    /* renamed from: o, reason: collision with root package name */
    public final q f6134o;

    /* renamed from: p, reason: collision with root package name */
    public final C1519h f6135p;

    /* renamed from: q, reason: collision with root package name */
    public final C1521j f6136q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(A2.b bVar, A4.z zVar, q qVar) {
        super(bVar, null);
        kotlin.jvm.internal.l.f("ownerDescriptor", qVar);
        this.f6133n = zVar;
        this.f6134o = qVar;
        C1523l c1523l = ((K4.a) bVar.f110l).a;
        A3.q qVar2 = new A3.q(6, bVar, this);
        c1523l.getClass();
        this.f6135p = new C1519h(c1523l, qVar2);
        this.f6136q = c1523l.c(new l(2, this, bVar));
    }

    @Override // L4.z, g5.p, g5.o
    public final Collection a(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return P3.y.f7779k;
    }

    @Override // g5.p, g5.q
    public final InterfaceC2102h b(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        return v(eVar, null);
    }

    @Override // L4.z, g5.p, g5.q
    public final Collection e(g5.f fVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        if (!fVar.a(g5.f.f11735l | g5.f.f11728e)) {
            return P3.y.f7779k;
        }
        Iterable iterable = (Iterable) this.f6147d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC2105k interfaceC2105k = (InterfaceC2105k) obj;
            if (interfaceC2105k instanceof InterfaceC2099e) {
                W4.e name = ((InterfaceC2099e) interfaceC2105k).getName();
                kotlin.jvm.internal.l.e("getName(...)", name);
                if (((Boolean) kVar.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // L4.z
    public final Set h(g5.f fVar, g5.l lVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        if (!fVar.a(g5.f.f11728e)) {
            return P3.A.f7737k;
        }
        Set set = (Set) this.f6135p.invoke();
        if (set == null) {
            this.f6133n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(W4.e.e((String) it.next()));
        }
        return hashSet;
    }

    @Override // L4.z
    public final Set i(g5.f fVar, g5.l lVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        return P3.A.f7737k;
    }

    @Override // L4.z
    public final InterfaceC0440c k() {
        return C0439b.a;
    }

    @Override // L4.z
    public final void m(LinkedHashSet linkedHashSet, W4.e eVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
    }

    @Override // L4.z
    public final Set o(g5.f fVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        return P3.A.f7737k;
    }

    @Override // L4.z
    public final InterfaceC2105k q() {
        return this.f6134o;
    }

    public final InterfaceC2099e v(W4.e eVar, A4.p pVar) {
        W4.e eVar2 = W4.g.a;
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        String strB = eVar.b();
        kotlin.jvm.internal.l.e("asString(...)", strB);
        if (strB.length() <= 0 || eVar.f9625l) {
            return null;
        }
        Set set = (Set) this.f6135p.invoke();
        if (pVar != null || set == null || set.contains(eVar.b())) {
            return (InterfaceC2099e) this.f6136q.invoke(new r(eVar, pVar));
        }
        return null;
    }
}
