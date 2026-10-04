package io.ktor.http.parsing.regex;

import A6.b;
import P3.r;
import io.ktor.http.parsing.AnyOfGrammar;
import io.ktor.http.parsing.AtLeastOne;
import io.ktor.http.parsing.ComplexGrammar;
import io.ktor.http.parsing.Grammar;
import io.ktor.http.parsing.ManyGrammar;
import io.ktor.http.parsing.MaybeGrammar;
import io.ktor.http.parsing.NamedGrammar;
import io.ktor.http.parsing.OrGrammar;
import io.ktor.http.parsing.Parser;
import io.ktor.http.parsing.RangeGrammar;
import io.ktor.http.parsing.RawGrammar;
import io.ktor.http.parsing.SimpleGrammar;
import io.ktor.http.parsing.StringGrammar;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.C2508m;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aA\u0010\r\u001a\u00020\f*\u00020\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u0012\u001a\u00020\u0011*\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/http/parsing/Grammar;", "Lio/ktor/http/parsing/Parser;", "buildRegexParser", "(Lio/ktor/http/parsing/Grammar;)Lio/ktor/http/parsing/Parser;", "", "", "", "", "groups", "offset", "", "shouldGroup", "Lio/ktor/http/parsing/regex/GrammarRegex;", "toRegex", "(Lio/ktor/http/parsing/Grammar;Ljava/util/Map;IZ)Lio/ktor/http/parsing/regex/GrammarRegex;", "key", "value", "LO3/C;", "add", "(Ljava/util/Map;Ljava/lang/String;I)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RegexParserGeneratorKt {
    private static final void add(Map<String, List<Integer>> map, String str, int i7) {
        if (!map.containsKey(str)) {
            map.put(str, new ArrayList());
        }
        Integer numValueOf = Integer.valueOf(i7);
        List<Integer> list = map.get(str);
        l.c(list);
        list.add(numValueOf);
    }

    public static final Parser buildRegexParser(Grammar grammar) {
        l.f("<this>", grammar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        return new RegexParser(new C2508m(toRegex$default(grammar, linkedHashMap, 0, false, 6, null).getRegex()), linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final GrammarRegex toRegex(Grammar grammar, Map<String, List<Integer>> map, int i7, boolean z7) {
        char c2;
        if (grammar instanceof StringGrammar) {
            String value = ((StringGrammar) grammar).getValue();
            l.f("literal", value);
            String strQuote = Pattern.quote(value);
            l.e("quote(...)", strQuote);
            return new GrammarRegex(strQuote, 0, false, 6, null);
        }
        if (grammar instanceof RawGrammar) {
            return new GrammarRegex(((RawGrammar) grammar).getValue(), 0, false, 6, null);
        }
        if (grammar instanceof NamedGrammar) {
            NamedGrammar namedGrammar = (NamedGrammar) grammar;
            GrammarRegex regex$default = toRegex$default(namedGrammar.getGrammar(), map, i7 + 1, false, 4, null);
            add(map, namedGrammar.getName(), i7);
            return new GrammarRegex(regex$default.getRegex(), regex$default.getGroupsCount(), true);
        }
        if (grammar instanceof ComplexGrammar) {
            StringBuilder sb = new StringBuilder();
            int groupsCount = z7 ? i7 + 1 : i7;
            int i8 = 0;
            for (Object obj : ((ComplexGrammar) grammar).getGrammars()) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    r.X();
                    throw null;
                }
                GrammarRegex regex = toRegex((Grammar) obj, map, groupsCount, true);
                if (i8 != 0 && (grammar instanceof OrGrammar)) {
                    sb.append("|");
                }
                sb.append(regex.getRegex());
                groupsCount += regex.getGroupsCount();
                i8 = i9;
            }
            int i10 = groupsCount - i7;
            if (z7) {
                i10--;
            }
            String string = sb.toString();
            l.e("toString(...)", string);
            return new GrammarRegex(string, i10, z7);
        }
        if (grammar instanceof SimpleGrammar) {
            if (grammar instanceof MaybeGrammar) {
                c2 = '?';
            } else if (grammar instanceof ManyGrammar) {
                c2 = GMTDateParser.ANY;
            } else {
                if (!(grammar instanceof AtLeastOne)) {
                    throw new IllegalStateException(("Unsupported simple grammar element: " + grammar).toString());
                }
                c2 = '+';
            }
            GrammarRegex regex2 = toRegex(((SimpleGrammar) grammar).getGrammar(), map, i7, true);
            return new GrammarRegex(b.j(new StringBuilder(), regex2.getRegex(), c2), regex2.getGroupsCount(), false, 4, null);
        }
        if (grammar instanceof AnyOfGrammar) {
            StringBuilder sb2 = new StringBuilder("[");
            String value2 = ((AnyOfGrammar) grammar).getValue();
            l.f("literal", value2);
            String strQuote2 = Pattern.quote(value2);
            l.e("quote(...)", strQuote2);
            sb2.append(strQuote2);
            sb2.append(']');
            return new GrammarRegex(sb2.toString(), 0, false, 6, null);
        }
        if (!(grammar instanceof RangeGrammar)) {
            throw new IllegalStateException(("Unsupported grammar element: " + grammar).toString());
        }
        StringBuilder sb3 = new StringBuilder("[");
        RangeGrammar rangeGrammar = (RangeGrammar) grammar;
        sb3.append(rangeGrammar.getFrom());
        sb3.append('-');
        sb3.append(rangeGrammar.getTo());
        sb3.append(']');
        return new GrammarRegex(sb3.toString(), 0, false, 6, null);
    }

    public static /* synthetic */ GrammarRegex toRegex$default(Grammar grammar, Map map, int i7, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 1;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return toRegex(grammar, map, i7, z7);
    }
}
