package io.github.jan.supabase.postgrest.executor;

import O3.C;
import U3.c;
import U3.e;
import io.github.jan.supabase.postgrest.request.PostgrestRequest;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001¨\u0006\u0014"}, d2 = {"Lio/github/jan/supabase/postgrest/executor/RestRequestExecutor;", "Lio/github/jan/supabase/postgrest/executor/RequestExecutor;", "<init>", "()V", "execute", "Lio/github/jan/supabase/postgrest/result/PostgrestResult;", "postgrest", "Lio/github/jan/supabase/postgrest/Postgrest;", "path", "", "request", "Lio/github/jan/supabase/postgrest/request/PostgrestRequest;", "(Lio/github/jan/supabase/postgrest/Postgrest;Ljava/lang/String;Lio/github/jan/supabase/postgrest/request/PostgrestRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "equals", "", "other", "", "hashCode", "", "toString", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RestRequestExecutor implements RequestExecutor {
    public static final RestRequestExecutor INSTANCE = new RestRequestExecutor();

    @e(c = "io.github.jan.supabase.postgrest.executor.RestRequestExecutor", f = "RestRequestExecutor.kt", l = {17, 19}, m = "execute", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.postgrest.executor.RestRequestExecutor$execute$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestRequestExecutor.this.execute(null, null, null, this);
        }
    }

    private RestRequestExecutor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C execute$lambda$0(PostgrestRequest postgrestRequest, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$request", httpRequestBuilder);
        PostgrestHttpExtensionKt.configurePostgrestRequest(httpRequestBuilder, postgrestRequest);
        return C.a;
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof RestRequestExecutor);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.postgrest.executor.RequestExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(io.github.jan.supabase.postgrest.Postgrest r8, java.lang.String r9, io.github.jan.supabase.postgrest.request.PostgrestRequest r10, S3.c<? super io.github.jan.supabase.postgrest.result.PostgrestResult> r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof io.github.jan.supabase.postgrest.executor.RestRequestExecutor.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            io.github.jan.supabase.postgrest.executor.RestRequestExecutor$execute$1 r0 = (io.github.jan.supabase.postgrest.executor.RestRequestExecutor.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.postgrest.executor.RestRequestExecutor$execute$1 r0 = new io.github.jan.supabase.postgrest.executor.RestRequestExecutor$execute$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L57
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r8 = r0.L$3
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi r8 = (io.github.jan.supabase.auth.AuthenticatedSupabaseApi) r8
            java.lang.Object r8 = r0.L$2
            io.github.jan.supabase.postgrest.request.PostgrestRequest r8 = (io.github.jan.supabase.postgrest.request.PostgrestRequest) r8
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.L$0
            io.github.jan.supabase.postgrest.Postgrest r8 = (io.github.jan.supabase.postgrest.Postgrest) r8
            P3.r.Y(r11)
            return r11
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            java.lang.Object r8 = r0.L$3
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi r8 = (io.github.jan.supabase.auth.AuthenticatedSupabaseApi) r8
            java.lang.Object r8 = r0.L$2
            io.github.jan.supabase.postgrest.request.PostgrestRequest r8 = (io.github.jan.supabase.postgrest.request.PostgrestRequest) r8
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.L$0
            io.github.jan.supabase.postgrest.Postgrest r8 = (io.github.jan.supabase.postgrest.Postgrest) r8
            P3.r.Y(r11)
            goto L7e
        L57:
            P3.r.Y(r11)
            java.lang.String r11 = "null cannot be cast to non-null type io.github.jan.supabase.postgrest.PostgrestImpl"
            kotlin.jvm.internal.l.d(r11, r8)
            r11 = r8
            io.github.jan.supabase.postgrest.PostgrestImpl r11 = (io.github.jan.supabase.postgrest.PostgrestImpl) r11
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi r11 = r11.getApi()
            A3.d r2 = new A3.d
            r6 = 9
            r2.<init>(r6, r10)
            r0.L$0 = r8
            r0.L$1 = r5
            r0.L$2 = r5
            r0.L$3 = r5
            r0.label = r4
            java.lang.Object r11 = r11.request(r9, r2, r0)
            if (r11 != r1) goto L7e
            goto L90
        L7e:
            io.ktor.client.statement.HttpResponse r11 = (io.ktor.client.statement.HttpResponse) r11
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.L$3 = r5
            r0.label = r3
            java.lang.Object r8 = io.github.jan.supabase.postgrest.executor.PostgrestHttpExtensionKt.asPostgrestResult(r11, r8, r0)
            if (r8 != r1) goto L91
        L90:
            return r1
        L91:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.postgrest.executor.RestRequestExecutor.execute(io.github.jan.supabase.postgrest.Postgrest, java.lang.String, io.github.jan.supabase.postgrest.request.PostgrestRequest, S3.c):java.lang.Object");
    }

    public int hashCode() {
        return -105643338;
    }

    public String toString() {
        return "RestRequestExecutor";
    }
}
