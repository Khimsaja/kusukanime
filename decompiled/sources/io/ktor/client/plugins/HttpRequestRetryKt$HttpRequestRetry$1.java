package io.ktor.client.plugins;

import e4.InterfaceC0821a;
import kotlin.Metadata;
import kotlin.jvm.internal.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class HttpRequestRetryKt$HttpRequestRetry$1 extends j implements InterfaceC0821a {
    public static final HttpRequestRetryKt$HttpRequestRetry$1 INSTANCE = new HttpRequestRetryKt$HttpRequestRetry$1();

    public HttpRequestRetryKt$HttpRequestRetry$1() {
        super(0, HttpRequestRetryConfig.class, "<init>", "<init>()V", 0);
    }

    @Override // e4.InterfaceC0821a
    public final HttpRequestRetryConfig invoke() {
        return new HttpRequestRetryConfig();
    }
}
