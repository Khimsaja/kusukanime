package io.ktor.client.plugins.api;

import O3.C;
import e4.k;
import io.github.jan.supabase.auth.a;
import io.ktor.client.HttpClient;
import io.ktor.events.EventDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u0005B\u000f\u0012\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/client/plugins/api/MonitoringEvent;", "", "Param", "Lio/ktor/events/EventDefinition;", "Event", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function1;", "LO3/C;", "event", "<init>", "(Lio/ktor/events/EventDefinition;)V", "Lio/ktor/client/HttpClient;", "client", "handler", "install", "(Lio/ktor/client/HttpClient;Le4/k;)V", "Lio/ktor/events/EventDefinition;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MonitoringEvent<Param, Event extends EventDefinition<Param>> implements ClientHook<k> {
    private final Event event;

    public MonitoringEvent(Event event) {
        l.f("event", event);
        this.event = event;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C install$lambda$0(k kVar, Object obj) {
        l.f("it", obj);
        kVar.invoke(obj);
        return C.a;
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, k handler) {
        l.f("client", client);
        l.f("handler", handler);
        client.getMonitor().subscribe(this.event, new a(1, handler));
    }
}
