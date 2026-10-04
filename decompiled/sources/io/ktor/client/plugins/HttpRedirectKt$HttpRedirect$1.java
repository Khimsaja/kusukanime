package io.ktor.client.plugins;

import e4.InterfaceC0821a;
import kotlin.Metadata;
import kotlin.jvm.internal.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class HttpRedirectKt$HttpRedirect$1 extends j implements InterfaceC0821a {
    public static final HttpRedirectKt$HttpRedirect$1 INSTANCE = new HttpRedirectKt$HttpRedirect$1();

    public HttpRedirectKt$HttpRedirect$1() {
        super(0, HttpRedirectConfig.class, "<init>", "<init>()V", 0);
    }

    @Override // e4.InterfaceC0821a
    public final HttpRedirectConfig invoke() {
        return new HttpRedirectConfig();
    }
}
