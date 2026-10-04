package io.ktor.client.plugins.contentnegotiation;

import P3.F;
import P3.m;
import java.io.InputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\"$\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "Ll4/d;", "DefaultIgnoredTypes", "Ljava/util/Set;", "getDefaultIgnoredTypes", "()Ljava/util/Set;", "ktor-client-content-negotiation"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultIgnoredTypesJvmKt {
    private static final Set<InterfaceC1425d> DefaultIgnoredTypes;

    static {
        InterfaceC1425d[] interfaceC1425dArr = {y.a.b(InputStream.class)};
        LinkedHashSet linkedHashSet = new LinkedHashSet(F.I(1));
        m.t0(interfaceC1425dArr, linkedHashSet);
        DefaultIgnoredTypes = linkedHashSet;
    }

    public static final Set<InterfaceC1425d> getDefaultIgnoredTypes() {
        return DefaultIgnoredTypes;
    }
}
