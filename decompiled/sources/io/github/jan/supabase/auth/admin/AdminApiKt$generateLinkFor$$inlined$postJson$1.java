package io.github.jan.supabase.auth.admin;

import O3.C;
import b1.AbstractC0703b;
import e4.k;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.ContentType;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlinx.serialization.json.c;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
/* loaded from: classes.dex */
public final class AdminApiKt$generateLinkFor$$inlined$postJson$1 implements k {
    final /* synthetic */ Object $body;
    final /* synthetic */ ContentType $contentType;
    final /* synthetic */ String $redirectTo$inlined;

    public AdminApiKt$generateLinkFor$$inlined$postJson$1(ContentType contentType, Object obj, String str) {
        this.$contentType = contentType;
        this.$body = obj;
        this.$redirectTo$inlined = str;
    }

    @Override // e4.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HttpRequestBuilder) obj);
        return C.a;
    }

    public final void invoke(HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$request", httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        String str = this.$redirectTo$inlined;
        if (str != null) {
            httpRequestBuilder.getUrl().getParameters().append("redirect_to", str);
        }
        HttpMessagePropertiesKt.contentType(httpRequestBuilder, this.$contentType);
        Object obj = this.$body;
        InterfaceC1444w interfaceC1444wA = null;
        if (obj == null) {
            httpRequestBuilder.setBody(NullBody.INSTANCE);
            InterfaceC1425d interfaceC1425dB = y.a.b(c.class);
            try {
                interfaceC1444wA = y.a(c.class);
            } catch (Throwable unused) {
            }
            AbstractC0703b.z(interfaceC1425dB, interfaceC1444wA, httpRequestBuilder);
            return;
        }
        if (obj instanceof OutgoingContent) {
            httpRequestBuilder.setBody(obj);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(obj);
            InterfaceC1425d interfaceC1425dB2 = y.a.b(c.class);
            try {
                interfaceC1444wA = y.a(c.class);
            } catch (Throwable unused2) {
            }
            AbstractC0703b.z(interfaceC1425dB2, interfaceC1444wA, httpRequestBuilder);
        }
    }
}
