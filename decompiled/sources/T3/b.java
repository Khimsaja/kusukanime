package T3;

import P3.r;
import U3.h;
import e4.k;
import io.ktor.utils.io.ByteWriteChannelOperationsKt$NO_CALLBACK$1;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: k, reason: collision with root package name */
    public int f9052k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f9053l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ByteWriteChannelOperationsKt$NO_CALLBACK$1 byteWriteChannelOperationsKt$NO_CALLBACK$1, k kVar) {
        super(byteWriteChannelOperationsKt$NO_CALLBACK$1);
        this.f9053l = kVar;
        l.d("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>", byteWriteChannelOperationsKt$NO_CALLBACK$1);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i7 = this.f9052k;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f9052k = 2;
            r.Y(obj);
            return obj;
        }
        this.f9052k = 1;
        r.Y(obj);
        k kVar = this.f9053l;
        B.e(1, kVar);
        return kVar.invoke(this);
    }
}
