package T;

import F5.n;
import F5.o;
import P3.AbstractC0565f;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public class b extends AbstractC0565f {

    /* renamed from: m, reason: collision with root package name */
    public static final b f8817m = new b(h.f8828e, 0);

    /* renamed from: k, reason: collision with root package name */
    public final h f8818k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8819l;

    public b(h hVar, int i7) {
        this.f8818k = hVar;
        this.f8819l = i7;
    }

    @Override // P3.AbstractC0565f
    public final Set a() {
        return new f(this, 0);
    }

    @Override // P3.AbstractC0565f
    public final Set b() {
        return new f(this, 1);
    }

    @Override // P3.AbstractC0565f
    public final int c() {
        return this.f8819l;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f8818k.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // P3.AbstractC0565f
    public final Collection e() {
        return new n(1, this);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f8818k.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final b h(Object obj, U.a aVar) {
        o oVarU = this.f8818k.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        if (oVarU == null) {
            return this;
        }
        return new b((h) oVarU.f2542m, this.f8819l + oVarU.f2541l);
    }
}
