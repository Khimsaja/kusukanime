package K;

import D.C0068o;
import O.C0486d;
import O.C0493g0;
import O.T;
import O.Z;
import O.w0;
import P3.F;
import android.view.ViewGroup;
import h0.AbstractC0982e;
import h0.C0998u;
import h0.InterfaceC0995r;
import j0.C1296b;
import java.util.LinkedHashMap;
import q.N;
import y0.C2351F;

/* renamed from: K.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292a implements w0, s, N {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4357k;

    /* renamed from: l, reason: collision with root package name */
    public final F1.m f4358l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f4359m;

    /* renamed from: n, reason: collision with root package name */
    public final float f4360n;

    /* renamed from: o, reason: collision with root package name */
    public final Z f4361o;

    /* renamed from: p, reason: collision with root package name */
    public final Z f4362p;

    /* renamed from: q, reason: collision with root package name */
    public final ViewGroup f4363q;

    /* renamed from: r, reason: collision with root package name */
    public r f4364r;

    /* renamed from: s, reason: collision with root package name */
    public final C0493g0 f4365s;

    /* renamed from: t, reason: collision with root package name */
    public final C0493g0 f4366t;

    /* renamed from: u, reason: collision with root package name */
    public long f4367u;

    /* renamed from: v, reason: collision with root package name */
    public int f4368v;

    /* renamed from: w, reason: collision with root package name */
    public final B.e f4369w;

    public C0292a(boolean z7, float f5, Z z8, Z z9, ViewGroup viewGroup) {
        this.f4357k = z7;
        this.f4358l = new F1.m(z7, new C0068o(2, z9));
        this.f4359m = z7;
        this.f4360n = f5;
        this.f4361o = z8;
        this.f4362p = z9;
        this.f4363q = viewGroup;
        T t7 = T.f7049p;
        this.f4365s = C0486d.K(null, t7);
        this.f4366t = C0486d.K(Boolean.TRUE, t7);
        this.f4367u = 0L;
        this.f4368v = -1;
        this.f4369w = new B.e(9, this);
    }

    @Override // O.w0
    public final void b() {
        r rVar = this.f4364r;
        if (rVar != null) {
            i0();
            F.w wVar = rVar.f4414n;
            t tVar = (t) ((LinkedHashMap) wVar.f2037l).get(this);
            if (tVar != null) {
                tVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) wVar.f2037l;
                t tVar2 = (t) linkedHashMap.get(this);
                if (tVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f4413m.add(tVar);
            }
        }
    }

    @Override // q.N
    public final void d(C2351F c2351f) {
        int iO;
        float fX;
        C1296b c1296b = c2351f.f17696k;
        this.f4367u = c1296b.d();
        float f5 = this.f4360n;
        if (Float.isNaN(f5)) {
            iO = F.W(q.a(c2351f, this.f4359m, c1296b.d()));
        } else {
            iO = c1296b.O(f5);
        }
        this.f4368v = iO;
        long j7 = ((C0998u) this.f4361o.getValue()).a;
        float f7 = ((h) this.f4362p.getValue()).f4384d;
        c2351f.b();
        if (Float.isNaN(f5)) {
            fX = q.a(c2351f, this.f4357k, c1296b.d());
        } else {
            fX = c2351f.x(f5);
        }
        this.f4358l.i(c2351f, fX, j7);
        InterfaceC0995r interfaceC0995rT = c1296b.f12205l.t();
        ((Boolean) this.f4366t.getValue()).booleanValue();
        t tVar = (t) this.f4365s.getValue();
        if (tVar != null) {
            tVar.e(f7, c1296b.d(), j7);
            tVar.draw(AbstractC0982e.a(interfaceC0995rT));
        }
    }

    @Override // O.w0
    public final void e() {
        r rVar = this.f4364r;
        if (rVar != null) {
            i0();
            F.w wVar = rVar.f4414n;
            t tVar = (t) ((LinkedHashMap) wVar.f2037l).get(this);
            if (tVar != null) {
                tVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) wVar.f2037l;
                t tVar2 = (t) linkedHashMap.get(this);
                if (tVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f4413m.add(tVar);
            }
        }
    }

    @Override // K.s
    public final void i0() {
        this.f4365s.setValue(null);
    }

    @Override // O.w0
    public final void a() {
    }
}
