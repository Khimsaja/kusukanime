package w0;

import O.C0486d;
import O.C0510p;
import O.C0519u;
import O.InterfaceC0498j;
import android.view.ViewGroup;
import b1.AbstractC0703b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m.C1472B;
import m.C1504y;
import y0.C2349D;
import z0.q1;

/* renamed from: w0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2169D implements InterfaceC0498j {

    /* renamed from: k, reason: collision with root package name */
    public final C2349D f16816k;

    /* renamed from: l, reason: collision with root package name */
    public O.r f16817l;

    /* renamed from: m, reason: collision with root package name */
    public d0 f16818m;

    /* renamed from: n, reason: collision with root package name */
    public int f16819n;

    /* renamed from: o, reason: collision with root package name */
    public int f16820o;

    /* renamed from: x, reason: collision with root package name */
    public int f16829x;

    /* renamed from: y, reason: collision with root package name */
    public int f16830y;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f16821p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final HashMap f16822q = new HashMap();

    /* renamed from: r, reason: collision with root package name */
    public final C2206y f16823r = new C2206y(this);

    /* renamed from: s, reason: collision with root package name */
    public final C2204w f16824s = new C2204w(this);

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f16825t = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    public final c0 f16826u = new c0();

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f16827v = new LinkedHashMap();

    /* renamed from: w, reason: collision with root package name */
    public final Q.d f16828w = new Q.d(new Object[16]);

    /* renamed from: z, reason: collision with root package name */
    public final String f16831z = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public C2169D(C2349D c2349d, d0 d0Var) {
        this.f16816k = c2349d;
        this.f16818m = d0Var;
    }

    public static C0519u i(C0519u c0519u, C2349D c2349d, boolean z7, O.r rVar, W.a aVar) {
        if (c0519u == null || c0519u.f7190B) {
            ViewGroup.LayoutParams layoutParams = q1.a;
            c0519u = new C0519u(rVar, new B2.l(c2349d));
        }
        if (!z7) {
            c0519u.j(aVar);
            return c0519u;
        }
        C0510p c0510p = c0519u.f7189A;
        c0510p.f7152y = 100;
        c0510p.f7151x = true;
        c0519u.j(aVar);
        if (c0510p.f7119E || c0510p.f7152y != 100) {
            C0486d.T("Cannot disable reuse from root if it was caused by other groups");
            throw null;
        }
        c0510p.f7152y = -1;
        c0510p.f7151x = false;
        return c0519u;
    }

    @Override // O.InterfaceC0498j
    public final void a() {
        f(false);
    }

    @Override // O.InterfaceC0498j
    public final void b() {
        C2349D c2349d = this.f16816k;
        c2349d.f17682v = true;
        HashMap map = this.f16821p;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            C0519u c0519u = ((C2203v) it.next()).f16880c;
            if (c0519u != null) {
                c0519u.l();
            }
        }
        c2349d.N();
        c2349d.f17682v = false;
        map.clear();
        this.f16822q.clear();
        this.f16830y = 0;
        this.f16829x = 0;
        this.f16825t.clear();
        e();
    }

    @Override // O.InterfaceC0498j
    public final void c() {
        f(true);
    }

    public final void d(int i7) {
        boolean z7;
        boolean z8 = false;
        this.f16829x = 0;
        int i8 = (((Q.a) this.f16816k.p()).f7821k.f7829m - this.f16830y) - 1;
        if (i7 <= i8) {
            this.f16826u.clear();
            if (i7 <= i8) {
                int i9 = i7;
                while (true) {
                    Object obj = this.f16821p.get((C2349D) ((Q.a) this.f16816k.p()).get(i9));
                    kotlin.jvm.internal.l.c(obj);
                    this.f16826u.f16860k.add(((C2203v) obj).a);
                    if (i9 == i8) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f16818m.d(this.f16826u);
            Y.h hVarC = Y.s.c();
            e4.k kVarF = hVarC != null ? hVarC.f() : null;
            Y.h hVarD = Y.s.d(hVarC);
            z7 = false;
            while (i8 >= i7) {
                try {
                    C2349D c2349d = (C2349D) ((Q.a) this.f16816k.p()).get(i8);
                    Object obj2 = this.f16821p.get(c2349d);
                    kotlin.jvm.internal.l.c(obj2);
                    C2203v c2203v = (C2203v) obj2;
                    Object obj3 = c2203v.a;
                    if (this.f16826u.f16860k.contains(obj3)) {
                        this.f16829x++;
                        if (((Boolean) c2203v.f16883f.getValue()).booleanValue()) {
                            y0.K k7 = c2349d.f17661H;
                            k7.f17761r.f17739u = 3;
                            y0.I i10 = k7.f17762s;
                            if (i10 != null) {
                                i10.f17712s = 3;
                            }
                            c2203v.f16883f.setValue(Boolean.FALSE);
                            z7 = true;
                        }
                    } else {
                        C2349D c2349d2 = this.f16816k;
                        c2349d2.f17682v = true;
                        this.f16821p.remove(c2349d);
                        C0519u c0519u = c2203v.f16880c;
                        if (c0519u != null) {
                            c0519u.l();
                        }
                        this.f16816k.O(i8, 1);
                        c2349d2.f17682v = false;
                    }
                    this.f16822q.remove(obj3);
                    i8--;
                } catch (Throwable th) {
                    Y.s.f(hVarC, hVarD, kVarF);
                    throw th;
                }
            }
            Y.s.f(hVarC, hVarD, kVarF);
        } else {
            z7 = false;
        }
        if (z7) {
            synchronized (Y.o.f10002b) {
                C1472B c1472b = ((Y.c) Y.o.f10009i.get()).f9968h;
                if (c1472b != null) {
                    if (c1472b.h()) {
                        z8 = true;
                    }
                }
            }
            if (z8) {
                Y.o.a();
            }
        }
        e();
    }

    public final void e() {
        int i7 = ((Q.a) this.f16816k.p()).f7821k.f7829m;
        HashMap map = this.f16821p;
        if (map.size() != i7) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + map.size() + ") and the children count on the SubcomposeLayout (" + i7 + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((i7 - this.f16829x) - this.f16830y < 0) {
            StringBuilder sbP = AbstractC0703b.p(i7, "Incorrect state. Total children ", ". Reusable children ");
            sbP.append(this.f16829x);
            sbP.append(". Precomposed children ");
            sbP.append(this.f16830y);
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        HashMap map2 = this.f16825t;
        if (map2.size() == this.f16830y) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f16830y + ". Map size " + map2.size()).toString());
    }

    public final void f(boolean z7) {
        this.f16830y = 0;
        this.f16825t.clear();
        C2349D c2349d = this.f16816k;
        int i7 = ((Q.a) c2349d.p()).f7821k.f7829m;
        if (this.f16829x != i7) {
            this.f16829x = i7;
            Y.h hVarC = Y.s.c();
            e4.k kVarF = hVarC != null ? hVarC.f() : null;
            Y.h hVarD = Y.s.d(hVarC);
            for (int i8 = 0; i8 < i7; i8++) {
                try {
                    C2349D c2349d2 = (C2349D) ((Q.a) c2349d.p()).get(i8);
                    C2203v c2203v = (C2203v) this.f16821p.get(c2349d2);
                    if (c2203v != null && ((Boolean) c2203v.f16883f.getValue()).booleanValue()) {
                        y0.K k7 = c2349d2.f17661H;
                        k7.f17761r.f17739u = 3;
                        y0.I i9 = k7.f17762s;
                        if (i9 != null) {
                            i9.f17712s = 3;
                        }
                        if (z7) {
                            C0519u c0519u = c2203v.f16880c;
                            if (c0519u != null) {
                                c0519u.k();
                            }
                            c2203v.f16883f = C0486d.K(Boolean.FALSE, O.T.f7049p);
                        } else {
                            c2203v.f16883f.setValue(Boolean.FALSE);
                        }
                        c2203v.a = X.a;
                    }
                } catch (Throwable th) {
                    Y.s.f(hVarC, hVarD, kVarF);
                    throw th;
                }
            }
            Y.s.f(hVarC, hVarD, kVarF);
            this.f16822q.clear();
        }
        e();
    }

    public final Y g(Object obj, e4.n nVar) {
        C2349D c2349d = this.f16816k;
        if (!c2349d.E()) {
            return new C2167B();
        }
        e();
        if (!this.f16822q.containsKey(obj)) {
            this.f16827v.remove(obj);
            HashMap map = this.f16825t;
            Object objJ = map.get(obj);
            if (objJ == null) {
                objJ = j(obj);
                if (objJ != null) {
                    int iJ = ((Q.a) c2349d.p()).f7821k.j(objJ);
                    int i7 = ((Q.a) c2349d.p()).f7821k.f7829m;
                    c2349d.f17682v = true;
                    c2349d.I(iJ, i7, 1);
                    c2349d.f17682v = false;
                    this.f16830y++;
                } else {
                    int i8 = ((Q.a) c2349d.p()).f7821k.f7829m;
                    C2349D c2349d2 = new C2349D(2);
                    c2349d.f17682v = true;
                    c2349d.x(i8, c2349d2);
                    c2349d.f17682v = false;
                    this.f16830y++;
                    objJ = c2349d2;
                }
                map.put(obj, objJ);
            }
            h((C2349D) objJ, obj, nVar);
        }
        return new C2168C(this, obj);
    }

    public final void h(C2349D c2349d, Object obj, e4.n nVar) {
        boolean z7;
        HashMap map = this.f16821p;
        Object obj2 = map.get(c2349d);
        Object obj3 = obj2;
        if (obj2 == null) {
            W.a aVar = AbstractC2190h.a;
            C2203v c2203v = new C2203v();
            c2203v.a = obj;
            c2203v.f16879b = aVar;
            c2203v.f16880c = null;
            c2203v.f16883f = C0486d.K(Boolean.TRUE, O.T.f7049p);
            map.put(c2349d, c2203v);
            obj3 = c2203v;
        }
        C2203v c2203v2 = (C2203v) obj3;
        C0519u c0519u = c2203v2.f16880c;
        if (c0519u != null) {
            synchronized (c0519u.f7194n) {
                z7 = ((C1504y) c0519u.f7204x.f741l).f12943e > 0;
            }
        } else {
            z7 = true;
        }
        if (c2203v2.f16879b != nVar || z7 || c2203v2.f16881d) {
            c2203v2.f16879b = nVar;
            Y.h hVarC = Y.s.c();
            e4.k kVarF = hVarC != null ? hVarC.f() : null;
            Y.h hVarD = Y.s.d(hVarC);
            try {
                C2349D c2349d2 = this.f16816k;
                c2349d2.f17682v = true;
                e4.n nVar2 = c2203v2.f16879b;
                C0519u c0519u2 = c2203v2.f16880c;
                O.r rVar = this.f16817l;
                if (rVar == null) {
                    throw new IllegalStateException("parent composition reference not set");
                }
                c2203v2.f16880c = i(c0519u2, c2349d, c2203v2.f16882e, rVar, new W.a(true, -1750409193, new H.M(17, c2203v2, nVar2)));
                c2203v2.f16882e = false;
                c2349d2.f17682v = false;
                Y.s.f(hVarC, hVarD, kVarF);
                c2203v2.f16881d = false;
            } catch (Throwable th) {
                Y.s.f(hVarC, hVarD, kVarF);
                throw th;
            }
        }
    }

    public final C2349D j(Object obj) {
        HashMap map;
        int i7;
        if (this.f16829x == 0) {
            return null;
        }
        C2349D c2349d = this.f16816k;
        int i8 = ((Q.a) c2349d.p()).f7821k.f7829m - this.f16830y;
        int i9 = i8 - this.f16829x;
        int i10 = i8 - 1;
        int i11 = i10;
        while (true) {
            map = this.f16821p;
            if (i11 < i9) {
                i7 = -1;
                break;
            }
            Object obj2 = map.get((C2349D) ((Q.a) c2349d.p()).get(i11));
            kotlin.jvm.internal.l.c(obj2);
            if (kotlin.jvm.internal.l.a(((C2203v) obj2).a, obj)) {
                i7 = i11;
                break;
            }
            i11--;
        }
        if (i7 == -1) {
            while (i10 >= i9) {
                Object obj3 = map.get((C2349D) ((Q.a) c2349d.p()).get(i10));
                kotlin.jvm.internal.l.c(obj3);
                C2203v c2203v = (C2203v) obj3;
                Object obj4 = c2203v.a;
                if (obj4 == X.a || this.f16818m.e(obj, obj4)) {
                    c2203v.a = obj;
                    i11 = i10;
                    i7 = i11;
                    break;
                }
                i10--;
            }
            i11 = i10;
        }
        if (i7 == -1) {
            return null;
        }
        if (i11 != i9) {
            c2349d.f17682v = true;
            c2349d.I(i11, i9, 1);
            c2349d.f17682v = false;
        }
        this.f16829x--;
        C2349D c2349d2 = (C2349D) ((Q.a) c2349d.p()).get(i9);
        Object obj5 = map.get(c2349d2);
        kotlin.jvm.internal.l.c(obj5);
        C2203v c2203v2 = (C2203v) obj5;
        c2203v2.f16883f = C0486d.K(Boolean.TRUE, O.T.f7049p);
        c2203v2.f16882e = true;
        c2203v2.f16881d = true;
        return c2349d2;
    }
}
