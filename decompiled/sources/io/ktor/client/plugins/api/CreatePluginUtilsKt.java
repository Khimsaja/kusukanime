package io.ktor.client.plugins.api;

import J3.a;
import O3.C;
import e4.InterfaceC0821a;
import e4.k;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"", "PluginConfigT", "", ContentDisposition.Parameters.Name, "Lkotlin/Function0;", "createConfiguration", "Lkotlin/Function1;", "Lio/ktor/client/plugins/api/ClientPluginBuilder;", "LO3/C;", "body", "Lio/ktor/client/plugins/api/ClientPlugin;", "createClientPlugin", "(Ljava/lang/String;Le4/a;Le4/k;)Lio/ktor/client/plugins/api/ClientPlugin;", "(Ljava/lang/String;Le4/k;)Lio/ktor/client/plugins/api/ClientPlugin;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CreatePluginUtilsKt {
    public static final <PluginConfigT> ClientPlugin<PluginConfigT> createClientPlugin(String str, InterfaceC0821a interfaceC0821a, k kVar) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("createConfiguration", interfaceC0821a);
        l.f("body", kVar);
        return new ClientPluginImpl(str, interfaceC0821a, kVar);
    }

    public static final ClientPlugin<C> createClientPlugin(String str, k kVar) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("body", kVar);
        return createClientPlugin(str, new a(19), kVar);
    }
}
