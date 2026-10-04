package io.ktor.client.plugins;

import e4.InterfaceC0821a;
import kotlin.Metadata;
import kotlin.jvm.internal.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class HttpPlainTextKt$HttpPlainText$1 extends j implements InterfaceC0821a {
    public static final HttpPlainTextKt$HttpPlainText$1 INSTANCE = new HttpPlainTextKt$HttpPlainText$1();

    public HttpPlainTextKt$HttpPlainText$1() {
        super(0, HttpPlainTextConfig.class, "<init>", "<init>()V", 0);
    }

    @Override // e4.InterfaceC0821a
    public final HttpPlainTextConfig invoke() {
        return new HttpPlainTextConfig();
    }
}
