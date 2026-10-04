package io.github.jan.supabase.auth;

import H5.A;
import H5.D;
import H5.M;
import M5.m;
import O3.C;
import P3.r;
import U3.j;
import android.content.Context;
import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.InterfaceC0679f;
import androidx.lifecycle.InterfaceC0694v;
import androidx.lifecycle.x;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.logging.SupabaseLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"appContext", "Landroid/content/Context;", "applicationContext", "setupPlatform", "", "Lio/github/jan/supabase/auth/Auth;", "addLifecycleCallbacks", "gotrue", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SetupPlatformKt {
    private static Context appContext;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.auth.SetupPlatformKt$addLifecycleCallbacks$1", f = "setupPlatform.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.SetupPlatformKt$addLifecycleCallbacks$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ Auth $gotrue;
        final /* synthetic */ AbstractC0690q $lifecycle;
        final /* synthetic */ A $scope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC0690q abstractC0690q, Auth auth, A a, S3.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$lifecycle = abstractC0690q;
            this.$gotrue = auth;
            this.$scope = a;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            return new AnonymousClass1(this.$lifecycle, this.$gotrue, this.$scope, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((AnonymousClass1) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            AbstractC0690q abstractC0690q = this.$lifecycle;
            final Auth auth = this.$gotrue;
            final A a = this.$scope;
            abstractC0690q.a(new InterfaceC0679f() { // from class: io.github.jan.supabase.auth.SetupPlatformKt.addLifecycleCallbacks.1.1
                @Override // androidx.lifecycle.InterfaceC0679f
                public /* bridge */ void onCreate(InterfaceC0694v interfaceC0694v) {
                    super.onCreate(interfaceC0694v);
                }

                @Override // androidx.lifecycle.InterfaceC0679f
                public /* bridge */ void onDestroy(InterfaceC0694v interfaceC0694v) {
                    super.onDestroy(interfaceC0694v);
                }

                @Override // androidx.lifecycle.InterfaceC0679f
                public /* bridge */ void onPause(InterfaceC0694v interfaceC0694v) {
                    super.onPause(interfaceC0694v);
                }

                @Override // androidx.lifecycle.InterfaceC0679f
                public /* bridge */ void onResume(InterfaceC0694v interfaceC0694v) {
                    super.onResume(interfaceC0694v);
                }

                @Override // androidx.lifecycle.InterfaceC0679f
                public void onStart(InterfaceC0694v interfaceC0694v) {
                    l.f("owner", interfaceC0694v);
                    if (((AuthImpl) auth).isAutoRefreshRunning() || !((AuthImpl) auth).getConfig().getAlwaysAutoRefresh()) {
                        return;
                    }
                    SupabaseLogger logger = Auth.INSTANCE.getLogger();
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogLevel level = logger.getLevel();
                    if (level == null) {
                        level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
                    }
                    if (logLevel.compareTo(level) >= 0) {
                        logger.log(logLevel, (Throwable) null, "Trying to re-load session from storage...");
                    }
                    D.x(a, null, new SetupPlatformKt$addLifecycleCallbacks$1$1$onStart$2(auth, null), 3);
                }

                @Override // androidx.lifecycle.InterfaceC0679f
                public void onStop(InterfaceC0694v interfaceC0694v) {
                    l.f("owner", interfaceC0694v);
                    if (((AuthImpl) auth).isAutoRefreshRunning()) {
                        SupabaseLogger logger = Auth.INSTANCE.getLogger();
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogLevel level = logger.getLevel();
                        if (level == null) {
                            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
                        }
                        if (logLevel.compareTo(level) >= 0) {
                            logger.log(logLevel, (Throwable) null, "Cancelling auto refresh because app is switching to the background");
                        }
                        D.x(a, null, new SetupPlatformKt$addLifecycleCallbacks$1$1$onStop$2(auth, null), 3);
                    }
                }
            });
            return C.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void addLifecycleCallbacks(Auth auth) {
        if (((AuthConfig) auth.getConfig()).getEnableLifecycleCallbacks()) {
            x xVar = androidx.lifecycle.C.f10696s.f10702p;
            A authScope = ((AuthImpl) auth).getAuthScope();
            O5.e eVar = M.a;
            D.x(authScope, m.a, new AnonymousClass1(xVar, auth, authScope, null), 2);
        }
    }

    public static final Context applicationContext() {
        Context context = appContext;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Application context not initialized");
    }

    @SupabaseInternal
    public static final void setupPlatform(Auth auth) {
        l.f("<this>", auth);
        addLifecycleCallbacks(auth);
    }
}
