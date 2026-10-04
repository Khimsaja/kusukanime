package io.github.jan.supabase.auth.mfa;

import K5.InterfaceC0329h;
import K5.InterfaceC0330i;
import K5.W;
import O3.C;
import P3.y;
import T3.a;
import U3.c;
import U3.e;
import a6.C0673c;
import a6.d;
import b1.AbstractC0703b;
import e4.k;
import io.github.jan.supabase.auth.AuthImpl;
import io.github.jan.supabase.auth.AuthenticatedSupabaseApi;
import io.github.jan.supabase.auth.mfa.AuthenticatorAssuranceLevel;
import io.github.jan.supabase.auth.providers.builtin.Phone;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.auth.user.UserMfaFactor;
import io.github.jan.supabase.auth.user.UserSession;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.HttpMethod;
import io.ktor.util.Base64Kt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.json.b;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001a\"\u0004\b\u0000\u0010\u001c\"\u0004\b\u0001\u0010\u001b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001b0\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u00020#0\"¢\u0006\u0002\b$H\u0096@¢\u0006\u0002\u0010%J \u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096@¢\u0006\u0002\u0010+J.\u0010,\u001a\u00020-2\u0006\u0010(\u001a\u00020 2\u0006\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020 2\u0006\u00100\u001a\u000201H\u0096@¢\u0006\u0002\u00102J\u0016\u00103\u001a\u00020#2\u0006\u0010(\u001a\u00020 H\u0096@¢\u0006\u0002\u00104J\b\u00105\u001a\u000206H\u0016J\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0096@¢\u0006\u0002\u00108R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u00069"}, d2 = {"Lio/github/jan/supabase/auth/mfa/MfaApiImpl;", "Lio/github/jan/supabase/auth/mfa/MfaApi;", "auth", "Lio/github/jan/supabase/auth/AuthImpl;", "<init>", "(Lio/github/jan/supabase/auth/AuthImpl;)V", "getAuth", "()Lio/github/jan/supabase/auth/AuthImpl;", "status", "Lio/github/jan/supabase/auth/mfa/MfaStatus;", "getStatus", "()Lio/github/jan/supabase/auth/mfa/MfaStatus;", "statusFlow", "Lkotlinx/coroutines/flow/Flow;", "getStatusFlow", "()Lkotlinx/coroutines/flow/Flow;", "verifiedFactors", "", "Lio/github/jan/supabase/auth/user/UserMfaFactor;", "getVerifiedFactors", "()Ljava/util/List;", "api", "Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "getApi", "()Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "enroll", "Lio/github/jan/supabase/auth/mfa/MfaFactor;", "Response", "Config", "factorType", "Lio/github/jan/supabase/auth/mfa/FactorType;", "friendlyName", "", "config", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/auth/mfa/FactorType;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createChallenge", "Lio/github/jan/supabase/auth/mfa/MfaChallenge;", "factorId", "channel", "Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;", "(Ljava/lang/String;Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyChallenge", "Lio/github/jan/supabase/auth/user/UserSession;", "challengeId", "code", "saveSession", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unenroll", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAuthenticatorAssuranceLevel", "Lio/github/jan/supabase/auth/mfa/MfaLevel;", "retrieveFactorsForCurrentUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MfaApiImpl implements MfaApi {
    private final AuthenticatedSupabaseApi api;
    private final AuthImpl auth;
    private final InterfaceC0329h statusFlow;

    @e(c = "io.github.jan.supabase.auth.mfa.MfaApiImpl", f = "MfaApi.kt", l = {197, 204}, m = "createChallenge", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.mfa.MfaApiImpl$createChallenge$1, reason: invalid class name */
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
            return MfaApiImpl.this.createChallenge(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @e(c = "io.github.jan.supabase.auth.mfa.MfaApiImpl", f = "MfaApi.kt", l = {136, 198, 204, 140}, m = "enroll", v = 1)
    /* renamed from: io.github.jan.supabase.auth.mfa.MfaApiImpl$enroll$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11101<Config, Response> extends c {
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

        public C11101(S3.c<? super C11101> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MfaApiImpl.this.enroll(null, null, null, this);
        }
    }

    @e(c = "io.github.jan.supabase.auth.mfa.MfaApiImpl", f = "MfaApi.kt", l = {189}, m = "retrieveFactorsForCurrentUser", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.mfa.MfaApiImpl$retrieveFactorsForCurrentUser$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11111 extends c {
        int label;
        /* synthetic */ Object result;

        public C11111(S3.c<? super C11111> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MfaApiImpl.this.retrieveFactorsForCurrentUser(this);
        }
    }

    @e(c = "io.github.jan.supabase.auth.mfa.MfaApiImpl", f = "MfaApi.kt", l = {197, 203, 169}, m = "verifyChallenge", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.mfa.MfaApiImpl$verifyChallenge$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11121 extends c {
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
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C11121(S3.c<? super C11121> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MfaApiImpl.this.verifyChallenge(null, null, null, false, this);
        }
    }

    public MfaApiImpl(AuthImpl authImpl) {
        l.f("auth", authImpl);
        this.auth = authImpl;
        final W sessionStatus = authImpl.getSessionStatus();
        this.statusFlow = new InterfaceC0329h() { // from class: io.github.jan.supabase.auth.mfa.MfaApiImpl$special$$inlined$map$1

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: io.github.jan.supabase.auth.mfa.MfaApiImpl$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0330i {
                final /* synthetic */ InterfaceC0330i $this_unsafeFlow;
                final /* synthetic */ MfaApiImpl this$0;

                @e(c = "io.github.jan.supabase.auth.mfa.MfaApiImpl$special$$inlined$map$1$2", f = "MfaApi.kt", l = {50}, m = "emit", v = 1)
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                /* renamed from: io.github.jan.supabase.auth.mfa.MfaApiImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(S3.c cVar) {
                        super(cVar);
                    }

                    @Override // U3.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC0330i interfaceC0330i, MfaApiImpl mfaApiImpl) {
                    this.$this_unsafeFlow = interfaceC0330i;
                    this.this$0 = mfaApiImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // K5.InterfaceC0330i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, S3.c r9) throws java.lang.Throwable {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof io.github.jan.supabase.auth.mfa.MfaApiImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        io.github.jan.supabase.auth.mfa.MfaApiImpl$special$$inlined$map$1$2$1 r0 = (io.github.jan.supabase.auth.mfa.MfaApiImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        io.github.jan.supabase.auth.mfa.MfaApiImpl$special$$inlined$map$1$2$1 r0 = new io.github.jan.supabase.auth.mfa.MfaApiImpl$special$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        T3.a r1 = T3.a.f9048k
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L37
                        if (r2 != r3) goto L2f
                        java.lang.Object r8 = r0.L$3
                        K5.i r8 = (K5.InterfaceC0330i) r8
                        java.lang.Object r8 = r0.L$1
                        io.github.jan.supabase.auth.mfa.MfaApiImpl$special$$inlined$map$1$2$1 r8 = (io.github.jan.supabase.auth.mfa.MfaApiImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r8
                        P3.r.Y(r9)
                        goto L7c
                    L2f:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L37:
                        P3.r.Y(r9)
                        K5.i r9 = r7.$this_unsafeFlow
                        io.github.jan.supabase.auth.status.SessionStatus r8 = (io.github.jan.supabase.auth.status.SessionStatus) r8
                        boolean r8 = r8 instanceof io.github.jan.supabase.auth.status.SessionStatus.Authenticated
                        r2 = 0
                        if (r8 == 0) goto L63
                        io.github.jan.supabase.auth.mfa.MfaApiImpl r8 = r7.this$0
                        io.github.jan.supabase.auth.mfa.MfaLevel r8 = r8.getAuthenticatorAssuranceLevel()
                        io.github.jan.supabase.auth.mfa.AuthenticatorAssuranceLevel r4 = r8.getCurrent()
                        io.github.jan.supabase.auth.mfa.AuthenticatorAssuranceLevel r8 = r8.getNext()
                        io.github.jan.supabase.auth.mfa.MfaStatus r5 = new io.github.jan.supabase.auth.mfa.MfaStatus
                        io.github.jan.supabase.auth.mfa.AuthenticatorAssuranceLevel r6 = io.github.jan.supabase.auth.mfa.AuthenticatorAssuranceLevel.AAL2
                        if (r8 != r6) goto L59
                        r8 = r3
                        goto L5a
                    L59:
                        r8 = r2
                    L5a:
                        if (r4 != r6) goto L5e
                        r4 = r3
                        goto L5f
                    L5e:
                        r4 = r2
                    L5f:
                        r5.<init>(r8, r4)
                        goto L68
                    L63:
                        io.github.jan.supabase.auth.mfa.MfaStatus r5 = new io.github.jan.supabase.auth.mfa.MfaStatus
                        r5.<init>(r2, r2)
                    L68:
                        r8 = 0
                        r0.L$0 = r8
                        r0.L$1 = r8
                        r0.L$2 = r8
                        r0.L$3 = r8
                        r0.I$0 = r2
                        r0.label = r3
                        java.lang.Object r8 = r9.emit(r5, r0)
                        if (r8 != r1) goto L7c
                        return r1
                    L7c:
                        O3.C r8 = O3.C.a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.mfa.MfaApiImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, S3.c):java.lang.Object");
                }
            }

            @Override // K5.InterfaceC0329h
            public Object collect(InterfaceC0330i interfaceC0330i, S3.c cVar) {
                Object objCollect = sessionStatus.collect(new AnonymousClass2(interfaceC0330i, this), cVar);
                return objCollect == a.f9048k ? objCollect : C.a;
            }
        };
        this.api = authImpl.getApi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d4, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.mfa.MfaApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createChallenge(java.lang.String r9, io.github.jan.supabase.auth.providers.builtin.Phone.Channel r10, S3.c<? super io.github.jan.supabase.auth.mfa.MfaChallenge> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.mfa.MfaApiImpl.createChallenge(java.lang.String, io.github.jan.supabase.auth.providers.builtin.Phone$Channel, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.auth.mfa.MfaApi
    public /* bridge */ Object createChallengeAndVerify(String str, String str2, Phone.Channel channel, boolean z7, S3.c<? super UserSession> cVar) {
        return super.createChallengeAndVerify(str, str2, channel, z7, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0171 A[PHI: r1 r2
      0x0171: PHI (r1v7 io.github.jan.supabase.auth.mfa.FactorType<Config, Response>) = 
      (r1v6 io.github.jan.supabase.auth.mfa.FactorType<Config, Response>)
      (r1v46 io.github.jan.supabase.auth.mfa.FactorType<Config, Response>)
     binds: [B:36:0x016e, B:17:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r2v13 java.lang.Object) = (r2v12 java.lang.Object), (r2v1 java.lang.Object) binds: [B:36:0x016e, B:17:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // io.github.jan.supabase.auth.mfa.MfaApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <Config, Response> java.lang.Object enroll(io.github.jan.supabase.auth.mfa.FactorType<Config, Response> r18, java.lang.String r19, e4.k r20, S3.c<? super io.github.jan.supabase.auth.mfa.MfaFactor<Response>> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.mfa.MfaApiImpl.enroll(io.github.jan.supabase.auth.mfa.FactorType, java.lang.String, e4.k, S3.c):java.lang.Object");
    }

    public final AuthenticatedSupabaseApi getApi() {
        return this.api;
    }

    public final AuthImpl getAuth() {
        return this.auth;
    }

    @Override // io.github.jan.supabase.auth.mfa.MfaApi
    public MfaLevel getAuthenticatorAssuranceLevel() {
        String strA;
        String strCurrentAccessTokenOrNull = this.auth.currentAccessTokenOrNull();
        if (strCurrentAccessTokenOrNull == null) {
            throw new IllegalStateException("Current session is null");
        }
        List listU0 = AbstractC2510o.u0(strCurrentAccessTokenOrNull, new String[]{"."}, 0, 6);
        C0673c c0673c = d.f10459d;
        String strDecodeBase64String = Base64Kt.decodeBase64String((String) listU0.get(1));
        c0673c.getClass();
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) c0673c.b(strDecodeBase64String, kotlinx.serialization.json.c.Companion.serializer());
        AuthenticatorAssuranceLevel.Companion companion = AuthenticatorAssuranceLevel.INSTANCE;
        b bVar = (b) cVar.get("aal");
        if (bVar == null || (strA = a6.l.f(bVar).a()) == null) {
            throw new IllegalStateException("No 'aal' claim found in JWT");
        }
        return new MfaLevel(companion.from(strA), !getVerifiedFactors().isEmpty() ? AuthenticatorAssuranceLevel.AAL2 : AuthenticatorAssuranceLevel.AAL1);
    }

    @Override // io.github.jan.supabase.auth.mfa.MfaApi
    public MfaStatus getStatus() {
        MfaLevel authenticatorAssuranceLevel = getAuthenticatorAssuranceLevel();
        AuthenticatorAssuranceLevel current = authenticatorAssuranceLevel.getCurrent();
        AuthenticatorAssuranceLevel next = authenticatorAssuranceLevel.getNext();
        AuthenticatorAssuranceLevel authenticatorAssuranceLevel2 = AuthenticatorAssuranceLevel.AAL2;
        return new MfaStatus(next == authenticatorAssuranceLevel2, current == authenticatorAssuranceLevel2);
    }

    @Override // io.github.jan.supabase.auth.mfa.MfaApi
    public InterfaceC0329h getStatusFlow() {
        return this.statusFlow;
    }

    @Override // io.github.jan.supabase.auth.mfa.MfaApi
    public List<UserMfaFactor> getVerifiedFactors() {
        List<UserMfaFactor> factors;
        UserInfo userInfoCurrentUserOrNull = this.auth.currentUserOrNull();
        if (userInfoCurrentUserOrNull == null || (factors = userInfoCurrentUserOrNull.getFactors()) == null) {
            return y.f7779k;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : factors) {
            if (((UserMfaFactor) obj).isVerified()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.mfa.MfaApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveFactorsForCurrentUser(S3.c<? super java.util.List<io.github.jan.supabase.auth.user.UserMfaFactor>> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.github.jan.supabase.auth.mfa.MfaApiImpl.C11111
            if (r0 == 0) goto L13
            r0 = r6
            io.github.jan.supabase.auth.mfa.MfaApiImpl$retrieveFactorsForCurrentUser$1 r0 = (io.github.jan.supabase.auth.mfa.MfaApiImpl.C11111) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.auth.mfa.MfaApiImpl$retrieveFactorsForCurrentUser$1 r0 = new io.github.jan.supabase.auth.mfa.MfaApiImpl$retrieveFactorsForCurrentUser$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            P3.r.Y(r6)
            io.github.jan.supabase.auth.AuthImpl r6 = r5.auth
            r0.label = r3
            r2 = 0
            r4 = 0
            java.lang.Object r6 = io.github.jan.supabase.auth.Auth.retrieveUserForCurrentSession$default(r6, r2, r0, r3, r4)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            io.github.jan.supabase.auth.user.UserInfo r6 = (io.github.jan.supabase.auth.user.UserInfo) r6
            java.util.List r6 = r6.getFactors()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.mfa.MfaApiImpl.retrieveFactorsForCurrentUser(S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.auth.mfa.MfaApi
    public Object unenroll(String str, S3.c<? super C> cVar) {
        Object objRequest = this.api.request(AbstractC0703b.i("factors/", str), new k() { // from class: io.github.jan.supabase.auth.mfa.MfaApiImpl$unenroll$$inlined$delete$default$1
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

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(1:(1:(3:14|37|44)(2:15|16))(2:17|(2:31|(3:33|(3:36|37|44)|35)(2:38|39))(2:40|41)))(1:18))(3:19|(0)|35)|22|42|23|26|(2:29|(0)(0))|35) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f8, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // io.github.jan.supabase.auth.mfa.MfaApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object verifyChallenge(java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, S3.c<? super io.github.jan.supabase.auth.user.UserSession> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.mfa.MfaApiImpl.verifyChallenge(java.lang.String, java.lang.String, java.lang.String, boolean, S3.c):java.lang.Object");
    }
}
