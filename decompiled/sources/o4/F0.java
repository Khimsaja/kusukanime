package o4;

import A4.AbstractC0011d;
import A4.C0012e;
import X4.AbstractC0615l;
import b5.C0719a;
import f1.AbstractC0871d;
import f6.AbstractC0905c;
import io.ktor.util.GzipHeaderFlags;
import j5.C1354i;
import j5.C1356k;
import j5.C1365t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l4.InterfaceC1424c;
import l4.InterfaceC1426e;
import n5.AbstractC1586x;
import r4.AbstractC1880i;
import r4.AbstractC1886o;
import r4.EnumC1882k;
import t4.C2053d;
import u4.InterfaceC2096b;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2118y;
import v4.InterfaceC2153a;
import v4.InterfaceC2154b;
import z4.C2489a;
import z4.C2494f;
import z4.C2495g;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public abstract class F0 {
    public static final W4.c a = new W4.c("kotlin.jvm.JvmStatic");

    public static final AbstractC1694t a(InterfaceC1424c interfaceC1424c) {
        AbstractC1694t abstractC1694t = interfaceC1424c instanceof AbstractC1694t ? (AbstractC1694t) interfaceC1424c : null;
        if (abstractC1694t != null) {
            return abstractC1694t;
        }
        C1656J c1656jB = b(interfaceC1424c);
        return c1656jB != null ? c1656jB : c(interfaceC1424c);
    }

    public static final C1656J b(Object obj) {
        C1656J c1656j = obj instanceof C1656J ? (C1656J) obj : null;
        if (c1656j != null) {
            return c1656j;
        }
        kotlin.jvm.internal.i iVar = obj instanceof kotlin.jvm.internal.i ? (kotlin.jvm.internal.i) obj : null;
        InterfaceC1424c interfaceC1424cCompute = iVar != null ? iVar.compute() : null;
        if (interfaceC1424cCompute instanceof C1656J) {
            return (C1656J) interfaceC1424cCompute;
        }
        return null;
    }

    public static final q0 c(Object obj) {
        q0 q0Var = obj instanceof q0 ? (q0) obj : null;
        if (q0Var != null) {
            return q0Var;
        }
        kotlin.jvm.internal.s sVar = obj instanceof kotlin.jvm.internal.s ? (kotlin.jvm.internal.s) obj : null;
        InterfaceC1424c interfaceC1424cCompute = sVar != null ? sVar.compute() : null;
        if (interfaceC1424cCompute instanceof q0) {
            return (q0) interfaceC1424cCompute;
        }
        return null;
    }

    public static final List d(InterfaceC2153a interfaceC2153a) throws NegativeArraySizeException {
        Annotation annotationI;
        kotlin.jvm.internal.l.f("<this>", interfaceC2153a);
        v4.h<InterfaceC2154b> annotations = interfaceC2153a.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2154b interfaceC2154b : annotations) {
            u4.M mL = interfaceC2154b.l();
            if (mL instanceof C2489a) {
                annotationI = ((C2489a) mL).f19030k;
            } else if (mL instanceof C2495g) {
                A4.t tVar = ((C2495g) mL).f19035k;
                C0012e c0012e = tVar instanceof C0012e ? (C0012e) tVar : null;
                annotationI = c0012e != null ? c0012e.a : null;
            } else {
                annotationI = i(interfaceC2154b);
            }
            if (annotationI != null) {
                arrayList.add(annotationI);
            }
        }
        return l(arrayList);
    }

    public static final Object e(Type type) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (cls.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (cls.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (cls.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (cls.equals(Integer.TYPE)) {
            return 0;
        }
        if (cls.equals(Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (cls.equals(Long.TYPE)) {
            return 0L;
        }
        if (cls.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (cls.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final InterfaceC2096b f(Class cls, AbstractC0615l abstractC0615l, T4.g gVar, T4.i iVar, T4.a aVar, e4.n nVar) {
        List list;
        kotlin.jvm.internal.l.f("moduleAnchor", cls);
        kotlin.jvm.internal.l.f("proto", abstractC0615l);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        kotlin.jvm.internal.l.f("metadataVersion", aVar);
        C2494f c2494fA = y0.a(cls);
        if (abstractC0615l instanceof R4.B) {
            list = ((R4.B) abstractC0615l).f8134s;
        } else {
            if (!(abstractC0615l instanceof R4.J)) {
                throw new IllegalStateException(("Unsupported message: " + abstractC0615l).toString());
            }
            list = ((R4.J) abstractC0615l).f8218s;
        }
        List list2 = list;
        C1354i c1354i = c2494fA.a;
        InterfaceC2118y interfaceC2118y = c1354i.f12414b;
        T4.k kVar = T4.k.f9115b;
        kotlin.jvm.internal.l.c(list2);
        return (InterfaceC2096b) nVar.invoke(new C1365t(new C1356k(c1354i, gVar, interfaceC2118y, iVar, kVar, aVar, null, null, list2)), abstractC0615l);
    }

    public static final boolean g(v0 v0Var) {
        InterfaceC1426e interfaceC1426eC = v0Var.c();
        C1649C c1649c = interfaceC1426eC instanceof C1649C ? (C1649C) interfaceC1426eC : null;
        if (c1649c == null || !c1649c.i()) {
            return false;
        }
        D4.M mD = c1649c.D();
        return (mD != null ? mD.f1518m : null) == null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class h(ClassLoader classLoader, W4.b bVar, int i7) {
        kotlin.jvm.internal.l.f("kotlinClassId", bVar);
        String str = C2053d.a;
        W4.b bVarF = C2053d.f(bVar.a().a);
        if (bVarF == null) {
            bVarF = bVar;
        }
        if (!bVarF.equals(bVar)) {
            classLoader = AbstractC0011d.d(O3.C.class);
        }
        String str2 = bVarF.a.a.a;
        String str3 = bVarF.f9616b.a.a;
        if (kotlin.jvm.internal.l.a(str2, "kotlin")) {
            switch (str3.hashCode()) {
                case -901856463:
                    if (str3.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str3.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str3.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str3.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str3.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str3.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str3.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str3.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str3.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i7 > 0) {
            for (int i8 = 0; i8 < i7; i8++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str2.length() > 0) {
            sb.append(str2.concat("."));
        }
        sb.append(AbstractC2517v.Q(str3, '.', '$'));
        if (i7 > 0) {
            sb.append(";");
        }
        return AbstractC0871d.t0(classLoader, sb.toString());
    }

    public static final Annotation i(InterfaceC2154b interfaceC2154b) throws NegativeArraySizeException {
        InterfaceC2099e interfaceC2099eD = d5.e.d(interfaceC2154b);
        Class clsJ = interfaceC2099eD != null ? j(interfaceC2099eD) : null;
        if (clsJ == null) {
            clsJ = null;
        }
        if (clsJ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = interfaceC2154b.b().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            W4.e eVar = (W4.e) entry.getKey();
            b5.g gVar = (b5.g) entry.getValue();
            ClassLoader classLoader = clsJ.getClassLoader();
            kotlin.jvm.internal.l.e("getClassLoader(...)", classLoader);
            Object objK = k(gVar, classLoader);
            O3.l lVar = objK != null ? new O3.l(eVar.b(), objK) : null;
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        Map mapR0 = P3.E.r0(arrayList);
        Set setKeySet = mapR0.keySet();
        ArrayList arrayList2 = new ArrayList(P3.r.p(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(clsJ.getDeclaredMethod((String) it.next(), new Class[0]));
        }
        return (Annotation) AbstractC0905c.i(clsJ, mapR0, arrayList2);
    }

    public static final Class j(InterfaceC2099e interfaceC2099e) {
        kotlin.jvm.internal.l.f("<this>", interfaceC2099e);
        u4.M mL = interfaceC2099e.l();
        kotlin.jvm.internal.l.e("getSource(...)", mL);
        if (mL instanceof P4.n) {
            return ((P4.n) mL).f7811k.a;
        }
        if (mL instanceof C2495g) {
            A4.t tVar = ((C2495g) mL).f19035k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass", tVar);
            return ((A4.p) tVar).a;
        }
        W4.b bVarF = d5.e.f(interfaceC2099e);
        if (bVarF == null) {
            return null;
        }
        return h(AbstractC0011d.d(interfaceC2099e.getClass()), bVarF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object k(b5.g gVar, ClassLoader classLoader) throws NegativeArraySizeException {
        AbstractC1586x abstractC1586x;
        Class clsH;
        if (gVar instanceof C0719a) {
            return i((InterfaceC2154b) ((C0719a) gVar).a);
        }
        int i7 = 0;
        if (gVar instanceof b5.b) {
            b5.b bVar = (b5.b) gVar;
            b5.x xVar = bVar instanceof b5.x ? (b5.x) bVar : null;
            if (xVar != null && (abstractC1586x = xVar.f10955c) != null) {
                Iterable iterable = (Iterable) bVar.a;
                ArrayList arrayList = new ArrayList(P3.r.p(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(k((b5.g) it.next(), classLoader));
                }
                W4.e eVar = AbstractC1880i.f14937e;
                InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
                EnumC1882k enumC1882kR = interfaceC2102hF == null ? null : AbstractC1880i.r(interfaceC2102hF);
                int i8 = enumC1882kR == null ? -1 : E0.a[enumC1882kR.ordinal()];
                Object obj = bVar.a;
                switch (i8) {
                    case -1:
                        if (!AbstractC1880i.y(abstractC1586x)) {
                            throw new IllegalStateException(("Not an array type: " + abstractC1586x).toString());
                        }
                        AbstractC1586x abstractC1586xB = ((n5.Q) P3.q.K0(abstractC1586x.q0())).b();
                        kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB);
                        InterfaceC2102h interfaceC2102hF2 = abstractC1586xB.t0().f();
                        InterfaceC2099e interfaceC2099e = interfaceC2102hF2 instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2102hF2 : null;
                        if (interfaceC2099e == null) {
                            throw new IllegalStateException(("Not a class type: " + abstractC1586xB).toString());
                        }
                        if (AbstractC1880i.G(abstractC1586xB)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i7 < size) {
                                Object obj2 = arrayList.get(i7);
                                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.String", obj2);
                                strArr[i7] = obj2;
                                i7++;
                            }
                            return strArr;
                        }
                        if (AbstractC1880i.b(interfaceC2099e, AbstractC1886o.f14977Q)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i7 < size2) {
                                Object obj3 = arrayList.get(i7);
                                kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.lang.Class<*>", obj3);
                                clsArr[i7] = obj3;
                                i7++;
                            }
                            return clsArr;
                        }
                        W4.b bVarF = d5.e.f(interfaceC2099e);
                        if (bVarF != null && (clsH = h(classLoader, bVarF, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsH, ((List) obj).size());
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>", objNewInstance);
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i7 < size3) {
                                objArr[i7] = arrayList.get(i7);
                                i7++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        throw new D6.r();
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i7 < size4) {
                            Object obj4 = arrayList.get(i7);
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Boolean", obj4);
                            zArr[i7] = ((Boolean) obj4).booleanValue();
                            i7++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i7 < size5) {
                            Object obj5 = arrayList.get(i7);
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Char", obj5);
                            cArr[i7] = ((Character) obj5).charValue();
                            i7++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i7 < size6) {
                            Object obj6 = arrayList.get(i7);
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Byte", obj6);
                            bArr[i7] = ((Byte) obj6).byteValue();
                            i7++;
                        }
                        return bArr;
                    case GzipHeaderFlags.EXTRA /* 4 */:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i7 < size7) {
                            Object obj7 = arrayList.get(i7);
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Short", obj7);
                            sArr[i7] = ((Short) obj7).shortValue();
                            i7++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i7 < size8) {
                            Object obj8 = arrayList.get(i7);
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Int", obj8);
                            iArr[i7] = ((Integer) obj8).intValue();
                            i7++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i7 < size9) {
                            Object obj9 = arrayList.get(i7);
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Float", obj9);
                            fArr[i7] = ((Float) obj9).floatValue();
                            i7++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i7 < size10) {
                            Object obj10 = arrayList.get(i7);
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Long", obj10);
                            jArr[i7] = ((Long) obj10).longValue();
                            i7++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i7 < size11) {
                            Object obj11 = arrayList.get(i7);
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Double", obj11);
                            dArr[i7] = ((Double) obj11).doubleValue();
                            i7++;
                        }
                        return dArr;
                }
            }
        } else if (gVar instanceof b5.i) {
            O3.l lVar = (O3.l) ((b5.i) gVar).a;
            W4.b bVar2 = (W4.b) lVar.f7528k;
            W4.e eVar2 = (W4.e) lVar.f7529l;
            Class clsH2 = h(classLoader, bVar2, 0);
            if (clsH2 != null) {
                return Enum.valueOf(clsH2, eVar2.b());
            }
        } else {
            if (!(gVar instanceof b5.s)) {
                if ((gVar instanceof b5.j) || (gVar instanceof b5.u)) {
                    return null;
                }
                return gVar.b();
            }
            b5.r rVar = (b5.r) ((b5.s) gVar).a;
            if (rVar instanceof b5.q) {
                b5.f fVar = ((b5.q) rVar).a;
                return h(classLoader, fVar.a, fVar.f10948b);
            }
            if (!(rVar instanceof b5.p)) {
                throw new D6.r();
            }
            InterfaceC2102h interfaceC2102hF3 = ((b5.p) rVar).a.t0().f();
            InterfaceC2099e interfaceC2099e2 = interfaceC2102hF3 instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2102hF3 : null;
            if (interfaceC2099e2 != null) {
                return j(interfaceC2099e2);
            }
        }
        return null;
    }

    public static final List l(ArrayList arrayList) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List listH;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (n6.m.F(n6.m.B((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Annotation annotation = (Annotation) it2.next();
                        Class clsF = n6.m.F(n6.m.B(annotation));
                        if (!clsF.getSimpleName().equals("Container") || clsF.getAnnotation(kotlin.jvm.internal.A.class) == null) {
                            listH = P3.r.H(annotation);
                        } else {
                            Object objInvoke = clsF.getDeclaredMethod("value", new Class[0]).invoke(annotation, new Object[0]);
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>", objInvoke);
                            listH = P3.m.P((Annotation[]) objInvoke);
                        }
                        P3.v.e0(arrayList2, listH);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }
}
