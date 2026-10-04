package io.ktor.client.engine;

import H5.C0263e0;
import H5.C0284z;
import H5.InterfaceC0265f0;
import H5.h0;
import O3.C;
import S3.h;
import e4.k;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.engine.UtilsKt;
import io.ktor.client.request.HttpRequestData;
import io.ktor.http.HttpHeaders;
import io.ktor.http.UnsafeHeaderException;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.C1447z;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0080@¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"$\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "Lio/ktor/client/engine/HttpClientEngineFactory;", "Lkotlin/Function1;", "LO3/C;", "nested", "config", "(Lio/ktor/client/engine/HttpClientEngineFactory;Le4/k;)Lio/ktor/client/engine/HttpClientEngineFactory;", "Lio/ktor/client/engine/HttpClientEngine;", "LH5/f0;", "parentJob", "LS3/h;", "createCallContext", "(Lio/ktor/client/engine/HttpClientEngine;LH5/f0;LS3/c;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestData;", "request", "validateHeaders", "(Lio/ktor/client/request/HttpRequestData;)V", "LH5/z;", "CALL_COROUTINE", "LH5/z;", "getCALL_COROUTINE", "()LH5/z;", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/HttpClientConfig;", "CLIENT_CONFIG", "Lio/ktor/util/AttributeKey;", "getCLIENT_CONFIG", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpClientEngineKt {
    private static final C0284z CALL_COROUTINE = new C0284z("call-context");
    private static final AttributeKey<HttpClientConfig<?>> CLIENT_CONFIG;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"io/ktor/client/engine/HttpClientEngineKt$config$1", "Lio/ktor/client/engine/HttpClientEngineFactory;", "Lkotlin/Function1;", "LO3/C;", "block", "Lio/ktor/client/engine/HttpClientEngine;", "create", "(Le4/k;)Lio/ktor/client/engine/HttpClientEngine;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.engine.HttpClientEngineKt$config$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements HttpClientEngineFactory<T> {
        final /* synthetic */ k $nested;
        final /* synthetic */ HttpClientEngineFactory<T> $parent;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HttpClientEngineFactory<? extends T> httpClientEngineFactory, k kVar) {
            this.$parent = httpClientEngineFactory;
            this.$nested = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C create$lambda$0(k kVar, k kVar2, HttpClientEngineConfig httpClientEngineConfig) {
            l.f("$this$create", httpClientEngineConfig);
            kVar.invoke(httpClientEngineConfig);
            kVar2.invoke(httpClientEngineConfig);
            return C.a;
        }

        @Override // io.ktor.client.engine.HttpClientEngineFactory
        public HttpClientEngine create(k block) {
            l.f("block", block);
            return this.$parent.create(new a(1, this.$nested, block));
        }
    }

    static {
        InterfaceC1444w interfaceC1444wB;
        InterfaceC1425d interfaceC1425dB = y.a.b(HttpClientConfig.class);
        try {
            interfaceC1444wB = y.b(HttpClientConfig.class, C1447z.f12758c);
        } catch (Throwable unused) {
            interfaceC1444wB = null;
        }
        CLIENT_CONFIG = new AttributeKey<>("client-config", new TypeInfo(interfaceC1425dB, interfaceC1444wB));
    }

    public static final <T extends HttpClientEngineConfig> HttpClientEngineFactory<T> config(HttpClientEngineFactory<? extends T> httpClientEngineFactory, k kVar) {
        l.f("<this>", httpClientEngineFactory);
        l.f("nested", kVar);
        return new AnonymousClass1(httpClientEngineFactory, kVar);
    }

    public static final Object createCallContext(HttpClientEngine httpClientEngine, InterfaceC0265f0 interfaceC0265f0, S3.c<? super h> cVar) {
        h0 h0Var = new h0(interfaceC0265f0);
        h hVarPlus = httpClientEngine.getCoroutineContext().plus(h0Var).plus(CALL_COROUTINE);
        InterfaceC0265f0 interfaceC0265f02 = (InterfaceC0265f0) cVar.getContext().get(C0263e0.f3843k);
        if (interfaceC0265f02 == null) {
            return hVarPlus;
        }
        h0Var.x(new UtilsKt.AnonymousClass2(interfaceC0265f02.L(true, true, new UtilsKt$attachToUserJob$cleanupHandler$1(h0Var))));
        return hVarPlus;
    }

    public static final C0284z getCALL_COROUTINE() {
        return CALL_COROUTINE;
    }

    public static final AttributeKey<HttpClientConfig<?>> getCLIENT_CONFIG() {
        return CLIENT_CONFIG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateHeaders(HttpRequestData httpRequestData) {
        Set<String> setNames = httpRequestData.getHeaders().names();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setNames) {
            if (HttpHeaders.INSTANCE.getUnsafeHeadersList().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new UnsafeHeaderException(arrayList.toString());
        }
    }
}
