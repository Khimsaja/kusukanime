package io.ktor.client.plugins;

import e4.InterfaceC0821a;
import kotlin.Metadata;
import kotlin.jvm.internal.C1401a;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class HttpTimeoutKt$HttpTimeout$2 extends C1401a implements InterfaceC0821a {
    public static final HttpTimeoutKt$HttpTimeout$2 INSTANCE = new HttpTimeoutKt$HttpTimeout$2();

    public HttpTimeoutKt$HttpTimeout$2() {
        super(HttpTimeoutConfig.class, "<init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V");
    }

    @Override // e4.InterfaceC0821a
    public final HttpTimeoutConfig invoke() {
        return new HttpTimeoutConfig(null, null, null, 7, null);
    }
}
