package io.github.jan.supabase.network;

import O3.C;
import e4.k;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.ContentType;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
/* loaded from: classes.dex */
public final class SupabaseHttpClient$postJson$$inlined$post$1 implements k {
    final /* synthetic */ Object $body;
    final /* synthetic */ k $builder;
    final /* synthetic */ ContentType $contentType;

    public SupabaseHttpClient$postJson$$inlined$post$1(k kVar, ContentType contentType, Object obj) {
        this.$builder = kVar;
        this.$contentType = contentType;
        this.$body = obj;
    }

    @Override // e4.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HttpRequestBuilder) obj);
        return C.a;
    }

    public final void invoke(HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$request", httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        this.$builder.invoke(httpRequestBuilder);
        HttpMessagePropertiesKt.contentType(httpRequestBuilder, this.$contentType);
        Object obj = this.$body;
        if (obj == null) {
            httpRequestBuilder.setBody(NullBody.INSTANCE);
            l.k();
            throw null;
        }
        if (obj instanceof OutgoingContent) {
            httpRequestBuilder.setBody(obj);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(obj);
            l.k();
            throw null;
        }
    }
}
