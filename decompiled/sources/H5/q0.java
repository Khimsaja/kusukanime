package H5;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class q0 extends S3.a implements InterfaceC0265f0 {

    /* renamed from: k, reason: collision with root package name */
    public static final q0 f3877k = new q0(C0263e0.f3843k);

    @Override // H5.InterfaceC0265f0
    public final CancellationException H() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // H5.InterfaceC0265f0
    public final boolean J() {
        return false;
    }

    @Override // H5.InterfaceC0265f0
    public final N L(boolean z7, boolean z8, e4.k kVar) {
        return r0.f3878k;
    }

    @Override // H5.InterfaceC0265f0
    public final boolean b() {
        return true;
    }

    @Override // H5.InterfaceC0265f0
    public final InterfaceC0273n g(n0 n0Var) {
        return r0.f3878k;
    }

    @Override // H5.InterfaceC0265f0
    public final boolean isCancelled() {
        return false;
    }

    @Override // H5.InterfaceC0265f0
    public final Object m(S3.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // H5.InterfaceC0265f0
    public final y5.h s() {
        return y5.d.a;
    }

    @Override // H5.InterfaceC0265f0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // H5.InterfaceC0265f0
    public final N x(e4.k kVar) {
        return r0.f3878k;
    }

    @Override // H5.InterfaceC0265f0
    public final void e(CancellationException cancellationException) {
    }
}
