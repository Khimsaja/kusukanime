package R5;

import F2.G;
import H5.C0270k;
import H5.E0;
import H5.InterfaceC0269j;
import H5.J;
import M5.q;
import O3.C;
import e4.o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class b implements InterfaceC0269j, E0 {

    /* renamed from: k, reason: collision with root package name */
    public final C0270k f8662k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f8663l;

    public b(c cVar, C0270k c0270k) {
        this.f8663l = cVar;
        this.f8662k = c0270k;
    }

    @Override // H5.E0
    public final void a(q qVar, int i7) {
        this.f8662k.a(qVar, i7);
    }

    @Override // H5.InterfaceC0269j
    public final G c(Object obj, o oVar) {
        c cVar = this.f8663l;
        B3.d dVar = new B3.d(1, cVar, this);
        G gC = this.f8662k.C((C) obj, dVar);
        if (gC != null) {
            c.f8664h.set(cVar, null);
        }
        return gC;
    }

    @Override // H5.InterfaceC0269j
    public final boolean cancel(Throwable th) {
        return this.f8662k.cancel(th);
    }

    @Override // S3.c
    public final S3.h getContext() {
        return this.f8662k.f3856o;
    }

    @Override // H5.InterfaceC0269j
    public final void h(Object obj, o oVar) throws J {
        C c2 = C.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f8664h;
        c cVar = this.f8663l;
        atomicReferenceFieldUpdater.set(cVar, null);
        I5.d dVar = new I5.d(2, cVar, this);
        C0270k c0270k = this.f8662k;
        c0270k.z(c2, c0270k.f3813m, new A3.g(3, dVar));
    }

    @Override // H5.InterfaceC0269j
    public final void i(Object obj) throws J {
        this.f8662k.i(obj);
    }

    @Override // H5.InterfaceC0269j
    public final boolean isCancelled() {
        return this.f8662k.isCancelled();
    }

    @Override // S3.c
    public final void resumeWith(Object obj) {
        this.f8662k.resumeWith(obj);
    }
}
