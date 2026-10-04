package androidx.lifecycle;

import c.C0743e;

/* loaded from: classes.dex */
public final class H implements InterfaceC0692t, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final String f10708k;

    /* renamed from: l, reason: collision with root package name */
    public final G f10709l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10710m;

    public H(String str, G g4) {
        this.f10708k = str;
        this.f10709l = g4;
    }

    @Override // androidx.lifecycle.InterfaceC0692t
    public final void b(InterfaceC0694v interfaceC0694v, EnumC0688o enumC0688o) {
        if (enumC0688o == EnumC0688o.ON_DESTROY) {
            this.f10710m = false;
            interfaceC0694v.f().c(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    public final void e(F.w wVar, AbstractC0690q abstractC0690q) {
        kotlin.jvm.internal.l.f("registry", wVar);
        kotlin.jvm.internal.l.f("lifecycle", abstractC0690q);
        if (this.f10710m) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f10710m = true;
        abstractC0690q.a(this);
        wVar.J(this.f10708k, (C0743e) this.f10709l.f10707b.f322p);
    }
}
