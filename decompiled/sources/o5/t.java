package o5;

import P3.v;
import P3.y;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import n5.B;
import n5.C1567d;
import n5.C1570g;
import n5.C1585w;
import n5.I;
import n5.M;
import n5.a0;

/* loaded from: classes.dex */
public final class t {
    public static final t a = new t();

    public static ArrayList a(AbstractCollection abstractCollection, e4.n nVar) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.l.e("iterator(...)", it);
        while (it.hasNext()) {
            B b4 = (B) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    B b7 = (B) it2.next();
                    if (b7 != b4) {
                        kotlin.jvm.internal.l.c(b7);
                        kotlin.jvm.internal.l.c(b4);
                        if (((Boolean) nVar.invoke(b7, b4)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [n5.I] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, n5.I, t5.d] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v18, types: [n5.B] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, n5.B, n5.x] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final B b(ArrayList arrayList) {
        B b4;
        B b7;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B b8 = (B) it.next();
            if (b8.t0() instanceof C1585w) {
                Collection collectionG = b8.t0().g();
                kotlin.jvm.internal.l.e("getSupertypes(...)", collectionG);
                Collection<AbstractC1586x> collection = collectionG;
                ArrayList arrayList3 = new ArrayList(P3.r.p(collection, 10));
                for (AbstractC1586x abstractC1586x : collection) {
                    kotlin.jvm.internal.l.c(abstractC1586x);
                    B bF = AbstractC1566c.F(abstractC1586x);
                    if (b8.u0()) {
                        bF = bF.x0(true);
                    }
                    arrayList3.add(bF);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(b8);
            }
        }
        s sVarA = s.f13815k;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            sVarA = sVarA.a((a0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            B bX0 = (B) it3.next();
            if (sVarA == s.f13818n) {
                if (bX0 instanceof C1708h) {
                    C1708h c1708h = (C1708h) bX0;
                    kotlin.jvm.internal.l.f("<this>", c1708h);
                    bX0 = new C1708h(c1708h.f13799l, c1708h.f13800m, c1708h.f13801n, c1708h.f13802o, c1708h.f13803p, true);
                }
                kotlin.jvm.internal.l.f("<this>", bX0);
                B bO = C1567d.o(bX0, false);
                bX0 = (bO == null && (bO = AbstractC1566c.o(bX0)) == null) ? bX0.x0(false) : bO;
            }
            linkedHashSet.add(bX0);
        }
        ArrayList arrayList4 = new ArrayList(P3.r.p(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((B) it4.next()).s0());
        }
        Iterator it5 = arrayList4.iterator();
        if (!it5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it5.next();
        while (true) {
            b4 = null;
            if (!it5.hasNext()) {
                break;
            }
            I i7 = (I) it5.next();
            next = (I) next;
            next.getClass();
            kotlin.jvm.internal.l.f("other", i7);
            if (!next.isEmpty() || !i7.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) I.f13362l.f6045l).values();
                kotlin.jvm.internal.l.e("<get-values>(...)", collectionValues);
                Iterator it6 = collectionValues.iterator();
                while (it6.hasNext()) {
                    int iIntValue = ((Number) it6.next()).intValue();
                    C1570g c1570g = (C1570g) next.f16095k.get(iIntValue);
                    C1570g c1570g2 = (C1570g) i7.f16095k.get(iIntValue);
                    if (c1570g != null) {
                        if (!kotlin.jvm.internal.l.a(c1570g2, c1570g)) {
                            c1570g = null;
                        }
                        c1570g2 = c1570g;
                    } else if (c1570g2 == null || !kotlin.jvm.internal.l.a(c1570g, c1570g2)) {
                        c1570g2 = null;
                    }
                    w5.k.a(arrayList5, c1570g2);
                }
                next = L2.e.b1(arrayList5);
            }
        }
        I i8 = (I) next;
        if (linkedHashSet.size() == 1) {
            b7 = (B) P3.q.J0(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new b6.r(2, this, t.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 1));
            arrayListA.isEmpty();
            b5.m[] mVarArr = b5.m.f10953k;
            if (!arrayListA.isEmpty()) {
                Iterator it7 = arrayListA.iterator();
                if (!it7.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                B next2 = it7.next();
                while (it7.hasNext()) {
                    B b9 = (B) it7.next();
                    next2 = next2;
                    if (next2 != 0 && b9 != null) {
                        M mT0 = next2.t0();
                        M mT02 = b9.t0();
                        boolean z7 = mT0 instanceof b5.n;
                        if (z7 && (mT02 instanceof b5.n)) {
                            Set set = ((b5.n) mT0).a;
                            Set set2 = ((b5.n) mT02).a;
                            kotlin.jvm.internal.l.f("<this>", set);
                            kotlin.jvm.internal.l.f("other", set2);
                            Set setW0 = P3.q.W0(set);
                            v.e0(setW0, set2);
                            b5.n nVar = new b5.n(setW0);
                            I.f13362l.getClass();
                            I i9 = I.f13363m;
                            kotlin.jvm.internal.l.f("attributes", i9);
                            next2 = AbstractC1566c.v(p5.l.a(p5.h.f14410m, true, "unknown integer literal type"), y.f7779k, i9, nVar, false);
                        } else if (z7) {
                            if (!((b5.n) mT0).a.contains(b9)) {
                                b9 = null;
                            }
                            next2 = b9;
                        } else if (!(mT02 instanceof b5.n) || !((b5.n) mT02).a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                b4 = next2;
            }
            if (b4 != null) {
                b7 = b4;
            } else {
                InterfaceC1711k.f13810b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new b6.r(2, C1710j.f13809b, C1712l.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 2));
                arrayListA2.isEmpty();
                b7 = arrayListA2.size() < 2 ? (B) P3.q.J0(arrayListA2) : new C1585w(linkedHashSet).b();
            }
        }
        return b7.z0(i8);
    }
}
