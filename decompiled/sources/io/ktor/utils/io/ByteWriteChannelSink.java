package io.ktor.utils.io;

import H5.A;
import H5.D;
import O3.C;
import P3.r;
import S3.c;
import S3.i;
import S5.e;
import U3.j;
import e4.n;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannelSink;", "LS5/e;", "Lio/ktor/utils/io/ByteWriteChannel;", "origin", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "LS5/a;", "source", "", "byteCount", "LO3/C;", "write", "(LS5/a;J)V", "flush", "()V", "close", "Lio/ktor/utils/io/ByteWriteChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteWriteChannelSink implements e {
    private final ByteWriteChannel origin;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @U3.e(c = "io.ktor.utils.io.ByteWriteChannelSink$close$1", f = "ByteWriteChannelSink.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: io.ktor.utils.io.ByteWriteChannelSink$close$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            return ByteWriteChannelSink.this.new AnonymousClass1(cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super C> cVar) {
            return ((AnonymousClass1) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(ByteWriteChannelSink.this.origin);
                ByteWriteChannel byteWriteChannel = ByteWriteChannelSink.this.origin;
                this.label = 1;
                if (byteWriteChannel.flushAndClose(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            return C.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @U3.e(c = "io.ktor.utils.io.ByteWriteChannelSink$flush$1", f = "ByteWriteChannelSink.kt", l = {40}, m = "invokeSuspend")
    /* renamed from: io.ktor.utils.io.ByteWriteChannelSink$flush$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12801 extends j implements n {
        int label;

        public C12801(c<? super C12801> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            return ByteWriteChannelSink.this.new C12801(cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super C> cVar) {
            return ((C12801) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(ByteWriteChannelSink.this.origin);
                ByteWriteChannel byteWriteChannel = ByteWriteChannelSink.this.origin;
                this.label = 1;
                if (byteWriteChannel.flush(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            return C.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @U3.e(c = "io.ktor.utils.io.ByteWriteChannelSink$write$1", f = "ByteWriteChannelSink.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.ktor.utils.io.ByteWriteChannelSink$write$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12811 extends j implements n {
        int label;

        public C12811(c<? super C12811> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            return ByteWriteChannelSink.this.new C12811(cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super C> cVar) {
            return ((C12811) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            ByteWriteChannelSink.this.flush();
            return C.a;
        }
    }

    public ByteWriteChannelSink(ByteWriteChannel byteWriteChannel) {
        l.f("origin", byteWriteChannel);
        this.origin = byteWriteChannel;
    }

    @Override // S5.e
    public void close() throws Throwable {
        D.B(i.f8767k, new AnonymousClass1(null));
    }

    @Override // S5.e, java.io.Flushable
    public void flush() throws Throwable {
        D.B(i.f8767k, new C12801(null));
    }

    @Override // S5.e
    public void write(S5.a source, long byteCount) throws Throwable {
        l.f("source", source);
        ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(this.origin);
        this.origin.getWriteBuffer().write(source, byteCount);
        ByteWriteChannel byteWriteChannel = this.origin;
        ByteChannel byteChannel = byteWriteChannel instanceof ByteChannel ? (ByteChannel) byteWriteChannel : null;
        if ((byteChannel == null || !byteChannel.getAutoFlush()) && BytePacketBuilderKt.getSize(this.origin.getWriteBuffer()) < 1048576) {
            return;
        }
        D.B(i.f8767k, new C12811(null));
    }
}
