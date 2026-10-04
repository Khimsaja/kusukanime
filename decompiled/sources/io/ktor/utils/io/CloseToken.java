package io.ktor.utils.io;

import H5.D;
import H5.InterfaceC0279u;
import O3.C;
import e4.k;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\b\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/utils/io/CloseToken;", "", "", "origin", "<init>", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "wrap", "wrapCause", "(Le4/k;)Ljava/lang/Throwable;", "LO3/C;", "throwOrNull", "(Le4/k;)LO3/C;", "Ljava/lang/Throwable;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CloseToken {
    private final Throwable origin;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.CloseToken$wrapCause$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends j implements k {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, ClosedByteChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
        }

        @Override // e4.k
        public final ClosedByteChannelException invoke(Throwable th) {
            return new ClosedByteChannelException(th);
        }
    }

    public CloseToken(Throwable th) {
        this.origin = th;
    }

    public static /* synthetic */ Throwable wrapCause$default(CloseToken closeToken, k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            kVar = AnonymousClass1.INSTANCE;
        }
        return closeToken.wrapCause(kVar);
    }

    public final C throwOrNull(k wrap) throws Throwable {
        l.f("wrap", wrap);
        Throwable thWrapCause = wrapCause(wrap);
        if (thWrapCause == null) {
            return null;
        }
        throw thWrapCause;
    }

    public final Throwable wrapCause(k wrap) {
        l.f("wrap", wrap);
        Object obj = this.origin;
        if (obj == null) {
            return null;
        }
        return obj instanceof InterfaceC0279u ? ((InterfaceC0279u) obj).createCopy() : obj instanceof CancellationException ? D.a(((CancellationException) obj).getMessage(), this.origin) : (Throwable) wrap.invoke(obj);
    }
}
