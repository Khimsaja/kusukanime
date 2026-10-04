package io.ktor.util;

import B3.t;
import O3.C;
import P3.E;
import P3.m;
import P3.q;
import P3.r;
import P3.v;
import e4.n;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000T\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u001c\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u001aO\u0010\b\u001a\u00020\u000726\u0010\u0004\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u00010\u0000\"\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\f\u001a-\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u000e\u001a\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u000f\u001a1\u0010\b\u001a\u00020\u00072\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0013\u001a#\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0010*\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u0003*\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001b\u001a\u00020\u0019*\u00020\u00072\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001c\u001a5\u0010\u001f\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00052\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010#\u001a\u00020\u0019*\u00020!2\u0006\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00052\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010&\u001a\u00020!*\u00020!2\u0006\u0010%\u001a\u00020!¢\u0006\u0004\b&\u0010'\u001a!\u0010(\u001a\u00020!*\u00020!2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)\u001a!\u0010*\u001a\u00020!*\u00020!2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b*\u0010)\u001a=\u0010&\u001a\u00020!*\u00020!2*\u0010\r\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b&\u0010+\u001aK\u0010&\u001a\u00020!*\u00020!26\u0010\r\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00010\u0000\"\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u0001H\u0007¢\u0006\u0004\b,\u0010+\u001a-\u0010&\u001a\u00020!*\u00020!2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u0010H\u0007¢\u0006\u0004\b,\u0010-\u001a%\u0010&\u001a\u00020!*\u00020!2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b&\u0010-\u001aO\u00102\u001a\u00020\u00052\u001e\u00100\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030/0.2\u001e\u00101\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030/0.H\u0002¢\u0006\u0004\b2\u00103\u001a7\u00107\u001a\u0002052\u001e\u00104\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030/0.2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108¨\u00069"}, d2 = {"", "LO3/l;", "", "", "pairs", "", "caseInsensitiveKey", "Lio/ktor/util/StringValues;", "valuesOf", "([LO3/l;Z)Lio/ktor/util/StringValues;", ContentDisposition.Parameters.Name, "value", "(Ljava/lang/String;Ljava/lang/String;Z)Lio/ktor/util/StringValues;", "values", "(Ljava/lang/String;Ljava/util/List;Z)Lio/ktor/util/StringValues;", "()Lio/ktor/util/StringValues;", "", "", "map", "(Ljava/util/Map;Z)Lio/ktor/util/StringValues;", "toMap", "(Lio/ktor/util/StringValues;)Ljava/util/Map;", "flattenEntries", "(Lio/ktor/util/StringValues;)Ljava/util/List;", "Lkotlin/Function2;", "LO3/C;", "block", "flattenForEach", "(Lio/ktor/util/StringValues;Le4/n;)V", "keepEmpty", "predicate", "filter", "(Lio/ktor/util/StringValues;ZLe4/n;)Lio/ktor/util/StringValues;", "Lio/ktor/util/StringValuesBuilder;", "source", "appendFiltered", "(Lio/ktor/util/StringValuesBuilder;Lio/ktor/util/StringValues;ZLe4/n;)V", "builder", "appendAll", "(Lio/ktor/util/StringValuesBuilder;Lio/ktor/util/StringValuesBuilder;)Lio/ktor/util/StringValuesBuilder;", "appendIfNameAbsent", "(Lio/ktor/util/StringValuesBuilder;Ljava/lang/String;Ljava/lang/String;)Lio/ktor/util/StringValuesBuilder;", "appendIfNameAndValueAbsent", "(Lio/ktor/util/StringValuesBuilder;[LO3/l;)Lio/ktor/util/StringValuesBuilder;", "appendAllIterable", "(Lio/ktor/util/StringValuesBuilder;Ljava/util/Map;)Lio/ktor/util/StringValuesBuilder;", "", "", "a", "b", "entriesEquals", "(Ljava/util/Set;Ljava/util/Set;)Z", "entries", "", "seed", "entriesHashCode", "(Ljava/util/Set;I)I", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StringValuesKt {
    public static final StringValuesBuilder appendAll(StringValuesBuilder stringValuesBuilder, StringValuesBuilder stringValuesBuilder2) {
        l.f("<this>", stringValuesBuilder);
        l.f("builder", stringValuesBuilder2);
        Iterator<T> it = stringValuesBuilder2.entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            stringValuesBuilder.appendAll((String) entry.getKey(), (List) entry.getValue());
        }
        return stringValuesBuilder;
    }

    public static final StringValuesBuilder appendAllIterable(StringValuesBuilder stringValuesBuilder, O3.l... lVarArr) {
        l.f("<this>", stringValuesBuilder);
        l.f("values", lVarArr);
        for (O3.l lVar : lVarArr) {
            stringValuesBuilder.appendAll((String) lVar.f7528k, (Iterable) lVar.f7529l);
        }
        return stringValuesBuilder;
    }

    public static final void appendFiltered(StringValuesBuilder stringValuesBuilder, StringValues stringValues, boolean z7, n nVar) {
        l.f("<this>", stringValuesBuilder);
        l.f("source", stringValues);
        l.f("predicate", nVar);
        stringValues.forEach(new t(z7, stringValuesBuilder, nVar));
    }

    public static /* synthetic */ void appendFiltered$default(StringValuesBuilder stringValuesBuilder, StringValues stringValues, boolean z7, n nVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        appendFiltered(stringValuesBuilder, stringValues, z7, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C appendFiltered$lambda$10(boolean z7, StringValuesBuilder stringValuesBuilder, n nVar, String str, List list) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("value", list);
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (((Boolean) nVar.invoke(str, (String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        if (z7 || !arrayList.isEmpty()) {
            stringValuesBuilder.appendAll(str, arrayList);
        }
        return C.a;
    }

    public static final StringValuesBuilder appendIfNameAbsent(StringValuesBuilder stringValuesBuilder, String str, String str2) {
        l.f("<this>", stringValuesBuilder);
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("value", str2);
        if (!stringValuesBuilder.contains(str)) {
            stringValuesBuilder.append(str, str2);
        }
        return stringValuesBuilder;
    }

    public static final StringValuesBuilder appendIfNameAndValueAbsent(StringValuesBuilder stringValuesBuilder, String str, String str2) {
        l.f("<this>", stringValuesBuilder);
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("value", str2);
        if (!stringValuesBuilder.contains(str, str2)) {
            stringValuesBuilder.append(str, str2);
        }
        return stringValuesBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean entriesEquals(Set<? extends Map.Entry<String, ? extends List<String>>> set, Set<? extends Map.Entry<String, ? extends List<String>>> set2) {
        return l.a(set, set2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int entriesHashCode(Set<? extends Map.Entry<String, ? extends List<String>>> set, int i7) {
        return set.hashCode() + (i7 * 31);
    }

    public static final StringValues filter(StringValues stringValues, boolean z7, n nVar) {
        l.f("<this>", stringValues);
        l.f("predicate", nVar);
        Set<Map.Entry<String, List<String>>> setEntries = stringValues.entries();
        Map mapCaseInsensitiveMap = stringValues.getCaseInsensitiveName() ? CollectionsKt.caseInsensitiveMap() : new LinkedHashMap(setEntries.size());
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(((List) entry.getValue()).size());
            for (Object obj : iterable) {
                if (((Boolean) nVar.invoke(entry.getKey(), (String) obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            if (z7 || !arrayList.isEmpty()) {
                mapCaseInsensitiveMap.put(entry.getKey(), arrayList);
            }
        }
        return new StringValuesImpl(stringValues.getCaseInsensitiveName(), mapCaseInsensitiveMap);
    }

    public static /* synthetic */ StringValues filter$default(StringValues stringValues, boolean z7, n nVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        return filter(stringValues, z7, nVar);
    }

    public static final List<O3.l> flattenEntries(StringValues stringValues) {
        l.f("<this>", stringValues);
        Set<Map.Entry<String, List<String>>> setEntries = stringValues.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(r.p(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new O3.l(entry.getKey(), (String) it2.next()));
            }
            v.e0(arrayList, arrayList2);
        }
        return arrayList;
    }

    public static final void flattenForEach(StringValues stringValues, n nVar) {
        l.f("<this>", stringValues);
        l.f("block", nVar);
        stringValues.forEach(new io.ktor.client.engine.c(nVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C flattenForEach$lambda$6(n nVar, String str, List list) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("items", list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nVar.invoke(str, (String) it.next());
        }
        return C.a;
    }

    public static final Map<String, List<String>> toMap(StringValues stringValues) {
        l.f("<this>", stringValues);
        Set<Map.Entry<String, List<String>>> setEntries = stringValues.entries();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put((String) entry.getKey(), q.S0((Iterable) entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final StringValues valuesOf(O3.l[] lVarArr, boolean z7) {
        l.f("pairs", lVarArr);
        return new StringValuesImpl(z7, E.r0(m.P(lVarArr)));
    }

    public static /* synthetic */ StringValues valuesOf$default(O3.l[] lVarArr, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return valuesOf(lVarArr, z7);
    }

    public static final StringValues valuesOf(String str, String str2, boolean z7) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("value", str2);
        return new StringValuesSingleImpl(z7, str, r.H(str2));
    }

    public static /* synthetic */ StringValues valuesOf$default(String str, String str2, boolean z7, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        return valuesOf(str, str2, z7);
    }

    public static final StringValues valuesOf(String str, List<String> list, boolean z7) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("values", list);
        return new StringValuesSingleImpl(z7, str, list);
    }

    public static /* synthetic */ StringValues valuesOf$default(String str, List list, boolean z7, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        return valuesOf(str, (List<String>) list, z7);
    }

    public static final StringValuesBuilder appendAll(StringValuesBuilder stringValuesBuilder, O3.l... lVarArr) {
        l.f("<this>", stringValuesBuilder);
        l.f("values", lVarArr);
        for (O3.l lVar : lVarArr) {
            stringValuesBuilder.append((String) lVar.f7528k, (String) lVar.f7529l);
        }
        return stringValuesBuilder;
    }

    public static final StringValues valuesOf() {
        return StringValues.INSTANCE.getEmpty();
    }

    public static /* synthetic */ StringValues valuesOf$default(Map map, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return valuesOf((Map<String, ? extends Iterable<String>>) map, z7);
    }

    public static final StringValuesBuilder appendAllIterable(StringValuesBuilder stringValuesBuilder, Map<String, ? extends Iterable<String>> map) {
        l.f("<this>", stringValuesBuilder);
        l.f("values", map);
        for (Map.Entry<String, ? extends Iterable<String>> entry : map.entrySet()) {
            stringValuesBuilder.appendAll(entry.getKey(), entry.getValue());
        }
        return stringValuesBuilder;
    }

    public static final StringValues valuesOf(Map<String, ? extends Iterable<String>> map, boolean z7) {
        l.f("map", map);
        int size = map.size();
        if (size == 1) {
            Map.Entry entry = (Map.Entry) q.J0(map.entrySet());
            return new StringValuesSingleImpl(z7, (String) entry.getKey(), q.S0((Iterable) entry.getValue()));
        }
        Map mapCaseInsensitiveMap = z7 ? CollectionsKt.caseInsensitiveMap() : new LinkedHashMap(size);
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            mapCaseInsensitiveMap.put(entry2.getKey(), q.S0((Iterable) entry2.getValue()));
        }
        return new StringValuesImpl(z7, mapCaseInsensitiveMap);
    }

    public static final StringValuesBuilder appendAll(StringValuesBuilder stringValuesBuilder, Map<String, String> map) {
        l.f("<this>", stringValuesBuilder);
        l.f("values", map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            stringValuesBuilder.append(entry.getKey(), entry.getValue());
        }
        return stringValuesBuilder;
    }
}
