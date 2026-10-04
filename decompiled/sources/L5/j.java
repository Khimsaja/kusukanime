package L5;

import K5.InterfaceC0329h;
import K5.InterfaceC0330i;
import O3.C;

/* loaded from: classes.dex */
public final class j extends i {
    @Override // L5.g
    public final g e(S3.h hVar, int i7, J5.c cVar) {
        return new j(this.f6175n, hVar, i7, cVar);
    }

    @Override // L5.g
    public final InterfaceC0329h f() {
        return this.f6175n;
    }

    @Override // L5.i
    public final Object h(InterfaceC0330i interfaceC0330i, S3.c cVar) {
        Object objCollect = this.f6175n.collect(interfaceC0330i, cVar);
        return objCollect == T3.a.f9048k ? objCollect : C.a;
    }
}
