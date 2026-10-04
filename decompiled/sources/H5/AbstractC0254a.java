package H5;

import l4.AbstractC1420H;

/* renamed from: H5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0254a extends n0 implements S3.c, A {

    /* renamed from: m, reason: collision with root package name */
    public final S3.h f3833m;

    public AbstractC0254a(S3.h hVar, boolean z7, boolean z8) {
        super(z8);
        if (z7) {
            C((InterfaceC0265f0) hVar.get(C0263e0.f3843k));
        }
        this.f3833m = hVar.plus(this);
    }

    @Override // H5.n0
    public final void B(D6.r rVar) {
        D.s(this.f3833m, rVar);
    }

    @Override // H5.n0
    public final void Q(Object obj) {
        if (!(obj instanceof C0278t)) {
            a0(obj);
        } else {
            C0278t c0278t = (C0278t) obj;
            Z(c0278t.a, C0278t.f3883b.get(c0278t) == 1);
        }
    }

    public final void b0(B b4, AbstractC0254a abstractC0254a, e4.n nVar) {
        Object objInvoke;
        int iOrdinal = b4.ordinal();
        O3.C c2 = O3.C.a;
        if (iOrdinal == 0) {
            try {
                M5.a.h(P3.r.E(P3.r.q(abstractC0254a, this, nVar)), c2);
                return;
            } catch (Throwable th) {
                AbstractC1420H.y(th, this);
                throw null;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                kotlin.jvm.internal.l.f("<this>", nVar);
                P3.r.E(P3.r.q(abstractC0254a, this, nVar)).resumeWith(c2);
                return;
            }
            if (iOrdinal != 3) {
                throw new D6.r();
            }
            try {
                S3.h hVar = this.f3833m;
                Object objN = M5.a.n(hVar, null);
                try {
                    if (nVar instanceof U3.a) {
                        kotlin.jvm.internal.B.e(2, nVar);
                        objInvoke = nVar.invoke(abstractC0254a, this);
                    } else {
                        objInvoke = P3.r.c0(nVar, abstractC0254a, this);
                    }
                    M5.a.g(hVar, objN);
                    if (objInvoke != T3.a.f9048k) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    M5.a.g(hVar, objN);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof J) {
                    th = ((J) th).f3811k;
                }
                resumeWith(P3.r.r(th));
            }
        }
    }

    @Override // S3.c
    public final S3.h getContext() {
        return this.f3833m;
    }

    @Override // H5.A
    public final S3.h getCoroutineContext() {
        return this.f3833m;
    }

    @Override // H5.n0
    public final String p() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // S3.c
    public final void resumeWith(Object obj) {
        Throwable thA = O3.o.a(obj);
        if (thA != null) {
            obj = new C0278t(thA, false);
        }
        Object objG = G(obj);
        if (objG == D.f3800e) {
            return;
        }
        f(objG);
    }

    public void a0(Object obj) {
    }

    public void Z(Throwable th, boolean z7) {
    }
}
