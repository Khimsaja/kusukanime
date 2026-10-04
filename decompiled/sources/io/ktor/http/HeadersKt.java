package io.ktor.http;

import P3.E;
import P3.m;
import P3.r;
import e4.k;
import io.ktor.http.ContentDisposition;
import io.ktor.http.Headers;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0001\u0010\u0006\u001a#\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\u0001\u0010\t\u001aE\u0010\u0001\u001a\u00020\u000026\u0010\f\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u000b0\n\"\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u000b¢\u0006\u0004\b\u0001\u0010\r\u001a!\u0010\u0012\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/http/Headers;", "headersOf", "()Lio/ktor/http/Headers;", "", ContentDisposition.Parameters.Name, "value", "(Ljava/lang/String;Ljava/lang/String;)Lio/ktor/http/Headers;", "", "values", "(Ljava/lang/String;Ljava/util/List;)Lio/ktor/http/Headers;", "", "LO3/l;", "pairs", "([LO3/l;)Lio/ktor/http/Headers;", "Lkotlin/Function1;", "Lio/ktor/http/HeadersBuilder;", "LO3/C;", "builder", "headers", "(Le4/k;)Lio/ktor/http/Headers;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeadersKt {
    public static final Headers headers(k kVar) {
        l.f("builder", kVar);
        Headers.Companion companion = Headers.INSTANCE;
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        kVar.invoke(headersBuilder);
        return headersBuilder.build();
    }

    public static final Headers headersOf() {
        return Headers.INSTANCE.getEmpty();
    }

    public static final Headers headersOf(String str, String str2) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("value", str2);
        return new HeadersSingleImpl(str, r.H(str2));
    }

    public static final Headers headersOf(String str, List<String> list) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("values", list);
        return new HeadersSingleImpl(str, list);
    }

    public static final Headers headersOf(O3.l... lVarArr) {
        l.f("pairs", lVarArr);
        return new HeadersImpl(E.r0(m.P(lVarArr)));
    }
}
