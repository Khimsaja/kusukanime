package io.github.jan.supabase.auth.mfa;

import K5.InterfaceC0329h;
import O3.C;
import S3.c;
import U3.e;
import e4.k;
import io.github.jan.supabase.auth.providers.builtin.Phone;
import io.github.jan.supabase.auth.user.UserMfaFactor;
import io.github.jan.supabase.auth.user.UserSession;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J[\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0010\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u00110\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aH¦@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0016H¦@¢\u0006\u0002\u0010\u001eJ\"\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00162\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H¦@¢\u0006\u0002\u0010#J2\u0010$\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020(H\u0096@¢\u0006\u0002\u0010)J0\u0010*\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020(H¦@¢\u0006\u0002\u0010,J\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH¦@¢\u0006\u0002\u0010.J\b\u0010/\u001a\u000200H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u00061À\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/auth/mfa/MfaApi;", "", "status", "Lio/github/jan/supabase/auth/mfa/MfaStatus;", "getStatus", "()Lio/github/jan/supabase/auth/mfa/MfaStatus;", "statusFlow", "Lkotlinx/coroutines/flow/Flow;", "getStatusFlow", "()Lkotlinx/coroutines/flow/Flow;", "verifiedFactors", "", "Lio/github/jan/supabase/auth/user/UserMfaFactor;", "getVerifiedFactors", "()Ljava/util/List;", "enroll", "Lio/github/jan/supabase/auth/mfa/MfaFactor;", "Response", "Config", "factorType", "Lio/github/jan/supabase/auth/mfa/FactorType;", "friendlyName", "", "config", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/auth/mfa/FactorType;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unenroll", "factorId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createChallenge", "Lio/github/jan/supabase/auth/mfa/MfaChallenge;", "channel", "Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;", "(Ljava/lang/String;Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createChallengeAndVerify", "Lio/github/jan/supabase/auth/user/UserSession;", "code", "saveSession", "", "(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyChallenge", "challengeId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveFactorsForCurrentUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAuthenticatorAssuranceLevel", "Lio/github/jan/supabase/auth/mfa/MfaLevel;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MfaApi {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Object createChallengeAndVerify(MfaApi mfaApi, String str, String str2, Phone.Channel channel, boolean z7, c<? super UserSession> cVar) {
            return MfaApi.super.createChallengeAndVerify(str, str2, channel, z7, cVar);
        }
    }

    @e(c = "io.github.jan.supabase.auth.mfa.MfaApi", f = "MfaApi.kt", l = {75, 78}, m = "createChallengeAndVerify$suspendImpl", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.mfa.MfaApi$createChallengeAndVerify$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MfaApi.createChallengeAndVerify$suspendImpl(MfaApi.this, null, null, null, false, this);
        }
    }

    static /* synthetic */ Object createChallenge$default(MfaApi mfaApi, String str, Phone.Channel channel, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createChallenge");
        }
        if ((i7 & 2) != 0) {
            channel = null;
        }
        return mfaApi.createChallenge(str, channel, cVar);
    }

    static /* synthetic */ Object createChallengeAndVerify$default(MfaApi mfaApi, String str, String str2, Phone.Channel channel, boolean z7, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createChallengeAndVerify");
        }
        if ((i7 & 4) != 0) {
            channel = Phone.Channel.SMS;
        }
        Phone.Channel channel2 = channel;
        if ((i7 & 8) != 0) {
            z7 = true;
        }
        return mfaApi.createChallengeAndVerify(str, str2, channel2, z7, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object createChallengeAndVerify$suspendImpl(io.github.jan.supabase.auth.mfa.MfaApi r6, java.lang.String r7, java.lang.String r8, io.github.jan.supabase.auth.providers.builtin.Phone.Channel r9, boolean r10, S3.c<? super io.github.jan.supabase.auth.user.UserSession> r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof io.github.jan.supabase.auth.mfa.MfaApi.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r11
            io.github.jan.supabase.auth.mfa.MfaApi$createChallengeAndVerify$1 r0 = (io.github.jan.supabase.auth.mfa.MfaApi.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r11 = r0
            goto L1a
        L14:
            io.github.jan.supabase.auth.mfa.MfaApi$createChallengeAndVerify$1 r0 = new io.github.jan.supabase.auth.mfa.MfaApi$createChallengeAndVerify$1
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r0 = r11.result
            T3.a r1 = T3.a.f9048k
            int r2 = r11.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L62
            if (r2 == r4) goto L49
            if (r2 != r3) goto L41
            java.lang.Object r6 = r11.L$4
            io.github.jan.supabase.auth.mfa.MfaChallenge r6 = (io.github.jan.supabase.auth.mfa.MfaChallenge) r6
            java.lang.Object r6 = r11.L$3
            io.github.jan.supabase.auth.providers.builtin.Phone$Channel r6 = (io.github.jan.supabase.auth.providers.builtin.Phone.Channel) r6
            java.lang.Object r6 = r11.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r11.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r11.L$0
            io.github.jan.supabase.auth.mfa.MfaApi r6 = (io.github.jan.supabase.auth.mfa.MfaApi) r6
            P3.r.Y(r0)
            return r0
        L41:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L49:
            boolean r10 = r11.Z$0
            java.lang.Object r6 = r11.L$3
            io.github.jan.supabase.auth.providers.builtin.Phone$Channel r6 = (io.github.jan.supabase.auth.providers.builtin.Phone.Channel) r6
            java.lang.Object r6 = r11.L$2
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r11.L$1
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r11.L$0
            io.github.jan.supabase.auth.mfa.MfaApi r6 = (io.github.jan.supabase.auth.mfa.MfaApi) r6
            P3.r.Y(r0)
        L60:
            r9 = r8
            goto L78
        L62:
            P3.r.Y(r0)
            r11.L$0 = r6
            r11.L$1 = r7
            r11.L$2 = r8
            r11.L$3 = r5
            r11.Z$0 = r10
            r11.label = r4
            java.lang.Object r0 = r6.createChallenge(r7, r9, r11)
            if (r0 != r1) goto L60
            goto L9e
        L78:
            io.github.jan.supabase.auth.mfa.MfaChallenge r0 = (io.github.jan.supabase.auth.mfa.MfaChallenge) r0
            java.lang.String r8 = r0.getFactorType()
            java.lang.String r2 = "phone"
            boolean r8 = kotlin.jvm.internal.l.a(r8, r2)
            if (r8 != 0) goto La0
            java.lang.String r8 = r0.getId()
            r11.L$0 = r5
            r11.L$1 = r5
            r11.L$2 = r5
            r11.L$3 = r5
            r11.L$4 = r5
            r11.Z$0 = r10
            r11.label = r3
            java.lang.Object r6 = r6.verifyChallenge(r7, r8, r9, r10, r11)
            if (r6 != r1) goto L9f
        L9e:
            return r1
        L9f:
            return r6
        La0:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Cannot verify a phone challenge immediately"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.mfa.MfaApi.createChallengeAndVerify$suspendImpl(io.github.jan.supabase.auth.mfa.MfaApi, java.lang.String, java.lang.String, io.github.jan.supabase.auth.providers.builtin.Phone$Channel, boolean, S3.c):java.lang.Object");
    }

    static /* synthetic */ Object enroll$default(MfaApi mfaApi, FactorType factorType, String str, k kVar, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enroll");
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            kVar = new A3.e(24);
        }
        return mfaApi.enroll(factorType, str, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C enroll$lambda$0(Object obj) {
        return C.a;
    }

    static /* synthetic */ Object verifyChallenge$default(MfaApi mfaApi, String str, String str2, String str3, boolean z7, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyChallenge");
        }
        if ((i7 & 8) != 0) {
            z7 = true;
        }
        return mfaApi.verifyChallenge(str, str2, str3, z7, cVar);
    }

    Object createChallenge(String str, Phone.Channel channel, c<? super MfaChallenge> cVar);

    default Object createChallengeAndVerify(String str, String str2, Phone.Channel channel, boolean z7, c<? super UserSession> cVar) {
        return createChallengeAndVerify$suspendImpl(this, str, str2, channel, z7, cVar);
    }

    <Config, Response> Object enroll(FactorType<Config, Response> factorType, String str, k kVar, c<? super MfaFactor<Response>> cVar);

    MfaLevel getAuthenticatorAssuranceLevel();

    MfaStatus getStatus();

    InterfaceC0329h getStatusFlow();

    List<UserMfaFactor> getVerifiedFactors();

    Object retrieveFactorsForCurrentUser(c<? super List<UserMfaFactor>> cVar);

    Object unenroll(String str, c<? super C> cVar);

    Object verifyChallenge(String str, String str2, String str3, boolean z7, c<? super UserSession> cVar);
}
