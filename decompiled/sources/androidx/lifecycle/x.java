package androidx.lifecycle;

import K5.Y;
import android.os.Looper;
import b1.AbstractC0703b;
import io.ktor.http.LinkHeader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import k.AbstractC1373e;
import k.C1369a;
import k.C1371c;

/* loaded from: classes.dex */
public final class x extends AbstractC0690q {
    public final boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    public C1369a f10743b = new C1369a();

    /* renamed from: c, reason: collision with root package name */
    public EnumC0689p f10744c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f10745d;

    /* renamed from: e, reason: collision with root package name */
    public int f10746e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10747f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10748g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f10749h;

    /* renamed from: i, reason: collision with root package name */
    public final Y f10750i;

    public x(InterfaceC0694v interfaceC0694v) {
        EnumC0689p enumC0689p = EnumC0689p.f10737l;
        this.f10744c = enumC0689p;
        this.f10749h = new ArrayList();
        this.f10745d = new WeakReference(interfaceC0694v);
        this.f10750i = K5.N.b(enumC0689p);
    }

    @Override // androidx.lifecycle.AbstractC0690q
    public final void a(InterfaceC0693u interfaceC0693u) {
        InterfaceC0692t c0681h;
        C0695w c0695w;
        InterfaceC0694v interfaceC0694v;
        ArrayList arrayList = this.f10749h;
        kotlin.jvm.internal.l.f("observer", interfaceC0693u);
        e("addObserver");
        EnumC0689p enumC0689p = this.f10744c;
        EnumC0689p enumC0689p2 = EnumC0689p.f10736k;
        if (enumC0689p != enumC0689p2) {
            enumC0689p2 = EnumC0689p.f10737l;
        }
        C0695w c0695w2 = new C0695w();
        HashMap map = y.a;
        boolean z7 = interfaceC0693u instanceof InterfaceC0692t;
        boolean z8 = interfaceC0693u instanceof InterfaceC0679f;
        if (z7 && z8) {
            c0681h = new C0681h((InterfaceC0679f) interfaceC0693u, (InterfaceC0692t) interfaceC0693u);
        } else if (z8) {
            c0681h = new C0681h((InterfaceC0679f) interfaceC0693u, (InterfaceC0692t) null);
        } else if (z7) {
            c0681h = (InterfaceC0692t) interfaceC0693u;
        } else {
            Class<?> cls = interfaceC0693u.getClass();
            if (y.b(cls) == 2) {
                Object obj = y.f10751b.get(cls);
                kotlin.jvm.internal.l.c(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    y.a((Constructor) list.get(0), interfaceC0693u);
                    throw null;
                }
                int size = list.size();
                InterfaceC0683j[] interfaceC0683jArr = new InterfaceC0683j[size];
                if (size > 0) {
                    y.a((Constructor) list.get(0), interfaceC0693u);
                    throw null;
                }
                c0681h = new C0678e(i, interfaceC0683jArr);
            } else {
                c0681h = new C0681h(interfaceC0693u);
            }
        }
        c0695w2.f10742b = c0681h;
        c0695w2.a = enumC0689p2;
        C1369a c1369a = this.f10743b;
        C1371c c1371c = (C1371c) c1369a.f12550o.get(interfaceC0693u);
        if (c1371c != null) {
            c0695w = c1371c.f12555l;
        } else {
            HashMap map2 = c1369a.f12550o;
            C1371c c1371c2 = new C1371c(interfaceC0693u, c0695w2);
            c1369a.f12549n++;
            C1371c c1371c3 = c1369a.f12547l;
            if (c1371c3 == null) {
                c1369a.f12546k = c1371c2;
                c1369a.f12547l = c1371c2;
            } else {
                c1371c3.f12556m = c1371c2;
                c1371c2.f12557n = c1371c3;
                c1369a.f12547l = c1371c2;
            }
            map2.put(interfaceC0693u, c1371c2);
            c0695w = null;
        }
        if (c0695w == null && (interfaceC0694v = (InterfaceC0694v) this.f10745d.get()) != null) {
            i = (this.f10746e != 0 || this.f10747f) ? 1 : 0;
            EnumC0689p enumC0689pD = d(interfaceC0693u);
            this.f10746e++;
            while (c0695w2.a.compareTo(enumC0689pD) < 0 && this.f10743b.f12550o.containsKey(interfaceC0693u)) {
                arrayList.add(c0695w2.a);
                C0686m c0686m = EnumC0688o.Companion;
                EnumC0689p enumC0689p3 = c0695w2.a;
                c0686m.getClass();
                kotlin.jvm.internal.l.f("state", enumC0689p3);
                int iOrdinal = enumC0689p3.ordinal();
                EnumC0688o enumC0688o = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0688o.ON_RESUME : EnumC0688o.ON_START : EnumC0688o.ON_CREATE;
                if (enumC0688o == null) {
                    throw new IllegalStateException("no event up from " + c0695w2.a);
                }
                c0695w2.a(interfaceC0694v, enumC0688o);
                arrayList.remove(arrayList.size() - 1);
                enumC0689pD = d(interfaceC0693u);
            }
            if (i == 0) {
                i();
            }
            this.f10746e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0690q
    public final EnumC0689p b() {
        return this.f10744c;
    }

    @Override // androidx.lifecycle.AbstractC0690q
    public final void c(InterfaceC0693u interfaceC0693u) {
        kotlin.jvm.internal.l.f("observer", interfaceC0693u);
        e("removeObserver");
        C1369a c1369a = this.f10743b;
        C1371c c1371c = (C1371c) c1369a.f12550o.get(interfaceC0693u);
        if (c1371c != null) {
            c1369a.f12549n--;
            WeakHashMap weakHashMap = c1369a.f12548m;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((AbstractC1373e) it.next()).a(c1371c);
                }
            }
            C1371c c1371c2 = c1371c.f12557n;
            if (c1371c2 != null) {
                c1371c2.f12556m = c1371c.f12556m;
            } else {
                c1369a.f12546k = c1371c.f12556m;
            }
            C1371c c1371c3 = c1371c.f12556m;
            if (c1371c3 != null) {
                c1371c3.f12557n = c1371c2;
            } else {
                c1369a.f12547l = c1371c2;
            }
            c1371c.f12556m = null;
            c1371c.f12557n = null;
        }
        c1369a.f12550o.remove(interfaceC0693u);
    }

