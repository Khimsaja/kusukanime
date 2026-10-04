package M5;

import H5.AbstractC0254a;
import H5.D;
import H5.J;

/* loaded from: classes.dex */
public class p extends AbstractC0254a implements U3.d {

    /* renamed from: n, reason: collision with root package name */
    public final S3.c f6598n;

    public p(S3.c cVar, S3.h hVar) {
        super(hVar, true, true);
        this.f6598n = cVar;
    }

    @Override // H5.n0
    public final boolean E() {
        return true;
    }

    @Override // H5.n0
    public void d(Object obj) throws J {
        a.h(P3.r.E(this.f6598n), D.z(obj));
    }

    @Override // H5.n0
    public void f(Object obj) {
        this.f6598n.resumeWith(D.z(obj));
    }

    @Override // U3.d
    public final U3.d getCallerFrame() {
        S3.c cVar = this.f6598n;
        if (cVar instanceof U3.d) {
            return (U3.d) cVar;
        }
        return null;
    }

    public void c0() {
    }
}
