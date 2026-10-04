package g5;

import H4.u;
import io.ktor.http.ContentDisposition;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import l4.AbstractC1420H;
import n5.T;
import n5.V;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;
import u4.O;

/* loaded from: classes.dex */
public final class t implements o {

    /* renamed from: b, reason: collision with root package name */
    public final o f11767b;

    /* renamed from: c, reason: collision with root package name */
    public final V f11768c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f11769d;

    /* renamed from: e, reason: collision with root package name */
    public final O3.q f11770e;

    public t(o oVar, V v5) {
        kotlin.jvm.internal.l.f("workerScope", oVar);
        kotlin.jvm.internal.l.f("givenSubstitutor", v5);
        this.f11767b = oVar;
        z1.c.C(new u(8, v5));
        T tF = v5.f();
        kotlin.jvm.internal.l.e("getSubstitution(...)", tF);
        this.f11768c = new V(AbstractC1420H.R(tF));
        this.f11770e = z1.c.C(new u(9, this));
    }

    @Override // g5.o
    public final Collection a(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return h(this.f11767b.a(eVar, cVar));
    }

    @Override // g5.q
    public final InterfaceC2102h b(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        InterfaceC2102h interfaceC2102hB = this.f11767b.b(eVar, aVar);
        if (interfaceC2102hB != null) {
            return (InterfaceC2102h) i(interfaceC2102hB);
        }
        return null;
    }

    @Override // g5.o
    public final Set c() {
        return this.f11767b.c();
    }

    @Override // g5.o
    public final Set d() {
        return this.f11767b.d();
    }

    @Override // g5.q
    public final Collection e(f fVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        return (Collection) this.f11770e.getValue();
    }

    @Override // g5.o
    public final Collection f(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return h(this.f11767b.f(eVar, aVar));
    }

    @Override // g5.o
    public final Set g() {
        return this.f11767b.g();
    }

    public final Collection h(Collection collection) {
        if (this.f11768c.a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((InterfaceC2105k) it.next()));
        }
        return linkedHashSet;
    }

    public final InterfaceC2105k i(InterfaceC2105k interfaceC2105k) {
        V v5 = this.f11768c;
        if (v5.a.e()) {
            return interfaceC2105k;
        }
        if (this.f11769d == null) {
            this.f11769d = new HashMap();
        }
        HashMap map = this.f11769d;
        kotlin.jvm.internal.l.c(map);
        Object objB = map.get(interfaceC2105k);
        if (objB == null) {
            if (!(interfaceC2105k instanceof O)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC2105k).toString());
            }
            objB = ((O) interfaceC2105k).b(v5);
            if (objB == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC2105k + " substitution fails");
            }
            map.put(interfaceC2105k, objB);
        }
        return (InterfaceC2105k) objB;
    }
}
