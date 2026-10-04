package io.ktor.http;

import O3.C;
import P3.q;
import P3.r;
import P3.y;
import b1.AbstractC0703b;
import f6.AbstractC0915m;
import io.ktor.util.CharsetKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0011\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u000e\u001a+\u0010\u0012\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0019\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0014\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\" \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lio/ktor/http/URLBuilder;", "", "urlString", "takeFrom", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;)Lio/ktor/http/URLBuilder;", "takeFromUnsafe", "", "startIndex", "endIndex", "slashCount", "LO3/C;", "parseFile", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;III)V", "parseMailto", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;II)V", "parseQuery", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;II)I", "parseFragment", "fillHost", "findScheme", "(Ljava/lang/String;II)I", "", "char", "count", "(Ljava/lang/String;IIC)I", "indexOfColonInHostPort", "", "isLetter", "(C)Z", "", "ROOT_PATH", "Ljava/util/List;", "getROOT_PATH", "()Ljava/util/List;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class URLParserKt {
    private static final List<String> ROOT_PATH = r.H("");

    private static final int count(String str, int i7, int i8, char c2) {
        int i9 = 0;
        while (true) {
            int i10 = i7 + i9;
            if (i10 >= i8 || str.charAt(i10) != c2) {
                break;
            }
            i9++;
        }
        return i9;
    }

    private static final void fillHost(URLBuilder uRLBuilder, String str, int i7, int i8) throws NumberFormatException {
        int i9;
        Integer numValueOf = Integer.valueOf(indexOfColonInHostPort(str, i7, i8));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : i8;
        String strSubstring = str.substring(i7, iIntValue);
        l.e("substring(...)", strSubstring);
        uRLBuilder.setHost(strSubstring);
        int i10 = iIntValue + 1;
        if (i10 < i8) {
            String strSubstring2 = str.substring(i10, i8);
            l.e("substring(...)", strSubstring2);
            i9 = Integer.parseInt(strSubstring2);
        } else {
            i9 = 0;
        }
        uRLBuilder.setPort(i9);
    }

    private static final int findScheme(String str, int i7, int i8) {
        int i9;
        int i10;
        char cCharAt = str.charAt(i7);
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i9 = i7;
            i10 = i9;
        } else {
            i9 = i7;
            i10 = -1;
        }
        while (i9 < i8) {
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 == ':') {
                if (i10 == -1) {
                    return i9 - i7;
                }
                throw new IllegalArgumentException(AbstractC0703b.g(i10, "Illegal character in scheme at position "));
            }
            if (cCharAt2 == '#' || cCharAt2 == '/' || cCharAt2 == '?') {
                break;
            }
            if (i10 == -1 && (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')))) {
                i10 = i9;
            }
            i9++;
        }
        return -1;
    }

    public static final List<String> getROOT_PATH() {
        return ROOT_PATH;
    }

    private static final int indexOfColonInHostPort(String str, int i7, int i8) {
        boolean z7 = false;
        while (i7 < i8) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != ':') {
                if (cCharAt == '[') {
                    z7 = true;
                } else if (cCharAt == ']') {
                    z7 = false;
                }
            } else if (!z7) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    private static final boolean isLetter(char c2) {
        char lowerCase = Character.toLowerCase(c2);
        return 'a' <= lowerCase && lowerCase < '{';
    }

    private static final void parseFile(URLBuilder uRLBuilder, String str, int i7, int i8, int i9) {
        if (i9 == 1) {
            uRLBuilder.setHost("");
            String strSubstring = str.substring(i7, i8);
            l.e("substring(...)", strSubstring);
            URLBuilderKt.setEncodedPath(uRLBuilder, strSubstring);
            return;
        }
        if (i9 != 2) {
            if (i9 != 3) {
                throw new IllegalArgumentException(AbstractC0703b.i("Invalid file url: ", str));
            }
            uRLBuilder.setHost("");
            String strSubstring2 = str.substring(i7, i8);
            l.e("substring(...)", strSubstring2);
            URLBuilderKt.setEncodedPath(uRLBuilder, "/".concat(strSubstring2));
            return;
        }
        int iD0 = AbstractC2510o.d0(str, '/', i7, 4);
        if (iD0 == -1 || iD0 == i8) {
            String strSubstring3 = str.substring(i7, i8);
            l.e("substring(...)", strSubstring3);
            uRLBuilder.setHost(strSubstring3);
        } else {
            String strSubstring4 = str.substring(i7, iD0);
            l.e("substring(...)", strSubstring4);
            uRLBuilder.setHost(strSubstring4);
            String strSubstring5 = str.substring(iD0, i8);
            l.e("substring(...)", strSubstring5);
            URLBuilderKt.setEncodedPath(uRLBuilder, strSubstring5);
        }
    }

    private static final void parseFragment(URLBuilder uRLBuilder, String str, int i7, int i8) {
        if (i7 >= i8 || str.charAt(i7) != '#') {
            return;
        }
        String strSubstring = str.substring(i7 + 1, i8);
        l.e("substring(...)", strSubstring);
        uRLBuilder.setEncodedFragment(strSubstring);
    }

    private static final void parseMailto(URLBuilder uRLBuilder, String str, int i7, int i8) {
        int iE0 = AbstractC2510o.e0(str, "@", i7, false, 4);
        if (iE0 == -1) {
            throw new IllegalArgumentException(AbstractC0703b.j("Invalid mailto url: ", str, ", it should contain '@'."));
        }
        String strSubstring = str.substring(i7, iE0);
        l.e("substring(...)", strSubstring);
        uRLBuilder.setUser(CodecsKt.decodeURLPart$default(strSubstring, 0, 0, null, 7, null));
        String strSubstring2 = str.substring(iE0 + 1, i8);
        l.e("substring(...)", strSubstring2);
        uRLBuilder.setHost(strSubstring2);
    }

    private static final int parseQuery(URLBuilder uRLBuilder, String str, int i7, int i8) {
        int i9 = i7 + 1;
        if (i9 == i8) {
            uRLBuilder.setTrailingQuery(true);
            return i8;
        }
        int iD0 = AbstractC2510o.d0(str, '#', i9, 4);
        Integer numValueOf = Integer.valueOf(iD0);
        if (iD0 <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            i8 = numValueOf.intValue();
        }
        String strSubstring = str.substring(i9, i8);
        l.e("substring(...)", strSubstring);
        QueryKt.parseQueryString$default(strSubstring, 0, 0, false, 6, null).forEach(new D3.c(3, uRLBuilder));
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C parseQuery$lambda$5(URLBuilder uRLBuilder, String str, List list) {
        l.f("key", str);
        l.f("values", list);
        uRLBuilder.getEncodedParameters().appendAll(str, list);
        return C.a;
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, String str) {
        l.f("<this>", uRLBuilder);
        l.f("urlString", str);
        if (AbstractC2510o.g0(str)) {
            return uRLBuilder;
        }
        try {
            return takeFromUnsafe(uRLBuilder, str);
        } catch (Throwable th) {
            throw new URLParserException(str, th);
        }
    }

    public static final URLBuilder takeFromUnsafe(URLBuilder uRLBuilder, String str) throws NumberFormatException {
        int iIntValue;
        l.f("<this>", uRLBuilder);
        l.f("urlString", str);
        int length = str.length();
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (!AbstractC0915m.B(str.charAt(i7))) {
                break;
            }
            i7++;
        }
        int length2 = str.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i8 = length2 - 1;
                if (!AbstractC0915m.B(str.charAt(length2))) {
                    break;
                }
                if (i8 < 0) {
                    break;
                }
                length2 = i8;
            }
            length2 = -1;
        } else {
            length2 = -1;
        }
        int i9 = length2 + 1;
        int iFindScheme = findScheme(str, i7, i9);
        if (iFindScheme > 0) {
            String strSubstring = str.substring(i7, i7 + iFindScheme);
            l.e("substring(...)", strSubstring);
            uRLBuilder.setProtocol(URLProtocol.INSTANCE.createOrDefault(strSubstring));
            i7 += iFindScheme + 1;
        }
        if (l.a(uRLBuilder.getProtocol().getName(), "data")) {
            String strSubstring2 = str.substring(i7, i9);
            l.e("substring(...)", strSubstring2);
            uRLBuilder.setHost(strSubstring2);
            return uRLBuilder;
        }
        int iCount = count(str, i7, i9, '/');
        int query = i7 + iCount;
        if (l.a(uRLBuilder.getProtocol().getName(), "file")) {
            parseFile(uRLBuilder, str, query, i9, iCount);
            return uRLBuilder;
        }
        if (l.a(uRLBuilder.getProtocol().getName(), "mailto")) {
            if (iCount != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            parseMailto(uRLBuilder, str, query, i9);
            return uRLBuilder;
        }
        if (l.a(uRLBuilder.getProtocol().getName(), "about")) {
            if (iCount != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strSubstring3 = str.substring(query, i9);
            l.e("substring(...)", strSubstring3);
            uRLBuilder.setHost(strSubstring3);
            return uRLBuilder;
        }
        if (l.a(uRLBuilder.getProtocol().getName(), "tel")) {
            if (iCount != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strSubstring4 = str.substring(query, i9);
            l.e("substring(...)", strSubstring4);
            uRLBuilder.setHost(strSubstring4);
            return uRLBuilder;
        }
        if (iCount >= 2) {
            while (true) {
                int iF0 = AbstractC2510o.f0(str, CharsetKt.toCharArray("@/\\?#"), query, false);
                Integer numValueOf = Integer.valueOf(iF0);
                if (iF0 <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i9;
                if (iIntValue >= i9 || str.charAt(iIntValue) != '@') {
                    break;
                }
                int iIndexOfColonInHostPort = indexOfColonInHostPort(str, query, iIntValue);
                if (iIndexOfColonInHostPort != -1) {
                    String strSubstring5 = str.substring(query, iIndexOfColonInHostPort);
                    l.e("substring(...)", strSubstring5);
                    uRLBuilder.setEncodedUser(strSubstring5);
                    String strSubstring6 = str.substring(iIndexOfColonInHostPort + 1, iIntValue);
                    l.e("substring(...)", strSubstring6);
                    uRLBuilder.setEncodedPassword(strSubstring6);
                } else {
                    String strSubstring7 = str.substring(query, iIntValue);
                    l.e("substring(...)", strSubstring7);
                    uRLBuilder.setEncodedUser(strSubstring7);
                }
                query = iIntValue + 1;
            }
            fillHost(uRLBuilder, str, query, iIntValue);
            query = iIntValue;
        }
        List<String> list = y.f7779k;
        if (query >= i9) {
            if (str.charAt(length2) == '/') {
                list = ROOT_PATH;
            }
            uRLBuilder.setEncodedPathSegments(list);
            return uRLBuilder;
        }
        uRLBuilder.setEncodedPathSegments(iCount == 0 ? q.p0(uRLBuilder.getEncodedPathSegments()) : list);
        int iF02 = AbstractC2510o.f0(str, CharsetKt.toCharArray("?#"), query, false);
        Integer numValueOf2 = iF02 > 0 ? Integer.valueOf(iF02) : null;
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : i9;
        if (iIntValue2 > query) {
            String strSubstring8 = str.substring(query, iIntValue2);
            l.e("substring(...)", strSubstring8);
            List<String> encodedPathSegments = (uRLBuilder.getEncodedPathSegments().size() == 1 && ((CharSequence) q.r0(uRLBuilder.getEncodedPathSegments())).length() == 0) ? list : uRLBuilder.getEncodedPathSegments();
            List<String> listV0 = strSubstring8.equals("/") ? ROOT_PATH : AbstractC2510o.v0(strSubstring8, new char[]{'/'});
            if (iCount == 1) {
                list = ROOT_PATH;
            }
            uRLBuilder.setEncodedPathSegments(q.G0(encodedPathSegments, q.G0(list, listV0)));
            query = iIntValue2;
        }
        if (query < i9 && str.charAt(query) == '?') {
            query = parseQuery(uRLBuilder, str, query, i9);
        }
        parseFragment(uRLBuilder, str, query, i9);
        return uRLBuilder;
    }
}
