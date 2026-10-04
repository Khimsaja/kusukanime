package io.ktor.client.plugins.contentnegotiation;

import O3.C;
import P3.r;
import S3.c;
import T3.a;
import U3.e;
import U3.j;
import e4.q;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.TransformResponseBodyContext;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.http.ContentType;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.Url;
import io.ktor.serialization.ContentConverterKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import l4.InterfaceC1425d;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/api/TransformResponseBodyContext;", "response", "Lio/ktor/client/statement/HttpResponse;", "body", "Lio/ktor/utils/io/ByteReadChannel;", "info", "Lio/ktor/util/reflect/TypeInfo;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$2", f = "ContentNegotiation.kt", l = {296}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ContentNegotiationKt$ContentNegotiation$2$2 extends j implements q {
    final /* synthetic */ Set<InterfaceC1425d> $ignoredTypes;
    final /* synthetic */ List<ContentNegotiationConfig.ConverterRegistration> $registrations;
    final /* synthetic */ ClientPluginBuilder<ContentNegotiationConfig> $this_createClientPlugin;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContentNegotiationKt$ContentNegotiation$2$2(Set<? extends InterfaceC1425d> set, List<ContentNegotiationConfig.ConverterRegistration> list, ClientPluginBuilder<ContentNegotiationConfig> clientPluginBuilder, c<? super ContentNegotiationKt$ContentNegotiation$2$2> cVar) {
        super(5, cVar);
        this.$ignoredTypes = set;
        this.$registrations = list;
        this.$this_createClientPlugin = clientPluginBuilder;
    }

    @Override // e4.q
    public final Object invoke(TransformResponseBodyContext transformResponseBodyContext, HttpResponse httpResponse, ByteReadChannel byteReadChannel, TypeInfo typeInfo, c<Object> cVar) {
        ContentNegotiationKt$ContentNegotiation$2$2 contentNegotiationKt$ContentNegotiation$2$2 = new ContentNegotiationKt$ContentNegotiation$2$2(this.$ignoredTypes, this.$registrations, this.$this_createClientPlugin, cVar);
        contentNegotiationKt$ContentNegotiation$2$2.L$0 = httpResponse;
        contentNegotiationKt$ContentNegotiation$2$2.L$1 = byteReadChannel;
        contentNegotiationKt$ContentNegotiation$2$2.L$2 = typeInfo;
        return contentNegotiationKt$ContentNegotiation$2$2.invokeSuspend(C.a);
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
        HttpResponse httpResponse = (HttpResponse) this.L$0;
        ByteReadChannel byteReadChannel = (ByteReadChannel) this.L$1;
        TypeInfo typeInfo = (TypeInfo) this.L$2;
        ContentType contentType = HttpMessagePropertiesKt.contentType(httpResponse);
        if (contentType == null) {
            return null;
        }
        Charset charsetSuitableCharset$default = ContentConverterKt.suitableCharset$default(HttpResponseKt.getRequest(httpResponse).getHeaders(), null, 1, null);
        Set<InterfaceC1425d> set = this.$ignoredTypes;
        List<ContentNegotiationConfig.ConverterRegistration> list = this.$registrations;
        ClientPluginBuilder<ContentNegotiationConfig> clientPluginBuilder = this.$this_createClientPlugin;
        Url url = HttpResponseKt.getRequest(httpResponse).getUrl();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object objContentNegotiation$lambda$16$convertResponse = ContentNegotiationKt.ContentNegotiation$lambda$16$convertResponse(set, list, clientPluginBuilder, url, typeInfo, byteReadChannel, contentType, charsetSuitableCharset$default, this);
        return objContentNegotiation$lambda$16$convertResponse == aVar ? aVar : objContentNegotiation$lambda$16$convertResponse;
    }
}
