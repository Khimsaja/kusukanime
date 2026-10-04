package F5;

import f4.InterfaceC0884d;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends a implements InterfaceC0884d {

    /* renamed from: n, reason: collision with root package name */
    public final i f2506n;

    /* renamed from: o, reason: collision with root package name */
    public Object f2507o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, Object obj, Object obj2) {
        super(0, obj, obj2);
        kotlin.jvm.internal.l.f("parentIterator", iVar);
        this.f2506n = iVar;
        this.f2507o = obj2;
    }

    @Override // F5.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f2507o;
    }

    @Override // F5.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f2507o;
        this.f2507o = obj;
        g gVar = (g) this.f2506n.f2533l;
        f fVar = gVar.f2526o;
        Object obj3 = this.f2504l;
        if (!fVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z7 = gVar.f2518m;
        if (!z7) {
            fVar.put(obj3, obj);
        } else {
            if (!z7) {
                throw new NoSuchElementException();
            }
            q qVar = ((q[]) gVar.f2519n)[gVar.f2517l];
            Object obj4 = qVar.f2548l[qVar.f2550n];
            fVar.put(obj3, obj);
            gVar.h(obj4 != null ? obj4.hashCode() : 0, fVar.f2522m, obj4, 0, 0, false);
        }
        gVar.f2529r = fVar.f2524o;
        return obj2;
    }
}
