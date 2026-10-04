package io.ktor.http.content;

import D6.r;
import S3.h;
import S3.i;
import e4.InterfaceC0821a;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.ContentEncoder;
import io.ktor.utils.io.ByteChannelCtorKt;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "Lio/ktor/util/ContentEncoder;", "contentEncoder", "LS3/h;", "coroutineContext", "compressed", "(Lio/ktor/http/content/OutgoingContent;Lio/ktor/util/ContentEncoder;LS3/h;)Lio/ktor/http/content/OutgoingContent;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompressedContentKt {
    public static final OutgoingContent compressed(final OutgoingContent outgoingContent, ContentEncoder contentEncoder, h hVar) {
        l.f("<this>", outgoingContent);
        l.f("contentEncoder", contentEncoder);
        l.f("coroutineContext", hVar);
        if (outgoingContent instanceof OutgoingContent.ReadChannelContent) {
            final int i7 = 0;
            return new CompressedReadChannelResponse(outgoingContent, new InterfaceC0821a() { // from class: io.ktor.http.content.b
                @Override // e4.InterfaceC0821a
                public final Object invoke() {
                    switch (i7) {
                        case 0:
                            return CompressedContentKt.compressed$lambda$0(outgoingContent);
                        default:
                            return CompressedContentKt.compressed$lambda$1(outgoingContent);
                    }
                }
            }, contentEncoder, hVar);
        }
        if (outgoingContent instanceof OutgoingContent.WriteChannelContent) {
            return new CompressedWriteChannelResponse((OutgoingContent.WriteChannelContent) outgoingContent, contentEncoder, hVar);
        }
        if (outgoingContent instanceof OutgoingContent.ByteArrayContent) {
            final int i8 = 1;
            return new CompressedReadChannelResponse(outgoingContent, new InterfaceC0821a() { // from class: io.ktor.http.content.b
                @Override // e4.InterfaceC0821a
                public final Object invoke() {
                    switch (i8) {
                        case 0:
                            return CompressedContentKt.compressed$lambda$0(outgoingContent);
                        default:
                            return CompressedContentKt.compressed$lambda$1(outgoingContent);
                    }
                }
            }, contentEncoder, hVar);
        }
        if ((outgoingContent instanceof OutgoingContent.NoContent) || (outgoingContent instanceof OutgoingContent.ProtocolUpgrade)) {
            return null;
        }
        if (outgoingContent instanceof OutgoingContent.ContentWrapper) {
            return compressed(((OutgoingContent.ContentWrapper) outgoingContent).getDelegate(), contentEncoder, hVar);
        }
        throw new r();
    }

    public static /* synthetic */ OutgoingContent compressed$default(OutgoingContent outgoingContent, ContentEncoder contentEncoder, h hVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            hVar = i.f8767k;
        }
        return compressed(outgoingContent, contentEncoder, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel compressed$lambda$0(OutgoingContent outgoingContent) {
        return ((OutgoingContent.ReadChannelContent) outgoingContent).readFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel compressed$lambda$1(OutgoingContent outgoingContent) {
        return ByteChannelCtorKt.ByteReadChannel$default(((OutgoingContent.ByteArrayContent) outgoingContent).getContent(), 0, 0, 6, null);
    }
}
