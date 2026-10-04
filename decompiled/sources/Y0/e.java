package Y0;

import n6.m;

/* loaded from: classes.dex */
public final class e extends m {
    @Override // n6.m
    public final void T(f fVar, f fVar2) {
        fVar.f10056b = fVar2;
    }

    @Override // n6.m
    public final void U(f fVar, Thread thread) {
        fVar.a = thread;
    }

    @Override // n6.m
    public final boolean n(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f10061b != cVar) {
                    return false;
                }
                gVar.f10061b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n6.m
    public final boolean o(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.a != obj) {
                    return false;
                }
                gVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n6.m
    public final boolean p(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f10062c != fVar) {
                    return false;
                }
                gVar.f10062c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
