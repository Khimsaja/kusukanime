package G2;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.EnumC0689p;
import androidx.lifecycle.InterfaceC0684k;
import androidx.lifecycle.InterfaceC0694v;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import v1.C2149c;

/* renamed from: G2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174k implements InterfaceC0694v, W, InterfaceC0684k, L2.f {

    /* renamed from: k, reason: collision with root package name */
    public final Context f2702k;

    /* renamed from: l, reason: collision with root package name */
    public y f2703l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f2704m;

    /* renamed from: n, reason: collision with root package name */
    public EnumC0689p f2705n;

    /* renamed from: o, reason: collision with root package name */
    public final s f2706o;

    /* renamed from: p, reason: collision with root package name */
    public final String f2707p;

    /* renamed from: q, reason: collision with root package name */
    public final Bundle f2708q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.lifecycle.x f2709r = new androidx.lifecycle.x(this);

    /* renamed from: s, reason: collision with root package name */
    public final L2.e f2710s = new L2.e(new M2.a(this, new B3.q(1, this)));

    /* renamed from: t, reason: collision with root package name */
    public boolean f2711t;

    /* renamed from: u, reason: collision with root package name */
    public EnumC0689p f2712u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.lifecycle.M f2713v;

    public C0174k(Context context, y yVar, Bundle bundle, EnumC0689p enumC0689p, s sVar, String str, Bundle bundle2) {
        this.f2702k = context;
        this.f2703l = yVar;
        this.f2704m = bundle;
        this.f2705n = enumC0689p;
        this.f2706o = sVar;
        this.f2707p = str;
        this.f2708q = bundle2;
        O3.q qVarC = z1.c.C(new C0173j(this, 0));
        z1.c.C(new C0173j(this, 1));
        this.f2712u = EnumC0689p.f10737l;
        this.f2713v = (androidx.lifecycle.M) qVarC.getValue();
    }

    @Override // L2.f
    public final F.w b() {
        return (F.w) this.f2710s.f6046m;
    }

    @Override // androidx.lifecycle.InterfaceC0684k
    public final androidx.lifecycle.Q c() {
        return this.f2713v;
    }

    @Override // androidx.lifecycle.InterfaceC0684k
    public final C2149c d() {
        C2149c c2149c = new C2149c();
        Context context = this.f2702k;
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = c2149c.a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.P.f10724d, application);
        }
        linkedHashMap.put(androidx.lifecycle.J.a, this);
        linkedHashMap.put(androidx.lifecycle.J.f10711b, this);
        Bundle bundleG = g();
        if (bundleG != null) {
            linkedHashMap.put(androidx.lifecycle.J.f10712c, bundleG);
        }
        return c2149c;
    }

    @Override // androidx.lifecycle.W
    public final V e() {
        if (!this.f2711t) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f2709r.f10744c == EnumC0689p.f10736k) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        s sVar = this.f2706o;
        if (sVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = this.f2707p;
        kotlin.jvm.internal.l.f("backStackEntryId", str);
        LinkedHashMap linkedHashMap = sVar.f2732b;
        V v5 = (V) linkedHashMap.get(str);
        if (v5 != null) {
            return v5;
        }
        V v7 = new V();
        linkedHashMap.put(str, v7);
        return v7;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof C0174k)) {
            C0174k c0174k = (C0174k) obj;
            if (kotlin.jvm.internal.l.a(this.f2707p, c0174k.f2707p) && kotlin.jvm.internal.l.a(this.f2703l, c0174k.f2703l) && kotlin.jvm.internal.l.a(this.f2709r, c0174k.f2709r) && kotlin.jvm.internal.l.a((F.w) this.f2710s.f6046m, (F.w) c0174k.f2710s.f6046m)) {
                Bundle bundle = this.f2704m;
                Bundle bundle2 = c0174k.f2704m;
                if (kotlin.jvm.internal.l.a(bundle, bundle2)) {
                    return true;
                }
                if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!kotlin.jvm.internal.l.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.InterfaceC0694v
    public final AbstractC0690q f() {
        return this.f2709r;
    }

    public final Bundle g() {
        Bundle bundle = this.f2704m;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void h(EnumC0689p enumC0689p) {
        kotlin.jvm.internal.l.f("maxState", enumC0689p);
        this.f2712u = enumC0689p;
        i();
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f2703l.hashCode() + (this.f2707p.hashCode() * 31);
        Bundle bundle = this.f2704m;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i7 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i7 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((F.w) this.f2710s.f6046m).hashCode() + ((this.f2709r.hashCode() + (iHashCode * 31)) * 31);
    }

    public final void i() {
        if (!this.f2711t) {
            L2.e eVar = this.f2710s;
            ((M2.a) eVar.f6045l).d();
            this.f2711t = true;
            if (this.f2706o != null) {
                androidx.lifecycle.J.d(this);
            }
            eVar.p1(this.f2708q);
        }
        int iOrdinal = this.f2705n.ordinal();
        int iOrdinal2 = this.f2712u.ordinal();
        androidx.lifecycle.x xVar = this.f2709r;
        if (iOrdinal < iOrdinal2) {
            xVar.h(this.f2705n);
        } else {
            xVar.h(this.f2712u);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0174k.class.getSimpleName());
        sb.append("(" + this.f2707p + ')');
        sb.append(" destination=");
        sb.append(this.f2703l);
        String string = sb.toString();
        kotlin.jvm.internal.l.e("sb.toString()", string);
        return string;
    }
}
