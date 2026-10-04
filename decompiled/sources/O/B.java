package O;

import H5.C0270k;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class B implements Choreographer.FrameCallback {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6943k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0270k f6944l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e4.k f6945m;

    public B(C0270k c0270k, C0497i0 c0497i0, e4.k kVar) {
        this.f6944l = c0270k;
        this.f6945m = kVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        Object objR;
        Object objR2;
        C0270k c0270k = this.f6944l;
        e4.k kVar = this.f6945m;
        switch (this.f6943k) {
            case 0:
                C c2 = C.f6956k;
                try {
                    objR2 = kVar.invoke(Long.valueOf(j7));
                } catch (Throwable th) {
                    objR2 = P3.r.r(th);
                }
                c0270k.resumeWith(objR2);
                break;
            default:
                try {
                    objR = kVar.invoke(Long.valueOf(j7));
                } catch (Throwable th2) {
                    objR = P3.r.r(th2);
                }
                c0270k.resumeWith(objR);
                break;
        }
    }

    public B(C0270k c0270k, e4.k kVar) {
        this.f6944l = c0270k;
        this.f6945m = kVar;
    }
}
