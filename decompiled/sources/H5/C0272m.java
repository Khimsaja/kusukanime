package H5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: H5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272m extends i0 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3866o;

    /* renamed from: p, reason: collision with root package name */
    public final C0270k f3867p;

    public /* synthetic */ C0272m(C0270k c0270k, int i7) {
        this.f3866o = i7;
        this.f3867p = c0270k;
    }

    @Override // H5.i0
    public final boolean j() {
        switch (this.f3866o) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // H5.i0
    public final void k(Throwable th) {
        switch (this.f3866o) {
            case 0:
                n0 n0VarI = i();
                C0270k c0270k = this.f3867p;
                Throwable thP = c0270k.p(n0VarI);
                if (c0270k.v()) {
                    M5.f fVar = (M5.f) c0270k.f3855n;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = M5.f.f6577r;
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        F2.G g4 = M5.a.f6569c;
                        if (kotlin.jvm.internal.l.a(obj, g4)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, g4, thP)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != g4) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c0270k.cancel(thP);
                if (!c0270k.v()) {
                    c0270k.n();
                    break;
                }
                break;
            default:
                this.f3867p.resumeWith(O3.C.a);
                break;
        }
    }
}
