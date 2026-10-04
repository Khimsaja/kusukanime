package io.ktor.http;

import D6.r;
import F5.n;
import P3.F;
import P3.m;
import P3.q;
import P3.z;
import Z3.h;
import Z5.A;
import b1.AbstractC0703b;
import f6.AbstractC0915m;
import io.ktor.http.ContentDisposition;
import io.ktor.util.Base64Kt;
import io.ktor.util.TextKt;
import io.ktor.util.date.GMTDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y5.f;
import y5.k;
import y5.o;
import z5.AbstractC2510o;
import z5.AbstractC2517v;
import z5.C2504i;
import z5.C2506k;
import z5.C2507l;
import z5.C2508m;
import z5.InterfaceC2505j;

@Metadata(d1 = {"\u0000P\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\f\u001a\u008d\u0001\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010\u001e\u001a\u0013\u0010!\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010$\u001a\u00020\u0005*\u00020#H\u0002¢\u0006\u0004\b$\u0010%\u001a*\u0010'\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010&2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082\b¢\u0006\u0004\b'\u0010(\u001a\"\u0010)\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010&H\u0082\b¢\u0006\u0004\b)\u0010*\u001a \u0010+\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0005H\u0082\b¢\u0006\u0004\b+\u0010,\u001a\"\u0010-\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0000H\u0082\b¢\u0006\u0004\b-\u0010.\u001a\u0013\u0010/\u001a\u00020\u0012*\u00020\u0000H\u0002¢\u0006\u0004\b/\u00100\"\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0000018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\"\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106\"\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020#018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00103¨\u00068"}, d2 = {"", "cookiesHeader", "Lio/ktor/http/Cookie;", "parseServerSetCookieHeader", "(Ljava/lang/String;)Lio/ktor/http/Cookie;", "", "skipEscaped", "", "parseClientCookiesHeader", "(Ljava/lang/String;Z)Ljava/util/Map;", "cookie", "renderSetCookieHeader", "(Lio/ktor/http/Cookie;)Ljava/lang/String;", "renderCookieHeader", ContentDisposition.Parameters.Name, "value", "Lio/ktor/http/CookieEncoding;", "encoding", "", "maxAge", "Lio/ktor/util/date/GMTDate;", "expires", "domain", "path", "secure", "httpOnly", "extensions", "includeEncoding", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Z)Ljava/lang/String;", "encodeCookieValue", "(Ljava/lang/String;Lio/ktor/http/CookieEncoding;)Ljava/lang/String;", "encodedValue", "decodeCookieValue", "assertCookieName", "(Ljava/lang/String;)Ljava/lang/String;", "", "shouldEscapeInCookies", "(C)Z", "", "cookiePart", "(Ljava/lang/String;Ljava/lang/Object;Lio/ktor/http/CookieEncoding;)Ljava/lang/String;", "cookiePartUnencoded", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;", "cookiePartFlag", "(Ljava/lang/String;Z)Ljava/lang/String;", "cookiePartExt", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "toIntClamping", "(Ljava/lang/String;)I", "", "loweredPartNames", "Ljava/util/Set;", "Lz5/m;", "clientCookieHeaderPattern", "Lz5/m;", "cookieCharsShouldBeEscaped", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CookieKt {
    private static final Set<String> loweredPartNames = m.v0(new String[]{io.ktor.client.utils.CacheControl.MAX_AGE, "expires", "domain", "path", "secure", "httponly", "$x-enc"});
    private static final C2508m clientCookieHeaderPattern = new C2508m("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");
    private static final Set<Character> cookieCharsShouldBeEscaped = m.v0(new Character[]{';', ',', '\"'});

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CookieEncoding.values().length];
            try {
                iArr[CookieEncoding.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CookieEncoding.DQUOTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CookieEncoding.BASE64_ENCODING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CookieEncoding.URI_ENCODING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final String assertCookieName(String str) {
        for (int i7 = 0; i7 < str.length(); i7++) {
            if (shouldEscapeInCookies(str.charAt(i7))) {
                throw new IllegalArgumentException(AbstractC0703b.i("Cookie name is not valid: ", str));
            }
        }
        return str;
    }

    private static final String cookiePart(String str, Object obj, CookieEncoding cookieEncoding) {
        if (obj == null) {
            return "";
        }
        return str + '=' + encodeCookieValue(obj.toString(), cookieEncoding);
    }

    private static final String cookiePartExt(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + '=' + encodeCookieValue(str2.toString(), CookieEncoding.RAW);
    }

    private static final String cookiePartFlag(String str, boolean z7) {
        return z7 ? str : "";
    }

    private static final String cookiePartUnencoded(String str, Object obj) {
        if (obj == null) {
            return "";
        }
        return str + '=' + obj;
    }

    public static final String decodeCookieValue(String str, CookieEncoding cookieEncoding) {
        CharSequence charSequenceSubSequence;
        CharSequence charSequenceSubSequence2;
        l.f("encodedValue", str);
        l.f("encoding", cookieEncoding);
        int i7 = WhenMappings.$EnumSwitchMapping$0[cookieEncoding.ordinal()];
        if (i7 != 1 && i7 != 2) {
            if (i7 == 3) {
                return Base64Kt.decodeBase64String(str);
            }
            if (i7 == 4) {
                return CodecsKt.decodeURLQueryComponent$default(str, 0, 0, true, null, 11, null);
            }
            throw new r();
        }
        int length = str.length();
        int i8 = 0;
        while (true) {
            charSequenceSubSequence = "";
            if (i8 >= length) {
                charSequenceSubSequence2 = "";
                break;
            }
            if (!AbstractC0915m.B(str.charAt(i8))) {
                charSequenceSubSequence2 = str.subSequence(i8, str.length());
                break;
            }
            i8++;
        }
        if (AbstractC2517v.T(charSequenceSubSequence2.toString(), "\"", false)) {
            int length2 = str.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i9 = length2 - 1;
                    if (!AbstractC0915m.B(str.charAt(length2))) {
                        charSequenceSubSequence = str.subSequence(0, length2 + 1);
                        break;
                    }
                    if (i9 < 0) {
                        break;
                    }
                    length2 = i9;
                }
            }
            if (AbstractC2517v.L(charSequenceSubSequence.toString(), "\"", false)) {
                return AbstractC2510o.q0(AbstractC2510o.J0(str).toString());
            }
        }
        return str;
    }

    public static final String encodeCookieValue(String str, CookieEncoding cookieEncoding) {
        l.f("value", str);
        l.f("encoding", cookieEncoding);
        int i7 = WhenMappings.$EnumSwitchMapping$0[cookieEncoding.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    return Base64Kt.encodeBase64(str);
                }
                if (i7 == 4) {
                    return CodecsKt.encodeURLParameter(str, true);
                }
                throw new r();
            }
            if (AbstractC2510o.X(str, '\"')) {
                throw new IllegalArgumentException("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
            }
            for (int i8 = 0; i8 < str.length(); i8++) {
                if (shouldEscapeInCookies(str.charAt(i8))) {
                    return A6.b.d('\"', "\"", str);
                }
            }
        }
        return str;
    }

    public static final Map<String, String> parseClientCookiesHeader(String str, boolean z7) {
        l.f("cookiesHeader", str);
        C2508m c2508m = clientCookieHeaderPattern;
        c2508m.getClass();
        if (str.length() < 0) {
            throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
        }
        o oVarU = k.U(new f(k.U(new h(new A(16, c2508m, str), C2507l.f19060k), new io.ktor.client.request.a(15)), true, new io.github.jan.supabase.storage.c(z7, 1)), new io.ktor.client.request.a(16));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = oVarU.a.iterator();
        while (it.hasNext()) {
            O3.l lVar = (O3.l) oVarU.f18392b.invoke(it.next());
            linkedHashMap.put(lVar.f7528k, lVar.f7529l);
        }
        int size = linkedHashMap.size();
        return size != 0 ? size != 1 ? linkedHashMap : F.f0(linkedHashMap) : z.f7780k;
    }

    public static /* synthetic */ Map parseClientCookiesHeader$default(String str, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = true;
        }
        return parseClientCookiesHeader(str, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O3.l parseClientCookiesHeader$lambda$4(InterfaceC2505j interfaceC2505j) {
        String str;
        String str2;
        l.f("it", interfaceC2505j);
        n nVar = ((C2506k) interfaceC2505j).f19058c;
        C2504i c2504iH = nVar.h(2);
        String str3 = "";
        if (c2504iH == null || (str = c2504iH.a) == null) {
            str = "";
        }
        C2504i c2504iH2 = nVar.h(4);
        if (c2504iH2 != null && (str2 = c2504iH2.a) != null) {
            str3 = str2;
        }
        return new O3.l(str, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseClientCookiesHeader$lambda$5(boolean z7, O3.l lVar) {
        l.f("it", lVar);
        return (z7 && AbstractC2517v.T((String) lVar.f7528k, "$", false)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O3.l parseClientCookiesHeader$lambda$6(O3.l lVar) {
        l.f("cookie", lVar);
        String str = (String) lVar.f7529l;
        if (!AbstractC2517v.T(str, "\"", false) || !AbstractC2517v.L(str, "\"", false)) {
            return lVar;
        }
        return new O3.l(lVar.f7528k, AbstractC2510o.q0(str));
    }

    public static final Cookie parseServerSetCookieHeader(String str) {
        CookieEncoding cookieEncodingValueOf;
        l.f("cookiesHeader", str);
        Map<String, String> clientCookiesHeader = parseClientCookiesHeader(str, false);
        Iterator<T> it = clientCookiesHeader.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!AbstractC2517v.T((String) entry.getKey(), "$", false)) {
                String str2 = clientCookiesHeader.get("$x-enc");
                if (str2 == null || (cookieEncodingValueOf = CookieEncoding.valueOf(str2)) == null) {
                    cookieEncodingValueOf = CookieEncoding.RAW;
                }
                CookieEncoding cookieEncoding = cookieEncodingValueOf;
                LinkedHashMap linkedHashMap = new LinkedHashMap(F.I(clientCookiesHeader.size()));
                Iterator<T> it2 = clientCookiesHeader.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    linkedHashMap.put(TextKt.toLowerCasePreservingASCIIRules((String) entry2.getKey()), entry2.getValue());
                }
                String str3 = (String) entry.getKey();
                String strDecodeCookieValue = decodeCookieValue((String) entry.getValue(), cookieEncoding);
                String str4 = (String) linkedHashMap.get(io.ktor.client.utils.CacheControl.MAX_AGE);
                Integer numValueOf = str4 != null ? Integer.valueOf(toIntClamping(str4)) : null;
                String str5 = (String) linkedHashMap.get("expires");
                GMTDate gMTDateFromCookieToGmtDate = str5 != null ? DateUtilsKt.fromCookieToGmtDate(str5) : null;
                String str6 = (String) linkedHashMap.get("domain");
                String str7 = (String) linkedHashMap.get("path");
                boolean zContainsKey = linkedHashMap.containsKey("secure");
                boolean zContainsKey2 = linkedHashMap.containsKey("httponly");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, String> entry3 : clientCookiesHeader.entrySet()) {
                    String key = entry3.getKey();
                    if (!loweredPartNames.contains(TextKt.toLowerCasePreservingASCIIRules(key)) && !l.a(key, entry.getKey())) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                return new Cookie(str3, strDecodeCookieValue, cookieEncoding, numValueOf, gMTDateFromCookieToGmtDate, str6, str7, zContainsKey, zContainsKey2, linkedHashMap2);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final String renderCookieHeader(Cookie cookie) {
        l.f("cookie", cookie);
        return cookie.getName() + '=' + encodeCookieValue(cookie.getValue(), cookie.getEncoding());
    }

    public static final String renderSetCookieHeader(Cookie cookie) {
        l.f("cookie", cookie);
        return renderSetCookieHeader$default(cookie.getName(), cookie.getValue(), cookie.getEncoding(), cookie.getMaxAgeInt(), cookie.getExpires(), cookie.getDomain(), cookie.getPath(), cookie.getSecure(), cookie.getHttpOnly(), cookie.getExtensions(), false, 1024, null);
    }

    public static /* synthetic */ String renderSetCookieHeader$default(String str, String str2, CookieEncoding cookieEncoding, Integer num, GMTDate gMTDate, String str3, String str4, boolean z7, boolean z8, Map map, boolean z9, int i7, Object obj) {
        return renderSetCookieHeader(str, str2, (i7 & 4) != 0 ? CookieEncoding.URI_ENCODING : cookieEncoding, (i7 & 8) != 0 ? null : num, (i7 & 16) != 0 ? null : gMTDate, (i7 & 32) != 0 ? null : str3, (i7 & 64) == 0 ? str4 : null, (i7 & 128) != 0 ? false : z7, (i7 & 256) == 0 ? z8 : false, (i7 & 512) != 0 ? z.f7780k : map, (i7 & 1024) != 0 ? true : z9);
    }

    private static final boolean shouldEscapeInCookies(char c2) {
        return AbstractC0915m.B(c2) || l.g(c2, 32) < 0 || cookieCharsShouldBeEscaped.contains(Character.valueOf(c2));
    }

    private static final int toIntClamping(String str) {
        return (int) e3.c.l(Long.parseLong(str), 0L, 2147483647L);
    }

    public static final String renderSetCookieHeader(String str, String str2, CookieEncoding cookieEncoding, Integer num, GMTDate gMTDate, String str3, String str4, boolean z7, boolean z8, Map<String, String> map, boolean z9) {
        String str5;
        String str6;
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("value", str2);
        l.f("encoding", cookieEncoding);
        l.f("extensions", map);
        String str7 = assertCookieName(str) + '=' + encodeCookieValue(str2.toString(), cookieEncoding);
        String str8 = "";
        String str9 = num != null ? "Max-Age=" + num : "";
        String httpDate = gMTDate != null ? DateUtilsKt.toHttpDate(gMTDate) : null;
        String str10 = httpDate == null ? "" : "Expires=" + ((Object) httpDate);
        CookieEncoding cookieEncoding2 = CookieEncoding.RAW;
        String str11 = str3 == null ? "" : "Domain=" + encodeCookieValue(str3.toString(), cookieEncoding2);
        String str12 = str4 == null ? "" : "Path=" + encodeCookieValue(str4.toString(), cookieEncoding2);
        if (!z7) {
            str5 = "";
        } else {
            str5 = "Secure";
        }
        if (!z8) {
            str6 = "";
        } else {
            str6 = "HttpOnly";
        }
        List listI = P3.r.I(str7, str9, str10, str11, str12, str5, str6);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strAssertCookieName = assertCookieName(entry.getKey());
            String value = entry.getValue();
            if (value != null) {
                strAssertCookieName = strAssertCookieName + '=' + encodeCookieValue(value.toString(), CookieEncoding.RAW);
            }
            arrayList.add(strAssertCookieName);
        }
        ArrayList arrayListG0 = q.G0(listI, arrayList);
        if (z9) {
            String strName = cookieEncoding.name();
            str8 = strName == null ? "$x-enc" : "$x-enc=" + encodeCookieValue(strName.toString(), CookieEncoding.RAW);
        }
        ArrayList arrayListH0 = q.H0(arrayListG0, str8);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListH0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        return q.y0(arrayList2, "; ", null, null, null, 62);
    }
}
