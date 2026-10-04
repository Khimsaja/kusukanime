package io.ktor.util;

import e4.InterfaceC0821a;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001aE\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0002\u001a\u0011\u0010\n\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0002\u001a\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"", "escapeHTML", "(Ljava/lang/String;)Ljava/lang/String;", "separator", "Lkotlin/Function0;", "LO3/l;", "onMissingDelimiter", "chomp", "(Ljava/lang/String;Ljava/lang/String;Le4/a;)LO3/l;", "toLowerCasePreservingASCIIRules", "toUpperCasePreservingASCIIRules", "", "ch", "toLowerCasePreservingASCII", "(C)C", "toUpperCasePreservingASCII", "Lio/ktor/util/CaseInsensitiveString;", "caseInsensitive", "(Ljava/lang/String;)Lio/ktor/util/CaseInsensitiveString;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextKt {
    public static final CaseInsensitiveString caseInsensitive(String str) {
        l.f("<this>", str);
        return new CaseInsensitiveString(str);
    }

    public static final O3.l chomp(String str, String str2, InterfaceC0821a interfaceC0821a) {
        l.f("<this>", str);
        l.f("separator", str2);
        l.f("onMissingDelimiter", interfaceC0821a);
        int iE0 = AbstractC2510o.e0(str, str2, 0, false, 6);
        if (iE0 == -1) {
            return (O3.l) interfaceC0821a.invoke();
        }
        String strSubstring = str.substring(0, iE0);
        l.e("substring(...)", strSubstring);
        String strSubstring2 = str.substring(str2.length() + iE0);
        l.e("substring(...)", strSubstring2);
        return new O3.l(strSubstring, strSubstring2);
    }

    public static final String escapeHTML(String str) {
        l.f("<this>", str);
        if (str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt == '\"') {
                sb.append("&quot;");
            } else if (cCharAt == '<') {
                sb.append("&lt;");
            } else if (cCharAt == '>') {
                sb.append("&gt;");
            } else if (cCharAt == '&') {
                sb.append("&amp;");
            } else if (cCharAt != '\'') {
                sb.append(cCharAt);
            } else {
                sb.append("&#x27;");
            }
        }
        return sb.toString();
    }

    private static final char toLowerCasePreservingASCII(char c2) {
        return ('A' > c2 || c2 >= '[') ? (c2 < 0 || c2 >= 128) ? Character.toLowerCase(c2) : c2 : (char) (c2 + ' ');
    }

    public static final String toLowerCasePreservingASCIIRules(String str) {
        l.f("<this>", str);
        int length = str.length();
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            char cCharAt = str.charAt(i7);
            if (toLowerCasePreservingASCII(cCharAt) != cCharAt) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append((CharSequence) str, 0, i7);
        int iB0 = AbstractC2510o.b0(str);
        if (i7 <= iB0) {
            while (true) {
                sb.append(toLowerCasePreservingASCII(str.charAt(i7)));
                if (i7 == iB0) {
                    break;
                }
                i7++;
            }
        }
        return sb.toString();
    }

    private static final char toUpperCasePreservingASCII(char c2) {
        return ('a' > c2 || c2 >= '{') ? (c2 < 0 || c2 >= 128) ? Character.toLowerCase(c2) : c2 : (char) (c2 - ' ');
    }

    public static final String toUpperCasePreservingASCIIRules(String str) {
        l.f("<this>", str);
        int length = str.length();
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            char cCharAt = str.charAt(i7);
            if (toUpperCasePreservingASCII(cCharAt) != cCharAt) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append((CharSequence) str, 0, i7);
        int iB0 = AbstractC2510o.b0(str);
        if (i7 <= iB0) {
            while (true) {
                sb.append(toUpperCasePreservingASCII(str.charAt(i7)));
                if (i7 == iB0) {
                    break;
                }
                i7++;
            }
        }
        return sb.toString();
    }
}
