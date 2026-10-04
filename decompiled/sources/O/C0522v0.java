package O;

import C2.C0034g;
import D.C0042b;
import H5.C0263e0;
import H5.C0270k;
import H5.InterfaceC0265f0;
import H5.InterfaceC0269j;
import android.util.Log;
import io.ktor.client.utils.CIOKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m.C1472B;

/* renamed from: O.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0522v0 extends r {

    /* renamed from: v, reason: collision with root package name */
    public static final K5.Y f7219v = K5.N.b(U.b.f9121n);

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicReference f7220w = new AtomicReference(Boolean.FALSE);
    public final C0492g a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7221b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0265f0 f7222c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f7223d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7224e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7225f;

    /* renamed from: g, reason: collision with root package name */
    public C1472B f7226g;

    /* renamed from: h, reason: collision with root package name */
    public final Q.d f7227h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f7228i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f7229j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f7230k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f7231l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f7232m;

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashSet f7233n;

    /* renamed from: o, reason: collision with root package name */
    public C0270k f7234o;

    /* renamed from: p, reason: collision with root package name */
    public C0034g f7235p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7236q;

    /* renamed from: r, reason: collision with root package name */
    public final K5.Y f7237r;

    /* renamed from: s, reason: collision with root package name */
    public final H5.h0 f7238s;

    /* renamed from: t, reason: collision with root package name */
    public final S3.h f7239t;

    /* renamed from: u, reason: collision with root package name */
    public final T f7240u;

    public C0522v0(S3.h hVar) {
        C0492g c0492g = new C0492g(new B.e(15, this));
        this.a = c0492g;
        this.f7221b = new Object();
        this.f7224e = new ArrayList();
        this.f7226g = new C1472B();
        this.f7227h = new Q.d(new C0519u[16]);
        this.f7228i = new ArrayList();
        this.f7229j = new ArrayList();
        this.f7230k = new LinkedHashMap();
        this.f7231l = new LinkedHashMap();
        this.f7237r = K5.N.b(EnumC0511p0.f7156m);
        H5.h0 h0Var = new H5.h0((InterfaceC0265f0) hVar.get(C0263e0.f3843k));
        h0Var.x(new C0042b(16, this));
        this.f7238s = h0Var;
        this.f7239t = hVar.plus(c0492g).plus(h0Var);
        this.f7240u = new T(8);
    }

    public static final C0519u p(C0522v0 c0522v0, C0519u c0519u, C1472B c1472b) {
        LinkedHashSet linkedHashSet;
        Y.d dVarB;
        if (!c0519u.f7189A.f7119E && !c0519u.f7190B && ((linkedHashSet = c0522v0.f7233n) == null || !linkedHashSet.contains(c0519u))) {
            C0042b c0042b = new C0042b(17, c0519u);
            A3.t tVar = new A3.t(23, c0519u, c1472b);
            Y.h hVarK = Y.o.k();
            Y.d dVar = hVarK instanceof Y.d ? (Y.d) hVarK : null;
            if (dVar == null || (dVarB = dVar.B(c0042b, tVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                Y.h hVarJ = dVarB.j();
                if (c1472b != null) {
                    try {
                        if (c1472b.h()) {
                            A.m mVar = new A.m(7, c1472b, c0519u);
                            C0510p c0510p = c0519u.f7189A;
                            if (c0510p.f7119E) {
                                C0486d.w("Preparing a composition while composing is not supported");
                                throw null;
                            }
                            c0510p.f7119E = true;
                            try {
                                mVar.invoke();
                                c0510p.f7119E = false;
                            } catch (Throwable th) {
                                c0510p.f7119E = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        Y.h.p(hVarJ);
                        throw th2;
                    }
                }
                boolean zT = c0519u.t();
                Y.h.p(hVarJ);
                if (zT) {
                    return c0519u;
                }
            } finally {
                r(dVarB);
            }
        }
        return null;
    }

    public static final boolean q(C0522v0 c0522v0) {
        List listW;
        synchronized (c0522v0.f7221b) {
            boolean z7 = true;
            if (c0522v0.f7226g.g()) {
                if (!c0522v0.f7227h.l() && !c0522v0.u()) {
                    z7 = false;
                }
                return z7;
            }
            Q.f fVar = new Q.f(c0522v0.f7226g);
            c0522v0.f7226g = new C1472B();
            synchronized (c0522v0.f7221b) {
                listW = c0522v0.w();
            }
            try {
                int size = listW.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((C0519u) listW.get(i7)).u(fVar);
                    if (((EnumC0511p0) c0522v0.f7237r.getValue()).compareTo(EnumC0511p0.f7155l) <= 0) {
                        break;
                    }
                }
                synchronized (c0522v0.f7221b) {
                    c0522v0.f7226g = new C1472B();
                }
                synchronized (c0522v0.f7221b) {
                    if (c0522v0.t() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (!c0522v0.f7227h.l() && !c0522v0.u()) {
                        z7 = false;
                    }
                }
                return z7;
            } catch (Throwable th) {
                synchronized (c0522v0.f7221b) {
                    C1472B c1472b = c0522v0.f7226g;
                    c1472b.getClass();
                    for (Object obj : fVar) {
                        c1472b.f12864b[c1472b.d(obj)] = obj;
                    }
                    throw th;
                }
            }
        }
    }

    public static void r(Y.d dVar) {
        try {
            if (dVar.v() instanceof Y.i) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            dVar.c();
        }
    }

    public static final void x(ArrayList arrayList, C0522v0 c0522v0, C0519u c0519u) {
        arrayList.clear();
        synchronized (c0522v0.f7221b) {
            Iterator it = c0522v0.f7229j.iterator();
            if (it.hasNext()) {
                ((X) it.next()).getClass();
                throw null;
            }
        }
    }

    public final void A(C0519u c0519u) {
        ArrayList arrayList = this.f7232m;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f7232m = arrayList;
        }
        if (!arrayList.contains(c0519u)) {
            arrayList.add(c0519u);
        }
        this.f7224e.remove(c0519u);
        this.f7225f = null;
    }

    @Override // O.r
    public final void a(C0519u c0519u, W.a aVar) throws Exception {
        Y.d dVarB;
        boolean z7 = c0519u.f7189A.f7119E;
        try {
            C0042b c0042b = new C0042b(17, c0519u);
            A3.t tVar = new A3.t(23, c0519u, null);
            Y.h hVarK = Y.o.k();
            Y.d dVar = hVarK instanceof Y.d ? (Y.d) hVarK : null;
            if (dVar == null || (dVarB = dVar.B(c0042b, tVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                Y.h hVarJ = dVarB.j();
                try {
                    c0519u.i(aVar);
                    if (!z7) {
                        Y.o.k().m();
                    }
                    synchronized (this.f7221b) {
                        if (((EnumC0511p0) this.f7237r.getValue()).compareTo(EnumC0511p0.f7155l) > 0 && !w().contains(c0519u)) {
                            this.f7224e.add(c0519u);
                            this.f7225f = null;
                        }
                    }
                    try {
                        synchronized (this.f7221b) {
                            ArrayList arrayList = this.f7229j;
                            if (arrayList.size() > 0) {
                                ((X) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            c0519u.d();
                            c0519u.f();
                            if (z7) {
                                return;
                            }
                            Y.o.k().m();
                        } catch (Exception e7) {
                            z(e7, null);
                        }
                    } catch (Exception e8) {
                        z(e8, c0519u);
                    }
                } finally {
                    Y.h.p(hVarJ);
                }
            } finally {
                r(dVarB);
            }
        } catch (Exception e9) {
            z(e9, c0519u);
        }
    }

    @Override // O.r
    public final boolean c() {
        return ((Boolean) f7220w.get()).booleanValue();
    }

    @Override // O.r
    public final boolean d() {
        return false;
    }

    @Override // O.r
    public final boolean e() {
        return false;
    }

    @Override // O.r
    public final int g() {
        return CIOKt.DEFAULT_HTTP_POOL_SIZE;
    }

    @Override // O.r
    public final S3.h h() {
        return this.f7239t;
    }

    @Override // O.r
    public final void i(C0519u c0519u) {
        InterfaceC0269j interfaceC0269jT;
        synchronized (this.f7221b) {
            if (this.f7227h.h(c0519u)) {
                interfaceC0269jT = null;
            } else {
                this.f7227h.b(c0519u);
                interfaceC0269jT = t();
            }
        }
        if (interfaceC0269jT != null) {
            ((C0270k) interfaceC0269jT).resumeWith(O3.C.a);
        }
    }

    @Override // O.r
    public final void l(C0519u c0519u) {
        synchronized (this.f7221b) {
            try {
                LinkedHashSet linkedHashSet = this.f7233n;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f7233n = linkedHashSet;
                }
                linkedHashSet.add(c0519u);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O.r
    public final void o(C0519u c0519u) {
        synchronized (this.f7221b) {
            this.f7224e.remove(c0519u);
            this.f7225f = null;
            this.f7227h.m(c0519u);
            this.f7228i.remove(c0519u);
        }
    }

    public final void s() {
        synchronized (this.f7221b) {
            if (((EnumC0511p0) this.f7237r.getValue()).compareTo(EnumC0511p0.f7158o) >= 0) {
                K5.Y y7 = this.f7237r;
                EnumC0511p0 enumC0511p0 = EnumC0511p0.f7155l;
                y7.getClass();
                y7.i(null, enumC0511p0);
            }
        }
        this.f7238s.e(null);
    }

    public final InterfaceC0269j t() {
        K5.Y y7 = this.f7237r;
        int iCompareTo = ((EnumC0511p0) y7.getValue()).compareTo(EnumC0511p0.f7155l);
        ArrayList arrayList = this.f7229j;
        ArrayList arrayList2 = this.f7228i;
        Q.d dVar = this.f7227h;
        if (iCompareTo <= 0) {
            this.f7224e.clear();
            this.f7225f = P3.y.f7779k;
            this.f7226g = new C1472B();
            dVar.g();
            arrayList2.clear();
            arrayList.clear();
            this.f7232m = null;
            C0270k c0270k = this.f7234o;
            if (c0270k != null) {
                c0270k.cancel(null);
            }
            this.f7234o = null;
            this.f7235p = null;
            return null;
        }
        C0034g c0034g = this.f7235p;
        EnumC0511p0 enumC0511p0 = EnumC0511p0.f7159p;
        EnumC0511p0 enumC0511p02 = EnumC0511p0.f7156m;
        if (c0034g == null) {
            if (this.f7222c == null) {
                this.f7226g = new C1472B();
                dVar.g();
                if (u()) {
                    enumC0511p02 = EnumC0511p0.f7157n;
                }
            } else {
                enumC0511p02 = (dVar.l() || this.f7226g.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || u()) ? enumC0511p0 : EnumC0511p0.f7158o;
            }
        }
        y7.getClass();
        y7.i(null, enumC0511p02);
        if (enumC0511p02 != enumC0511p0) {
            return null;
        }
        C0270k c0270k2 = this.f7234o;
        this.f7234o = null;
        return c0270k2;
    }

    public final boolean u() {
        return (this.f7236q || this.a.f7073p.get() == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f7221b
            monitor-enter(r0)
            m.B r1 = r2.f7226g     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            Q.d r1 = r2.f7227h     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.l()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            boolean r1 = r2.u()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            goto L1e
        L1a:
            r1 = 0
            goto L1f
        L1c:
            r1 = move-exception
            goto L21
        L1e:
            r1 = 1
        L1f:
            monitor-exit(r0)
            return r1
        L21:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0522v0.v():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List w() {
        Object obj = this.f7225f;
        ?? r02 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f7224e;
            RandomAccess arrayList2 = arrayList.isEmpty() ? P3.y.f7779k : new ArrayList(arrayList);
            this.f7225f = arrayList2;
            r02 = arrayList2;
        }
        return r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
    
        if (r4 >= r3) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f0, code lost:
    
        if (((O3.l) r10.get(r4)).f7529l == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0103, code lost:
    
        if (r8 >= r4) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0105, code lost:
    
        r11 = (O3.l) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010d, code lost:
    
        if (r11.f7529l != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010f, code lost:
    
        r11 = (O.X) r11.f7528k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0116, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0119, code lost:
    
        r4 = r18.f7221b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011b, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011c, code lost:
    
        P3.v.e0(r18.f7229j, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0122, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0130, code lost:
    
        if (r8 >= r4) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013b, code lost:
    
        if (((O3.l) r11).f7529l == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013d, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0140, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0143, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List y(java.util.List r19, m.C1472B r20) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0522v0.y(java.util.List, m.B):java.util.List");
    }

    public final void z(Exception exc, C0519u c0519u) throws Exception {
        int i7 = 21;
        if (!((Boolean) f7220w.get()).booleanValue() || (exc instanceof C0500k)) {
            synchronized (this.f7221b) {
                C0034g c0034g = this.f7235p;
                if (c0034g != null) {
                    throw ((Exception) c0034g.f741l);
                }
                this.f7235p = new C0034g(i7, exc);
            }
            throw exc;
        }
        synchronized (this.f7221b) {
            int i8 = AbstractC0482b.f7056b;
            Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
            this.f7228i.clear();
            this.f7227h.g();
            this.f7226g = new C1472B();
            this.f7229j.clear();
            this.f7230k.clear();
            this.f7231l.clear();
            this.f7235p = new C0034g(i7, exc);
            if (c0519u != null) {
                A(c0519u);
            }
            t();
        }
    }

    @Override // O.r
    public final void j(Set set) {
    }
}
