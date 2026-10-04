package s4;

import O3.C;
import P3.q;
import P3.r;
import P3.y;
import g5.n;
import g5.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k5.C1399c;
import m5.C1523l;
import n5.b0;
import o5.C1706f;
import p.I0;
import r4.AbstractC1887p;
import u4.AbstractC2108n;
import u4.EnumC2100f;
import u4.EnumC2117x;
import u4.InterfaceC2105k;
import u4.M;
import u4.S;
import v4.C2159g;
import x4.AbstractC2275b;
import x4.C2270P;
import x4.C2283j;

/* loaded from: classes.dex */
public final class c extends AbstractC2275b {

    /* renamed from: v, reason: collision with root package name */
    public static final W4.b f15819v = new W4.b(AbstractC1887p.f15028k, W4.e.e("Function"));

    /* renamed from: w, reason: collision with root package name */
    public static final W4.b f15820w = new W4.b(AbstractC1887p.f15026i, W4.e.e("KFunction"));

    /* renamed from: o, reason: collision with root package name */
    public final C1523l f15821o;

    /* renamed from: p, reason: collision with root package name */
    public final C1399c f15822p;

    /* renamed from: q, reason: collision with root package name */
    public final k f15823q;

    /* renamed from: r, reason: collision with root package name */
    public final int f15824r;

    /* renamed from: s, reason: collision with root package name */
    public final C2016b f15825s;

    /* renamed from: t, reason: collision with root package name */
    public final e f15826t;

    /* renamed from: u, reason: collision with root package name */
    public final List f15827u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C1523l c1523l, C1399c c1399c, k kVar, int i7) {
        super(c1523l, kVar.a(i7));
        kotlin.jvm.internal.l.f("containingDeclaration", c1399c);
        this.f15821o = c1523l;
        this.f15822p = c1399c;
        this.f15823q = kVar;
        this.f15824r = i7;
        this.f15825s = new C2016b(this);
        this.f15826t = new e(c1523l, this);
        ArrayList arrayList = new ArrayList();
        k4.g gVar = new k4.g(1, i7, 1);
        ArrayList arrayList2 = new ArrayList(r.p(gVar, 10));
        k4.f it = gVar.iterator();
        while (it.f12677m) {
            int iA = it.a();
            arrayList.add(C2270P.Q0(this, b0.f13391n, W4.e.e("P" + iA), arrayList.size(), this.f15821o));
            arrayList2.add(C.a);
        }
        arrayList.add(C2270P.Q0(this, b0.f13392o, W4.e.e("R"), arrayList.size(), this.f15821o));
        this.f15827u = q.S0(arrayList);
        I0 i02 = d.f15828k;
        k kVar2 = this.f15823q;
        i02.getClass();
        kotlin.jvm.internal.l.f("functionTypeKind", kVar2);
        if (kVar2.equals(g.f15830c) || kVar2.equals(j.f15833c) || kVar2.equals(h.f15831c)) {
            return;
        }
        kVar2.equals(i.f15832c);
    }

    @Override // u4.InterfaceC2099e
    public final boolean E() {
        return false;
    }

    @Override // u4.InterfaceC2116w
    public final boolean Q() {
        return false;
    }

    @Override // u4.InterfaceC2099e
    public final S Z() {
        return null;
    }

    @Override // u4.InterfaceC2099e
    public final /* bridge */ /* synthetic */ C2283j b0() {
        return null;
    }

    @Override // u4.InterfaceC2099e
    public final EnumC2100f c() {
        return EnumC2100f.f16312l;
    }

    @Override // u4.InterfaceC2099e
    public final /* bridge */ /* synthetic */ o c0() {
        return n.f11759b;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w
    public final EnumC2117x e() {
        return EnumC2117x.f16345o;
    }

    @Override // v4.InterfaceC2153a
    public final v4.h getAnnotations() {
        return C2159g.a;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w, u4.InterfaceC2107m
    public final H4.o getVisibility() {
        H4.o oVar = AbstractC2108n.f16322e;
        kotlin.jvm.internal.l.e("PUBLIC", oVar);
        return oVar;
    }

    @Override // u4.InterfaceC2099e
    public final boolean i() {
        return false;
    }

    @Override // u4.InterfaceC2116w
    public final boolean i0() {
        return false;
    }

    @Override // u4.InterfaceC2116w
    public final boolean isExternal() {
        return false;
    }

    @Override // u4.InterfaceC2099e
    public final boolean isInline() {
        return false;
    }

    @Override // u4.InterfaceC2103i
    public final boolean j() {
        return false;
    }

    @Override // u4.InterfaceC2105k
    public final InterfaceC2105k k() {
        return this.f15822p;
    }

    @Override // u4.InterfaceC2106l
    public final M l() {
        return M.f16295i;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2103i
    public final List n() {
        return this.f15827u;
    }

    @Override // u4.InterfaceC2099e
    public final boolean p0() {
        return false;
    }

    @Override // x4.AbstractC2299z
    public final o q(C1706f c1706f) {
        return this.f15826t;
    }

    public final String toString() {
        String strB = getName().b();
        kotlin.jvm.internal.l.e("asString(...)", strB);
        return strB;
    }

    @Override // u4.InterfaceC2102h
    public final n5.M v() {
        return this.f15825s;
    }

    @Override // u4.InterfaceC2099e
    public final boolean x() {
        return false;
    }

    @Override // u4.InterfaceC2099e
    public final /* bridge */ /* synthetic */ Collection y() {
        return y.f7779k;
    }
}
