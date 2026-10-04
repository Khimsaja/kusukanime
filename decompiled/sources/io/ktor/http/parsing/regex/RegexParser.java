package io.ktor.http.parsing.regex;

import io.ktor.http.parsing.ParseResult;
import io.ktor.http.parsing.Parser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.C2504i;
import z5.C2506k;
import z5.C2508m;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/http/parsing/regex/RegexParser;", "Lio/ktor/http/parsing/Parser;", "Lz5/m;", "expression", "", "", "", "", "indexes", "<init>", "(Lz5/m;Ljava/util/Map;)V", "input", "Lio/ktor/http/parsing/ParseResult;", "parse", "(Ljava/lang/String;)Lio/ktor/http/parsing/ParseResult;", "", "match", "(Ljava/lang/String;)Z", "Lz5/m;", "Ljava/util/Map;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RegexParser implements Parser {
    private final C2508m expression;
    private final Map<String, List<Integer>> indexes;

    /* JADX WARN: Multi-variable type inference failed */
    public RegexParser(C2508m c2508m, Map<String, ? extends List<Integer>> map) {
        l.f("expression", c2508m);
        l.f("indexes", map);
        this.expression = c2508m;
        this.indexes = map;
    }

    @Override // io.ktor.http.parsing.Parser
    public boolean match(String input) {
        l.f("input", input);
        return this.expression.b(input);
    }

    @Override // io.ktor.http.parsing.Parser
    public ParseResult parse(String input) {
        l.f("input", input);
        C2508m c2508m = this.expression;
        c2508m.getClass();
        Matcher matcher = c2508m.f19061k.matcher(input);
        l.e("matcher(...)", matcher);
        C2506k c2506k = !matcher.matches() ? null : new C2506k(matcher, input);
        if (c2506k != null) {
            String strGroup = c2506k.a.group();
            l.e("group(...)", strGroup);
            if (strGroup.length() == input.length()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, List<Integer>> entry : this.indexes.entrySet()) {
                    String key = entry.getKey();
                    Iterator<T> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        ArrayList arrayList = new ArrayList();
                        C2504i c2504iH = c2506k.f19058c.h(iIntValue);
                        if (c2504iH != null) {
                            arrayList.add(c2504iH.a);
                        }
                        if (!arrayList.isEmpty()) {
                            linkedHashMap.put(key, arrayList);
                        }
                    }
                }
                return new ParseResult(linkedHashMap);
            }
        }
        return null;
    }
}
