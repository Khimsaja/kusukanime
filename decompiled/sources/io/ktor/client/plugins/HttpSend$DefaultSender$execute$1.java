package io.ktor.client.plugins;

import io.ktor.client.plugins.HttpSend;
import kotlin.Metadata;

@U3.e(c = "io.ktor.client.plugins.HttpSend$DefaultSender", f = "HttpSend.kt", l = {132}, m = "execute")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpSend$DefaultSender$execute$1 extends U3.c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpSend.DefaultSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpSend$DefaultSender$execute$1(HttpSend.DefaultSender defaultSender, S3.c<? super HttpSend$DefaultSender$execute$1> cVar) {
        super(cVar);
        this.this$0 = defaultSender;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}
