package io.ktor.client.content;

import H5.A;
import H5.Y;
import O3.C;
import P3.r;
import S3.c;
import S3.h;
import T3.a;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.client.utils.ByteChannelUtilsKt;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.utils.io.ByteChannelCtorKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.WriterScope;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\u00020\u0014\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lio/ktor/client/content/ObservableContent;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "delegate", "LS3/h;", "callContext", "Lio/ktor/client/content/ProgressListener;", "listener", "<init>", "(Lio/ktor/http/content/OutgoingContent;LS3/h;Lio/ktor/client/content/ProgressListener;)V", "Lio/ktor/utils/io/ByteReadChannel;", "getContent", "(Lio/ktor/http/content/OutgoingContent;)Lio/ktor/utils/io/ByteReadChannel;", "", "T", "Lio/ktor/util/AttributeKey;", "key", "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "value", "LO3/C;", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "readFrom", "()Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/http/content/OutgoingContent;", "LS3/h;", "Lio/ktor/client/content/ProgressListener;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "contentType", "", "getContentLength", "()Ljava/lang/Long;", "contentLength", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "headers", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObservableContent extends OutgoingContent.ReadChannelContent {
    private final h callContext;
    private final OutgoingContent delegate;
    private final ProgressListener listener;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.content.ObservableContent$getContent$1", f = "ObservableContent.kt", l = {53}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.content.ObservableContent$getContent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ OutgoingContent $delegate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OutgoingContent outgoingContent, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$delegate = outgoingContent;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delegate, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e4.n
        public final Object invoke(WriterScope writerScope, c<? super C> cVar) {
            return ((AnonymousClass1) create(writerScope, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                WriterScope writerScope = (WriterScope) this.L$0;
                OutgoingContent.WriteChannelContent writeChannelContent = (OutgoingContent.WriteChannelContent) this.$delegate;
                ByteWriteChannel channel = writerScope.getChannel();
                this.label = 1;
                if (writeChannelContent.writeTo(channel, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            return C.a;
        }
    }

    public ObservableContent(OutgoingContent outgoingContent, h hVar, ProgressListener progressListener) {
        l.f("delegate", outgoingContent);
        l.f("callContext", hVar);
        l.f("listener", progressListener);
        this.delegate = outgoingContent;
        this.callContext = hVar;
        this.listener = progressListener;
    }

    private final ByteReadChannel getContent(OutgoingContent delegate) {
        if (delegate instanceof OutgoingContent.ContentWrapper) {
            return getContent(((OutgoingContent.ContentWrapper) delegate).getDelegate());
        }
        if (delegate instanceof OutgoingContent.ByteArrayContent) {
            return ByteChannelCtorKt.ByteReadChannel$default(((OutgoingContent.ByteArrayContent) delegate).getBytes(), 0, 0, 6, null);
        }
        if (delegate instanceof OutgoingContent.ProtocolUpgrade) {
            throw new UnsupportedContentTypeException(delegate);
        }
        if (delegate instanceof OutgoingContent.NoContent) {
            return ByteReadChannel.INSTANCE.getEmpty();
        }
        if (delegate instanceof OutgoingContent.ReadChannelContent) {
            return ((OutgoingContent.ReadChannelContent) delegate).readFrom();
        }
        if (delegate instanceof OutgoingContent.WriteChannelContent) {
            return ByteWriteChannelOperationsKt.writer((A) Y.f3831k, this.callContext, true, (n) new AnonymousClass1(delegate, null)).getChannel();
        }
        throw new D6.r();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return this.delegate.getContentLength();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.delegate.getContentType();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Headers getHeaders() {
        return this.delegate.getHeaders();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> T getProperty(AttributeKey<T> key) {
        l.f("key", key);
        return (T) this.delegate.getProperty(key);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public HttpStatusCode getStatus() {
        return this.delegate.getStatus();
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    public ByteReadChannel readFrom() {
        return ByteChannelUtilsKt.observable(getContent(this.delegate), this.callContext, getContentLength(), this.listener);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> void setProperty(AttributeKey<T> key, T value) {
        l.f("key", key);
        this.delegate.setProperty(key, value);
    }
}
