package G2;

import D.r0;
import K5.Y;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.EnumC0689p;
import androidx.lifecycle.InterfaceC0694v;
import androidx.lifecycle.V;
import b1.AbstractC0703b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: A, reason: collision with root package name */
    public int f2629A;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f2630B;

    /* renamed from: C, reason: collision with root package name */
    public final K5.M f2631C;

    /* renamed from: D, reason: collision with root package name */
    public final K5.H f2632D;
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f2633b;

    /* renamed from: c, reason: collision with root package name */
    public B f2634c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f2635d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable[] f2636e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2637f;

    /* renamed from: g, reason: collision with root package name */
    public final P3.l f2638g;

    /* renamed from: h, reason: collision with root package name */
    public final Y f2639h;

    /* renamed from: i, reason: collision with root package name */
    public final Y f2640i;

    /* renamed from: j, reason: collision with root package name */
    public final K5.I f2641j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f2642k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f2643l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f2644m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f2645n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0694v f2646o;

    /* renamed from: p, reason: collision with root package name */
    public s f2647p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f2648q;

    /* renamed from: r, reason: collision with root package name */
    public EnumC0689p f2649r;

    /* renamed from: s, reason: collision with root package name */
    public final C0177n f2650s;

    /* renamed from: t, reason: collision with root package name */
    public final C0180q f2651t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2652u;

    /* renamed from: v, reason: collision with root package name */
    public final P f2653v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f2654w;

    /* renamed from: x, reason: collision with root package name */
    public kotlin.jvm.internal.m f2655x;

    /* renamed from: y, reason: collision with root package name */
    public D.E f2656y;

    /* renamed from: z, reason: collision with root package name */
    public final LinkedHashMap f2657z;

    public E(Context context) {
        Object next;
        kotlin.jvm.internal.l.f("context", context);
        this.a = context;
        Iterator it = y5.k.S(C0165b.f2685n, context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f2633b = (Activity) next;
        this.f2638g = new P3.l();
        P3.y yVar = P3.y.f7779k;
        this.f2639h = K5.N.b(yVar);
        Y yB = K5.N.b(yVar);
        this.f2640i = yB;
        this.f2641j = new K5.I(yB);
        this.f2642k = new LinkedHashMap();
        this.f2643l = new LinkedHashMap();
        this.f2644m = new LinkedHashMap();
        this.f2645n = new LinkedHashMap();
        this.f2648q = new CopyOnWriteArrayList();
        this.f2649r = EnumC0689p.f10737l;
        this.f2650s = new C0177n(0, this);
        this.f2651t = new C0180q(this);
        this.f2652u = true;
        P p7 = new P();
        this.f2653v = p7;
        this.f2654w = new LinkedHashMap();
        this.f2657z = new LinkedHashMap();
        p7.a(new D(p7));
        p7.a(new C0166c(this.a));
        this.f2630B = new ArrayList();
        z1.c.C(new B.e(7, this));
        K5.M mA = K5.N.a(2, J5.c.f4300l);
        this.f2631C = mA;
        this.f2632D = new K5.H(mA);
    }

    public static y e(y yVar, int i7, boolean z7) {
        B b4;
        if (yVar.f2762p == i7) {
            return yVar;
        }
        if (yVar instanceof B) {
            b4 = (B) yVar;
        } else {
            b4 = yVar.f2758l;
            kotlin.jvm.internal.l.c(b4);
        }
        return b4.p(i7, b4, z7);
    }

    public static void m(E e7, String str, H h7, int i7) {
        Object obj = null;
        if ((i7 & 2) != 0) {
            h7 = null;
        }
        e7.getClass();
        kotlin.jvm.internal.l.f("route", str);
        int i8 = y.f2756r;
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        kotlin.jvm.internal.l.b(uri);
        B2.l lVar = new B2.l(uri, obj, obj, 5);
        if (e7.f2634c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + lVar + ". Navigation graph has not been set for NavController " + e7 + '.').toString());
        }
        B bI = e7.i(e7.f2638g);
        x xVarQ = bI.q(lVar, true, true, bI);
        if (xVarQ == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + lVar + " cannot be found in the navigation graph " + e7.f2634c);
        }
        Bundle bundle = xVarQ.f2752l;
        y yVar = xVarQ.f2751k;
        Bundle bundleH = yVar.h(bundle);
        if (bundleH == null) {
            bundleH = new Bundle();
        }
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleH.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        e7.k(yVar, bundleH, h7);
    }

    public static /* synthetic */ void q(E e7, C0174k c0174k) {
        e7.p(c0174k, false, new P3.l());
    }

    public final void a(y yVar, Bundle bundle, C0174k c0174k, List list) {
        Object objPrevious;
        Object objPrevious2;
        y yVar2 = c0174k.f2703l;
        boolean z7 = yVar2 instanceof InterfaceC0167d;
        P3.l lVar = this.f2638g;
        if (!z7) {
            while (!lVar.isEmpty() && (((C0174k) lVar.last()).f2703l instanceof InterfaceC0167d) && o(((C0174k) lVar.last()).f2703l.f2762p, true, false)) {
            }
        }
        P3.l lVar2 = new P3.l();
        boolean z8 = yVar instanceof B;
        Context context = this.a;
        Object obj = null;
        if (z8) {
            y yVar3 = yVar2;
            do {
                kotlin.jvm.internal.l.c(yVar3);
                yVar3 = yVar3.f2758l;
                if (yVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        } else {
                            objPrevious2 = listIterator.previous();
                            if (kotlin.jvm.internal.l.a(((C0174k) objPrevious2).f2703l, yVar3)) {
                                break;
                            }
                        }
                    }
                    C0174k c0174kM = (C0174k) objPrevious2;
                    if (c0174kM == null) {
                        c0174kM = A.e.m(context, yVar3, bundle, h(), this.f2647p);
                    }
                    lVar2.addFirst(c0174kM);
                    if (!lVar.isEmpty() && ((C0174k) lVar.last()).f2703l == yVar3) {
                        q(this, (C0174k) lVar.last());
                    }
                }
                if (yVar3 == null) {
                    break;
                }
            } while (yVar3 != yVar);
        }
        y yVar4 = lVar2.isEmpty() ? yVar2 : ((C0174k) lVar2.first()).f2703l;
        while (yVar4 != null && d(yVar4.f2762p) != yVar4) {
            yVar4 = yVar4.f2758l;
            if (yVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator2.previous();
                        if (kotlin.jvm.internal.l.a(((C0174k) objPrevious).f2703l, yVar4)) {
                            break;
                        }
                    }
                }
                C0174k c0174kM2 = (C0174k) objPrevious;
                if (c0174kM2 == null) {
                    c0174kM2 = A.e.m(context, yVar4, yVar4.h(bundle2), h(), this.f2647p);
                }
                lVar2.addFirst(c0174kM2);
            }
        }
        if (!lVar2.isEmpty()) {
            yVar2 = ((C0174k) lVar2.first()).f2703l;
        }
        while (!lVar.isEmpty() && (((C0174k) lVar.last()).f2703l instanceof B)) {
            y yVar5 = ((C0174k) lVar.last()).f2703l;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.NavGraph", yVar5);
            if (((B) yVar5).f2621s.b(yVar2.f2762p) != null) {
                break;
            } else {
                q(this, (C0174k) lVar.last());
            }
        }
        C0174k c0174k2 = (C0174k) (lVar.isEmpty() ? null : lVar.f7766l[lVar.f7765k]);
        if (c0174k2 == null) {
            c0174k2 = (C0174k) (lVar2.isEmpty() ? null : lVar2.f7766l[lVar2.f7765k]);
        }
        if (!kotlin.jvm.internal.l.a(c0174k2 != null ? c0174k2.f2703l : null, this.f2634c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                y yVar6 = ((C0174k) objPrevious3).f2703l;
                B b4 = this.f2634c;
                kotlin.jvm.internal.l.c(b4);
                if (kotlin.jvm.internal.l.a(yVar6, b4)) {
                    obj = objPrevious3;
                    break;
                }
            }
            C0174k c0174kM3 = (C0174k) obj;
            if (c0174kM3 == null) {
                B b7 = this.f2634c;
                kotlin.jvm.internal.l.c(b7);
                B b8 = this.f2634c;
                kotlin.jvm.internal.l.c(b8);
                c0174kM3 = A.e.m(context, b7, b8.h(bundle), h(), this.f2647p);
            }
            lVar2.addFirst(c0174kM3);
        }
        Iterator it = lVar2.iterator();
        while (it.hasNext()) {
            C0174k c0174k3 = (C0174k) it.next();
            Object obj2 = this.f2654w.get(this.f2653v.b(c0174k3.f2703l.f2757k));
            if (obj2 == null) {
                throw new IllegalStateException(AbstractC0703b.m(new StringBuilder("NavigatorBackStack for "), yVar.f2757k, " should already be created").toString());
            }
            ((C0178o) obj2).a(c0174k3);
        }
        lVar.addAll(lVar2);
        lVar.addLast(c0174k);
        Iterator it2 = P3.q.H0(lVar2, c0174k).iterator();
        while (it2.hasNext()) {
            C0174k c0174k4 = (C0174k) it2.next();
            B b9 = c0174k4.f2703l.f2758l;
            if (b9 != null) {
                j(c0174k4, f(b9.f2762p));
            }
        }
    }

    public final boolean b() {
        P3.l lVar;
        while (true) {
            lVar = this.f2638g;
            if (lVar.isEmpty() || !(((C0174k) lVar.last()).f2703l instanceof B)) {
                break;
            }
            q(this, (C0174k) lVar.last());
        }
        C0174k c0174k = (C0174k) lVar.p();
        ArrayList arrayList = this.f2630B;
        if (c0174k != null) {
            arrayList.add(c0174k);
        }
        this.f2629A++;
        u();
        int i7 = this.f2629A - 1;
        this.f2629A = i7;
        if (i7 == 0) {
            ArrayList arrayListU0 = P3.q.U0(arrayList);
            arrayList.clear();
            Iterator it = arrayListU0.iterator();
            while (it.hasNext()) {
                C0174k c0174k2 = (C0174k) it.next();
                Iterator it2 = this.f2648q.iterator();
                if (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                    y yVar = c0174k2.f2703l;
                    c0174k2.g();
                    throw null;
                }
                this.f2631C.a(c0174k2);
            }
            ArrayList arrayListU02 = P3.q.U0(lVar);
            Y y7 = this.f2639h;
            y7.getClass();
            y7.i(null, arrayListU02);
            ArrayList arrayListR = r();
            Y y8 = this.f2640i;
            y8.getClass();
            y8.i(null, arrayListR);
        }
        return c0174k != null;
    }

    public final boolean c(ArrayList arrayList, y yVar, boolean z7, boolean z8) {
        E e7;
        boolean z9;
        String str;
        kotlin.jvm.internal.t tVar = new kotlin.jvm.internal.t();
        P3.l lVar = new P3.l();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                e7 = this;
                z9 = z8;
                break;
            }
            O o7 = (O) it.next();
            kotlin.jvm.internal.t tVar2 = new kotlin.jvm.internal.t();
            C0174k c0174k = (C0174k) this.f2638g.last();
            e7 = this;
            z9 = z8;
            e7.f2656y = new D.E(tVar2, tVar, e7, z9, lVar);
            o7.e(c0174k, z9);
            e7.f2656y = null;
            if (!tVar2.f12716k) {
                break;
            }
            z8 = z9;
        }
        if (z9) {
            LinkedHashMap linkedHashMap = e7.f2644m;
            if (!z7) {
                y5.e eVar = new y5.e(new Z3.h(y5.k.S(C0165b.f2687p, yVar), new C0179p(this, 0)));
                while (eVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((y) eVar.next()).f2762p);
                    C0176m c0176m = (C0176m) (lVar.isEmpty() ? null : lVar.f7766l[lVar.f7765k]);
                    linkedHashMap.put(numValueOf, c0176m != null ? c0176m.f2714k : null);
                }
            }
            if (!lVar.isEmpty()) {
                C0176m c0176m2 = (C0176m) lVar.first();
                y5.e eVar2 = new y5.e(new Z3.h(y5.k.S(C0165b.f2688q, d(c0176m2.f2715l)), new C0179p(this, 1)));
                while (true) {
                    boolean zHasNext = eVar2.hasNext();
                    str = c0176m2.f2714k;
                    if (!zHasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((y) eVar2.next()).f2762p), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    e7.f2645n.put(str, lVar);
                }
            }
        }
        v();
        return tVar.f12716k;
    }

    public final y d(int i7) {
        y yVar;
        B b4 = this.f2634c;
        if (b4 == null) {
            return null;
        }
        if (b4.f2762p == i7) {
            return b4;
        }
        C0174k c0174k = (C0174k) this.f2638g.p();
        if (c0174k == null || (yVar = c0174k.f2703l) == null) {
            yVar = this.f2634c;
            kotlin.jvm.internal.l.c(yVar);
        }
        return e(yVar, i7, false);
    }

    public final C0174k f(int i7) {
        Object objPrevious;
        P3.l lVar = this.f2638g;
        ListIterator listIterator = lVar.listIterator(lVar.a());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((C0174k) objPrevious).f2703l.f2762p == i7) {
                break;
            }
        }
        C0174k c0174k = (C0174k) objPrevious;
        if (c0174k != null) {
            return c0174k;
        }
        StringBuilder sbP = AbstractC0703b.p(i7, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        C0174k c0174k2 = (C0174k) lVar.p();
        sbP.append(c0174k2 != null ? c0174k2.f2703l : null);
        throw new IllegalArgumentException(sbP.toString().toString());
    }

    public final B g() {
        B b4 = this.f2634c;
        if (b4 == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.NavGraph", b4);
        return b4;
    }

    public final EnumC0689p h() {
        return this.f2646o == null ? EnumC0689p.f10738m : this.f2649r;
    }

    public final B i(P3.l lVar) {
        y yVar;
        C0174k c0174k = (C0174k) lVar.p();
        if (c0174k == null || (yVar = c0174k.f2703l) == null) {
            yVar = this.f2634c;
            kotlin.jvm.internal.l.c(yVar);
        }
        if (yVar instanceof B) {
            return (B) yVar;
        }
        B b4 = yVar.f2758l;
        kotlin.jvm.internal.l.c(b4);
        return b4;
    }

    public final void j(C0174k c0174k, C0174k c0174k2) {
        this.f2642k.put(c0174k, c0174k2);
        LinkedHashMap linkedHashMap = this.f2643l;
        if (linkedHashMap.get(c0174k2) == null) {
            linkedHashMap.put(c0174k2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c0174k2);
        kotlin.jvm.internal.l.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0352 A[LOOP:1: B:154:0x034c->B:156:0x0352, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0126 A[EDGE_INSN: B:187:0x0126->B:64:0x0126 BREAK  A[LOOP:8: B:15:0x004d->B:62:0x011b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011b A[LOOP:8: B:15:0x004d->B:62:0x011b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(G2.y r29, android.os.Bundle r30, G2.H r31) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.E.k(G2.y, android.os.Bundle, G2.H):void");
    }

    public final void l(String str, e4.k kVar) {
        kotlin.jvm.internal.l.f("route", str);
        m(this, str, AbstractC0170g.f(kVar), 4);
    }

    public final void n() {
        P3.l lVar = this.f2638g;
        if (lVar.isEmpty()) {
            return;
        }
        C0174k c0174k = (C0174k) lVar.p();
        y yVar = c0174k != null ? c0174k.f2703l : null;
        kotlin.jvm.internal.l.c(yVar);
        if (o(yVar.f2762p, true, false)) {
            b();
        }
    }

    public final boolean o(int i7, boolean z7, boolean z8) {
        y yVar;
        P3.l lVar = this.f2638g;
        if (lVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = P3.q.I0(lVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                yVar = null;
                break;
            }
            yVar = ((C0174k) it.next()).f2703l;
            O oB = this.f2653v.b(yVar.f2757k);
            if (z7 || yVar.f2762p != i7) {
                arrayList.add(oB);
            }
            if (yVar.f2762p == i7) {
                break;
            }
        }
        if (yVar != null) {
            return c(arrayList, yVar, z7, z8);
        }
        int i8 = y.f2756r;
        Log.i("NavController", "Ignoring popBackStack to destination " + AbstractC0170g.a(this.a, i7) + " as it was not found on the current back stack");
        return false;
    }

    public final void p(C0174k c0174k, boolean z7, P3.l lVar) {
        s sVar;
        K5.I i7;
        Set set;
        P3.l lVar2 = this.f2638g;
        C0174k c0174k2 = (C0174k) lVar2.last();
        if (!kotlin.jvm.internal.l.a(c0174k2, c0174k)) {
            throw new IllegalStateException(("Attempted to pop " + c0174k.f2703l + ", which is not the top of the back stack (" + c0174k2.f2703l + ')').toString());
        }
        P3.v.i0(lVar2);
        C0178o c0178o = (C0178o) this.f2654w.get(this.f2653v.b(c0174k2.f2703l.f2757k));
        boolean z8 = true;
        if ((c0178o == null || (i7 = c0178o.f2724f) == null || (set = (Set) ((Y) i7.f4751k).getValue()) == null || !set.contains(c0174k2)) && !this.f2643l.containsKey(c0174k2)) {
            z8 = false;
        }
        EnumC0689p enumC0689p = c0174k2.f2709r.f10744c;
        EnumC0689p enumC0689p2 = EnumC0689p.f10738m;
        if (enumC0689p.compareTo(enumC0689p2) >= 0) {
            if (z7) {
                c0174k2.h(enumC0689p2);
                lVar.addFirst(new C0176m(c0174k2));
            }
            if (z8) {
                c0174k2.h(enumC0689p2);
            } else {
                c0174k2.h(EnumC0689p.f10736k);
                t(c0174k2);
            }
        }
        if (z7 || z8 || (sVar = this.f2647p) == null) {
            return;
        }
        String str = c0174k2.f2707p;
        kotlin.jvm.internal.l.f("backStackEntryId", str);
        V v5 = (V) sVar.f2732b.remove(str);
        if (v5 != null) {
            v5.a();
        }
    }

    public final ArrayList r() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f2654w.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((Y) ((C0178o) it.next()).f2724f.f4751k).getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C0174k c0174k = (C0174k) obj;
                if (!arrayList.contains(c0174k) && c0174k.f2712u.compareTo(EnumC0689p.f10739n) < 0) {
                    arrayList2.add(obj);
                }
            }
            P3.v.e0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f2638g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C0174k c0174k2 = (C0174k) next;
            if (!arrayList.contains(c0174k2) && c0174k2.f2712u.compareTo(EnumC0689p.f10739n) >= 0) {
                arrayList3.add(next);
            }
        }
        P3.v.e0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((C0174k) next2).f2703l instanceof B)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean s(int i7, Bundle bundle, H h7) {
        y yVarG;
        C0174k c0174k;
        y yVar;
        LinkedHashMap linkedHashMap = this.f2644m;
        if (!linkedHashMap.containsKey(Integer.valueOf(i7))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i7));
        Collection collectionValues = linkedHashMap.values();
        kotlin.jvm.internal.l.f("<this>", collectionValues);
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l.a((String) it.next(), str)) {
                it.remove();
            }
        }
        P3.l lVar = (P3.l) kotlin.jvm.internal.B.c(this.f2645n).remove(str);
        ArrayList arrayList = new ArrayList();
        C0174k c0174k2 = (C0174k) this.f2638g.p();
        if (c0174k2 == null || (yVarG = c0174k2.f2703l) == null) {
            yVarG = g();
        }
        if (lVar != null) {
            Iterator it2 = lVar.iterator();
            while (it2.hasNext()) {
                C0176m c0176m = (C0176m) it2.next();
                y yVarE = e(yVarG, c0176m.f2715l, true);
                Context context = this.a;
                if (yVarE == null) {
                    int i8 = y.f2756r;
                    throw new IllegalStateException(("Restore State failed: destination " + AbstractC0170g.a(context, c0176m.f2715l) + " cannot be found from the current destination " + yVarG).toString());
                }
                arrayList.add(c0176m.a(context, yVarE, h(), this.f2647p));
                yVarG = yVarE;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!(((C0174k) next).f2703l instanceof B)) {
                arrayList3.add(next);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it4.hasNext()) {
                break;
            }
            C0174k c0174k3 = (C0174k) it4.next();
            List list = (List) P3.q.B0(arrayList2);
            if (list != null && (c0174k = (C0174k) P3.q.A0(list)) != null && (yVar = c0174k.f2703l) != null) {
                str2 = yVar.f2757k;
            }
            if (kotlin.jvm.internal.l.a(str2, c0174k3.f2703l.f2757k)) {
                list.add(c0174k3);
            } else {
                arrayList2.add(P3.r.M(c0174k3));
            }
        }
        kotlin.jvm.internal.t tVar = new kotlin.jvm.internal.t();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List list2 = (List) it5.next();
            O oB = this.f2653v.b(((C0174k) P3.q.r0(list2)).f2703l.f2757k);
            Bundle bundle2 = bundle;
            this.f2655x = new r0(tVar, arrayList, new kotlin.jvm.internal.v(), this, bundle2, 2);
            oB.d(list2, h7);
            this.f2655x = null;
            bundle = bundle2;
        }
        return tVar.f12716k;
    }

    public final void t(C0174k c0174k) {
        kotlin.jvm.internal.l.f("child", c0174k);
        C0174k c0174k2 = (C0174k) this.f2642k.remove(c0174k);
        if (c0174k2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f2643l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c0174k2);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            C0178o c0178o = (C0178o) this.f2654w.get(this.f2653v.b(c0174k2.f2703l.f2757k));
            if (c0178o != null) {
                c0178o.b(c0174k2);
            }
            linkedHashMap.remove(c0174k2);
        }
    }

    public final void u() {
        AtomicInteger atomicInteger;
        K5.I i7;
        Set set;
        ArrayList arrayListU0 = P3.q.U0(this.f2638g);
        if (arrayListU0.isEmpty()) {
            return;
        }
        y yVar = ((C0174k) P3.q.A0(arrayListU0)).f2703l;
        ArrayList arrayList = new ArrayList();
        if (yVar instanceof InterfaceC0167d) {
            Iterator it = P3.q.I0(arrayListU0).iterator();
            while (it.hasNext()) {
                y yVar2 = ((C0174k) it.next()).f2703l;
                arrayList.add(yVar2);
                if (!(yVar2 instanceof InterfaceC0167d) && !(yVar2 instanceof B)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (C0174k c0174k : P3.q.I0(arrayListU0)) {
            EnumC0689p enumC0689p = c0174k.f2712u;
            y yVar3 = c0174k.f2703l;
            if (yVar != null && yVar3.f2762p == yVar.f2762p) {
                EnumC0689p enumC0689p2 = EnumC0689p.f10740o;
                if (enumC0689p != enumC0689p2) {
                    C0178o c0178o = (C0178o) this.f2654w.get(this.f2653v.b(yVar3.f2757k));
                    if (kotlin.jvm.internal.l.a((c0178o == null || (i7 = c0178o.f2724f) == null || (set = (Set) ((Y) i7.f4751k).getValue()) == null) ? null : Boolean.valueOf(set.contains(c0174k)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f2643l.get(c0174k)) != null && atomicInteger.get() == 0)) {
                        map.put(c0174k, EnumC0689p.f10739n);
                    } else {
                        map.put(c0174k, enumC0689p2);
                    }
                }
                y yVar4 = (y) P3.q.t0(arrayList);
                if (yVar4 != null && yVar4.f2762p == yVar3.f2762p) {
                    P3.v.h0(arrayList);
                }
                yVar = yVar.f2758l;
            } else if (arrayList.isEmpty() || yVar3.f2762p != ((y) P3.q.r0(arrayList)).f2762p) {
                c0174k.h(EnumC0689p.f10738m);
            } else {
                y yVar5 = (y) P3.v.h0(arrayList);
                if (enumC0689p == EnumC0689p.f10740o) {
                    c0174k.h(EnumC0689p.f10739n);
                } else {
                    EnumC0689p enumC0689p3 = EnumC0689p.f10739n;
                    if (enumC0689p != enumC0689p3) {
                        map.put(c0174k, enumC0689p3);
                    }
                }
                B b4 = yVar5.f2758l;
                if (b4 != null && !arrayList.contains(b4)) {
                    arrayList.add(b4);
                }
            }
        }
        Iterator it2 = arrayListU0.iterator();
        while (it2.hasNext()) {
            C0174k c0174k2 = (C0174k) it2.next();
            EnumC0689p enumC0689p4 = (EnumC0689p) map.get(c0174k2);
            if (enumC0689p4 != null) {
                c0174k2.h(enumC0689p4);
            } else {
                c0174k2.i();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [e4.a, kotlin.jvm.internal.j] */
    public final void v() {
        int i7;
        boolean z7 = false;
        if (this.f2652u) {
            P3.l lVar = this.f2638g;
            if (lVar == null || !lVar.isEmpty()) {
                Iterator it = lVar.iterator();
                i7 = 0;
                while (it.hasNext()) {
                    if (!(((C0174k) it.next()).f2703l instanceof B) && (i7 = i7 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            } else {
                i7 = 0;
            }
            if (i7 > 1) {
                z7 = true;
            }
        }
        C0180q c0180q = this.f2651t;
        c0180q.a = z7;
        ?? r02 = c0180q.f11094c;
        if (r02 != 0) {
            r02.invoke();
        }
    }
}
