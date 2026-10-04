package io.ktor.client.engine;

import H5.AbstractC0281w;
import H5.C0263e0;
import H5.C0284z;
import H5.h0;
import H5.r;
import O3.i;
import S3.f;
import S3.h;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.util.CoroutinesUtilsKt;
import io.ktor.utils.io.InternalAPI;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lio/ktor/client/engine/HttpClientEngineBase;", "Lio/ktor/client/engine/HttpClientEngine;", "", "engineName", "<init>", "(Ljava/lang/String;)V", "LO3/C;", "close", "()V", "Ljava/lang/String;", "LH5/w;", "dispatcher$delegate", "LO3/i;", "getDispatcher", "()LH5/w;", "dispatcher", "LS3/h;", "coroutineContext$delegate", "getCoroutineContext", "()LS3/h;", "coroutineContext", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class HttpClientEngineBase implements HttpClientEngine {
    private static final /* synthetic */ AtomicIntegerFieldUpdater closed$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientEngineBase.class, "closed");
    private volatile /* synthetic */ int closed;

    /* renamed from: coroutineContext$delegate, reason: from kotlin metadata */
    private final i coroutineContext;

    /* renamed from: dispatcher$delegate, reason: from kotlin metadata */
    private final i dispatcher;
    private final String engineName;

    public HttpClientEngineBase(String str) {
        l.f("engineName", str);
        this.engineName = str;
        this.closed = 0;
        final int i7 = 0;
        this.dispatcher = z1.c.C(new InterfaceC0821a(this) { // from class: io.ktor.client.engine.b

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ HttpClientEngineBase f12104l;

            {
                this.f12104l = this;
            }

            @Override // e4.InterfaceC0821a
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return HttpClientEngineBase.dispatcher_delegate$lambda$0(this.f12104l);
                    default:
                        return HttpClientEngineBase.coroutineContext_delegate$lambda$1(this.f12104l);
                }
            }
        });
        final int i8 = 1;
        this.coroutineContext = z1.c.C(new InterfaceC0821a(this) { // from class: io.ktor.client.engine.b

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ HttpClientEngineBase f12104l;

            {
                this.f12104l = this;
            }

            @Override // e4.InterfaceC0821a
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return HttpClientEngineBase.dispatcher_delegate$lambda$0(this.f12104l);
                    default:
                        return HttpClientEngineBase.coroutineContext_delegate$lambda$1(this.f12104l);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h coroutineContext_delegate$lambda$1(HttpClientEngineBase httpClientEngineBase) {
        return CoroutinesUtilsKt.SilentSupervisor$default(null, 1, null).plus(httpClientEngineBase.getDispatcher()).plus(new C0284z(AbstractC0703b.m(new StringBuilder(), httpClientEngineBase.engineName, "-context")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0281w dispatcher_delegate$lambda$0(HttpClientEngineBase httpClientEngineBase) {
        AbstractC0281w dispatcher = httpClientEngineBase.getConfig().getDispatcher();
        return dispatcher == null ? HttpClientEngineBase_jvmKt.ioDispatcher() : dispatcher;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (closed$FU.compareAndSet(this, 0, 1)) {
            f fVar = getCoroutineContext().get(C0263e0.f3843k);
            r rVar = fVar instanceof r ? (r) fVar : null;
            if (rVar == null) {
                return;
            }
            ((h0) rVar).Z();
        }
    }

    @Override // io.ktor.client.engine.HttpClientEngine, H5.A
    public h getCoroutineContext() {
        return (h) this.coroutineContext.getValue();
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public AbstractC0281w getDispatcher() {
        return (AbstractC0281w) this.dispatcher.getValue();
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public Set<HttpClientEngineCapability<?>> getSupportedCapabilities() {
        return HttpClientEngine.DefaultImpls.getSupportedCapabilities(this);
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    @InternalAPI
    public void install(HttpClient httpClient) {
        HttpClientEngine.DefaultImpls.install(this, httpClient);
    }
}
