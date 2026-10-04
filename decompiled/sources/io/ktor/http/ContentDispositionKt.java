package io.ktor.http;

import b1.AbstractC0703b;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "key", "value", "encodeContentDispositionAttribute", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentDispositionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String encodeContentDispositionAttribute(String str, String str2) {
        if (!l.a(str, ContentDisposition.Parameters.FileNameAsterisk) || AbstractC2517v.T(str2, "utf-8''", true)) {
            return str2;
        }
        for (int i7 = 0; i7 < str2.length(); i7++) {
            if (!CodecsKt.getATTRIBUTE_CHARACTERS().contains(Character.valueOf(str2.charAt(i7)))) {
                return AbstractC0703b.i("utf-8''", CodecsKt.percentEncode(str2, CodecsKt.getATTRIBUTE_CHARACTERS()));
            }
        }
        return str2;
    }
}
