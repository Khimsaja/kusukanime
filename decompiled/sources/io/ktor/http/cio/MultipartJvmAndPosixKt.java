package io.ktor.http.cio;

import H5.A;
import H5.D;
import O3.C;
import P3.r;
import S3.c;
import S3.i;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "LO3/C;", "discardBlocking", "(Lio/ktor/utils/io/ByteReadChannel;)V", "ktor-http-cio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultipartJvmAndPosixKt {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "", "<anonymous>", "(LH5/A;)J"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.http.cio.MultipartJvmAndPosixKt$discardBlocking$1", f = "MultipartJvmAndPosix.kt", l = {12}, m = "invokeSuspend")
    /* renamed from: io.ktor.http.cio.MultipartJvmAndPosixKt$discardBlocking$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ ByteReadChannel $this_discardBlocking;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ByteReadChannel byteReadChannel, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_discardBlocking = byteReadChannel;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$this_discardBlocking, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super Long> cVar) {
            return ((AnonymousClass1) create(a, cVar)).invokeSuspend(C.a);
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
            ByteReadChannel byteReadChannel = this.$this_discardBlocking;
            this.label = 1;
            Object objDiscard$default = ByteReadChannelOperationsKt.discard$default(byteReadChannel, 0L, this, 1, null);
            return objDiscard$default == aVar ? aVar : objDiscard$default;
        }
    }

    public static final void discardBlocking(ByteReadChannel byteReadChannel) {
        l.f("<this>", byteReadChannel);
        D.B(i.f8767k, new AnonymousClass1(byteReadChannel, null));
    }
}
