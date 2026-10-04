package g1;

import D6.RunnableC0131z;
import android.os.Handler;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public CallableC0938f f11691k;

    /* renamed from: l, reason: collision with root package name */
    public C0937e f11692l;

    /* renamed from: m, reason: collision with root package name */
    public Handler f11693m;

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.f11691k.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f11693m.post(new RunnableC0131z(3, this.f11692l, objCall));
    }
}
