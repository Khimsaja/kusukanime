package A;

import a0.p;

/* loaded from: classes.dex */
public final class d extends p {

    /* renamed from: x, reason: collision with root package name */
    public c f10x;

    @Override // a0.p
    public final boolean v0() {
        return false;
    }

    @Override // a0.p
    public final void y0() {
        c cVar = this.f10x;
        if (cVar != null) {
            cVar.a.m(this);
        }
        if (cVar != null) {
            cVar.a.b(this);
        }
        this.f10x = cVar;
    }

    @Override // a0.p
    public final void z0() {
        c cVar = this.f10x;
        if (cVar != null) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", cVar);
            cVar.a.m(this);
        }
    }
}
