package io.github.jan.supabase.postgrest;

import P3.F;
import P3.q;
import io.github.jan.supabase.annotations.SupabaseInternal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.C2508m;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0003H\u0001\u001a0\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006*\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00070\u0005H\u0001\u001a\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\"\u0006\b\u0000\u0010\u0006\u0018\u0001H\u0087\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"SNAKE_CASE_REGEX", "Lkotlin/text/Regex;", "camelToSnakeCase", "", "mapToFirstValue", "", "T", "", "classPropertyNames", "postgrest-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UtilsKt {
    private static final C2508m SNAKE_CASE_REGEX = new C2508m("([a-z0-9])([A-Z])");

    @SupabaseInternal
    public static final String camelToSnakeCase(String str) {
        l.f("<this>", str);
        C2508m c2508m = SNAKE_CASE_REGEX;
        c2508m.getClass();
        String strReplaceAll = c2508m.f19061k.matcher(str).replaceAll("$1_$2");
        l.e("replaceAll(...)", strReplaceAll);
        String lowerCase = strReplaceAll.toLowerCase(Locale.ROOT);
        l.e("toLowerCase(...)", lowerCase);
        return lowerCase;
    }

    @SupabaseInternal
    public static final <T> List<String> classPropertyNames() {
        l.k();
        throw null;
    }

    public static final <T> Map<T, T> mapToFirstValue(Map<T, ? extends List<? extends T>> map) {
        l.f("<this>", map);
        LinkedHashMap linkedHashMap = new LinkedHashMap(F.I(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), q.r0((List) entry.getValue()));
        }
        return linkedHashMap;
    }
}
