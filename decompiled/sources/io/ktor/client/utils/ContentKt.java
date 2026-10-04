package io.ktor.client.utils;

import D6.r;
import H5.InterfaceC0265f0;
import O3.C;
import S3.c;
import S3.h;
import T3.a;
import e4.k;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import k4.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "Lkotlin/Function1;", "Lio/ktor/http/Headers;", "block", "wrapHeaders", "(Lio/ktor/http/content/OutgoingContent;Le4/k;)Lio/ktor/http/content/OutgoingContent;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentKt {
    public static final OutgoingContent wrapHeaders(OutgoingContent outgoingContent, k kVar) {
        l.f("<this>", outgoingContent);
        l.f("block", kVar);
        if (outgoingContent instanceof OutgoingContent.NoContent) {
            return new OutgoingContent.NoContent(kVar, outgoingContent) { // from class: io.ktor.client.utils.ContentKt.wrapHeaders.1
                final /* synthetic */ OutgoingContent $this_wrapHeaders;
                private final Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = (Headers) kVar.invoke(outgoingContent.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                public Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent
                public HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }
            };
        }
        if (outgoingContent instanceof OutgoingContent.ReadChannelContent) {
            return new OutgoingContent.ReadChannelContent(kVar, outgoingContent) { // from class: io.ktor.client.utils.ContentKt.wrapHeaders.2
                final /* synthetic */ OutgoingContent $this_wrapHeaders;
                private final Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = (Headers) kVar.invoke(outgoingContent.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                public Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent
                public HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }

                @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                public ByteReadChannel readFrom() {
                    return ((OutgoingContent.ReadChannelContent) this.$this_wrapHeaders).readFrom();
                }

                @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                public ByteReadChannel readFrom(j range) {
                    l.f("range", range);
                    return ((OutgoingContent.ReadChannelContent) this.$this_wrapHeaders).readFrom(range);
                }
            };
        }
        if (outgoingContent instanceof OutgoingContent.WriteChannelContent) {
            return new OutgoingContent.WriteChannelContent(kVar, outgoingContent) { // from class: io.ktor.client.utils.ContentKt.wrapHeaders.3
                final /* synthetic */ OutgoingContent $this_wrapHeaders;
                private final Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = (Headers) kVar.invoke(outgoingContent.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                public Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent
                public HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }

                @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
                public Object writeTo(ByteWriteChannel byteWriteChannel, c<? super C> cVar) {
                    Object objWriteTo = ((OutgoingContent.WriteChannelContent) this.$this_wrapHeaders).writeTo(byteWriteChannel, cVar);
                    return objWriteTo == a.f9048k ? objWriteTo : C.a;
                }
            };
        }
        if (outgoingContent instanceof OutgoingContent.ByteArrayContent) {
            return new OutgoingContent.ByteArrayContent(kVar, outgoingContent) { // from class: io.ktor.client.utils.ContentKt.wrapHeaders.4
                final /* synthetic */ OutgoingContent $this_wrapHeaders;
                private final Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = (Headers) kVar.invoke(outgoingContent.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
                /* renamed from: bytes */
                public byte[] getBytes() {
                    return ((OutgoingContent.ByteArrayContent) this.$this_wrapHeaders).getBytes();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent
                public HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }
            };
        }
        if (outgoingContent instanceof OutgoingContent.ProtocolUpgrade) {
            return new OutgoingContent.ProtocolUpgrade(kVar, outgoingContent) { // from class: io.ktor.client.utils.ContentKt.wrapHeaders.5
                final /* synthetic */ OutgoingContent $this_wrapHeaders;
                private final Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = (Headers) kVar.invoke(outgoingContent.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                public Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent.ProtocolUpgrade
                public Object upgrade(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, h hVar, h hVar2, c<? super InterfaceC0265f0> cVar) {
                    return ((OutgoingContent.ProtocolUpgrade) this.$this_wrapHeaders).upgrade(byteReadChannel, byteWriteChannel, hVar, hVar2, cVar);
                }
            };
        }
        if (outgoingContent instanceof OutgoingContent.ContentWrapper) {
            return wrapHeaders(((OutgoingContent.ContentWrapper) outgoingContent).getDelegate(), kVar);
        }
        throw new r();
    }
}
