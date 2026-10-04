package H;

import e5.AbstractC0832b;

/* renamed from: H.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195l implements X0.y {
    public final a0.d a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0196m f2987b;

    /* renamed from: c, reason: collision with root package name */
    public long f2988c = 0;

    public C0195l(a0.d dVar, InterfaceC0196m interfaceC0196m) {
        this.a = dVar;
        this.f2987b = interfaceC0196m;
    }

    @Override // X0.y
    public final long a(T0.i iVar, long j7, T0.k kVar, long j8) {
        long jA = this.f2987b.a();
        if (!AbstractC0832b.x(jA)) {
            jA = this.f2988c;
        }
        this.f2988c = jA;
        return T0.h.c(T0.h.c(P3.F.b(iVar.a, iVar.f8841b), P3.F.U(jA)), this.a.a(j8, 0L, kVar));
    }
}
