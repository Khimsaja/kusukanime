package X;

import O.T;
import O.w0;
import Y.p;

/* loaded from: classes.dex */
public final class b implements w0 {

    /* renamed from: k, reason: collision with root package name */
    public m f9669k;

    /* renamed from: l, reason: collision with root package name */
    public j f9670l;

    /* renamed from: m, reason: collision with root package name */
    public String f9671m;

    /* renamed from: n, reason: collision with root package name */
    public Object f9672n;

    /* renamed from: o, reason: collision with root package name */
    public Object[] f9673o;

    /* renamed from: p, reason: collision with root package name */
    public i f9674p;

    /* renamed from: q, reason: collision with root package name */
    public final B.e f9675q = new B.e(20, this);

    public b(m mVar, j jVar, String str, Object obj, Object[] objArr) {
        this.f9669k = mVar;
        this.f9670l = jVar;
        this.f9671m = str;
        this.f9672n = obj;
        this.f9673o = objArr;
    }

    @Override // O.w0
    public final void a() throws Exception {
        c();
    }

    @Override // O.w0
    public final void b() {
        i iVar = this.f9674p;
        if (iVar != null) {
            ((B2.l) iVar).T();
        }
    }

    public final void c() throws Exception {
        String strR;
        j jVar = this.f9670l;
        if (this.f9674p != null) {
            throw new IllegalArgumentException(("entry(" + this.f9674p + ") is not null").toString());
        }
        if (jVar != null) {
            B.e eVar = this.f9675q;
            Object objInvoke = eVar.invoke();
            if (objInvoke == null || jVar.b(objInvoke)) {
                this.f9674p = jVar.d(this.f9671m, eVar);
                return;
            }
            if (objInvoke instanceof p) {
                p pVar = (p) objInvoke;
                if (pVar.c() == T.f7046m || pVar.c() == T.f7049p || pVar.c() == T.f7047n) {
                    strR = "MutableState containing " + pVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strR = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strR = z1.c.r(objInvoke);
            }
            throw new IllegalArgumentException(strR);
        }
    }

    @Override // O.w0
    public final void e() {
        i iVar = this.f9674p;
        if (iVar != null) {
            ((B2.l) iVar).T();
        }
    }
}
