package H5;

/* loaded from: classes.dex */
public final class B0 extends AbstractC0281w {

    /* renamed from: l, reason: collision with root package name */
    public static final B0 f3795l = new B0();

    @Override // H5.AbstractC0281w
    public final void W(S3.h hVar, Runnable runnable) {
        F0 f02 = (F0) hVar.get(F0.f3809l);
        if (f02 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        f02.f3810k = true;
    }

    @Override // H5.AbstractC0281w
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
