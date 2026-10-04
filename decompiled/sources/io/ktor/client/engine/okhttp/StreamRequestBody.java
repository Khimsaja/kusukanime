package io.ktor.client.engine.okhttp;

import e4.InterfaceC0821a;
import f6.AbstractC0893G;
import f6.C0925w;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.BlockingKt;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import q0.c;
import w6.AbstractC2217b;
import w6.C2220e;
import w6.InterfaceC2225j;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/client/engine/okhttp/StreamRequestBody;", "Lf6/G;", "", "contentLength", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "block", "<init>", "(Ljava/lang/Long;Le4/a;)V", "Lf6/w;", "contentType", "()Lf6/w;", "Lw6/j;", "sink", "LO3/C;", "writeTo", "(Lw6/j;)V", "()J", "", "isOneShot", "()Z", "Ljava/lang/Long;", "Le4/a;", "ktor-client-okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StreamRequestBody extends AbstractC0893G {
    private final InterfaceC0821a block;
    private final Long contentLength;

    public StreamRequestBody(Long l7, InterfaceC0821a interfaceC0821a) {
        l.f("block", interfaceC0821a);
        this.contentLength = l7;
        this.block = interfaceC0821a;
    }

    @Override // f6.AbstractC0893G
    public long contentLength() {
        Long l7 = this.contentLength;
        if (l7 != null) {
            return l7.longValue();
        }
        return -1L;
    }

    @Override // f6.AbstractC0893G
    public C0925w contentType() {
        return null;
    }

    @Override // f6.AbstractC0893G
    public boolean isOneShot() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // f6.AbstractC0893G
    public void writeTo(InterfaceC2225j sink) throws IOException {
        ?? r7;
        l.f("sink", sink);
        try {
            Long th = null;
            C2220e c2220eH = AbstractC2217b.h(BlockingKt.toInputStream$default((ByteReadChannel) this.block.invoke(), null, 1, null));
            try {
                Long lValueOf = Long.valueOf(sink.l(c2220eH));
                try {
                    c2220eH.close();
                } catch (Throwable th2) {
                    th = th2;
                }
                Long l7 = th;
                th = lValueOf;
                r7 = l7;
            } catch (Throwable th3) {
                try {
                    c2220eH.close();
                    r7 = th3;
                } catch (Throwable th4) {
                    c.j(th3, th4);
                    r7 = th3;
                }
            }
            if (r7 != 0) {
                throw r7;
            }
            th.getClass();
        } catch (IOException e7) {
            throw e7;
        } catch (Throwable th5) {
            throw new StreamAdapterIOException(th5);
        }
    }
}
