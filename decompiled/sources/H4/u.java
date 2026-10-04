package H4;

import L4.C0441d;
import P3.J;
import R4.C0580k;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import f1.AbstractC0870c;
import f1.AbstractC0871d;
import h4.AbstractC1009a;
import h5.C1012a;
import h5.InterfaceC1015d;
import io.ktor.util.GzipHeaderFlags;
import j5.C1352g;
import j5.C1356k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k5.C1399c;
import kotlin.jvm.internal.AbstractC1403c;
import kotlin.jvm.internal.InterfaceC1404d;
import l4.InterfaceC1425d;
import l5.AbstractC1463p;
import l5.C1456i;
import l5.C1464q;
import l5.C1467t;
import l5.C1468u;
import m5.C1523l;
import n5.AbstractC1566c;
import n5.AbstractC1569f;
import n5.AbstractC1586x;
import n5.C1568e;
import n5.P;
import n5.Q;
import n5.T;
import n5.V;
import n5.b0;
import o4.AbstractC1654H;
import o4.C1657K;
import o4.C1658L;
import o4.C1659M;
import o4.C1660N;
import o4.C1661O;
import o4.C1662P;
import o4.C1663Q;
import o4.C1664S;
import o4.r0;
import o4.s0;
import o4.v0;
import o4.w0;
import o4.y0;
import o5.C1706f;
import o5.C1709i;
import r4.AbstractC1886o;
import r4.C1883l;
import t4.C2058i;
import t4.C2059j;
import u4.EnumC2117x;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import u4.K;
import u4.L;
import u4.M;
import v4.C2158f;
import v4.C2159g;
import x4.AbstractC2275b;
import x4.AbstractC2279f;
import x4.AbstractC2287n;
import x4.AbstractC2294u;
import x4.C2258D;
import x4.C2266L;
import x4.C2269O;
import x4.C2283j;
import x4.C2295v;
import z4.C2491c;
import z5.AbstractC2517v;
import z5.C2508m;

