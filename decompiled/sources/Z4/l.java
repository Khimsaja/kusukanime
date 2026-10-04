package Z4;

import F2.G;
import P3.q;
import com.kusukanime.BuildConfig;
import f1.AbstractC0871d;
import g5.o;
import h5.C1012a;
import h5.C1013b;
import io.ktor.util.GzipHeaderFlags;
import io.ktor.util.collections.ConcurrentMapKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import l5.C1467t;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import n5.B;
import n5.I;
import n5.b0;
import r4.AbstractC1880i;
import r4.AbstractC1887p;
import u4.AbstractC2108n;
import u4.AbstractC2115v;
import u4.EnumC2100f;
import u4.EnumC2117x;
import u4.InterfaceC2096b;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import u4.InterfaceC2118y;
import u4.K;
import u4.M;
import u4.P;
import v4.C2158f;
import v4.C2159g;
import x4.AbstractC2275b;
import x4.C2263I;
import x4.C2264J;
import x4.C2265K;
import x4.C2266L;
import x4.C2272S;
import x4.C2295v;
import z5.C2508m;

/* loaded from: classes.dex */
public abstract class l {
    public static final G a = new G("ResolutionAnchorProvider", 6);

    /* renamed from: b, reason: collision with root package name */
    public static final G f10276b = new G("StdlibClassFinder", 6);

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 12 || i7 == 23 || i7 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 12 || i7 == 23 || i7 == 25) ? 2 : 3];
        switch (i7) {
            case 1:
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case BuildConfig.VERSION_CODE /* 30 */:
            case ConcurrentMapKt.INITIAL_CAPACITY /* 32 */:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i7 == 12) {
            objArr[1] = "createSetter";
        } else if (i7 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i7 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i7) {
            case 3:
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case BuildConfig.VERSION_CODE /* 30 */:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case ConcurrentMapKt.INITIAL_CAPACITY /* 32 */:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 12 && i7 != 23 && i7 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static final void c(InterfaceC2099e interfaceC2099e, LinkedHashSet linkedHashSet, o oVar, boolean z7) {
        for (InterfaceC2105k interfaceC2105k : AbstractC0871d.Z(oVar, g5.f.f11738o, 2)) {
            if (interfaceC2105k instanceof InterfaceC2099e) {
                InterfaceC2099e interfaceC2099eN0 = (InterfaceC2099e) interfaceC2105k;
                if (interfaceC2099eN0.Q()) {
                    W4.e name = interfaceC2099eN0.getName();
                    kotlin.jvm.internal.l.e("getName(...)", name);
                    InterfaceC2102h interfaceC2102hB = oVar.b(name, C4.c.f962n);
                    interfaceC2099eN0 = interfaceC2102hB instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2102hB : interfaceC2102hB instanceof P ? ((C1467t) ((P) interfaceC2102hB)).N0() : null;
                }
                if (interfaceC2099eN0 == null) {
                    continue;
                } else {
                    if (interfaceC2099e == null) {
                        e.a(27);
                        throw null;
                    }
                    int i7 = e.a;
                    Iterator it = interfaceC2099eN0.v().g().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (e.o((AbstractC1586x) it.next(), interfaceC2099e.a())) {
                                linkedHashSet.add(interfaceC2099eN0);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z7) {
                        o oVarY = interfaceC2099eN0.Y();
                        kotlin.jvm.internal.l.e("getUnsubstitutedInnerClassesScope(...)", oVarY);
                        c(interfaceC2099e, linkedHashSet, oVarY, z7);
                    }
                }
            }
        }
    }

    public static C2295v e(InterfaceC2096b interfaceC2096b, AbstractC1586x abstractC1586x, W4.e eVar, v4.h hVar, int i7) {
        if (interfaceC2096b == null) {
            a(32);
            throw null;
        }
        if (hVar == null) {
            a(33);
            throw null;
        }
        if (abstractC1586x == null) {
            return null;
        }
        C1012a c1012a = new C1012a(interfaceC2096b, abstractC1586x, eVar);
        C2508m c2508m = W4.f.a;
        return new C2295v(interfaceC2096b, c1012a, hVar, W4.e.e(W4.f.f9626b + '_' + i7));
    }

    public static C2264J f(K k7, v4.h hVar) {
        return l(k7, hVar, true, k7.l());
    }

    public static C2265K g(K k7, v4.h hVar) {
        C2158f c2158f = C2159g.a;
        M mL = k7.l();
        if (mL != null) {
            return m(k7, hVar, c2158f, true, k7.getVisibility(), mL);
        }
        a(6);
        throw null;
    }

    public static C2263I h(AbstractC2275b abstractC2275b) {
        if (abstractC2275b == null) {
            a(26);
            throw null;
        }
        InterfaceC2118y interfaceC2118yD = e.d(abstractC2275b);
        kotlin.jvm.internal.l.f("<this>", interfaceC2118yD);
        InterfaceC2099e interfaceC2099eD = AbstractC2115v.d(interfaceC2118yD, W4.h.f9633A);
        if (interfaceC2099eD == null) {
            return null;
        }
        C2158f c2158f = C2159g.a;
        EnumC2117x enumC2117x = EnumC2117x.f16342l;
        H4.o oVar = AbstractC2108n.f16322e;
        C2263I c2263iO0 = C2263I.O0(abstractC2275b, enumC2117x, oVar, false, AbstractC1887p.f15019b, 4, abstractC2275b.l());
        C2264J c2264j = new C2264J(c2263iO0, c2158f, enumC2117x, oVar, false, false, false, 4, null, abstractC2275b.l());
        c2263iO0.R0(c2264j, null, null, null);
        I.f13362l.getClass();
        I i7 = I.f13363m;
        n5.M mV = interfaceC2099eD.v();
        List listSingletonList = Collections.singletonList(new n5.G(abstractC2275b.g()));
        kotlin.jvm.internal.l.f("attributes", i7);
        kotlin.jvm.internal.l.f("constructor", mV);
        kotlin.jvm.internal.l.f("arguments", listSingletonList);
        B bU = AbstractC1566c.u(listSingletonList, i7, mV, false);
        List list = Collections.EMPTY_LIST;
        c2263iO0.U0(bU, list, null, null, list);
        c2264j.Q0(c2263iO0.getReturnType());
        return c2263iO0;
    }

    public static C2266L i(AbstractC2275b abstractC2275b) {
        if (abstractC2275b == null) {
            a(24);
            throw null;
        }
        C2158f c2158f = C2159g.a;
        C2266L c2266lY0 = C2266L.Y0(abstractC2275b, AbstractC1887p.f15020c, 4, abstractC2275b.l());
        C2272S c2272s = new C2272S(c2266lY0, null, 0, c2158f, W4.e.e("value"), d5.e.e(abstractC2275b).u(), false, false, false, null, abstractC2275b.l());
        List list = Collections.EMPTY_LIST;
        return c2266lY0.S0(null, null, list, list, Collections.singletonList(c2272s), abstractC2275b.g(), EnumC2117x.f16342l, AbstractC2108n.f16322e);
    }

    public static C2266L j(AbstractC2275b abstractC2275b) {
        if (abstractC2275b == null) {
            a(22);
            throw null;
        }
        C2266L c2266lY0 = C2266L.Y0(abstractC2275b, AbstractC1887p.a, 4, abstractC2275b.l());
        List list = Collections.EMPTY_LIST;
        AbstractC1880i abstractC1880iE = d5.e.e(abstractC2275b);
        b0 b0Var = b0.f13390m;
        return c2266lY0.S0(null, null, list, list, list, abstractC1880iE.h(abstractC2275b.g()), EnumC2117x.f16342l, AbstractC2108n.f16322e);
    }

    public static C2295v k(InterfaceC2096b interfaceC2096b, AbstractC1586x abstractC1586x, v4.h hVar) {
        if (abstractC1586x == null) {
            return null;
        }
        return new C2295v(interfaceC2096b, new C1013b(interfaceC2096b, abstractC1586x), hVar);
    }

    public static C2264J l(K k7, v4.h hVar, boolean z7, M m7) {
        if (hVar == null) {
            a(18);
            throw null;
        }
        if (m7 != null) {
            return new C2264J(k7, hVar, k7.e(), k7.getVisibility(), z7, false, false, 1, null, m7);
        }
        a(19);
        throw null;
    }

    public static C2265K m(K k7, v4.h hVar, v4.h hVar2, boolean z7, H4.o oVar, M m7) {
        if (hVar == null) {
            a(8);
            throw null;
        }
        if (hVar2 == null) {
            a(9);
            throw null;
        }
        if (oVar == null) {
            a(10);
            throw null;
        }
        if (m7 == null) {
            a(11);
            throw null;
        }
        C2265K c2265k = new C2265K(k7, hVar, k7.e(), oVar, z7, false, false, 1, null, m7);
        c2265k.f17397w = C2265K.P0(c2265k, k7.getType(), hVar2);
        return c2265k;
    }

    public static boolean n(InterfaceC2112s interfaceC2112s) {
        if (interfaceC2112s.c() != 4) {
            return false;
        }
        InterfaceC2105k interfaceC2105kK = interfaceC2112s.k();
        int i7 = e.a;
        return e.m(interfaceC2105kK, EnumC2100f.f16313m);
    }

    public static final Collection o(Collection collection, e4.k kVar) {
        kotlin.jvm.internal.l.f("<this>", collection);
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        w5.h hVar = new w5.h();
        while (!linkedList.isEmpty()) {
            Object objR0 = q.r0(linkedList);
            w5.h hVar2 = new w5.h();
            ArrayList arrayListG = k.g(objR0, linkedList, kVar, new A4.j(13, hVar2));
            if (arrayListG.size() == 1 && hVar2.isEmpty()) {
                Object objJ0 = q.J0(arrayListG);
                kotlin.jvm.internal.l.e("single(...)", objJ0);
                hVar.add(objJ0);
            } else {
                Object objS = k.s(arrayListG, kVar);
                InterfaceC2096b interfaceC2096b = (InterfaceC2096b) kVar.invoke(objS);
                Iterator it = arrayListG.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    kotlin.jvm.internal.l.c(next);
                    if (!k.k(interfaceC2096b, (InterfaceC2096b) kVar.invoke(next))) {
                        hVar2.add(next);
                    }
                }
                if (!hVar2.isEmpty()) {
                    hVar.addAll(hVar2);
                }
                hVar.add(objS);
            }
        }
        return hVar;
    }

    public abstract void b(InterfaceC2097c interfaceC2097c);

    public abstract void d(InterfaceC2097c interfaceC2097c, InterfaceC2097c interfaceC2097c2);

    public void p(InterfaceC2097c interfaceC2097c, Collection collection) {
        kotlin.jvm.internal.l.f("member", interfaceC2097c);
        interfaceC2097c.W(collection);
    }
}
