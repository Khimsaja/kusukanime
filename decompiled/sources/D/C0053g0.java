package D;

import H0.AbstractC0215g;
import H0.C0214f;
import O.C0486d;
import O.C0493g0;
import O.C0509o0;
import h0.AbstractC0968M;
import h0.C0998u;

/* renamed from: D.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053g0 {
    public C0069o0 a;

    /* renamed from: b, reason: collision with root package name */
    public final C0509o0 f1143b;

    /* renamed from: c, reason: collision with root package name */
    public final z0.N0 f1144c;

    /* renamed from: d, reason: collision with root package name */
    public final L2.e f1145d;

    /* renamed from: e, reason: collision with root package name */
    public N0.B f1146e;

    /* renamed from: f, reason: collision with root package name */
    public final C0493g0 f1147f;

    /* renamed from: g, reason: collision with root package name */
    public final C0493g0 f1148g;

    /* renamed from: h, reason: collision with root package name */
    public w0.r f1149h;

    /* renamed from: i, reason: collision with root package name */
    public final C0493g0 f1150i;

    /* renamed from: j, reason: collision with root package name */
    public C0214f f1151j;

    /* renamed from: k, reason: collision with root package name */
    public final C0493g0 f1152k;

    /* renamed from: l, reason: collision with root package name */
    public final C0493g0 f1153l;

    /* renamed from: m, reason: collision with root package name */
    public final C0493g0 f1154m;

    /* renamed from: n, reason: collision with root package name */
    public final C0493g0 f1155n;

    /* renamed from: o, reason: collision with root package name */
    public final C0493g0 f1156o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1157p;

    /* renamed from: q, reason: collision with root package name */
    public final C0493g0 f1158q;

    /* renamed from: r, reason: collision with root package name */
    public final B2.l f1159r;

    /* renamed from: s, reason: collision with root package name */
    public e4.k f1160s;

    /* renamed from: t, reason: collision with root package name */
    public final A f1161t;

    /* renamed from: u, reason: collision with root package name */
    public final A f1162u;

    /* renamed from: v, reason: collision with root package name */
    public final H1.e0 f1163v;

    /* renamed from: w, reason: collision with root package name */
    public long f1164w;

    /* renamed from: x, reason: collision with root package name */
    public final C0493g0 f1165x;

    /* renamed from: y, reason: collision with root package name */
    public final C0493g0 f1166y;

    public C0053g0(C0069o0 c0069o0, C0509o0 c0509o0, z0.N0 n02) {
        this.a = c0069o0;
        this.f1143b = c0509o0;
        this.f1144c = n02;
        L2.e eVar = new L2.e(5, false);
        C0214f c0214f = AbstractC0215g.a;
        long j7 = H0.H.f3091b;
        N0.w wVar = new N0.w(c0214f, j7, (H0.H) null);
        eVar.f6045l = wVar;
        eVar.f6046m = new D2.e(c0214f, wVar.f6896b);
        this.f1145d = eVar;
        Boolean bool = Boolean.FALSE;
        O.T t7 = O.T.f7049p;
        this.f1147f = C0486d.K(bool, t7);
        this.f1148g = C0486d.K(new T0.e(0), t7);
        this.f1150i = C0486d.K(null, t7);
        this.f1152k = C0486d.K(W.f1107k, t7);
        this.f1153l = C0486d.K(bool, t7);
        this.f1154m = C0486d.K(bool, t7);
        this.f1155n = C0486d.K(bool, t7);
        this.f1156o = C0486d.K(bool, t7);
        this.f1157p = true;
        this.f1158q = C0486d.K(Boolean.TRUE, t7);
        this.f1159r = new B2.l(3, n02);
        this.f1160s = C0054h.f1170p;
        this.f1161t = new A(this, 5);
        this.f1162u = new A(this, 4);
        this.f1163v = AbstractC0968M.g();
        this.f1164w = C0998u.f11834g;
        this.f1165x = C0486d.K(new H0.H(j7), t7);
        this.f1166y = C0486d.K(new H0.H(j7), t7);
    }

    public final W a() {
        return (W) this.f1152k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f1147f.getValue()).booleanValue();
    }

    public final w0.r c() {
        w0.r rVar = this.f1149h;
        if (rVar == null || !rVar.B()) {
            return null;
        }
        return rVar;
    }

    public final N0 d() {
        return (N0) this.f1150i.getValue();
    }

    public final void e(long j7) {
        this.f1166y.setValue(new H0.H(j7));
    }

    public final void f(long j7) {
        this.f1165x.setValue(new H0.H(j7));
    }
}
