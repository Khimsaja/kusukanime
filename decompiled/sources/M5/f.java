package M5;

import H5.AbstractC0281w;
import H5.C0278t;
import H5.D;
import H5.J;
import H5.L;
import H5.W;
import H5.w0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class f extends L implements U3.d, S3.c {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6577r = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC0281w f6578n;

    /* renamed from: o, reason: collision with root package name */
    public final U3.c f6579o;

    /* renamed from: p, reason: collision with root package name */
    public Object f6580p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f6581q;

    public f(AbstractC0281w abstractC0281w, U3.c cVar) {
        super(-1);
        this.f6578n = abstractC0281w;
        this.f6579o = cVar;
        this.f6580p = a.f6568b;
        this.f6581q = a.m(cVar.getContext());
    }

    @Override // U3.d
    public final U3.d getCallerFrame() {
        return this.f6579o;
    }

    @Override // S3.c
    public final S3.h getContext() {
        return this.f6579o.getContext();
    }

    @Override // H5.L
    public final Object j() {
        Object obj = this.f6580p;
        this.f6580p = a.f6568b;
        return obj;
    }

    @Override // S3.c
    public final void resumeWith(Object obj) throws J {
        Throwable thA = O3.o.a(obj);
        Object c0278t = thA == null ? obj : new C0278t(thA, false);
        U3.c cVar = this.f6579o;
        S3.h context = cVar.getContext();
        AbstractC0281w abstractC0281w = this.f6578n;
        if (a.j(abstractC0281w, context)) {
            this.f6580p = c0278t;
            this.f3813m = 0;
            a.i(abstractC0281w, cVar.getContext(), this);
            return;
        }
        W wA = w0.a();
        if (wA.f3828l >= 4294967296L) {
            this.f6580p = c0278t;
            this.f3813m = 0;
            wA.b0(this);
            return;
        }
        wA.d0(true);
        try {
            S3.h context2 = cVar.getContext();
            Object objN = a.n(context2, this.f6581q);
            try {
                cVar.resumeWith(obj);
                while (wA.f0()) {
                }
            } finally {
                a.g(context2, objN);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f6578n + ", " + D.D(this.f6579o) + ']';
    }

    @Override // H5.L
    public final S3.c d() {
        return this;
    }
}
