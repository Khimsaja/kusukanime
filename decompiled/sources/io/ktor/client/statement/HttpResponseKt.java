package io.ktor.client.statement;

import H5.D;
import H5.h0;
import H5.r;
import O3.InterfaceC0554c;
import U3.c;
import U3.e;
import io.ktor.client.request.HttpRequest;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.InternalAPI;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.C2496a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\"\u0010\b\u001a\u00020\u0007*\u00020\u00002\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000e\u0010\f\"\u001e\u0010\u0012\u001a\u00020\n*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0016\u001a\u00020\u0013*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "LO3/C;", "complete", "(Lio/ktor/client/statement/HttpResponse;)V", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "fallbackCharset", "", "bodyAsText", "(Lio/ktor/client/statement/HttpResponse;Ljava/nio/charset/Charset;LS3/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "bodyAsChannel", "(Lio/ktor/client/statement/HttpResponse;LS3/c;)Ljava/lang/Object;", "", "bodyAsBytes", "getContent", "(Lio/ktor/client/statement/HttpResponse;)Lio/ktor/utils/io/ByteReadChannel;", "getContent$annotations", "content", "Lio/ktor/client/request/HttpRequest;", "getRequest", "(Lio/ktor/client/statement/HttpResponse;)Lio/ktor/client/request/HttpRequest;", "request", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpResponseKt {

    @e(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", l = {147}, m = "bodyAsBytes")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.statement.HttpResponseKt$bodyAsBytes$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpResponseKt.bodyAsBytes(null, this);
        }
    }

    @e(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", l = {147}, m = "bodyAsChannel")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12111 extends c {
        int label;
        /* synthetic */ Object result;

        public C12111(S3.c<? super C12111> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpResponseKt.bodyAsChannel(null, this);
        }
    }

    @e(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", l = {147}, m = "bodyAsText")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.statement.HttpResponseKt$bodyAsText$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12121 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12121(S3.c<? super C12121> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpResponseKt.bodyAsText(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object bodyAsBytes(io.ktor.client.statement.HttpResponse r5, S3.c<? super byte[]> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.client.statement.HttpResponseKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.statement.HttpResponseKt$bodyAsBytes$1 r0 = (io.ktor.client.statement.HttpResponseKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpResponseKt$bodyAsBytes$1 r0 = new io.ktor.client.statement.HttpResponseKt$bodyAsBytes$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r6)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            P3.r.Y(r6)
            io.ktor.client.call.HttpClientCall r5 = r5.getCall()
            kotlin.jvm.internal.z r6 = kotlin.jvm.internal.y.a
            java.lang.Class<byte[]> r2 = byte[].class
            l4.d r6 = r6.b(r2)
            l4.w r2 = kotlin.jvm.internal.y.a(r2)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r2 = 0
        L44:
            io.ktor.util.reflect.TypeInfo r4 = new io.ktor.util.reflect.TypeInfo
            r4.<init>(r6, r2)
            r0.label = r3
            java.lang.Object r6 = r5.bodyNullable(r4, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            if (r6 == 0) goto L57
            byte[] r6 = (byte[]) r6
            return r6
        L57:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.ByteArray"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpResponseKt.bodyAsBytes(io.ktor.client.statement.HttpResponse, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object bodyAsChannel(io.ktor.client.statement.HttpResponse r5, S3.c<? super io.ktor.utils.io.ByteReadChannel> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.client.statement.HttpResponseKt.C12111
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1 r0 = (io.ktor.client.statement.HttpResponseKt.C12111) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1 r0 = new io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r6)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            P3.r.Y(r6)
            io.ktor.client.call.HttpClientCall r5 = r5.getCall()
            kotlin.jvm.internal.z r6 = kotlin.jvm.internal.y.a
            java.lang.Class<io.ktor.utils.io.ByteReadChannel> r2 = io.ktor.utils.io.ByteReadChannel.class
            l4.d r6 = r6.b(r2)
            l4.w r2 = kotlin.jvm.internal.y.a(r2)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r2 = 0
        L44:
            io.ktor.util.reflect.TypeInfo r4 = new io.ktor.util.reflect.TypeInfo
            r4.<init>(r6, r2)
            r0.label = r3
            java.lang.Object r6 = r5.bodyNullable(r4, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            if (r6 == 0) goto L57
            io.ktor.utils.io.ByteReadChannel r6 = (io.ktor.utils.io.ByteReadChannel) r6
            return r6
        L57:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpResponseKt.bodyAsChannel(io.ktor.client.statement.HttpResponse, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object bodyAsText(io.ktor.client.statement.HttpResponse r6, java.nio.charset.Charset r7, S3.c<? super java.lang.String> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.client.statement.HttpResponseKt.C12121
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.statement.HttpResponseKt$bodyAsText$1 r0 = (io.ktor.client.statement.HttpResponseKt.C12121) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpResponseKt$bodyAsText$1 r0 = new io.ktor.client.statement.HttpResponseKt$bodyAsText$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r6 = r0.L$0
            java.nio.charset.CharsetDecoder r6 = (java.nio.charset.CharsetDecoder) r6
            P3.r.Y(r8)
            goto L66
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            P3.r.Y(r8)
            java.nio.charset.Charset r8 = io.ktor.http.HttpMessagePropertiesKt.charset(r6)
            if (r8 != 0) goto L3e
            goto L3f
        L3e:
            r7 = r8
        L3f:
            java.nio.charset.CharsetDecoder r7 = r7.newDecoder()
            io.ktor.client.call.HttpClientCall r6 = r6.getCall()
            kotlin.jvm.internal.z r8 = kotlin.jvm.internal.y.a
            java.lang.Class<S5.n> r2 = S5.n.class
            l4.d r8 = r8.b(r2)
            l4.w r2 = kotlin.jvm.internal.y.a(r2)     // Catch: java.lang.Throwable -> L54
            goto L55
        L54:
            r2 = r3
        L55:
            io.ktor.util.reflect.TypeInfo r5 = new io.ktor.util.reflect.TypeInfo
            r5.<init>(r8, r2)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r6.bodyNullable(r5, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            r6 = r7
        L66:
            if (r8 == 0) goto L74
            S5.n r8 = (S5.n) r8
            kotlin.jvm.internal.l.c(r6)
            r7 = 0
            r0 = 2
            java.lang.String r6 = io.ktor.utils.io.charsets.EncodingKt.decode$default(r6, r8, r7, r0, r3)
            return r6
        L74:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlinx.io.Source"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpResponseKt.bodyAsText(io.ktor.client.statement.HttpResponse, java.nio.charset.Charset, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object bodyAsText$default(HttpResponse httpResponse, Charset charset, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = C2496a.f19036b;
        }
        return bodyAsText(httpResponse, charset, cVar);
    }

    @InternalAPI
    public static final void complete(HttpResponse httpResponse) {
        l.f("<this>", httpResponse);
        ((h0) ((r) D.q(httpResponse.getCoroutineContext()))).Z();
    }

    public static final ByteReadChannel getContent(HttpResponse httpResponse) {
        l.f("<this>", httpResponse);
        return httpResponse.getRawContent();
    }

    @InternalAPI
    @InterfaceC0554c
    public static /* synthetic */ void getContent$annotations(HttpResponse httpResponse) {
    }

    public static final HttpRequest getRequest(HttpResponse httpResponse) {
        l.f("<this>", httpResponse);
        return httpResponse.getCall().getRequest();
    }
}
