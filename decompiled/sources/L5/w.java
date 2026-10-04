package L5;

import K5.InterfaceC0330i;
import O3.C;

/* loaded from: classes.dex */
public final class w implements InterfaceC0330i {

    /* renamed from: k, reason: collision with root package name */
    public final J5.t f6201k;

    public w(J5.t tVar) {
        this.f6201k = tVar;
    }

    @Override // K5.InterfaceC0330i
    public final Object emit(Object obj, S3.c cVar) {
        Object objSend = ((J5.j) this.f6201k).f4337n.send(obj, cVar);
        return objSend == T3.a.f9048k ? objSend : C.a;
    }
}
