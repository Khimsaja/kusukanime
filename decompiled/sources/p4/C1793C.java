package p4;

import A4.AbstractC0011d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import o4.AbstractC1654H;
import o4.F0;
import u4.InterfaceC2093I;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2112s;
import z5.AbstractC2510o;

/* renamed from: p4.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1793C implements InterfaceC1801g {
    public final Method a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f14357b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14358c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f14359d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f14360e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
    public C1793C(InterfaceC2112s interfaceC2112s, AbstractC1654H abstractC1654H, String str, List list) {
        ?? H6;
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        kotlin.jvm.internal.l.f("constructorDesc", str);
        Method methodG = abstractC1654H.g("constructor-impl", str);
        kotlin.jvm.internal.l.c(methodG);
        this.a = methodG;
        Method methodG2 = abstractC1654H.g("box-impl", AbstractC2510o.p0(str, "V") + AbstractC0011d.b(abstractC1654H.d()));
        kotlin.jvm.internal.l.c(methodG2);
        this.f14357b = methodG2;
        ArrayList arrayList = new ArrayList(P3.r.p(list, 10));
        Iterator it = list.iterator();
        while (true) {
            List listH = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC1586x type = ((InterfaceC2093I) it.next()).getType();
            kotlin.jvm.internal.l.e("getType(...)", type);
            n5.B b4 = AbstractC1566c.b(type);
            ArrayList arrayListZ = e3.c.z(b4);
            if (arrayListZ == null) {
                Class clsI = e3.c.I(b4);
                if (clsI != null) {
                    listH = P3.r.H(e3.c.y(clsI, interfaceC2112s));
                }
            } else {
                listH = arrayListZ;
            }
            arrayList.add(listH);
        }
        this.f14358c = arrayList;
        ArrayList arrayList2 = new ArrayList(P3.r.p(list, 10));
        int i7 = 0;
        for (Object obj : list) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                P3.r.X();
                throw null;
            }
            InterfaceC2102h interfaceC2102hF = ((InterfaceC2093I) obj).getType().t0().f();
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", interfaceC2102hF);
            InterfaceC2099e interfaceC2099e = (InterfaceC2099e) interfaceC2102hF;
            List list2 = (List) this.f14358c.get(i7);
            if (list2 != null) {
                H6 = new ArrayList(P3.r.p(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    H6.add(((Method) it2.next()).getReturnType());
                }
            } else {
                Class clsJ = F0.j(interfaceC2099e);
                kotlin.jvm.internal.l.c(clsJ);
                H6 = P3.r.H(clsJ);
            }
            arrayList2.add(H6);
            i7 = i8;
        }
        this.f14359d = arrayList2;
        this.f14360e = P3.r.t(arrayList2);
    }

    @Override // p4.InterfaceC1801g
    public final List a() {
        return this.f14360e;
    }

    @Override // p4.InterfaceC1801g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // p4.InterfaceC1801g
    public final /* bridge */ boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @Override // p4.InterfaceC1801g
    public final Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ?? H6;
        kotlin.jvm.internal.l.f("args", objArr);
        ArrayList arrayList = this.f14358c;
        kotlin.jvm.internal.l.f("other", arrayList);
        int length = objArr.length;
        ArrayList arrayList2 = new ArrayList(Math.min(P3.r.p(arrayList, 10), length));
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i7 >= length) {
                break;
            }
            arrayList2.add(new O3.l(objArr[i7], next));
            i7++;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            O3.l lVar = (O3.l) it2.next();
            Object obj = lVar.f7528k;
            List list = (List) lVar.f7529l;
            if (list != null) {
                H6 = new ArrayList(P3.r.p(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    H6.add(((Method) it3.next()).invoke(obj, new Object[0]));
                }
            } else {
                H6 = P3.r.H(obj);
            }
            P3.v.e0(arrayList3, H6);
        }
        Object[] array = arrayList3.toArray(new Object[0]);
        this.a.invoke(null, Arrays.copyOf(array, array.length));
        return this.f14357b.invoke(null, Arrays.copyOf(array, array.length));
    }

    @Override // p4.InterfaceC1801g
    public final Type getReturnType() {
        Class<?> returnType = this.f14357b.getReturnType();
        kotlin.jvm.internal.l.e("getReturnType(...)", returnType);
        return returnType;
    }
}
