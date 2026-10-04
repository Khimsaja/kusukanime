package io.ktor.client.plugins;

import e4.InterfaceC0821a;
import kotlin.Metadata;
import kotlin.jvm.internal.C1401a;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class UserAgentKt$UserAgent$2 extends C1401a implements InterfaceC0821a {
    public static final UserAgentKt$UserAgent$2 INSTANCE = new UserAgentKt$UserAgent$2();

    public UserAgentKt$UserAgent$2() {
        super(UserAgentConfig.class, "<init>(Ljava/lang/String;)V");
    }

    @Override // e4.InterfaceC0821a
    public final UserAgentConfig invoke() {
        return new UserAgentConfig(null, 1, null);
    }
}
