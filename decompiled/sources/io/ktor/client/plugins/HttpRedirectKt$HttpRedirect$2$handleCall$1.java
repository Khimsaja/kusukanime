package io.ktor.client.plugins;

import kotlin.Metadata;

@U3.e(c = "io.ktor.client.plugins.HttpRedirectKt", f = "HttpRedirect.kt", l = {97}, m = "HttpRedirect$lambda$2$handleCall")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpRedirectKt$HttpRedirect$2$handleCall$1 extends U3.c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public HttpRedirectKt$HttpRedirect$2$handleCall$1(S3.c<? super HttpRedirectKt$HttpRedirect$2$handleCall$1> cVar) {
        super(cVar);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpRedirectKt.HttpRedirect$lambda$2$handleCall(null, null, null, false, null, this);
    }
}
