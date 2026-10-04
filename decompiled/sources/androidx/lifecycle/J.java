package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import com.kusukanime.R;
import f1.AbstractC0870c;
import f6.AbstractC0905c;
import java.util.Arrays;
import java.util.LinkedHashMap;
import l4.InterfaceC1425d;
import v1.C2149c;
import x1.C2249a;
import x1.C2251c;

/* loaded from: classes.dex */
public abstract class J {
    public static final R1.i a = new R1.i(9);

    /* renamed from: b, reason: collision with root package name */
    public static final R1.i f10711b = new R1.i(10);

    /* renamed from: c, reason: collision with root package name */
    public static final R1.i f10712c = new R1.i(11);

    /* renamed from: d, reason: collision with root package name */
    public static final C2251c f10713d = new C2251c();

    public static final void a(O o7, F.w wVar, AbstractC0690q abstractC0690q) {
        kotlin.jvm.internal.l.f("registry", wVar);
        kotlin.jvm.internal.l.f("lifecycle", abstractC0690q);
        H h7 = (H) o7.c("androidx.lifecycle.savedstate.vm.tag");
        if (h7 == null || h7.f10710m) {
            return;
        }
        h7.e(wVar, abstractC0690q);
        j(wVar, abstractC0690q);
    }

    public static final H b(F.w wVar, AbstractC0690q abstractC0690q, String str, Bundle bundle) {
        G g4;
        kotlin.jvm.internal.l.f("registry", wVar);
        kotlin.jvm.internal.l.f("lifecycle", abstractC0690q);
        Bundle bundleT = wVar.t(str);
        if (bundleT != null) {
            bundle = bundleT;
        }
        if (bundle == null) {
            g4 = new G();
        } else {
            ClassLoader classLoader = G.class.getClassLoader();
            kotlin.jvm.internal.l.c(classLoader);
            bundle.setClassLoader(classLoader);
            Q3.g gVar = new Q3.g(bundle.size());
            for (String str2 : bundle.keySet()) {
                kotlin.jvm.internal.l.c(str2);
                gVar.put(str2, bundle.get(str2));
            }
            g4 = new G(gVar.b());
        }
        H h7 = new H(str, g4);
        h7.e(wVar, abstractC0690q);
        j(wVar, abstractC0690q);
        return h7;
    }

    public static final G c(C2149c c2149c) {
        G g4;
        R1.i iVar = a;
        LinkedHashMap linkedHashMap = c2149c.a;
        L2.f fVar = (L2.f) linkedHashMap.get(iVar);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        W w7 = (W) linkedHashMap.get(f10711b);
        if (w7 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f10712c);
        String str = (String) linkedHashMap.get(U.f10726b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        L2.d dVarY = fVar.b().y();
        Bundle bundle2 = null;
        K k7 = dVarY instanceof K ? (K) dVarY : null;
        if (k7 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = g(w7).f10717b;
        G g7 = (G) linkedHashMap2.get(str);
        if (g7 != null) {
            return g7;
        }
        k7.b();
        Bundle bundle3 = k7.f10715c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = AbstractC0870c.H((O3.l[]) Arrays.copyOf(new O3.l[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                k7.f10715c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            g4 = new G();
        } else {
            ClassLoader classLoader = G.class.getClassLoader();
            kotlin.jvm.internal.l.c(classLoader);
            bundle.setClassLoader(classLoader);
            Q3.g gVar = new Q3.g(bundle.size());
            for (String str2 : bundle.keySet()) {
                kotlin.jvm.internal.l.c(str2);
                gVar.put(str2, bundle.get(str2));
            }
            g4 = new G(gVar.b());
        }
        linkedHashMap2.put(str, g4);
        return g4;
    }

    public static final void d(L2.f fVar) {
        EnumC0689p enumC0689pB = fVar.f().b();
        if (enumC0689pB != EnumC0689p.f10737l && enumC0689pB != EnumC0689p.f10738m) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.b().y() == null) {
            K k7 = new K(fVar.b(), (W) fVar);
            fVar.b().J("androidx.lifecycle.internal.SavedStateHandlesProvider", k7);
            fVar.f().a(new C0678e(1, k7));
        }
    }

    public static final InterfaceC0694v e(View view) {
        kotlin.jvm.internal.l.f("<this>", view);
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC0694v interfaceC0694v = tag instanceof InterfaceC0694v ? (InterfaceC0694v) tag : null;
            if (interfaceC0694v != null) {
                return interfaceC0694v;
            }
            Object objQ = AbstractC0905c.q(view);
            view = objQ instanceof View ? (View) objQ : null;
        }
        return null;
    }

    public static final W f(View view) {
        kotlin.jvm.internal.l.f("<this>", view);
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            W w7 = tag instanceof W ? (W) tag : null;
            if (w7 != null) {
                return w7;
            }
            Object objQ = AbstractC0905c.q(view);
            view = objQ instanceof View ? (View) objQ : null;
        }
        return null;
    }

    public static final L g(W w7) {
        U uO = R1.i.o(w7, new I(), 4);
        InterfaceC1425d interfaceC1425dB = kotlin.jvm.internal.y.a.b(L.class);
        uO.getClass();
        kotlin.jvm.internal.l.f("modelClass", interfaceC1425dB);
        return (L) ((A2.b) uO.a).w("androidx.lifecycle.internal.SavedStateHandlesVM", interfaceC1425dB);
    }

    public static final C2249a h(O o7) {
        C2249a c2249a;
        kotlin.jvm.internal.l.f("<this>", o7);
        synchronized (f10713d) {
            c2249a = (C2249a) o7.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c2249a == null) {
                S3.h hVar = S3.i.f8767k;
                try {
                    O5.e eVar = H5.M.a;
                    hVar = M5.m.a.f4075o;
                } catch (O3.k | IllegalStateException unused) {
                }
                C2249a c2249a2 = new C2249a(hVar.plus(H5.D.e()));
                o7.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c2249a2);
                c2249a = c2249a2;
            }
        }
        return c2249a;
    }

    public static final void i(View view, InterfaceC0694v interfaceC0694v) {
        kotlin.jvm.internal.l.f("<this>", view);
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0694v);
    }

    public static void j(F.w wVar, AbstractC0690q abstractC0690q) throws NoSuchMethodException, SecurityException {
        EnumC0689p enumC0689pB = abstractC0690q.b();
        if (enumC0689pB == EnumC0689p.f10737l || enumC0689pB.compareTo(EnumC0689p.f10739n) >= 0) {
            wVar.N();
        } else {
            abstractC0690q.a(new C0681h(wVar, abstractC0690q));
        }
    }
}
