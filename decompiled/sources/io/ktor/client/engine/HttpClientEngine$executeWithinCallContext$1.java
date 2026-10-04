package io.ktor.client.engine;

import U3.e;
import io.ktor.client.engine.HttpClientEngine;
import kotlin.Metadata;

@e(c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", f = "HttpClientEngine.kt", l = {175, 184}, m = "executeWithinCallContext")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpClientEngine$executeWithinCallContext$1 extends U3.c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public HttpClientEngine$executeWithinCallContext$1(S3.c<? super HttpClientEngine$executeWithinCallContext$1> cVar) {
        super(cVar);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpClientEngine.DefaultImpls.executeWithinCallContext(null, null, this);
    }
}
