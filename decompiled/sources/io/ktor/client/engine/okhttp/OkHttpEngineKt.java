package io.ktor.client.engine.okhttp;

import B3.q;
import H5.D;
import H5.Y;
import O3.C;
import P3.r;
import S3.c;
import S3.h;
import U3.e;
import U3.j;
import Z5.A;
import e4.n;
import f.AbstractC0841b;
import f6.AbstractC0893G;
import f6.C0889C;
import f6.C0890D;
import f6.C0892F;
import f6.C0925w;
import f6.z;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.client.engine.UtilsKt;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestData;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMethodKt;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.OutgoingContentKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.WriterScope;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import w6.InterfaceC2226k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0018\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lw6/k;", "LS3/h;", "context", "Lio/ktor/client/request/HttpRequestData;", "requestData", "Lio/ktor/utils/io/ByteReadChannel;", "toChannel", "(Lw6/k;LS3/h;Lio/ktor/client/request/HttpRequestData;)Lio/ktor/utils/io/ByteReadChannel;", "", "cause", "request", "mapExceptions", "(Ljava/lang/Throwable;Lio/ktor/client/request/HttpRequestData;)Ljava/lang/Throwable;", "callContext", "Lf6/D;", "convertToOkHttpRequest", "(Lio/ktor/client/request/HttpRequestData;LS3/h;)Lf6/D;", "Lio/ktor/http/content/OutgoingContent;", "Lf6/G;", "convertToOkHttpBody", "(Lio/ktor/http/content/OutgoingContent;LS3/h;)Lf6/G;", "Lf6/z;", "Lio/ktor/client/plugins/HttpTimeoutConfig;", "timeoutAttributes", "setupTimeoutAttributes", "(Lf6/z;Lio/ktor/client/plugins/HttpTimeoutConfig;)Lf6/z;", "ktor-client-okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OkHttpEngineKt {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1", f = "OkHttpEngine.kt", l = {170, 179}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ h $context;
        final /* synthetic */ HttpRequestData $requestData;
        final /* synthetic */ InterfaceC2226k $this_toChannel;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC2226k interfaceC2226k, h hVar, HttpRequestData httpRequestData, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_toChannel = interfaceC2226k;
            this.$context = hVar;
            this.$requestData = httpRequestData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C invokeSuspend$lambda$2$lambda$1(v vVar, InterfaceC2226k interfaceC2226k, HttpRequestData httpRequestData, h hVar, ByteBuffer byteBuffer) throws Throwable {
            Object objR;
            try {
                vVar.f12718k = interfaceC2226k.read(byteBuffer);
                return C.a;
            } catch (Throwable th) {
                th = th;
                try {
                    objR = D.q(hVar).H();
                } catch (Throwable th2) {
                    objR = r.r(th2);
                }
                if (objR instanceof O3.n) {
                    objR = null;
                }
                CancellationException cancellationException = (CancellationException) objR;
                if (cancellationException != null) {
                    th = cancellationException;
                }
                throw OkHttpEngineKt.mapExceptions(th, httpRequestData);
            }
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_toChannel, this.$context, this.$requestData, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e4.n
        public final Object invoke(WriterScope writerScope, c<? super C> cVar) {
            return ((AnonymousClass1) create(writerScope, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
        
            if (r10.flush(r15) != r6) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ba -> B:8:0x0027). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.OkHttpEngineKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final AbstractC0893G convertToOkHttpBody(OutgoingContent outgoingContent, h hVar) {
        l.f("<this>", outgoingContent);
        l.f("callContext", hVar);
        if (outgoingContent instanceof OutgoingContent.ByteArrayContent) {
            byte[] bArrBytes = ((OutgoingContent.ByteArrayContent) outgoingContent).getContent();
            C0892F c0892f = AbstractC0893G.Companion;
            Pattern pattern = C0925w.f11614e;
            C0925w c0925wM = AbstractC0841b.m(String.valueOf(outgoingContent.getContentType()));
            int length = bArrBytes.length;
            c0892f.getClass();
            return C0892F.a(c0925wM, bArrBytes, 0, length);
        }
        if (outgoingContent instanceof OutgoingContent.ReadChannelContent) {
            return new StreamRequestBody(outgoingContent.getContentLength(), new q(10, outgoingContent));
        }
        if (outgoingContent instanceof OutgoingContent.WriteChannelContent) {
            return new StreamRequestBody(outgoingContent.getContentLength(), new A(2, hVar, outgoingContent));
        }
        if (outgoingContent instanceof OutgoingContent.NoContent) {
            AbstractC0893G.Companion.getClass();
            return C0892F.a(null, new byte[0], 0, 0);
        }
        if (outgoingContent instanceof OutgoingContent.ContentWrapper) {
            return convertToOkHttpBody(((OutgoingContent.ContentWrapper) outgoingContent).getDelegate(), hVar);
        }
        if (outgoingContent instanceof OutgoingContent.ProtocolUpgrade) {
            throw new UnsupportedContentTypeException(outgoingContent);
        }
        throw new D6.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel convertToOkHttpBody$lambda$2(OutgoingContent outgoingContent) {
        return ((OutgoingContent.ReadChannelContent) outgoingContent).readFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel convertToOkHttpBody$lambda$3(h hVar, OutgoingContent outgoingContent) {
        return ByteWriteChannelOperationsKt.writer$default((H5.A) Y.f3831k, hVar, false, (n) new OkHttpEngineKt$convertToOkHttpBody$3$1(outgoingContent, null), 2, (Object) null).getChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0890D convertToOkHttpRequest(HttpRequestData httpRequestData, h hVar) {
        final C0889C c0889c = new C0889C();
        c0889c.f(httpRequestData.getUrl().getUrlString());
        final boolean z7 = !HttpMethodKt.getSupportsRequestBody(httpRequestData.getMethod()) && OutgoingContentKt.isEmpty(httpRequestData.getBody());
        UtilsKt.mergeHeaders(httpRequestData.getHeaders(), httpRequestData.getBody(), new n() { // from class: io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpRequest$lambda$0$$inlined$forEachHeader$1
            @Override // e4.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((String) obj, (String) obj2);
                return C.a;
            }

            public final void invoke(String str, String str2) {
                l.f("key", str);
                l.f("value", str2);
                if (z7 && str.equals(HttpHeaders.INSTANCE.getContentLength())) {
                    return;
                }
                c0889c.f11472c.h(str, str2);
            }
        });
        c0889c.d(httpRequestData.getMethod().getValue(), AbstractC0841b.n(httpRequestData.getMethod().getValue()) ? convertToOkHttpBody(httpRequestData.getBody(), hVar) : null);
        return c0889c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable mapExceptions(Throwable th, HttpRequestData httpRequestData) {
        return th instanceof SocketTimeoutException ? HttpTimeoutKt.SocketTimeoutException(httpRequestData, th) : th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z setupTimeoutAttributes(z zVar, HttpTimeoutConfig httpTimeoutConfig) {
        Long connectTimeoutMillis = httpTimeoutConfig.get_connectTimeoutMillis();
        if (connectTimeoutMillis != null) {
            zVar.a(HttpTimeoutKt.convertLongTimeoutToLongWithInfiniteAsZero(connectTimeoutMillis.longValue()), TimeUnit.MILLISECONDS);
        }
        Long socketTimeoutMillis = httpTimeoutConfig.get_socketTimeoutMillis();
        if (socketTimeoutMillis != null) {
            long jLongValue = socketTimeoutMillis.longValue();
            long jConvertLongTimeoutToLongWithInfiniteAsZero = HttpTimeoutKt.convertLongTimeoutToLongWithInfiniteAsZero(jLongValue);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            zVar.getClass();
            l.f("unit", timeUnit);
            zVar.f11651x = g6.b.b(jConvertLongTimeoutToLongWithInfiniteAsZero, timeUnit);
            zVar.f11652y = g6.b.b(HttpTimeoutKt.convertLongTimeoutToLongWithInfiniteAsZero(jLongValue), timeUnit);
        }
        return zVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel toChannel(InterfaceC2226k interfaceC2226k, h hVar, HttpRequestData httpRequestData) {
        return ByteWriteChannelOperationsKt.writer$default((H5.A) Y.f3831k, hVar, false, (n) new AnonymousClass1(interfaceC2226k, hVar, httpRequestData, null), 2, (Object) null).getChannel();
    }
}
