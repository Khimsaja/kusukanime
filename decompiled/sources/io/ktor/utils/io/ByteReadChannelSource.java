package io.ktor.utils.io;

import H5.A;
import H5.D;
import O3.C;
import P3.r;
import S3.c;
import S3.i;
import S5.f;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/utils/io/ByteReadChannelSource;", "LS5/f;", "Lio/ktor/utils/io/ByteReadChannel;", "origin", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "LS5/a;", "sink", "", "byteCount", "readAtMostTo", "(LS5/a;J)J", "LO3/C;", "close", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteReadChannelSource implements f {
    private final ByteReadChannel origin;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "", "<anonymous>", "(LH5/A;)Z"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.utils.io.ByteReadChannelSource$readAtMostTo$1", f = "ByteReadChannelSource.kt", l = {29}, m = "invokeSuspend")
    /* renamed from: io.ktor.utils.io.ByteReadChannelSource$readAtMostTo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            return ByteReadChannelSource.this.new AnonymousClass1(cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super Boolean> cVar) {
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
            ByteReadChannel byteReadChannel = ByteReadChannelSource.this.origin;
            this.label = 1;
            Object objAwaitContent$default = ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, this, 1, null);
            return objAwaitContent$default == aVar ? aVar : objAwaitContent$default;
        }
    }

    public ByteReadChannelSource(ByteReadChannel byteReadChannel) {
        l.f("origin", byteReadChannel);
        this.origin = byteReadChannel;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        ByteReadChannelKt.cancel(this.origin);
    }

    @Override // S5.f
    public long readAtMostTo(S5.a sink, long byteCount) throws Throwable {
        l.f("sink", sink);
        if (this.origin.getReadBuffer().z()) {
            D.B(i.f8767k, new AnonymousClass1(null));
        }
        if (this.origin.getReadBuffer().z()) {
            return -1L;
        }
        return this.origin.getReadBuffer().readAtMostTo(sink, byteCount);
    }
}
