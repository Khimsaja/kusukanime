package io.github.jan.supabase.auth;

import H5.A;
import H5.D;
import O3.C;
import P3.F;
import P3.q;
import P3.r;
import U3.j;
import e4.k;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.auth.event.AuthEvent;
import io.github.jan.supabase.auth.status.SessionStatus;
import io.github.jan.supabase.auth.user.UserSession;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.logging.SupabaseLogger;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLUtilsKt;
import io.ktor.util.collections.ConcurrentMapKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a \u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u0000\u001a\"\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0007\u001a\u001e\u0010\u0012\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0011\u001a\u00020\u0004H\u0000\u001a\u001e\u0010\u0014\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¨\u0006\u0015"}, d2 = {"parseFragmentAndImportSession", "", "Lio/github/jan/supabase/auth/Auth;", "fragment", "", "onFinish", "Lkotlin/Function1;", "Lio/github/jan/supabase/auth/user/UserSession;", "getFragmentParts", "", "checkForUrlParameterError", "Lio/github/jan/supabase/auth/event/AuthEvent$OtpError;", "parameters", "handledUrlParameterError", "", "redirectTo", "Lio/ktor/client/request/HttpRequestBuilder;", "url", "consumeHashParameters", "", "consumeUrlParameter", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UrlUtilsKt {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.auth.UrlUtilsKt$parseFragmentAndImportSession$4", f = "UrlUtils.kt", l = {29, ConcurrentMapKt.INITIAL_CAPACITY}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.UrlUtilsKt$parseFragmentAndImportSession$4, reason: invalid class name */
    public static final class AnonymousClass4 extends j implements n {
        final /* synthetic */ k $onFinish;
        final /* synthetic */ UserSession $session;
        final /* synthetic */ Auth $this_parseFragmentAndImportSession;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Auth auth, UserSession userSession, k kVar, S3.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
            this.$this_parseFragmentAndImportSession = auth;
            this.$session = userSession;
            this.$onFinish = kVar;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            return new AnonymousClass4(this.$this_parseFragmentAndImportSession, this.$session, this.$onFinish, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((AnonymousClass4) create(a, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
        
            if (io.github.jan.supabase.auth.Auth.importSession$default(r0, r0, false, r3, r21, 2, null) == r7) goto L15;
         */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
            /*
                r21 = this;
                r4 = r21
                T3.a r7 = T3.a.f9048k
                int r0 = r4.label
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L28
                if (r0 == r2) goto L22
                if (r0 != r1) goto L1a
                java.lang.Object r0 = r4.L$1
                io.github.jan.supabase.auth.user.UserSession r0 = (io.github.jan.supabase.auth.user.UserSession) r0
                java.lang.Object r0 = r4.L$0
                io.github.jan.supabase.auth.user.UserInfo r0 = (io.github.jan.supabase.auth.user.UserInfo) r0
                P3.r.Y(r22)
                goto L73
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L22:
                P3.r.Y(r22)
                r0 = r22
                goto L3e
            L28:
                P3.r.Y(r22)
                io.github.jan.supabase.auth.Auth r0 = r4.$this_parseFragmentAndImportSession
                io.github.jan.supabase.auth.AuthImpl r0 = (io.github.jan.supabase.auth.AuthImpl) r0
                io.github.jan.supabase.auth.user.UserSession r3 = r4.$session
                java.lang.String r3 = r3.getAccessToken()
                r4.label = r2
                java.lang.Object r0 = r0.retrieveUser(r3, r4)
                if (r0 != r7) goto L3e
                goto L72
            L3e:
                r16 = r0
                io.github.jan.supabase.auth.user.UserInfo r16 = (io.github.jan.supabase.auth.user.UserInfo) r16
                io.github.jan.supabase.auth.user.UserSession r8 = r4.$session
                r19 = 447(0x1bf, float:6.26E-43)
                r20 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r15 = 0
                r17 = 0
                r18 = 0
                io.github.jan.supabase.auth.user.UserSession r0 = io.github.jan.supabase.auth.user.UserSession.copy$default(r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
                e4.k r2 = r4.$onFinish
                r2.invoke(r0)
                r2 = r0
                io.github.jan.supabase.auth.Auth r0 = r4.$this_parseFragmentAndImportSession
                io.github.jan.supabase.auth.status.SessionSource$External r3 = io.github.jan.supabase.auth.status.SessionSource.External.INSTANCE
                r5 = 0
                r4.L$0 = r5
                r4.L$1 = r5
                r4.label = r1
                r1 = r2
                r2 = 0
                r5 = 2
                r6 = 0
                java.lang.Object r0 = io.github.jan.supabase.auth.Auth.importSession$default(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r7) goto L73
            L72:
                return r7
            L73:
                O3.C r0 = O3.C.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.UrlUtilsKt.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final AuthEvent.OtpError checkForUrlParameterError(k kVar) {
        l.f("parameters", kVar);
        String str = (String) kVar.invoke("error");
        String str2 = (String) kVar.invoke("error_code");
        String str3 = (String) kVar.invoke("error_description");
        if (str2 == null) {
            return null;
        }
        return new AuthEvent.OtpError(str2, str3 + " (" + str + ')');
    }

    public static final String consumeHashParameters(List<String> list, String str) {
        l.f("parameters", list);
        l.f("url", str);
        URLBuilder URLBuilder = URLUtilsKt.URLBuilder(str);
        List listU0 = AbstractC2510o.u0(URLBuilder.getFragment(), new String[]{"&"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU0) {
            if (!list.contains(q.r0(AbstractC2510o.u0((String) obj, new String[]{"="}, 0, 6)))) {
                arrayList.add(obj);
            }
        }
        URLBuilder.setFragment(q.y0(arrayList, "&", null, null, null, 62));
        return URLBuilder.buildString();
    }

    public static final String consumeUrlParameter(List<String> list, String str) {
        l.f("parameters", list);
        l.f("url", str);
        URLBuilder URLBuilder = URLUtilsKt.URLBuilder(str);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            URLBuilder.getParameters().remove((String) it.next());
        }
        return URLBuilder.buildString();
    }

    public static final Map<String, String> getFragmentParts(String str) {
        l.f("fragment", str);
        List listU0 = AbstractC2510o.u0(str, new String[]{"&"}, 0, 6);
        int I = F.I(r.p(listU0, 10));
        if (I < 16) {
            I = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(I);
        Iterator it = listU0.iterator();
        while (it.hasNext()) {
            List listU02 = AbstractC2510o.u0((String) it.next(), new String[]{"="}, 0, 6);
            linkedHashMap.put(listU02.get(0), listU02.get(1));
        }
        return linkedHashMap;
    }

    public static final boolean handledUrlParameterError(Auth auth, k kVar) {
        l.f("<this>", auth);
        l.f("parameters", kVar);
        AuthEvent.OtpError otpErrorCheckForUrlParameterError = checkForUrlParameterError(kVar);
        if (otpErrorCheckForUrlParameterError == null) {
            return false;
        }
        if (auth.getSessionStatus().getValue() instanceof SessionStatus.Authenticated) {
            return true;
        }
        SupabaseLogger logger = Auth.INSTANCE.getLogger();
        LogLevel logLevel = LogLevel.DEBUG;
        LogLevel level = logger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            logger.log(logLevel, (Throwable) null, "Found error code in the URL Parameters: " + otpErrorCheckForUrlParameterError + ". Emitting event...");
        }
        auth.emitEvent(otpErrorCheckForUrlParameterError);
        return true;
    }

    @SupabaseInternal
    public static final void parseFragmentAndImportSession(Auth auth, String str, k kVar) {
        l.f("<this>", auth);
        l.f("fragment", str);
        l.f("onFinish", kVar);
        SupabaseLogger logger = Auth.INSTANCE.getLogger();
        LogLevel logLevel = LogLevel.DEBUG;
        LogLevel level = logger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            logger.log(logLevel, (Throwable) null, "Parsing fragment ".concat(str));
        }
        if (handledUrlParameterError(auth, new K3.c(getFragmentParts(str), 1))) {
            kVar.invoke(null);
            return;
        }
        try {
            D.x(((AuthImpl) auth).getAuthScope(), null, new AnonymousClass4(auth, AuthExtensionsKt.parseSessionFromFragment(auth, str), kVar, null), 3);
        } catch (IllegalArgumentException e7) {
            SupabaseLogger logger2 = Auth.INSTANCE.getLogger();
            LogLevel logLevel2 = LogLevel.DEBUG;
            LogLevel level2 = logger2.getLevel();
            if (level2 == null) {
                level2 = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
            }
            if (logLevel2.compareTo(level2) >= 0) {
                logger2.log(logLevel2, e7, "Received invalid session fragment. Ignoring.");
            }
        }
    }

    public static /* synthetic */ void parseFragmentAndImportSession$default(Auth auth, String str, k kVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new c(6);
        }
        parseFragmentAndImportSession(auth, str, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C parseFragmentAndImportSession$lambda$0(UserSession userSession) {
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseFragmentAndImportSession$lambda$2(Map map, String str) {
        l.f("it", str);
        return (String) map.get(str);
    }

    @SupabaseInternal
    public static final void redirectTo(HttpRequestBuilder httpRequestBuilder, String str) {
        l.f("<this>", httpRequestBuilder);
        l.f("url", str);
        httpRequestBuilder.getUrl().getParameters().set("redirect_to", str);
    }
}
