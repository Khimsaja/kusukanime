package T2;

import K5.InterfaceC0329h;
import K5.InterfaceC0330i;
import K5.Y;

/* loaded from: classes.dex */
public final class n implements InterfaceC0329h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9010k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y f9011l;

    public /* synthetic */ n(Y y7, int i7) {
        this.f9010k = i7;
        this.f9011l = y7;
    }

    @Override // K5.InterfaceC0329h
    public final Object collect(InterfaceC0330i interfaceC0330i, S3.c cVar) throws Throwable {
        switch (this.f9010k) {
            case 0:
                this.f9011l.collect(new m(interfaceC0330i, 0), cVar);
                break;
            default:
                this.f9011l.collect(new m(interfaceC0330i, 1), cVar);
                break;
        }
        return T3.a.f9048k;
    }
}
