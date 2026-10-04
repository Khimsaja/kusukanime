package T3;

import P3.r;
import S3.h;
import e4.n;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public int f9059k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f9060l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S3.c f9061m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(S3.c cVar, h hVar, n nVar, S3.c cVar2) {
        super(cVar, hVar);
        this.f9060l = nVar;
        this.f9061m = cVar2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i7 = this.f9059k;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f9059k = 2;
            r.Y(obj);
            return obj;
        }
        this.f9059k = 1;
        r.Y(obj);
        n nVar = this.f9060l;
        l.d("null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>", nVar);
        B.e(2, nVar);
        return nVar.invoke(this.f9061m, this);
    }
}
