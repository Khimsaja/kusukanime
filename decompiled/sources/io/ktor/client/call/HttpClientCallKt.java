package io.ktor.client.call;

import S3.c;
import T3.a;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0004H\u0086H¢\u0006\u0004\b\u0002\u0010\u0005\u001a\"\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0002\u0010\b¨\u0006\t"}, d2 = {"T", "Lio/ktor/client/call/HttpClientCall;", "body", "(Lio/ktor/client/call/HttpClientCall;LS3/c;)Ljava/lang/Object;", "Lio/ktor/client/statement/HttpResponse;", "(Lio/ktor/client/statement/HttpResponse;LS3/c;)Ljava/lang/Object;", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "(Lio/ktor/client/statement/HttpResponse;Lio/ktor/util/reflect/TypeInfo;LS3/c;)Ljava/lang/Object;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpClientCallKt {
    public static final <T> Object body(HttpResponse httpResponse, c<? super T> cVar) {
        httpResponse.getCall();
        l.k();
        throw null;
    }

    public static final <T> Object body(HttpResponse httpResponse, TypeInfo typeInfo, c<? super T> cVar) {
        Object objBodyNullable = httpResponse.getCall().bodyNullable(typeInfo, cVar);
        a aVar = a.f9048k;
        return objBodyNullable;
    }

    public static final <T> Object body(HttpClientCall httpClientCall, c<? super T> cVar) {
        l.k();
        throw null;
    }
}
