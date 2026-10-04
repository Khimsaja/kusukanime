package L5;

import H5.D;
import K5.InterfaceC0329h;
import K5.InterfaceC0330i;
import O3.C;

/* loaded from: classes.dex */
public final class n extends i {

    /* renamed from: o, reason: collision with root package name */
    public final U3.j f6189o;

    /* JADX WARN: Multi-variable type inference failed */
    public n(e4.o oVar, InterfaceC0329h interfaceC0329h, S3.h hVar, int i7, J5.c cVar) {
        super(interfaceC0329h, hVar, i7, cVar);
        this.f6189o = (U3.j) oVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [U3.j, e4.o] */
    @Override // L5.g
    public final g e(S3.h hVar, int i7, J5.c cVar) {
        return new n(this.f6189o, this.f6175n, hVar, i7, cVar);
    }

    @Override // L5.i
    public final Object h(InterfaceC0330i interfaceC0330i, S3.c cVar) {
        Object objJ = D.j(new m(this, interfaceC0330i, null), cVar);
        return objJ == T3.a.f9048k ? objJ : C.a;
    }
}
