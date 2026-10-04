package io.ktor.client.plugins;

import e4.InterfaceC0821a;
import kotlin.Metadata;
import kotlin.jvm.internal.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class DoubleReceivePluginKt$SaveBodyPlugin$1 extends j implements InterfaceC0821a {
    public static final DoubleReceivePluginKt$SaveBodyPlugin$1 INSTANCE = new DoubleReceivePluginKt$SaveBodyPlugin$1();

    public DoubleReceivePluginKt$SaveBodyPlugin$1() {
        super(0, SaveBodyPluginConfig.class, "<init>", "<init>()V", 0);
    }

    @Override // e4.InterfaceC0821a
    public final SaveBodyPluginConfig invoke() {
        return new SaveBodyPluginConfig();
    }
}
