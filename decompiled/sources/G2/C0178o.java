package G2;

import K5.Y;
import android.util.Log;
import b1.AbstractC0703b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: G2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178o {
    public final ReentrantLock a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f2720b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f2721c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2722d;

    /* renamed from: e, reason: collision with root package name */
    public final K5.I f2723e;

    /* renamed from: f, reason: collision with root package name */
    public final K5.I f2724f;

    /* renamed from: g, reason: collision with root package name */
    public final O f2725g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ E f2726h;

    public C0178o(E e7, O o7) {
        kotlin.jvm.internal.l.f("navigator", o7);
        this.f2726h = e7;
        this.a = new ReentrantLock(true);
        Y yB = K5.N.b(P3.y.f7779k);
        this.f2720b = yB;
        Y yB2 = K5.N.b(P3.A.f7737k);
        this.f2721c = yB2;
        this.f2723e = new K5.I(yB);
        this.f2724f = new K5.I(yB2);
        this.f2725g = o7;
    }

    public final void a(C0174k c0174k) {
        kotlin.jvm.internal.l.f("backStackEntry", c0174k);
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Y y7 = this.f2720b;
            ArrayList arrayListH0 = P3.q.H0((Collection) y7.getValue(), c0174k);
            y7.getClass();
            y7.i(null, arrayListH0);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(G2.C0174k r8) {
        /*
            r7 = this;
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.l.f(r0, r8)
            G2.E r0 = r7.f2726h
            java.util.LinkedHashMap r1 = r0.f2657z
            java.lang.Object r1 = r1.get(r8)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.l.a(r1, r2)
            K5.Y r2 = r7.f2721c
            java.lang.Object r3 = r2.getValue()
            java.util.Set r3 = (java.util.Set) r3
            java.util.LinkedHashSet r3 = P3.J.S(r3, r8)
            r4 = 0
            r2.i(r4, r3)
            java.util.LinkedHashMap r2 = r0.f2657z
            r2.remove(r8)
            P3.l r2 = r0.f2638g
            boolean r3 = r2.contains(r8)
            K5.Y r5 = r0.f2640i
            if (r3 != 0) goto L90
            r0.t(r8)
            androidx.lifecycle.x r3 = r8.f2709r
            androidx.lifecycle.p r3 = r3.f10744c
            androidx.lifecycle.p r6 = androidx.lifecycle.EnumC0689p.f10738m
            int r3 = r3.compareTo(r6)
            if (r3 < 0) goto L46
            androidx.lifecycle.p r3 = androidx.lifecycle.EnumC0689p.f10736k
            r8.h(r3)
        L46:
            java.lang.String r8 = r8.f2707p
            if (r2 == 0) goto L51
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L51
            goto L6a
        L51:
            java.util.Iterator r2 = r2.iterator()
        L55:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6a
            java.lang.Object r3 = r2.next()
            G2.k r3 = (G2.C0174k) r3
            java.lang.String r3 = r3.f2707p
            boolean r3 = kotlin.jvm.internal.l.a(r3, r8)
            if (r3 == 0) goto L55
            goto L82
        L6a:
            if (r1 != 0) goto L82
            G2.s r1 = r0.f2647p
            if (r1 == 0) goto L82
            java.lang.String r2 = "backStackEntryId"
            kotlin.jvm.internal.l.f(r2, r8)
            java.util.LinkedHashMap r1 = r1.f2732b
            java.lang.Object r8 = r1.remove(r8)
            androidx.lifecycle.V r8 = (androidx.lifecycle.V) r8
            if (r8 == 0) goto L82
            r8.a()
        L82:
            r0.u()
            java.util.ArrayList r8 = r0.r()
            r5.getClass()
            r5.i(r4, r8)
            return
        L90:
            boolean r8 = r7.f2722d
            if (r8 != 0) goto Lad
            r0.u()
            java.util.ArrayList r8 = P3.q.U0(r2)
            K5.Y r1 = r0.f2639h
            r1.getClass()
            r1.i(r4, r8)
            java.util.ArrayList r8 = r0.r()
            r5.getClass()
            r5.i(r4, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.C0178o.b(G2.k):void");
    }

    public final void c(C0174k c0174k, boolean z7) {
        kotlin.jvm.internal.l.f("popUpTo", c0174k);
        E e7 = this.f2726h;
        O oB = e7.f2653v.b(c0174k.f2703l.f2757k);
        e7.f2657z.put(c0174k, Boolean.valueOf(z7));
        if (!oB.equals(this.f2725g)) {
            Object obj = e7.f2654w.get(oB);
            kotlin.jvm.internal.l.c(obj);
            ((C0178o) obj).c(c0174k, z7);
            return;
        }
        D.E e8 = e7.f2656y;
        if (e8 != null) {
            e8.invoke(c0174k);
            d(c0174k);
            return;
        }
        P3.l lVar = e7.f2638g;
        int iIndexOf = lVar.indexOf(c0174k);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + c0174k + " as it was not found on the current back stack");
            return;
        }
        int i7 = iIndexOf + 1;
        if (i7 != lVar.f7767m) {
            e7.o(((C0174k) lVar.get(i7)).f2703l.f2762p, true, false);
        }
        E.q(e7, c0174k);
        d(c0174k);
        e7.v();
        e7.b();
    }

    public final void d(C0174k c0174k) {
        kotlin.jvm.internal.l.f("popUpTo", c0174k);
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Y y7 = this.f2720b;
            Iterable iterable = (Iterable) y7.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (kotlin.jvm.internal.l.a((C0174k) obj, c0174k)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            y7.getClass();
            y7.i(null, arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(C0174k c0174k, boolean z7) {
        Object objPrevious;
        kotlin.jvm.internal.l.f("popUpTo", c0174k);
        Y y7 = this.f2721c;
        Iterable iterable = (Iterable) y7.getValue();
        boolean z8 = iterable instanceof Collection;
        K5.I i7 = this.f2723e;
        if (!z8 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C0174k) it.next()) == c0174k) {
                    Iterable iterable2 = (Iterable) ((Y) i7.f4751k).getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((C0174k) it2.next()) == c0174k) {
                        }
                    }
                    return;
                }
            }
        }
        y7.i(null, P3.J.U((Set) y7.getValue(), c0174k));
        List list = (List) ((Y) i7.f4751k).getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C0174k c0174k2 = (C0174k) objPrevious;
            if (!kotlin.jvm.internal.l.a(c0174k2, c0174k)) {
                K5.G g4 = i7.f4751k;
                if (((List) ((Y) g4).getValue()).lastIndexOf(c0174k2) < ((List) ((Y) g4).getValue()).lastIndexOf(c0174k)) {
                    break;
                }
            }
        }
        C0174k c0174k3 = (C0174k) objPrevious;
        if (c0174k3 != null) {
            y7.i(null, P3.J.U((Set) y7.getValue(), c0174k3));
        }
        c(c0174k, z7);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [e4.k, kotlin.jvm.internal.m] */
    public final void f(C0174k c0174k) {
        kotlin.jvm.internal.l.f("backStackEntry", c0174k);
        E e7 = this.f2726h;
        O oB = e7.f2653v.b(c0174k.f2703l.f2757k);
        if (!oB.equals(this.f2725g)) {
            Object obj = e7.f2654w.get(oB);
            if (obj == null) {
                throw new IllegalStateException(AbstractC0703b.m(new StringBuilder("NavigatorBackStack for "), c0174k.f2703l.f2757k, " should already be created").toString());
            }
            ((C0178o) obj).f(c0174k);
            return;
        }
        ?? r02 = e7.f2655x;
        if (r02 != 0) {
            r02.invoke(c0174k);
            a(c0174k);
        } else {
            Log.i("NavController", "Ignoring add of destination " + c0174k.f2703l + " outside of the call to navigate(). ");
        }
    }
}
