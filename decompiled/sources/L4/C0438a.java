package L4;

import P3.F;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: L4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0438a implements InterfaceC0440c {
    public final A4.p a;

    /* renamed from: b, reason: collision with root package name */
    public final e4.k f6055b;

    /* renamed from: c, reason: collision with root package name */
    public final A4.j f6056c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f6057d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f6058e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f6059f;

    public C0438a(A4.p pVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("jClass", pVar);
        this.a = pVar;
        this.f6055b = kVar;
        A4.j jVar = new A4.j(7, this);
        this.f6056c = jVar;
        y5.f fVar = new y5.f(P3.q.l0(pVar.d()), true, jVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        y5.e eVar = new y5.e(fVar);
        while (eVar.hasNext()) {
            Object next = eVar.next();
            W4.e eVarC = ((A4.y) next).c();
            Object arrayList = linkedHashMap.get(eVarC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(eVarC, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f6057d = linkedHashMap;
        y5.f fVar2 = new y5.f(P3.q.l0(this.a.b()), true, this.f6055b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        y5.e eVar2 = new y5.e(fVar2);
        while (eVar2.hasNext()) {
            Object next2 = eVar2.next();
            linkedHashMap2.put(((A4.v) next2).c(), next2);
        }
        this.f6058e = linkedHashMap2;
        ArrayList arrayListF = this.a.f();
        e4.k kVar2 = this.f6055b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListF.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            if (((Boolean) kVar2.invoke(next3)).booleanValue()) {
                arrayList2.add(next3);
            }
        }
        int I = F.I(P3.r.p(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(I < 16 ? 16 : I);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next4 = it2.next();
            linkedHashMap3.put(((A4.B) next4).c(), next4);
        }
        this.f6059f = linkedHashMap3;
    }

    @Override // L4.InterfaceC0440c
    public final Set a() {
        y5.f fVar = new y5.f(P3.q.l0(this.a.d()), true, this.f6056c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        y5.e eVar = new y5.e(fVar);
        while (eVar.hasNext()) {
            linkedHashSet.add(((A4.y) eVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override // L4.InterfaceC0440c
    public final Set b() {
        return this.f6059f.keySet();
    }

    @Override // L4.InterfaceC0440c
    public final Collection c(W4.e eVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        List list = (List) this.f6057d.get(eVar);
        return list != null ? list : P3.y.f7779k;
    }

    @Override // L4.InterfaceC0440c
    public final A4.v d(W4.e eVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return (A4.v) this.f6058e.get(eVar);
    }

    @Override // L4.InterfaceC0440c
    public final Set e() {
        y5.f fVar = new y5.f(P3.q.l0(this.a.b()), true, this.f6055b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        y5.e eVar = new y5.e(fVar);
        while (eVar.hasNext()) {
            linkedHashSet.add(((A4.v) eVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override // L4.InterfaceC0440c
    public final A4.B f(W4.e eVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return (A4.B) this.f6059f.get(eVar);
    }
}
