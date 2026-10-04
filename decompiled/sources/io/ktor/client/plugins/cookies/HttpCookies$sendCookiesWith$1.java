package io.ktor.client.plugins.cookies;

import U3.c;
import U3.e;
import kotlin.Metadata;

@e(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", l = {65}, m = "sendCookiesWith$ktor_client_core")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpCookies$sendCookiesWith$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpCookies this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCookies$sendCookiesWith$1(HttpCookies httpCookies, S3.c<? super HttpCookies$sendCookiesWith$1> cVar) {
        super(cVar);
        this.this$0 = httpCookies;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendCookiesWith$ktor_client_core(null, this);
    }
}
