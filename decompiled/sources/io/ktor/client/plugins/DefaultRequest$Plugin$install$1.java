package io.ktor.client.plugins;

import O3.C;
import P3.r;
import U3.j;
import b1.AbstractC0703b;
import e4.o;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.StringValuesKt;
import io.ktor.util.pipeline.PipelineContext;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "it", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
@U3.e(c = "io.ktor.client.plugins.DefaultRequest$Plugin$install$1", f = "DefaultRequest.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultRequest$Plugin$install$1 extends j implements o {
    final /* synthetic */ DefaultRequest $plugin;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultRequest$Plugin$install$1(DefaultRequest defaultRequest, S3.c<? super DefaultRequest$Plugin$install$1> cVar) {
        super(3, cVar);
        this.$plugin = defaultRequest;
    }

    @Override // e4.o
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, S3.c<? super C> cVar) {
        DefaultRequest$Plugin$install$1 defaultRequest$Plugin$install$1 = new DefaultRequest$Plugin$install$1(this.$plugin, cVar);
        defaultRequest$Plugin$install$1.L$0 = pipelineContext;
        return defaultRequest$Plugin$install$1.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.Y(obj);
        PipelineContext pipelineContext = (PipelineContext) this.L$0;
        String string = ((HttpRequestBuilder) pipelineContext.getContext()).getUrl().toString();
        DefaultRequest.DefaultRequestBuilder defaultRequestBuilder = new DefaultRequest.DefaultRequestBuilder();
        DefaultRequest defaultRequest = this.$plugin;
        StringValuesKt.appendAll(defaultRequestBuilder.getHeaders(), ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders());
        Headers headersBuild = defaultRequestBuilder.getHeaders().build();
        defaultRequest.block.invoke(defaultRequestBuilder);
        Iterator<T> it = headersBuild.entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            List<String> all = defaultRequestBuilder.getHeaders().getAll(str);
            if (all == null) {
                defaultRequestBuilder.getHeaders().appendAll(str, list);
            } else if (!all.equals(list) && !l.a(str, HttpHeaders.INSTANCE.getCookie())) {
                defaultRequestBuilder.getHeaders().remove(str);
                defaultRequestBuilder.getHeaders().appendAll(str, list);
                defaultRequestBuilder.getHeaders().appendMissing(str, all);
            }
        }
        DefaultRequest.INSTANCE.mergeUrls(defaultRequestBuilder.getUrl().build(), ((HttpRequestBuilder) pipelineContext.getContext()).getUrl());
        for (AttributeKey<?> attributeKey : defaultRequestBuilder.getAttributes().getAllKeys()) {
            if (!((HttpRequestBuilder) pipelineContext.getContext()).getAttributes().contains(attributeKey)) {
                Attributes attributes = ((HttpRequestBuilder) pipelineContext.getContext()).getAttributes();
                l.d("null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>", attributeKey);
                attributes.put(attributeKey, defaultRequestBuilder.getAttributes().get(attributeKey));
            }
        }
        ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders().clear();
        ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders().appendAll(defaultRequestBuilder.getHeaders().build());
        z6.b bVar = DefaultRequestKt.LOGGER;
        StringBuilder sbQ = AbstractC0703b.q("Applied DefaultRequest to ", string, ". New url: ");
        sbQ.append(((HttpRequestBuilder) pipelineContext.getContext()).getUrl());
        bVar.e(sbQ.toString());
        return C.a;
    }
}