    public final EnumC0689p d(InterfaceC0693u interfaceC0693u) {
        HashMap map = this.f10743b.f12550o;
        C1371c c1371c = map.containsKey(interfaceC0693u) ? ((C1371c) map.get(interfaceC0693u)).f12557n : null;
        EnumC0689p enumC0689p = c1371c != null ? c1371c.f12555l.a : null;
        ArrayList arrayList = this.f10749h;
        EnumC0689p enumC0689p2 = arrayList.isEmpty() ? null : (EnumC0689p) arrayList.get(arrayList.size() - 1);
        EnumC0689p enumC0689p3 = this.f10744c;
        kotlin.jvm.internal.l.f("state1", enumC0689p3);
        if (enumC0689p == null || enumC0689p.compareTo(enumC0689p3) >= 0) {
            enumC0689p = enumC0689p3;
        }
        return (enumC0689p2 == null || enumC0689p2.compareTo(enumC0689p) >= 0) ? enumC0689p : enumC0689p2;
    }

    public final void e(String str) {
        j.a aVar;
        if (this.a) {
            if (j.a.f12199l != null) {
                aVar = j.a.f12199l;
            } else {
                synchronized (j.a.class) {
                    try {
                        if (j.a.f12199l == null) {
                            j.a.f12199l = new j.a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                aVar = j.a.f12199l;
            }
            ((j.a) aVar.f12200k).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0703b.j("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void f(EnumC0688o enumC0688o) {
        kotlin.jvm.internal.l.f("event", enumC0688o);
        e("handleLifecycleEvent");
        g(enumC0688o.a());
    }

    public final void g(EnumC0689p enumC0689p) {
        if (this.f10744c == enumC0689p) {
            return;
        }
        InterfaceC0694v interfaceC0694v = (InterfaceC0694v) this.f10745d.get();
        EnumC0689p enumC0689p2 = this.f10744c;
        kotlin.jvm.internal.l.f("current", enumC0689p2);
        kotlin.jvm.internal.l.f(LinkHeader.Rel.Next, enumC0689p);
        if (enumC0689p2 == EnumC0689p.f10737l && enumC0689p == EnumC0689p.f10736k) {
            throw new IllegalStateException(("State must be at least '" + EnumC0689p.f10738m + "' to be moved to '" + enumC0689p + "' in component " + interfaceC0694v).toString());
        }
        EnumC0689p enumC0689p3 = EnumC0689p.f10736k;
        if (enumC0689p2 == enumC0689p3 && enumC0689p2 != enumC0689p) {
            throw new IllegalStateException(("State is '" + enumC0689p3 + "' and cannot be moved to `" + enumC0689p + "` in component " + interfaceC0694v).toString());
        }
        this.f10744c = enumC0689p;
        if (this.f10747f || this.f10746e != 0) {
            this.f10748g = true;
            return;
        }
        this.f10747f = true;
        i();
        this.f10747f = false;
        if (this.f10744c == enumC0689p3) {
            this.f10743b = new C1369a();
        }
    }

    public final void h(EnumC0689p enumC0689p) {
        kotlin.jvm.internal.l.f("state", enumC0689p);
        e("setCurrentState");
        g(enumC0689p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r12.f10748g = false;
        r12.f10750i.h(r12.f10744c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.x.i():void");
    }
}
