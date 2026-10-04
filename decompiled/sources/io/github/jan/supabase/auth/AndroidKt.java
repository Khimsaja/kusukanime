package io.github.jan.supabase.auth;

import H5.A;
import H5.D;
import O3.C;
import P3.r;
import U3.j;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import c.AbstractC0739a;
import e4.k;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.auth.ExternalAuthAction;
import io.github.jan.supabase.auth.user.UserSession;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import l.AbstractC1405a;
import l.C1406b;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a(\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¨\u0006\r"}, d2 = {"openUrl", "", "uri", "Landroid/net/Uri;", "action", "Lio/github/jan/supabase/auth/ExternalAuthAction;", "handleDeeplinks", "Lio/github/jan/supabase/SupabaseClient;", "intent", "Landroid/content/Intent;", "onSessionSuccess", "Lkotlin/Function1;", "Lio/github/jan/supabase/auth/user/UserSession;", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowType.values().length];
            try {
                iArr[FlowType.IMPLICIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowType.PKCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.auth.AndroidKt$handleDeeplinks$4", f = "Android.kt", l = {52}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.AndroidKt$handleDeeplinks$4, reason: invalid class name */
    public static final class AnonymousClass4 extends j implements n {
        final /* synthetic */ String $code;
        final /* synthetic */ k $onSessionSuccess;
        final /* synthetic */ SupabaseClient $this_handleDeeplinks;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(SupabaseClient supabaseClient, String str, k kVar, S3.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
            this.$this_handleDeeplinks = supabaseClient;
            this.$code = str;
            this.$onSessionSuccess = kVar;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            return new AnonymousClass4(this.$this_handleDeeplinks, this.$code, this.$onSessionSuccess, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((AnonymousClass4) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AnonymousClass4 anonymousClass4;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                Auth auth = AuthKt.getAuth(this.$this_handleDeeplinks);
                String str = this.$code;
                this.label = 1;
                anonymousClass4 = this;
                if (Auth.exchangeCodeForSession$default(auth, str, false, anonymousClass4, 2, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                anonymousClass4 = this;
            }
            k kVar = anonymousClass4.$onSessionSuccess;
            UserSession userSessionCurrentSessionOrNull = AuthKt.getAuth(anonymousClass4.$this_handleDeeplinks).currentSessionOrNull();
            if (userSessionCurrentSessionOrNull == null) {
                throw new IllegalStateException("No session available");
            }
            kVar.invoke(userSessionCurrentSessionOrNull);
            return C.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void handleDeeplinks(SupabaseClient supabaseClient, Intent intent, k kVar) {
        String scheme;
        String host;
        String queryParameter;
        l.f("<this>", supabaseClient);
        l.f("intent", intent);
        l.f("onSessionSuccess", kVar);
        Uri data = intent.getData();
        if (data == null || (scheme = data.getScheme()) == null || (host = data.getHost()) == null || !scheme.equals(((AuthConfig) AuthKt.getAuth(supabaseClient).getConfig()).getScheme()) || !host.equals(((AuthConfig) AuthKt.getAuth(supabaseClient).getConfig()).getHost())) {
            return;
        }
        int i7 = WhenMappings.$EnumSwitchMapping$0[((AuthConfig) AuthKt.getAuth(supabaseClient).getConfig()).getFlowType().ordinal()];
        if (i7 == 1) {
            String fragment = data.getFragment();
            if (fragment == null) {
                return;
            }
            UrlUtilsKt.parseFragmentAndImportSession(AuthKt.getAuth(supabaseClient), fragment, new a(0, kVar));
            return;
        }
        if (i7 != 2) {
            throw new D6.r();
        }
        if (UrlUtilsKt.handledUrlParameterError(AuthKt.getAuth(supabaseClient), new A3.d(8, data)) || (queryParameter = data.getQueryParameter("code")) == null) {
            return;
        }
        Auth auth = AuthKt.getAuth(supabaseClient);
        l.d("null cannot be cast to non-null type io.github.jan.supabase.auth.AuthImpl", auth);
        D.x(((AuthImpl) auth).getAuthScope(), null, new AnonymousClass4(supabaseClient, queryParameter, kVar, null), 3);
    }

    public static /* synthetic */ void handleDeeplinks$default(SupabaseClient supabaseClient, Intent intent, k kVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new c(1);
        }
        handleDeeplinks(supabaseClient, intent, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C handleDeeplinks$lambda$0(UserSession userSession) {
        l.f("it", userSession);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C handleDeeplinks$lambda$1(k kVar, UserSession userSession) {
        if (userSession != null) {
            kVar.invoke(userSession);
        }
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleDeeplinks$lambda$2(Uri uri, String str) {
        l.f("it", str);
        return uri.getQueryParameter(str);
    }

    public static final void openUrl(Uri uri, ExternalAuthAction externalAuthAction) {
        l.f("uri", uri);
        l.f("action", externalAuthAction);
        if (externalAuthAction.equals(ExternalAuthAction.ExternalBrowser.INSTANCE)) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(268435456);
            SetupPlatformKt.applicationContext().startActivity(intent);
            return;
        }
        if (!(externalAuthAction instanceof ExternalAuthAction.CustomTabs)) {
            throw new D6.r();
        }
        C1406b c1406b = new C1406b();
        ((ExternalAuthAction.CustomTabs) externalAuthAction).getIntentBuilder().invoke(c1406b);
        Intent intent2 = c1406b.a;
        if (!intent2.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent2.putExtras(bundle);
        }
        intent2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", c1406b.f12725d);
        c1406b.f12723b.getClass();
        intent2.putExtras(new Bundle());
        intent2.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i7 = Build.VERSION.SDK_INT;
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent2.hasExtra("com.android.browser.headers") ? intent2.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent2.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i7 >= 34) {
            if (c1406b.f12724c == null) {
                c1406b.f12724c = ActivityOptions.makeBasic();
            }
            AbstractC0739a.f(c1406b.f12724c);
        }
        if (i7 >= 36) {
            if (c1406b.f12724c == null) {
                c1406b.f12724c = ActivityOptions.makeBasic();
            }
            AbstractC1405a.a(c1406b.f12724c, !intent2.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = c1406b.f12724c;
        Bundle bundle2 = activityOptions != null ? activityOptions.toBundle() : null;
        intent2.setFlags(268435456);
        Context contextApplicationContext = SetupPlatformKt.applicationContext();
        intent2.setData(uri);
        contextApplicationContext.startActivity(intent2, bundle2);
    }
}
