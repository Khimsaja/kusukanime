package H4;

import P3.J;
import e5.EnumC0834d;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class G {
    public static final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f3701b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3702c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f3703d;

    /* renamed from: e, reason: collision with root package name */
    public static final Set f3704e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set f3705f;

    /* renamed from: g, reason: collision with root package name */
    public static final C f3706g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f3707h;

    /* renamed from: i, reason: collision with root package name */
    public static final LinkedHashMap f3708i;

    /* renamed from: j, reason: collision with root package name */
    public static final HashSet f3709j;

    /* renamed from: k, reason: collision with root package name */
    public static final LinkedHashMap f3710k;

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setV0 = P3.m.v0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(P3.r.p(setV0, 10));
        for (String str : setV0) {
            String strC = EnumC0834d.BOOLEAN.c();
            kotlin.jvm.internal.l.e("getDesc(...)", strC);
            arrayList.add(l.a("java/util/Collection", str, "Ljava/util/Collection;", strC));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(P3.r.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C) it.next()).f3690e);
        }
        f3701b = arrayList2;
        ArrayList arrayList3 = a;
        ArrayList arrayList4 = new ArrayList(P3.r.p(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C) it2.next()).f3687b.b());
        }
        String strConcat = "java/util/".concat("Collection");
        EnumC0834d enumC0834d = EnumC0834d.BOOLEAN;
        String strC2 = enumC0834d.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC2);
        C cA = l.a(strConcat, "contains", "Ljava/lang/Object;", strC2);
        F f5 = F.f3697n;
        O3.l lVar = new O3.l(cA, f5);
        String strConcat2 = "java/util/".concat("Collection");
        String strC3 = enumC0834d.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC3);
        O3.l lVar2 = new O3.l(l.a(strConcat2, "remove", "Ljava/lang/Object;", strC3), f5);
        String strConcat3 = "java/util/".concat("Map");
        String strC4 = enumC0834d.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC4);
        O3.l lVar3 = new O3.l(l.a(strConcat3, "containsKey", "Ljava/lang/Object;", strC4), f5);
        String strConcat4 = "java/util/".concat("Map");
        String strC5 = enumC0834d.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC5);
        O3.l lVar4 = new O3.l(l.a(strConcat4, "containsValue", "Ljava/lang/Object;", strC5), f5);
        String strConcat5 = "java/util/".concat("Map");
        String strC6 = enumC0834d.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC6);
        O3.l lVar5 = new O3.l(l.a(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strC6), f5);
        O3.l lVar6 = new O3.l(l.a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), F.f3698o);
        C cA2 = l.a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        F f7 = F.f3695l;
        O3.l lVar7 = new O3.l(cA2, f7);
        O3.l lVar8 = new O3.l(l.a("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), f7);
        String strConcat6 = "java/util/".concat("List");
        EnumC0834d enumC0834d2 = EnumC0834d.INT;
        String strC7 = enumC0834d2.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC7);
        C cA3 = l.a(strConcat6, "indexOf", "Ljava/lang/Object;", strC7);
        F f8 = F.f3696m;
        O3.l lVar9 = new O3.l(cA3, f8);
        String strConcat7 = "java/util/".concat("List");
        String strC8 = enumC0834d2.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC8);
        Map mapN0 = P3.E.n0(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, new O3.l(l.a(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strC8), f8));
        f3702c = mapN0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P3.F.I(mapN0.size()));
        for (Map.Entry entry : mapN0.entrySet()) {
            linkedHashMap.put(((C) entry.getKey()).f3690e, entry.getValue());
        }
        f3703d = linkedHashMap;
        LinkedHashSet linkedHashSetT = J.T(f3702c.keySet(), a);
        ArrayList arrayList5 = new ArrayList(P3.r.p(linkedHashSetT, 10));
        Iterator it3 = linkedHashSetT.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((C) it3.next()).f3687b);
        }
        f3704e = P3.q.X0(arrayList5);
        ArrayList arrayList6 = new ArrayList(P3.r.p(linkedHashSetT, 10));
        Iterator it4 = linkedHashSetT.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((C) it4.next()).f3690e);
        }
        f3705f = P3.q.X0(arrayList6);
        EnumC0834d enumC0834d3 = EnumC0834d.INT;
        String strC9 = enumC0834d3.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC9);
        C cA4 = l.a("java/util/List", "removeAt", strC9, "Ljava/lang/Object;");
        f3706g = cA4;
        String strConcat8 = "java/lang/".concat("Number");
        String strC10 = EnumC0834d.BYTE.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC10);
        O3.l lVar10 = new O3.l(l.a(strConcat8, "toByte", "", strC10), W4.e.e("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strC11 = EnumC0834d.SHORT.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC11);
        O3.l lVar11 = new O3.l(l.a(strConcat9, "toShort", "", strC11), W4.e.e("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strC12 = enumC0834d3.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC12);
        O3.l lVar12 = new O3.l(l.a(strConcat10, "toInt", "", strC12), W4.e.e("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strC13 = EnumC0834d.LONG.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC13);
        O3.l lVar13 = new O3.l(l.a(strConcat11, "toLong", "", strC13), W4.e.e("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strC14 = EnumC0834d.FLOAT.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC14);
        O3.l lVar14 = new O3.l(l.a(strConcat12, "toFloat", "", strC14), W4.e.e("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strC15 = EnumC0834d.DOUBLE.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC15);
        O3.l lVar15 = new O3.l(l.a(strConcat13, "toDouble", "", strC15), W4.e.e("doubleValue"));
        O3.l lVar16 = new O3.l(cA4, W4.e.e("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strC16 = enumC0834d3.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC16);
        String strC17 = EnumC0834d.CHAR.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC17);
        Map mapN02 = P3.E.n0(lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, lVar16, new O3.l(l.a(strConcat14, "get", strC16, strC17), W4.e.e("charAt")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), W4.e.e("get")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), W4.e.e("set")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), W4.e.e("getAndSet")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), W4.e.e("getAndAdd")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), W4.e.e("addAndGet")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), W4.e.e("get")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), W4.e.e("set")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), W4.e.e("getAndSet")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), W4.e.e("getAndAdd")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), W4.e.e("addAndGet")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), W4.e.e("get")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), W4.e.e("set")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), W4.e.e("getAndSet")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", "Ljava/lang/Object;"), W4.e.e("get")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicReference"), "store", "Ljava/lang/Object;", "V"), W4.e.e("set")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), W4.e.e("getAndSet")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), W4.e.e("get")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), W4.e.e("set")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), W4.e.e("getAndSet")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), W4.e.e("compareAndSet")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), W4.e.e("getAndAdd")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), W4.e.e("addAndGet")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), W4.e.e("get")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), W4.e.e("set")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), W4.e.e("getAndSet")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), W4.e.e("compareAndSet")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), W4.e.e("getAndAdd")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), W4.e.e("addAndGet")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), W4.e.e("get")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), W4.e.e("set")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), W4.e.e("getAndSet")), new O3.l(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), W4.e.e("compareAndSet")));
        f3707h = mapN02;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P3.F.I(mapN02.size()));
        for (Map.Entry entry2 : mapN02.entrySet()) {
            linkedHashMap2.put(((C) entry2.getKey()).f3690e, entry2.getValue());
        }
        f3708i = linkedHashMap2;
        ?? r02 = f3707h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r02.entrySet()) {
            C c2 = (C) entry3.getKey();
            W4.e eVar = (W4.e) entry3.getValue();
            String str2 = c2.a;
            String str3 = c2.f3688c;
            String str4 = c2.f3689d;
            kotlin.jvm.internal.l.f("classInternalName", str2);
            kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
            String str5 = eVar + '(' + str3 + ')' + str4;
            kotlin.jvm.internal.l.f("jvmDescriptor", str5);
            linkedHashSet.add(str2 + '.' + str5);
        }
        Set setKeySet = f3707h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((C) it5.next()).f3687b);
        }
        f3709j = hashSet;
        Set<Map.Entry> setEntrySet = f3707h.entrySet();
        ArrayList arrayList7 = new ArrayList(P3.r.p(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new O3.l(((C) entry4.getKey()).f3687b, entry4.getValue()));
        }
        int I = P3.F.I(P3.r.p(arrayList7, 10));
        if (I < 16) {
            I = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(I);
        Iterator it6 = arrayList7.iterator();
        while (it6.hasNext()) {
            O3.l lVar17 = (O3.l) it6.next();
            linkedHashMap3.put((W4.e) lVar17.f7529l, (W4.e) lVar17.f7528k);
        }
        f3710k = linkedHashMap3;
    }
}
