package io.ktor.client;

import U3.c;
import U3.e;
import kotlin.Metadata;

@e(c = "io.ktor.client.HttpClient", f = "HttpClient.kt", l = {1418}, m = "execute$ktor_client_core")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpClient$execute$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClient$execute$1(HttpClient httpClient, S3.c<? super HttpClient$execute$1> cVar) {
        super(cVar);
        this.this$0 = httpClient;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute$ktor_client_core(null, this);
    }
}
