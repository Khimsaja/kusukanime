package io.github.jan.supabase.auth.admin;

import O3.C;
import T3.a;
import U3.c;
import U3.e;
import a6.v;
import b1.AbstractC0703b;
import e4.k;
import io.github.jan.supabase.auth.Auth;
import io.github.jan.supabase.auth.AuthImpl;
import io.github.jan.supabase.auth.AuthenticatedSupabaseApi;
import io.github.jan.supabase.auth.SignOutScope;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.UtilsKt;
import io.ktor.http.ContentType;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;
import n6.d;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J'\u0010\u0013\u001a\u00020\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0002\b\u0018H\u0096@¢\u0006\u0002\u0010\u0019J'\u0010\u001a\u001a\u00020\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0002\b\u0018H\u0096@¢\u0006\u0002\u0010\u0019J(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096@¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010$J*\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u000f2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096@¢\u0006\u0002\u0010+J/\u0010,\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u000f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0002\b\u0018H\u0096@¢\u0006\u0002\u0010.J\u001e\u0010/\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u00101J\u001c\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001d2\u0006\u0010#\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u00064"}, d2 = {"Lio/github/jan/supabase/auth/admin/AdminApiImpl;", "Lio/github/jan/supabase/auth/admin/AdminApi;", "gotrue", "Lio/github/jan/supabase/auth/Auth;", "<init>", "(Lio/github/jan/supabase/auth/Auth;)V", "getGotrue", "()Lio/github/jan/supabase/auth/Auth;", "api", "Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "getApi", "()Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "signOut", "", "jwt", "", "scope", "Lio/github/jan/supabase/auth/SignOutScope;", "(Ljava/lang/String;Lio/github/jan/supabase/auth/SignOutScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUserWithEmail", "Lio/github/jan/supabase/auth/user/UserInfo;", "builder", "Lkotlin/Function1;", "Lio/github/jan/supabase/auth/admin/AdminUserBuilder$Email;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUserWithPhone", "Lio/github/jan/supabase/auth/admin/AdminUserBuilder$Phone;", "retrieveUsers", "", "page", "", "perPage", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveUserById", "uid", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUser", "inviteUserByEmail", "email", "redirectTo", "data", "Lkotlinx/serialization/json/JsonObject;", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserById", "Lio/github/jan/supabase/auth/admin/AdminUserUpdateBuilder;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFactor", "factorId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveFactors", "Lio/github/jan/supabase/auth/user/UserMfaFactor;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AdminApiImpl implements AdminApi {
    private final AuthenticatedSupabaseApi api;
    private final Auth gotrue;

    @e(c = "io.github.jan.supabase.auth.admin.AdminApiImpl", f = "AdminApi.kt", l = {190, 197}, m = "createUserWithEmail", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.admin.AdminApiImpl$createUserWithEmail$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdminApiImpl.this.createUserWithEmail(null, this);
        }
    }

    @e(c = "io.github.jan.supabase.auth.admin.AdminApiImpl", f = "AdminApi.kt", l = {190, 197}, m = "createUserWithPhone", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.admin.AdminApiImpl$createUserWithPhone$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11051 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public C11051(S3.c<? super C11051> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdminApiImpl.this.createUserWithPhone(null, this);
        }
    }

    @e(c = "io.github.jan.supabase.auth.admin.AdminApiImpl", f = "AdminApi.kt", l = {189, 194}, m = "retrieveFactors", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.admin.AdminApiImpl$retrieveFactors$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11061 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C11061(S3.c<? super C11061> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdminApiImpl.this.retrieveFactors(null, this);
        }
    }

    @e(c = "io.github.jan.supabase.auth.admin.AdminApiImpl", f = "AdminApi.kt", l = {189, 194}, m = "retrieveUserById", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.admin.AdminApiImpl$retrieveUserById$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11071 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C11071(S3.c<? super C11071> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdminApiImpl.this.retrieveUserById(null, this);
        }
    }

    @e(c = "io.github.jan.supabase.auth.admin.AdminApiImpl", f = "AdminApi.kt", l = {189, 193}, m = "retrieveUsers", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.admin.AdminApiImpl$retrieveUsers$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11081 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C11081(S3.c<? super C11081> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdminApiImpl.this.retrieveUsers(null, null, this);
        }
    }

    @e(c = "io.github.jan.supabase.auth.admin.AdminApiImpl", f = "AdminApi.kt", l = {190, 197}, m = "updateUserById", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.admin.AdminApiImpl$updateUserById$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11091 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C11091(S3.c<? super C11091> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdminApiImpl.this.updateUserById(null, null, this);
        }
    }

    public AdminApiImpl(Auth auth) {
        l.f("gotrue", auth);
        this.gotrue = auth;
        this.api = ((AuthImpl) auth).getApi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.admin.AdminApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createUserWithEmail(e4.k r9, S3.c<? super io.github.jan.supabase.auth.user.UserInfo> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.admin.AdminApiImpl.createUserWithEmail(e4.k, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.admin.AdminApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createUserWithPhone(e4.k r9, S3.c<? super io.github.jan.supabase.auth.user.UserInfo> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.admin.AdminApiImpl.createUserWithPhone(e4.k, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.auth.admin.AdminApi
    public Object deleteFactor(String str, String str2, S3.c<? super C> cVar) {
        Object objRequest = this.api.request("admin/users/" + str + "/factors/" + str2, new k() { // from class: io.github.jan.supabase.auth.admin.AdminApiImpl$deleteFactor$$inlined$delete$default$1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HttpRequestBuilder) obj);
                return C.a;
            }

            public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                l.f("$this$request", httpRequestBuilder);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
            }
        }, cVar);
        return objRequest == a.f9048k ? objRequest : C.a;
    }

    @Override // io.github.jan.supabase.auth.admin.AdminApi
    public Object deleteUser(String str, S3.c<? super C> cVar) {
        Object objRequest = this.api.request(AbstractC0703b.i("admin/users/", str), new k() { // from class: io.github.jan.supabase.auth.admin.AdminApiImpl$deleteUser$$inlined$delete$default$1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HttpRequestBuilder) obj);
                return C.a;
            }

            public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                l.f("$this$request", httpRequestBuilder);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
            }
        }, cVar);
        return objRequest == a.f9048k ? objRequest : C.a;
    }

    public final AuthenticatedSupabaseApi getApi() {
        return this.api;
    }

    public final Auth getGotrue() {
        return this.gotrue;
    }

    @Override // io.github.jan.supabase.auth.admin.AdminApi
    public Object inviteUserByEmail(String str, final String str2, kotlinx.serialization.json.c cVar, S3.c<? super C> cVar2) {
        v vVar = new v();
        d.V("email", str, vVar);
        if (cVar != null) {
            vVar.b("data", cVar);
        }
        final kotlinx.serialization.json.c cVarA = vVar.a();
        AuthenticatedSupabaseApi authenticatedSupabaseApi = this.api;
        final ContentType json = ContentType.Application.INSTANCE.getJson();
        Object objRequest = authenticatedSupabaseApi.request("invite", new k() { // from class: io.github.jan.supabase.auth.admin.AdminApiImpl$inviteUserByEmail$$inlined$postJson$1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HttpRequestBuilder) obj);
                return C.a;
            }

            public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                l.f("$this$request", httpRequestBuilder);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
                String str3 = str2;
                if (str3 != null) {
                    httpRequestBuilder.getUrl().getParameters().append("redirect_to", str3);
                }
                HttpMessagePropertiesKt.contentType(httpRequestBuilder, json);
                Object obj = cVarA;
                InterfaceC1444w interfaceC1444wA = null;
                if (obj == null) {
                    httpRequestBuilder.setBody(NullBody.INSTANCE);
                    InterfaceC1425d interfaceC1425dB = y.a.b(kotlinx.serialization.json.c.class);
                    try {
                        interfaceC1444wA = y.a(kotlinx.serialization.json.c.class);
                    } catch (Throwable unused) {
                    }
                    AbstractC0703b.z(interfaceC1425dB, interfaceC1444wA, httpRequestBuilder);
                    return;
                }
                if (obj instanceof OutgoingContent) {
                    httpRequestBuilder.setBody(obj);
                    httpRequestBuilder.setBodyType(null);
                } else {
                    httpRequestBuilder.setBody(obj);
                    InterfaceC1425d interfaceC1425dB2 = y.a.b(kotlinx.serialization.json.c.class);
                    try {
                        interfaceC1444wA = y.a(kotlinx.serialization.json.c.class);
                    } catch (Throwable unused2) {
                    }
                    AbstractC0703b.z(interfaceC1425dB2, interfaceC1444wA, httpRequestBuilder);
                }
            }
        }, cVar2);
        return objRequest == a.f9048k ? objRequest : C.a;
    }

    @Override // io.github.jan.supabase.auth.admin.AdminApi
    public /* bridge */ Object logout(String str, SignOutScope signOutScope, S3.c<? super C> cVar) {
        return super.logout(str, signOutScope, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.admin.AdminApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveFactors(java.lang.String r9, S3.c<? super java.util.List<io.github.jan.supabase.auth.user.UserMfaFactor>> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.github.jan.supabase.auth.admin.AdminApiImpl.C11061
            if (r0 == 0) goto L13
            r0 = r10
            io.github.jan.supabase.auth.admin.AdminApiImpl$retrieveFactors$1 r0 = (io.github.jan.supabase.auth.admin.AdminApiImpl.C11061) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.auth.admin.AdminApiImpl$retrieveFactors$1 r0 = new io.github.jan.supabase.auth.admin.AdminApiImpl$retrieveFactors$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r9 = r0.L$1
            io.ktor.client.statement.HttpResponse r9 = (io.ktor.client.statement.HttpResponse) r9
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            P3.r.Y(r10)
            goto L82
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.L$1
            io.github.jan.supabase.network.SupabaseHttpClient r9 = (io.github.jan.supabase.network.SupabaseHttpClient) r9
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            P3.r.Y(r10)
            goto L6f
        L4c:
            P3.r.Y(r10)
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi r10 = r8.api
            java.lang.String r2 = "admin/users/"
            java.lang.String r7 = "/factors"
            java.lang.String r9 = b1.AbstractC0703b.j(r2, r9, r7)
            io.github.jan.supabase.auth.admin.AdminApiImpl$retrieveFactors$$inlined$get$default$1 r2 = new io.github.jan.supabase.auth.admin.AdminApiImpl$retrieveFactors$$inlined$get$default$1
            r2.<init>()
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.I$0 = r3
            r0.label = r5
            java.lang.Object r10 = r10.request(r9, r2, r0)
            if (r10 != r1) goto L6f
            goto L81
        L6f:
            io.ktor.client.statement.HttpResponse r10 = (io.ktor.client.statement.HttpResponse) r10
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.I$0 = r3
            r0.label = r4
            java.lang.Object r10 = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(r10, r6, r0, r5, r6)
            if (r10 != r1) goto L82
        L81:
            return r1
        L82:
            java.lang.String r10 = (java.lang.String) r10
            a6.d r9 = io.github.jan.supabase.UtilsKt.getSupabaseJson()     // Catch: V5.b -> L9c
            r9.getClass()     // Catch: V5.b -> L9c
            Z5.d r0 = new Z5.d     // Catch: V5.b -> L9c
            io.github.jan.supabase.auth.user.UserMfaFactor$Companion r1 = io.github.jan.supabase.auth.user.UserMfaFactor.INSTANCE     // Catch: V5.b -> L9c
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch: V5.b -> L9c
            r2 = 0
            r0.<init>(r1, r2)     // Catch: V5.b -> L9c
            java.lang.Object r9 = r9.b(r10, r0)     // Catch: V5.b -> L9c
            return r9
        L9c:
            io.github.jan.supabase.exceptions.SupabaseEncodingException r9 = new io.github.jan.supabase.exceptions.SupabaseEncodingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Couldn't decode payload as "
            r0.<init>(r1)
            kotlin.jvm.internal.z r1 = kotlin.jvm.internal.y.a
            java.lang.Class<java.util.List> r2 = java.util.List.class
            l4.d r1 = r1.b(r2)
            java.lang.String r1 = r1.n()
            r0.append(r1)
            java.lang.String r1 = ". Input: "
            r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.String r2 = ""
            java.lang.String r10 = z5.AbstractC2517v.R(r10, r1, r2)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.admin.AdminApiImpl.retrieveFactors(java.lang.String, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.admin.AdminApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveUserById(java.lang.String r8, S3.c<? super io.github.jan.supabase.auth.user.UserInfo> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.github.jan.supabase.auth.admin.AdminApiImpl.C11071
            if (r0 == 0) goto L13
            r0 = r9
            io.github.jan.supabase.auth.admin.AdminApiImpl$retrieveUserById$1 r0 = (io.github.jan.supabase.auth.admin.AdminApiImpl.C11071) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.auth.admin.AdminApiImpl$retrieveUserById$1 r0 = new io.github.jan.supabase.auth.admin.AdminApiImpl$retrieveUserById$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r8 = r0.L$1
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            P3.r.Y(r9)
            goto L80
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.L$1
            io.github.jan.supabase.network.SupabaseHttpClient r8 = (io.github.jan.supabase.network.SupabaseHttpClient) r8
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            P3.r.Y(r9)
            goto L6d
        L4c:
            P3.r.Y(r9)
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi r9 = r7.api
            java.lang.String r2 = "admin/users/"
            java.lang.String r8 = b1.AbstractC0703b.i(r2, r8)
            io.github.jan.supabase.auth.admin.AdminApiImpl$retrieveUserById$$inlined$get$default$1 r2 = new io.github.jan.supabase.auth.admin.AdminApiImpl$retrieveUserById$$inlined$get$default$1
            r2.<init>()
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.I$0 = r3
            r0.label = r5
            java.lang.Object r9 = r9.request(r8, r2, r0)
            if (r9 != r1) goto L6d
            goto L7f
        L6d:
            io.ktor.client.statement.HttpResponse r9 = (io.ktor.client.statement.HttpResponse) r9
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.I$0 = r3
            r0.label = r4
            java.lang.Object r9 = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(r9, r6, r0, r5, r6)
            if (r9 != r1) goto L80
        L7f:
            return r1
        L80:
            java.lang.String r9 = (java.lang.String) r9
            a6.d r8 = io.github.jan.supabase.UtilsKt.getSupabaseJson()     // Catch: V5.b -> L96
            r8.getClass()     // Catch: V5.b -> L96
            io.github.jan.supabase.auth.user.UserInfo$Companion r0 = io.github.jan.supabase.auth.user.UserInfo.INSTANCE     // Catch: V5.b -> L96
            kotlinx.serialization.KSerializer r0 = r0.serializer()     // Catch: V5.b -> L96
            kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0     // Catch: V5.b -> L96
            java.lang.Object r8 = r8.b(r9, r0)     // Catch: V5.b -> L96
            return r8
        L96:
            io.github.jan.supabase.exceptions.SupabaseEncodingException r8 = new io.github.jan.supabase.exceptions.SupabaseEncodingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Couldn't decode payload as "
            r0.<init>(r1)
            kotlin.jvm.internal.z r1 = kotlin.jvm.internal.y.a
            java.lang.Class<io.github.jan.supabase.auth.user.UserInfo> r2 = io.github.jan.supabase.auth.user.UserInfo.class
            l4.d r1 = r1.b(r2)
            java.lang.String r1 = r1.n()
            r0.append(r1)
            java.lang.String r1 = ". Input: "
            r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.String r2 = ""
            java.lang.String r9 = z5.AbstractC2517v.R(r9, r1, r2)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.admin.AdminApiImpl.retrieveUserById(java.lang.String, S3.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(2:12|(2:27|(2:29|30)(2:31|32))(2:33|34))(2:13|14))(1:15))(3:16|(0)|25)|19|35|20|23) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.admin.AdminApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveUsers(final java.lang.Integer r8, final java.lang.Integer r9, S3.c<? super java.util.List<io.github.jan.supabase.auth.user.UserInfo>> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.admin.AdminApiImpl.retrieveUsers(java.lang.Integer, java.lang.Integer, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.auth.admin.AdminApi
    public Object signOut(final String str, final SignOutScope signOutScope, S3.c<? super C> cVar) {
        Object objRequest = this.api.request("logout", new k() { // from class: io.github.jan.supabase.auth.admin.AdminApiImpl$signOut$$inlined$post$1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HttpRequestBuilder) obj);
                return C.a;
            }

            public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                l.f("$this$request", httpRequestBuilder);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
                String lowerCase = signOutScope.name().toLowerCase(Locale.ROOT);
                l.e("toLowerCase(...)", lowerCase);
                UtilsKt.parameter(httpRequestBuilder, "scope", lowerCase);
                httpRequestBuilder.getHeaders().set(HttpHeaders.INSTANCE.getAuthorization(), "Bearer " + str);
            }
        }, cVar);
        return objRequest == a.f9048k ? objRequest : C.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e6, code lost:
    
        if (r1 == r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // io.github.jan.supabase.auth.admin.AdminApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateUserById(java.lang.String r22, e4.k r23, S3.c<? super io.github.jan.supabase.auth.user.UserInfo> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.admin.AdminApiImpl.updateUserById(java.lang.String, e4.k, S3.c):java.lang.Object");
    }
}
