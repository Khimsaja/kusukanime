package io.ktor.http;

import P3.r;
import P3.v;
import P3.y;
import io.ktor.http.LinkHeader;
import io.ktor.http.auth.HttpAuthHeader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\r\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0010\u001a\u0019\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012*\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u001d¢\u0006\u0004\b\u0004\u0010\u001e\u001a\u0019\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012*\u00020\u001d¢\u0006\u0004\b\u0013\u0010\u001f\u001a\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00020\u001d¢\u0006\u0004\b\u0015\u0010 \u001a\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u001d¢\u0006\u0004\b\u0018\u0010!\u001a\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u001d¢\u0006\u0004\b\u001b\u0010\"\u001a\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0017*\u00020\u001d¢\u0006\u0004\b$\u0010!\u001a\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u0017*\u00020\u0000¢\u0006\u0004\b%\u0010\u0019\u001a\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0017*\u00020\u001d¢\u0006\u0004\b'\u0010!\u001a\u0019\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\u0017*\u00020\nH\u0000¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lio/ktor/http/HttpMessageBuilder;", "Lio/ktor/http/ContentType;", LinkHeader.Parameters.Type, "LO3/C;", "contentType", "(Lio/ktor/http/HttpMessageBuilder;Lio/ktor/http/ContentType;)V", "", "seconds", "maxAge", "(Lio/ktor/http/HttpMessageBuilder;I)V", "", "value", "ifNoneMatch", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;)V", "content", "userAgent", "(Lio/ktor/http/HttpMessageBuilder;)Lio/ktor/http/ContentType;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", HttpAuthHeader.Parameters.Charset, "(Lio/ktor/http/HttpMessageBuilder;)Ljava/nio/charset/Charset;", "etag", "(Lio/ktor/http/HttpMessageBuilder;)Ljava/lang/String;", "", "vary", "(Lio/ktor/http/HttpMessageBuilder;)Ljava/util/List;", "", "contentLength", "(Lio/ktor/http/HttpMessageBuilder;)Ljava/lang/Long;", "Lio/ktor/http/HttpMessage;", "(Lio/ktor/http/HttpMessage;)Lio/ktor/http/ContentType;", "(Lio/ktor/http/HttpMessage;)Ljava/nio/charset/Charset;", "(Lio/ktor/http/HttpMessage;)Ljava/lang/String;", "(Lio/ktor/http/HttpMessage;)Ljava/util/List;", "(Lio/ktor/http/HttpMessage;)Ljava/lang/Long;", "Lio/ktor/http/Cookie;", "setCookie", "cookies", "Lio/ktor/http/HeaderValue;", "cacheControl", "splitSetCookieHeader", "(Ljava/lang/String;)Ljava/util/List;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpMessagePropertiesKt {
    public static final List<HeaderValue> cacheControl(HttpMessage httpMessage) {
        List<HeaderValue> headerValue;
        l.f("<this>", httpMessage);
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getCacheControl());
        return (str == null || (headerValue = HttpHeaderValueParserKt.parseHeaderValue(str)) == null) ? y.f7779k : headerValue;
    }

    public static final Charset charset(HttpMessageBuilder httpMessageBuilder) {
        l.f("<this>", httpMessageBuilder);
        ContentType contentType = contentType(httpMessageBuilder);
        if (contentType != null) {
            return ContentTypesKt.charset(contentType);
        }
        return null;
    }

    public static final Long contentLength(HttpMessageBuilder httpMessageBuilder) {
        l.f("<this>", httpMessageBuilder);
        String str = httpMessageBuilder.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static final void contentType(HttpMessageBuilder httpMessageBuilder, ContentType contentType) {
        l.f("<this>", httpMessageBuilder);
        l.f(LinkHeader.Parameters.Type, contentType);
        httpMessageBuilder.getHeaders().set(HttpHeaders.INSTANCE.getContentType(), contentType.toString());
    }

    public static final List<Cookie> cookies(HttpMessageBuilder httpMessageBuilder) {
        l.f("<this>", httpMessageBuilder);
        List<String> all = httpMessageBuilder.getHeaders().getAll(HttpHeaders.INSTANCE.getSetCookie());
        if (all == null) {
            return y.f7779k;
        }
        ArrayList arrayList = new ArrayList(r.p(all, 10));
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            arrayList.add(CookieKt.parseServerSetCookieHeader((String) it.next()));
        }
        return arrayList;
    }

    public static final String etag(HttpMessageBuilder httpMessageBuilder) {
        l.f("<this>", httpMessageBuilder);
        return httpMessageBuilder.getHeaders().get(HttpHeaders.INSTANCE.getETag());
    }

    public static final void ifNoneMatch(HttpMessageBuilder httpMessageBuilder, String str) {
        l.f("<this>", httpMessageBuilder);
        l.f("value", str);
        httpMessageBuilder.getHeaders().set(HttpHeaders.INSTANCE.getIfNoneMatch(), str);
    }

    public static final void maxAge(HttpMessageBuilder httpMessageBuilder, int i7) {
        l.f("<this>", httpMessageBuilder);
        httpMessageBuilder.getHeaders().append(HttpHeaders.INSTANCE.getCacheControl(), "max-age=" + i7);
    }

    public static final List<Cookie> setCookie(HttpMessage httpMessage) {
        l.f("<this>", httpMessage);
        List<String> all = httpMessage.getHeaders().getAll(HttpHeaders.INSTANCE.getSetCookie());
        if (all == null) {
            return y.f7779k;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            v.e0(arrayList, splitSetCookieHeader((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(r.p(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(CookieKt.parseServerSetCookieHeader((String) it2.next()));
        }
        return arrayList2;
    }

    public static final List<String> splitSetCookieHeader(String str) {
        int i7;
        l.f("<this>", str);
        int i8 = 0;
        int iD0 = AbstractC2510o.d0(str, ',', 0, 6);
        if (iD0 == -1) {
            return r.H(str);
        }
        ArrayList arrayList = new ArrayList();
        int iD02 = AbstractC2510o.d0(str, '=', iD0, 4);
        int iD03 = AbstractC2510o.d0(str, ';', iD0, 4);
        while (i8 < str.length() && iD0 > 0) {
            if (iD02 < iD0) {
                iD02 = AbstractC2510o.d0(str, '=', iD0, 4);
            }
            int iD04 = AbstractC2510o.d0(str, ',', iD0 + 1, 4);
            while (true) {
                int i9 = iD04;
                i7 = iD0;
                iD0 = i9;
                if (iD0 < 0 || iD0 >= iD02) {
                    break;
                }
                iD04 = AbstractC2510o.d0(str, ',', iD0 + 1, 4);
            }
            if (iD03 < i7) {
                iD03 = AbstractC2510o.d0(str, ';', i7, 4);
            }
            if (iD02 < 0) {
                String strSubstring = str.substring(i8);
                l.e("substring(...)", strSubstring);
                arrayList.add(strSubstring);
                return arrayList;
            }
            if (iD03 == -1 || iD03 > iD02) {
                String strSubstring2 = str.substring(i8, i7);
                l.e("substring(...)", strSubstring2);
                arrayList.add(strSubstring2);
                i8 = i7 + 1;
            }
        }
        if (i8 < str.length()) {
            String strSubstring3 = str.substring(i8);
            l.e("substring(...)", strSubstring3);
            arrayList.add(strSubstring3);
        }
        return arrayList;
    }

    public static final void userAgent(HttpMessageBuilder httpMessageBuilder, String str) {
        l.f("<this>", httpMessageBuilder);
        l.f("content", str);
        httpMessageBuilder.getHeaders().set(HttpHeaders.INSTANCE.getUserAgent(), str);
    }

    public static final List<String> vary(HttpMessageBuilder httpMessageBuilder) {
        l.f("<this>", httpMessageBuilder);
        List<String> all = httpMessageBuilder.getHeaders().getAll(HttpHeaders.INSTANCE.getVary());
        if (all == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            List listU0 = AbstractC2510o.u0((String) it.next(), new String[]{","}, 0, 6);
            ArrayList arrayList2 = new ArrayList(r.p(listU0, 10));
            Iterator it2 = listU0.iterator();
            while (it2.hasNext()) {
                arrayList2.add(AbstractC2510o.J0((String) it2.next()).toString());
            }
            v.e0(arrayList, arrayList2);
        }
        return arrayList;
    }

    public static final Charset charset(HttpMessage httpMessage) {
        l.f("<this>", httpMessage);
        ContentType contentType = contentType(httpMessage);
        if (contentType != null) {
            return ContentTypesKt.charset(contentType);
        }
        return null;
    }

    public static final Long contentLength(HttpMessage httpMessage) {
        l.f("<this>", httpMessage);
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static final ContentType contentType(HttpMessageBuilder httpMessageBuilder) {
        l.f("<this>", httpMessageBuilder);
        String str = httpMessageBuilder.getHeaders().get(HttpHeaders.INSTANCE.getContentType());
        if (str != null) {
            return ContentType.INSTANCE.parse(str);
        }
        return null;
    }

    public static final String etag(HttpMessage httpMessage) {
        l.f("<this>", httpMessage);
        return httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getETag());
    }

    public static final ContentType contentType(HttpMessage httpMessage) {
        l.f("<this>", httpMessage);
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getContentType());
        if (str != null) {
            return ContentType.INSTANCE.parse(str);
        }
        return null;
    }

    public static final List<String> vary(HttpMessage httpMessage) {
        l.f("<this>", httpMessage);
        List<String> all = httpMessage.getHeaders().getAll(HttpHeaders.INSTANCE.getVary());
        if (all == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            List listU0 = AbstractC2510o.u0((String) it.next(), new String[]{","}, 0, 6);
            ArrayList arrayList2 = new ArrayList(r.p(listU0, 10));
            Iterator it2 = listU0.iterator();
            while (it2.hasNext()) {
                arrayList2.add(AbstractC2510o.J0((String) it2.next()).toString());
            }
            v.e0(arrayList, arrayList2);
        }
        return arrayList;
    }
}
