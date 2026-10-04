package io.github.jan.supabase.auth;

import F.w;
import H5.AbstractC0281w;
import H5.D;
import O3.C;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lio/github/jan/supabase/auth/SettingsCodeVerifierCache;", "Lio/github/jan/supabase/auth/CodeVerifierCache;", "settings", "Lcom/russhwolf/settings/Settings;", "key", "", "<init>", "(Lcom/russhwolf/settings/Settings;Ljava/lang/String;)V", "checkForOldCodeVerifier", "", "suspendSettings", "Lcom/russhwolf/settings/coroutines/SuspendSettings;", "saveCodeVerifier", "codeVerifier", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCodeVerifier", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCodeVerifier", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsCodeVerifierCache implements CodeVerifierCache {
    public static final String SETTINGS_KEY = "supabase_code_verifier";
    private final String key;
    private final E3.a settings;
    private final F3.b suspendSettings;

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsCodeVerifierCache() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final void checkForOldCodeVerifier() {
        if (l.a(this.key, SETTINGS_KEY)) {
            return;
        }
        String strC = ((E3.b) this.settings).c(SETTINGS_KEY);
        String strC2 = ((E3.b) this.settings).c(this.key);
        if (strC == null || strC2 != null) {
            return;
        }
        ((E3.b) this.settings).l(this.key, strC);
        ((E3.b) this.settings).m(SETTINGS_KEY);
    }

    @Override // io.github.jan.supabase.auth.CodeVerifierCache
    public Object deleteCodeVerifier(S3.c<? super C> cVar) {
        Object objK = ((w) this.suspendSettings).K(this.key, cVar);
        return objK == T3.a.f9048k ? objK : C.a;
    }

    @Override // io.github.jan.supabase.auth.CodeVerifierCache
    public Object loadCodeVerifier(S3.c<? super String> cVar) {
        F3.b bVar = this.suspendSettings;
        String str = this.key;
        w wVar = (w) bVar;
        wVar.getClass();
        return D.G((AbstractC0281w) wVar.f2038m, new F3.c(wVar, str, null), cVar);
    }

    @Override // io.github.jan.supabase.auth.CodeVerifierCache
    public Object saveCodeVerifier(String str, S3.c<? super C> cVar) {
        Object objI = ((w) this.suspendSettings).I(this.key, str, cVar);
        return objI == T3.a.f9048k ? objI : C.a;
    }

    public SettingsCodeVerifierCache(E3.a aVar, String str) {
        l.f("settings", aVar);
        l.f("key", str);
        this.settings = aVar;
        this.key = str;
        checkForOldCodeVerifier();
        this.suspendSettings = AbstractC1420H.P(aVar);
    }

    public /* synthetic */ SettingsCodeVerifierCache(E3.a aVar, String str, int i7, f fVar) {
        this((i7 & 1) != 0 ? SettingsUtilKt.createDefaultSettings() : aVar, (i7 & 2) != 0 ? SETTINGS_KEY : str);
    }
}
