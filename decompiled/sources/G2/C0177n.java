package G2;

import androidx.lifecycle.EnumC0688o;
import androidx.lifecycle.InterfaceC0692t;
import androidx.lifecycle.InterfaceC0694v;
import java.util.Iterator;

/* renamed from: G2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0177n implements InterfaceC0692t {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2718k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2719l;

    public /* synthetic */ C0177n(int i7, Object obj) {
        this.f2718k = i7;
        this.f2719l = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0692t
    public final void b(InterfaceC0694v interfaceC0694v, EnumC0688o enumC0688o) {
        switch (this.f2718k) {
            case 0:
                E e7 = (E) this.f2719l;
                kotlin.jvm.internal.l.f("this$0", e7);
                e7.f2649r = enumC0688o.a();
                if (e7.f2634c != null) {
                    Iterator<E> it = e7.f2638g.iterator();
                    while (it.hasNext()) {
                        C0174k c0174k = (C0174k) it.next();
                        c0174k.getClass();
                        c0174k.f2705n = enumC0688o.a();
                        c0174k.i();
                    }
                    break;
                }
                break;
            case 1:
                EnumC0688o enumC0688o2 = EnumC0688o.ON_START;
                M2.a aVar = (M2.a) this.f2719l;
                if (enumC0688o != enumC0688o2) {
                    if (enumC0688o == EnumC0688o.ON_STOP) {
                        aVar.f6542c = false;
                        break;
                    }
                } else {
                    aVar.f6542c = true;
                    break;
                }
                break;
            case 2:
                if (enumC0688o == EnumC0688o.ON_RESUME) {
                    v3.z zVar = (v3.z) this.f2719l;
                    zVar.f();
                    zVar.g();
                    break;
                }
                break;
            default:
                if (enumC0688o == EnumC0688o.ON_RESUME) {
                    ((w3.y) this.f2719l).e();
                    break;
                }
                break;
        }
    }
}
