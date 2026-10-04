package x4;

import e4.InterfaceC0821a;
import f6.AbstractC0905c;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: x4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2280g implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17425k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f17426l;

    public /* synthetic */ C2280g(int i7, Object obj) {
        this.f17425k = i7;
        this.f17426l = obj;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f17425k) {
            case 0:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                A3.q qVar = (A3.q) this.f17426l;
                sb.append(((W4.e) qVar.f180m).b());
                return AbstractC0905c.g(sb.toString(), ((AbstractC2282i) qVar.f179l).getUpperBounds());
            case 1:
                C2290q c2290q = (C2290q) this.f17426l;
                c2290q.getClass();
                HashSet hashSet = new HashSet();
                for (W4.e eVar : (Set) c2290q.f17453e.f17456s.invoke()) {
                    C4.c cVar = C4.c.f964p;
                    hashSet.addAll(c2290q.f(eVar, cVar));
                    hashSet.addAll(c2290q.a(eVar, cVar));
                }
                return hashSet;
            case 2:
                return (List) this.f17426l;
            default:
                return (List) ((C2271Q) this.f17426l).f17407v.getValue();
        }
    }
}
