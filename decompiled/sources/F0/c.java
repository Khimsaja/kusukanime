package F0;

import y0.l0;

/* loaded from: classes.dex */
public final class c extends a0.p implements l0 {

    /* renamed from: x, reason: collision with root package name */
    public boolean f2064x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f2065y;

    /* renamed from: z, reason: collision with root package name */
    public e4.k f2066z;

    public c(boolean z7, boolean z8, e4.k kVar) {
        this.f2064x = z7;
        this.f2065y = z8;
        this.f2066z = kVar;
    }

    @Override // y0.l0
    public final boolean h0() {
        return this.f2065y;
    }

    @Override // y0.l0
    public final boolean j0() {
        return this.f2064x;
    }

    @Override // y0.l0
    public final void y(i iVar) {
        this.f2066z.invoke(iVar);
    }
}
