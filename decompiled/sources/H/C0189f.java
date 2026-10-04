package H;

import e5.AbstractC0832b;

/* renamed from: H.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189f extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0196m f2970l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2971m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f2972n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0189f(InterfaceC0196m interfaceC0196m, boolean z7, boolean z8) {
        super(1);
        this.f2970l = interfaceC0196m;
        this.f2971m = z7;
        this.f2972n = z8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        F0.i iVar = (F0.i) obj;
        long jA = this.f2970l.a();
        iVar.j(A.f2870c, new C0208z(this.f2971m ? D.V.f1104l : D.V.f1105m, jA, this.f2972n ? 1 : 3, AbstractC0832b.x(jA)));
        return O3.C.a;
    }
}
