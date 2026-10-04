package io.ktor.http;

import P3.q;
import P3.r;
import P3.v;
import e4.k;
import io.ktor.util.StringValuesKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000J\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a!\u0010\u000b\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u0004\u001a\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011\u001a\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0012\u001a\u0019\u0010\u0013\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0013\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0015\u001a/\u0010\u001c\u001a\u00020\t*\u00060\u0016j\u0002`\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u001c\u001a\u00020\t*\u00060\u0016j\u0002`\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010 \u001a+\u0010%\u001a\u00020\t*\u00060!j\u0002`\"2\b\u0010#\u001a\u0004\u0018\u00010\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b%\u0010&\"\u0015\u0010)\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0015\u0010+\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010(\"\u0015\u0010-\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010(\"\u0015\u0010.\u001a\u00020\u001a*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0015\u00100\u001a\u00020\u001a*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u0010/\"\u0015\u0010.\u001a\u00020\u001a*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b.\u00101\"\u0015\u00100\u001a\u00020\u001a*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"", "urlString", "Lio/ktor/http/Url;", "Url", "(Ljava/lang/String;)Lio/ktor/http/Url;", "Lio/ktor/http/URLBuilder;", "builder", "(Lio/ktor/http/URLBuilder;)Lio/ktor/http/Url;", "Lkotlin/Function1;", "LO3/C;", "block", "buildUrl", "(Le4/k;)Lio/ktor/http/Url;", "parseUrl", "URLBuilder", "(Ljava/lang/String;)Lio/ktor/http/URLBuilder;", "url", "(Lio/ktor/http/Url;)Lio/ktor/http/URLBuilder;", "(Lio/ktor/http/URLBuilder;)Lio/ktor/http/URLBuilder;", "takeFrom", "(Lio/ktor/http/URLBuilder;Lio/ktor/http/URLBuilder;)Lio/ktor/http/URLBuilder;", "(Lio/ktor/http/URLBuilder;Lio/ktor/http/Url;)Lio/ktor/http/URLBuilder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "encodedPath", "encodedQuery", "", "trailingQuery", "appendUrlFullPath", "(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Z)V", "Lio/ktor/http/ParametersBuilder;", "encodedQueryParameters", "(Ljava/lang/Appendable;Ljava/lang/String;Lio/ktor/http/ParametersBuilder;Z)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "encodedUser", "encodedPassword", "appendUserAndPassword", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V", "getFullPath", "(Lio/ktor/http/Url;)Ljava/lang/String;", "fullPath", "getHostWithPort", "hostWithPort", "getHostWithPortIfSpecified", "hostWithPortIfSpecified", "isAbsolutePath", "(Lio/ktor/http/Url;)Z", "isRelativePath", "(Lio/ktor/http/URLBuilder;)Z", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class URLUtilsKt {
    public static final URLBuilder URLBuilder(String str) {
        l.f("urlString", str);
        return URLParserKt.takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), str);
    }

    public static final Url Url(String str) {
        l.f("urlString", str);
        return URLBuilder(str).build();
    }

    public static final void appendUrlFullPath(Appendable appendable, String str, String str2, boolean z7) throws IOException {
        l.f("<this>", appendable);
        l.f("encodedPath", str);
        l.f("encodedQuery", str2);
        if (!AbstractC2510o.g0(str) && !AbstractC2517v.T(str, "/", false)) {
            appendable.append('/');
        }
        appendable.append(str);
        if (str2.length() > 0 || z7) {
            appendable.append("?");
        }
        appendable.append(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence appendUrlFullPath$lambda$6(O3.l lVar) {
        l.f("it", lVar);
        String str = (String) lVar.f7528k;
        Object obj = lVar.f7529l;
        if (obj == null) {
            return str;
        }
        return str + '=' + String.valueOf(obj);
    }

    public static final void appendUserAndPassword(StringBuilder sb, String str, String str2) {
        l.f("<this>", sb);
        if (str == null) {
            return;
        }
        sb.append(str);
        if (str2 != null) {
            sb.append(':');
            sb.append(str2);
        }
        sb.append("@");
    }

    public static final Url buildUrl(k kVar) {
        l.f("block", kVar);
        URLBuilder uRLBuilder = new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null);
        kVar.invoke(uRLBuilder);
        return uRLBuilder.build();
    }

    public static final String getFullPath(Url url) throws IOException {
        l.f("<this>", url);
        StringBuilder sb = new StringBuilder();
        appendUrlFullPath(sb, url.getEncodedPath(), url.getEncodedQuery(), url.getTrailingQuery());
        return sb.toString();
    }

    public static final String getHostWithPort(Url url) {
        l.f("<this>", url);
        return url.getHost() + ':' + url.getPort();
    }

    public static final String getHostWithPortIfSpecified(Url url) {
        l.f("<this>", url);
        int specifiedPort = url.getSpecifiedPort();
        return (specifiedPort == 0 || specifiedPort == url.getProtocol().getDefaultPort()) ? url.getHost() : getHostWithPort(url);
    }

    public static final boolean isAbsolutePath(Url url) {
        l.f("<this>", url);
        return l.a(q.t0(url.getRawSegments()), "");
    }

    public static final boolean isRelativePath(Url url) {
        l.f("<this>", url);
        return !isAbsolutePath(url);
    }

    public static final Url parseUrl(String str) {
        l.f("urlString", str);
        try {
            URLBuilder URLBuilder = URLBuilder(str);
            if (URLBuilder.getHost().length() <= 0) {
                URLBuilder = null;
            }
            if (URLBuilder != null) {
                return URLBuilder.build();
            }
        } catch (URLParserException unused) {
        }
        return null;
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, URLBuilder uRLBuilder2) {
        l.f("<this>", uRLBuilder);
        l.f("url", uRLBuilder2);
        uRLBuilder.setProtocolOrNull(uRLBuilder2.getProtocolOrNull());
        uRLBuilder.setHost(uRLBuilder2.getHost());
        uRLBuilder.setPort(uRLBuilder2.getPort());
        uRLBuilder.setEncodedPathSegments(uRLBuilder2.getEncodedPathSegments());
        uRLBuilder.setEncodedUser(uRLBuilder2.getEncodedUser());
        uRLBuilder.setEncodedPassword(uRLBuilder2.getEncodedPassword());
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        StringValuesKt.appendAll(parametersBuilderParametersBuilder$default, uRLBuilder2.getEncodedParameters());
        uRLBuilder.setEncodedParameters(parametersBuilderParametersBuilder$default);
        uRLBuilder.setEncodedFragment(uRLBuilder2.getEncodedFragment());
        uRLBuilder.setTrailingQuery(uRLBuilder2.getTrailingQuery());
        return uRLBuilder;
    }

    public static final URLBuilder URLBuilder(Url url) {
        l.f("url", url);
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), url);
    }

    public static final Url Url(URLBuilder uRLBuilder) {
        l.f("builder", uRLBuilder);
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), uRLBuilder).build();
    }

    public static final boolean isAbsolutePath(URLBuilder uRLBuilder) {
        l.f("<this>", uRLBuilder);
        return l.a(q.t0(uRLBuilder.getPathSegments()), "");
    }

    public static final boolean isRelativePath(URLBuilder uRLBuilder) {
        l.f("<this>", uRLBuilder);
        return !isAbsolutePath(uRLBuilder);
    }

    public static final URLBuilder URLBuilder(URLBuilder uRLBuilder) {
        l.f("builder", uRLBuilder);
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), uRLBuilder);
    }

    public static final void appendUrlFullPath(Appendable appendable, String str, ParametersBuilder parametersBuilder, boolean z7) throws IOException {
        List listH;
        l.f("<this>", appendable);
        l.f("encodedPath", str);
        l.f("encodedQueryParameters", parametersBuilder);
        if (!AbstractC2510o.g0(str) && !AbstractC2517v.T(str, "/", false)) {
            appendable.append('/');
        }
        appendable.append(str);
        if (!parametersBuilder.isEmpty() || z7) {
            appendable.append("?");
        }
        Set<Map.Entry<String, List<String>>> setEntries = parametersBuilder.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listH = r.H(new O3.l(str2, null));
            } else {
                ArrayList arrayList2 = new ArrayList(r.p(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new O3.l(str2, (String) it2.next()));
                }
                listH = arrayList2;
            }
            v.e0(arrayList, listH);
        }
        q.x0(arrayList, appendable, "&", null, null, new io.ktor.client.request.a(21), 60);
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, Url url) {
        l.f("<this>", uRLBuilder);
        l.f("url", url);
        uRLBuilder.setProtocolOrNull(url.getProtocolOrNull());
        uRLBuilder.setHost(url.getHost());
        uRLBuilder.setPort(url.getPort());
        URLBuilderKt.setEncodedPath(uRLBuilder, url.getEncodedPath());
        uRLBuilder.setEncodedUser(url.getEncodedUser());
        uRLBuilder.setEncodedPassword(url.getEncodedPassword());
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        parametersBuilderParametersBuilder$default.appendAll(QueryKt.parseQueryString$default(url.getEncodedQuery(), 0, 0, false, 6, null));
        uRLBuilder.setEncodedParameters(parametersBuilderParametersBuilder$default);
        uRLBuilder.setEncodedFragment(url.getEncodedFragment());
        uRLBuilder.setTrailingQuery(url.getTrailingQuery());
        return uRLBuilder;
    }
}
