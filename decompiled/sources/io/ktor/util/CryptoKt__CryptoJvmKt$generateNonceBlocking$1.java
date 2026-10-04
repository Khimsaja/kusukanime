package io.ktor.util;

import H5.A;
import J5.i;
import O3.C;
import P3.r;
import U3.e;
import U3.j;
import e4.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "", "<anonymous>", "(LH5/A;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.util.CryptoKt__CryptoJvmKt$generateNonceBlocking$1", f = "CryptoJvm.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CryptoKt__CryptoJvmKt$generateNonceBlocking$1 extends j implements n {
    int label;

    public CryptoKt__CryptoJvmKt$generateNonceBlocking$1(S3.c<? super CryptoKt__CryptoJvmKt$generateNonceBlocking$1> cVar) {
        super(2, cVar);
    }

    @Override // U3.a
    public final S3.c<C> create(Object obj, S3.c<?> cVar) {
        return new CryptoKt__CryptoJvmKt$generateNonceBlocking$1(cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, S3.c<? super String> cVar) {
        return ((CryptoKt__CryptoJvmKt$generateNonceBlocking$1) create(a, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            return obj;
        }
        r.Y(obj);
        i seedChannel = NonceKt.getSeedChannel();
        this.label = 1;
        Object objReceive = seedChannel.receive(this);
        return objReceive == aVar ? aVar : objReceive;
    }
}
