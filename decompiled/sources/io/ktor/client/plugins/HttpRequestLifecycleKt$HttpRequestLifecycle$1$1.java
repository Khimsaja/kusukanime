package io.ktor.client.plugins;

import H5.C0263e0;
import H5.InterfaceC0265f0;
import H5.h0;
import H5.r;
import H5.v0;
import O3.C;
import U3.j;
import e4.k;
import e4.o;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "request", "Lkotlin/Function1;", "LS3/c;", "LO3/C;", "", "proceed", "<anonymous>", "(Lio/ktor/client/request/HttpRequestBuilder;Le4/k;)V"}, k = 3, mv = {2, 1, 0})
@U3.e(c = "io.ktor.client.plugins.HttpRequestLifecycleKt$HttpRequestLifecycle$1$1", f = "HttpRequestLifecycle.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpRequestLifecycleKt$HttpRequestLifecycle$1$1 extends j implements o {
    final /* synthetic */ ClientPluginBuilder<C> $this_createClientPlugin;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(ClientPluginBuilder<C> clientPluginBuilder, S3.c<? super HttpRequestLifecycleKt$HttpRequestLifecycle$1$1> cVar) {
        super(3, cVar);
        this.$this_createClientPlugin = clientPluginBuilder;
    }

    @Override // e4.o
    public final Object invoke(HttpRequestBuilder httpRequestBuilder, k kVar, S3.c<? super C> cVar) {
        HttpRequestLifecycleKt$HttpRequestLifecycle$1$1 httpRequestLifecycleKt$HttpRequestLifecycle$1$1 = new HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(this.$this_createClientPlugin, cVar);
        httpRequestLifecycleKt$HttpRequestLifecycle$1$1.L$0 = httpRequestBuilder;
        httpRequestLifecycleKt$HttpRequestLifecycle$1$1.L$1 = kVar;
        return httpRequestLifecycleKt$HttpRequestLifecycle$1$1.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        r rVar;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = (r) this.L$0;
            try {
                P3.r.Y(obj);
                ((h0) rVar).Z();
                return C.a;
            } catch (Throwable th) {
                th = th;
                try {
                    ((h0) rVar).a0(th);
                    throw th;
                } catch (Throwable th2) {
                    ((h0) rVar).Z();
                    throw th2;
                }
            }
        }
        P3.r.Y(obj);
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$0;
        k kVar = (k) this.L$1;
        v0 v0Var = new v0(httpRequestBuilder.getExecutionContext());
        S3.f fVar = this.$this_createClientPlugin.getClient().getCoroutineContext().get(C0263e0.f3843k);
        l.c(fVar);
        HttpRequestLifecycleKt.attachToClientEngineJob(v0Var, (InterfaceC0265f0) fVar);
        try {
            httpRequestBuilder.setExecutionContext$ktor_client_core(v0Var);
            this.L$0 = v0Var;
            this.label = 1;
            if (kVar.invoke(this) == aVar) {
                return aVar;
            }
            rVar = v0Var;
            ((h0) rVar).Z();
            return C.a;
        } catch (Throwable th3) {
            th = th3;
            rVar = v0Var;
            ((h0) rVar).a0(th);
            throw th;
        }
    }
}
