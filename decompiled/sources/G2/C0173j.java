package G2;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.EnumC0689p;
import e4.InterfaceC0821a;
import l4.InterfaceC1425d;

/* renamed from: G2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173j extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2700l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0174k f2701m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0173j(C0174k c0174k, int i7) {
        super(0);
        this.f2700l = i7;
        this.f2701m = c0174k;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f2700l) {
            case 0:
                C0174k c0174k = this.f2701m;
                Context context = c0174k.f2702k;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new androidx.lifecycle.M(applicationContext instanceof Application ? (Application) applicationContext : null, c0174k, c0174k.g());
            default:
                C0174k c0174k2 = this.f2701m;
                if (!c0174k2.f2711t) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                androidx.lifecycle.x xVar = c0174k2.f2709r;
                if (xVar.f10744c == EnumC0689p.f10736k) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                C0171h c0171h = new C0171h();
                c0171h.a = (F.w) c0174k2.f2710s.f6046m;
                c0171h.f2698b = xVar;
                A2.b bVar = new A2.b(c0174k2.e(), c0171h, c0174k2.d());
                InterfaceC1425d interfaceC1425dI = n6.m.I(C0172i.class);
                String strK = interfaceC1425dI.k();
                if (strK != null) {
                    return ((C0172i) bVar.w("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strK), interfaceC1425dI)).f2699b;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
    }
}
