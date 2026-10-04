package H;

import C2.C0034g;
import D.AbstractC0047d0;
import D.C0053g0;
import D.N0;
import D.O0;
import H0.C0209a;
import H0.C0211c;
import H0.C0214f;
import O.C0486d;
import O.C0493g0;
import android.view.ActionMode;
import e5.AbstractC0832b;
import f0.C0855h;
import f0.C0862o;
import java.util.ArrayList;
import l4.AbstractC1420H;
import o0.InterfaceC1629a;
import z0.C2446h;
import z0.InterfaceC2447h0;

/* loaded from: classes.dex */
public final class S {
    public final O0 a;

    /* renamed from: b, reason: collision with root package name */
    public N0.q f2913b = AbstractC0047d0.f1137c;

    /* renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.m f2914c = B.f2873o;

    /* renamed from: d, reason: collision with root package name */
    public C0053g0 f2915d;

    /* renamed from: e, reason: collision with root package name */
    public final C0493g0 f2916e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2447h0 f2917f;

    /* renamed from: g, reason: collision with root package name */
    public z0.O0 f2918g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1629a f2919h;

    /* renamed from: i, reason: collision with root package name */
    public C0862o f2920i;

    /* renamed from: j, reason: collision with root package name */
    public final C0493g0 f2921j;

    /* renamed from: k, reason: collision with root package name */
    public final C0493g0 f2922k;

    /* renamed from: l, reason: collision with root package name */
    public long f2923l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f2924m;

    /* renamed from: n, reason: collision with root package name */
    public long f2925n;

    /* renamed from: o, reason: collision with root package name */
    public final C0493g0 f2926o;

    /* renamed from: p, reason: collision with root package name */
    public final C0493g0 f2927p;

    /* renamed from: q, reason: collision with root package name */
    public int f2928q;

    /* renamed from: r, reason: collision with root package name */
    public N0.w f2929r;

    /* renamed from: s, reason: collision with root package name */
    public N f2930s;

    /* renamed from: t, reason: collision with root package name */
    public final P f2931t;

    /* renamed from: u, reason: collision with root package name */
    public final C0034g f2932u;

