package io.ktor.client.engine;

import f.AbstractC0847h;
import io.ktor.client.plugins.HttpTimeoutCapability;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import l4.AbstractC1420H;
import l4.C1447z;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\"0\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"!\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/util/AttributeKey;", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "", "ENGINE_CAPABILITIES_KEY", "Lio/ktor/util/AttributeKey;", "getENGINE_CAPABILITIES_KEY", "()Lio/ktor/util/AttributeKey;", "", "DEFAULT_CAPABILITIES", "Ljava/util/Set;", "getDEFAULT_CAPABILITIES", "()Ljava/util/Set;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpClientEngineCapabilityKt {
    private static final Set<HttpClientEngineCapability<?>> DEFAULT_CAPABILITIES;
    private static final AttributeKey<Map<HttpClientEngineCapability<?>, Object>> ENGINE_CAPABILITIES_KEY;

    static {
        InterfaceC1444w interfaceC1444wD;
        z zVar = y.a;
        InterfaceC1425d interfaceC1425dB = zVar.b(Map.class);
        try {
            interfaceC1444wD = zVar.d(zVar.l(zVar.b(Map.class), Arrays.asList(AbstractC0847h.q(y.b(HttpClientEngineCapability.class, C1447z.f12758c)), AbstractC0847h.q(y.a(Object.class))), false));
        } catch (Throwable unused) {
            interfaceC1444wD = null;
        }
        ENGINE_CAPABILITIES_KEY = new AttributeKey<>("EngineCapabilities", new TypeInfo(interfaceC1425dB, interfaceC1444wD));
        DEFAULT_CAPABILITIES = AbstractC1420H.K(HttpTimeoutCapability.INSTANCE);
    }

    public static final Set<HttpClientEngineCapability<?>> getDEFAULT_CAPABILITIES() {
        return DEFAULT_CAPABILITIES;
    }

    public static final AttributeKey<Map<HttpClientEngineCapability<?>, Object>> getENGINE_CAPABILITIES_KEY() {
        return ENGINE_CAPABILITIES_KEY;
    }
}
