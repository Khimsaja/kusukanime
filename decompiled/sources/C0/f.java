package C0;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final View f566b;

    public f(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.f566b = view;
    }

    public final AutofillId a(long j7) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionG = b.g(this.a);
        a aVarT = z1.c.t(this.f566b);
        Objects.requireNonNull(aVarT);
        return d.a(contentCaptureSessionG, B5.a.d(aVarT.a), j7);
    }
}
