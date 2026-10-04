package io.ktor.http.content;

import O3.i;
import O3.j;
import S3.h;
import e4.InterfaceC0821a;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.ContentEncoder;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\u00020\u0016\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0004\u0018\u0001038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lio/ktor/http/content/CompressedReadChannelResponse;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "original", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "delegateChannel", "Lio/ktor/util/ContentEncoder;", "encoder", "LS3/h;", "coroutineContext", "<init>", "(Lio/ktor/http/content/OutgoingContent;Le4/a;Lio/ktor/util/ContentEncoder;LS3/h;)V", "readFrom", "()Lio/ktor/utils/io/ByteReadChannel;", "", "T", "Lio/ktor/util/AttributeKey;", "key", "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "value", "LO3/C;", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "Lio/ktor/http/content/OutgoingContent;", "getOriginal", "()Lio/ktor/http/content/OutgoingContent;", "Le4/a;", "getDelegateChannel", "()Le4/a;", "Lio/ktor/util/ContentEncoder;", "getEncoder", "()Lio/ktor/util/ContentEncoder;", "LS3/h;", "getCoroutineContext", "()LS3/h;", "Lio/ktor/http/Headers;", "headers$delegate", "LO3/i;", "getHeaders", "()Lio/ktor/http/Headers;", "headers", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "contentType", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "", "getContentLength", "()Ljava/lang/Long;", "contentLength", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class CompressedReadChannelResponse extends OutgoingContent.ReadChannelContent {
    private final h coroutineContext;
    private final InterfaceC0821a delegateChannel;
    private final ContentEncoder encoder;

    /* renamed from: headers$delegate, reason: from kotlin metadata */
    private final i headers;
    private final OutgoingContent original;

    public CompressedReadChannelResponse(OutgoingContent outgoingContent, InterfaceC0821a interfaceC0821a, ContentEncoder contentEncoder, h hVar) {
        l.f("original", outgoingContent);
        l.f("delegateChannel", interfaceC0821a);
        l.f("encoder", contentEncoder);
        l.f("coroutineContext", hVar);
        this.original = outgoingContent;
        this.delegateChannel = interfaceC0821a;
        this.encoder = contentEncoder;
        this.coroutineContext = hVar;
        this.headers = z1.c.B(j.f7526l, new c(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final io.ktor.http.Headers headers_delegate$lambda$2(io.ktor.http.content.CompressedReadChannelResponse r7) {
        /*
            io.ktor.http.Headers$Companion r0 = io.ktor.http.Headers.INSTANCE
            io.ktor.http.HeadersBuilder r1 = new io.ktor.http.HeadersBuilder
            r0 = 1
            r2 = 0
            r3 = 0
            r1.<init>(r3, r0, r2)
            io.ktor.http.content.OutgoingContent r0 = r7.original
            io.ktor.http.Headers r2 = r0.getHeaders()
            io.ktor.http.content.d r4 = new io.ktor.http.content.d
            r4.<init>(r3)
            r5 = 2
            r6 = 0
            r3 = 0
            io.ktor.util.StringValuesKt.appendFiltered$default(r1, r2, r3, r4, r5, r6)
            io.ktor.http.HttpHeaders r0 = io.ktor.http.HttpHeaders.INSTANCE
            java.lang.String r2 = r0.getContentEncoding()
            io.ktor.util.ContentEncoder r3 = r7.encoder
            java.lang.String r3 = r3.getName()
            r1.append(r2, r3)
            java.lang.String r2 = r0.getVary()
            io.ktor.http.content.OutgoingContent r7 = r7.original
            io.ktor.http.Headers r7 = r7.getHeaders()
            java.lang.String r3 = r0.getVary()
            java.lang.String r7 = r7.get(r3)
            if (r7 == 0) goto L59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getAcceptEncoding()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            if (r7 == 0) goto L59
            goto L5d
        L59:
            java.lang.String r7 = r0.getAcceptEncoding()
        L5d:
            r1.append(r2, r7)
            io.ktor.http.Headers r7 = r1.build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.CompressedReadChannelResponse.headers_delegate$lambda$2(io.ktor.http.content.CompressedReadChannelResponse):io.ktor.http.Headers");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean headers_delegate$lambda$2$lambda$1$lambda$0(String str, String str2) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("<unused var>", str2);
        return !str.equalsIgnoreCase(HttpHeaders.INSTANCE.getContentLength());
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        Long contentLength = this.original.getContentLength();
        if (contentLength != null) {
            Long lPredictCompressedLength = this.encoder.predictCompressedLength(contentLength.longValue());
            if (lPredictCompressedLength != null && lPredictCompressedLength.longValue() >= 0) {
                return lPredictCompressedLength;
            }
        }
        return null;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.original.getContentType();
    }

    public final h getCoroutineContext() {
        return this.coroutineContext;
    }

    public final InterfaceC0821a getDelegateChannel() {
        return this.delegateChannel;
    }

    public final ContentEncoder getEncoder() {
        return this.encoder;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Headers getHeaders() {
        return (Headers) this.headers.getValue();
    }

    public final OutgoingContent getOriginal() {
        return this.original;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> T getProperty(AttributeKey<T> key) {
        l.f("key", key);
        return (T) this.original.getProperty(key);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public HttpStatusCode getStatus() {
        return this.original.getStatus();
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    public ByteReadChannel readFrom() {
        return this.encoder.encode((ByteReadChannel) this.delegateChannel.invoke(), this.coroutineContext);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> void setProperty(AttributeKey<T> key, T value) {
        l.f("key", key);
        this.original.setProperty(key, value);
    }
}
