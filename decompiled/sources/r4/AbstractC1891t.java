package r4;

import P3.E;
import P3.F;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import n5.AbstractC1586x;
import n5.Y;
import u4.InterfaceC2088D;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;
import x4.AbstractC2257C;

/* renamed from: r4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1891t {
    public static final Set a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f15045b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f15046c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f15047d;

    static {
        EnumC1890s[] enumC1890sArrValues = EnumC1890s.values();
        ArrayList arrayList = new ArrayList(enumC1890sArrValues.length);
        for (EnumC1890s enumC1890s : enumC1890sArrValues) {
            arrayList.add(enumC1890s.f15043l);
        }
        a = P3.q.X0(arrayList);
        EnumC1889r[] enumC1889rArrValues = EnumC1889r.values();
        ArrayList arrayList2 = new ArrayList(enumC1889rArrValues.length);
        for (EnumC1889r enumC1889r : enumC1889rArrValues) {
            arrayList2.add(enumC1889r.f15040k);
        }
        P3.q.X0(arrayList2);
        f15045b = new HashMap();
        f15046c = new HashMap();
        E.p0(new HashMap(F.I(4)), new O3.l[]{new O3.l(EnumC1889r.f15035l, W4.e.e("ubyteArrayOf")), new O3.l(EnumC1889r.f15036m, W4.e.e("ushortArrayOf")), new O3.l(EnumC1889r.f15037n, W4.e.e("uintArrayOf")), new O3.l(EnumC1889r.f15038o, W4.e.e("ulongArrayOf"))});
        EnumC1890s[] enumC1890sArrValues2 = EnumC1890s.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC1890s enumC1890s2 : enumC1890sArrValues2) {
            linkedHashSet.add(enumC1890s2.f15044m.f());
        }
        f15047d = linkedHashSet;
        for (EnumC1890s enumC1890s3 : EnumC1890s.values()) {
            HashMap map = f15045b;
            W4.b bVar = enumC1890s3.f15044m;
            W4.b bVar2 = enumC1890s3.f15042k;
            map.put(bVar, bVar2);
            f15046c.put(bVar2, enumC1890s3.f15044m);
        }
    }

    public static final boolean a(AbstractC1586x abstractC1586x) {
        InterfaceC2102h interfaceC2102hF;
        if (Y.l(abstractC1586x) || (interfaceC2102hF = abstractC1586x.t0().f()) == null) {
            return false;
        }
        InterfaceC2105k interfaceC2105kK = interfaceC2102hF.k();
        return (interfaceC2105kK instanceof InterfaceC2088D) && kotlin.jvm.internal.l.a(((AbstractC2257C) ((InterfaceC2088D) interfaceC2105kK)).f17354o, AbstractC1887p.f15028k) && a.contains(interfaceC2102hF.getName());
    }
}
