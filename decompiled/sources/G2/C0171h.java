package G2;

import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import v1.C2149c;

/* renamed from: G2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171h extends T implements androidx.lifecycle.Q {
    public F.w a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0690q f2698b;

    @Override // androidx.lifecycle.Q
    public final androidx.lifecycle.O a(Class cls) throws Exception {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f2698b == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        F.w wVar = this.a;
        kotlin.jvm.internal.l.c(wVar);
        AbstractC0690q abstractC0690q = this.f2698b;
        kotlin.jvm.internal.l.c(abstractC0690q);
        androidx.lifecycle.H hB = androidx.lifecycle.J.b(wVar, abstractC0690q, canonicalName, null);
        C0172i c0172i = new C0172i(hB.f10709l);
        c0172i.a("androidx.lifecycle.savedstate.vm.tag", hB);
        return c0172i;
    }

    @Override // androidx.lifecycle.Q
    public final androidx.lifecycle.O b(Class cls, C2149c c2149c) throws Exception {
        String str = (String) c2149c.a.get(U.f10726b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        F.w wVar = this.a;
        if (wVar == null) {
            return new C0172i(androidx.lifecycle.J.c(c2149c));
        }
        kotlin.jvm.internal.l.c(wVar);
        AbstractC0690q abstractC0690q = this.f2698b;
        kotlin.jvm.internal.l.c(abstractC0690q);
        androidx.lifecycle.H hB = androidx.lifecycle.J.b(wVar, abstractC0690q, str, null);
        C0172i c0172i = new C0172i(hB.f10709l);
        c0172i.a("androidx.lifecycle.savedstate.vm.tag", hB);
        return c0172i;
    }

    @Override // androidx.lifecycle.T
    public final void d(androidx.lifecycle.O o7) {
        F.w wVar = this.a;
        if (wVar != null) {
            AbstractC0690q abstractC0690q = this.f2698b;
            kotlin.jvm.internal.l.c(abstractC0690q);
            androidx.lifecycle.J.a(o7, wVar, abstractC0690q);
        }
    }
}
