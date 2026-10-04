package io.github.jan.supabase.auth;

import H5.A;
import O3.C;
import P3.r;
import U3.j;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.logging.SupabaseLogger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@U3.e(c = "io.github.jan.supabase.auth.SetupPlatformKt$addLifecycleCallbacks$1$1$onStart$2", f = "setupPlatform.kt", l = {45}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SetupPlatformKt$addLifecycleCallbacks$1$1$onStart$2 extends j implements n {
    final /* synthetic */ Auth $gotrue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupPlatformKt$addLifecycleCallbacks$1$1$onStart$2(Auth auth, S3.c<? super SetupPlatformKt$addLifecycleCallbacks$1$1$onStart$2> cVar) {
        super(2, cVar);
        this.$gotrue = auth;
    }

    @Override // U3.a
    public final S3.c<C> create(Object obj, S3.c<?> cVar) {
        return new SetupPlatformKt$addLifecycleCallbacks$1$1$onStart$2(this.$gotrue, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, S3.c<? super C> cVar) {
        return ((SetupPlatformKt$addLifecycleCallbacks$1$1$onStart$2) create(a, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 == 0) {
            r.Y(obj);
            Auth auth = this.$gotrue;
            this.label = 1;
            obj = Auth.loadFromStorage$default(auth, false, this, 1, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            SupabaseLogger logger = Auth.INSTANCE.getLogger();
            LogLevel logLevel = LogLevel.DEBUG;
            LogLevel level = logger.getLevel();
            if (level == null) {
                level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
            }
            if (logLevel.compareTo(level) >= 0) {
                logger.log(logLevel, (Throwable) null, "Session found, auto refresh started");
            }
        } else {
            SupabaseLogger logger2 = Auth.INSTANCE.getLogger();
            LogLevel logLevel2 = LogLevel.DEBUG;
            LogLevel level2 = logger2.getLevel();
            if (level2 == null) {
                level2 = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
            }
            if (logLevel2.compareTo(level2) >= 0) {
                logger2.log(logLevel2, (Throwable) null, "No session found, not starting auto refresh");
            }
        }
        return C.a;
    }
}
