package io.ktor.client.plugins.contentnegotiation;

import O3.C;
import P3.r;
import S3.c;
import T3.a;
import U3.e;
import U3.j;
import e4.q;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.TransformRequestBodyContext;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.reflect.TypeInfo;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import l4.InterfaceC1425d;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\n"}, d2 = {"<anonymous>", "Lio/ktor/http/content/OutgoingContent;", "Lio/ktor/client/plugins/api/TransformRequestBodyContext;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "body", "", "<unused var>", "Lio/ktor/util/reflect/TypeInfo;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$1", f = "ContentNegotiation.kt", l = {289}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ContentNegotiationKt$ContentNegotiation$2$1 extends j implements q {
    final /* synthetic */ Set<InterfaceC1425d> $ignoredTypes;
    final /* synthetic */ List<ContentNegotiationConfig.ConverterRegistration> $registrations;
    final /* synthetic */ ClientPluginBuilder<ContentNegotiationConfig> $this_createClientPlugin;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContentNegotiationKt$ContentNegotiation$2$1(List<ContentNegotiationConfig.ConverterRegistration> list, Set<? extends InterfaceC1425d> set, ClientPluginBuilder<ContentNegotiationConfig> clientPluginBuilder, c<? super ContentNegotiationKt$ContentNegotiation$2$1> cVar) {
        super(5, cVar);
        this.$registrations = list;
        this.$ignoredTypes = set;
        this.$this_createClientPlugin = clientPluginBuilder;
    }

    @Override // e4.q
    public final Object invoke(TransformRequestBodyContext transformRequestBodyContext, HttpRequestBuilder httpRequestBuilder, Object obj, TypeInfo typeInfo, c<? super OutgoingContent> cVar) {
        ContentNegotiationKt$ContentNegotiation$2$1 contentNegotiationKt$ContentNegotiation$2$1 = new ContentNegotiationKt$ContentNegotiation$2$1(this.$registrations, this.$ignoredTypes, this.$this_createClientPlugin, cVar);
        contentNegotiationKt$ContentNegotiation$2$1.L$0 = httpRequestBuilder;
        contentNegotiationKt$ContentNegotiation$2$1.L$1 = obj;
        return contentNegotiationKt$ContentNegotiation$2$1.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f9048k;
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            return obj;
        }
        r.Y(obj);
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$0;
        Object obj2 = this.L$1;
        List<ContentNegotiationConfig.ConverterRegistration> list = this.$registrations;
        Set<InterfaceC1425d> set = this.$ignoredTypes;
        ClientPluginBuilder<ContentNegotiationConfig> clientPluginBuilder = this.$this_createClientPlugin;
        this.L$0 = null;
        this.label = 1;
        Object objContentNegotiation$lambda$16$convertRequest = ContentNegotiationKt.ContentNegotiation$lambda$16$convertRequest(list, set, clientPluginBuilder, httpRequestBuilder, obj2, this);
        return objContentNegotiation$lambda$16$convertRequest == aVar ? aVar : objContentNegotiation$lambda$16$convertRequest;
    }
}
