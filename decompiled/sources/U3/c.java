package U3;

import H5.AbstractC0281w;
import H5.C0270k;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class c extends a {
    private final S3.h _context;
    private transient S3.c<Object> intercepted;

    public c(S3.c cVar, S3.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // S3.c
    public S3.h getContext() {
        S3.h hVar = this._context;
        l.c(hVar);
        return hVar;
    }

    public final S3.c<Object> intercepted() {
        S3.c<Object> cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        S3.e eVar = (S3.e) getContext().get(S3.d.f8766k);
        S3.c<Object> fVar = eVar != null ? new M5.f((AbstractC0281w) eVar, this) : this;
        this.intercepted = fVar;
        return fVar;
    }

    @Override // U3.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        S3.c<Object> cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            S3.f fVar = getContext().get(S3.d.f8766k);
            l.c(fVar);
            M5.f fVar2 = (M5.f) cVar;
            do {
                atomicReferenceFieldUpdater = M5.f.f6577r;
            } while (atomicReferenceFieldUpdater.get(fVar2) == M5.a.f6569c);
            Object obj = atomicReferenceFieldUpdater.get(fVar2);
            C0270k c0270k = obj instanceof C0270k ? (C0270k) obj : null;
            if (c0270k != null) {
                c0270k.n();
            }
        }
        this.intercepted = b.f9226k;
    }

    public c(S3.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
