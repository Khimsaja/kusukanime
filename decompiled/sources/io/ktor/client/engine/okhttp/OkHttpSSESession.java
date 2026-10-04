package io.ktor.client.engine.okhttp;

import A3.d;
import C2.G;
import H5.C0263e0;
import H5.C0276q;
import H5.C0284z;
import H5.D;
import H5.InterfaceC0265f0;
import H5.InterfaceC0275p;
import I1.e;
import J5.i;
import J5.k;
import K5.C0325d;
import K5.C0336o;
import K5.InterfaceC0329h;
import O3.C;
import P3.F;
import S3.h;
import f.AbstractC0841b;
import f6.C0887A;
import f6.C0889C;
import f6.C0890D;
import f6.C0895I;
import f6.C0920r;
import f6.z;
import io.ktor.client.plugins.sse.SSEClientException;
import io.ktor.client.plugins.sse.SSESession;
import io.ktor.http.ContentType;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.LinkHeader;
import io.ktor.sse.ServerSentEvent;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;
import n5.P;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010!\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J+\u0010$\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u00107\u001a\b\u0012\u0004\u0012\u000203068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpSSESession;", "Lio/ktor/client/plugins/sse/SSESession;", "Lf/b;", "Lv6/a;", "factory", "Lf6/D;", "engineRequest", "LS3/h;", "coroutineContext", "<init>", "(Lv6/a;Lf6/D;LS3/h;)V", "Lf6/A;", "engine", "callContext", "(Lf6/A;Lf6/D;LS3/h;)V", "", "cause", "LO3/C;", "close", "(Ljava/lang/Throwable;)V", "Lf6/I;", "response", "Lio/ktor/client/plugins/sse/SSEClientException;", "mapException", "(Lf6/I;)Lio/ktor/client/plugins/sse/SSEClientException;", "Lv6/b;", "eventSource", "onOpen", "(Lv6/b;Lf6/I;)V", "", "id", LinkHeader.Parameters.Type, "data", "onEvent", "(Lv6/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "t", "onFailure", "(Lv6/b;Ljava/lang/Throwable;Lf6/I;)V", "onClosed", "(Lv6/b;)V", "LS3/h;", "getCoroutineContext", "()LS3/h;", "serverSentEventsSource", "Lv6/b;", "LH5/p;", "originResponse", "LH5/p;", "getOriginResponse$ktor_client_okhttp", "()LH5/p;", "LJ5/i;", "Lio/ktor/sse/ServerSentEvent;", "_incoming", "LJ5/i;", "LK5/h;", "incoming", "LK5/h;", "getIncoming", "()LK5/h;", "ktor-client-okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OkHttpSSESession extends AbstractC0841b implements SSESession {
    private final i _incoming;
    private final h coroutineContext;
    private final InterfaceC0329h incoming;
    private final InterfaceC0275p originResponse;
    private final v6.b serverSentEventsSource;

    private OkHttpSSESession(v6.a aVar, C0890D c0890d, h hVar) {
        this.coroutineContext = hVar;
        C0887A c0887a = (C0887A) ((G) aVar).f664l;
        l.f("request", c0890d);
        if (c0890d.f11476c.a("Accept") == null) {
            C0889C c0889cB = c0890d.b();
            c0889cB.f11472c.h("Accept", "text/event-stream");
            c0890d = c0889cB.a();
        }
        P p7 = new P(c0890d, this);
        z zVarA = c0887a.a();
        byte[] bArr = g6.b.a;
        zVarA.f11632e = new e(18);
        j6.i iVarB = new C0887A(zVarA).b(c0890d);
        p7.f13379m = iVarB;
        iVarB.d(p7);
        this.serverSentEventsSource = p7;
        this.originResponse = D.b();
        J5.e eVarA = F.a(8, 6, null);
        this._incoming = eVarA;
        this.incoming = new C0336o(new C0325d(eVarA, true), new OkHttpSSESession$incoming$1(this, null));
        D.q(getCoroutineContext()).x(new d(15, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C _init_$lambda$0(OkHttpSSESession okHttpSSESession, Throwable th) {
        okHttpSSESession.close(null);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void close(Throwable cause) {
        this._incoming.close(cause);
        j6.i iVar = (j6.i) ((P) this.serverSentEventsSource).f13379m;
        if (iVar == null) {
            l.l("call");
            throw null;
        }
        iVar.cancel();
        InterfaceC0265f0 interfaceC0265f0 = (InterfaceC0265f0) getCoroutineContext().get(C0263e0.f3843k);
        if (interfaceC0265f0 != null) {
            interfaceC0265f0.e(null);
        }
    }

    private final SSEClientException mapException(C0895I response) {
        ContentType contentType;
        if (response == null) {
            return mapException$unexpectedError();
        }
        HttpStatusCode.Companion companion = HttpStatusCode.INSTANCE;
        int value = companion.getOK().getValue();
        int i7 = response.f11498n;
        if (i7 != value) {
            return new SSEClientException(null, null, "Expected status code " + companion.getOK().getValue() + " but was " + i7, 3, null);
        }
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        String contentType2 = httpHeaders.getContentType();
        C0920r c0920r = response.f11500p;
        String strA = c0920r.a(contentType2);
        ContentType contentTypeWithoutParameters = (strA == null || (contentType = ContentType.INSTANCE.parse(strA)) == null) ? null : contentType.withoutParameters();
        ContentType.Text text = ContentType.Text.INSTANCE;
        if (l.a(contentTypeWithoutParameters, text.getEventStream())) {
            return mapException$unexpectedError();
        }
        return new SSEClientException(null, null, "Content type must be " + text.getEventStream() + " but was " + c0920r.a(httpHeaders.getContentType()), 3, null);
    }

    private static final SSEClientException mapException$unexpectedError() {
        return new SSEClientException(null, null, "Unexpected error occurred in OkHttpSSESession", 3, null);
    }

    @Override // io.ktor.client.plugins.sse.SSESession, H5.A
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.client.plugins.sse.SSESession
    /* renamed from: getIncoming, reason: from getter */
    public InterfaceC0329h get_incoming() {
        return this.incoming;
    }

    /* renamed from: getOriginResponse$ktor_client_okhttp, reason: from getter */
    public final InterfaceC0275p getOriginResponse() {
        return this.originResponse;
    }

    public void onClosed(v6.b eventSource) {
        l.f("eventSource", eventSource);
        close(null);
    }

    public void onEvent(v6.b eventSource, String id, String type, String data) throws Throwable {
        l.f("eventSource", eventSource);
        l.f("data", data);
        Object objQ = AbstractC1420H.Q(this._incoming, new ServerSentEvent(data, type, id, null, null, 24, null));
        if (objQ instanceof J5.l) {
            k kVar = objQ instanceof k ? (k) objQ : null;
            Throwable th = kVar != null ? kVar.a : null;
            if (th instanceof CancellationException) {
                throw th;
            }
        }
    }

    public void onFailure(v6.b eventSource, Throwable t7, C0895I response) {
        SSEClientException sSEClientExceptionMapException;
        C0920r c0920r;
        l.f("eventSource", eventSource);
        Integer numValueOf = response != null ? Integer.valueOf(response.f11498n) : null;
        String strA = (response == null || (c0920r = response.f11500p) == null) ? null : c0920r.a(HttpHeaders.INSTANCE.getContentType());
        if (response != null) {
            int value = HttpStatusCode.INSTANCE.getOK().getValue();
            if (numValueOf == null || numValueOf.intValue() != value || !l.a(strA, ContentType.Text.INSTANCE.getEventStream().toString())) {
                ((C0276q) this.originResponse).F(response);
                close(null);
                return;
            }
        }
        if (t7 != null) {
            sSEClientExceptionMapException = new SSEClientException(null, t7, "Exception during OkHttpSSESession: " + t7.getMessage(), 1, null);
        } else {
            sSEClientExceptionMapException = mapException(response);
        }
        ((C0276q) this.originResponse).Z(sSEClientExceptionMapException);
        close(sSEClientExceptionMapException);
    }

    public void onOpen(v6.b eventSource, C0895I response) {
        l.f("eventSource", eventSource);
        l.f("response", response);
        ((C0276q) this.originResponse).F(response);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OkHttpSSESession(C0887A c0887a, C0890D c0890d, h hVar) {
        this(new G(19, c0887a), c0890d, hVar.plus(D.d()).plus(new C0284z("OkHttpSSESession")));
        l.f("engine", c0887a);
        l.f("engineRequest", c0890d);
        l.f("callContext", hVar);
    }
}
