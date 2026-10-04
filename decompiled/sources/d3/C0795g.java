package d3;

import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.EnumC0689p;
import androidx.lifecycle.InterfaceC0679f;
import androidx.lifecycle.InterfaceC0693u;

/* renamed from: d3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0795g extends AbstractC0690q {
    public static final C0795g a = new C0795g();

    /* renamed from: b, reason: collision with root package name */
    public static final C0794f f11260b = new C0794f();

    @Override // androidx.lifecycle.AbstractC0690q
    public final void a(InterfaceC0693u interfaceC0693u) {
        if (!(interfaceC0693u instanceof InterfaceC0679f)) {
            throw new IllegalArgumentException((interfaceC0693u + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        InterfaceC0679f interfaceC0679f = (InterfaceC0679f) interfaceC0693u;
        C0794f c0794f = f11260b;
        interfaceC0679f.onCreate(c0794f);
        interfaceC0679f.onStart(c0794f);
        interfaceC0679f.onResume(c0794f);
    }

    @Override // androidx.lifecycle.AbstractC0690q
    public final EnumC0689p b() {
        return EnumC0689p.f10740o;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.AbstractC0690q
    public final void c(InterfaceC0693u interfaceC0693u) {
    }
}
