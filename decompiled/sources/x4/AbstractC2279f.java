package x4;

import io.ktor.sse.ServerSentEventKt;
import java.util.List;
import l5.C1467t;
import m5.C1523l;
import n5.Y;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;
import u4.InterfaceC2106l;

/* renamed from: x4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2279f extends AbstractC2288o implements u4.P {

    /* renamed from: o, reason: collision with root package name */
    public final C1523l f17421o;

    /* renamed from: p, reason: collision with root package name */
    public final H4.o f17422p;

    /* renamed from: q, reason: collision with root package name */
    public List f17423q;

    /* renamed from: r, reason: collision with root package name */
    public final C2278e f17424r;

    static {
        kotlin.jvm.internal.y.a.h(new kotlin.jvm.internal.r(AbstractC2279f.class, "constructors", "getConstructors()Ljava/util/Collection;", 0));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC2279f(C1523l c1523l, InterfaceC2105k interfaceC2105k, v4.h hVar, W4.e eVar, H4.o oVar) {
        u4.N n7 = u4.M.f16295i;
        kotlin.jvm.internal.l.f("storageManager", c1523l);
        kotlin.jvm.internal.l.f("containingDeclaration", interfaceC2105k);
        kotlin.jvm.internal.l.f("visibilityImpl", oVar);
        super(interfaceC2105k, hVar, eVar, n7);
        this.f17421o = c1523l;
        this.f17422p = oVar;
        c1523l.a(new H4.u(29, this));
        this.f17424r = new C2278e(this);
    }

    @Override // u4.InterfaceC2116w
    public final boolean Q() {
        return false;
    }

    @Override // x4.AbstractC2288o, x4.AbstractC2287n, u4.InterfaceC2105k
    public final InterfaceC2102h a() {
        return this;
    }

    @Override // u4.InterfaceC2116w, u4.InterfaceC2107m
    public final H4.o getVisibility() {
        return this.f17422p;
    }

    @Override // u4.InterfaceC2116w
    public final boolean i0() {
        return false;
    }

    @Override // u4.InterfaceC2116w
    public final boolean isExternal() {
        return false;
    }

    @Override // u4.InterfaceC2103i
    public final boolean j() {
        return Y.c(((C1467t) this).P0(), new A4.j(25, this), null);
    }

    @Override // u4.InterfaceC2103i
    public final List n() {
        List list = this.f17423q;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.l.l("declaredTypeParametersImpl");
        throw null;
    }

    @Override // x4.AbstractC2287n
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        switch (yVar.f9915k) {
            case 1:
                StringBuilder sb = (StringBuilder) obj;
                Y4.h hVar = (Y4.h) yVar.f9916l;
                hVar.getClass();
                hVar.v(sb, this, null);
                H4.o oVar = this.f17422p;
                kotlin.jvm.internal.l.e("getVisibility(...)", oVar);
                hVar.d0(oVar, sb);
                hVar.H(this, sb);
                sb.append(hVar.F("typealias"));
                sb.append(ServerSentEventKt.SPACE);
                hVar.M(this, sb, true);
                hVar.Z(sb, n(), false);
                hVar.x(this, sb);
                sb.append(" = ");
                sb.append(hVar.U(((C1467t) this).P0()));
                return O3.C.a;
            default:
                return null;
        }
    }

    @Override // u4.InterfaceC2102h
    public final n5.M v() {
        return this.f17424r;
    }

    @Override // x4.AbstractC2288o, x4.AbstractC2287n, u4.InterfaceC2105k
    public final InterfaceC2105k a() {
        return this;
    }

    @Override // x4.AbstractC2288o
    /* renamed from: M0 */
    public final InterfaceC2106l a() {
        return this;
    }
}
