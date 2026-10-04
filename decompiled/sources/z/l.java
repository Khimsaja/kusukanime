package z;

import y.InterfaceC2331l;
import y0.C2349D;

/* loaded from: classes.dex */
public final class l implements InterfaceC2331l {
    public final C2425d a;

    public l(C2425d c2425d) {
        this.a = c2425d;
    }

    @Override // y.InterfaceC2331l
    public final int b() {
        return this.a.l();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // y.InterfaceC2331l
    public final int c() {
        return Math.min(r0.l() - 1, ((j) P3.q.A0(this.a.k().a)).a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // y.InterfaceC2331l
    public final boolean d() {
        return !this.a.k().a.isEmpty();
    }

    @Override // y.InterfaceC2331l
    public final void e() {
        C2349D c2349d = (C2349D) this.a.f18425w.getValue();
        if (c2349d != null) {
            c2349d.k();
        }
    }

    @Override // y.InterfaceC2331l
    public final int f() {
        return Math.max(0, this.a.f18406d);
    }
}
