package Y;

import D.C0042b;
import O.V;

/* loaded from: classes.dex */
public final class c extends d {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public c(int i7, m mVar) {
        e4.k c0622a;
        synchronized (o.f10002b) {
            ?? r12 = o.f10008h;
            c0622a = (e4.k) P3.q.M0(r12);
            c0622a = c0622a == null ? new C0622a(0, r12) : c0622a;
        }
        super(i7, mVar, null, c0622a);
    }

    @Override // Y.d
    public final d B(e4.k kVar, e4.k kVar2) {
        return (d) ((h) o.f(new V(1, new b(kVar, kVar2, 0))));
    }

    @Override // Y.d, Y.h
    public final void c() {
        synchronized (o.f10002b) {
            int i7 = this.f9982d;
            if (i7 >= 0) {
                o.u(i7);
                this.f9982d = -1;
            }
        }
    }

    @Override // Y.d, Y.h
    public final void k() {
        s.g();
        throw null;
    }

    @Override // Y.d, Y.h
    public final void l() {
        s.g();
        throw null;
    }

    @Override // Y.d, Y.h
    public final void m() {
        o.a();
    }

    @Override // Y.d, Y.h
    public final h t(e4.k kVar) {
        return (h) o.f(new V(1, new C0042b(22, kVar)));
    }

    @Override // Y.d
    public final s v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
