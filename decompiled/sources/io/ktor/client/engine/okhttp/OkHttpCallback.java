package io.ktor.client.engine.okhttp;

import H5.InterfaceC0269j;
import P3.r;
import f6.C0895I;
import f6.InterfaceC0908f;
import f6.InterfaceC0909g;
import io.ktor.client.request.HttpRequestData;
import j6.i;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpCallback;", "Lf6/g;", "Lio/ktor/client/request/HttpRequestData;", "requestData", "LH5/j;", "Lf6/I;", "continuation", "<init>", "(Lio/ktor/client/request/HttpRequestData;LH5/j;)V", "Lf6/f;", "call", "Ljava/io/IOException;", "e", "LO3/C;", "onFailure", "(Lf6/f;Ljava/io/IOException;)V", "response", "onResponse", "(Lf6/f;Lf6/I;)V", "Lio/ktor/client/request/HttpRequestData;", "LH5/j;", "ktor-client-okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class OkHttpCallback implements InterfaceC0909g {
    private final InterfaceC0269j continuation;
    private final HttpRequestData requestData;

    public OkHttpCallback(HttpRequestData httpRequestData, InterfaceC0269j interfaceC0269j) {
        l.f("requestData", httpRequestData);
        l.f("continuation", interfaceC0269j);
        this.requestData = httpRequestData;
        this.continuation = interfaceC0269j;
    }

    @Override // f6.InterfaceC0909g
    public void onFailure(InterfaceC0908f call, IOException e7) {
        l.f("call", call);
        l.f("e", e7);
        if (this.continuation.isCancelled()) {
            return;
        }
        this.continuation.resumeWith(r.r(OkUtilsKt.mapOkHttpException(this.requestData, e7)));
    }

    @Override // f6.InterfaceC0909g
    public void onResponse(InterfaceC0908f call, C0895I response) {
        l.f("call", call);
        l.f("response", response);
        if (((i) call).f12523y) {
            return;
        }
        this.continuation.resumeWith(response);
    }
}