/* loaded from: classes.dex */
public final class u implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3749k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f3750l;

    public /* synthetic */ u(int i7, Object obj) {
        this.f3749k = i7;
        this.f3750l = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.Map] */
    @Override // e4.InterfaceC0821a
    public final Object invoke() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        b5.i iVar;
        v4.m mVar;
        b5.b bVarA;
        P3.y yVar;
        C2283j c2283jB;
        P3.y yVar2;
        C1467t c1467t;
        C2269O c2269o;
        P3.z zVar = P3.z.f7780k;
        P3.y yVar3 = P3.y.f7779k;
        int i7 = 10;
        Object obj = this.f3750l;
        switch (this.f3749k) {
            case 0:
                Q3.c cVarS = P3.r.s();
                v vVar = (v) obj;
                cVarS.add(vVar.a.f3686k);
                B b4 = vVar.f3751b;
                if (b4 != null) {
                    cVarS.add("under-migration:".concat(b4.f3686k));
                }
                for (Map.Entry entry : vVar.f3752c.entrySet()) {
                    cVarS.add("@" + entry.getKey() + ':' + ((B) entry.getValue()).f3686k);
                }
                return (String[]) P3.r.h(cVarS).toArray(new String[0]);
            case 1:
                Object obj2 = I4.e.a;
                N4.a aVar = ((I4.i) obj).f4052d;
                A4.u uVar = aVar instanceof A4.u ? (A4.u) aVar : null;
                if (uVar == null || (mVar = (v4.m) I4.e.f4057b.get(W4.e.e(uVar.f235b.name()).b())) == null) {
                    iVar = null;
                } else {
                    W4.c cVar = AbstractC1886o.f15014v;
                    kotlin.jvm.internal.l.f("topLevelFqName", cVar);
                    iVar = new b5.i(new W4.b(cVar.b(), cVar.a.g()), W4.e.e(mVar.name()));
                }
                Map mapJ = iVar != null ? P3.F.J(new O3.l(I4.c.f4054c, iVar)) : null;
                return mapJ == null ? zVar : mapJ;
            case 2:
                N4.a aVar2 = ((I4.j) obj).f4052d;
                if (aVar2 instanceof A4.h) {
                    Object obj3 = I4.e.a;
                    bVarA = I4.e.a(((A4.h) aVar2).a());
                } else if (aVar2 instanceof A4.u) {
                    Object obj4 = I4.e.a;
                    bVarA = I4.e.a(P3.r.H(aVar2));
                } else {
                    bVarA = null;
                }
                Map mapJ2 = bVarA != null ? P3.F.J(new O3.l(I4.c.f4053b, bVarA)) : null;
                return mapJ2 == null ? zVar : mapJ2;
            case 3:
                C0441d c0441d = (C0441d) obj;
                Collection collectionValues = ((Map) AbstractC0832b.u(c0441d.f6062c.f6125s, L4.q.f6122w[0])).values();
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    C1464q c1464qA = ((K4.a) c0441d.f6061b.f110l).f4702d.a(c0441d.f6062c, (C2491c) it.next());
                    if (c1464qA != null) {
                        arrayList.add(c1464qA);
                    }
                }
                return (g5.o[]) AbstractC0832b.z(arrayList).toArray(new g5.o[0]);
            case GzipHeaderFlags.EXTRA /* 4 */:
                boolean z7 = true;
                Y4.h hVar = (Y4.h) obj;
                hVar.getClass();
                Y4.l lVar = hVar.a;
                Y4.l lVar2 = new Y4.l();
                Field[] declaredFields = Y4.l.class.getDeclaredFields();
                kotlin.jvm.internal.l.e("getDeclaredFields(...)", declaredFields);
                int length = declaredFields.length;
                int i8 = 0;
                while (i8 < length) {
                    Field field = declaredFields[i8];
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(z7);
                        Object obj5 = field.get(lVar);
                        AbstractC1009a abstractC1009a = obj5 instanceof AbstractC1009a ? (AbstractC1009a) obj5 : null;
                        if (abstractC1009a != null) {
                            String name = field.getName();
                            kotlin.jvm.internal.l.e("getName(...)", name);
                            AbstractC2517v.T(name, "is", false);
                            InterfaceC1425d interfaceC1425dB = kotlin.jvm.internal.y.a.b(Y4.l.class);
                            String name2 = field.getName();
                            StringBuilder sb = new StringBuilder("get");
                            String name3 = field.getName();
                            kotlin.jvm.internal.l.e("getName(...)", name3);
                            if (name3.length() > 0) {
                                char upperCase = Character.toUpperCase(name3.charAt(0));
                                String strSubstring = name3.substring(1);
                                kotlin.jvm.internal.l.e("substring(...)", strSubstring);
                                name3 = upperCase + strSubstring;
                            }
                            sb.append(name3);
                            field.set(lVar2, new Y4.k(abstractC1009a.getValue(lVar, new kotlin.jvm.internal.r(AbstractC1403c.NO_RECEIVER, ((InterfaceC1404d) interfaceC1425dB).d(), name2, sb.toString(), 0)), lVar2));
                        }
                    }
                    i8++;
                    z7 = true;
                }
                Y4.h hVar2 = Y4.h.f10162c;
                lVar2.f10194L.setValue(lVar2, Y4.l.f10184Y[36], J.T(lVar2.m(), P3.r.I(AbstractC1886o.f15008p, AbstractC1886o.f15009q)));
                lVar2.a = true;
                return new Y4.h(lVar2);
            case 5:
                AbstractC1586x abstractC1586xB = ((Q) obj).b();
                kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB);
                return abstractC1586xB;
            case 6:
                ((b5.n) obj).getClass();
                throw null;
            case 7:
                g5.h hVar3 = (g5.h) obj;
                List listH = hVar3.h();
                ArrayList arrayList2 = new ArrayList(3);
                AbstractC2275b abstractC2275b = hVar3.f11747b;
                Collection collectionG = abstractC2275b.v().g();
                kotlin.jvm.internal.l.e("getSupertypes(...)", collectionG);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = collectionG.iterator();
                while (it2.hasNext()) {
                    P3.v.e0(arrayList3, AbstractC0871d.Z(((AbstractC1586x) it2.next()).k0(), null, 3));
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (next instanceof InterfaceC2097c) {
                        arrayList4.add(next);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    W4.e name4 = ((InterfaceC2097c) next2).getName();
                    Object arrayList5 = linkedHashMap.get(name4);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(name4, arrayList5);
                    }
                    ((List) arrayList5).add(next2);
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    kotlin.jvm.internal.l.e("component1(...)", key);
                    W4.e eVar = (W4.e) key;
                    List list = (List) entry2.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj6 : list) {
                        Boolean boolValueOf = Boolean.valueOf(((InterfaceC2097c) obj6) instanceof InterfaceC2112s);
                        Object arrayList6 = linkedHashMap2.get(boolValueOf);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList6);
                        }
                        ((List) arrayList6).add(obj6);
                    }
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry3.getKey()).booleanValue();
                        List list2 = (List) entry3.getValue();
                        Z4.k kVar = Z4.k.f10274c;
                        if (zBooleanValue) {
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj7 : listH) {
                                if (kotlin.jvm.internal.l.a(((AbstractC2287n) ((InterfaceC2112s) obj7)).getName(), eVar)) {
                                    arrayList7.add(obj7);
                                }
                            }
                            yVar = arrayList7;
                        } else {
                            yVar = yVar3;
                        }
                        kVar.h(eVar, list2, yVar, abstractC2275b, new g5.g(arrayList2, hVar3));
                    }
                }
                return P3.q.G0(listH, w5.k.d(arrayList2));
            case 8:
                T tF = ((V) obj).f();
                tF.getClass();
                return new V(tF);
            case 9:
                g5.t tVar = (g5.t) obj;
                return tVar.h(AbstractC0871d.Z(tVar.f11767b, null, 3));
            case 10:
                Set setKeySet = ((LinkedHashMap) ((C1399c) obj).f12692s.f113o).keySet();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj8 : setKeySet) {
                    W4.b bVar = (W4.b) obj8;
                    if (!bVar.g() && !C1352g.f12412c.contains(bVar)) {
                        arrayList8.add(obj8);
                    }
                }
                ArrayList arrayList9 = new ArrayList(P3.r.p(arrayList8, 10));
                Iterator it5 = arrayList8.iterator();
                while (it5.hasNext()) {
                    arrayList9.add(((W4.b) it5.next()).f());
                }
                return arrayList9;
            case 11:
                A2.b bVar2 = (A2.b) obj;
                bVar2.getClass();
                HashSet hashSet = new HashSet();
                C1456i c1456i = (C1456i) bVar2.f113o;
                Iterator it6 = c1456i.f12794x.g().iterator();
                while (it6.hasNext()) {
                    for (InterfaceC2105k interfaceC2105k : AbstractC0871d.Z(((AbstractC1586x) it6.next()).k0(), null, 3)) {
                        if ((interfaceC2105k instanceof C2266L) || (interfaceC2105k instanceof K)) {
                            hashSet.add(((InterfaceC2097c) interfaceC2105k).getName());
                        }
                    }
                }
                C0580k c0580k = c1456i.f12785o;
                List list3 = c0580k.f8529A;
                kotlin.jvm.internal.l.e("getFunctionList(...)", list3);
                Iterator it7 = list3.iterator();
                while (true) {
                    boolean zHasNext = it7.hasNext();
                    C1356k c1356k = c1456i.f12792v;
                    if (!zHasNext) {
                        List list4 = c0580k.f8530B;
                        kotlin.jvm.internal.l.e("getPropertyList(...)", list4);
                        Iterator it8 = list4.iterator();
                        while (it8.hasNext()) {
                            hashSet.add(AbstractC0870c.U(c1356k.f12439b, ((R4.J) it8.next()).f8215p));
                        }
                        return J.T(hashSet, hashSet);
                    }
                    hashSet.add(AbstractC0870c.U(c1356k.f12439b, ((R4.B) it7.next()).f8131p));
                }
                break;
            case 12:
                AbstractC1463p abstractC1463p = (AbstractC1463p) obj;
                Set setN = abstractC1463p.n();
                if (setN == null) {
                    return null;
                }
                return J.T(J.T(abstractC1463p.m(), abstractC1463p.f12816c.f12807c.keySet()), setN);
            case 13:
                C1468u c1468u = (C1468u) obj;
                C1356k c1356k2 = c1468u.f12841u;
                return P3.q.S0(c1356k2.a.f12417e.j0(c1468u.f12842v, c1356k2.f12439b));
            case 14:
                return new C1568e(((AbstractC1569f) obj).b());
            case 15:
                return AbstractC1566c.x((u4.Q) ((n5.G) obj).f13358b);
            case 16:
                return p5.l.c(p5.k.I, ((P) obj).toString());
            case 17:
                return y0.a(((AbstractC1654H) obj).d());
            case 18:
                return new C1657K((C1658L) obj);
            case 19:
                return new C1659M((C1660N) obj);
            case 20:
                return new C1661O((C1662P) obj);
            case 21:
                return new C1663Q((C1664S) obj);
            case 22:
                return new r0((s0) obj);
            case 23:
                List upperBounds = ((w0) obj).f13774k.getUpperBounds();
                kotlin.jvm.internal.l.e("getUpperBounds(...)", upperBounds);
                ArrayList arrayList10 = new ArrayList(P3.r.p(upperBounds, 10));
                Iterator it9 = upperBounds.iterator();
                while (it9.hasNext()) {
                    arrayList10.add(new v0((AbstractC1586x) it9.next(), null));
                }
                return arrayList10;
            case 24:
                InterfaceC0821a interfaceC0821a = ((C1709i) obj).f13805b;
                if (interfaceC0821a != null) {
                    return (List) interfaceC0821a.invoke();
                }
                return null;
            case 25:
                int iHashCode = 0;
                for (Map.Entry entry4 : ((Map) obj).entrySet()) {
                    String str = (String) entry4.getKey();
                    Object value = entry4.getValue();
                    iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode);
            case 26:
                C2059j c2059j = (C2059j) obj;
                C1883l c1883l = c2059j.f16061f;
                if (c1883l == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                C2058i c2058i = (C2058i) c1883l.invoke();
                c2059j.f16061f = null;
                return c2058i;
            case 27:
                return (g5.o) ((L) obj).f16293b.invoke(C1706f.a);
            case 28:
                v4.j jVar = (v4.j) obj;
                return jVar.a.j(jVar.f16656b).g();
            default:
                AbstractC2279f abstractC2279f = (AbstractC2279f) obj;
                abstractC2279f.getClass();
                C1467t c1467t2 = (C1467t) abstractC2279f;
                InterfaceC2099e interfaceC2099eN0 = c1467t2.N0();
                if (interfaceC2099eN0 == null) {
                    return yVar3;
                }
                Collection<C2283j> collectionY = interfaceC2099eN0.y();
                kotlin.jvm.internal.l.e("getConstructors(...)", collectionY);
                ArrayList arrayList11 = new ArrayList();
                for (C2283j c2283j : collectionY) {
                    C2258D c2258d = C2269O.f17401Q;
                    kotlin.jvm.internal.l.c(c2283j);
                    c2258d.getClass();
                    C1523l c1523l = abstractC2279f.f17421o;
                    kotlin.jvm.internal.l.f("storageManager", c1523l);
                    V vD = c1467t2.N0() == null ? null : V.d(c1467t2.O0());
                    if (vD == null || (c2283jB = c2283j.b(vD)) == null) {
                        c1467t = c1467t2;
                        c2269o = null;
                    } else {
                        v4.h annotations = c2283j.getAnnotations();
                        C2283j c2283j2 = c2283j;
                        int iC = c2283j2.c();
                        AbstractC0703b.A(iC, "getKind(...)");
                        M mL = abstractC2279f.l();
                        kotlin.jvm.internal.l.e("getSource(...)", mL);
                        V v5 = vD;
                        C2269O c2269o2 = new C2269O(c1523l, abstractC2279f, c2283jB, null, annotations, iC, mL);
                        List listM0 = c2283j2.m0();
                        if (listM0 == null) {
                            AbstractC2294u.s0(28);
                            throw null;
                        }
                        ArrayList arrayListR0 = AbstractC2294u.R0(c2269o2, listM0, v5, false, false, null);
                        if (arrayListR0 == null) {
                            c1467t = c1467t2;
                            c2269o = null;
                        } else {
                            n5.B bG = AbstractC1566c.G(AbstractC1566c.m(c2283jB.f17494q.w0()), c1467t2.g());
                            C2295v c2295v = c2283j2.f17497t;
                            C2158f c2158f = C2159g.a;
                            C2295v c2295vK = c2295v != null ? Z4.l.k(c2269o2, v5.g(c2295v.getType(), b0.f13390m), c2158f) : null;
                            InterfaceC2099e interfaceC2099eN02 = c1467t2.N0();
                            if (interfaceC2099eN02 != null) {
                                List listM = c2283j2.M();
                                kotlin.jvm.internal.l.e("getContextReceiverParameters(...)", listM);
                                ArrayList arrayList12 = new ArrayList(P3.r.p(listM, i7));
                                int i9 = 0;
                                for (Object obj9 : listM) {
                                    int i10 = i9 + 1;
                                    if (i9 < 0) {
                                        P3.r.X();
                                        throw null;
                                    }
                                    C2295v c2295v2 = (C2295v) obj9;
                                    AbstractC1586x abstractC1586xG = v5.g(c2295v2.getType(), b0.f13390m);
                                    InterfaceC1015d interfaceC1015dN0 = c2295v2.N0();
                                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver", interfaceC1015dN0);
                                    C1467t c1467t3 = c1467t2;
                                    C1012a c1012a = new C1012a(interfaceC2099eN02, abstractC1586xG, ((C1012a) interfaceC1015dN0).L0());
                                    C2508m c2508m = W4.f.a;
                                    arrayList12.add(new C2295v(interfaceC2099eN02, c1012a, c2158f, W4.e.e(W4.f.f9626b + '_' + i9)));
                                    i9 = i10;
                                    c1467t2 = c1467t3;
                                }
                                yVar2 = arrayList12;
                            } else {
                                yVar2 = yVar3;
                            }
                            c1467t = c1467t2;
                            c2269o = c2269o2;
                            c2269o.S0(c2295vK, null, yVar2, abstractC2279f.n(), arrayListR0, bG, EnumC2117x.f16342l, abstractC2279f.f17422p);
                        }
                    }
                    if (c2269o != null) {
                        arrayList11.add(c2269o);
                    }
                    c1467t2 = c1467t;
                    i7 = 10;
                }
                return arrayList11;
        }
    }
}
