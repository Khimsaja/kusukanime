package H1;

import O1.AbstractC0527a;
import O1.C0545t;
import O1.C0548w;
import O1.InterfaceC0551z;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c0 {
    public final I1.l a;

    /* renamed from: e, reason: collision with root package name */
    public final L f3415e;

    /* renamed from: h, reason: collision with root package name */
    public final I1.f f3418h;

    /* renamed from: i, reason: collision with root package name */
    public final B1.F f3419i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3421k;

    /* renamed from: l, reason: collision with root package name */
    public E1.D f3422l;

    /* renamed from: j, reason: collision with root package name */
    public O1.c0 f3420j = new O1.c0();

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f3413c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f3414d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3412b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f3416f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f3417g = new HashSet();

    public c0(L l7, I1.f fVar, B1.F f5, I1.l lVar) {
        this.a = lVar;
        this.f3415e = l7;
        this.f3418h = fVar;
        this.f3419i = f5;
    }

    public final y1.P a(int i7, ArrayList arrayList, O1.c0 c0Var) {
        if (!arrayList.isEmpty()) {
            this.f3420j = c0Var;
            for (int i8 = i7; i8 < arrayList.size() + i7; i8++) {
                b0 b0Var = (b0) arrayList.get(i8 - i7);
                ArrayList arrayList2 = this.f3412b;
                if (i8 > 0) {
                    b0 b0Var2 = (b0) arrayList2.get(i8 - 1);
                    b0Var.f3410d = b0Var2.a.f7501o.f7481b.o() + b0Var2.f3410d;
                    b0Var.f3411e = false;
                    b0Var.f3409c.clear();
                } else {
                    b0Var.f3410d = 0;
                    b0Var.f3411e = false;
                    b0Var.f3409c.clear();
                }
                int iO = b0Var.a.f7501o.f7481b.o();
                for (int i9 = i8; i9 < arrayList2.size(); i9++) {
                    ((b0) arrayList2.get(i9)).f3410d += iO;
                }
                arrayList2.add(i8, b0Var);
                this.f3414d.put(b0Var.f3408b, b0Var);
                if (this.f3421k) {
                    e(b0Var);
                    if (this.f3413c.isEmpty()) {
                        this.f3417g.add(b0Var);
                    } else {
                        a0 a0Var = (a0) this.f3416f.get(b0Var);
                        if (a0Var != null) {
                            a0Var.a.b(a0Var.f3402b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final y1.P b() {
        ArrayList arrayList = this.f3412b;
        if (arrayList.isEmpty()) {
            return y1.P.a;
        }
        int iO = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            b0 b0Var = (b0) arrayList.get(i7);
            b0Var.f3410d = iO;
            iO += b0Var.a.f7501o.f7481b.o();
        }
        return new j0(arrayList, this.f3420j);
    }

    public final void c() {
        Iterator it = this.f3417g.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            if (b0Var.f3409c.isEmpty()) {
                a0 a0Var = (a0) this.f3416f.get(b0Var);
                if (a0Var != null) {
                    a0Var.a.b(a0Var.f3402b);
                }
                it.remove();
            }
        }
    }

    public final void d(b0 b0Var) {
        if (b0Var.f3411e && b0Var.f3409c.isEmpty()) {
            a0 a0Var = (a0) this.f3416f.remove(b0Var);
            a0Var.getClass();
            V v5 = a0Var.f3402b;
            AbstractC0527a abstractC0527a = a0Var.a;
            abstractC0527a.n(v5);
            Z z7 = a0Var.f3403c;
            abstractC0527a.q(z7);
            abstractC0527a.p(z7);
            this.f3417g.remove(b0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [H1.V, O1.C] */
    public final void e(b0 b0Var) {
        C0548w c0548w = b0Var.a;
        ?? r12 = new O1.C() { // from class: H1.V
            @Override // O1.C
            public final void a(AbstractC0527a abstractC0527a, y1.P p7) {
                B1.F f5 = this.a.f3415e.f3328r;
                f5.d(2);
                f5.e(22);
            }
        };
        Z z7 = new Z(this, b0Var);
        this.f3416f.put(b0Var, new a0(c0548w, r12, z7));
        int i7 = B1.K.a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        c0548w.getClass();
        K1.e eVar = c0548w.f7405c;
        eVar.getClass();
        O1.G g4 = new O1.G();
        g4.a = handler;
        g4.f7269b = z7;
        eVar.f4460c.add(g4);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        K1.e eVar2 = c0548w.f7406d;
        eVar2.getClass();
        K1.d dVar = new K1.d();
        dVar.a = z7;
        eVar2.f4460c.add(dVar);
        c0548w.j(r12, this.f3422l, this.a);
    }

    public final void f(InterfaceC0551z interfaceC0551z) {
        IdentityHashMap identityHashMap = this.f3413c;
        b0 b0Var = (b0) identityHashMap.remove(interfaceC0551z);
        b0Var.getClass();
        b0Var.a.m(interfaceC0551z);
        b0Var.f3409c.remove(((C0545t) interfaceC0551z).f7487k);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(b0Var);
    }

    public final void g(int i7, int i8) {
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            ArrayList arrayList = this.f3412b;
            b0 b0Var = (b0) arrayList.remove(i9);
            this.f3414d.remove(b0Var.f3408b);
            int i10 = -b0Var.a.f7501o.f7481b.o();
            for (int i11 = i9; i11 < arrayList.size(); i11++) {
                ((b0) arrayList.get(i11)).f3410d += i10;
            }
            b0Var.f3411e = true;
            if (this.f3421k) {
                d(b0Var);
            }
        }
    }
}
