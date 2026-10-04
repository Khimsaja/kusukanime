package io.ktor.client.plugins;

import O3.C;
import U3.j;
import e4.o;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "LO3/C;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponse;)V"}, k = 3, mv = {2, 1, 0})
@U3.e(c = "io.ktor.client.plugins.DoubleReceivePluginKt$SaveBody$1$1", f = "SaveBody.kt", l = {45, 52}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DoubleReceivePluginKt$SaveBody$1$1 extends j implements o {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    public DoubleReceivePluginKt$SaveBody$1$1(S3.c<? super DoubleReceivePluginKt$SaveBody$1$1> cVar) {
        super(3, cVar);
    }

    @Override // e4.o
    public final Object invoke(PipelineContext<HttpResponse, C> pipelineContext, HttpResponse httpResponse, S3.c<? super C> cVar) {
        DoubleReceivePluginKt$SaveBody$1$1 doubleReceivePluginKt$SaveBody$1$1 = new DoubleReceivePluginKt$SaveBody$1$1(cVar);
        doubleReceivePluginKt$SaveBody$1$1.L$0 = pipelineContext;
        doubleReceivePluginKt$SaveBody$1$1.L$1 = httpResponse;
        return doubleReceivePluginKt$SaveBody$1$1.invokeSuspend(C.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:52|(1:(1:(2:6|7)(2:8|9))(2:10|11))(2:15|(3:17|(2:19|20)|39)(4:21|(1:23)|24|(2:26|38)(1:27)))|28|48|29|30|33|(1:35)|36|(1:38)(1:39)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        r2 = P3.r.r(r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [io.ktor.client.statement.HttpResponse] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v4, types: [io.ktor.client.statement.HttpResponse] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = "Saving body for "
            T3.a r1 = T3.a.f9048k
            int r2 = r10.label
            O3.C r3 = O3.C.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L30
            if (r2 == r5) goto L1c
            if (r2 != r4) goto L14
            P3.r.Y(r11)
            return r3
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            java.lang.Object r0 = r10.L$2
            io.ktor.util.Attributes r0 = (io.ktor.util.Attributes) r0
            java.lang.Object r2 = r10.L$1
            io.ktor.client.statement.HttpResponse r2 = (io.ktor.client.statement.HttpResponse) r2
            java.lang.Object r5 = r10.L$0
            io.ktor.util.pipeline.PipelineContext r5 = (io.ktor.util.pipeline.PipelineContext) r5
            P3.r.Y(r11)     // Catch: java.lang.Throwable -> L2d
            goto La4
        L2d:
            r11 = move-exception
            goto Ldd
        L30:
            P3.r.Y(r11)
            java.lang.Object r11 = r10.L$0
            io.ktor.util.pipeline.PipelineContext r11 = (io.ktor.util.pipeline.PipelineContext) r11
            java.lang.Object r2 = r10.L$1
            io.ktor.client.statement.HttpResponse r2 = (io.ktor.client.statement.HttpResponse) r2
            io.ktor.client.call.HttpClientCall r6 = r2.getCall()
            io.ktor.util.Attributes r7 = r6.getAttributes()
            io.ktor.util.AttributeKey r8 = io.ktor.client.plugins.DoubleReceivePluginKt.access$getSKIP_SAVE_BODY$p()
            boolean r8 = r7.contains(r8)
            if (r8 == 0) goto L71
            z6.b r11 = io.ktor.client.plugins.DoubleReceivePluginKt.access$getLOGGER()
            boolean r0 = io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(r11)
            if (r0 == 0) goto Ldc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Skipping body saving for "
            r0.<init>(r1)
            io.ktor.client.request.HttpRequest r1 = r6.getRequest()
            io.ktor.http.Url r1 = r1.getUrl()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.e(r0)
            return r3
        L71:
            z6.b r8 = io.ktor.client.plugins.DoubleReceivePluginKt.access$getLOGGER()     // Catch: java.lang.Throwable -> L2d
            boolean r9 = io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(r8)     // Catch: java.lang.Throwable -> L2d
            if (r9 == 0) goto L92
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L2d
            io.ktor.client.request.HttpRequest r0 = r6.getRequest()     // Catch: java.lang.Throwable -> L2d
            io.ktor.http.Url r0 = r0.getUrl()     // Catch: java.lang.Throwable -> L2d
            r9.append(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L2d
            r8.e(r0)     // Catch: java.lang.Throwable -> L2d
        L92:
            r10.L$0 = r11     // Catch: java.lang.Throwable -> L2d
            r10.L$1 = r2     // Catch: java.lang.Throwable -> L2d
            r10.L$2 = r7     // Catch: java.lang.Throwable -> L2d
            r10.label = r5     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = io.ktor.client.call.SavedCallKt.save(r6, r10)     // Catch: java.lang.Throwable -> L2d
            if (r0 != r1) goto La1
            goto Ldb
        La1:
            r5 = r11
            r11 = r0
            r0 = r7
        La4:
            io.ktor.client.call.HttpClientCall r11 = (io.ktor.client.call.HttpClientCall) r11     // Catch: java.lang.Throwable -> L2d
            io.ktor.client.statement.HttpResponse r11 = r11.getResponse()     // Catch: java.lang.Throwable -> L2d
            io.ktor.utils.io.ByteReadChannel r2 = r2.getRawContent()     // Catch: java.lang.Throwable -> Lb3
            io.ktor.utils.io.ByteReadChannelKt.cancel(r2)     // Catch: java.lang.Throwable -> Lb3
            r2 = r3
            goto Lb8
        Lb3:
            r2 = move-exception
            O3.n r2 = P3.r.r(r2)
        Lb8:
            java.lang.Throwable r2 = O3.o.a(r2)
            if (r2 == 0) goto Lc5
            z6.b r6 = io.ktor.client.plugins.DoubleReceivePluginKt.access$getLOGGER()
            r6.k(r2)
        Lc5:
            io.ktor.util.AttributeKey r2 = io.ktor.client.plugins.DoubleReceivePluginKt.access$getRESPONSE_BODY_SAVED$p()
            r0.put(r2, r3)
            r0 = 0
            r10.L$0 = r0
            r10.L$1 = r0
            r10.L$2 = r0
            r10.label = r4
            java.lang.Object r11 = r5.proceedWith(r11, r10)
            if (r11 != r1) goto Ldc
        Ldb:
            return r1
        Ldc:
            return r3
        Ldd:
            io.ktor.utils.io.ByteReadChannel r0 = r2.getRawContent()     // Catch: java.lang.Throwable -> Le5
            io.ktor.utils.io.ByteReadChannelKt.cancel(r0)     // Catch: java.lang.Throwable -> Le5
            goto Lea
        Le5:
            r0 = move-exception
            O3.n r3 = P3.r.r(r0)
        Lea:
            java.lang.Throwable r0 = O3.o.a(r3)
            if (r0 == 0) goto Lf7
            z6.b r1 = io.ktor.client.plugins.DoubleReceivePluginKt.access$getLOGGER()
            r1.k(r0)
        Lf7:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.DoubleReceivePluginKt$SaveBody$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
