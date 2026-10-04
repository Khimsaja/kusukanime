package t4;

import u4.InterfaceC2118y;
import x4.AbstractC2257C;

/* loaded from: classes.dex */
public final class n extends AbstractC2257C {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f16073q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InterfaceC2118y interfaceC2118y, W4.c cVar, int i7) {
        super(interfaceC2118y, cVar);
        this.f16073q = i7;
        switch (i7) {
            case 1:
                kotlin.jvm.internal.l.f("module", interfaceC2118y);
                kotlin.jvm.internal.l.f("fqName", cVar);
                super(interfaceC2118y, cVar);
                break;
            default:
                break;
        }
    }

    @Override // u4.InterfaceC2088D
    public final /* bridge */ /* synthetic */ g5.o k0() {
        switch (this.f16073q) {
        }
        return g5.n.f11759b;
    }
}
