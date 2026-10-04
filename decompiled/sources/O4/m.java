package O4;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class m {
    public static final e a = new e(h.f7563l, false);

    /* renamed from: b, reason: collision with root package name */
    public static final e f7574b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f7575c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f7576d;

    static {
        h hVar = h.f7564m;
        f7574b = new e(hVar, false);
        f7575c = new e(hVar, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        q qVar = new q(0);
        new L2.e(qVar, "java/util/".concat("Iterator")).g1("forEachRemaining", new j(strConcat4, 0), null);
        new L2.e(qVar, "java/lang/".concat("Iterable")).g1("spliterator", new o(4), null);
        L2.e eVar = new L2.e(qVar, "java/util/".concat("Collection"));
        eVar.g1("removeIf", new j(strConcat2, 17), null);
        eVar.g1("stream", new j(strConcat8, 26), null);
        eVar.g1("parallelStream", new l(strConcat8, 1), null);
        L2.e eVar2 = new L2.e(qVar, "java/util/".concat("List"));
        eVar2.g1("replaceAll", new l(strConcat7, 2), null);
        eVar2.g1("addFirst", new l(strConcat, 3), "2.1");
        eVar2.g1("addLast", new l(strConcat, 4), "2.1");
        eVar2.g1("removeFirst", new l(strConcat, 5), "2.1");
        eVar2.g1("removeLast", new l(strConcat, 6), "2.1");
        L2.e eVar3 = new L2.e(qVar, "java/util/".concat("LinkedList"));
        eVar3.g1("addFirst", new j(strConcat, 1), "2.1");
        eVar3.g1("addLast", new j(strConcat, 2), "2.1");
        eVar3.g1("removeFirst", new j(strConcat, 3), "2.1");
        eVar3.g1("removeLast", new j(strConcat, 4), "2.1");
        L2.e eVar4 = new L2.e(qVar, "java/util/".concat("LinkedHashSet"));
        eVar4.g1("addFirst", new j(strConcat, 5), "2.2");
        eVar4.g1("addLast", new j(strConcat, 6), "2.2");
        eVar4.g1("removeFirst", new j(strConcat, 7), "2.2");
        eVar4.g1("removeLast", new j(strConcat, 8), "2.2");
        eVar4.g1("getFirst", new j(strConcat, 9), "2.2");
        eVar4.g1("getLast", new j(strConcat, 10), "2.2");
        L2.e eVar5 = new L2.e(qVar, "java/util/".concat("Map"));
        eVar5.g1("forEach", new j(strConcat6, 11), null);
        eVar5.g1("putIfAbsent", new j(strConcat, 12), null);
        eVar5.g1("replace", new j(strConcat, 13), null);
        eVar5.g1("replace", new j(strConcat, 14), null);
        eVar5.g1("replaceAll", new j(strConcat5, 15), null);
        eVar5.g1("compute", new k(strConcat, strConcat5, 0), null);
        eVar5.g1("computeIfAbsent", new k(strConcat, strConcat3, 1), null);
        eVar5.g1("computeIfPresent", new k(strConcat, strConcat5, 2), null);
        eVar5.g1("merge", new k(strConcat, strConcat5, 3), null);
        L2.e eVar6 = new L2.e(qVar, "java/util/".concat("LinkedHashMap"));
        eVar6.g1("putFirst", new j(strConcat, 16), "2.2");
        eVar6.g1("putLast", new j(strConcat, 18), "2.2");
        L2.e eVar7 = new L2.e(qVar, strConcat9);
        eVar7.g1("empty", new j(strConcat9, 19), null);
        eVar7.g1("of", new k(strConcat, strConcat9, 4), null);
        eVar7.g1("ofNullable", new k(strConcat, strConcat9, 5), null);
        eVar7.g1("get", new j(strConcat, 20), null);
        eVar7.g1("ifPresent", new j(strConcat4, 21), null);
        new L2.e(qVar, "java/lang/".concat("ref/Reference")).g1("get", new j(strConcat, 22), null);
        new L2.e(qVar, strConcat2).g1("test", new j(strConcat, 23), null);
        new L2.e(qVar, "java/util/function/".concat("BiPredicate")).g1("test", new j(strConcat, 24), null);
        new L2.e(qVar, strConcat4).g1("accept", new j(strConcat, 25), null);
        new L2.e(qVar, strConcat6).g1("accept", new j(strConcat, 27), null);
        new L2.e(qVar, strConcat3).g1("apply", new j(strConcat, 28), null);
        new L2.e(qVar, strConcat5).g1("apply", new j(strConcat, 29), null);
        new L2.e(qVar, "java/util/function/".concat("Supplier")).g1("get", new l(strConcat, 0), null);
        f7576d = qVar.a;
    }
}
