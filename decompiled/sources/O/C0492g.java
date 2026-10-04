package O;

import H5.C0270k;
import java.util.ArrayList;

/* renamed from: O.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492g implements U {

    /* renamed from: k, reason: collision with root package name */
    public final B.e f7068k;

    /* renamed from: m, reason: collision with root package name */
    public Throwable f7070m;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7069l = new Object();

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f7071n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f7072o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final C0488e f7073p = new C0488e(0);

    public C0492g(B.e eVar) {
        this.f7068k = eVar;
    }

    @Override // O.U
    public final Object P(e4.k kVar, S3.c cVar) {
        C0270k c0270k = new C0270k(1, P3.r.E(cVar));
        c0270k.r();
        C0490f c0490f = new C0490f(c0270k, kVar);
        synchronized (this.f7069l) {
            Throwable th = this.f7070m;
            if (th != null) {
                c0270k.resumeWith(P3.r.r(th));
            } else {
                boolean zIsEmpty = this.f7071n.isEmpty();
                this.f7071n.add(c0490f);
                if (zIsEmpty) {
                    this.f7073p.set(1);
                }
                c0270k.t(new A3.t(20, this, c0490f));
                if (zIsEmpty) {
                    try {
                        this.f7068k.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.f7069l) {
                            try {
                                if (this.f7070m == null) {
                                    this.f7070m = th2;
                                    ArrayList arrayList = this.f7071n;
                                    int size = arrayList.size();
                                    for (int i7 = 0; i7 < size; i7++) {
                                        ((C0490f) arrayList.get(i7)).f7067b.resumeWith(P3.r.r(th2));
                                    }
                                    this.f7071n.clear();
                                    this.f7073p.set(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        Object objQ = c0270k.q();
        T3.a aVar = T3.a.f9048k;
        return objQ;
    }

    public final void a(long j7) {
        Object objR;
        synchronized (this.f7069l) {
            try {
                ArrayList arrayList = this.f7071n;
                this.f7071n = this.f7072o;
                this.f7072o = arrayList;
                this.f7073p.set(0);
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    C0490f c0490f = (C0490f) arrayList.get(i7);
                    c0490f.getClass();
                    try {
                        objR = c0490f.a.invoke(Long.valueOf(j7));
                    } catch (Throwable th) {
                        objR = P3.r.r(th);
                    }
                    c0490f.f7067b.resumeWith(objR);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
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
