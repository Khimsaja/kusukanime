package w0;

import y0.InterfaceC2374v;

/* renamed from: w0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2180O extends a0.p implements InterfaceC2374v {

    /* renamed from: x, reason: collision with root package name */
    public e4.k f16838x;

    /* renamed from: y, reason: collision with root package name */
    public long f16839y;

    @Override // y0.InterfaceC2374v
    public final void r(long j7) {
        if (T0.j.a(this.f16839y, j7)) {
            return;
        }
        this.f16838x.invoke(new T0.j(j7));
        this.f16839y = j7;
    }

    @Override // a0.p
    public final boolean v0() {
        return true;
    }
}
