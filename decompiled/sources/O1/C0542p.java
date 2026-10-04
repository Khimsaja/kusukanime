package O1;

import B1.AbstractC0015b;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p.I0;
import y1.C2392n;
import y1.C2393o;
import y1.C2396s;
import y1.C2397t;
import y1.C2398u;
import y1.C2399v;
import y1.C2400w;
import y1.C2401x;

/* renamed from: O1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542p implements A {
    public final C0541o a;

    /* renamed from: b, reason: collision with root package name */
    public E1.g f7473b;

    /* renamed from: c, reason: collision with root package name */
    public I0 f7474c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7475d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7476e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7477f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7478g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7479h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7480i;

    public C0542p(F.w wVar, V1.l lVar) {
        this.f7473b = wVar;
        I0 i02 = new I0(10);
        this.f7474c = i02;
        C0541o c0541o = new C0541o(lVar, i02);
        this.a = c0541o;
        if (wVar != ((E1.g) c0541o.f7471e)) {
            c0541o.f7471e = wVar;
            ((HashMap) c0541o.f7469c).clear();
            ((HashMap) c0541o.f7470d).clear();
        }
        this.f7475d = -9223372036854775807L;
        this.f7476e = -9223372036854775807L;
        this.f7477f = -9223372036854775807L;
        this.f7478g = -3.4028235E38f;
        this.f7479h = -3.4028235E38f;
        this.f7480i = true;
    }

    public static A e(Class cls, E1.g gVar) {
        try {
            return (A) cls.getConstructor(E1.g.class).newInstance(gVar);
        } catch (Exception e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // O1.A
    public final void a(boolean z7) {
        this.f7480i = z7;
        C0541o c0541o = this.a;
        c0541o.a = z7;
        V1.l lVar = (V1.l) c0541o.f7468b;
        synchronized (lVar) {
            lVar.f9400l = z7;
        }
        Iterator it = ((HashMap) c0541o.f7470d).values().iterator();
        while (it.hasNext()) {
            ((A) it.next()).a(z7);
        }
    }

    @Override // O1.A
    public final void b() {
        C0541o c0541o = this.a;
        c0541o.getClass();
        synchronized (((V1.l) c0541o.f7468b)) {
        }
    }

    @Override // O1.A
    public final void c(I0 i02) {
        this.f7474c = i02;
        C0541o c0541o = this.a;
        c0541o.f7472f = i02;
        V1.l lVar = (V1.l) c0541o.f7468b;
        synchronized (lVar) {
            lVar.f9401m = i02;
        }
        Iterator it = ((HashMap) c0541o.f7470d).values().iterator();
        while (it.hasNext()) {
            ((A) it.next()).c(i02);
        }
    }

    @Override // O1.A
    public final AbstractC0527a d(C2401x c2401x) {
        C2401x c2401x2;
        List list;
        Uri uri;
        String str;
        long j7;
        c2401x.f18138b.getClass();
        String scheme = c2401x.f18138b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(c2401x.f18138b.f18134b, "application/x-image-uri")) {
            long j8 = c2401x.f18138b.f18137e;
            int i7 = B1.K.a;
            throw null;
        }
        C2398u c2398u = c2401x.f18138b;
        int iZ = B1.K.z(c2398u.a, c2398u.f18134b);
        if (c2401x.f18138b.f18137e != -9223372036854775807L) {
            V1.l lVar = (V1.l) this.a.f7468b;
            synchronized (lVar) {
                lVar.f9402n = 1;
            }
        }
        try {
            C0541o c0541o = this.a;
            HashMap map = (HashMap) c0541o.f7470d;
            A a = (A) map.get(Integer.valueOf(iZ));
            if (a == null) {
                a = (A) c0541o.a(iZ).get();
                a.c((I0) c0541o.f7472f);
                a.a(c0541o.a);
                a.b();
                map.put(Integer.valueOf(iZ), a);
            }
            C2396s c2396sA = c2401x.f18139c.a();
            C2397t c2397t = c2401x.f18139c;
            if (c2397t.a == -9223372036854775807L) {
                c2396sA.a = this.f7475d;
            }
            if (c2397t.f18132d == -3.4028235E38f) {
                c2396sA.f18128d = this.f7478g;
            }
            if (c2397t.f18133e == -3.4028235E38f) {
                c2396sA.f18129e = this.f7479h;
            }
            if (c2397t.f18130b == -9223372036854775807L) {
                c2396sA.f18126b = this.f7476e;
            }
            if (c2397t.f18131c == -9223372036854775807L) {
                c2396sA.f18127c = this.f7477f;
            }
            C2397t c2397t2 = new C2397t(c2396sA);
            if (c2397t2.equals(c2401x.f18139c)) {
                c2401x2 = c2401x;
            } else {
                j3.E e7 = j3.G.f12277l;
                j3.X x7 = j3.X.f12304o;
                List list2 = Collections.EMPTY_LIST;
                j3.G g4 = j3.X.f12304o;
                C2399v c2399v = C2399v.a;
                y1.r rVar = c2401x.f18141e;
                V1.r rVar2 = new V1.r();
                rVar2.a = rVar.a;
                String str2 = c2401x.a;
                y1.A a7 = c2401x.f18140d;
                c2401x.f18139c.a();
                C2399v c2399v2 = c2401x.f18142f;
                C2398u c2398u2 = c2401x.f18138b;
                if (c2398u2 != null) {
                    String str3 = c2398u2.f18134b;
                    Uri uri2 = c2398u2.a;
                    List list3 = c2398u2.f18135c;
                    g4 = c2398u2.f18136d;
                    j3.E e8 = j3.G.f12277l;
                    j3.X x8 = j3.X.f12304o;
                    str = str3;
                    uri = uri2;
                    list = list3;
                    j7 = c2398u2.f18137e;
                } else {
                    list = list2;
                    uri = null;
                    str = null;
                    j7 = -9223372036854775807L;
                }
                j3.G g7 = g4;
                C2396s c2396sA2 = c2397t2.a();
                C2398u c2398u3 = uri != null ? new C2398u(uri, str, null, list, g7, j7) : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = str2;
                y1.r rVar3 = new y1.r(rVar2);
                C2397t c2397t3 = new C2397t(c2396sA2);
                if (a7 == null) {
                    a7 = y1.A.f17903B;
                }
                c2401x2 = new C2401x(str4, rVar3, c2398u3, c2397t3, a7, c2399v2);
            }
            AbstractC0527a abstractC0527aD = a.d(c2401x2);
            j3.G g8 = c2401x2.f18138b.f18136d;
            if (!g8.isEmpty()) {
                AbstractC0527a[] abstractC0527aArr = new AbstractC0527a[g8.size() + 1];
                abstractC0527aArr[0] = abstractC0527aD;
                if (g8.size() > 0) {
                    if (!this.f7480i) {
                        this.f7473b.getClass();
                        C2400w c2400w = (C2400w) g8.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        j3.E e9 = j3.G.f12277l;
                        j3.X x9 = j3.X.f12304o;
                        List list4 = Collections.EMPTY_LIST;
                        j3.X x10 = j3.X.f12304o;
                        C2399v c2399v3 = C2399v.a;
                        Uri uri3 = Uri.EMPTY;
                        c2400w.getClass();
                        throw null;
                    }
                    C2392n c2392n = new C2392n();
                    ((C2400w) g8.get(0)).getClass();
                    ArrayList arrayList = y1.D.a;
                    c2392n.f18074m = null;
                    ((C2400w) g8.get(0)).getClass();
                    c2392n.f18065d = null;
                    ((C2400w) g8.get(0)).getClass();
                    c2392n.f18066e = 0;
                    ((C2400w) g8.get(0)).getClass();
                    c2392n.f18067f = 0;
                    ((C2400w) g8.get(0)).getClass();
                    c2392n.f18063b = null;
                    ((C2400w) g8.get(0)).getClass();
                    c2392n.a = null;
                    C2393o c2393o = new C2393o(c2392n);
                    new C0.a();
                    if (this.f7474c.c(c2393o)) {
                        C2392n c2392nA = c2393o.a();
                        c2392nA.f18074m = y1.D.m("application/x-media3-cues");
                        c2392nA.f18071j = c2393o.f18112n;
                        c2392nA.I = this.f7474c.h(c2393o);
                        new C2393o(c2392nA);
                    }
                    ((C2400w) g8.get(0)).getClass();
                    throw null;
                }
                abstractC0527aD = new L(abstractC0527aArr);
            }
            if (c2401x2.f18141e.a != Long.MIN_VALUE) {
                C0530d c0530d = new C0530d(abstractC0527aD);
                y1.r rVar4 = c2401x2.f18141e;
                AbstractC0015b.h(!c0530d.f7424d);
                long j9 = rVar4.a;
                AbstractC0015b.h(!c0530d.f7424d);
                c0530d.f7422b = j9;
                AbstractC0015b.h(!c0530d.f7424d);
                c0530d.f7423c = true;
                AbstractC0015b.h(!c0530d.f7424d);
                AbstractC0015b.h(!c0530d.f7424d);
                c0530d.f7424d = true;
                abstractC0527aD = new C0533g(c0530d);
            }
            c2401x2.f18138b.getClass();
            c2401x2.f18138b.getClass();
            return abstractC0527aD;
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
