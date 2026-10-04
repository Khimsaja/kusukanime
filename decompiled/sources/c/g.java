package c;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0688o;
import androidx.lifecycle.InterfaceC0692t;
import androidx.lifecycle.InterfaceC0694v;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC0692t {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x f11055k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f11056l;

    public /* synthetic */ g(x xVar, n nVar) {
        this.f11055k = xVar;
        this.f11056l = nVar;
    }

    @Override // androidx.lifecycle.InterfaceC0692t
    public final void b(InterfaceC0694v interfaceC0694v, EnumC0688o enumC0688o) {
        if (enumC0688o == EnumC0688o.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = h.a(this.f11056l);
            x xVar = this.f11055k;
            xVar.f11112e = onBackInvokedDispatcherA;
            xVar.d(xVar.f11114g);
        }
    }
}
