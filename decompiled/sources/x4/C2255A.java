package x4;

import io.ktor.http.ContentType;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import m5.C1516e;
import m5.C1523l;
import r4.AbstractC1880i;
import r4.C1883l;
import u4.AbstractC2115v;
import u4.C2114u;
import u4.InterfaceC2091G;
import u4.InterfaceC2092H;
import u4.InterfaceC2105k;
import u4.InterfaceC2118y;
import v4.C2159g;

/* renamed from: x4.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2255A extends AbstractC2287n implements InterfaceC2118y {

    /* renamed from: m, reason: collision with root package name */
    public final C1523l f17338m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC1880i f17339n;

    /* renamed from: o, reason: collision with root package name */
    public final Map f17340o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC2260F f17341p;

    /* renamed from: q, reason: collision with root package name */
    public T4.i f17342q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC2091G f17343r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f17344s;

    /* renamed from: t, reason: collision with root package name */
    public final C1516e f17345t;

    /* renamed from: u, reason: collision with root package name */
    public final O3.q f17346u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2255A(W4.e eVar, C1523l c1523l, AbstractC1880i abstractC1880i, int i7) {
        super(C2159g.a, eVar);
        P3.z zVar = P3.z.f7780k;
        kotlin.jvm.internal.l.f("moduleName", eVar);
        this.f17338m = c1523l;
        this.f17339n = abstractC1880i;
        if (!eVar.f9625l) {
            throw new IllegalArgumentException("Module name must be special: " + eVar);
        }
        this.f17340o = zVar;
        InterfaceC2260F.a.getClass();
        InterfaceC2260F interfaceC2260F = (InterfaceC2260F) o0(C2258D.f17356b);
        this.f17341p = interfaceC2260F == null ? C2259E.f17357b : interfaceC2260F;
        this.f17344s = true;
        this.f17345t = c1523l.b(new A4.j(26, this));
        this.f17346u = z1.c.C(new C1883l(this, 2));
    }

    @Override // u4.InterfaceC2118y
    public final InterfaceC2092H F(W4.c cVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        M0();
        return (InterfaceC2092H) this.f17345t.invoke(cVar);
    }

    public final void M0() {
        if (this.f17344s) {
            return;
        }
        if (o0(AbstractC2115v.a) != null) {
            throw new ClassCastException();
        }
        String str = "Accessing invalid module descriptor " + this;
        kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
        throw new C2114u(str);
    }

    @Override // u4.InterfaceC2118y
    public final List P() {
        if (this.f17342q != null) {
            return P3.y.f7779k;
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().f9624k;
        kotlin.jvm.internal.l.e("toString(...)", str);
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    @Override // u4.InterfaceC2118y
    public final AbstractC1880i d() {
        return this.f17339n;
    }

    @Override // u4.InterfaceC2118y
    public final Collection h(W4.c cVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        M0();
        M0();
        return ((C2286m) this.f17346u.getValue()).h(cVar, kVar);
    }

    @Override // u4.InterfaceC2105k
    public final /* bridge */ InterfaceC2105k k() {
        return null;
    }

    @Override // u4.InterfaceC2118y
    public final Object o0(F2.G g4) {
        kotlin.jvm.internal.l.f("capability", g4);
        Object obj = this.f17340o.get(g4);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u4.InterfaceC2118y
    public final boolean r(InterfaceC2118y interfaceC2118y) {
        kotlin.jvm.internal.l.f("targetModule", interfaceC2118y);
        if (equals(interfaceC2118y)) {
            return true;
        }
        kotlin.jvm.internal.l.c(this.f17342q);
        if (P3.q.m0(P3.A.f7737k, interfaceC2118y)) {
            return true;
        }
        P();
        if (interfaceC2118y instanceof Void) {
        }
        return interfaceC2118y.P().contains(this);
    }

    @Override // x4.AbstractC2287n
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC2287n.L0(this));
        if (!this.f17344s) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        InterfaceC2091G interfaceC2091G = this.f17343r;
        sb.append(interfaceC2091G != null ? interfaceC2091G.getClass().getSimpleName() : null);
        return sb.toString();
    }

    @Override // u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        switch (yVar.f9915k) {
            case 1:
                ((Y4.h) yVar.f9916l).M(this, (StringBuilder) obj, true);
                return O3.C.a;
            default:
                return null;
        }
    }
}
