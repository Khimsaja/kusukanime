package io.ktor.http.content;

import O3.C;
import P3.r;
import U3.j;
import e4.k;
import e4.n;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.cio.OutputStreamAdaptersKt;
import io.ktor.utils.io.ByteWriteChannel;
import java.io.Closeable;
import java.io.Writer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import z5.C2496a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001BK\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R0\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/ktor/http/content/WriterContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "Lkotlin/Function2;", "Ljava/io/Writer;", "LS3/c;", "LO3/C;", "", "body", "Lio/ktor/http/ContentType;", "contentType", "Lio/ktor/http/HttpStatusCode;", "status", "", "contentLength", "<init>", "(Le4/n;Lio/ktor/http/ContentType;Lio/ktor/http/HttpStatusCode;Ljava/lang/Long;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;LS3/c;)Ljava/lang/Object;", "Le4/n;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "Ljava/lang/Long;", "getContentLength", "()Ljava/lang/Long;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WriterContent extends OutgoingContent.WriteChannelContent {
    private final n body;
    private final Long contentLength;
    private final ContentType contentType;
    private final HttpStatusCode status;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LO3/C;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @U3.e(c = "io.ktor.http.content.WriterContent$writeTo$2", f = "WriterContent.kt", l = {28}, m = "invokeSuspend")
    /* renamed from: io.ktor.http.content.WriterContent$writeTo$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements k {
        final /* synthetic */ ByteWriteChannel $channel;
        final /* synthetic */ Charset $charset;
        Object L$0;
        int label;
        final /* synthetic */ WriterContent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ByteWriteChannel byteWriteChannel, Charset charset, WriterContent writerContent, S3.c<? super AnonymousClass2> cVar) {
            super(1, cVar);
            this.$channel = byteWriteChannel;
            this.$charset = charset;
            this.this$0 = writerContent;
        }

        @Override // U3.a
        public final S3.c<C> create(S3.c<?> cVar) {
            return new AnonymousClass2(this.$channel, this.$charset, this.this$0, cVar);
        }

        @Override // e4.k
        public final Object invoke(S3.c<? super C> cVar) {
            return ((AnonymousClass2) create(cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Closeable closeable;
            Throwable th;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.L$0;
                try {
                    r.Y(obj);
                    r.o(closeable, null);
                    return C.a;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        r.o(closeable, th);
                        throw th3;
                    }
                }
            }
            r.Y(obj);
            Writer writer = OutputStreamAdaptersKt.writer(this.$channel, this.$charset);
            try {
                n nVar = this.this$0.body;
                this.L$0 = writer;
                this.label = 1;
                if (nVar.invoke(writer, this) == aVar) {
                    return aVar;
                }
                closeable = writer;
                r.o(closeable, null);
                return C.a;
            } catch (Throwable th4) {
                closeable = writer;
                th = th4;
                throw th;
            }
        }
    }

    public /* synthetic */ WriterContent(n nVar, ContentType contentType, HttpStatusCode httpStatusCode, Long l7, int i7, f fVar) {
        this(nVar, contentType, (i7 & 4) != 0 ? null : httpStatusCode, (i7 & 8) != 0 ? null : l7);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return this.contentLength;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public HttpStatusCode getStatus() {
        return this.status;
    }

    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    public Object writeTo(ByteWriteChannel byteWriteChannel, S3.c<? super C> cVar) {
        Charset charset = ContentTypesKt.charset(getContentType());
        if (charset == null) {
            charset = C2496a.f19036b;
        }
        Object objWithBlocking = BlockingBridgeKt.withBlocking(new AnonymousClass2(byteWriteChannel, charset, this, null), cVar);
        return objWithBlocking == T3.a.f9048k ? objWithBlocking : C.a;
    }

    public WriterContent(n nVar, ContentType contentType, HttpStatusCode httpStatusCode, Long l7) {
        l.f("body", nVar);
        l.f("contentType", contentType);
        this.body = nVar;
        this.contentType = contentType;
        this.status = httpStatusCode;
        this.contentLength = l7;
    }
}
