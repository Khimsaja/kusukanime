package io.ktor.client.plugins.contentnegotiation;

import U3.c;
import U3.e;
import kotlin.Metadata;

@e(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt", f = "ContentNegotiation.kt", l = {281}, m = "ContentNegotiation$lambda$16$convertResponse")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentNegotiationKt$ContentNegotiation$2$convertResponse$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ContentNegotiationKt$ContentNegotiation$2$convertResponse$1(S3.c<? super ContentNegotiationKt$ContentNegotiation$2$convertResponse$1> cVar) {
        super(cVar);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ContentNegotiationKt.ContentNegotiation$lambda$16$convertResponse(null, null, null, null, null, null, null, null, this);
    }
}
