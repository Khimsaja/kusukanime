package io.ktor.client.plugins.api;

import e4.InterfaceC0821a;
import e4.k;
import f.AbstractC0847h;
import io.ktor.client.HttpClient;
import io.ktor.http.ContentDisposition;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import l4.C1447z;
import l4.EnumC1413A;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;
import l4.InterfaceC1445x;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R&\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/ktor/client/plugins/api/ClientPluginImpl;", "", "PluginConfigT", "Lio/ktor/client/plugins/api/ClientPlugin;", "", ContentDisposition.Parameters.Name, "Lkotlin/Function0;", "createConfiguration", "Lkotlin/Function1;", "Lio/ktor/client/plugins/api/ClientPluginBuilder;", "LO3/C;", "body", "<init>", "(Ljava/lang/String;Le4/a;Le4/k;)V", "block", "Lio/ktor/client/plugins/api/ClientPluginInstance;", "prepare", "(Le4/k;)Lio/ktor/client/plugins/api/ClientPluginInstance;", "plugin", "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/api/ClientPluginInstance;Lio/ktor/client/HttpClient;)V", "Le4/a;", "Le4/k;", "Lio/ktor/util/AttributeKey;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClientPluginImpl<PluginConfigT> implements ClientPlugin<PluginConfigT> {
    private final k body;
    private final InterfaceC0821a createConfiguration;
    private final AttributeKey<ClientPluginInstance<PluginConfigT>> key;

    public ClientPluginImpl(String str, InterfaceC0821a interfaceC0821a, k kVar) {
        InterfaceC1444w interfaceC1444wB;
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("createConfiguration", interfaceC0821a);
        l.f("body", kVar);
        this.createConfiguration = interfaceC0821a;
        this.body = kVar;
        z zVar = y.a;
        InterfaceC1425d interfaceC1425dB = zVar.b(ClientPluginInstance.class);
        try {
            C1447z c1447z = C1447z.f12758c;
            InterfaceC1425d interfaceC1425dB2 = zVar.b(ClientPluginImpl.class);
            EnumC1413A enumC1413A = EnumC1413A.f12731k;
            InterfaceC1445x interfaceC1445xM = zVar.m(interfaceC1425dB2);
            zVar.k(interfaceC1445xM, Collections.singletonList(y.a(Object.class)));
            interfaceC1444wB = y.b(ClientPluginInstance.class, AbstractC0847h.q(zVar.l(interfaceC1445xM, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
            interfaceC1444wB = null;
        }
        this.key = new AttributeKey<>(str, new TypeInfo(interfaceC1425dB, interfaceC1444wB));
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public AttributeKey<ClientPluginInstance<PluginConfigT>> getKey() {
        return this.key;
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public void install(ClientPluginInstance<PluginConfigT> plugin, HttpClient scope) {
        l.f("plugin", plugin);
        l.f("scope", scope);
        plugin.install(scope);
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public ClientPluginInstance<PluginConfigT> prepare(k block) {
        l.f("block", block);
        Object objInvoke = this.createConfiguration.invoke();
        block.invoke(objInvoke);
        return new ClientPluginInstance<>(getKey(), objInvoke, this.body);
    }
}
