package io.github.jan.supabase.auth;

import H5.A;
import O3.C;
import P3.r;
import U3.j;
import e4.n;
import io.github.jan.supabase.auth.status.SessionStatus;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@U3.e(c = "io.github.jan.supabase.auth.SetupPlatformKt$addLifecycleCallbacks$1$1$onStop$2", f = "setupPlatform.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SetupPlatformKt$addLifecycleCallbacks$1$1$onStop$2 extends j implements n {
    final /* synthetic */ Auth $gotrue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupPlatformKt$addLifecycleCallbacks$1$1$onStop$2(Auth auth, S3.c<? super SetupPlatformKt$addLifecycleCallbacks$1$1$onStop$2> cVar) {
        super(2, cVar);
        this.$gotrue = auth;
    }

    @Override // U3.a
    public final S3.c<C> create(Object obj, S3.c<?> cVar) {
        return new SetupPlatformKt$addLifecycleCallbacks$1$1$onStop$2(this.$gotrue, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, S3.c<? super C> cVar) {
        return ((SetupPlatformKt$addLifecycleCallbacks$1$1$onStop$2) create(a, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.Y(obj);
        ((AuthImpl) this.$gotrue).stopAutoRefreshForCurrentSession();
        ((AuthImpl) this.$gotrue).setSessionStatus(SessionStatus.Initializing.INSTANCE);
        return C.a;
    }
}
