package L4;

import e5.C0831a;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r4.AbstractC1887p;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;
import u4.K;

/* loaded from: classes.dex */
public final class C extends D {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f6050p = 0;

    /* renamed from: n, reason: collision with root package name */
    public final A4.p f6051n;

    /* renamed from: o, reason: collision with root package name */
    public final i f6052o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(A2.b bVar, A4.p pVar, i iVar) {
        super(bVar, null);
        kotlin.jvm.internal.l.f("jClass", pVar);
        this.f6051n = pVar;
        this.f6052o = iVar;
    }

    public static K v(K k7) {
        if (k7.c() != 2) {
            return k7;
        }
        Collection collectionM = k7.m();
        kotlin.jvm.internal.l.e("getOverriddenDescriptors(...)", collectionM);
        Collection<K> collection = collectionM;
        ArrayList arrayList = new ArrayList(P3.r.p(collection, 10));
        for (K k8 : collection) {
            kotlin.jvm.internal.l.c(k8);
            arrayList.add(v(k8));
        }
        return (K) P3.q.K0(P3.q.n0(arrayList));
    }

    @Override // g5.p, g5.q
    public final InterfaceC2102h b(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        return null;
    }

    @Override // L4.z
    public final Set h(g5.f fVar, g5.l lVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        return P3.A.f7737k;
    }

    @Override // L4.z
    public final Set i(g5.f fVar, g5.l lVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        Set setW0 = P3.q.W0(((InterfaceC0440c) this.f6148e.invoke()).a());
        i iVar = this.f6052o;
        C cY = android.support.v4.media.session.b.y(iVar);
        Set setC = cY != null ? cY.c() : null;
        if (setC == null) {
            setC = P3.A.f7737k;
        }
        setW0.addAll(setC);
        if (this.f6051n.a.isEnum()) {
            setW0.addAll(P3.r.I(AbstractC1887p.f15020c, AbstractC1887p.a));
        }
        A2.b bVar = this.f6145b;
        ((C0831a) ((K4.a) bVar.f110l).f4722x).getClass();
        kotlin.jvm.internal.l.f("thisDescriptor", iVar);
        kotlin.jvm.internal.l.f("c", bVar);
        setW0.addAll(new ArrayList());
        return setW0;
    }

    @Override // L4.z
    public final void j(W4.e eVar, ArrayList arrayList) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        A2.b bVar = this.f6145b;
        C0831a c0831a = (C0831a) ((K4.a) bVar.f110l).f4722x;
        i iVar = this.f6052o;
        c0831a.getClass();
        kotlin.jvm.internal.l.f("thisDescriptor", iVar);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("c", bVar);
    }

    @Override // L4.z
    public final InterfaceC0440c k() {
        return new C0438a(this.f6051n, m.f6105n);
    }

    @Override // L4.z
    public final void m(LinkedHashSet linkedHashSet, W4.e eVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        i iVar = this.f6052o;
        C cY = android.support.v4.media.session.b.y(iVar);
        Collection collectionX0 = cY == null ? P3.A.f7737k : P3.q.X0(cY.f(eVar, C4.c.f963o));
        K4.a aVar = (K4.a) this.f6145b.f110l;
        linkedHashSet.addAll(n6.d.a0(eVar, collectionX0, linkedHashSet, this.f6052o, aVar.f4704f, aVar.f4719u.f13812d));
        if (this.f6051n.a.isEnum()) {
            if (eVar.equals(AbstractC1887p.f15020c)) {
                linkedHashSet.add(Z4.l.i(iVar));
            } else if (eVar.equals(AbstractC1887p.a)) {
                linkedHashSet.add(Z4.l.j(iVar));
            }
        }
    }

    @Override // L4.D, L4.z
    public final void n(W4.e eVar, ArrayList arrayList) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        A4.j jVar = new A4.j(9, eVar);
        i iVar = this.f6052o;
        w5.k.e(P3.r.H(iVar), A.a, new B(iVar, linkedHashSet, jVar));
        boolean zIsEmpty = arrayList.isEmpty();
        A2.b bVar = this.f6145b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                K kV = v((K) obj);
                Object arrayList2 = linkedHashMap.get(kV);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(kV, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                K4.a aVar = (K4.a) bVar.f110l;
                P3.v.e0(arrayList3, n6.d.a0(eVar, collection, arrayList, this.f6052o, aVar.f4704f, aVar.f4719u.f13812d));
            }
            arrayList.addAll(arrayList3);
        } else {
            K4.a aVar2 = (K4.a) bVar.f110l;
            arrayList.addAll(n6.d.a0(eVar, linkedHashSet, arrayList, this.f6052o, aVar2.f4704f, aVar2.f4719u.f13812d));
        }
        if (this.f6051n.a.isEnum() && eVar.equals(AbstractC1887p.f15019b)) {
            w5.k.a(arrayList, Z4.l.h(iVar));
        }
    }

    @Override // L4.z
    public final Set o(g5.f fVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        Set setW0 = P3.q.W0(((InterfaceC0440c) this.f6148e.invoke()).e());
        m mVar = m.f6106o;
        i iVar = this.f6052o;
        w5.k.e(P3.r.H(iVar), A.a, new B(iVar, setW0, mVar));
        if (this.f6051n.a.isEnum()) {
            setW0.add(AbstractC1887p.f15019b);
        }
        return setW0;
    }

    @Override // L4.z
    public final InterfaceC2105k q() {
        return this.f6052o;
    }
}
