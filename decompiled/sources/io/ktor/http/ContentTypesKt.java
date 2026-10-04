package io.ktor.http;

import io.ktor.http.ContentType;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.C2496a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0007¢\u0006\u0004\b\u0003\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/http/ContentType;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", HttpAuthHeader.Parameters.Charset, "withCharset", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;)Lio/ktor/http/ContentType;", "withCharsetIfNeeded", "Lio/ktor/http/HeaderValueWithParameters;", "(Lio/ktor/http/HeaderValueWithParameters;)Ljava/nio/charset/Charset;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentTypesKt {
    public static final Charset charset(HeaderValueWithParameters headerValueWithParameters) {
        l.f("<this>", headerValueWithParameters);
        String strParameter = headerValueWithParameters.parameter(HttpAuthHeader.Parameters.Charset);
        if (strParameter == null) {
            return null;
        }
        try {
            return CharsetJVMKt.forName(C2496a.a, strParameter);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final ContentType withCharset(ContentType contentType, Charset charset) {
        l.f("<this>", contentType);
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        return contentType.withParameter(HttpAuthHeader.Parameters.Charset, CharsetJVMKt.getName(charset));
    }

    public static final ContentType withCharsetIfNeeded(ContentType contentType, Charset charset) {
        l.f("<this>", contentType);
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        String lowerCase = contentType.getContentType().toLowerCase(Locale.ROOT);
        l.e("toLowerCase(...)", lowerCase);
        return !lowerCase.equals(ContentType.Text.TYPE) ? contentType : contentType.withParameter(HttpAuthHeader.Parameters.Charset, CharsetJVMKt.getName(charset));
    }
}
