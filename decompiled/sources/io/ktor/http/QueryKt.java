package io.ktor.http;

import P3.y;
import f6.AbstractC0915m;
import io.ktor.client.utils.CIOKt;
import io.ktor.http.ContentType;
import io.ktor.http.Parameters;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0005\u001a3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0011\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"", "query", "", "startIndex", "limit", "", "decode", "Lio/ktor/http/Parameters;", "parseQueryString", "(Ljava/lang/String;IIZ)Lio/ktor/http/Parameters;", "Lio/ktor/http/ParametersBuilder;", "LO3/C;", "parse", "(Lio/ktor/http/ParametersBuilder;Ljava/lang/String;IIZ)V", "nameIndex", "equalIndex", "endIndex", "appendParam", "(Lio/ktor/http/ParametersBuilder;Ljava/lang/String;IIIZ)V", "start", "end", "", ContentType.Text.TYPE, "trimEnd", "(IILjava/lang/CharSequence;)I", "trimStart", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class QueryKt {
    private static final void appendParam(ParametersBuilder parametersBuilder, String str, int i7, int i8, int i9, boolean z7) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        if (i8 == -1) {
            int iTrimStart = trimStart(i7, i9, str);
            int iTrimEnd = trimEnd(iTrimStart, i9, str);
            if (iTrimEnd > iTrimStart) {
                if (z7) {
                    strSubstring3 = CodecsKt.decodeURLQueryComponent$default(str, iTrimStart, iTrimEnd, false, null, 12, null);
                } else {
                    strSubstring3 = str.substring(iTrimStart, iTrimEnd);
                    l.e("substring(...)", strSubstring3);
                }
                parametersBuilder.appendAll(strSubstring3, y.f7779k);
                return;
            }
            return;
        }
        int iTrimStart2 = trimStart(i7, i8, str);
        int iTrimEnd2 = trimEnd(iTrimStart2, i8, str);
        if (iTrimEnd2 > iTrimStart2) {
            if (z7) {
                strSubstring = CodecsKt.decodeURLQueryComponent$default(str, iTrimStart2, iTrimEnd2, false, null, 12, null);
            } else {
                strSubstring = str.substring(iTrimStart2, iTrimEnd2);
                l.e("substring(...)", strSubstring);
            }
            int iTrimStart3 = trimStart(i8 + 1, i9, str);
            int iTrimEnd3 = trimEnd(iTrimStart3, i9, str);
            if (z7) {
                strSubstring2 = CodecsKt.decodeURLQueryComponent$default(str, iTrimStart3, iTrimEnd3, true, null, 8, null);
            } else {
                strSubstring2 = str.substring(iTrimStart3, iTrimEnd3);
                l.e("substring(...)", strSubstring2);
            }
            parametersBuilder.append(strSubstring, strSubstring2);
        }
    }

    private static final void parse(ParametersBuilder parametersBuilder, String str, int i7, int i8, boolean z7) {
        int i9;
        int i10;
        int iB0 = AbstractC2510o.b0(str);
        int i11 = 0;
        if (i7 <= iB0) {
            int i12 = -1;
            int i13 = i7;
            int i14 = i13;
            while (i11 != i8) {
                char cCharAt = str.charAt(i14);
                if (cCharAt == '&') {
                    appendParam(parametersBuilder, str, i13, i12, i14, z7);
                    i11++;
                    i12 = -1;
                    i13 = i14 + 1;
                } else if (cCharAt == '=' && i12 == -1) {
                    i12 = i14;
                }
                if (i14 != iB0) {
                    i14++;
                } else {
                    i10 = i13;
                    i9 = i12;
                }
            }
            return;
        }
        i9 = -1;
        i10 = i7;
        if (i11 == i8) {
            return;
        }
        appendParam(parametersBuilder, str, i10, i9, str.length(), z7);
    }

    public static final Parameters parseQueryString(String str, int i7, int i8, boolean z7) {
        l.f("query", str);
        if (i7 > AbstractC2510o.b0(str)) {
            return Parameters.INSTANCE.getEmpty();
        }
        Parameters.Companion companion = Parameters.INSTANCE;
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        parse(parametersBuilderParametersBuilder$default, str, i7, i8, z7);
        return parametersBuilderParametersBuilder$default.build();
    }

    public static /* synthetic */ Parameters parseQueryString$default(String str, int i7, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = CIOKt.DEFAULT_HTTP_POOL_SIZE;
        }
        if ((i9 & 8) != 0) {
            z7 = true;
        }
        return parseQueryString(str, i7, i8, z7);
    }

    private static final int trimEnd(int i7, int i8, CharSequence charSequence) {
        while (i8 > i7 && AbstractC0915m.B(charSequence.charAt(i8 - 1))) {
            i8--;
        }
        return i8;
    }

    private static final int trimStart(int i7, int i8, CharSequence charSequence) {
        while (i7 < i8 && AbstractC0915m.B(charSequence.charAt(i7))) {
            i7++;
        }
        return i7;
    }
}
