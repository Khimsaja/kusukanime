package J5;

import H5.AbstractC0254a;
import H5.g0;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class j extends AbstractC0254a implements i {

    /* renamed from: n, reason: collision with root package name */
    public final e f4337n;

    public j(S3.h hVar, e eVar, boolean z7, boolean z8) {
        super(hVar, z7, z8);
        this.f4337n = eVar;
    }

    @Override // J5.u
    public final Object a() {
        return this.f4337n.a();
    }

    @Override // J5.v
    public boolean close(Throwable th) {
        return this.f4337n.g(th, false);
    }

    @Override // H5.n0, H5.InterfaceC0265f0
    public final void e(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new g0(p(), null, this);
        }
        n(cancellationException);
    }

    @Override // J5.v
    public final void invokeOnClose(e4.k kVar) {
        this.f4337n.invokeOnClose(kVar);
    }

    @Override // J5.v
    public final boolean isClosedForSend() {
        return this.f4337n.isClosedForSend();
    }

    @Override // J5.u
    public final d iterator() {
        e eVar = this.f4337n;
        eVar.getClass();
        return new d(eVar);
    }

    @Override // H5.n0
    public final void n(CancellationException cancellationException) {
        this.f4337n.g(cancellationException, true);
        l(cancellationException);
    }

    @Override // J5.u
    public final Object receive(S3.c cVar) {
        return this.f4337n.receive(cVar);
    }

    @Override // J5.v
    public Object send(Object obj, S3.c cVar) {
        return this.f4337n.send(obj, cVar);
    }

    @Override // J5.v
    /* renamed from: trySend-JP2dKIU */
    public Object mo2trySendJP2dKIU(Object obj) {
        return this.f4337n.mo2trySendJP2dKIU(obj);
    }
}
