package io.ktor.client.plugins;

import kotlin.Metadata;

@U3.e(c = "io.ktor.client.plugins.HttpCallValidatorKt", f = "HttpCallValidator.kt", l = {117, 118}, m = "HttpCallValidator$lambda$2$processException")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpCallValidatorKt$HttpCallValidator$2$processException$1 extends U3.c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public HttpCallValidatorKt$HttpCallValidator$2$processException$1(S3.c<? super HttpCallValidatorKt$HttpCallValidator$2$processException$1> cVar) {
        super(cVar);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpCallValidatorKt.HttpCallValidator$lambda$2$processException(null, null, null, this);
    }
}
