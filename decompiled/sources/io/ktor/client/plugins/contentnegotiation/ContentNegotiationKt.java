package io.ktor.client.plugins.contentnegotiation;

import O3.C;
import P3.m;
import P3.v;
import f.AbstractC0847h;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.ContentType;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import l4.C1447z;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;
import z6.b;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"$\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "", "Lio/ktor/http/ContentType;", "contentType", "LO3/C;", "exclude", "(Lio/ktor/client/request/HttpRequestBuilder;[Lio/ktor/http/ContentType;)V", "Lz6/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lz6/b;", "", "Ll4/d;", "DefaultCommonIgnoredTypes", "Ljava/util/Set;", "getDefaultCommonIgnoredTypes", "()Ljava/util/Set;", "Lio/ktor/util/AttributeKey;", "", "ExcludedContentTypes", "Lio/ktor/util/AttributeKey;", "getExcludedContentTypes", "()Lio/ktor/util/AttributeKey;", "Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/client/plugins/contentnegotiation/ContentNegotiationConfig;", "ContentNegotiation", "Lio/ktor/client/plugins/api/ClientPlugin;", "getContentNegotiation", "()Lio/ktor/client/plugins/api/ClientPlugin;", "getContentNegotiation$annotations", "()V", "ktor-client-content-negotiation"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentNegotiationKt {
    private static final ClientPlugin<ContentNegotiationConfig> ContentNegotiation;
    private static final Set<InterfaceC1425d> DefaultCommonIgnoredTypes;
    private static final AttributeKey<List<ContentType>> ExcludedContentTypes;
    private static final b LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.contentnegotiation.ContentNegotiation");

    static {
        InterfaceC1444w interfaceC1444wB;
        z zVar = y.a;
        DefaultCommonIgnoredTypes = m.v0(new InterfaceC1425d[]{zVar.b(byte[].class), zVar.b(String.class), zVar.b(HttpStatusCode.class), zVar.b(ByteReadChannel.class), zVar.b(OutgoingContent.class)});
        InterfaceC1425d interfaceC1425dB = zVar.b(List.class);
        try {
            C1447z c1447z = C1447z.f12758c;
            interfaceC1444wB = y.b(List.class, AbstractC0847h.q(y.a(ContentType.class)));
        } catch (Throwable unused) {
            interfaceC1444wB = null;
        }
        ExcludedContentTypes = new AttributeKey<>("ExcludedContentTypesAttr", new TypeInfo(interfaceC1425dB, interfaceC1444wB));
        ContentNegotiation = CreatePluginUtilsKt.createClientPlugin("ContentNegotiation", ContentNegotiationKt$ContentNegotiation$1.INSTANCE, new io.ktor.client.b(22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C ContentNegotiation$lambda$16(ClientPluginBuilder clientPluginBuilder) {
        l.f("$this$createClientPlugin", clientPluginBuilder);
        List<ContentNegotiationConfig.ConverterRegistration> registrations$ktor_client_content_negotiation = ((ContentNegotiationConfig) clientPluginBuilder.getPluginConfig()).getRegistrations$ktor_client_content_negotiation();
        Set<InterfaceC1425d> ignoredTypes$ktor_client_content_negotiation = ((ContentNegotiationConfig) clientPluginBuilder.getPluginConfig()).getIgnoredTypes$ktor_client_content_negotiation();
        clientPluginBuilder.transformRequestBody(new ContentNegotiationKt$ContentNegotiation$2$1(registrations$ktor_client_content_negotiation, ignoredTypes$ktor_client_content_negotiation, clientPluginBuilder, null));
        clientPluginBuilder.transformResponseBody(new ContentNegotiationKt$ContentNegotiation$2$2(ignoredTypes$ktor_client_content_negotiation, registrations$ktor_client_content_negotiation, clientPluginBuilder, null));
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023f  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0279 -> B:104:0x027e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ContentNegotiation$lambda$16$convertRequest(java.util.List<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration> r15, java.util.Set<? extends l4.InterfaceC1425d> r16, io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig> r17, io.ktor.client.request.HttpRequestBuilder r18, java.lang.Object r19, S3.c<? super io.ktor.http.content.OutgoingContent> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt.ContentNegotiation$lambda$16$convertRequest(java.util.List, java.util.Set, io.ktor.client.plugins.api.ClientPluginBuilder, io.ktor.client.request.HttpRequestBuilder, java.lang.Object, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence ContentNegotiation$lambda$16$convertRequest$lambda$11(ContentNegotiationConfig.ConverterRegistration converterRegistration) {
        l.f("it", converterRegistration);
        return converterRegistration.getConverter().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ContentNegotiation$lambda$16$convertResponse(java.util.Set<? extends l4.InterfaceC1425d> r5, java.util.List<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration> r6, io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig> r7, io.ktor.http.Url r8, io.ktor.util.reflect.TypeInfo r9, java.lang.Object r10, io.ktor.http.ContentType r11, java.nio.charset.Charset r12, S3.c<java.lang.Object> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt.ContentNegotiation$lambda$16$convertResponse(java.util.Set, java.util.List, io.ktor.client.plugins.api.ClientPluginBuilder, io.ktor.http.Url, io.ktor.util.reflect.TypeInfo, java.lang.Object, io.ktor.http.ContentType, java.nio.charset.Charset, S3.c):java.lang.Object");
    }

    public static final void exclude(HttpRequestBuilder httpRequestBuilder, ContentType... contentTypeArr) {
        l.f("<this>", httpRequestBuilder);
        l.f("contentType", contentTypeArr);
        Attributes attributes = httpRequestBuilder.getAttributes();
        AttributeKey<List<ContentType>> attributeKey = ExcludedContentTypes;
        Collection collection = (List) attributes.getOrNull(attributeKey);
        if (collection == null) {
            collection = P3.y.f7779k;
        }
        Attributes attributes2 = httpRequestBuilder.getAttributes();
        ArrayList arrayList = new ArrayList(collection.size() + contentTypeArr.length);
        arrayList.addAll(collection);
        v.f0(arrayList, contentTypeArr);
        attributes2.put(attributeKey, arrayList);
    }

    public static final ClientPlugin<ContentNegotiationConfig> getContentNegotiation() {
        return ContentNegotiation;
    }

    public static /* synthetic */ void getContentNegotiation$annotations() {
    }

    public static final Set<InterfaceC1425d> getDefaultCommonIgnoredTypes() {
        return DefaultCommonIgnoredTypes;
    }

    public static final AttributeKey<List<ContentType>> getExcludedContentTypes() {
        return ExcludedContentTypes;
    }
}
