package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import e5.AbstractC0832b;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import l4.InterfaceC1425d;
import v1.C2149c;

/* loaded from: classes.dex */
public final class M extends T implements Q {
    public final Application a;

    /* renamed from: b, reason: collision with root package name */
    public final P f10718b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f10719c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0690q f10720d;

    /* renamed from: e, reason: collision with root package name */
    public final F.w f10721e;

    public M(Application application, L2.f fVar, Bundle bundle) {
        P p7;
        kotlin.jvm.internal.l.f("owner", fVar);
        this.f10721e = fVar.b();
        this.f10720d = fVar.f();
        this.f10719c = bundle;
        this.a = application;
        if (application != null) {
            if (P.f10723c == null) {
                P.f10723c = new P(application);
            }
            p7 = P.f10723c;
            kotlin.jvm.internal.l.c(p7);
        } else {
            p7 = new P(null);
        }
        this.f10718b = p7;
    }

    @Override // androidx.lifecycle.Q
    public final O a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.Q
    public final O b(Class cls, C2149c c2149c) {
        R1.i iVar = U.f10726b;
        LinkedHashMap linkedHashMap = c2149c.a;
        String str = (String) linkedHashMap.get(iVar);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(J.a) == null || linkedHashMap.get(J.f10711b) == null) {
            if (this.f10720d != null) {
                return e(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(P.f10724d);
        boolean zIsAssignableFrom = AbstractC0674a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? N.a(cls, N.f10722b) : N.a(cls, N.a);
        return constructorA == null ? this.f10718b.b(cls, c2149c) : (!zIsAssignableFrom || application == null) ? N.b(cls, constructorA, J.c(c2149c)) : N.b(cls, constructorA, application, J.c(c2149c));
    }

    @Override // androidx.lifecycle.Q
    public final O c(InterfaceC1425d interfaceC1425d, C2149c c2149c) {
        kotlin.jvm.internal.l.f("modelClass", interfaceC1425d);
        return b(n6.m.F(interfaceC1425d), c2149c);
    }

    @Override // androidx.lifecycle.T
    public final void d(O o7) {
        AbstractC0690q abstractC0690q = this.f10720d;
        if (abstractC0690q != null) {
            F.w wVar = this.f10721e;
            kotlin.jvm.internal.l.c(wVar);
            J.a(o7, wVar, abstractC0690q);
        }
    }

    public final O e(Class cls, String str) throws Exception {
        AbstractC0690q abstractC0690q = this.f10720d;
        if (abstractC0690q == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0674a.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? N.a(cls, N.f10722b) : N.a(cls, N.a);
        if (constructorA == null) {
            if (application != null) {
                return this.f10718b.a(cls);
            }
            if (S.a == null) {
                S.a = new S();
            }
            kotlin.jvm.internal.l.c(S.a);
            return AbstractC0832b.p(cls);
        }
        F.w wVar = this.f10721e;
        kotlin.jvm.internal.l.c(wVar);
        H hB = J.b(wVar, abstractC0690q, str, this.f10719c);
        G g4 = hB.f10709l;
        O oB = (!zIsAssignableFrom || application == null) ? N.b(cls, constructorA, g4) : N.b(cls, constructorA, application, g4);
        oB.a("androidx.lifecycle.savedstate.vm.tag", hB);
        return oB;
    }
}
