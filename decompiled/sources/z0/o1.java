package z0;

import O.C0519u;
import O.InterfaceC0512q;
import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.EnumC0688o;
import androidx.lifecycle.InterfaceC0692t;
import androidx.lifecycle.InterfaceC0694v;
import com.kusukanime.R;

/* loaded from: classes.dex */
public final class o1 implements InterfaceC0512q, InterfaceC0692t {

    /* renamed from: k, reason: collision with root package name */
    public final C2471u f18818k;

    /* renamed from: l, reason: collision with root package name */
    public final C0519u f18819l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18820m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0690q f18821n;

    /* renamed from: o, reason: collision with root package name */
    public W.a f18822o = AbstractC2451j0.a;

    public o1(C2471u c2471u, C0519u c0519u) {
        this.f18818k = c2471u;
        this.f18819l = c0519u;
    }

    public final void a() {
        if (!this.f18820m) {
            this.f18820m = true;
            this.f18818k.getView().setTag(R.id.wrapped_composition_tag, null);
            AbstractC0690q abstractC0690q = this.f18821n;
            if (abstractC0690q != null) {
                abstractC0690q.c(this);
            }
        }
        this.f18819l.l();
    }

    @Override // androidx.lifecycle.InterfaceC0692t
    public final void b(InterfaceC0694v interfaceC0694v, EnumC0688o enumC0688o) {
        if (enumC0688o == EnumC0688o.ON_DESTROY) {
            a();
        } else {
            if (enumC0688o != EnumC0688o.ON_CREATE || this.f18820m) {
                return;
            }
            c(this.f18822o);
        }
    }

    public final void c(W.a aVar) {
        this.f18818k.setOnViewTreeOwnersAvailable(new U(4, this, aVar));
    }
}
