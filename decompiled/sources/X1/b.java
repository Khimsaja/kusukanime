package X1;

import B1.B;
import B1.K;
import C1.i;
import H1.C0221b;
import V1.k;
import V1.n;
import V1.o;
import V1.p;
import p.I0;

/* loaded from: classes.dex */
public final class b implements n {
    public final B a;

    /* renamed from: b, reason: collision with root package name */
    public final i f9767b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9768c;

    /* renamed from: d, reason: collision with root package name */
    public final I0 f9769d;

    /* renamed from: e, reason: collision with root package name */
    public int f9770e;

    /* renamed from: f, reason: collision with root package name */
    public p f9771f;

    /* renamed from: g, reason: collision with root package name */
    public c f9772g;

    /* renamed from: h, reason: collision with root package name */
    public long f9773h;

    /* renamed from: i, reason: collision with root package name */
    public e[] f9774i;

    /* renamed from: j, reason: collision with root package name */
    public long f9775j;

    /* renamed from: k, reason: collision with root package name */
    public e f9776k;

    /* renamed from: l, reason: collision with root package name */
    public int f9777l;

    /* renamed from: m, reason: collision with root package name */
    public long f9778m;

    /* renamed from: n, reason: collision with root package name */
    public long f9779n;

    /* renamed from: o, reason: collision with root package name */
    public int f9780o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9781p;

    public b(int i7, I0 i02) {
        this.f9769d = i02;
        this.f9768c = (i7 & 1) == 0;
        this.a = new B(12);
        this.f9767b = new i();
        this.f9771f = new R1.i(4);
        this.f9774i = new e[0];
        this.f9778m = -1L;
        this.f9779n = -1L;
        this.f9777l = -1;
        this.f9773h = -9223372036854775807L;
    }

    @Override // V1.n
    public final boolean b(o oVar) {
        B b4 = this.a;
        ((k) oVar).h(b4.a, 0, 12, false);
        b4.F(0);
        if (b4.i() == 1179011410) {
            b4.G(4);
            if (b4.i() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // V1.n
    public final void d(p pVar) {
        this.f9770e = 0;
        if (this.f9768c) {
            pVar = new C0221b(pVar, this.f9769d);
        }
        this.f9771f = pVar;
        this.f9775j = -1L;
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        this.f9775j = -1L;
        this.f9776k = null;
        for (e eVar : this.f9774i) {
            if (eVar.f9798k == 0) {
                eVar.f9796i = 0;
            } else {
                eVar.f9796i = eVar.f9801n[K.d(eVar.f9800m, j7, true)];
            }
        }
        if (j7 != 0) {
            this.f9770e = 6;
        } else if (this.f9774i.length == 0) {
            this.f9770e = 0;
        } else {
            this.f9770e = 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    @Override // V1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(V1.o r25, V1.r r26) throws y1.E {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.b.i(V1.o, V1.r):int");
    }

    @Override // V1.n
    public final void a() {
    }
}
