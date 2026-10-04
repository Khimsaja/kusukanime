package io.ktor.http.auth;

import A3.e;
import P3.m;
import P3.y;
import e3.c;
import io.ktor.http.CookieUtilsKt;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.http.parsing.ParseException;
import io.ktor.util.date.GMTDateParser;
import io.ktor.utils.io.InternalAPI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.C2506k;
import z5.C2508m;
import z5.InterfaceC2505j;

@Metadata(d1 = {"\u0000L\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0002¢\u0006\u0004\b\u0003\u0010\f\u001a7\u0010\u000f\u001a\u0004\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001c\u001a\u00020\b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001e\u001a\u00020\b*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0017\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\u001f*\u00020\u001aH\u0002¢\u0006\u0004\b\"\u0010!\"\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%\"\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\"\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)¨\u0006+"}, d2 = {"", "headerValue", "Lio/ktor/http/auth/HttpAuthHeader;", "parseAuthorizationHeader", "(Ljava/lang/String;)Lio/ktor/http/auth/HttpAuthHeader;", "", "parseAuthorizationHeaders", "(Ljava/lang/String;)Ljava/util/List;", "", "startIndex", "", "headers", "(Ljava/lang/String;ILjava/util/List;)I", "header", "index", "nextChallengeIndex", "(Ljava/util/List;Lio/ktor/http/auth/HttpAuthHeader;ILjava/lang/String;)Ljava/lang/Integer;", "", "parameters", "matchParameters", "(Ljava/lang/String;ILjava/util/Map;)I", "matchParameter", "matchToken68", "(Ljava/lang/String;I)I", "unescaped", "(Ljava/lang/String;)Ljava/lang/String;", "", "delimiter", "skipDelimiter", "(Ljava/lang/String;IC)I", "skipSpaces", "", "isToken68", "(C)Z", "isToken", "", "TOKEN_EXTRA", "Ljava/util/Set;", "TOKEN68_EXTRA", "Lz5/m;", "token68Pattern", "Lz5/m;", "escapeRegex", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpAuthHeaderKt {
    private static final Set<Character> TOKEN_EXTRA = m.v0(new Character[]{'!', '#', '$', '%', '&', '\'', Character.valueOf(GMTDateParser.ANY), '+', '-', '.', '^', '_', '`', '|', '~'});
    private static final Set<Character> TOKEN68_EXTRA = m.v0(new Character[]{'-', '.', '_', '~', '+', '/'});
    private static final C2508m token68Pattern = new C2508m("[a-zA-Z0-9\\-._~+/]+=*");
    private static final C2508m escapeRegex = new C2508m("\\\\.");

    private static final boolean isToken(char c2) {
        if ('a' > c2 || c2 >= '{') {
            return ('A' <= c2 && c2 < '[') || CookieUtilsKt.isDigit(c2) || TOKEN_EXTRA.contains(Character.valueOf(c2));
        }
        return true;
    }

    private static final boolean isToken68(char c2) {
        if ('a' > c2 || c2 >= '{') {
            return ('A' <= c2 && c2 < '[') || CookieUtilsKt.isDigit(c2) || TOKEN68_EXTRA.contains(Character.valueOf(c2));
        }
        return true;
    }

    private static final int matchParameter(String str, int i7, Map<String, String> map) {
        int i8;
        int iSkipSpaces = skipSpaces(str, i7);
        int i9 = iSkipSpaces;
        while (i9 < str.length() && isToken(str.charAt(i9))) {
            i9++;
        }
        String strZ0 = AbstractC2510o.z0(str, c.L(iSkipSpaces, i9));
        int iSkipSpaces2 = skipSpaces(str, i9);
        if (iSkipSpaces2 == str.length() || str.charAt(iSkipSpaces2) != '=') {
            return i7;
        }
        int iSkipSpaces3 = skipSpaces(str, iSkipSpaces2 + 1);
        boolean z7 = false;
        if (str.charAt(iSkipSpaces3) == '\"') {
            iSkipSpaces3++;
            i8 = iSkipSpaces3;
            boolean z8 = false;
            while (i8 < str.length() && (str.charAt(i8) != '\"' || z8)) {
                z8 = !z8 && str.charAt(i8) == '\\';
                i8++;
            }
            if (i8 == str.length()) {
                throw new ParseException("Expected closing quote'\"' in parameter", null, 2, null);
            }
            z7 = true;
        } else {
            i8 = iSkipSpaces3;
            while (i8 < str.length() && str.charAt(i8) != ' ' && str.charAt(i8) != ',') {
                i8++;
            }
        }
        String strZ02 = AbstractC2510o.z0(str, c.L(iSkipSpaces3, i8));
        if (z7) {
            strZ02 = unescaped(strZ02);
        }
        map.put(strZ0, strZ02);
        return z7 ? i8 + 1 : i8;
    }

    private static final int matchParameters(String str, int i7, Map<String, String> map) {
        while (i7 > 0 && i7 < str.length()) {
            int iMatchParameter = matchParameter(str, i7, map);
            if (iMatchParameter == i7) {
                break;
            }
            i7 = skipDelimiter(str, iMatchParameter, ',');
        }
        return i7;
    }

    private static final int matchToken68(String str, int i7) {
        int iSkipSpaces = skipSpaces(str, i7);
        while (iSkipSpaces < str.length() && isToken68(str.charAt(iSkipSpaces))) {
            iSkipSpaces++;
        }
        while (iSkipSpaces < str.length() && str.charAt(iSkipSpaces) == '=') {
            iSkipSpaces++;
        }
        return skipSpaces(str, iSkipSpaces);
    }

    private static final Integer nextChallengeIndex(List<HttpAuthHeader> list, HttpAuthHeader httpAuthHeader, int i7, String str) {
        if (i7 != str.length() && str.charAt(i7) != ',') {
            return null;
        }
        list.add(httpAuthHeader);
        if (i7 == str.length()) {
            return -1;
        }
        if (str.charAt(i7) == ',') {
            return Integer.valueOf(i7 + 1);
        }
        throw new IllegalStateException("");
    }

    public static final HttpAuthHeader parseAuthorizationHeader(String str) {
        l.f("headerValue", str);
        int iSkipSpaces = skipSpaces(str, 0);
        int i7 = iSkipSpaces;
        while (i7 < str.length() && isToken(str.charAt(i7))) {
            i7++;
        }
        String strZ0 = AbstractC2510o.z0(str, c.L(iSkipSpaces, i7));
        int iSkipSpaces2 = skipSpaces(str, i7);
        if (AbstractC2510o.g0(strZ0)) {
            return null;
        }
        if (str.length() == iSkipSpaces2) {
            return new HttpAuthHeader.Parameterized(strZ0, y.f7779k, (HeaderValueEncoding) null, 4, (f) null);
        }
        int iMatchToken68 = matchToken68(str, iSkipSpaces2);
        String string = AbstractC2510o.J0(AbstractC2510o.z0(str, c.L(iSkipSpaces2, iMatchToken68))).toString();
        if (string.length() > 0 && iMatchToken68 == str.length()) {
            return new HttpAuthHeader.Single(strZ0, string);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (matchParameters(str, iSkipSpaces2, linkedHashMap) != -1) {
            throw new ParseException("Function parseAuthorizationHeader can parse only one header", null, 2, null);
        }
        return new HttpAuthHeader.Parameterized(strZ0, linkedHashMap, (HeaderValueEncoding) null, 4, (f) null);
    }

    @InternalAPI
    public static final List<HttpAuthHeader> parseAuthorizationHeaders(String str) {
        l.f("headerValue", str);
        ArrayList arrayList = new ArrayList();
        int authorizationHeader = 0;
        while (authorizationHeader != -1) {
            authorizationHeader = parseAuthorizationHeader(str, authorizationHeader, arrayList);
        }
        return arrayList;
    }

    private static final int skipDelimiter(String str, int i7, char c2) {
        int iSkipSpaces = skipSpaces(str, i7);
        if (iSkipSpaces == str.length()) {
            return -1;
        }
        if (str.charAt(iSkipSpaces) == c2) {
            return skipSpaces(str, iSkipSpaces + 1);
        }
        throw new ParseException("Expected delimiter " + c2 + " at position " + iSkipSpaces, null, 2, null);
    }

    private static final int skipSpaces(String str, int i7) {
        while (i7 < str.length() && str.charAt(i7) == ' ') {
            i7++;
        }
        return i7;
    }

    private static final String unescaped(String str) {
        return escapeRegex.c(str, new e(13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence unescaped$lambda$2(InterfaceC2505j interfaceC2505j) {
        l.f("it", interfaceC2505j);
        String strGroup = ((C2506k) interfaceC2505j).a.group();
        l.e("group(...)", strGroup);
        int length = strGroup.length();
        String strSubstring = strGroup.substring(length - (1 > length ? length : 1));
        l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    private static final int parseAuthorizationHeader(String str, int i7, List<HttpAuthHeader> list) {
        Integer numNextChallengeIndex;
        int iSkipSpaces = skipSpaces(str, i7);
        int i8 = iSkipSpaces;
        while (i8 < str.length() && isToken(str.charAt(i8))) {
            i8++;
        }
        String strZ0 = AbstractC2510o.z0(str, c.L(iSkipSpaces, i8));
        if (!AbstractC2510o.g0(strZ0)) {
            int iSkipSpaces2 = skipSpaces(str, i8);
            Integer numNextChallengeIndex2 = nextChallengeIndex(list, new HttpAuthHeader.Parameterized(strZ0, y.f7779k, (HeaderValueEncoding) null, 4, (f) null), iSkipSpaces2, str);
            if (numNextChallengeIndex2 != null) {
                return numNextChallengeIndex2.intValue();
            }
            int iMatchToken68 = matchToken68(str, iSkipSpaces2);
            String string = AbstractC2510o.J0(AbstractC2510o.z0(str, c.L(iSkipSpaces2, iMatchToken68))).toString();
            if (string.length() > 0 && (numNextChallengeIndex = nextChallengeIndex(list, new HttpAuthHeader.Single(strZ0, string), iMatchToken68, str)) != null) {
                return numNextChallengeIndex.intValue();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int iMatchParameters = matchParameters(str, iSkipSpaces2, linkedHashMap);
            list.add(new HttpAuthHeader.Parameterized(strZ0, linkedHashMap, (HeaderValueEncoding) null, 4, (f) null));
            return iMatchParameters;
        }
        throw new ParseException("Invalid authScheme value: it should be token, can't be blank", null, 2, null);
    }
}