    public S(O0 o02) {
        this.a = o02;
        N0.w wVar = new N0.w((String) null, 0L, 7);
        O.T t7 = O.T.f7049p;
        this.f2916e = C0486d.K(wVar, t7);
        Boolean bool = Boolean.TRUE;
        this.f2921j = C0486d.K(bool, t7);
        this.f2922k = C0486d.K(bool, t7);
        this.f2923l = 0L;
        this.f2925n = 0L;
        this.f2926o = C0486d.K(null, t7);
        this.f2927p = C0486d.K(null, t7);
        this.f2928q = -1;
        this.f2929r = new N0.w((String) null, 0L, 7);
        this.f2931t = new P(this, 1);
        this.f2932u = new C0034g(8, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156  */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [long] */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r4v13, types: [e4.k, kotlin.jvm.internal.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long a(H.S r25, N0.w r26, long r27, boolean r29, boolean r30, C2.C0028a r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.S.a(H.S, N0.w, long, boolean, boolean, C2.a, boolean):long");
    }

    public static N0.w c(C0214f c0214f, long j7) {
        return new N0.w(c0214f, j7, (H0.H) null);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [e4.k, kotlin.jvm.internal.m] */
    public final void b(boolean z7) {
        if (H0.H.b(j().f6896b)) {
            return;
        }
        InterfaceC2447h0 interfaceC2447h0 = this.f2917f;
        if (interfaceC2447h0 != null) {
            ((C2446h) interfaceC2447h0).a(P3.F.B(j()));
        }
        if (z7) {
            int iD = H0.H.d(j().f6896b);
            this.f2914c.invoke(c(j().a, AbstractC1420H.c(iD, iD)));
            n(D.W.f1107k);
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [e4.k, kotlin.jvm.internal.m] */
    public final void d() {
        if (H0.H.b(j().f6896b)) {
            return;
        }
        InterfaceC2447h0 interfaceC2447h0 = this.f2917f;
        if (interfaceC2447h0 != null) {
            ((C2446h) interfaceC2447h0).a(P3.F.B(j()));
        }
        C0214f c0214fD = P3.F.D(j(), j().a.a.length());
        C0214f c0214fC = P3.F.C(j(), j().a.a.length());
        C0211c c0211c = new C0211c(c0214fD);
        c0211c.b(c0214fC);
        C0214f c0214fC2 = c0211c.c();
        int iE = H0.H.e(j().f6896b);
        this.f2914c.invoke(c(c0214fC2, AbstractC1420H.c(iE, iE)));
        n(D.W.f1107k);
        this.a.f1088e = true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e4.k, kotlin.jvm.internal.m] */
    public final void e(g0.c cVar) {
        if (!H0.H.b(j().f6896b)) {
            C0053g0 c0053g0 = this.f2915d;
            N0 n0D = c0053g0 != null ? c0053g0.d() : null;
            int iD = (cVar == null || n0D == null) ? H0.H.d(j().f6896b) : this.f2913b.a(n0D.b(cVar.a, true));
            this.f2914c.invoke(N0.w.a(j(), null, AbstractC1420H.c(iD, iD), 5));
        }
        n((cVar == null || j().a.a.length() <= 0) ? D.W.f1107k : D.W.f1109m);
        p(false);
    }

    public final void f(boolean z7) {
        C0862o c0862o;
        C0053g0 c0053g0 = this.f2915d;
        if (c0053g0 != null && !c0053g0.b() && (c0862o = this.f2920i) != null) {
            c0862o.a(C0855h.f11401p);
        }
        this.f2929r = j();
        p(z7);
        n(D.W.f1108l);
    }

    public final g0.c g() {
        return (g0.c) this.f2927p.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.f2922k.getValue()).booleanValue();
    }

    public final long i(boolean z7) {
        N0 n0D;
        long j7;
        C0053g0 c0053g0 = this.f2915d;
        if (c0053g0 == null || (n0D = c0053g0.d()) == null) {
            return 9205357640488583168L;
        }
        H0.F f5 = n0D.a;
        C0053g0 c0053g02 = this.f2915d;
        C0214f c0214f = c0053g02 != null ? c0053g02.a.a : null;
        if (c0214f == null) {
            return 9205357640488583168L;
        }
        if (!kotlin.jvm.internal.l.a(c0214f.a, f5.a.a.a)) {
            return 9205357640488583168L;
        }
        N0.w wVarJ = j();
        if (z7) {
            long j8 = wVarJ.f6896b;
            int i7 = H0.H.f3092c;
            j7 = j8 >> 32;
        } else {
            long j9 = wVarJ.f6896b;
            int i8 = H0.H.f3092c;
            j7 = j9 & 4294967295L;
        }
        int iB = this.f2913b.b((int) j7);
        boolean zF = H0.H.f(j().f6896b);
        int iE = f5.e(iB);
        H0.n nVar = f5.f3083b;
        if (iE >= nVar.f3132f) {
            return 9205357640488583168L;
        }
        boolean z8 = f5.a(((!z7 || zF) && (z7 || !zF)) ? Math.max(iB + (-1), 0) : iB) == f5.i(iB);
        nVar.i(iB);
        int length = ((C0214f) nVar.a.f318l).a.length();
        ArrayList arrayList = nVar.f3134h;
        H0.p pVar = (H0.p) arrayList.get(iB == length ? P3.r.y(arrayList) : android.support.v4.media.session.b.o(iB, arrayList));
        C0209a c0209a = pVar.a;
        int iB2 = pVar.b(iB);
        I0.y yVar = c0209a.f3098d;
        float fH = z8 ? yVar.h(iB2, false) : yVar.i(iB2, false);
        long j10 = f5.f3084c;
        return AbstractC0832b.e(e3.c.j(fH, 0.0f, (int) (j10 >> 32)), e3.c.j(nVar.b(iE), 0.0f, (int) (j10 & 4294967295L)));
    }

    public final N0.w j() {
        return (N0.w) this.f2916e.getValue();
    }

    public final void k() {
        z0.O0 o02 = this.f2918g;
        if ((o02 != null ? ((z0.X) o02).f18711d : 0) != 1 || o02 == null) {
            return;
        }
        z0.X x7 = (z0.X) o02;
        x7.f18711d = 2;
        ActionMode actionMode = x7.f18709b;
        if (actionMode != null) {
            actionMode.finish();
        }
        x7.f18709b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x015c  */
    /* JADX WARN: Type inference failed for: r2v12, types: [e4.k, kotlin.jvm.internal.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.S.l():void");
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [e4.k, kotlin.jvm.internal.m] */
    public final void m() {
        N0.w wVarC = c(j().a, AbstractC1420H.c(0, j().a.a.length()));
        this.f2914c.invoke(wVarC);
        this.f2929r = N0.w.a(this.f2929r, null, wVarC.f6896b, 5);
        f(true);
    }

    public final void n(D.W w7) {
        C0053g0 c0053g0 = this.f2915d;
        if (c0053g0 != null) {
            if (c0053g0.a() == w7) {
                c0053g0 = null;
            }
            if (c0053g0 != null) {
                c0053g0.f1152k.setValue(w7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.S.o():void");
    }

    public final void p(boolean z7) {
        C0053g0 c0053g0 = this.f2915d;
        if (c0053g0 != null) {
            c0053g0.f1153l.setValue(Boolean.valueOf(z7));
        }
        if (z7) {
            o();
        } else {
            k();
        }
    }
}
