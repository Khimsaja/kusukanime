package t4;

import H4.u;
import P3.A;
import P3.F;
import b1.AbstractC0703b;
import e5.AbstractC0832b;
import f6.AbstractC0915m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import l4.InterfaceC1443v;
import l5.C1466s;
import m5.C1516e;
import m5.C1517f;
import m5.C1520i;
import m5.C1523l;
import n5.B;
import n5.C1588z;
import n5.T;
import n5.V;
import r4.AbstractC1880i;
import r4.AbstractC1886o;
import u4.AbstractC2115v;
import u4.EnumC2100f;
import u4.EnumC2117x;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import w4.AbstractC2215e;
import w4.InterfaceC2212b;
import w4.InterfaceC2214d;
import x4.AbstractC2294u;
import x4.C2255A;
import x4.C2266L;
import x4.C2272S;
import x4.C2283j;
import x4.C2285l;
import x4.C2293t;

/* loaded from: classes.dex */
public final class o implements InterfaceC2212b, InterfaceC2214d {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f16074h;
    public final C2255A a;

    /* renamed from: b, reason: collision with root package name */
    public final C1520i f16075b;

    /* renamed from: c, reason: collision with root package name */
    public final B f16076c;

    /* renamed from: d, reason: collision with root package name */
    public final C1520i f16077d;

    /* renamed from: e, reason: collision with root package name */
    public final C1516e f16078e;

    /* renamed from: f, reason: collision with root package name */
    public final C1520i f16079f;

