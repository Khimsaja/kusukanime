package io.ktor.client.plugins.sse;

import U3.e;
import kotlin.Metadata;

@e(c = "io.ktor.client.plugins.sse.BuildersKt", f = "builders.kt", l = {648, 650}, m = "serverSentEvents-Mswn-_c")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BuildersKt$serverSentEvents$8 extends U3.c {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public BuildersKt$serverSentEvents$8(S3.c<? super BuildersKt$serverSentEvents$8> cVar) {
        super(cVar);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BuildersKt.m113serverSentEventsMswn_c(null, null, null, null, null, null, null, this);
    }
}
