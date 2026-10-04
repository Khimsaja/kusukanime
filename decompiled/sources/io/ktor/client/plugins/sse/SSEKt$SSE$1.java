package io.ktor.client.plugins.sse;

import e4.InterfaceC0821a;
import kotlin.Metadata;
import kotlin.jvm.internal.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class SSEKt$SSE$1 extends j implements InterfaceC0821a {
    public static final SSEKt$SSE$1 INSTANCE = new SSEKt$SSE$1();

    public SSEKt$SSE$1() {
        super(0, SSEConfig.class, "<init>", "<init>()V", 0);
    }

    @Override // e4.InterfaceC0821a
    public final SSEConfig invoke() {
        return new SSEConfig();
    }
}
