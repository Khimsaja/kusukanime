package io.github.jan.supabase.postgrest;

import O3.C;
import P3.F;
import Q3.g;
import U3.c;
import U3.e;
import b1.AbstractC0703b;
import e4.k;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.auth.AuthenticatedSupabaseApi;
import io.github.jan.supabase.auth.AuthenticatedSupabaseApiKt;
import io.github.jan.supabase.postgrest.Postgrest;
import io.github.jan.supabase.postgrest.executor.RestRequestExecutor;
import io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder;
import io.github.jan.supabase.postgrest.query.request.RpcRequestBuilder;
import io.github.jan.supabase.postgrest.request.RpcRequest;
import io.github.jan.supabase.postgrest.result.PostgrestResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.json.b;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0011H\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0016J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0096@¢\u0006\u0002\u0010(J7\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020-2\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010/¢\u0006\u0002\b2H\u0096@¢\u0006\u0002\u00103J/\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00112\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010/¢\u0006\u0002\b2H\u0096@¢\u0006\u0002\u00104J;\u00105\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00112\n\b\u0002\u00106\u001a\u0004\u0018\u00010-2\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010/¢\u0006\u0002\b2H\u0082@¢\u0006\u0002\u00103R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u001b¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u00067"}, d2 = {"Lio/github/jan/supabase/postgrest/PostgrestImpl;", "Lio/github/jan/supabase/postgrest/Postgrest;", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "config", "Lio/github/jan/supabase/postgrest/Postgrest$Config;", "<init>", "(Lio/github/jan/supabase/SupabaseClient;Lio/github/jan/supabase/postgrest/Postgrest$Config;)V", "getSupabaseClient", "()Lio/github/jan/supabase/SupabaseClient;", "getConfig", "()Lio/github/jan/supabase/postgrest/Postgrest$Config;", "apiVersion", "", "getApiVersion", "()I", "pluginKey", "", "getPluginKey", "()Ljava/lang/String;", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "setSerializer", "(Lio/github/jan/supabase/SupabaseSerializer;)V", "api", "Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "getApi$annotations", "()V", "getApi", "()Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "from", "Lio/github/jan/supabase/postgrest/query/PostgrestQueryBuilder;", "table", "schema", "parseErrorResponse", "Lio/github/jan/supabase/exceptions/RestException;", "response", "Lio/ktor/client/statement/HttpResponse;", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rpc", "Lio/github/jan/supabase/postgrest/result/PostgrestResult;", "function", "parameters", "Lkotlinx/serialization/json/JsonObject;", "request", "Lkotlin/Function1;", "Lio/github/jan/supabase/postgrest/query/request/RpcRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rpcRequest", "body", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PostgrestImpl implements Postgrest {
    private final AuthenticatedSupabaseApi api;
    private final Postgrest.Config config;
    private SupabaseSerializer serializer;
    private final SupabaseClient supabaseClient;

    @e(c = "io.github.jan.supabase.postgrest.PostgrestImpl", f = "PostgrestImpl.kt", l = {78}, m = "parseErrorResponse", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.postgrest.PostgrestImpl$parseErrorResponse$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int I$0;
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
            return PostgrestImpl.this.parseErrorResponse(null, this);
        }
    }

    public PostgrestImpl(SupabaseClient supabaseClient, Postgrest.Config config) {
        l.f("supabaseClient", supabaseClient);
        l.f("config", config);
        this.supabaseClient = supabaseClient;
        this.config = config;
        SupabaseSerializer serializer = getConfig().getSerializer();
        this.serializer = serializer == null ? getSupabaseClient().getDefaultSerializer() : serializer;
        this.api = AuthenticatedSupabaseApiKt.authenticatedSupabaseApi$default(getSupabaseClient(), this, (k) null, 2, (Object) null);
    }

    public static /* synthetic */ void getApi$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object rpcRequest(String str, kotlinx.serialization.json.c cVar, k kVar, S3.c<? super PostgrestResult> cVar2) {
        RpcRequestBuilder rpcRequestBuilder = new RpcRequestBuilder(getConfig().getDefaultSchema(), getConfig().getPropertyConversionMethod());
        kVar.invoke(rpcRequestBuilder);
        g gVar = new g();
        gVar.putAll(UtilsKt.mapToFirstValue(rpcRequestBuilder.getParams()));
        if (rpcRequestBuilder.getMethod() != RpcMethod.POST && cVar != null) {
            Map map = cVar.f12722k;
            LinkedHashMap linkedHashMap = new LinkedHashMap(F.I(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((b) entry.getValue()).toString());
            }
            gVar.putAll(linkedHashMap);
        }
        return RestRequestExecutor.INSTANCE.execute(this, AbstractC0703b.i("rpc/", str), new RpcRequest(rpcRequestBuilder.getMethod().getHttpMethod(), rpcRequestBuilder.getCount(), gVar.b(), cVar, rpcRequestBuilder.getSchema(), rpcRequestBuilder.getHeaders().build()), cVar2);
    }

    public static /* synthetic */ Object rpcRequest$default(PostgrestImpl postgrestImpl, String str, kotlinx.serialization.json.c cVar, k kVar, S3.c cVar2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            cVar = null;
        }
        return postgrestImpl.rpcRequest(str, cVar, kVar, cVar2);
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public /* bridge */ Object close(S3.c<? super C> cVar) {
        return super.close(cVar);
    }

    @Override // io.github.jan.supabase.postgrest.Postgrest
    public PostgrestQueryBuilder from(String table) {
        l.f("table", table);
        return new PostgrestQueryBuilder(this, table, null, 4, null);
    }

    @Override // io.github.jan.supabase.postgrest.Postgrest
    public /* bridge */ PostgrestQueryBuilder get(String str) {
        return super.get(str);
    }

    public final AuthenticatedSupabaseApi getApi() {
        return this.api;
    }

    @Override // io.github.jan.supabase.plugins.MainPlugin
    public int getApiVersion() {
        return 1;
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public Postgrest.Config getConfig() {
        return this.config;
    }

    @Override // io.github.jan.supabase.plugins.MainPlugin
    public String getPluginKey() {
        return Postgrest.INSTANCE.getKey();
    }

    @Override // io.github.jan.supabase.plugins.CustomSerializationPlugin
    public SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public SupabaseClient getSupabaseClient() {
        return this.supabaseClient;
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public /* bridge */ void init() {
        super.init();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // io.github.jan.supabase.plugins.MainPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object parseErrorResponse(io.ktor.client.statement.HttpResponse r22, S3.c<? super io.github.jan.supabase.exceptions.RestException> r23) throws java.lang.Throwable {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            boolean r2 = r1 instanceof io.github.jan.supabase.postgrest.PostgrestImpl.AnonymousClass1
            if (r2 == 0) goto L19
            r2 = r1
            io.github.jan.supabase.postgrest.PostgrestImpl$parseErrorResponse$1 r2 = (io.github.jan.supabase.postgrest.PostgrestImpl.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.label = r3
            r3 = r21
            goto L20
        L19:
            io.github.jan.supabase.postgrest.PostgrestImpl$parseErrorResponse$1 r2 = new io.github.jan.supabase.postgrest.PostgrestImpl$parseErrorResponse$1
            r3 = r21
            r2.<init>(r1)
        L20:
            java.lang.Object r1 = r2.result
            T3.a r4 = T3.a.f9048k
            int r5 = r2.label
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L41
            if (r5 != r6) goto L39
            java.lang.Object r0 = r2.L$1
            io.ktor.client.statement.HttpResponse r0 = (io.ktor.client.statement.HttpResponse) r0
            java.lang.Object r0 = r2.L$0
            io.ktor.client.statement.HttpResponse r0 = (io.ktor.client.statement.HttpResponse) r0
            P3.r.Y(r1)
        L37:
            r13 = r0
            goto L54
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            P3.r.Y(r1)
            r2.L$0 = r0
            r2.L$1 = r7
            r1 = 0
            r2.I$0 = r1
            r2.label = r6
            java.lang.Object r1 = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(r0, r7, r2, r6, r7)
            if (r1 != r4) goto L37
            return r4
        L54:
            java.lang.String r1 = (java.lang.String) r1
            a6.d r0 = io.github.jan.supabase.UtilsKt.getSupabaseJson()     // Catch: V5.j -> L6a
            r0.getClass()     // Catch: V5.j -> L6a
            io.github.jan.supabase.postgrest.PostgrestErrorResponse$Companion r2 = io.github.jan.supabase.postgrest.PostgrestErrorResponse.INSTANCE     // Catch: V5.j -> L6a
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch: V5.j -> L6a
            kotlinx.serialization.KSerializer r2 = (kotlinx.serialization.KSerializer) r2     // Catch: V5.j -> L6a
            java.lang.Object r7 = r0.b(r1, r2)     // Catch: V5.j -> L6a
            goto La2
        L6a:
            r0 = move-exception
            io.github.jan.supabase.SupabaseClient$Companion r2 = io.github.jan.supabase.SupabaseClient.INSTANCE
            io.github.jan.supabase.logging.SupabaseLogger r4 = r2.getLOGGER()
            io.github.jan.supabase.logging.LogLevel r5 = io.github.jan.supabase.logging.LogLevel.INFO
            io.github.jan.supabase.logging.LogLevel r6 = r4.getLevel()
            if (r6 != 0) goto L7d
            io.github.jan.supabase.logging.LogLevel r6 = r2.getDEFAULT_LOG_LEVEL()
        L7d:
            int r2 = r5.compareTo(r6)
            if (r2 < 0) goto La2
            java.lang.String r2 = "Could not decode "
            java.lang.String r6 = " as "
            java.lang.StringBuilder r1 = b1.AbstractC0703b.q(r2, r1, r6)
            kotlin.jvm.internal.z r2 = kotlin.jvm.internal.y.a
            java.lang.Class<io.github.jan.supabase.postgrest.PostgrestErrorResponse> r6 = io.github.jan.supabase.postgrest.PostgrestErrorResponse.class
            l4.d r2 = r2.b(r6)
            r1.append(r2)
            r2 = 46
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.log(r5, r0, r1)
        La2:
            io.github.jan.supabase.postgrest.PostgrestErrorResponse r7 = (io.github.jan.supabase.postgrest.PostgrestErrorResponse) r7
            if (r7 != 0) goto Lb8
            io.github.jan.supabase.postgrest.PostgrestErrorResponse r14 = new io.github.jan.supabase.postgrest.PostgrestErrorResponse
            r17 = 0
            r18 = 0
            java.lang.String r15 = "Unknown error"
            r16 = 0
            r19 = 14
            r20 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r7 = r14
        Lb8:
            io.github.jan.supabase.postgrest.exception.PostgrestRestException r8 = new io.github.jan.supabase.postgrest.exception.PostgrestRestException
            java.lang.String r9 = r7.getMessage()
            java.lang.String r10 = r7.getHint()
            kotlinx.serialization.json.b r11 = r7.getDetails()
            java.lang.String r12 = r7.getCode()
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.postgrest.PostgrestImpl.parseErrorResponse(io.ktor.client.statement.HttpResponse, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.plugins.MainPlugin
    public /* bridge */ String resolveUrl(String str) {
        return super.resolveUrl(str);
    }

    @Override // io.github.jan.supabase.postgrest.Postgrest
    public Object rpc(String str, kotlinx.serialization.json.c cVar, k kVar, S3.c<? super PostgrestResult> cVar2) {
        return rpcRequest(str, cVar, kVar, cVar2);
    }

    public void setSerializer(SupabaseSerializer supabaseSerializer) {
        l.f("<set-?>", supabaseSerializer);
        this.serializer = supabaseSerializer;
    }

    @Override // io.github.jan.supabase.postgrest.Postgrest
    public PostgrestQueryBuilder from(String schema, String table) {
        l.f("schema", schema);
        l.f("table", table);
        return new PostgrestQueryBuilder(this, table, schema);
    }

    @Override // io.github.jan.supabase.postgrest.Postgrest
    public /* bridge */ PostgrestQueryBuilder get(String str, String str2) {
        return super.get(str, str2);
    }

    @Override // io.github.jan.supabase.postgrest.Postgrest
    public Object rpc(String str, k kVar, S3.c<? super PostgrestResult> cVar) {
        return rpcRequest(str, null, kVar, cVar);
    }
}
