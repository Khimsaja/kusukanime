package io.ktor.websocket;

import O3.C;
import P3.r;
import Z5.A;
import e4.InterfaceC0821a;
import e4.k;
import io.ktor.network.sockets.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\r\u001a\u00020\u0006\"\b\b\u0000\u0010\t*\u00020\u00012\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00042\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u0014j\u0002`\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/ktor/websocket/WebSocketExtensionsConfig;", "", "<init>", "()V", "Lio/ktor/websocket/WebSocketExtensionFactory;", "extensionFactory", "LO3/C;", "checkConflicts", "(Lio/ktor/websocket/WebSocketExtensionFactory;)V", "ConfigType", "extension", "Lkotlin/Function1;", "config", "install", "(Lio/ktor/websocket/WebSocketExtensionFactory;Le4/k;)V", "", "Lio/ktor/websocket/WebSocketExtension;", "build", "()Ljava/util/List;", "", "Lkotlin/Function0;", "Lio/ktor/websocket/ExtensionInstaller;", "installers", "Ljava/util/List;", "", "", "rcv", "[Ljava/lang/Boolean;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebSocketExtensionsConfig {
    private final List<InterfaceC0821a> installers = new ArrayList();
    private final Boolean[] rcv;

    public WebSocketExtensionsConfig() {
        Boolean bool = Boolean.FALSE;
        this.rcv = new Boolean[]{bool, bool, bool};
    }

    private final void checkConflicts(WebSocketExtensionFactory<?, ?> extensionFactory) {
        boolean z7 = true;
        if ((!extensionFactory.getRsv1() || !this.rcv[1].booleanValue()) && ((!extensionFactory.getRsv2() || !this.rcv[2].booleanValue()) && (!extensionFactory.getRsv3() || !this.rcv[3].booleanValue()))) {
            z7 = false;
        }
        if (z7) {
            throw new IllegalStateException("Failed to install extension. Please check configured extensions for conflicts.");
        }
    }

    public static /* synthetic */ void install$default(WebSocketExtensionsConfig webSocketExtensionsConfig, WebSocketExtensionFactory webSocketExtensionFactory, k kVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new b(15);
        }
        webSocketExtensionsConfig.install(webSocketExtensionFactory, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C install$lambda$0(Object obj) {
        l.f("<this>", obj);
        return C.a;
    }

    public final List<WebSocketExtension<?>> build() {
        List<InterfaceC0821a> list = this.installers;
        ArrayList arrayList = new ArrayList(r.p(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((WebSocketExtension) ((InterfaceC0821a) it.next()).invoke());
        }
        return arrayList;
    }

    public final <ConfigType> void install(WebSocketExtensionFactory<ConfigType, ?> extension, k config) {
        l.f("extension", extension);
        l.f("config", config);
        checkConflicts(extension);
        this.installers.add(new A(4, extension, config));
    }
}
