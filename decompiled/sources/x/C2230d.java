package x;

import y.InterfaceC2331l;
import y0.C2349D;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2230d implements InterfaceC2331l {
    public final v a;

    public C2230d(v vVar) {
        this.a = vVar;
    }

    @Override // y.InterfaceC2331l
    public final int b() {
        return this.a.g().f17233j;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // y.InterfaceC2331l
    public final int c() {
        return ((C2240n) P3.q.A0(this.a.g().f17230g)).a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // y.InterfaceC2331l
    public final boolean d() {
        return !this.a.g().f17230g.isEmpty();
    }

    @Override // y.InterfaceC2331l
    public final void e() {
        C2349D c2349d = this.a.f17285h;
        if (c2349d != null) {
            c2349d.k();
        }
    }

    @Override // y.InterfaceC2331l
    public final int f() {
        return this.a.f17279b.f16771b.f();
    }
}
