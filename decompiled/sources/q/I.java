package q;

import y.C2302B;
import y0.AbstractC2359f;
import y0.InterfaceC2365l;

/* loaded from: classes.dex */
public final class I extends a0.p implements InterfaceC2365l, y0.a0 {

    /* renamed from: x, reason: collision with root package name */
    public C2302B f14486x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14487y;

    @Override // a0.p
    public final void A0() {
        C2302B c2302b = this.f14486x;
        if (c2302b != null) {
            c2302b.b();
        }
        this.f14486x = null;
    }

    @Override // y0.a0
    public final void K() {
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        AbstractC2359f.s(this, new A.m(11, xVar, this));
        C2302B c2302b = (C2302B) xVar.f12720k;
        if (this.f14487y) {
            C2302B c2302b2 = this.f14486x;
            if (c2302b2 != null) {
                c2302b2.b();
            }
            if (c2302b != null) {
                c2302b.a();
            } else {
                c2302b = null;
            }
            this.f14486x = c2302b;
        }
    }

    @Override // a0.p
    public final boolean v0() {
        return false;
    }
}
