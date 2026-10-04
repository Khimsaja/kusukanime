package c;

import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.EnumC0688o;
import androidx.lifecycle.InterfaceC0692t;
import androidx.lifecycle.InterfaceC0694v;

/* loaded from: classes.dex */
public final class u implements InterfaceC0692t, InterfaceC0741c {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0690q f11102k;

    /* renamed from: l, reason: collision with root package name */
    public final q f11103l;

    /* renamed from: m, reason: collision with root package name */
    public v f11104m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x f11105n;

    public u(x xVar, AbstractC0690q abstractC0690q, q qVar) {
        kotlin.jvm.internal.l.f("onBackPressedCallback", qVar);
        this.f11105n = xVar;
        this.f11102k = abstractC0690q;
        this.f11103l = qVar;
        abstractC0690q.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0692t
    public final void b(InterfaceC0694v interfaceC0694v, EnumC0688o enumC0688o) {
        if (enumC0688o != EnumC0688o.ON_START) {
            if (enumC0688o != EnumC0688o.ON_STOP) {
                if (enumC0688o == EnumC0688o.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                v vVar = this.f11104m;
                if (vVar != null) {
                    vVar.cancel();
                    return;
                }
                return;
            }
        }
        x xVar = this.f11105n;
        q qVar = this.f11103l;
        xVar.getClass();
        kotlin.jvm.internal.l.f("onBackPressedCallback", qVar);
        xVar.f11109b.addLast(qVar);
        v vVar2 = new v(xVar, qVar);
        qVar.f11093b.add(vVar2);
        xVar.e();
        qVar.f11094c = new w(0, xVar, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.f11104m = vVar2;
    }

    @Override // c.InterfaceC0741c
    public final void cancel() {
        this.f11102k.c(this);
        this.f11103l.f11093b.remove(this);
        v vVar = this.f11104m;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f11104m = null;
    }
}
