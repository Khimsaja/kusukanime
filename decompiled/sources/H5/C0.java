package H5;

/* loaded from: classes.dex */
public final class C0 extends M5.p {

    /* renamed from: o, reason: collision with root package name */
    public final ThreadLocal f3796o;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0(S3.c cVar, S3.h hVar) {
        D0 d02 = D0.f3806k;
        super(cVar, hVar.get(d02) == null ? hVar.plus(d02) : hVar);
        this.f3796o = new ThreadLocal();
        if (cVar.getContext().get(S3.d.f8766k) instanceof AbstractC0281w) {
            return;
        }
        Object objN = M5.a.n(hVar, null);
        M5.a.g(hVar, objN);
        f0(hVar, objN);
    }

    @Override // M5.p
    public final void c0() {
        e0();
    }

    public final boolean d0() {
        boolean z7 = this.threadLocalIsSet && this.f3796o.get() == null;
        this.f3796o.remove();
        return !z7;
    }

    public final void e0() {
        if (this.threadLocalIsSet) {
            O3.l lVar = (O3.l) this.f3796o.get();
            if (lVar != null) {
                M5.a.g((S3.h) lVar.f7528k, lVar.f7529l);
            }
            this.f3796o.remove();
        }
    }

    @Override // M5.p, H5.n0
    public final void f(Object obj) {
        e0();
        Object objZ = D.z(obj);
        S3.c cVar = this.f6598n;
        S3.h context = cVar.getContext();
        Object objN = M5.a.n(context, null);
        C0 c0F = objN != M5.a.f6570d ? D.F(cVar, context, objN) : null;
        try {
            cVar.resumeWith(objZ);
            if (c0F == null || c0F.d0()) {
                M5.a.g(context, objN);
            }
        } catch (Throwable th) {
            if (c0F == null || c0F.d0()) {
                M5.a.g(context, objN);
            }
            throw th;
        }
    }

    public final void f0(S3.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f3796o.set(new O3.l(hVar, obj));
    }
}
