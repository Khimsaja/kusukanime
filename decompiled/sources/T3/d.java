package T3;

import P3.r;
import U3.h;
import e4.n;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d extends h {

    /* renamed from: k, reason: collision with root package name */
    public int f9056k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f9057l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S3.c f9058m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(S3.c cVar, S3.c cVar2, n nVar) {
        super(cVar);
        this.f9057l = nVar;
        this.f9058m = cVar2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i7 = this.f9056k;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f9056k = 2;
            r.Y(obj);
            return obj;
        }
        this.f9056k = 1;
        r.Y(obj);
        n nVar = this.f9057l;
        l.d("null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>", nVar);
        B.e(2, nVar);
        return nVar.invoke(this.f9058m, this);
    }
}
