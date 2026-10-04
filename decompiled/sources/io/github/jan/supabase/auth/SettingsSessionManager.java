package io.github.jan.supabase.auth;

import F.w;
import O3.C;
import io.github.jan.supabase.auth.user.UserSession;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/auth/SettingsSessionManager;", "Lio/github/jan/supabase/auth/SessionManager;", "settings", "Lcom/russhwolf/settings/Settings;", "key", "", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/russhwolf/settings/Settings;Ljava/lang/String;Lkotlinx/serialization/json/Json;)V", "checkForOldSession", "", "suspendSettings", "Lcom/russhwolf/settings/coroutines/SuspendSettings;", "saveSession", SettingsSessionManager.SETTINGS_KEY, "Lio/github/jan/supabase/auth/user/UserSession;", "(Lio/github/jan/supabase/auth/user/UserSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSession", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsSessionManager implements SessionManager {
    public static final String SETTINGS_KEY = "session";
    private final a6.d json;
    private final String key;
    private final E3.a settings;
    private final F3.b suspendSettings;

    @U3.e(c = "io.github.jan.supabase.auth.SettingsSessionManager", f = "SettingsSessionManager.kt", l = {54}, m = "loadSession", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.SettingsSessionManager$loadSession$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SettingsSessionManager.this.loadSession(this);
        }
    }

    public SettingsSessionManager() {
        this(null, null, null, 7, null);
    }

    private final void checkForOldSession() {
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

    @Override // io.github.jan.supabase.auth.SessionManager
    public Object deleteSession(S3.c<? super C> cVar) {
        Object objK = ((w) this.suspendSettings).K(this.key, cVar);
        return objK == T3.a.f9048k ? objK : C.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.SessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadSession(S3.c<? super io.github.jan.supabase.auth.user.UserSession> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.github.jan.supabase.auth.SettingsSessionManager.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.github.jan.supabase.auth.SettingsSessionManager$loadSession$1 r0 = (io.github.jan.supabase.auth.SettingsSessionManager.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.auth.SettingsSessionManager$loadSession$1 r0 = new io.github.jan.supabase.auth.SettingsSessionManager$loadSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            P3.r.Y(r6)
            goto L4e
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            P3.r.Y(r6)
            F3.b r6 = r5.suspendSettings
            java.lang.String r2 = r5.key
            r0.label = r4
            F.w r6 = (F.w) r6
            r6.getClass()
            F3.c r4 = new F3.c
            r4.<init>(r6, r2, r3)
            java.lang.Object r6 = r6.f2038m
            H5.w r6 = (H5.AbstractC0281w) r6
            java.lang.Object r6 = H5.D.G(r6, r4, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L53
            goto L92
        L53:
            a6.d r1 = r5.json     // Catch: java.lang.Exception -> L6b
            r1.getClass()     // Catch: java.lang.Exception -> L6b
            io.github.jan.supabase.auth.user.UserSession$Companion r2 = io.github.jan.supabase.auth.user.UserSession.INSTANCE     // Catch: java.lang.Exception -> L6b
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch: java.lang.Exception -> L6b
            kotlinx.serialization.KSerializer r2 = n6.m.K(r2)     // Catch: java.lang.Exception -> L6b
            kotlinx.serialization.KSerializer r2 = (kotlinx.serialization.KSerializer) r2     // Catch: java.lang.Exception -> L6b
            java.lang.Object r6 = r1.b(r6, r2)     // Catch: java.lang.Exception -> L6b
            io.github.jan.supabase.auth.user.UserSession r6 = (io.github.jan.supabase.auth.user.UserSession) r6     // Catch: java.lang.Exception -> L6b
            return r6
        L6b:
            r6 = move-exception
            S3.h r0 = r0.getContext()
            H5.D.m(r0)
            io.github.jan.supabase.auth.Auth$Companion r0 = io.github.jan.supabase.auth.Auth.INSTANCE
            io.github.jan.supabase.logging.SupabaseLogger r0 = r0.getLogger()
            io.github.jan.supabase.logging.LogLevel r1 = io.github.jan.supabase.logging.LogLevel.ERROR
            io.github.jan.supabase.logging.LogLevel r2 = r0.getLevel()
            if (r2 != 0) goto L87
            io.github.jan.supabase.SupabaseClient$Companion r2 = io.github.jan.supabase.SupabaseClient.INSTANCE
            io.github.jan.supabase.logging.LogLevel r2 = r2.getDEFAULT_LOG_LEVEL()
        L87:
            int r2 = r1.compareTo(r2)
            if (r2 < 0) goto L92
            java.lang.String r2 = "Failed to load session"
            r0.log(r1, r6, r2)
        L92:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.SettingsSessionManager.loadSession(S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.auth.SessionManager
    public Object saveSession(UserSession userSession, S3.c<? super C> cVar) {
        F3.b bVar = this.suspendSettings;
        String str = this.key;
        a6.d dVar = this.json;
        dVar.getClass();
        Object objI = ((w) bVar).I(str, dVar.d(UserSession.INSTANCE.serializer(), userSession), cVar);
        return objI == T3.a.f9048k ? objI : C.a;
    }

    public SettingsSessionManager(E3.a aVar, String str, a6.d dVar) {
        l.f("settings", aVar);
        l.f("key", str);
        l.f("json", dVar);
        this.settings = aVar;
        this.key = str;
        this.json = dVar;
        checkForOldSession();
        this.suspendSettings = AbstractC1420H.P(aVar);
    }

    public /* synthetic */ SettingsSessionManager(E3.a aVar, String str, a6.d dVar, int i7, f fVar) {
        this((i7 & 1) != 0 ? SettingsUtilKt.createDefaultSettings() : aVar, (i7 & 2) != 0 ? SETTINGS_KEY : str, (i7 & 4) != 0 ? SettingsSessionManagerKt.settingsJson : dVar);
    }
}
