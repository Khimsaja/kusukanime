package t4;

import P3.J;
import P3.v;
import e5.EnumC0834d;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class r {
    public static final LinkedHashSet a = J.U(P4.f.h("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f16085b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f16086c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f16087d;

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f16088e;

    /* renamed from: f, reason: collision with root package name */
    public static final LinkedHashSet f16089f;

    /* renamed from: g, reason: collision with root package name */
    public static final LinkedHashSet f16090g;

    static {
        List<EnumC0834d> listI = P3.r.I(EnumC0834d.BOOLEAN, EnumC0834d.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC0834d enumC0834d : listI) {
            W4.c cVar = enumC0834d.f11375n;
            if (cVar == null) {
                EnumC0834d.a(15);
                throw null;
            }
            String strB = cVar.a.g().b();
            kotlin.jvm.internal.l.e("asString(...)", strB);
            v.e0(linkedHashSet, P4.f.g(strB, enumC0834d.f11373l + "Value()" + enumC0834d.c()));
        }
        f16085b = J.T(J.T(J.T(J.T(J.T(J.T(linkedHashSet, P4.f.h("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), P4.f.g("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), P4.f.g("Double", "isInfinite()Z", "isNaN()Z")), P4.f.g("Float", "isInfinite()Z", "isNaN()Z")), P4.f.g("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), P4.f.g("CharSequence", "isEmpty()Z"));
        f16086c = P4.f.h("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f16087d = J.T(J.T(J.T(J.T(J.T(J.T(P4.f.g("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), P4.f.h("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), P4.f.g("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), P4.f.g("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), P4.f.h("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), P4.f.h("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), P4.f.h("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f16088e = J.T(J.T(P4.f.h("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), P4.f.h("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), P4.f.h("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        EnumC0834d enumC0834d2 = EnumC0834d.BOOLEAN;
        EnumC0834d enumC0834d3 = EnumC0834d.BYTE;
        List listI2 = P3.r.I(enumC0834d2, enumC0834d3, EnumC0834d.DOUBLE, EnumC0834d.FLOAT, enumC0834d3, EnumC0834d.INT, EnumC0834d.LONG, EnumC0834d.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listI2.iterator();
        while (it.hasNext()) {
            W4.c cVar2 = ((EnumC0834d) it.next()).f11375n;
            if (cVar2 == null) {
                EnumC0834d.a(15);
                throw null;
            }
            String strB2 = cVar2.a.g().b();
            kotlin.jvm.internal.l.e("asString(...)", strB2);
            String[] strArrA = P4.f.a("Ljava/lang/String;");
            v.e0(linkedHashSet2, P4.f.g(strB2, (String[]) Arrays.copyOf(strArrA, strArrA.length)));
        }
        String[] strArrA2 = P4.f.a("D");
        LinkedHashSet linkedHashSetT = J.T(linkedHashSet2, P4.f.g("Float", (String[]) Arrays.copyOf(strArrA2, strArrA2.length)));
        String[] strArrA3 = P4.f.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f16089f = J.T(linkedHashSetT, P4.f.g("String", (String[]) Arrays.copyOf(strArrA3, strArrA3.length)));
        String[] strArrA4 = P4.f.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f16090g = P4.f.g("Throwable", (String[]) Arrays.copyOf(strArrA4, strArrA4.length));
    }
}
