package E0;

import D.C0053g0;
import H.S;
import H0.H;
import H5.u0;
import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1818b;

    public /* synthetic */ g(int i7, Object obj) {
        this.a = i7;
        this.f1818b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.a) {
            case 0:
                ((u0) this.f1818b).e(null);
                break;
            default:
                S s7 = (S) this.f1818b;
                if (s7 != null) {
                    C0053g0 c0053g0 = s7.f2915d;
                    if (c0053g0 != null) {
                        c0053g0.e(H.f3091b);
                    }
                    C0053g0 c0053g02 = s7.f2915d;
                    if (c0053g02 != null) {
                        c0053g02.f(H.f3091b);
                        break;
                    }
                }
                break;
        }
    }
}
