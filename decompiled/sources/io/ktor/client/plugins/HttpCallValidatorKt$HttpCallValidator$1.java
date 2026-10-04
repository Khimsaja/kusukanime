package io.ktor.client.plugins;

import e4.InterfaceC0821a;
import kotlin.Metadata;
import kotlin.jvm.internal.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class HttpCallValidatorKt$HttpCallValidator$1 extends j implements InterfaceC0821a {
    public static final HttpCallValidatorKt$HttpCallValidator$1 INSTANCE = new HttpCallValidatorKt$HttpCallValidator$1();

    public HttpCallValidatorKt$HttpCallValidator$1() {
        super(0, HttpCallValidatorConfig.class, "<init>", "<init>()V", 0);
    }

    @Override // e4.InterfaceC0821a
    public final HttpCallValidatorConfig invoke() {
        return new HttpCallValidatorConfig();
    }
}
