package O;

import K5.InterfaceC0330i;

/* loaded from: classes.dex */
public final class M0 implements InterfaceC0330i {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7016k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0503l0 f7017l;

    public /* synthetic */ M0(C0503l0 c0503l0, int i7) {
        this.f7016k = i7;
        this.f7017l = c0503l0;
    }

    @Override // K5.InterfaceC0330i
    public final Object emit(Object obj, S3.c cVar) {
        switch (this.f7016k) {
            case 0:
                this.f7017l.setValue(obj);
                break;
            default:
                this.f7017l.setValue(obj);
                break;
        }
        return O3.C.a;
    }
}
