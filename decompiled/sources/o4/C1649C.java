package o4;

import A4.AbstractC0011d;
import D4.AbstractC0096o;
import D4.EnumC0097p;
import X4.C0617n;
import e5.EnumC0834d;
import j5.C1354i;
import j5.C1356k;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import l4.InterfaceC1425d;
import l4.InterfaceC1443v;
import l5.C1456i;
import m5.C1523l;
import q4.AbstractC1857a;
import r4.AbstractC1886o;
import r4.AbstractC1887p;
import r4.EnumC1882k;
import t4.C2053d;
import u4.EnumC2100f;
import u4.EnumC2117x;
import u4.InterfaceC2099e;
import x4.C2285l;
import z4.C2494f;
import z5.AbstractC2517v;

/* renamed from: o4.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1649C extends AbstractC1654H implements InterfaceC1425d, InterfaceC1650D, x0 {

    /* renamed from: n, reason: collision with root package name */
    public static final HashSet f13627n;

    /* renamed from: l, reason: collision with root package name */
    public final Class f13628l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f13629m;

    static {
        LinkedHashSet linkedHashSet = AbstractC1857a.a;
        HashSet hashSet = new HashSet();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hashSet.add(((W4.b) it.next()).a().a.toString());
        }
        f13627n = hashSet;
    }

    public C1649C(Class cls) {
        kotlin.jvm.internal.l.f("jClass", cls);
        this.f13628l = cls;
        this.f13629m = z1.c.B(O3.j.f7525k, new C1695u(this, 0));
    }

    public static C2285l z(W4.b bVar, C2494f c2494f) {
        C1354i c1354i = c2494f.a;
        t4.n nVar = new t4.n(c1354i.f12414b, bVar.a, 1);
        W4.e eVarF = bVar.f();
        EnumC2117x enumC2117x = EnumC2117x.f16342l;
        EnumC2100f enumC2100f = EnumC2100f.f16311k;
        List listH = P3.r.H(c1354i.f12414b.d().k("Any").g());
        C1523l c1523l = c1354i.a;
        C2285l c2285l = new C2285l(nVar, eVarF, enumC2117x, enumC2100f, listH, c1523l);
        c2285l.q0(new C1648B(c1523l, c2285l), P3.A.f7737k, null);
        return c2285l;
    }

    public final W4.b A() {
        EnumC1882k enumC1882kD;
        W4.b bVar = D0.a;
        Class cls = this.f13628l;
        kotlin.jvm.internal.l.f("klass", cls);
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            kotlin.jvm.internal.l.e("getComponentType(...)", componentType);
            enumC1882kD = componentType.isPrimitive() ? EnumC0834d.b(componentType.getSimpleName()).d() : null;
            if (enumC1882kD != null) {
                return new W4.b(AbstractC1887p.f15028k, enumC1882kD.f14954l);
            }
            W4.c cVarI = AbstractC1886o.f14998g.i();
            return new W4.b(cVarI.b(), cVarI.a.g());
        }
        if (cls.equals(Void.TYPE)) {
            return D0.a;
        }
        enumC1882kD = cls.isPrimitive() ? EnumC0834d.b(cls.getSimpleName()).d() : null;
        if (enumC1882kD != null) {
            return new W4.b(AbstractC1887p.f15028k, enumC1882kD.f14953k);
        }
        W4.b bVarA = AbstractC0011d.a(cls);
        if (!bVarA.f9617c) {
            String str = C2053d.a;
            W4.c cVarA = bVarA.a();
            kotlin.jvm.internal.l.f("fqName", cVarA);
            W4.b bVar2 = (W4.b) C2053d.f16044h.get(cVarA.a);
            if (bVar2 != null) {
                return bVar2;
            }
        }
        return bVarA;
    }

    public final EnumC0097p B() {
        EnumC0097p enumC0097pA;
        D4.M mD = D();
        if (mD != null && (enumC0097pA = AbstractC0096o.a(mD)) != null) {
            return enumC0097pA;
        }
        Class cls = this.f13628l;
        return cls.isAnnotation() ? EnumC0097p.f1622p : cls.isInterface() ? EnumC0097p.f1619m : cls.isEnum() ? EnumC0097p.f1620n : cls.getSuperclass().isEnum() ? EnumC0097p.f1621o : EnumC0097p.f1618l;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // o4.InterfaceC1650D
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2099e getDescriptor() {
        return ((C1700z) this.f13629m.getValue()).a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [O3.i, java.lang.Object] */
    public final D4.M D() {
        return (D4.M) ((C1700z) this.f13629m.getValue()).f13782c.getValue();
    }

    public final D4.j0 E() {
        D4.M mD = D();
        if (mD != null) {
            D4.j0 j0Var = (D4.j0) AbstractC0096o.f1614b.D(mD, AbstractC0096o.a[7]);
            if (j0Var != null) {
                return j0Var;
            }
        }
        Class cls = this.f13628l;
        return (cls.isAnnotation() || cls.isEnum()) ? D4.j0.f1600l : kotlin.jvm.internal.l.a(n6.d.Q(cls), Boolean.TRUE) ? D4.j0.f1603o : Modifier.isAbstract(cls.getModifiers()) ? D4.j0.f1602n : !Modifier.isFinal(cls.getModifiers()) ? D4.j0.f1601m : D4.j0.f1600l;
    }

    @Override // kotlin.jvm.internal.InterfaceC1404d
    public final Class d() {
        return this.f13628l;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1649C) && n6.m.G(this).equals(n6.m.G((InterfaceC1425d) obj));
    }

    @Override // l4.InterfaceC1423b
    public final List getAnnotations() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1425d
    public final List getTypeParameters() {
        C1700z c1700z = (C1700z) this.f13629m.getValue();
        c1700z.getClass();
        InterfaceC1443v interfaceC1443v = C1700z.f13781p[6];
        Object objInvoke = c1700z.f13788i.invoke();
        kotlin.jvm.internal.l.e("getValue(...)", objInvoke);
        return (List) objInvoke;
    }

    @Override // o4.AbstractC1654H
    public final Collection h() {
        InterfaceC2099e descriptor = getDescriptor();
        if (descriptor.c() == EnumC2100f.f16312l || descriptor.c() == EnumC2100f.f16316p) {
            return P3.y.f7779k;
        }
        Collection collectionY = descriptor.y();
        kotlin.jvm.internal.l.e("getConstructors(...)", collectionY);
        return collectionY;
    }

    @Override // l4.InterfaceC1425d
    public final int hashCode() {
        return n6.m.G(this).hashCode();
    }

    @Override // l4.InterfaceC1425d
    public final boolean i() {
        D4.M mD = D();
        if (mD != null) {
            InterfaceC1443v[] interfaceC1443vArr = AbstractC0096o.a;
            if (AbstractC0096o.f1617e.B(mD, AbstractC0096o.a[14])) {
                return true;
            }
        }
        return false;
    }

    @Override // l4.InterfaceC1425d
    public final boolean isAbstract() {
        return E() == D4.j0.f1602n;
    }

    @Override // l4.InterfaceC1425d
    public final boolean j() {
        D4.M mD = D();
        if (mD == null) {
            Class cls = this.f13628l;
            return (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        }
        InterfaceC1443v[] interfaceC1443vArr = AbstractC0096o.a;
        return AbstractC0096o.f1616d.B(mD, AbstractC0096o.a[10]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1425d
    public final String k() {
        C1700z c1700z = (C1700z) this.f13629m.getValue();
        c1700z.getClass();
        InterfaceC1443v interfaceC1443v = C1700z.f13781p[3];
        return (String) c1700z.f13785f.invoke();
    }

    @Override // l4.InterfaceC1425d
    public final boolean l() {
        return E() == D4.j0.f1603o;
    }

    @Override // l4.InterfaceC1425d
    public final boolean m(Object obj) {
        List list = AbstractC0011d.a;
        Class cls = this.f13628l;
        kotlin.jvm.internal.l.f("<this>", cls);
        Integer num = (Integer) AbstractC0011d.f221d.get(cls);
        if (num != null) {
            return kotlin.jvm.internal.B.g(num.intValue(), obj);
        }
        Class cls2 = (Class) AbstractC0011d.f220c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1425d
    public final String n() {
        C1700z c1700z = (C1700z) this.f13629m.getValue();
        c1700z.getClass();
        InterfaceC1443v interfaceC1443v = C1700z.f13781p[2];
        return (String) c1700z.f13784e.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1425d
    public final Object o() {
        return ((C1700z) this.f13629m.getValue()).f13787h.getValue();
    }

    @Override // o4.AbstractC1654H
    public final Collection p(W4.e eVar) {
        g5.o oVarK0 = getDescriptor().g().k0();
        C4.c cVar = C4.c.f960l;
        Collection collectionF = oVarK0.f(eVar, cVar);
        g5.o oVarC0 = getDescriptor().c0();
        kotlin.jvm.internal.l.e("getStaticScope(...)", oVarC0);
        return P3.q.G0(collectionF, oVarC0.f(eVar, cVar));
    }

    @Override // o4.AbstractC1654H
    public final u4.K q(int i7) {
        Class<?> declaringClass;
        Class cls = this.f13628l;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((C1649C) n6.m.I(declaringClass)).q(i7);
        }
        InterfaceC2099e descriptor = getDescriptor();
        C1456i c1456i = descriptor instanceof C1456i ? (C1456i) descriptor : null;
        if (c1456i != null) {
            C0617n c0617n = U4.j.f9306j;
            kotlin.jvm.internal.l.e("classLocalVariable", c0617n);
            R4.J j7 = (R4.J) android.support.v4.media.session.b.x(c1456i.f12785o, c0617n, i7);
            if (j7 != null) {
                C1356k c1356k = c1456i.f12792v;
                return (u4.K) F0.f(this.f13628l, j7, c1356k.f12439b, c1356k.f12441d, c1456i.f12786p, C1696v.f13762l);
            }
        }
        return null;
    }

    @Override // o4.AbstractC1654H
    public final Collection t(W4.e eVar) {
        g5.o oVarK0 = getDescriptor().g().k0();
        C4.c cVar = C4.c.f960l;
        Collection collectionA = oVarK0.a(eVar, cVar);
        g5.o oVarC0 = getDescriptor().c0();
        kotlin.jvm.internal.l.e("getStaticScope(...)", oVarC0);
        return P3.q.G0(collectionA, oVarC0.a(eVar, cVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("class ");
        W4.b bVarA = A();
        W4.c cVar = bVarA.a;
        String strJ = cVar.a.c() ? "" : A6.b.j(new StringBuilder(), cVar.a.a, '.');
        sb.append(strJ + AbstractC2517v.Q(bVarA.f9616b.a.a, '.', '$'));
        return sb.toString();
    }
}
