package N0;

import D.C0042b;
import D.C0056i;
import H0.H;
import P3.F;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import z0.C2471u;

/* loaded from: classes.dex */
public final class z implements r {
    public final View a;

    /* renamed from: b, reason: collision with root package name */
    public final B2.l f6904b;

    /* renamed from: c, reason: collision with root package name */
    public final J1.y f6905c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6906d;

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.m f6907e;

    /* renamed from: f, reason: collision with root package name */
    public kotlin.jvm.internal.m f6908f;

    /* renamed from: g, reason: collision with root package name */
    public w f6909g;

    /* renamed from: h, reason: collision with root package name */
    public l f6910h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6911i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f6912j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f6913k;

    /* renamed from: l, reason: collision with root package name */
    public final e f6914l;

    /* renamed from: m, reason: collision with root package name */
    public final Q.d f6915m;

    /* renamed from: n, reason: collision with root package name */
    public B1.w f6916n;

    public z(View view, C2471u c2471u) {
        B2.l lVar = new B2.l(view);
        J1.y yVar = new J1.y(1, Choreographer.getInstance());
        this.a = view;
        this.f6904b = lVar;
        this.f6905c = yVar;
        this.f6907e = C0479d.f6855o;
        this.f6908f = C0479d.f6856p;
        this.f6909g = new w("", H.f3091b, 4);
        this.f6910h = l.f6879g;
        this.f6911i = new ArrayList();
        this.f6912j = z1.c.B(O3.j.f7526l, new B.e(13, this));
        this.f6914l = new e(c2471u, lVar);
        this.f6915m = new Q.d(new y[16]);
    }

    @Override // N0.r
    public final void a() {
        i(y.f6899k);
    }

    @Override // N0.r
    public final void b() {
        i(y.f6901m);
    }

    /* JADX WARN: Type inference failed for: r12v14, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v22, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [O3.i, java.lang.Object] */
    @Override // N0.r
    public final void c(w wVar, w wVar2) {
        boolean z7 = (H.a(this.f6909g.f6896b, wVar2.f6896b) && kotlin.jvm.internal.l.a(this.f6909g.f6897c, wVar2.f6897c)) ? false : true;
        this.f6909g = wVar2;
        int size = this.f6911i.size();
        for (int i7 = 0; i7 < size; i7++) {
            s sVar = (s) ((WeakReference) this.f6911i.get(i7)).get();
            if (sVar != null) {
                sVar.f6888d = wVar2;
            }
        }
        e eVar = this.f6914l;
        synchronized (eVar.f6861c) {
            eVar.f6868j = null;
            eVar.f6870l = null;
            eVar.f6869k = null;
            eVar.f6871m = C0479d.f6853m;
            eVar.f6872n = null;
            eVar.f6873o = null;
        }
        if (kotlin.jvm.internal.l.a(wVar, wVar2)) {
            if (z7) {
                B2.l lVar = this.f6904b;
                int iE = H.e(wVar2.f6896b);
                int iD = H.d(wVar2.f6896b);
                H h7 = this.f6909g.f6897c;
                int iE2 = h7 != null ? H.e(h7.a) : -1;
                H h8 = this.f6909g.f6897c;
                ((InputMethodManager) lVar.f417m.getValue()).updateSelection((View) lVar.f416l, iE, iD, iE2, h8 != null ? H.d(h8.a) : -1);
                return;
            }
            return;
        }
        if (wVar != null && (!kotlin.jvm.internal.l.a(wVar.a.a, wVar2.a.a) || (H.a(wVar.f6896b, wVar2.f6896b) && !kotlin.jvm.internal.l.a(wVar.f6897c, wVar2.f6897c)))) {
            B2.l lVar2 = this.f6904b;
            ((InputMethodManager) lVar2.f417m.getValue()).restartInput((View) lVar2.f416l);
            return;
        }
        int size2 = this.f6911i.size();
        for (int i8 = 0; i8 < size2; i8++) {
            s sVar2 = (s) ((WeakReference) this.f6911i.get(i8)).get();
            if (sVar2 != null) {
                w wVar3 = this.f6909g;
                B2.l lVar3 = this.f6904b;
                if (sVar2.f6892h) {
                    sVar2.f6888d = wVar3;
                    if (sVar2.f6890f) {
                        ((InputMethodManager) lVar3.f417m.getValue()).updateExtractedText((View) lVar3.f416l, sVar2.f6889e, z1.c.M(wVar3));
                    }
                    H h9 = wVar3.f6897c;
                    int iE3 = h9 != null ? H.e(h9.a) : -1;
                    H h10 = wVar3.f6897c;
                    int iD2 = h10 != null ? H.d(h10.a) : -1;
                    long j7 = wVar3.f6896b;
                    ((InputMethodManager) lVar3.f417m.getValue()).updateSelection((View) lVar3.f416l, H.e(j7), H.d(j7), iE3, iD2);
                }
            }
        }
    }

    @Override // N0.r
    public final void d(w wVar, l lVar, C0056i c0056i, D.A a) {
        this.f6906d = true;
        this.f6909g = wVar;
        this.f6910h = lVar;
        this.f6907e = c0056i;
        this.f6908f = a;
        i(y.f6899k);
    }

    @Override // N0.r
    public final void e() {
        i(y.f6902n);
    }

    @Override // N0.r
    public final void f() {
        this.f6906d = false;
        this.f6907e = C0479d.f6857q;
        this.f6908f = C0479d.f6858r;
        this.f6913k = null;
        i(y.f6900l);
    }

    @Override // N0.r
    public final void g(g0.d dVar) {
        Rect rect;
        this.f6913k = new Rect(F.W(dVar.a), F.W(dVar.f11659b), F.W(dVar.f11660c), F.W(dVar.f11661d));
        if (!this.f6911i.isEmpty() || (rect = this.f6913k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // N0.r
    public final void h(w wVar, q qVar, H0.F f5, C0042b c0042b, g0.d dVar, g0.d dVar2) {
        e eVar = this.f6914l;
        synchronized (eVar.f6861c) {
            try {
                eVar.f6868j = wVar;
                eVar.f6870l = qVar;
                eVar.f6869k = f5;
                eVar.f6871m = c0042b;
                eVar.f6872n = dVar;
                eVar.f6873o = dVar2;
                if (eVar.f6863e || eVar.f6862d) {
                    eVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(y yVar) {
        this.f6915m.b(yVar);
        if (this.f6916n == null) {
            B1.w wVar = new B1.w(11, this);
            this.f6905c.execute(wVar);
            this.f6916n = wVar;
        }
    }
}
