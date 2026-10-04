package q;

import O.C0486d;
import O.C0493g0;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import e5.AbstractC0832b;
import f1.AbstractC0870c;
import h0.AbstractC0968M;
import l4.AbstractC1420H;

/* renamed from: q.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1831m implements e0 {

    /* renamed from: k, reason: collision with root package name */
    public g0.c f14578k;

    /* renamed from: l, reason: collision with root package name */
    public final C1815C f14579l;

    /* renamed from: m, reason: collision with root package name */
    public final C0493g0 f14580m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f14581n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14582o;

    /* renamed from: p, reason: collision with root package name */
    public long f14583p;

    /* renamed from: q, reason: collision with root package name */
    public s0.q f14584q;

    /* renamed from: r, reason: collision with root package name */
    public final a0.q f14585r;

    public C1831m(Context context, c0 c0Var) {
        C1815C c1815c = new C1815C(context, AbstractC0968M.w(c0Var.a));
        this.f14579l = c1815c;
        O3.C c2 = O3.C.a;
        this.f14580m = C0486d.K(c2, O.T.f7046m);
        this.f14581n = true;
        this.f14583p = 0L;
        this.f14585r = s0.w.a(a0.n.a, c2, new C1830l(this, null)).k(Build.VERSION.SDK_INT >= 31 ? new C1814B(this, c1815c) : new C1814B(this, c1815c, c0Var));
    }

    @Override // q.e0
    public final boolean a() {
        C1815C c1815c = this.f14579l;
        EdgeEffect edgeEffect = c1815c.f14466d;
        C1832n c1832n = C1832n.a;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c1832n.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c1815c.f14467e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c1832n.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c1815c.f14468f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c1832n.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c1815c.f14469g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? c1832n.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // q.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r18, s.B0 r20, S3.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C1831m.b(long, s.B0, S3.c):java.lang.Object");
    }

    public final void c() {
        boolean zIsFinished;
        C1815C c1815c = this.f14579l;
        EdgeEffect edgeEffect = c1815c.f14466d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = c1815c.f14467e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished = edgeEffect2.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect3 = c1815c.f14468f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished = edgeEffect3.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect4 = c1815c.f14469g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished = edgeEffect4.isFinished() || zIsFinished;
        }
        if (zIsFinished) {
            g();
        }
    }

    public final long d() {
        g0.c cVar = this.f14578k;
        long jQ = cVar != null ? cVar.a : AbstractC0870c.Q(this.f14583p);
        return AbstractC0832b.e(g0.c.d(jQ) / g0.f.d(this.f14583p), g0.c.e(jQ) / g0.f.b(this.f14583p));
    }

    @Override // q.e0
    public final a0.q e() {
        return this.f14585r;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    @Override // q.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(long r18, int r20, o.C1622t r21) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C1831m.f(long, int, o.t):long");
    }

    public final void g() {
        if (this.f14581n) {
            this.f14580m.setValue(O3.C.a);
        }
    }

    public final float h(long j7) {
        float fD = g0.c.d(d());
        float fE = g0.c.e(j7) / g0.f.b(this.f14583p);
        EdgeEffect edgeEffectB = this.f14579l.b();
        float fC = -fE;
        float f5 = 1 - fD;
        int i7 = Build.VERSION.SDK_INT;
        C1832n c1832n = C1832n.a;
        if (i7 >= 31) {
            fC = c1832n.c(edgeEffectB, fC, f5);
        } else {
            edgeEffectB.onPull(fC, f5);
        }
        return (i7 >= 31 ? c1832n.b(edgeEffectB) : 0.0f) == 0.0f ? g0.f.b(this.f14583p) * (-fC) : g0.c.e(j7);
    }

    public final float i(long j7) {
        float fE = g0.c.e(d());
        float fD = g0.c.d(j7) / g0.f.d(this.f14583p);
        EdgeEffect edgeEffectC = this.f14579l.c();
        float f5 = 1 - fE;
        int i7 = Build.VERSION.SDK_INT;
        C1832n c1832n = C1832n.a;
        if (i7 >= 31) {
            fD = c1832n.c(edgeEffectC, fD, f5);
        } else {
            edgeEffectC.onPull(fD, f5);
        }
        return (i7 >= 31 ? c1832n.b(edgeEffectC) : 0.0f) == 0.0f ? g0.f.d(this.f14583p) * fD : g0.c.d(j7);
    }

    public final float j(long j7) {
        float fE = g0.c.e(d());
        float fD = g0.c.d(j7) / g0.f.d(this.f14583p);
        EdgeEffect edgeEffectD = this.f14579l.d();
        float fC = -fD;
        int i7 = Build.VERSION.SDK_INT;
        C1832n c1832n = C1832n.a;
        if (i7 >= 31) {
            fC = c1832n.c(edgeEffectD, fC, fE);
        } else {
            edgeEffectD.onPull(fC, fE);
        }
        return (i7 >= 31 ? c1832n.b(edgeEffectD) : 0.0f) == 0.0f ? g0.f.d(this.f14583p) * (-fC) : g0.c.d(j7);
    }

    public final float k(long j7) {
        float fD = g0.c.d(d());
        float fE = g0.c.e(j7) / g0.f.b(this.f14583p);
        EdgeEffect edgeEffectE = this.f14579l.e();
        int i7 = Build.VERSION.SDK_INT;
        C1832n c1832n = C1832n.a;
        if (i7 >= 31) {
            fE = c1832n.c(edgeEffectE, fE, fD);
        } else {
            edgeEffectE.onPull(fE, fD);
        }
        return (i7 >= 31 ? c1832n.b(edgeEffectE) : 0.0f) == 0.0f ? g0.f.b(this.f14583p) * fE : g0.c.e(j7);
    }

    public final void l(long j7) {
        boolean zA = g0.f.a(this.f14583p, 0L);
        boolean zA2 = g0.f.a(j7, this.f14583p);
        this.f14583p = j7;
        if (!zA2) {
            long jA = AbstractC1420H.a(P3.F.W(g0.f.d(j7)), P3.F.W(g0.f.b(j7)));
            C1815C c1815c = this.f14579l;
            c1815c.f14465c = jA;
            EdgeEffect edgeEffect = c1815c.f14466d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jA >> 32), (int) (jA & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c1815c.f14467e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jA >> 32), (int) (jA & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c1815c.f14468f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jA & 4294967295L), (int) (jA >> 32));
            }
            EdgeEffect edgeEffect4 = c1815c.f14469g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jA & 4294967295L), (int) (jA >> 32));
            }
            EdgeEffect edgeEffect5 = c1815c.f14470h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jA >> 32), (int) (jA & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c1815c.f14471i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jA >> 32), (int) (jA & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c1815c.f14472j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jA & 4294967295L), (int) (jA >> 32));
            }
            EdgeEffect edgeEffect8 = c1815c.f14473k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (jA & 4294967295L), (int) (jA >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        g();
        c();
    }
}