    /* renamed from: g, reason: collision with root package name */
    public final C1516e f16080g;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(o.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0);
        z zVar = y.a;
        f16074h = new InterfaceC1443v[]{zVar.h(rVar), AbstractC0703b.r(o.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, zVar), AbstractC0703b.r(o.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0, zVar)};
    }

    public o(C2255A c2255a, C1523l c1523l, u uVar) {
        this.a = c2255a;
        this.f16075b = new C1520i(c1523l, uVar);
        C2285l c2285l = new C2285l(new n(c2255a, new W4.c("java.io"), 0), W4.e.e("Serializable"), EnumC2117x.f16345o, EnumC2100f.f16312l, P3.r.H(new C1588z(c1523l, new C2060k(this, 1))), c1523l);
        c2285l.q0(g5.n.f11759b, A.f7737k, null);
        this.f16076c = c2285l.g();
        this.f16077d = new C1520i(c1523l, new A3.q(23, this, c1523l));
        this.f16078e = new C1516e(c1523l, new ConcurrentHashMap(3, 1.0f, 2), new C1517f(), 0);
        this.f16079f = new C1520i(c1523l, new C2060k(this, 0));
        this.f16080g = c1523l.b(new l(this, 0));
    }

    @Override // w4.InterfaceC2214d
    public final boolean a(InterfaceC2099e interfaceC2099e, C1466s c1466s) {
        kotlin.jvm.internal.l.f("classDescriptor", interfaceC2099e);
        L4.i iVarF = f(interfaceC2099e);
        if (iVarF == null || !c1466s.getAnnotations().d(AbstractC2215e.a)) {
            return true;
        }
        g().getClass();
        String strJ = F.j(c1466s, 3);
        L4.o oVarQ0 = iVarF.q0();
        W4.e name = c1466s.getName();
        kotlin.jvm.internal.l.e("getName(...)", name);
        Collection collectionF = oVarQ0.f(name, C4.c.f959k);
        if ((collectionF instanceof Collection) && collectionF.isEmpty()) {
            return false;
        }
        Iterator it = collectionF.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l.a(F.j((C2266L) it.next(), 3), strJ)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0207 A[EDGE_INSN: B:141:0x0207->B:76:0x0207 BREAK  A[LOOP:4: B:72:0x01e6->B:142:?]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023f  */
    @Override // w4.InterfaceC2212b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection b(W4.e r18, u4.InterfaceC2099e r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.o.b(W4.e, u4.e):java.util.Collection");
    }

    @Override // w4.InterfaceC2212b
    public final Collection c(InterfaceC2099e interfaceC2099e) {
        Set setC;
        kotlin.jvm.internal.l.f("classDescriptor", interfaceC2099e);
        g().getClass();
        Set set = A.f7737k;
        L4.i iVarF = f(interfaceC2099e);
        if (iVarF != null && (setC = iVarF.q0().c()) != null) {
            set = setC;
        }
        return set;
    }

    @Override // w4.InterfaceC2212b
    public final Collection d(InterfaceC2099e interfaceC2099e) {
        boolean zIsAssignableFrom = true;
        kotlin.jvm.internal.l.f("classDescriptor", interfaceC2099e);
        W4.d dVarH = d5.e.h(interfaceC2099e);
        LinkedHashSet linkedHashSet = r.a;
        W4.d dVar = AbstractC1886o.f14998g;
        boolean z7 = dVarH.equals(dVar) || AbstractC1886o.f14999g0.get(dVarH) != null;
        B b4 = this.f16076c;
        if (z7) {
            return P3.r.I((B) AbstractC0832b.u(this.f16077d, f16074h[1]), b4);
        }
        if (!dVarH.equals(dVar) && AbstractC1886o.f14999g0.get(dVarH) == null) {
            String str = C2053d.a;
            W4.b bVarF = C2053d.f(dVarH);
            if (bVarF == null) {
                zIsAssignableFrom = false;
            } else {
                try {
                    zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(bVarF.a().a.a));
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return zIsAssignableFrom ? P3.r.H(b4) : P3.y.f7779k;
    }

    @Override // w4.InterfaceC2212b
    public final Collection e(InterfaceC2099e interfaceC2099e) {
        InterfaceC2099e interfaceC2099eB;
        kotlin.jvm.internal.l.f("classDescriptor", interfaceC2099e);
        EnumC2100f enumC2100fC = interfaceC2099e.c();
        EnumC2100f enumC2100f = EnumC2100f.f16311k;
        P3.y yVar = P3.y.f7779k;
        if (enumC2100fC == enumC2100f) {
            g().getClass();
            L4.i iVarF = f(interfaceC2099e);
            if (iVarF != null && (interfaceC2099eB = C2054e.b(d5.e.g(iVarF), C2051b.f16035f)) != null) {
                V v5 = new V(AbstractC0915m.l(interfaceC2099eB, iVarF));
                List list = (List) iVarF.f6079A.f6115q.invoke();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    C2283j c2283j = (C2283j) next;
                    C2283j c2283j2 = c2283j;
                    if (c2283j2.getVisibility().a.f16318b) {
                        Collection collectionY = interfaceC2099eB.y();
                        kotlin.jvm.internal.l.e("getConstructors(...)", collectionY);
                        Collection<C2283j> collection = collectionY;
                        if (!(collection instanceof Collection) || !collection.isEmpty()) {
                            for (C2283j c2283j3 : collection) {
                                kotlin.jvm.internal.l.c(c2283j3);
                                if (Z4.k.j(c2283j3, c2283j.b(v5)) == 1) {
                                    break;
                                }
                            }
                        }
                        if (c2283j2.m0().size() == 1) {
                            List listM0 = c2283j2.m0();
                            kotlin.jvm.internal.l.e("getValueParameters(...)", listM0);
                            InterfaceC2102h interfaceC2102hF = ((C2272S) P3.q.K0(listM0)).getType().t0().f();
                            if (kotlin.jvm.internal.l.a(interfaceC2102hF != null ? d5.e.h(interfaceC2102hF) : null, d5.e.h(interfaceC2099e))) {
                            }
                        }
                        if (!AbstractC1880i.C(c2283j) && !r.f16089f.contains(android.support.v4.media.session.b.G(iVarF, F.j(c2283j, 3)))) {
                            arrayList.add(next);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(P3.r.p(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C2283j c2283j4 = (C2283j) it2.next();
                    C2283j c2283j5 = c2283j4;
                    c2283j5.getClass();
                    C2293t c2293tT0 = c2283j5.T0(V.f13380b);
                    c2293tT0.f17458b = interfaceC2099e;
                    c2293tT0.e(interfaceC2099e.g());
                    c2293tT0.f17471o = true;
                    T tF = v5.f();
                    if (tF == null) {
                        C2293t.c(37);
                        throw null;
                    }
                    c2293tT0.a = tF;
                    if (!r.f16090g.contains(android.support.v4.media.session.b.G(iVarF, F.j(c2283j4, 3)))) {
                        c2293tT0.k((v4.h) AbstractC0832b.u(this.f16079f, f16074h[2]));
                    }
                    AbstractC2294u abstractC2294uQ0 = c2293tT0.f17480x.Q0(c2293tT0);
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor", abstractC2294uQ0);
                    arrayList2.add((C2283j) abstractC2294uQ0);
                }
                return arrayList2;
            }
        }
        return yVar;
    }

    public final L4.i f(InterfaceC2099e interfaceC2099e) {
        W4.c cVarA;
        if (interfaceC2099e == null) {
            AbstractC1880i.a(108);
            throw null;
        }
        if (!AbstractC1880i.b(interfaceC2099e, AbstractC1886o.a) && AbstractC1880i.I(interfaceC2099e)) {
            W4.d dVarH = d5.e.h(interfaceC2099e);
            if (dVarH.d()) {
                String str = C2053d.a;
                W4.b bVarF = C2053d.f(dVarH);
                if (bVarF != null && (cVarA = bVarF.a()) != null) {
                    C2255A c2255a = g().a;
                    C4.c cVar = C4.c.f959k;
                    InterfaceC2099e interfaceC2099eJ = AbstractC2115v.j(c2255a, cVarA);
                    if (interfaceC2099eJ instanceof L4.i) {
                        return (L4.i) interfaceC2099eJ;
                    }
                }
            }
        }
        return null;
    }

    public final C2058i g() {
        return (C2058i) AbstractC0832b.u(this.f16075b, f16074h[0]);
    }
}
