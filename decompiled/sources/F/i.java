package F;

import D.C0053g0;
import H.S;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import z0.S0;

/* loaded from: classes.dex */
public final class i {
    public static final i a = new i();

    public final void a(C0053g0 c0053g0, S s7, HandwritingGesture handwritingGesture, S0 s02, Executor executor, IntConsumer intConsumer, e4.k kVar) {
        int i7 = c0053g0 != null ? u.a.i(c0053g0, handwritingGesture, s7, s02, kVar) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new h(i7, 0, intConsumer));
        } else {
            intConsumer.accept(i7);
        }
    }

    public final boolean b(C0053g0 c0053g0, S s7, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (c0053g0 != null) {
            return u.a.A(c0053g0, previewableHandwritingGesture, s7, cancellationSignal);
        }
        return false;
    }
}
