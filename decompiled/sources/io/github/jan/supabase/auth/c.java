package io.github.jan.supabase.auth;

import a6.h;
import e4.k;
import io.github.jan.supabase.auth.ExternalAuthAction;
import io.github.jan.supabase.auth.providers.ExternalAuthConfigDefaults;
import io.github.jan.supabase.auth.user.UserSession;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.GzipHeaderFlags;
import l.C1406b;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12066k;

    public /* synthetic */ c(int i7) {
        this.f12066k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12066k) {
            case 0:
                return AuthImpl$linkIdentity$fetchUrl$1.invokeSuspend$lambda$0((HttpRequestBuilder) obj);
            case 1:
                return AndroidKt.handleDeeplinks$lambda$0((UserSession) obj);
            case 2:
                return Auth.linkIdentity$lambda$0((ExternalAuthConfigDefaults) obj);
            case 3:
                return Auth.getOAuthUrl$lambda$0((ExternalAuthConfigDefaults) obj);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return ExternalAuthAction.CustomTabs._init_$lambda$0((C1406b) obj);
            case 5:
                return SettingsSessionManagerKt.settingsJson$lambda$0((h) obj);
            default:
                return UrlUtilsKt.parseFragmentAndImportSession$lambda$0((UserSession) obj);
        }
    }
}
