package io.ktor.http;

import O3.i;
import O3.j;
import P3.q;
import P3.r;
import P3.y;
import io.ktor.http.ContentType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\u0005\u001a%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\b\u0010\u000b\u001a)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\r0\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0011*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aE\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u001c\u0010\u001c\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u001aj\b\u0012\u0004\u0012\u00020\u0003`\u001b0\u00122\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a=\u0010 \u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u001c\u0010\u001f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u001aj\b\u0012\u0004\u0012\u00020\u000e`\u001b0\u0012H\u0002¢\u0006\u0004\b \u0010!\u001a+\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00000\r2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b#\u0010$\u001a+\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00000\r2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010$\u001a\u001b\u0010&\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"", "header", "", "Lio/ktor/http/HeaderValue;", "parseAndSortHeader", "(Ljava/lang/String;)Ljava/util/List;", "parseAndSortContentTypeHeader", ContentType.Text.TYPE, "parseHeaderValue", "", "parametersOnly", "(Ljava/lang/String;Z)Ljava/util/List;", "", "LO3/l;", "Lio/ktor/http/HeaderValueParam;", "toHeaderParamsList", "(Ljava/lang/Iterable;)Ljava/util/List;", "T", "LO3/i;", "valueOrEmpty", "(LO3/i;)Ljava/util/List;", "", "start", "end", "subtrim", "(Ljava/lang/String;II)Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "items", "parseHeaderValueItem", "(Ljava/lang/String;ILO3/i;Z)I", "parameters", "parseHeaderValueParameter", "(Ljava/lang/String;ILO3/i;)I", "value", "parseHeaderValueParameterValue", "(Ljava/lang/String;I)LO3/l;", "parseHeaderValueParameterValueQuoted", "nextIsDelimiterOrEnd", "(Ljava/lang/String;I)Z", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpHeaderValueParserKt {
    private static final boolean nextIsDelimiterOrEnd(String str, int i7) {
        int i8 = i7 + 1;
        while (i8 < str.length() && str.charAt(i8) == ' ') {
            i8++;
        }
        return i8 == str.length() || str.charAt(i8) == ';' || str.charAt(i8) == ',';
    }

    public static final List<HeaderValue> parseAndSortContentTypeHeader(String str) {
        List<HeaderValue> headerValue = parseHeaderValue(str);
        final Comparator comparator = new Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t8) {
                return z1.c.h(Double.valueOf(((HeaderValue) t8).getQuality()), Double.valueOf(((HeaderValue) t7).getQuality()));
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t8) throws BadContentTypeFormatException {
                int iCompare = comparator.compare(t7, t8);
                if (iCompare != 0) {
                    return iCompare;
                }
                ContentType.Companion companion = ContentType.INSTANCE;
                ContentType contentType = companion.parse(((HeaderValue) t7).getValue());
                int i7 = l.a(contentType.getContentType(), "*") ? 2 : 0;
                if (l.a(contentType.getContentSubtype(), "*")) {
                    i7++;
                }
                Integer numValueOf = Integer.valueOf(i7);
                ContentType contentType2 = companion.parse(((HeaderValue) t8).getValue());
                int i8 = l.a(contentType2.getContentType(), "*") ? 2 : 0;
                if (l.a(contentType2.getContentSubtype(), "*")) {
                    i8++;
                }
                return z1.c.h(numValueOf, Integer.valueOf(i8));
            }
        };
        return q.O0(headerValue, new Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t8) {
                int iCompare = comparator2.compare(t7, t8);
                return iCompare != 0 ? iCompare : z1.c.h(Integer.valueOf(((HeaderValue) t8).getParams().size()), Integer.valueOf(((HeaderValue) t7).getParams().size()));
            }
        });
    }

    public static final List<HeaderValue> parseAndSortHeader(String str) {
        return q.O0(parseHeaderValue(str), new Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortHeader$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t8) {
                return z1.c.h(Double.valueOf(((HeaderValue) t8).getQuality()), Double.valueOf(((HeaderValue) t7).getQuality()));
            }
        });
    }

    public static final List<HeaderValue> parseHeaderValue(String str) {
        return parseHeaderValue(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList parseHeaderValue$lambda$4() {
        return new ArrayList();
    }

    private static final int parseHeaderValueItem(String str, int i7, i iVar, boolean z7) {
        i iVarB = z1.c.B(j.f7526l, new c(10));
        Integer numValueOf = z7 ? Integer.valueOf(i7) : null;
        int headerValueParameter = i7;
        while (headerValueParameter <= AbstractC2510o.b0(str)) {
            char cCharAt = str.charAt(headerValueParameter);
            if (cCharAt == ',') {
                ((ArrayList) iVar.getValue()).add(new HeaderValue(subtrim(str, i7, numValueOf != null ? numValueOf.intValue() : headerValueParameter), valueOrEmpty(iVarB)));
                return headerValueParameter + 1;
            }
            if (cCharAt != ';') {
                headerValueParameter = z7 ? parseHeaderValueParameter(str, headerValueParameter, iVarB) : headerValueParameter + 1;
            } else {
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(headerValueParameter);
                }
                headerValueParameter = parseHeaderValueParameter(str, headerValueParameter + 1, iVarB);
            }
        }
        ((ArrayList) iVar.getValue()).add(new HeaderValue(subtrim(str, i7, numValueOf != null ? numValueOf.intValue() : headerValueParameter), valueOrEmpty(iVarB)));
        return headerValueParameter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList parseHeaderValueItem$lambda$6() {
        return new ArrayList();
    }

    private static final int parseHeaderValueParameter(String str, int i7, i iVar) {
        int i8 = i7;
        while (i8 <= AbstractC2510o.b0(str)) {
            char cCharAt = str.charAt(i8);
            if (cCharAt == ',' || cCharAt == ';') {
                parseHeaderValueParameter$addParam(iVar, str, i7, i8, "");
                return i8;
            }
            if (cCharAt == '=') {
                O3.l headerValueParameterValue = parseHeaderValueParameterValue(str, i8 + 1);
                int iIntValue = ((Number) headerValueParameterValue.f7528k).intValue();
                parseHeaderValueParameter$addParam(iVar, str, i7, i8, (String) headerValueParameterValue.f7529l);
                return iIntValue;
            }
            i8++;
        }
        parseHeaderValueParameter$addParam(iVar, str, i7, i8, "");
        return i8;
    }

    private static final void parseHeaderValueParameter$addParam(i iVar, String str, int i7, int i8, String str2) {
        String strSubtrim = subtrim(str, i7, i8);
        if (strSubtrim.length() == 0) {
            return;
        }
        ((ArrayList) iVar.getValue()).add(new HeaderValueParam(strSubtrim, str2));
    }

    private static final O3.l parseHeaderValueParameterValue(String str, int i7) {
        if (str.length() == i7) {
            return new O3.l(Integer.valueOf(i7), "");
        }
        if (str.charAt(i7) == '\"') {
            return parseHeaderValueParameterValueQuoted(str, i7 + 1);
        }
        int i8 = i7;
        while (i8 <= AbstractC2510o.b0(str)) {
            char cCharAt = str.charAt(i8);
            if (cCharAt == ',' || cCharAt == ';') {
                return new O3.l(Integer.valueOf(i8), subtrim(str, i7, i8));
            }
            i8++;
        }
        return new O3.l(Integer.valueOf(i8), subtrim(str, i7, i8));
    }

    private static final O3.l parseHeaderValueParameterValueQuoted(String str, int i7) {
        StringBuilder sb = new StringBuilder();
        while (i7 <= AbstractC2510o.b0(str)) {
            char cCharAt = str.charAt(i7);
            if (cCharAt == '\"' && nextIsDelimiterOrEnd(str, i7)) {
                return new O3.l(Integer.valueOf(i7 + 1), sb.toString());
            }
            if (cCharAt != '\\' || i7 >= AbstractC2510o.b0(str) - 2) {
                sb.append(cCharAt);
                i7++;
            } else {
                sb.append(str.charAt(i7 + 1));
                i7 += 2;
            }
        }
        Integer numValueOf = Integer.valueOf(i7);
        String string = sb.toString();
        l.e("toString(...)", string);
        return new O3.l(numValueOf, "\"".concat(string));
    }

    private static final String subtrim(String str, int i7, int i8) {
        String strSubstring = str.substring(i7, i8);
        l.e("substring(...)", strSubstring);
        return AbstractC2510o.J0(strSubstring).toString();
    }

    public static final List<HeaderValueParam> toHeaderParamsList(Iterable<O3.l> iterable) {
        l.f("<this>", iterable);
        ArrayList arrayList = new ArrayList(r.p(iterable, 10));
        for (O3.l lVar : iterable) {
            arrayList.add(new HeaderValueParam((String) lVar.f7528k, (String) lVar.f7529l));
        }
        return arrayList;
    }

    private static final <T> List<T> valueOrEmpty(i iVar) {
        return iVar.a() ? (List) iVar.getValue() : y.f7779k;
    }

    public static final List<HeaderValue> parseHeaderValue(String str, boolean z7) {
        if (str == null) {
            return y.f7779k;
        }
        i iVarB = z1.c.B(j.f7526l, new c(9));
        int headerValueItem = 0;
        while (headerValueItem <= AbstractC2510o.b0(str)) {
            headerValueItem = parseHeaderValueItem(str, headerValueItem, iVarB, z7);
        }
        return valueOrEmpty(iVarB);
    }
}
