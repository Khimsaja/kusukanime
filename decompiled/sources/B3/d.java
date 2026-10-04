package B3;

import O.C0502l;
import O.C0510p;
import O.Z;
import android.content.Context;
import e4.InterfaceC0821a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C1538e;
import v.AbstractC2123b;
import v.C2141u;
import w.C2160a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f461k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f462l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f463m;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f461k = i7;
        this.f462l = obj;
        this.f463m = obj2;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f461k) {
            case 0:
                C0510p c0510p = (C0510p) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$SettingsGroup", (C2141u) obj);
                if ((iIntValue & 17) == 16 && c0510p.y()) {
                    c0510p.M();
                } else {
                    C1538e c1538e = D3.g.f1443d;
                    Z z7 = (Z) this.f463m;
                    boolean zBooleanValue = ((Boolean) z7.getValue()).booleanValue();
                    Context context = (Context) this.f462l;
                    boolean zH = c0510p.h(context);
                    Object objH = c0510p.H();
                    if (zH || objH == C0502l.a) {
                        objH = new p(context, z7, 4);
                        c0510p.b0(objH);
                    }
                    D3.t.g(c1538e, "Mode gelap", "Matikan untuk tema terang", zBooleanValue, (e4.k) objH, false, c0510p, 432);
                }
                break;
            case 1:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R5.c.f8664h;
                ((R5.b) this.f463m).getClass();
                R5.c cVar = (R5.c) this.f462l;
                atomicReferenceFieldUpdater.set(cVar, null);
                cVar.e(null);
                break;
            default:
                C0510p c0510p2 = (C0510p) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue2 & 17) == 16 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.e(a0.n.a, 18));
                    r3.n.c((String) this.f462l, null, (InterfaceC0821a) this.f463m, null, c0510p2, 0, 10);
                }
                break;
        }
        return O3.C.a;
    }
}
