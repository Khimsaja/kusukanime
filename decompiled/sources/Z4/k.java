package Z4;

import H4.o;
import P3.q;
import P3.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import n5.C1567d;
import n5.L;
import o5.InterfaceC1703c;
import p.AbstractC1755i;
import u4.AbstractC2108n;
import u4.EnumC2117x;
import u4.InterfaceC2094J;
import u4.InterfaceC2096b;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import u4.K;
import u4.Q;
import x4.AbstractC2261G;
import x4.AbstractC2294u;
import x4.C2263I;
import x4.C2265K;
import x4.C2272S;
import x4.C2295v;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final List f10273b = q.S0(ServiceLoader.load(f.class, f.class.getClassLoader()));

    /* renamed from: c, reason: collision with root package name */
    public static final k f10274c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f10275d;
    public final InterfaceC1703c a;

    static {
        c cVar = new c();
        f10275d = cVar;
        f10274c = new k(cVar);
    }

    public k(InterfaceC1703c interfaceC1703c) {
        if (interfaceC1703c != null) {
            this.a = interfaceC1703c;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r25) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.k.a(int):void");
    }

    public static boolean b(AbstractC1586x abstractC1586x, AbstractC1586x abstractC1586x2, L l7) {
        if (abstractC1586x == null) {
            a(44);
            throw null;
        }
        if (abstractC1586x2 == null) {
            a(45);
            throw null;
        }
        if (AbstractC1566c.k(abstractC1586x) && AbstractC1566c.k(abstractC1586x2)) {
            return true;
        }
        return C1567d.g(l7, abstractC1586x.w0(), abstractC1586x2.w0());
    }

    public static void c(InterfaceC2097c interfaceC2097c, LinkedHashSet linkedHashSet) {
        if (interfaceC2097c == null) {
            a(17);
            throw null;
        }
        if (interfaceC2097c.c() != 2) {
            linkedHashSet.add(interfaceC2097c);
            return;
        }
        if (interfaceC2097c.m().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC2097c);
        }
        Iterator it = interfaceC2097c.m().iterator();
        while (it.hasNext()) {
            c((InterfaceC2097c) it.next(), linkedHashSet);
        }
    }

    public static ArrayList d(InterfaceC2096b interfaceC2096b) {
        C2295v c2295vD = interfaceC2096b.D();
        ArrayList arrayList = new ArrayList();
        if (c2295vD != null) {
            arrayList.add(c2295vD.getType());
        }
        Iterator it = interfaceC2096b.m0().iterator();
        while (it.hasNext()) {
            arrayList.add(((C2272S) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017e, code lost:
    
        r1 = u4.AbstractC2108n.f16324g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0180, code lost:
    
        r11 = ((u4.InterfaceC2097c) s(r10, new Z4.i(0))).z(r11, r0, r1);
        r12.p(r11, r10);
        r12.b(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0196, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0179, code lost:
    
        if (r1 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017b, code lost:
    
        r1 = u4.AbstractC2108n.f16325h;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.util.Collection r10, u4.InterfaceC2099e r11, Z4.l r12) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.k.e(java.util.Collection, u4.e, Z4.l):void");
    }

    public static ArrayList g(Object obj, LinkedList linkedList, e4.k kVar, e4.k kVar2) {
        if (obj == null) {
            a(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC2096b interfaceC2096b = (InterfaceC2096b) kVar.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC2096b interfaceC2096b2 = (InterfaceC2096b) kVar.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                int iJ = j(interfaceC2096b, interfaceC2096b2);
                if (iJ == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (iJ == 3) {
                    kVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static j i(InterfaceC2096b interfaceC2096b, InterfaceC2096b interfaceC2096b2) {
        boolean z7;
        if (interfaceC2096b == null) {
            a(38);
            throw null;
        }
        if (interfaceC2096b2 == null) {
            a(39);
            throw null;
        }
        boolean z8 = interfaceC2096b instanceof InterfaceC2112s;
        if ((z8 && !(interfaceC2096b2 instanceof InterfaceC2112s)) || (((z7 = interfaceC2096b instanceof K)) && !(interfaceC2096b2 instanceof K))) {
            return j.c("Member kind mismatch");
        }
        if (!z8 && !z7) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC2096b);
        }
        if (!interfaceC2096b.getName().equals(interfaceC2096b2.getName())) {
            return j.c("Name mismatch");
        }
        j jVarC = (interfaceC2096b.D() == null) != (interfaceC2096b2.D() == null) ? j.c("Receiver presence mismatch") : interfaceC2096b.m0().size() != interfaceC2096b2.m0().size() ? j.c("Value parameter number mismatch") : null;
        if (jVarC != null) {
            return jVarC;
        }
        return null;
    }

    public static int j(InterfaceC2096b interfaceC2096b, InterfaceC2096b interfaceC2096b2) {
        k kVar = f10274c;
        int iB = kVar.l(interfaceC2096b2, interfaceC2096b, null).b();
        int iB2 = kVar.m(interfaceC2096b, interfaceC2096b2, null, false).b();
        if (iB == 1 && iB2 == 1) {
            return 1;
        }
        return (iB == 3 || iB2 == 3) ? 3 : 2;
    }

    public static boolean k(InterfaceC2096b interfaceC2096b, InterfaceC2096b interfaceC2096b2) {
        if (interfaceC2096b == null) {
            a(65);
            throw null;
        }
        if (interfaceC2096b2 == null) {
            a(66);
            throw null;
        }
        AbstractC1586x returnType = interfaceC2096b.getReturnType();
        AbstractC1586x returnType2 = interfaceC2096b2.getReturnType();
        if (!p(interfaceC2096b, interfaceC2096b2)) {
            return false;
        }
        L lF = f10274c.f(interfaceC2096b.getTypeParameters(), interfaceC2096b2.getTypeParameters());
        if (interfaceC2096b instanceof InterfaceC2112s) {
            return o(interfaceC2096b, returnType, interfaceC2096b2, returnType2, lF);
        }
        if (!(interfaceC2096b instanceof K)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC2096b.getClass());
        }
        K k7 = (K) interfaceC2096b;
        K k8 = (K) interfaceC2096b2;
        C2265K setter = k7.getSetter();
        C2265K setter2 = k8.getSetter();
        if ((setter == null || setter2 == null) ? true : p(setter, setter2)) {
            return (k7.A() && k8.A()) ? C1567d.g(lF, returnType.w0(), returnType2.w0()) : (k7.A() || !k8.A()) && o(interfaceC2096b, returnType, interfaceC2096b2, returnType2, lF);
        }
        return false;
    }

    public static boolean o(InterfaceC2096b interfaceC2096b, AbstractC1586x abstractC1586x, InterfaceC2096b interfaceC2096b2, AbstractC1586x abstractC1586x2, L l7) {
        if (interfaceC2096b == null) {
            a(71);
            throw null;
        }
        if (abstractC1586x == null) {
            a(72);
            throw null;
        }
        if (interfaceC2096b2 == null) {
            a(73);
            throw null;
        }
        if (abstractC1586x2 != null) {
            return C1567d.m(C1567d.a, l7, abstractC1586x.w0(), abstractC1586x2.w0());
        }
        a(74);
        throw null;
    }

    public static boolean p(InterfaceC2096b interfaceC2096b, InterfaceC2096b interfaceC2096b2) {
        if (interfaceC2096b == null) {
            a(67);
            throw null;
        }
        if (interfaceC2096b2 != null) {
            Integer numB = AbstractC2108n.b(interfaceC2096b.getVisibility(), interfaceC2096b2.getVisibility());
            return numB == null || numB.intValue() >= 0;
        }
        a(68);
        throw null;
    }

    public static boolean q(InterfaceC2096b interfaceC2096b, InterfaceC2096b interfaceC2096b2) {
        if (interfaceC2096b == null) {
            a(13);
            throw null;
        }
        if (interfaceC2096b2 == null) {
            a(14);
            throw null;
        }
        boolean zEquals = interfaceC2096b.equals(interfaceC2096b2);
        c cVar = c.a;
        if (!zEquals && cVar.c(interfaceC2096b.a(), interfaceC2096b2.a(), false)) {
            return true;
        }
        InterfaceC2096b interfaceC2096bA = interfaceC2096b2.a();
        int i7 = e.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e.b(interfaceC2096b.a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (cVar.c(interfaceC2096bA, (InterfaceC2096b) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(InterfaceC2097c interfaceC2097c, A4.j jVar) {
        o oVar;
        o oVarF;
        o oVar2;
        if (interfaceC2097c == null) {
            a(105);
            throw null;
        }
        for (InterfaceC2097c interfaceC2097c2 : interfaceC2097c.m()) {
            if (interfaceC2097c2.getVisibility() == AbstractC2108n.f16324g) {
                r(interfaceC2097c2, jVar);
            }
        }
        if (interfaceC2097c.getVisibility() != AbstractC2108n.f16324g) {
            return;
        }
        Collection<InterfaceC2097c> collectionM = interfaceC2097c.m();
        if (collectionM == null) {
            a(107);
            throw null;
        }
        if (collectionM.isEmpty()) {
            oVarF = AbstractC2108n.f16327j;
        } else {
            Iterator it = collectionM.iterator();
            loop3: while (true) {
                oVar = null;
                while (it.hasNext()) {
                    o visibility = ((InterfaceC2097c) it.next()).getVisibility();
                    if (oVar != null) {
                        Integer numB = AbstractC2108n.b(visibility, oVar);
                        if (numB == null) {
                            break;
                        } else if (numB.intValue() > 0) {
                        }
                    }
                    oVar = visibility;
                }
            }
            if (oVar == null) {
                oVarF = null;
                break;
            }
            Iterator it2 = collectionM.iterator();
            while (it2.hasNext()) {
                Integer numB2 = AbstractC2108n.b(oVar, ((InterfaceC2097c) it2.next()).getVisibility());
                if (numB2 == null || numB2.intValue() < 0) {
                    oVarF = null;
                    break;
                }
            }
            oVarF = oVar;
        }
        if (oVarF == null) {
            oVarF = null;
            break;
        }
        if (interfaceC2097c.c() == 2) {
            for (InterfaceC2097c interfaceC2097c3 : collectionM) {
                if (interfaceC2097c3.e() != EnumC2117x.f16345o && !interfaceC2097c3.getVisibility().equals(oVarF)) {
                    oVarF = null;
                    break;
                }
            }
        } else {
            oVarF = AbstractC2108n.f(oVarF.a.c());
        }
        if (oVarF == null) {
            if (jVar != null) {
                jVar.invoke(interfaceC2097c);
            }
            oVar2 = AbstractC2108n.f16322e;
        } else {
            oVar2 = oVarF;
        }
        if (interfaceC2097c instanceof C2263I) {
            C2263I c2263i = (C2263I) interfaceC2097c;
            if (oVar2 == null) {
                C2263I.s0(20);
                throw null;
            }
            c2263i.f17388t = oVar2;
            Iterator it3 = ((K) interfaceC2097c).o().iterator();
            while (it3.hasNext()) {
                r((InterfaceC2094J) it3.next(), oVarF == null ? null : jVar);
            }
            return;
        }
        if (interfaceC2097c instanceof AbstractC2294u) {
            AbstractC2294u abstractC2294u = (AbstractC2294u) interfaceC2097c;
            if (oVar2 != null) {
                abstractC2294u.f17499v = oVar2;
                return;
            } else {
                AbstractC2294u.s0(10);
                throw null;
            }
        }
        AbstractC2261G abstractC2261G = (AbstractC2261G) interfaceC2097c;
        abstractC2261G.f17364u = oVar2;
        if (oVar2 != abstractC2261G.N0().getVisibility()) {
            abstractC2261G.f17358o = false;
        }
    }

    public static Object s(Collection collection, e4.k kVar) {
        Object next;
        if (collection.size() == 1) {
            Object objQ0 = q.q0(collection);
            if (objQ0 != null) {
                return objQ0;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(r.p(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(kVar.invoke(it.next()));
        }
        Object objQ02 = q.q0(collection);
        InterfaceC2096b interfaceC2096b = (InterfaceC2096b) kVar.invoke(objQ02);
        for (Object obj : collection) {
            InterfaceC2096b interfaceC2096b2 = (InterfaceC2096b) kVar.invoke(obj);
            if (interfaceC2096b2 == null) {
                a(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
                if (!k(interfaceC2096b2, (InterfaceC2096b) it2.next())) {
                    break;
                }
            }
            if (k(interfaceC2096b2, interfaceC2096b) && !k(interfaceC2096b, interfaceC2096b2)) {
                objQ02 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objQ02 != null) {
                return objQ02;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objQ03 = q.q0(arrayList);
            if (objQ03 != null) {
                return objQ03;
            }
            a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (!AbstractC1566c.l(((InterfaceC2096b) kVar.invoke(next)).getReturnType())) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objQ04 = q.q0(arrayList);
        if (objQ04 != null) {
            return objQ04;
        }
        a(82);
        throw null;
    }

    public final L f(List list, List list2) {
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        InterfaceC1703c interfaceC1703c = this.a;
        if (zIsEmpty) {
            return new L2.e((HashMap) null, interfaceC1703c).l1();
        }
        HashMap map = new HashMap();
        for (int i7 = 0; i7 < list.size(); i7++) {
            map.put(((Q) list.get(i7)).v(), ((Q) list2.get(i7)).v());
        }
        return new L2.e(map, interfaceC1703c).l1();
    }

    public final void h(W4.e eVar, Collection collection, Collection collection2, InterfaceC2099e interfaceC2099e, l lVar) {
        Integer numB;
        if (eVar == null) {
            a(50);
            throw null;
        }
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (interfaceC2099e == null) {
            a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            InterfaceC2097c interfaceC2097c = (InterfaceC2097c) it.next();
            if (interfaceC2097c == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            w5.h hVar = new w5.h();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                InterfaceC2097c interfaceC2097c2 = (InterfaceC2097c) it2.next();
                int iB = l(interfaceC2097c2, interfaceC2097c, interfaceC2099e).b();
                boolean z7 = !AbstractC2108n.e(interfaceC2097c2.getVisibility()) && AbstractC2108n.c(AbstractC2108n.f16329l, interfaceC2097c2, interfaceC2097c) == null;
                int iB2 = AbstractC1755i.b(iB);
                if (iB2 == 0) {
                    if (z7) {
                        hVar.add(interfaceC2097c2);
                    }
                    arrayList.add(interfaceC2097c2);
                } else if (iB2 == 2) {
                    if (z7) {
                        lVar.d(interfaceC2097c2, interfaceC2097c);
                    }
                    arrayList.add(interfaceC2097c2);
                }
            }
            lVar.p(interfaceC2097c, hVar);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            InterfaceC2105k interfaceC2105kK = ((InterfaceC2097c) linkedHashSet.iterator().next()).k();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((InterfaceC2097c) it3.next()).k() != interfaceC2105kK) {
                        LinkedList<InterfaceC2097c> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            InterfaceC2097c interfaceC2097c3 = null;
                            for (InterfaceC2097c interfaceC2097c4 : linkedList) {
                                if (interfaceC2097c3 == null || ((numB = AbstractC2108n.b(interfaceC2097c3.getVisibility(), interfaceC2097c4.getVisibility())) != null && numB.intValue() < 0)) {
                                    interfaceC2097c3 = interfaceC2097c4;
                                }
                            }
                            kotlin.jvm.internal.l.c(interfaceC2097c3);
                            e(g(interfaceC2097c3, linkedList, new i(1), new L4.l(5, lVar, interfaceC2097c3)), interfaceC2099e, lVar);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((InterfaceC2097c) it4.next()), interfaceC2099e, lVar);
        }
    }

    public final j l(InterfaceC2096b interfaceC2096b, InterfaceC2096b interfaceC2096b2, InterfaceC2099e interfaceC2099e) {
        if (interfaceC2096b == null) {
            a(19);
            throw null;
        }
        if (interfaceC2096b2 != null) {
            return m(interfaceC2096b, interfaceC2096b2, interfaceC2099e, false);
        }
        a(20);
        throw null;
    }

    public final j m(InterfaceC2096b interfaceC2096b, InterfaceC2096b interfaceC2096b2, InterfaceC2099e interfaceC2099e, boolean z7) {
        if (interfaceC2096b == null) {
            a(22);
            throw null;
        }
        if (interfaceC2096b2 == null) {
            a(23);
            throw null;
        }
        j jVarN = n(interfaceC2096b, interfaceC2096b2, z7);
        boolean z8 = jVarN.b() == 1;
        List<f> list = f10273b;
        for (f fVar : list) {
            if (fVar.b() != 1 && (!z8 || fVar.b() != 2)) {
                int iB = AbstractC1755i.b(fVar.a(interfaceC2096b, interfaceC2096b2, interfaceC2099e));
                if (iB == 0) {
                    z8 = true;
                } else if (iB == 1) {
                    return j.c("External condition");
                }
            }
        }
        if (!z8) {
            return jVarN;
        }
        for (f fVar2 : list) {
            if (fVar2.b() == 1) {
                int iB2 = AbstractC1755i.b(fVar2.a(interfaceC2096b, interfaceC2096b2, interfaceC2099e));
                if (iB2 == 0) {
                    throw new IllegalStateException("Contract violation in " + fVar2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (iB2 == 1) {
                    return j.c("External condition");
                }
            }
        }
        j jVar = j.f10271c;
        if (jVar != null) {
            return jVar;
        }
        j.a(0);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        r15.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Z4.j n(u4.InterfaceC2096b r19, u4.InterfaceC2096b r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.k.n(u4.b, u4.b, boolean):Z4.j");
    }
}
