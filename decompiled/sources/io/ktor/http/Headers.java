package io.ktor.http;

import e4.k;
import e4.n;
import io.ktor.http.ContentDisposition;
import io.ktor.util.StringValues;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/Headers;", "Lio/ktor/util/StringValues;", "Companion", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Headers extends StringValues {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lio/ktor/http/Headers$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lio/ktor/http/HeadersBuilder;", "LO3/C;", "builder", "Lio/ktor/http/Headers;", "build", "(Le4/k;)Lio/ktor/http/Headers;", "Empty", "Lio/ktor/http/Headers;", "getEmpty", "()Lio/ktor/http/Headers;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Headers Empty = EmptyHeaders.INSTANCE;

        private Companion() {
        }

        public final Headers build(k builder) {
            l.f("builder", builder);
            HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
            builder.invoke(headersBuilder);
            return headersBuilder.build();
        }

        public final Headers getEmpty() {
            return Empty;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean contains(Headers headers, String str) {
            l.f(ContentDisposition.Parameters.Name, str);
            return StringValues.DefaultImpls.contains(headers, str);
        }

        public static void forEach(Headers headers, n nVar) {
            l.f("body", nVar);
            StringValues.DefaultImpls.forEach(headers, nVar);
        }

        public static String get(Headers headers, String str) {
            l.f(ContentDisposition.Parameters.Name, str);
            return StringValues.DefaultImpls.get(headers, str);
        }

        public static boolean contains(Headers headers, String str, String str2) {
            l.f(ContentDisposition.Parameters.Name, str);
            l.f("value", str2);
            return StringValues.DefaultImpls.contains(headers, str, str2);
        }
    }
}
