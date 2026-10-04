package L2;

import F.w;
import android.os.Bundle;
import androidx.lifecycle.EnumC0688o;
import androidx.lifecycle.InterfaceC0692t;
import androidx.lifecycle.InterfaceC0694v;
import androidx.lifecycle.J;
import androidx.lifecycle.O;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import b1.AbstractC0703b;
import c.j;
import c.n;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b implements InterfaceC0692t {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6042k;

    /* renamed from: l, reason: collision with root package name */
    public final f f6043l;

    public /* synthetic */ b(f fVar, int i7) {
        this.f6042k = i7;
        this.f6043l = fVar;
    }

    @Override // androidx.lifecycle.InterfaceC0692t
    public final void b(InterfaceC0694v interfaceC0694v, EnumC0688o enumC0688o) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f6042k) {
            case 0:
                if (enumC0688o != EnumC0688o.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0694v.f().c(this);
                f fVar = this.f6043l;
                Bundle bundleT = fVar.b().t("androidx.savedstate.Restarter");
                if (bundleT == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleT.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        l.c(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                                l.c(objNewInstance);
                                if (!(fVar instanceof W)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + fVar).toString());
                                }
                                V vE = ((W) fVar).e();
                                w wVarB = fVar.b();
                                LinkedHashMap linkedHashMap = vE.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    l.f("key", str2);
                                    O o7 = (O) linkedHashMap.get(str2);
                                    if (o7 != null) {
                                        J.a(o7, wVarB, fVar.f());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    wVarB.N();
                                }
                            } catch (Exception e7) {
                                throw new RuntimeException(AbstractC0703b.i("Failed to instantiate ", str), e7);
                            }
                        } catch (NoSuchMethodException e8) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
                        }
                    } catch (ClassNotFoundException e9) {
                        throw new RuntimeException(AbstractC0703b.j("Class ", str, " wasn't found"), e9);
                    }
                }
                return;
            default:
                n nVar = (n) this.f6043l;
                if (nVar.f11076o == null) {
                    j jVar = (j) nVar.getLastNonConfigurationInstance();
                    if (jVar != null) {
                        nVar.f11076o = jVar.a;
                    }
                    if (nVar.f11076o == null) {
                        nVar.f11076o = new V();
                    }
                }
                nVar.f10421k.c(this);
                return;
        }
    }
}
