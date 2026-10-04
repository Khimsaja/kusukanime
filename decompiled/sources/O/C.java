package O;

import D.C0042b;
import H5.C0270k;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class C implements U {

    /* renamed from: k, reason: collision with root package name */
    public static final C f6956k = new C();

    /* renamed from: l, reason: collision with root package name */
    public static final Choreographer f6957l;

    static {
        O5.e eVar = H5.M.a;
        f6957l = (Choreographer) H5.D.B(M5.m.a.f4075o, new A(2, null));
    }

    @Override // O.U
    public final Object P(e4.k kVar, S3.c cVar) {
        C0270k c0270k = new C0270k(1, P3.r.E(cVar));
        c0270k.r();
        B b4 = new B(c0270k, kVar);
        f6957l.postFrameCallback(b4);
        c0270k.t(new C0042b(15, b4));
        Object objQ = c0270k.q();
        T3.a aVar = T3.a.f9048k;
        return objQ;
    }

    @Override // S3.h
    public final Object fold(Object obj, e4.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // S3.h
    public final S3.f get(S3.g gVar) {
        return P3.F.u(this, gVar);
    }

    @Override // S3.h
    public final S3.h minusKey(S3.g gVar) {
        return P3.F.K(this, gVar);
    }

    @Override // S3.h
    public final S3.h plus(S3.h hVar) {
        return P3.F.M(this, hVar);
    }
}
