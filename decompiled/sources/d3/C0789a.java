package d3;

import H5.InterfaceC0265f0;
import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.InterfaceC0679f;
import androidx.lifecycle.InterfaceC0694v;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0789a implements InterfaceC0679f {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0690q f11235k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0265f0 f11236l;

    public C0789a(AbstractC0690q abstractC0690q, InterfaceC0265f0 interfaceC0265f0) {
        this.f11235k = abstractC0690q;
        this.f11236l = interfaceC0265f0;
    }

    @Override // androidx.lifecycle.InterfaceC0679f
    public final void onDestroy(InterfaceC0694v interfaceC0694v) {
        this.f11236l.e(null);
    }
}
