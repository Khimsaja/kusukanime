package L5;

import io.ktor.util.GzipHeaderFlags;
import java.util.concurrent.CancellationException;
import s0.AbstractC1971p;

/* loaded from: classes.dex */
public final class o extends CancellationException {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6190k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, int i7) {
        super(str);
        this.f6190k = i7;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f6190k) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 1:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 2:
                setStackTrace(a0.a.f10380e);
                break;
            case 3:
                setStackTrace(new StackTraceElement[0]);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(AbstractC1971p.f15468b);
                break;
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o() {
        super("The coroutine scope left the composition");
        this.f6190k = 1;
    }
}
