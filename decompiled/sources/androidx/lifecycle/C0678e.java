package androidx.lifecycle;

import java.util.HashMap;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0678e implements InterfaceC0692t {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10731k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f10732l;

    public /* synthetic */ C0678e(int i7, Object obj) {
        this.f10731k = i7;
        this.f10732l = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0692t
    public final void b(InterfaceC0694v interfaceC0694v, EnumC0688o enumC0688o) {
        switch (this.f10731k) {
            case 0:
                new HashMap();
                InterfaceC0683j[] interfaceC0683jArr = (InterfaceC0683j[]) this.f10732l;
                if (interfaceC0683jArr.length > 0) {
                    InterfaceC0683j interfaceC0683j = interfaceC0683jArr[0];
                    throw null;
                }
                if (interfaceC0683jArr.length <= 0) {
                    return;
                }
                InterfaceC0683j interfaceC0683j2 = interfaceC0683jArr[0];
                throw null;
            default:
                if (enumC0688o == EnumC0688o.ON_CREATE) {
                    interfaceC0694v.f().c(this);
                    ((K) this.f10732l).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0688o).toString());
                }
        }
    }
}
