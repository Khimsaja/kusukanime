package io.github.jan.supabase.postgrest.executor;

import P3.F;
import P3.q;
import P3.r;
import U3.c;
import U3.e;
import b1.AbstractC0703b;
import io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder;
import io.github.jan.supabase.postgrest.query.Returning;
import io.github.jan.supabase.postgrest.request.PostgrestRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.UtilsKt;
import io.ktor.http.ContentType;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.ParametersBuilder;
import io.ktor.http.ParametersKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlinx.serialization.json.b;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001a\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0080@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"configurePostgrestRequest", "", "Lio/ktor/client/request/HttpRequestBuilder;", "request", "Lio/github/jan/supabase/postgrest/request/PostgrestRequest;", "asPostgrestResult", "Lio/github/jan/supabase/postgrest/result/PostgrestResult;", "Lio/ktor/client/statement/HttpResponse;", "postgrest", "Lio/github/jan/supabase/postgrest/Postgrest;", "(Lio/ktor/client/statement/HttpResponse;Lio/github/jan/supabase/postgrest/Postgrest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postgrest-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PostgrestHttpExtensionKt {

    @e(c = "io.github.jan.supabase.postgrest.executor.PostgrestHttpExtensionKt", f = "PostgrestHttpExtension.kt", l = {41}, m = "asPostgrestResult", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.postgrest.executor.PostgrestHttpExtensionKt$asPostgrestResult$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PostgrestHttpExtensionKt.asPostgrestResult(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object asPostgrestResult(io.ktor.client.statement.HttpResponse r4, io.github.jan.supabase.postgrest.Postgrest r5, S3.c<? super io.github.jan.supabase.postgrest.result.PostgrestResult> r6) {
        /*
            boolean r0 = r6 instanceof io.github.jan.supabase.postgrest.executor.PostgrestHttpExtensionKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.github.jan.supabase.postgrest.executor.PostgrestHttpExtensionKt$asPostgrestResult$1 r0 = (io.github.jan.supabase.postgrest.executor.PostgrestHttpExtensionKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.postgrest.executor.PostgrestHttpExtensionKt$asPostgrestResult$1 r0 = new io.github.jan.supabase.postgrest.executor.PostgrestHttpExtensionKt$asPostgrestResult$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.L$1
            r5 = r4
            io.github.jan.supabase.postgrest.Postgrest r5 = (io.github.jan.supabase.postgrest.Postgrest) r5
            java.lang.Object r4 = r0.L$0
            io.ktor.client.statement.HttpResponse r4 = (io.ktor.client.statement.HttpResponse) r4
            P3.r.Y(r6)
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            P3.r.Y(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            r6 = 0
            java.lang.Object r6 = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(r4, r6, r0, r3, r6)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.String r6 = (java.lang.String) r6
            io.ktor.http.Headers r4 = r4.getHeaders()
            io.github.jan.supabase.postgrest.result.PostgrestResult r0 = new io.github.jan.supabase.postgrest.result.PostgrestResult
            r0.<init>(r6, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.postgrest.executor.PostgrestHttpExtensionKt.asPostgrestResult(io.ktor.client.statement.HttpResponse, io.github.jan.supabase.postgrest.Postgrest, S3.c):java.lang.Object");
    }

    public static final void configurePostgrestRequest(HttpRequestBuilder httpRequestBuilder, PostgrestRequest postgrestRequest) {
        l.f("<this>", httpRequestBuilder);
        l.f("request", postgrestRequest);
        httpRequestBuilder.setMethod(postgrestRequest.getMethod());
        HttpMessagePropertiesKt.contentType(httpRequestBuilder, ContentType.Application.INSTANCE.getJson());
        httpRequestBuilder.getHeaders().appendAll(postgrestRequest.getHeaders());
        httpRequestBuilder.getHeaders().set(PostgrestQueryBuilder.HEADER_PREFER, q.y0(postgrestRequest.getPrefer(), ",", null, null, null, 62));
        ParametersBuilder parameters = httpRequestBuilder.getUrl().getParameters();
        Map<String, String> urlParams = postgrestRequest.getUrlParams();
        LinkedHashMap linkedHashMap = new LinkedHashMap(F.I(urlParams.size()));
        Iterator<T> it = urlParams.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), r.H((String) entry.getValue()));
        }
        parameters.appendAll(ParametersKt.parametersOf(linkedHashMap));
        if (postgrestRequest.getReturning() instanceof Returning.Representation) {
            Returning returning = postgrestRequest.getReturning();
            l.d("null cannot be cast to non-null type io.github.jan.supabase.postgrest.query.Returning.Representation", returning);
            parameters.append("select", ((Returning.Representation) returning).m33getColumnsU9NzzuM());
        }
        b body = postgrestRequest.getBody();
        if (body != null) {
            InterfaceC1444w interfaceC1444wA = null;
            httpRequestBuilder.setBody(body);
            InterfaceC1425d interfaceC1425dB = y.a.b(b.class);
            try {
                interfaceC1444wA = y.a(b.class);
            } catch (Throwable unused) {
            }
            AbstractC0703b.z(interfaceC1425dB, interfaceC1444wA, httpRequestBuilder);
        }
        if (AbstractC2510o.g0(postgrestRequest.getSchema())) {
            return;
        }
        HttpMethod method = httpRequestBuilder.getMethod();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        if (l.a(method, companion.getGet()) || l.a(method, companion.getHead())) {
            UtilsKt.header(httpRequestBuilder, "Accept-Profile", postgrestRequest.getSchema());
        } else {
            UtilsKt.header(httpRequestBuilder, "Content-Profile", postgrestRequest.getSchema());
        }
    }
}
