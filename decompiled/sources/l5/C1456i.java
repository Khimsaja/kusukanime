package l5;

import D.x0;
import P3.F;
import R4.C0580k;
import R4.D;
import R4.EnumC0579j;
import R4.U;
import R4.a0;
import R4.h0;
import R4.i0;
import e5.AbstractC0832b;
import f1.AbstractC0870c;
import f1.AbstractC0871d;
import h5.C1012a;
import io.ktor.util.GzipHeaderFlags;
import j5.C1354i;
import j5.C1355j;
import j5.C1356k;
import j5.C1366u;
import j5.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l4.AbstractC1420H;
import m5.C1519h;
import m5.C1520i;
import m5.C1523l;
import n5.B;
import o5.C1706f;
import o5.C1712l;
import u4.EnumC2100f;
import u4.EnumC2117x;
import u4.InterfaceC2105k;
import u4.K;
import u4.L;
import u4.M;
import u4.N;
import u4.S;
import v4.C2159g;
import x4.AbstractC2275b;
import x4.C2283j;
import x4.C2295v;

/* renamed from: l5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1456i extends AbstractC2275b implements InterfaceC2105k {

    /* renamed from: A, reason: collision with root package name */
    public final InterfaceC2105k f12779A;

    /* renamed from: B, reason: collision with root package name */
    public final C1519h f12780B;

    /* renamed from: C, reason: collision with root package name */
    public final C1520i f12781C;

    /* renamed from: D, reason: collision with root package name */
    public final C1519h f12782D;

    /* renamed from: E, reason: collision with root package name */
    public final C1366u f12783E;

    /* renamed from: F, reason: collision with root package name */
    public final v4.h f12784F;

    /* renamed from: o, reason: collision with root package name */
    public final C0580k f12785o;

    /* renamed from: p, reason: collision with root package name */
    public final T4.a f12786p;

    /* renamed from: q, reason: collision with root package name */
    public final M f12787q;

    /* renamed from: r, reason: collision with root package name */
    public final W4.b f12788r;

    /* renamed from: s, reason: collision with root package name */
    public final EnumC2117x f12789s;

    /* renamed from: t, reason: collision with root package name */
    public final H4.o f12790t;

    /* renamed from: u, reason: collision with root package name */
    public final EnumC2100f f12791u;

    /* renamed from: v, reason: collision with root package name */
    public final C1356k f12792v;

    /* renamed from: w, reason: collision with root package name */
    public final g5.p f12793w;

    /* renamed from: x, reason: collision with root package name */
    public final L4.h f12794x;

    /* renamed from: y, reason: collision with root package name */
    public final L f12795y;

    /* renamed from: z, reason: collision with root package name */
    public final A2.b f12796z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1456i(C1356k c1356k, C0580k c0580k, T4.g gVar, T4.a aVar, M m7) {
        EnumC2100f enumC2100f;
        g5.p sVar;
        super(c1356k.a.a, AbstractC0870c.R(gVar, c0580k.f8546o).f());
        kotlin.jvm.internal.l.f("outerContext", c1356k);
        kotlin.jvm.internal.l.f("classProto", c0580k);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        kotlin.jvm.internal.l.f("sourceElement", m7);
        this.f12785o = c0580k;
        this.f12786p = aVar;
        this.f12787q = m7;
        this.f12788r = AbstractC0870c.R(gVar, c0580k.f8546o);
        this.f12789s = C1355j.f((D) T4.e.f9085e.c(c0580k.f8545n));
        this.f12790t = AbstractC0871d.O((i0) T4.e.f9084d.c(c0580k.f8545n));
        EnumC0579j enumC0579j = (EnumC0579j) T4.e.f9086f.c(c0580k.f8545n);
        switch (enumC0579j == null ? -1 : x.f12480b[enumC0579j.ordinal()]) {
            case 1:
                enumC2100f = EnumC2100f.f16311k;
                break;
            case 2:
                enumC2100f = EnumC2100f.f16312l;
                break;
            case 3:
                enumC2100f = EnumC2100f.f16313m;
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                enumC2100f = EnumC2100f.f16314n;
                break;
            case 5:
                enumC2100f = EnumC2100f.f16315o;
                break;
            case 6:
            case 7:
                enumC2100f = EnumC2100f.f16316p;
                break;
            default:
                enumC2100f = EnumC2100f.f16311k;
                break;
        }
        EnumC2100f enumC2100f2 = enumC2100f;
        this.f12791u = enumC2100f2;
        List list = c0580k.f8548q;
        kotlin.jvm.internal.l.e("getTypeParameterList(...)", list);
        a0 a0Var = c0580k.f8537K;
        kotlin.jvm.internal.l.e("getTypeTable(...)", a0Var);
        T4.i iVar = new T4.i(a0Var);
        T4.k kVar = T4.k.f9115b;
        h0 h0Var = c0580k.f8539M;
        kotlin.jvm.internal.l.e("getVersionRequirementTable(...)", h0Var);
        C1356k c1356kA = c1356k.a(this, list, gVar, iVar, AbstractC1420H.q(h0Var), aVar);
        this.f12792v = c1356kA;
        boolean zBooleanValue = T4.e.f9093m.c(c0580k.f8545n).booleanValue();
        EnumC2100f enumC2100f3 = EnumC2100f.f16313m;
        C1354i c1354i = c1356kA.a;
        if (enumC2100f2 == enumC2100f3) {
            sVar = new g5.s(c1354i.a, this, zBooleanValue || kotlin.jvm.internal.l.a(c1354i.f12431s.d(), Boolean.TRUE));
        } else {
            sVar = g5.n.f11759b;
        }
        this.f12793w = sVar;
        this.f12794x = new L4.h(this);
        N n7 = L.f16291d;
        C1523l c1523l = c1354i.a;
        ((C1712l) c1354i.f12429q).getClass();
        x0 x0Var = new x0(1, this, C1455h.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0, 9);
        n7.getClass();
        kotlin.jvm.internal.l.f("storageManager", c1523l);
        this.f12795y = new L(this, c1523l, x0Var);
        this.f12796z = enumC2100f2 == enumC2100f3 ? new A2.b(this) : null;
        InterfaceC2105k interfaceC2105k = c1356k.f12440c;
        this.f12779A = interfaceC2105k;
        C1523l c1523l2 = c1354i.a;
        C1451d c1451d = new C1451d(this, 0);
        c1523l2.getClass();
        this.f12780B = new C1519h(c1523l2, c1451d);
        this.f12781C = new C1520i(c1523l2, new C1451d(this, 1));
        new C1519h(c1523l2, new C1451d(this, 2));
        c1523l2.a(new C1451d(this, 3));
        this.f12782D = new C1519h(c1523l2, new C1451d(this, 4));
        C1456i c1456i = interfaceC2105k instanceof C1456i ? (C1456i) interfaceC2105k : null;
        this.f12783E = new C1366u(c0580k, c1356kA.f12439b, c1356kA.f12441d, m7, c1456i != null ? c1456i.f12783E : null);
        this.f12784F = !T4.e.f9083c.c(c0580k.f8545n).booleanValue() ? C2159g.a : new C1469v(c1523l2, new C1451d(this, 5));
    }

    @Override // u4.InterfaceC2099e
    public final boolean E() {
        return T4.e.f9092l.c(this.f12785o.f8545n).booleanValue();
    }

    @Override // u4.InterfaceC2116w
    public final boolean Q() {
        return T4.e.f9090j.c(this.f12785o.f8545n).booleanValue();
    }

    @Override // u4.InterfaceC2099e
    public final S Z() {
        return (S) this.f12782D.invoke();
    }

    @Override // u4.InterfaceC2099e
    public final C2283j b0() {
        return (C2283j) this.f12780B.invoke();
    }

    @Override // u4.InterfaceC2099e
    public final EnumC2100f c() {
        return this.f12791u;
    }

    @Override // u4.InterfaceC2099e
    public final g5.o c0() {
        return this.f12793w;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w
    public final EnumC2117x e() {
        return this.f12789s;
    }

    @Override // v4.InterfaceC2153a
    public final v4.h getAnnotations() {
        return this.f12784F;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w, u4.InterfaceC2107m
    public final H4.o getVisibility() {
        return this.f12790t;
    }

    @Override // u4.InterfaceC2099e
    public final boolean i() {
        return T4.e.f9091k.c(this.f12785o.f8545n).booleanValue() && this.f12786p.a(1, 4, 2);
    }

    @Override // u4.InterfaceC2116w
    public final boolean i0() {
        return false;
    }

    @Override // u4.InterfaceC2116w
    public final boolean isExternal() {
        return T4.e.f9089i.c(this.f12785o.f8545n).booleanValue();
    }

    @Override // u4.InterfaceC2099e
    public final boolean isInline() {
        if (!T4.e.f9091k.c(this.f12785o.f8545n).booleanValue()) {
            return false;
        }
        T4.a aVar = this.f12786p;
        int i7 = aVar.f9062b;
        if (i7 >= 1) {
            if (i7 > 1) {
                return false;
            }
            int i8 = aVar.f9063c;
            if (i8 >= 4 && (i8 > 4 || aVar.f9064d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // u4.InterfaceC2103i
    public final boolean j() {
        return T4.e.f9087g.c(this.f12785o.f8545n).booleanValue();
    }

    @Override // u4.InterfaceC2105k
    public final InterfaceC2105k k() {
        return this.f12779A;
    }

    @Override // u4.InterfaceC2106l
    public final M l() {
        return this.f12787q;
    }

    @Override // x4.AbstractC2275b, u4.InterfaceC2099e
    public final List l0() {
        C1356k c1356k = this.f12792v;
        List listL = F.l(this.f12785o, c1356k.f12441d);
        ArrayList arrayList = new ArrayList(P3.r.p(listL, 10));
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2295v(r0(), new C1012a(this, c1356k.f12445h.g((U) it.next()), (W4.e) null), C2159g.a));
        }
        return arrayList;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2103i
    public final List n() {
        return this.f12792v.f12445h.b();
    }

    @Override // u4.InterfaceC2099e
    public final boolean p0() {
        return T4.e.f9088h.c(this.f12785o.f8545n).booleanValue();
    }

    @Override // x4.AbstractC2299z
    public final g5.o q(C1706f c1706f) {
        L l7 = this.f12795y;
        d5.e.j(l7.a);
        return (g5.o) AbstractC0832b.u(l7.f16294c, L.f16292e[0]);
    }

    public final C1455h q0() {
        ((C1712l) this.f12792v.a.f12429q).getClass();
        L l7 = this.f12795y;
        d5.e.j(l7.a);
        return (C1455h) ((g5.o) AbstractC0832b.u(l7.f16294c, L.f16292e[0]));
    }

    public final B s0(W4.e eVar) {
        Iterator it = q0().a(eVar, C4.c.f965q).iterator();
        boolean z7 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z7) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((K) next).D() == null) {
                    if (z7) {
                        break;
                    }
                    z7 = true;
                    obj = next;
                }
            }
        }
        obj = null;
        K k7 = (K) obj;
        return (B) (k7 != null ? k7.getType() : null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(Q() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // u4.InterfaceC2102h
    public final n5.M v() {
        return this.f12794x;
    }

    @Override // u4.InterfaceC2099e
    public final boolean x() {
        return T4.e.f9086f.c(this.f12785o.f8545n) == EnumC0579j.COMPANION_OBJECT;
    }

    @Override // u4.InterfaceC2099e
    public final Collection y() {
        return (Collection) this.f12781C.invoke();
    }
}
