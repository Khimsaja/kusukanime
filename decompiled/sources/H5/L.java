package H5;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class L extends O5.i {

    /* renamed from: m, reason: collision with root package name */
    public int f3813m;

    public L(int i7) {
        super(0L, false);
        this.f3813m = i7;
    }

    public abstract S3.c d();

    public Throwable e(Object obj) {
        C0278t c0278t = obj instanceof C0278t ? (C0278t) obj : null;
        if (c0278t != null) {
            return c0278t.a;
        }
        return null;
    }

    public final void g(Throwable th) {
        D.s(d().getContext(), new C("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            S3.c cVarD = d();
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>", cVarD);
            M5.f fVar = (M5.f) cVarD;
            U3.c cVar = fVar.f6579o;
            Object obj = fVar.f6581q;
            S3.h context = cVar.getContext();
            Object objN = M5.a.n(context, obj);
            InterfaceC0265f0 interfaceC0265f0 = null;
            C0 c0F = objN != M5.a.f6570d ? D.F(cVar, context, objN) : null;
            try {
                S3.h context2 = cVar.getContext();
                Object objJ = j();
                Throwable thE = e(objJ);
                if (thE == null) {
                    int i7 = this.f3813m;
                    boolean z7 = true;
                    if (i7 != 1 && i7 != 2) {
                        z7 = false;
                    }
                    if (z7) {
                        interfaceC0265f0 = (InterfaceC0265f0) context2.get(C0263e0.f3843k);
                    }
                }
                if (interfaceC0265f0 != null && !interfaceC0265f0.b()) {
                    CancellationException cancellationExceptionH = interfaceC0265f0.H();
                    b(cancellationExceptionH);
                    cVar.resumeWith(P3.r.r(cancellationExceptionH));
                } else if (thE != null) {
                    cVar.resumeWith(P3.r.r(thE));
                } else {
                    cVar.resumeWith(f(objJ));
                }
                if (c0F == null || c0F.d0()) {
                    M5.a.g(context, objN);
                }
            } catch (Throwable th) {
                if (c0F == null || c0F.d0()) {
                    M5.a.g(context, objN);
                }
                throw th;
            }
        } catch (J e7) {
            D.s(d().getContext(), e7.f3811k);
        } catch (Throwable th2) {
            g(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
