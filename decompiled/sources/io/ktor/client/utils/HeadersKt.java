package io.ktor.client.utils;

import O3.C;
import e4.k;
import io.ktor.client.request.a;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lio/ktor/http/HeadersBuilder;", "LO3/C;", "block", "Lio/ktor/http/Headers;", "buildHeaders", "(Le4/k;)Lio/ktor/http/Headers;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeadersKt {
    public static final Headers buildHeaders(k kVar) {
        l.f("block", kVar);
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        kVar.invoke(headersBuilder);
        return headersBuilder.build();
    }

    public static /* synthetic */ Headers buildHeaders$default(k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            kVar = new a(9);
        }
        return buildHeaders(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C buildHeaders$lambda$0(HeadersBuilder headersBuilder) {
        l.f("<this>", headersBuilder);
        return C.a;
    }
}
