package io.ktor.client.plugins.contentnegotiation;

import e4.InterfaceC0821a;
import kotlin.Metadata;
import kotlin.jvm.internal.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class ContentNegotiationKt$ContentNegotiation$1 extends j implements InterfaceC0821a {
    public static final ContentNegotiationKt$ContentNegotiation$1 INSTANCE = new ContentNegotiationKt$ContentNegotiation$1();

    public ContentNegotiationKt$ContentNegotiation$1() {
        super(0, ContentNegotiationConfig.class, "<init>", "<init>()V", 0);
    }

    @Override // e4.InterfaceC0821a
    public final ContentNegotiationConfig invoke() {
        return new ContentNegotiationConfig();
    }
}
