package io.ktor.client.utils;

import J3.a;
import f.AbstractC0847h;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMethod;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.InternalAPI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import l4.C1447z;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\" \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/http/HeadersBuilder;", "Lio/ktor/http/HttpMethod;", "method", "Lio/ktor/util/Attributes;", "attributes", "", "alwaysRemove", "LO3/C;", "dropCompressionHeaders", "(Lio/ktor/http/HeadersBuilder;Lio/ktor/http/HttpMethod;Lio/ktor/util/Attributes;Z)V", "Lio/ktor/util/AttributeKey;", "", "", "DecompressionListAttribute", "Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeadersUtilsKt {
    private static final AttributeKey<List<String>> DecompressionListAttribute;

    static {
        InterfaceC1444w interfaceC1444wD;
        z zVar = y.a;
        InterfaceC1425d interfaceC1425dB = zVar.b(List.class);
        try {
            C1447z c1447z = C1447z.f12758c;
            interfaceC1444wD = zVar.d(y.b(List.class, AbstractC0847h.q(y.a(String.class))));
        } catch (Throwable unused) {
            interfaceC1444wD = null;
        }
        DecompressionListAttribute = new AttributeKey<>("DecompressionListAttribute", new TypeInfo(interfaceC1425dB, interfaceC1444wD));
    }

    @InternalAPI
    public static final void dropCompressionHeaders(HeadersBuilder headersBuilder, HttpMethod httpMethod, Attributes attributes, boolean z7) {
        l.f("<this>", headersBuilder);
        l.f("method", httpMethod);
        l.f("attributes", attributes);
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        if (httpMethod.equals(companion.getHead()) || httpMethod.equals(companion.getOptions())) {
            return;
        }
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        String str = headersBuilder.get(httpHeaders.getContentEncoding());
        if (str != null) {
            ((List) attributes.computeIfAbsent(DecompressionListAttribute, new a(29))).add(str);
        } else if (!z7) {
            return;
        }
        headersBuilder.remove(httpHeaders.getContentEncoding());
        headersBuilder.remove(httpHeaders.getContentLength());
    }

    public static /* synthetic */ void dropCompressionHeaders$default(HeadersBuilder headersBuilder, HttpMethod httpMethod, Attributes attributes, boolean z7, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        dropCompressionHeaders(headersBuilder, httpMethod, attributes, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dropCompressionHeaders$lambda$0() {
        return new ArrayList();
    }
}
