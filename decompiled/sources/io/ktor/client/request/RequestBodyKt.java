package io.ktor.client.request;

import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0004\u001a\u00020\u0003*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\t\" \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"T", "Lio/ktor/client/request/HttpRequestBuilder;", "body", "LO3/C;", "setBody", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Object;)V", "", "Lio/ktor/util/reflect/TypeInfo;", "bodyType", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Object;Lio/ktor/util/reflect/TypeInfo;)V", "Lio/ktor/util/AttributeKey;", "BodyTypeAttributeKey", "Lio/ktor/util/AttributeKey;", "getBodyTypeAttributeKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RequestBodyKt {
    private static final AttributeKey<TypeInfo> BodyTypeAttributeKey;

    static {
        InterfaceC1444w interfaceC1444wA;
        InterfaceC1425d interfaceC1425dB = y.a.b(TypeInfo.class);
        try {
            interfaceC1444wA = y.a(TypeInfo.class);
        } catch (Throwable unused) {
            interfaceC1444wA = null;
        }
        BodyTypeAttributeKey = new AttributeKey<>("BodyTypeAttributeKey", new TypeInfo(interfaceC1425dB, interfaceC1444wA));
    }

    public static final AttributeKey<TypeInfo> getBodyTypeAttributeKey() {
        return BodyTypeAttributeKey;
    }

    public static final <T> void setBody(HttpRequestBuilder httpRequestBuilder, T t7) {
        l.f("<this>", httpRequestBuilder);
        if (t7 == null) {
            httpRequestBuilder.setBody(NullBody.INSTANCE);
            l.k();
            throw null;
        }
        if (t7 instanceof OutgoingContent) {
            httpRequestBuilder.setBody(t7);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(t7);
            l.k();
            throw null;
        }
    }

    public static final void setBody(HttpRequestBuilder httpRequestBuilder, Object obj, TypeInfo typeInfo) {
        l.f("<this>", httpRequestBuilder);
        l.f("bodyType", typeInfo);
        if (obj == null) {
            obj = NullBody.INSTANCE;
        }
        httpRequestBuilder.setBody(obj);
        httpRequestBuilder.setBodyType(typeInfo);
    }
}
