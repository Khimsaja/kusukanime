package E0;

import D.C0042b;
import F0.n;
import H5.D;
import H5.q0;
import H5.u0;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import h0.AbstractC0968M;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class f implements ScrollCaptureCallback {
    public final n a;

    /* renamed from: b, reason: collision with root package name */
    public final T0.i f1814b;

    /* renamed from: c, reason: collision with root package name */
    public final l f1815c;

    /* renamed from: d, reason: collision with root package name */
    public final M5.c f1816d;

    /* renamed from: e, reason: collision with root package name */
    public final j f1817e;

    public f(n nVar, T0.i iVar, M5.c cVar, l lVar) {
        this.a = nVar;
        this.f1814b = iVar;
        this.f1815c = lVar;
        this.f1816d = new M5.c(cVar.f6575k.plus(h.f1819k));
        this.f1817e = new j(iVar.a(), new e(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(E0.f r11, android.view.ScrollCaptureSession r12, T0.i r13, U3.c r14) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.f.a(E0.f, android.view.ScrollCaptureSession, T0.i, U3.c):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        D.x(this.f1816d, q0.f3877k, new a(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        u0 u0VarX = D.x(this.f1816d, null, new b(this, scrollCaptureSession, rect, consumer, null), 3);
        u0VarX.x(new C0042b(3, cancellationSignal));
        cancellationSignal.setOnCancelListener(new g(0, u0VarX));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(AbstractC0968M.t(this.f1814b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f1817e.f1824b = 0.0f;
        l lVar = this.f1815c;
        lVar.a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
