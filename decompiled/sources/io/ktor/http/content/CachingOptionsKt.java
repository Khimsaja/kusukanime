package io.ktor.http.content;

import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\",\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lio/ktor/util/AttributeKey;", "Lio/ktor/http/content/CachingOptions;", "CachingProperty", "Lio/ktor/util/AttributeKey;", "getCachingProperty", "()Lio/ktor/util/AttributeKey;", "Lio/ktor/http/content/OutgoingContent;", "value", "getCaching", "(Lio/ktor/http/content/OutgoingContent;)Lio/ktor/http/content/CachingOptions;", "setCaching", "(Lio/ktor/http/content/OutgoingContent;Lio/ktor/http/content/CachingOptions;)V", "caching", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CachingOptionsKt {
    private static final AttributeKey<CachingOptions> CachingProperty;

    static {
        InterfaceC1444w interfaceC1444wA;
        InterfaceC1425d interfaceC1425dB = y.a.b(CachingOptions.class);
        try {
            interfaceC1444wA = y.a(CachingOptions.class);
        } catch (Throwable unused) {
            interfaceC1444wA = null;
        }
        CachingProperty = new AttributeKey<>("Caching", new TypeInfo(interfaceC1425dB, interfaceC1444wA));
    }

    public static final CachingOptions getCaching(OutgoingContent outgoingContent) {
        l.f("<this>", outgoingContent);
        return (CachingOptions) outgoingContent.getProperty(CachingProperty);
    }

    public static final AttributeKey<CachingOptions> getCachingProperty() {
        return CachingProperty;
    }

    public static final void setCaching(OutgoingContent outgoingContent, CachingOptions cachingOptions) {
        l.f("<this>", outgoingContent);
        outgoingContent.setProperty(CachingProperty, cachingOptions);
    }
}
