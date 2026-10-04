package w;

import y.InterfaceC2331l;
import y0.C2349D;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2162c implements InterfaceC2331l {
    public final u a;

    public C2162c(u uVar) {
        this.a = uVar;
    }

    @Override // y.InterfaceC2331l
    public final int b() {
        return this.a.g().f16750m;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // y.InterfaceC2331l
    public final int c() {
        return Math.min(b() - 1, ((m) P3.q.A0(this.a.g().f16747j)).a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // y.InterfaceC2331l
    public final boolean d() {
        return !this.a.g().f16747j.isEmpty();
    }

    @Override // y.InterfaceC2331l
    public final void e() {
        C2349D c2349d = this.a.f16799j;
        if (c2349d != null) {
            c2349d.k();
        }
    }

    @Override // y.InterfaceC2331l
    public final int f() {
        return Math.max(0, this.a.f16793d.f16771b.f());
    }
}
